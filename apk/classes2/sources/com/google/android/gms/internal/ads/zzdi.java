package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdi {
    private final zzdt zza;
    private final zzdt zzb;
    private Object zzc;
    private Object zzd;
    private int zze;
    private final zzjk zzf;

    public zzdi(Object obj, Looper looper, Looper looper2, zzdj zzdj, zzjk zzjk) {
        this.zza = zzdj.zzd(looper, (Handler.Callback) null);
        this.zzb = zzdj.zzd(looper2, (Handler.Callback) null);
        this.zzc = obj;
        this.zzd = obj;
        this.zzf = zzjk;
    }

    public static /* synthetic */ void zza(zzdi zzdi, Object obj) {
        if (zzdi.zze == 0) {
            zzdi.zzg(obj);
        }
    }

    public static /* synthetic */ void zzb(zzdi zzdi, Object obj) {
        int i = zzdi.zze - 1;
        zzdi.zze = i;
        if (i == 0) {
            zzdi.zzg(obj);
        }
    }

    public static /* synthetic */ void zzc(zzdi zzdi, zzfve zzfve) {
        Object apply = zzfve.apply(zzdi.zzd);
        zzdi.zzd = apply;
        zzdi.zzb.zzi(new zzdh(zzdi, apply));
    }

    private final void zzg(Object obj) {
        Object obj2 = this.zzc;
        this.zzc = obj;
        if (!obj2.equals(obj)) {
            this.zzf.zza(obj2, obj);
        }
    }

    public final void zzd(Runnable runnable) {
        this.zza.zzi(runnable);
    }

    public final void zze(Object obj) {
        this.zzd = obj;
        this.zzb.zzi(new zzdg(this, obj));
    }

    public final void zzf(zzfve zzfve, zzfve zzfve2) {
        zzdd.zzf(Looper.myLooper() == this.zzb.zza());
        this.zze++;
        this.zza.zzi(new zzdf(this, zzfve2));
        zzg(zzfve.apply(this.zzc));
    }
}
