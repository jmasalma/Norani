package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzety implements zzeub {
    private final Bundle zza;

    public zzety(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcva zzcva = (zzcva) obj;
        if (!bundle.isEmpty()) {
            zzcva.zzb.putBundle("shared_pref", bundle);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcva zzcva = (zzcva) obj;
        if (!bundle.isEmpty()) {
            zzcva.zza.putBundle("shared_pref", bundle);
        }
    }
}
