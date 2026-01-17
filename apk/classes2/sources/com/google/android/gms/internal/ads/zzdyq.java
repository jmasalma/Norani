package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdyq implements zzcza {
    private final Context zza;
    private final zzbyo zzb;

    zzdyq(Context context, zzbyo zzbyo) {
        this.zza = context;
        this.zzb = zzbyo;
    }

    public final void zzdn(zzbvq zzbvq) {
    }

    public final void zzdo(zzfcn zzfcn) {
        String str = zzfcn.zzb.zzb.zze;
        if (!TextUtils.isEmpty(str)) {
            zzbyo zzbyo = this.zzb;
            Context context = this.zza;
            zzbyo.zzm(context, zzfcn.zza.zza.zzd);
            zzbyo.zzi(context, str);
        }
    }
}
