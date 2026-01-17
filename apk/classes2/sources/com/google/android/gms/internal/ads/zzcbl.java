package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcbl implements Runnable {
    public final /* synthetic */ zzcbp zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzcbl(zzcbp zzcbp, boolean z) {
        this.zza = zzcbp;
        this.zzb = z;
    }

    public final void run() {
        this.zza.zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(this.zzb));
    }
}
