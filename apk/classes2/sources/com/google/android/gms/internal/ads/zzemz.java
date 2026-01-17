package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemz implements zzeub {
    private final Bundle zza;

    zzemz(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcva zzcva = (zzcva) obj;
        if (!bundle.isEmpty()) {
            zzcva.zza.putBundle("installed_adapter_data", bundle);
        }
    }
}
