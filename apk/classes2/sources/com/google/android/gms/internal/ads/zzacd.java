package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzacd implements Runnable {
    public final /* synthetic */ zzaci zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzacd(zzaci zzaci, Exception exc) {
        this.zza = zzaci;
        this.zzb = exc;
    }

    public final void run() {
        zzaci.zza(this.zza, this.zzb);
    }
}
