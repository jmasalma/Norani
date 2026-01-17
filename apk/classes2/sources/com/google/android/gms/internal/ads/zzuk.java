package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzuk implements zzwz {
    public final zzwz zza;
    final /* synthetic */ zzul zzb;
    private boolean zzc;

    public zzuk(zzul zzul, zzwz zzwz) {
        Objects.requireNonNull(zzul);
        this.zzb = zzul;
        this.zza = zzwz;
    }

    public final int zza(zzkv zzkv, zzhs zzhs, int i) {
        zzul zzul = this.zzb;
        if (zzul.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhs.zzc(4);
            return -4;
        }
        long zzb2 = zzul.zzb();
        int zza2 = this.zza.zza(zzkv, zzhs, i);
        if (zza2 == -5) {
            zzz zzz = zzkv.zza;
            zzz.getClass();
            zzz zzz2 = zzz;
            int i2 = zzz.zzJ;
            int i3 = 0;
            if (i2 == 0) {
                if (zzz.zzK != 0) {
                    i2 = 0;
                }
                return -5;
            }
            if (zzul.zzb == Long.MIN_VALUE) {
                i3 = zzz.zzK;
            }
            zzx zzb3 = zzz.zzb();
            zzb3.zzM(i2);
            zzb3.zzN(i3);
            zzkv.zza = zzb3.zzan();
            return -5;
        }
        long j = zzul.zzb;
        if (j == Long.MIN_VALUE || ((zza2 != -4 || zzhs.zze < j) && (zza2 != -3 || zzb2 != Long.MIN_VALUE || zzhs.zzd))) {
            return zza2;
        }
        zzhs.zzb();
        zzhs.zzc(4);
        this.zzc = true;
        return -4;
    }

    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
