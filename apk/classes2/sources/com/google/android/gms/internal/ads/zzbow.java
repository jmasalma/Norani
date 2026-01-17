package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbd;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbow {
    static final zzbd zza = new zzbou();
    static final zzbd zzb = new zzbov();
    private final zzboi zzc;

    public zzbow(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzfhx zzfhx) {
        this.zzc = new zzboi(context, versionInfoParcel, str, zza, zzb, zzfhx);
    }

    public final zzbom zza(String str, zzbop zzbop, zzboo zzboo) {
        return new zzbpa(this.zzc, str, zzbop, zzboo);
    }

    public final zzbpf zzb() {
        return new zzbpf(this.zzc);
    }
}
