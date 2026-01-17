package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzach implements Runnable {
    public final /* synthetic */ zzaci zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzach(zzaci zzaci, String str) {
        this.zza = zzaci;
        this.zzb = str;
    }

    public final void run() {
        zzaci.zzb(this.zza, this.zzb);
    }
}
