package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zza implements Runnable {
    public final /* synthetic */ zzb zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzau zzc;
    public final /* synthetic */ zzbze zzd;

    public /* synthetic */ zza(zzb zzb2, String str, zzau zzau, zzbze zzbze) {
        this.zza = zzb2;
        this.zzb = str;
        this.zzc = zzau;
        this.zzd = zzbze;
    }

    public final void run() {
        zzb.zzc(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
