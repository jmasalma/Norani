package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzwi implements zzwz {
    final /* synthetic */ zzwl zza;
    /* access modifiers changed from: private */
    public final int zzb;

    public zzwi(zzwl zzwl, int i) {
        Objects.requireNonNull(zzwl);
        this.zza = zzwl;
        this.zzb = i;
    }

    public final int zza(zzkv zzkv, zzhs zzhs, int i) {
        return this.zza.zzj(this.zzb, zzkv, zzhs, i);
    }

    public final int zzb(long j) {
        return this.zza.zzl(this.zzb, j);
    }

    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    public final boolean zze() {
        return this.zza.zzQ(this.zzb);
    }
}
