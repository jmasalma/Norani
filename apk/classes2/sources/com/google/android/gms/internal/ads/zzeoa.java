package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeoa implements zzeuc {
    private final zzgdy zza;
    private final VersionInfoParcel zzb;

    zzeoa(VersionInfoParcel versionInfoParcel, zzgdy zzgdy) {
        this.zzb = versionInfoParcel;
        this.zza = zzgdy;
    }

    public final int zza() {
        return 54;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzenz(this));
    }
}
