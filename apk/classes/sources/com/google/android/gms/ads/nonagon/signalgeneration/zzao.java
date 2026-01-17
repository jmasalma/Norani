package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzao implements Callable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ List zzb;
    public final /* synthetic */ IObjectWrapper zzc;

    public /* synthetic */ zzao(zzau zzau, List list, IObjectWrapper iObjectWrapper) {
        this.zza = zzau;
        this.zzb = list;
        this.zzc = iObjectWrapper;
    }

    public final Object call() {
        return zzau.zzD(this.zza, this.zzb, this.zzc);
    }
}
