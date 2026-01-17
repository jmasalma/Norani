package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzesd implements zzeub {
    public final zzfbz zza;

    public zzesd(zzfbz zzfbz) {
        this.zza = zzfbz;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcva zzcva = (zzcva) obj;
        zzfbz zzfbz = this.zza;
        if (zzfbz != null) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzmr)).booleanValue()) {
                Bundle bundle = zzcva.zza;
                bundle.putBoolean("render_in_browser", zzfbz.zzd());
                bundle.putBoolean("disable_ml", zzfbz.zzc());
            }
        }
    }
}
