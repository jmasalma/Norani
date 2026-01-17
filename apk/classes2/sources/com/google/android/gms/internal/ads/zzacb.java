package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzacb implements Runnable {
    public final /* synthetic */ zzaci zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzacb(zzaci zzaci, Object obj, long j) {
        this.zza = zzaci;
        this.zzb = obj;
        this.zzc = j;
    }

    public final void run() {
        zzaci.zzh(this.zza, this.zzb, this.zzc);
    }
}
