package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcph implements zzhgr {
    private final zzhha zza;

    private zzcph(zzcoz zzcoz, zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzcph zza(zzcoz zzcoz, zzhha zzhha) {
        return new zzcph(zzcoz, zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfyv zzfyv;
        zzcqk zza2 = ((zzcql) this.zza).zzb();
        zzcqk zzcqk = zza2;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzmY)).booleanValue()) {
            zzfyv = zzfyv.zzo(new zzddv(zza2, zzcaf.zza));
        } else {
            zzfyv = zzfyv.zzn();
        }
        zzhgz.zzb(zzfyv);
        return zzfyv;
    }
}
