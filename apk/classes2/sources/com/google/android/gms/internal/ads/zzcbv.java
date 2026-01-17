package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcbv {
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) zzbd.zzc().zzb(zzbde.zzV)).longValue());
    private long zzb;
    private boolean zzc = true;

    zzcbv() {
    }

    public final void zza(SurfaceTexture surfaceTexture, zzcbg zzcbg) {
        if (zzcbg != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (!this.zzc) {
                if (Math.abs(timestamp - this.zzb) < this.zza) {
                    return;
                }
            }
            this.zzc = false;
            this.zzb = timestamp;
            zzfrw zzfrw = zzs.zza;
            Objects.requireNonNull(zzcbg);
            zzfrw.post(new zzcbu(zzcbg));
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
