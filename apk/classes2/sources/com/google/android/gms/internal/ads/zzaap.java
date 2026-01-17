package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaap {
    final /* synthetic */ zzaar zza;
    private zzz zzb;

    /* synthetic */ zzaap(zzaar zzaar, zzaaq zzaaq) {
        Objects.requireNonNull(zzaar);
        this.zza = zzaar;
    }

    public final void zza(zzcd zzcd) {
        zzx zzx = new zzx();
        zzx.zzam(zzcd.zzb);
        zzx.zzQ(zzcd.zzc);
        zzx.zzah("video/raw");
        this.zzb = zzx.zzan();
        this.zza.zzh.execute(new zzaao(this, zzcd));
    }

    public final void zzb(long j, long j2, boolean z) {
        if (z) {
            zzaar zzaar = this.zza;
            if (zzaar.zzd != null) {
                zzaar.zzh.execute(new zzaam(this));
            }
        }
        zzz zzz = this.zzb;
        if (zzz == null) {
            zzz = new zzx().zzan();
        }
        zzz zzz2 = zzz;
        zzaar zzaar2 = this.zza;
        zzaar2.zzi.zzcT(j2, j, zzz2, (MediaFormat) null);
        ((zzacm) zzaar2.zzc.remove()).zza(j);
    }
}
