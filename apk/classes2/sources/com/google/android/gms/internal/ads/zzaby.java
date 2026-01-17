package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzaby implements Runnable {
    public final /* synthetic */ zzaci zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzaby(zzaci zzaci, String str, long j, long j2) {
        this.zza = zzaci;
        this.zzb = str;
        this.zzc = j;
        this.zzd = j2;
    }

    public final void run() {
        zzaci.zzj(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
