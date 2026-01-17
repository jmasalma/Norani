package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzqv implements Runnable {
    public final /* synthetic */ AudioTrack zza;
    public final /* synthetic */ zzql zzb;
    public final /* synthetic */ Handler zzc;
    public final /* synthetic */ zzqi zzd;

    public /* synthetic */ zzqv(AudioTrack audioTrack, zzql zzql, Handler handler, zzqi zzqi) {
        this.zza = audioTrack;
        this.zzb = zzql;
        this.zzc = handler;
        this.zzd = zzqi;
    }

    public final void run() {
        zzro.zzJ(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
