package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhgq implements zzhha, zzhgl {
    private static final Object zza = new Object();
    private volatile zzhha zzb;
    private volatile Object zzc = zza;

    private zzhgq(zzhha zzhha) {
        this.zzb = zzhha;
    }

    public static zzhgl zza(zzhha zzhha) {
        if (zzhha instanceof zzhgl) {
            return (zzhgl) zzhha;
        }
        zzhha zzhha2 = zzhha;
        return new zzhgq(zzhha);
    }

    public static zzhha zzc(zzhha zzhha) {
        return zzhha instanceof zzhgq ? zzhha : new zzhgq(zzhha);
    }

    private final synchronized Object zzd() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        Object zzb2 = this.zzb.zzb();
        Object obj3 = this.zzc;
        if (obj3 != obj2) {
            if (obj3 != zzb2) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zzb2 + ". This is likely due to a circular dependency.");
            }
        }
        this.zzc = zzb2;
        this.zzb = null;
        return zzb2;
    }

    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
