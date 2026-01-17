package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzduf implements Runnable {
    public final /* synthetic */ zzdun zza;
    public final /* synthetic */ zzcak zzb;

    public /* synthetic */ zzduf(zzdun zzdun, zzcak zzcak) {
        this.zza = zzdun;
        this.zzb = zzcak;
    }

    public final void run() {
        this.zza.zzi.execute(new zzduh(this.zza, this.zzb));
    }
}
