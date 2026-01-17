package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgwz extends ThreadLocal {
    final /* synthetic */ zzgxa zza;

    zzgwz(zzgxa zzgxa) {
        Objects.requireNonNull(zzgxa);
        this.zza = zzgxa;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public final Mac initialValue() {
        try {
            zzgwm zzgwm = zzgwm.zzb;
            zzgxa zzgxa = this.zza;
            Mac mac = (Mac) zzgwm.zza(zzgxa.zzb);
            mac.init(zzgxa.zzc);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
