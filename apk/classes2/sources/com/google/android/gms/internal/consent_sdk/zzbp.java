package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class zzbp implements zzdo {
    private final zzdr zza;

    public zzbp(zzdr zzdr, zzdr zzdr2) {
        this.zza = zzdr;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        Executor zzb = zzav.zzb();
        Executor executor = zzb;
        return new zzbo(this.zza, zzb);
    }
}
