package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzfwk implements zzfwh {
    private static final zzfwh zza = new zzfwj();
    private final zzfwo zzb = new zzfwo();
    private volatile zzfwh zzc;
    private Object zzd;

    zzfwk(zzfwh zzfwh) {
        zzfwh zzfwh2 = zzfwh;
        this.zzc = zzfwh;
    }

    public final String toString() {
        Object obj = this.zzc;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzd) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    public final Object zza() {
        zzfwh zzfwh = this.zzc;
        zzfwh zzfwh2 = zza;
        if (zzfwh != zzfwh2) {
            synchronized (this.zzb) {
                if (this.zzc != zzfwh2) {
                    Object zza2 = this.zzc.zza();
                    this.zzd = zza2;
                    this.zzc = zzfwh2;
                    return zza2;
                }
            }
        }
        return this.zzd;
    }
}
