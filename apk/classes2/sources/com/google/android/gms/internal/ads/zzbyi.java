package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbyi extends zzbyp {
    final zzhha zza;
    final zzhha zzb;
    final zzhha zzc;
    final zzhha zzd;
    final zzhha zze;
    final zzhha zzf;
    final zzhha zzg;
    final zzhha zzh;
    private final Clock zzj;

    zzbyi(Context context, Clock clock, zzg zzg2, zzbyo zzbyo) {
        this.zzj = clock;
        zzhgr zza2 = zzhgs.zza(context);
        this.zza = zza2;
        zzhgr zza3 = zzhgs.zza(zzg2);
        this.zzb = zza3;
        this.zzc = zzhgq.zzc(zzbyc.zza(zza2, zza3));
        zzhgr zza4 = zzhgs.zza(clock);
        this.zzd = zza4;
        zzhgr zza5 = zzhgs.zza(zzbyo);
        this.zze = zza5;
        zzhha zzc2 = zzhgq.zzc(zzbye.zza(zza4, zza3, zza5));
        this.zzf = zzc2;
        zzbyg zzc3 = zzbyg.zzc(zza4, zzc2);
        this.zzg = zzc3;
        this.zzh = zzhgq.zzc(zzbyu.zza(zza2, zzc3));
    }

    /* access modifiers changed from: package-private */
    public final zzbyf zza() {
        return new zzbyf(this.zzj, (zzbyd) this.zzf.zzb());
    }
}
