package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeeg implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeeg(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeeg zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzeeg(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzeef zzb() {
        return new zzeef((Context) this.zza.zzb(), (zzcog) this.zzb.zzb());
    }
}
