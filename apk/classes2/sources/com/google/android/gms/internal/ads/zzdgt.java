package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdgt implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzdgt(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
    }

    public static zzdgt zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzdgt(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbyk zza2 = ((zzdft) this.zza).zzb();
        zzbyk zzbyk = zza2;
        Context zza3 = ((zzchl) this.zzb).zza();
        Context context = zza3;
        View zza4 = ((zzdfk) this.zzd).zza();
        View view = zza4;
        return new zzdgs(zza2, zza3, (zzbyo) this.zzc.zzb(), zza4, (zzbcj.zza.C0000zza) this.zze.zzb());
    }
}
