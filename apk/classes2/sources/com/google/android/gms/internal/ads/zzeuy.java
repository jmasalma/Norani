package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeuy implements zzeub {
    final String zza;
    final int zzb;

    /* synthetic */ zzeuy(String str, int i, zzeux zzeux) {
        this.zza = str;
        this.zzb = i;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcva zzcva = (zzcva) obj;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkQ)).booleanValue()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                zzcva.zza.putString("topics", str);
            }
            int i = this.zzb;
            if (i != -1) {
                zzcva.zza.putInt("atps", i);
            }
        }
    }
}
