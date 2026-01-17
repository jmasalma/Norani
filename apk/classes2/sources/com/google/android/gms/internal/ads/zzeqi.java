package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqi implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeqi(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeqi zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeqi(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfyv zzfyv;
        zzerg zza2 = ((zzeri) this.zza).zzb();
        zzerg zzerg = zza2;
        Context zza3 = ((zzchl) this.zzb).zza();
        Context context = zza3;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlO)).booleanValue()) {
            zzv.zzr();
            if (zzs.zzC(zza3)) {
                zzfyv = zzfyv.zzo(zza2);
                zzhgz.zzb(zzfyv);
                return zzfyv;
            }
        }
        zzfyv = zzfyv.zzn();
        zzhgz.zzb(zzfyv);
        return zzfyv;
    }
}
