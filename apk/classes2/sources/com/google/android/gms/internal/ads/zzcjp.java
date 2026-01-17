package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzab;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaz;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcjp implements zzab {
    private final zzcio zza;
    private zzcvh zzb;
    private zzaz zzc;

    /* synthetic */ zzcjp(zzcio zzcio, zzcjs zzcjs) {
        this.zza = zzcio;
    }

    public final /* bridge */ /* synthetic */ zzab zza(zzcvh zzcvh) {
        zzcvh zzcvh2 = zzcvh;
        this.zzb = zzcvh;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzab zzb(zzaz zzaz) {
        zzaz zzaz2 = zzaz;
        this.zzc = zzaz;
        return this;
    }

    public final zzac zzc() {
        zzhgz.zzc(this.zzb, zzcvh.class);
        zzhgz.zzc(this.zzc, zzaz.class);
        return new zzcjq(this.zza, this.zzc, new zzcsg(), new zzcuh(), new zzdsy(), this.zzb, (zzezv) null, (zzeyy) null);
    }
}
