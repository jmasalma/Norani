package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgnq {
    private static final zzgnq zza = new zzgnq();
    private final Map zzb = new HashMap();

    public static zzgnq zza() {
        return zza;
    }

    public final synchronized void zzb(zzgnp zzgnp, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        zzgnp zzgnp2 = (zzgnp) map.get(cls);
        if (zzgnp2 != null) {
            if (!zzgnp2.equals(zzgnp)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
        }
        map.put(cls, zzgnp);
    }
}
