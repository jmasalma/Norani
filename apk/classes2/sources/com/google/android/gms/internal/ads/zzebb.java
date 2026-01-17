package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzebb implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzebb(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzebb zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzebb(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzeba zzb() {
        zzeas zza2 = ((zzeat) this.zza).zzb();
        zzeas zzeas = zza2;
        zzg zza3 = ((zzchi) this.zzb).zzb();
        zzg zzg = zza3;
        return new zzeba(zza2, zza3);
    }
}
