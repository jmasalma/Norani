package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfjz implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzfjz(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6) {
        this.zza = zzhha;
        this.zzb = zzhha3;
        this.zzc = zzhha4;
        this.zzd = zzhha5;
        this.zze = zzhha6;
    }

    public static zzfjz zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6) {
        return new zzfjz(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        return new zzfjy(zza2, zzffu.zzc(), (zzgdz) this.zzb.zzb(), (zzu) this.zzc.zzb(), (zzfjq) this.zzd.zzb(), (zzfhx) this.zze.zzb());
    }
}
