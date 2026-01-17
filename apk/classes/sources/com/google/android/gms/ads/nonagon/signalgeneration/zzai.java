package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgcu;
import com.google.android.gms.internal.ads.zzgdn;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzai implements zzgcu {
    public final /* synthetic */ zzau zza;

    public /* synthetic */ zzai(zzau zzau) {
        this.zza = zzau;
    }

    public final ListenableFuture zza(Object obj) {
        return zzgdn.zzm(this.zza.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzaj(this.zza, (Uri) obj), this.zza.zzk);
    }
}
