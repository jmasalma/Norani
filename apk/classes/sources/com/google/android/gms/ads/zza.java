package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzek;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final /* synthetic */ class zza implements Runnable {
    public final /* synthetic */ AdLoader zza;
    public final /* synthetic */ zzek zzb;

    public /* synthetic */ zza(AdLoader adLoader, zzek zzek) {
        this.zza = adLoader;
        this.zzb = zzek;
    }

    public final void run() {
        AdLoader.zza(this.zza, this.zzb);
    }
}
