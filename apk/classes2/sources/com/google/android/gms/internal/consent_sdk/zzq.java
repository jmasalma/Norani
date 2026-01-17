package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class zzq implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;

    public zzq(zzdr zzdr, zzdr zzdr2) {
        this.zza = zzdr;
        this.zzb = zzdr2;
    }

    /* renamed from: zzb */
    public final zzn zza() {
        return new zzn((Application) this.zza.zza(), (zzaq) this.zzb.zza());
    }
}
