package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzgcu;
import com.google.android.gms.internal.ads.zzgdn;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzap implements zzgcu {
    public final /* synthetic */ zzau zza;

    public /* synthetic */ zzap(zzau zzau) {
        this.zza = zzau;
    }

    public final ListenableFuture zza(Object obj) {
        return zzgdn.zzm(this.zza.zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzae(this.zza, (ArrayList) obj), this.zza.zzk);
    }
}
