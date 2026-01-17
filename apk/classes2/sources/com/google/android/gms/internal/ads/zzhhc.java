package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhhc {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzhhc(int i, int i2, zzhhb zzhhb) {
        this.zza = zzhgo.zzc(i);
        this.zzb = zzhgo.zzc(i2);
    }

    public final zzhhc zza(zzhha zzhha) {
        this.zzb.add(zzhha);
        return this;
    }

    public final zzhhc zzb(zzhha zzhha) {
        this.zza.add(zzhha);
        return this;
    }

    public final zzhhd zzc() {
        return new zzhhd(this.zza, this.zzb, (zzhhb) null);
    }
}
