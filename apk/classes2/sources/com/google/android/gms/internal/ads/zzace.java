package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzace implements Runnable {
    public final /* synthetic */ zzaci zza;
    public final /* synthetic */ zzid zzb;

    public /* synthetic */ zzace(zzaci zzaci, zzid zzid) {
        this.zza = zzaci;
        this.zzb = zzid;
    }

    public final void run() {
        zzaci.zzi(this.zza, this.zzb);
    }
}
