package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcje implements zzdtu {
    final zzhha zza;
    final zzhha zzb;
    final zzhha zzc;
    final zzhha zzd;
    /* access modifiers changed from: private */
    public final Context zze;
    private final zzble zzf;
    private final zzcio zzg;
    private final zzcje zzh = this;

    zzcje(zzcio zzcio, Context context, zzble zzble) {
        this.zzg = zzcio;
        this.zze = context;
        this.zzf = zzble;
        zzhgr zza2 = zzhgs.zza(this);
        this.zza = zza2;
        zzhgr zza3 = zzhgs.zza(zzble);
        this.zzb = zza3;
        zzdtq zzd2 = zzdtq.zzd(zza3);
        this.zzc = zzd2;
        this.zzd = zzhgq.zzc(zzdts.zza(zza2, zzd2));
    }

    public final zzdtl zzb() {
        return new zzcjb(this.zzg, this.zzh, (zzcjs) null);
    }

    /* access modifiers changed from: package-private */
    public final zzdtp zzc() {
        return zzdtq.zzc(this.zzf);
    }

    public final zzdtr zzd() {
        return (zzdtr) this.zzd.zzb();
    }
}
