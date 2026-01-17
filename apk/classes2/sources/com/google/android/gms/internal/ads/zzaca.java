package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzaca implements Runnable {
    public final /* synthetic */ zzaci zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzaca(zzaci zzaci, int i, long j) {
        this.zza = zzaci;
        this.zzb = i;
        this.zzc = j;
    }

    public final void run() {
        zzaci.zzd(this.zza, this.zzb, this.zzc);
    }
}
