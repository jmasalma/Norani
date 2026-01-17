package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzmj {
    private final zziw zza;

    @Deprecated
    public zzmj(Context context, zzcem zzcem) {
        this.zza = new zziw(context, zzcem);
    }

    @Deprecated
    public final zzmj zza(zzkx zzkx) {
        zziw zziw = this.zza;
        zzdd.zzf(!zziw.zzs);
        zzkx.getClass();
        zziw.zzf = new zzio(zzkx);
        return this;
    }

    @Deprecated
    public final zzmj zzb(zzzd zzzd) {
        zziw zziw = this.zza;
        zzdd.zzf(!zziw.zzs);
        zzzd.getClass();
        zziw.zze = new zziv(zzzd);
        return this;
    }

    @Deprecated
    public final zzmk zzc() {
        zziw zziw = this.zza;
        zzdd.zzf(!zziw.zzs);
        zziw.zzs = true;
        return new zzmk(zziw);
    }
}
