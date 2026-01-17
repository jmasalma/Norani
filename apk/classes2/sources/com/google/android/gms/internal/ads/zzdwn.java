package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdwn implements Runnable {
    public final /* synthetic */ zzdwo zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzdwn(zzdwo zzdwo, Context context) {
        this.zza = zzdwo;
        this.zzb = context;
    }

    public final void run() {
        zzv.zzf().zzd(this.zzb, this.zza.zzb);
    }
}
