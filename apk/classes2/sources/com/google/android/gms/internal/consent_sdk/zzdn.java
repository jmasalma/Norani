package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class zzdn implements zzdr {
    private static final Object zza = new Object();
    private volatile zzdr zzb;
    private volatile Object zzc = zza;

    private zzdn(zzdr zzdr) {
        this.zzb = zzdr;
    }

    public static zzdr zzb(zzdr zzdr) {
        return zzdr instanceof zzdn ? zzdr : new zzdn(zzdr);
    }

    private final synchronized Object zzc() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        Object zza2 = this.zzb.zza();
        Object obj3 = this.zzc;
        if (obj3 != obj2) {
            if (obj3 != zza2) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zza2 + ". This is likely due to a circular dependency.");
            }
        }
        this.zzc = zza2;
        this.zzb = null;
        return zza2;
    }

    public final Object zza() {
        Object obj = this.zzc;
        return obj == zza ? zzc() : obj;
    }
}
