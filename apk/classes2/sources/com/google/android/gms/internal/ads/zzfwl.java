package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzfwl {
    public static zzfwh zza(zzfwh zzfwh) {
        if ((zzfwh instanceof zzfwk) || (zzfwh instanceof zzfwi)) {
            return zzfwh;
        }
        if (zzfwh instanceof Serializable) {
            return new zzfwi(zzfwh);
        }
        return new zzfwk(zzfwh);
    }
}
