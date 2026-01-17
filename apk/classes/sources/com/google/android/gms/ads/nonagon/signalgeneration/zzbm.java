package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzdep;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbm implements zzdep {
    private final zzb zza;
    private final int zzb;
    private final String zzc;

    public zzbm(zzb zzb2, int i, String str) {
        this.zza = zzb2;
        this.zzb = i;
        this.zzc = str;
    }

    public final void zze(zzbk zzbk) {
        if (zzbk != null && this.zzb == 2 && !TextUtils.isEmpty(this.zzc)) {
            zzs.zzh(new zzbl(this, zzbk));
        }
    }

    public final void zzf(String str) {
    }
}
