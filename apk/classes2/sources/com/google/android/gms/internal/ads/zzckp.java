package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzckp implements zzhgr {
    private final zzhha zza;

    private zzckp(zzckg zzckg, zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzckp zza(zzckg zzckg, zzhha zzhha) {
        return new zzckp(zzckg, zzhha);
    }

    /* renamed from: zzc */
    public final zzfds zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzfds zzd = zzfds.zzd(zza2);
        zzhgz.zzb(zzd);
        zzfds zzfds = zzd;
        return zzd;
    }
}
