package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeht implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeht(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeht zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzeht(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzehs zzb() {
        return new zzehs((Context) this.zza.zzb(), (zzdos) this.zzb.zzb());
    }
}
