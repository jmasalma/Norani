package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzadr implements zzafb {
    private final byte[] zza = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];

    public final /* synthetic */ int zzf(zzl zzl, int i, boolean z) {
        return zzaez.zza(this, zzl, i, z);
    }

    public final int zzg(zzl zzl, int i, boolean z, int i2) throws IOException {
        int zza2 = zzl.zza(this.zza, 0, Math.min(ConstantsKt.DEFAULT_BLOCK_SIZE, i));
        if (zza2 != -1) {
            return zza2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final /* synthetic */ void zzl(long j) {
    }

    public final void zzm(zzz zzz) {
    }

    public final /* synthetic */ void zzr(zzen zzen, int i) {
        zzaez.zzb(this, zzen, i);
    }

    public final void zzs(zzen zzen, int i, int i2) {
        zzen.zzM(i);
    }

    public final void zzt(long j, int i, int i2, int i3, zzafa zzafa) {
    }
}
