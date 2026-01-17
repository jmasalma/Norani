package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzn implements Callable {
    public final /* synthetic */ zzo zza;
    public final /* synthetic */ AdRequest zzb;
    public final /* synthetic */ zzp zzc;

    public /* synthetic */ zzn(zzo zzo, AdRequest adRequest, zzp zzp) {
        this.zza = zzo;
        this.zzb = adRequest;
        this.zzc = zzp;
    }

    public final Object call() {
        return QueryInfo.generate(this.zza.zzc, AdFormat.BANNER, this.zzb, this.zzc);
    }
}
