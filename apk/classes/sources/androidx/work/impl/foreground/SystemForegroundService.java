package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.foreground.SystemForegroundDispatcher;

public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.Callback {
    /* access modifiers changed from: private */
    public static final String TAG = Logger.tagWithPrefix("SystemFgService");
    private static SystemForegroundService sForegroundService = null;
    SystemForegroundDispatcher mDispatcher;
    private boolean mIsShutdown;
    NotificationManager mNotificationManager;

    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.mIsShutdown) {
            Logger.get().info(TAG, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.onStartCommand(intent);
        return 3;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.onDestroy();
    }

    private void initializeDispatcher() {
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.mDispatcher = systemForegroundDispatcher;
        systemForegroundDispatcher.setCallback(this);
    }

    public void stop() {
        this.mIsShutdown = true;
        Logger.get().debug(TAG, "Shutting down.");
        stopForeground(true);
        sForegroundService = null;
        stopSelf();
    }

    public void onTimeout(int i) {
        if (Build.VERSION.SDK_INT < 35) {
            this.mDispatcher.onTimeout(i, 2048);
        }
    }

    public void onTimeout(int i, int i2) {
        this.mDispatcher.onTimeout(i, i2);
    }

    public void startForeground(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.startForeground(this, i, notification, i2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.startForeground(this, i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    public void notify(int i, Notification notification) {
        this.mNotificationManager.notify(i, notification);
    }

    public void cancelNotification(int i) {
        this.mNotificationManager.cancel(i);
    }

    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void startForeground(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static void startForeground(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                Logger.get().warning(SystemForegroundService.TAG, "Unable to start foreground service", e);
            } catch (SecurityException e2) {
                Logger.get().warning(SystemForegroundService.TAG, "Unable to start foreground service", e2);
            }
        }
    }
}
