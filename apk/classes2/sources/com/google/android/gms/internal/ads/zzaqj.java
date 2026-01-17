package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaqj {
    public final Object zza;
    public final zzapm zzb;
    public final zzaqm zzc;
    public boolean zzd;

    private zzaqj(zzaqm zzaqm) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzaqm;
    }

    private zzaqj(Object obj, zzapm zzapm) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzapm;
        this.zzc = null;
    }

    public static zzaqj zza(zzaqm zzaqm) {
        return new zzaqj(zzaqm);
    }

    public static zzaqj zzb(Object obj, zzapm zzapm) {
        return new zzaqj(obj, zzapm);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
