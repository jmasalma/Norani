package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeyd implements Runnable {
    public final /* synthetic */ zzeyg zza;

    public /* synthetic */ zzeyd(zzeyg zzeyg) {
        this.zza = zzeyg;
    }

    public final void run() {
        this.zza.zzb.zzA().execute(new zzeyc(this.zza));
    }
}
