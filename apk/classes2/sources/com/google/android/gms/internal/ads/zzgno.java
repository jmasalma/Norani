package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgno {
    public static final /* synthetic */ int zza = 0;
    private static final zzgnn zzb = new zzgnm();
    private static final zzgno zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgno zzb() {
        return zzc;
    }

    private final synchronized zzgez zzd(zzgfm zzgfm, @Nullable Integer num) throws GeneralSecurityException {
        zzgnn zzgnn;
        zzgnn = (zzgnn) this.zzd.get(zzgfm.getClass());
        if (zzgnn != null) {
        } else {
            String obj = zzgfm.toString();
            throw new GeneralSecurityException("Cannot create a new key for parameters " + obj + ": no key creator for this class was registered.");
        }
        return zzgnn.zza(zzgfm, num);
    }

    private static zzgno zze() {
        zzgno zzgno = new zzgno();
        try {
            zzgno.zzc(zzb, zzgne.class);
            return zzgno;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final zzgez zza(zzgfm zzgfm, @Nullable Integer num) throws GeneralSecurityException {
        return zzd(zzgfm, num);
    }

    public final synchronized void zzc(zzgnn zzgnn, Class cls) throws GeneralSecurityException {
        Map map = this.zzd;
        zzgnn zzgnn2 = (zzgnn) map.get(cls);
        if (zzgnn2 != null) {
            if (!zzgnn2.equals(zzgnn)) {
                String obj = cls.toString();
                throw new GeneralSecurityException("Different key creator for parameters class " + obj + " already inserted");
            }
        }
        map.put(cls, zzgnn);
    }
}
