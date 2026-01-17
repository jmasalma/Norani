package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzchq implements zzhgr {
    private final zzhha zza;

    private zzchq(zzchh zzchh, zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzchq zza(zzchh zzchh, zzhha zzhha) {
        return new zzchq(zzchh, zzhha);
    }

    /* renamed from: zzc */
    public final String zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return zzfds.zzd(zza2).zze();
    }
}
