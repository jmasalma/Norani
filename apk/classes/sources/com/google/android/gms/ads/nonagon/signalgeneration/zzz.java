package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdso;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzz implements Runnable {
    public final /* synthetic */ zzdso zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Pair[] zzc;

    public /* synthetic */ zzz(zzdso zzdso, zzdsd zzdsd, String str, Pair[] pairArr) {
        this.zza = zzdso;
        this.zzb = str;
        this.zzc = pairArr;
    }

    public final void run() {
        zzaa.zze(this.zza, (zzdsd) null, this.zzb, this.zzc);
    }
}
