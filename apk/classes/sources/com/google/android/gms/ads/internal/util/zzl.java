package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zze;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzfrw;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzl implements zze {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzl(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    public final zzt zza(String str) {
        zzfrw zzfrw = zzs.zza;
        zzv.zzr();
        zzs.zzM(this.zza, this.zzb, str);
        return zzt.SUCCESS;
    }
}
