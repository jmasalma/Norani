package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfun {
    private final zzfwh zza;
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zzfuo zzc;
    private final String zzd;
    /* access modifiers changed from: private */
    public final List zze = new ArrayList();
    /* access modifiers changed from: private */
    public boolean zzf;
    private final Intent zzg;
    /* access modifiers changed from: private */
    public final IBinder.DeathRecipient zzh;
    private ServiceConnection zzi;
    /* access modifiers changed from: private */
    public IInterface zzj;

    zzfun(Context context, zzfuo zzfuo, String str, Intent intent, zzfts zzfts) {
        this.zzb = context;
        this.zzc = zzfuo;
        this.zzd = "OverlayDisplayService";
        this.zzg = intent;
        this.zza = zzfwl.zza(new zzfue("OverlayDisplayService"));
        this.zzh = new zzfuf(this);
    }

    public static /* synthetic */ void zzf(zzfun zzfun, Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            zzfun.zzc.zza("error caused by ", e);
        }
    }

    public static /* synthetic */ void zzh(zzfun zzfun) {
        zzfun.zzc.zzc("%s : Binder has died.", zzfun.zzd);
        List list = zzfun.zze;
        synchronized (list) {
            list.clear();
        }
    }

    public static /* synthetic */ void zzi(zzfun zzfun) {
        if (zzfun.zzj != null) {
            zzfun.zzc.zzc("Unbind from service.", new Object[0]);
            Context context = zzfun.zzb;
            ServiceConnection serviceConnection = zzfun.zzi;
            serviceConnection.getClass();
            ServiceConnection serviceConnection2 = serviceConnection;
            context.unbindService(serviceConnection);
            zzfun.zzf = false;
            zzfun.zzj = null;
            zzfun.zzi = null;
            List list = zzfun.zze;
            synchronized (list) {
                list.clear();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzo(Runnable runnable) {
        ((Handler) this.zza.zza()).post(new zzfug(this, runnable));
    }

    public final IInterface zzc() {
        return this.zzj;
    }

    public final void zzm(Runnable runnable) {
        zzo(new zzfuh(this, runnable));
    }

    public final void zzn() {
        zzo(new zzfui(this));
    }

    public static /* synthetic */ void zzg(zzfun zzfun, Runnable runnable) {
        if (zzfun.zzj == null && !zzfun.zzf) {
            zzfun.zzc.zzc("Initiate binding to the service.", new Object[0]);
            List list = zzfun.zze;
            synchronized (list) {
                list.add(runnable);
            }
            zzful zzful = new zzful(zzfun, (zzfum) null);
            zzfun.zzi = zzful;
            zzfun.zzf = true;
            if (!zzfun.zzb.bindService(zzfun.zzg, zzful, 1)) {
                zzfun.zzc.zzc("Failed to bind to the service.", new Object[0]);
                zzfun.zzf = false;
                List list2 = zzfun.zze;
                synchronized (list2) {
                    list2.clear();
                }
            }
        } else if (zzfun.zzf) {
            zzfun.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            List list3 = zzfun.zze;
            synchronized (list3) {
                list3.add(runnable);
            }
        } else {
            runnable.run();
        }
    }
}
