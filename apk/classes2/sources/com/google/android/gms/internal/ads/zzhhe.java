package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhhe implements zzhha {
    private static final Object zza = new Object();
    private volatile zzhha zzb;
    private volatile Object zzc = zza;

    private zzhhe(zzhha zzhha) {
        this.zzb = zzhha;
    }

    public static zzhha zza(zzhha zzhha) {
        if ((zzhha instanceof zzhhe) || (zzhha instanceof zzhgq)) {
            return zzhha;
        }
        zzhha zzhha2 = zzhha;
        return new zzhhe(zzhha);
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhha zzhha = this.zzb;
        if (zzhha == null) {
            return this.zzc;
        }
        Object zzb2 = zzhha.zzb();
        this.zzc = zzb2;
        this.zzb = null;
        return zzb2;
    }
}
