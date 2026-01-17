package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdud implements Runnable {
    public final /* synthetic */ zzdun zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ zzcak zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ zzfhj zzf;

    public /* synthetic */ zzdud(zzdun zzdun, Object obj, zzcak zzcak, String str, long j, zzfhj zzfhj) {
        this.zza = zzdun;
        this.zzb = obj;
        this.zzc = zzcak;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzfhj;
    }

    public final void run() {
        zzdun.zzi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
