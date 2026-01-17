package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdks implements Runnable {
    public final /* synthetic */ zzcfg zza;

    public /* synthetic */ zzdks(zzcfg zzcfg) {
        this.zza = zzcfg;
    }

    public final void run() {
        this.zza.zzd("onSdkImpression", new ArrayMap());
    }
}
