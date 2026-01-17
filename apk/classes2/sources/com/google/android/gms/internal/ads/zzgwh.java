package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgwh implements zzgwk {
    private final zzgwu zza;

    /* synthetic */ zzgwh(zzgwu zzgwu, zzgwl zzgwl) {
        this.zza = zzgwu;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        for (Provider zza2 : zzgwm.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, zza2);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, (Provider) null);
    }
}
