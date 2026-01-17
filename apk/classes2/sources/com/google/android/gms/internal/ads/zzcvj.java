package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcvj implements zzhgr {
    private final zzcvh zza;
    private final zzhha zzb;

    private zzcvj(zzcvh zzcvh, zzhha zzhha) {
        this.zza = zzcvh;
        this.zzb = zzhha;
    }

    public static zzcvj zza(zzcvh zzcvh, zzhha zzhha) {
        return new zzcvj(zzcvh, zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zzb).zza();
        Context context = zza2;
        Context zzb2 = this.zza.zzb(zza2);
        zzhgz.zzb(zzb2);
        Context context2 = zzb2;
        return zzb2;
    }
}
