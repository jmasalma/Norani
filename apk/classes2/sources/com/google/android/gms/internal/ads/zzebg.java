package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzebg implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzebg(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
    }

    public static zzebg zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzebg(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    /* renamed from: zza */
    public final zzebe zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzcvb zza3 = ((zzcvc) this.zzb).zzb();
        zzcvb zzcvb = zza3;
        zzeas zza4 = ((zzeat) this.zzd).zzb();
        zzeas zzeas = zza4;
        zzg zza5 = ((zzchi) this.zze).zzb();
        zzg zzg = zza5;
        return new zzebe(zza2, zza3, (zzeaw) this.zzc.zzb(), zza4, zza5);
    }
}
