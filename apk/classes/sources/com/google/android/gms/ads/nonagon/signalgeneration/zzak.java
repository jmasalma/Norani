package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbze;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzak implements Callable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ zzbze zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ Bundle zzd;

    public /* synthetic */ zzak(zzau zzau, zzbze zzbze, int i, Bundle bundle) {
        this.zza = zzau;
        this.zzb = zzbze;
        this.zzc = i;
        this.zzd = bundle;
    }

    public final Object call() {
        return this.zza.zzR(this.zza.zzg, this.zzb.zza, this.zzb.zzb, this.zzb.zzc, this.zzb.zzd, this.zzc, this.zzb.zzf, this.zzd, this.zzb);
    }
}
