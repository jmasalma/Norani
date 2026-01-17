package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdny;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzag implements Runnable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ zzdny[] zzb;

    public /* synthetic */ zzag(zzau zzau, zzdny[] zzdnyArr) {
        this.zza = zzau;
        this.zzb = zzdnyArr;
    }

    public final void run() {
        zzau.zzH(this.zza, this.zzb);
    }
}
