package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfku {
    private final Object zza;
    private final long zzb;
    private final Clock zzc;
    private final long zzd = (((Long) zzbd.zzc().zzb(zzbde.zzF)).longValue() * 1000);

    public zzfku(Object obj, Clock clock) {
        this.zza = obj;
        this.zzc = clock;
        this.zzb = clock.currentTimeMillis();
    }

    public final long zza() {
        return (this.zzd + Math.min(Math.max(((Long) zzbd.zzc().zzb(zzbde.zzA)).longValue(), -900000), 10000)) - (this.zzc.currentTimeMillis() - this.zzb);
    }

    public final long zzb() {
        return this.zzb;
    }

    public final Object zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc.currentTimeMillis() >= this.zzb + this.zzd;
    }
}
