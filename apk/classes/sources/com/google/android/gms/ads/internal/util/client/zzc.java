package com.google.android.gms.ads.internal.util.client;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final /* synthetic */ class zzc implements zze {
    public final /* synthetic */ zzf zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzc(zzf zzf, Context context) {
        this.zza = zzf;
        this.zzb = context;
    }

    public final zzt zza(String str) {
        new zzd(this.zza, this.zzb, str).start();
        return zzt.SUCCESS;
    }
}
