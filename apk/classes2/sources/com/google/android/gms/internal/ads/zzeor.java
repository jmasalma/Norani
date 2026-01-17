package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeor implements Runnable {
    public final /* synthetic */ zzeou zza;

    public /* synthetic */ zzeor(zzeou zzeou) {
        this.zza = zzeou;
    }

    public final void run() {
        this.zza.zzd.execute(new zzeos(this.zza));
    }
}
