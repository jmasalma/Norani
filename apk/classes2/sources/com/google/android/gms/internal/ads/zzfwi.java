package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzfwi implements Serializable, zzfwh {
    final zzfwh zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzfwo zzd = new zzfwo();

    zzfwi(zzfwh zzfwh) {
        zzfwh zzfwh2 = zzfwh;
        this.zza = zzfwh;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        } else {
            obj = this.zza;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                if (!this.zzb) {
                    Object zza2 = this.zza.zza();
                    this.zzc = zza2;
                    this.zzb = true;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
