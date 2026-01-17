package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzabb extends HandlerThread implements Handler.Callback {
    private zzdp zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzabd zze;

    public zzabb() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                zzdp zzdp = this.zza;
                if (zzdp != null) {
                    zzdp.zzb(i2);
                    this.zze = new zzabd(this, this.zza.zza(), i2 != 0, (zzabc) null);
                    synchronized (this) {
                        notify();
                    }
                } else {
                    throw null;
                }
            } catch (RuntimeException e) {
                zzea.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.zzd = e;
                synchronized (this) {
                    notify();
                }
            } catch (zzdq e2) {
                zzea.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.zzd = new IllegalStateException(e2);
                synchronized (this) {
                    notify();
                }
            } catch (Error e3) {
                try {
                    zzea.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzc = e3;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
        } else if (i == 2) {
            try {
                zzdp zzdp2 = this.zza;
                if (zzdp2 != null) {
                    zzdp2.zzc();
                    quit();
                    return true;
                }
                throw null;
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
        }
        return true;
    }

    public final zzabd zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdp(this.zzb, (zzdo) null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzabd zzabd = this.zze;
                zzabd.getClass();
                zzabd zzabd2 = zzabd;
                return zzabd;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
