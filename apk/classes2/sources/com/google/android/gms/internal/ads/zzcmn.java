package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcmn implements Runnable {
    public final /* synthetic */ zzcmp zza;
    public final /* synthetic */ Throwable zzb;
    public final /* synthetic */ zzfjy zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzv zze;

    public /* synthetic */ zzcmn(zzcmp zzcmp, Throwable th, zzfjy zzfjy, String str, zzv zzv) {
        this.zza = zzcmp;
        this.zzb = th;
        this.zzc = zzfjy;
        this.zzd = str;
        this.zze = zzv;
    }

    public final void run() {
        boolean booleanValue = ((Boolean) zzbd.zzc().zzb(zzbde.zzkL)).booleanValue();
        zzcmp zzcmp = this.zza;
        Throwable th = this.zzb;
        if (booleanValue) {
            zzcmq zzcmq = zzcmp.zzd;
            zzcmq.zzb = zzbun.zzc(zzcmq.zzc);
            zzcmq.zzb.zzh(th, "AttributionReporting.registerSourceAndPingClickUrl");
        } else {
            zzcmq zzcmq2 = zzcmp.zzd;
            zzcmq2.zza = zzbun.zza(zzcmq2.zzc);
            zzcmq2.zza.zzh(th, "AttributionReportingSampled.registerSourceAndPingClickUrl");
        }
        zzv zzv = this.zze;
        this.zzc.zzd(this.zzd, zzv, (zzfhu) null, (zzcyi) null);
    }
}
