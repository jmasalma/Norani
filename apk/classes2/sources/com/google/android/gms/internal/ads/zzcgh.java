package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcgh implements Runnable {
    public final /* synthetic */ zzcgi zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;

    public /* synthetic */ zzcgh(zzcgi zzcgi, int i, int i2, boolean z, boolean z2) {
        this.zza = zzcgi;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = z2;
    }

    public final void run() {
        zzcgi.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
