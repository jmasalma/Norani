package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgwm {
    public static final zzgwm zza = new zzgwm(new zzgwn());
    public static final zzgwm zzb = new zzgwm(new zzgwr());
    private final zzgwk zzc;

    static {
        new zzgwm(new zzgwt());
        new zzgwm(new zzgws());
        new zzgwm(new zzgwo());
        new zzgwm(new zzgwq());
        new zzgwm(new zzgwp());
    }

    public zzgwm(zzgwu zzgwu) {
        this.zzc = !zzgmh.zzb() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzgwh(zzgwu, (zzgwl) null) : new zzgwi(zzgwu, (zzgwl) null) : new zzgwj(zzgwu, (zzgwl) null);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String provider : strArr) {
            Provider provider2 = Security.getProvider(provider);
            if (provider2 != null) {
                arrayList.add(provider2);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzc.zza(str);
    }
}
