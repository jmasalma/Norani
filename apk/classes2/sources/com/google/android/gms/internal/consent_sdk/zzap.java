package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class zzap implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzap(zzdr zzdr, zzdr zzdr2, zzdr zzdr3, zzdr zzdr4) {
        this.zza = zzdr;
        this.zzb = zzdr2;
        this.zzc = zzdr3;
    }

    /* renamed from: zzb */
    public final zzao zza() {
        Executor zzb2 = zzav.zzb();
        Executor executor = zzb2;
        return new zzao((Application) this.zza.zza(), (zzaq) this.zzb.zza(), (zzl) this.zzc.zza(), zzb2);
    }
}
