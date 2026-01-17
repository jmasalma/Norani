package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzib {
    private final zzfwh zza;
    private final Handler zzb;
    private zzia zzc;
    private zze zzd;
    private int zze;
    private int zzf;
    private float zzg = 1.0f;
    private zzch zzh;

    public zzib(Context context, Looper looper, zzia zzia) {
        this.zza = zzfwl.zza(new zzhz(context));
        this.zzc = zzia;
        this.zzb = new Handler(looper);
        this.zze = 0;
    }

    private final void zzf() {
        int i = this.zze;
        if (i != 1 && i != 0 && this.zzh != null) {
            zzcj.zza((AudioManager) this.zza.zza(), this.zzh);
        }
    }

    private final void zzg(int i) {
        zzia zzia = this.zzc;
        if (zzia != null) {
            zzia.zza(i);
        }
    }

    private final void zzh(int i) {
        if (this.zze != i) {
            this.zze = i;
            float f = i == 4 ? 0.2f : 1.0f;
            if (this.zzg != f) {
                this.zzg = f;
                zzia zzia = this.zzc;
                if (zzia != null) {
                    zzia.zzb(f);
                }
            }
        }
    }

    public final float zza() {
        return this.zzg;
    }

    public final void zzd() {
        this.zzc = null;
        zzf();
        zzh(0);
    }

    public final void zze(zze zze2) {
        if (!Objects.equals(this.zzd, zze2)) {
            this.zzd = zze2;
            this.zzf = zze2 == null ? 0 : 1;
        }
    }

    public static /* synthetic */ void zzc(zzib zzib, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzib.zzh(4);
                return;
            }
            zzib.zzg(0);
            zzib.zzh(3);
        } else if (i == -1) {
            zzib.zzg(-1);
            zzib.zzf();
            zzib.zzh(1);
        } else if (i != 1) {
            zzea.zzf("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            zzib.zzh(2);
            zzib.zzg(1);
        }
    }

    public final int zzb(boolean z, int i) {
        if (i == 1 || this.zzf != 1) {
            zzf();
            zzh(0);
            return 1;
        } else if (!z) {
            int i2 = this.zze;
            if (i2 != 1) {
                return i2 != 3 ? 1 : 0;
            }
            return -1;
        } else if (this.zze == 2) {
            return 1;
        } else {
            if (this.zzh == null) {
                zzce zzce = new zzce(1);
                zze zze2 = this.zzd;
                zze2.getClass();
                zze zze3 = zze2;
                zzce.zza(zze2);
                zzce.zzb(new zzhy(this), this.zzb);
                this.zzh = zzce.zzc();
            }
            if (zzcj.zzb((AudioManager) this.zza.zza(), this.zzh) == 1) {
                zzh(2);
                return 1;
            }
            zzh(1);
            return -1;
        }
    }
}
