package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzemt implements zzeub {
    private final ArrayList zza;

    /* synthetic */ zzemt(ArrayList arrayList, zzemu zzemu) {
        this.zza = arrayList;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcva) obj).zzb.putStringArrayList("ad_types", this.zza);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcva) obj).zza.putStringArrayList("ad_types", this.zza);
    }
}
