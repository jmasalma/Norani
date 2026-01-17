package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdri implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzdri(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha4;
    }

    public static zzdri zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4) {
        return new zzdri(zzhha, zzhha2, zzhha3, zzhha4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        String zzc2 = ((zzewn) this.zza).zzc();
        String str = zzc2;
        Context zza2 = ((zzchl) this.zzb).zza();
        Context context = zza2;
        Executor zzc3 = zzffu.zzc();
        Map zzd = ((zzhgv) this.zzc).zzb();
        Map map = zzd;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzft)).booleanValue()) {
            zzbcc zzbcc = new zzbcc(new zzbci(zza2));
            zzbcc.zzb(new zzdrj(zzc2));
            set = Collections.singleton(new zzddv(new zzdrl(zzbcc, zzd), zzc3));
        } else {
            set = Collections.emptySet();
        }
        zzhgz.zzb(set);
        Set set2 = set;
        return set;
    }
}
