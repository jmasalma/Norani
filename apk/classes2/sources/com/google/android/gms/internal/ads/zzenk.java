package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzx;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzenk implements zzeub {
    private final zzx zza;
    private final boolean zzb;

    public zzenk(zzx zzx, boolean z) {
        this.zza = zzx;
        this.zzb = z;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcva) obj).zza;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfJ)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        zzx zzx = this.zza;
        if (zzx != null) {
            int i = zzx.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
