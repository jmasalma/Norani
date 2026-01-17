package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzacc implements Runnable {
    public final /* synthetic */ zzaci zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzacc(zzaci zzaci, long j, int i) {
        this.zza = zzaci;
        this.zzb = j;
        this.zzc = i;
    }

    public final void run() {
        zzaci.zzc(this.zza, this.zzb, this.zzc);
    }
}
