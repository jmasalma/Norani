package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeac implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzeac(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8) {
        this.zza = zzhha;
        this.zzb = zzhha4;
        this.zzc = zzhha5;
        this.zzd = zzhha6;
        this.zze = zzhha8;
    }

    public static zzeac zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5, zzhha zzhha6, zzhha zzhha7, zzhha zzhha8) {
        return new zzeac(zzhha, zzhha2, zzhha3, zzhha4, zzhha5, zzhha6, zzhha7, zzhha8);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzgdy zzc2 = zzffu.zzc();
        zzgdy zzgdy = zzc2;
        zzbvy zza3 = zzcij.zza();
        zzbvy zzbvy = zza3;
        zzcld zzc3 = ((zzchw) this.zzb).zzb();
        zzcld zzcld = zzc3;
        zzeaj zza4 = ((zzeak) this.zzc).zzb();
        zzeaj zzeaj = zza4;
        zzeag zza5 = zzcig.zza();
        zzeag zzeag = zza5;
        return new zzeab(zza2, zzc2, zza3, zzc3, zza4, (ArrayDeque) this.zzd.zzb(), zza5, (zzfhx) this.zze.zzb());
    }
}
