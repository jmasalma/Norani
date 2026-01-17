package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcf implements Runnable {
    public final /* synthetic */ zzcg zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzcf(zzcg zzcg, int i) {
        this.zza = zzcg;
        this.zzb = i;
    }

    public final void run() {
        this.zza.zzb.onAudioFocusChange(this.zzb);
    }
}
