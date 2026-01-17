package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzajy extends zzakh {
    private zzaeg zza;
    private zzajx zzb;

    zzajy() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    public final long zza(zzen zzen) {
        if (!zzd(zzen.zzN())) {
            return -1;
        }
        int i = (zzen.zzN()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zza2 = zzaec.zza(zzen, i);
            zzen.zzL(0);
            return (long) zza2;
        }
        zzen.zzM(4);
        zzen.zzx();
        int zza22 = zzaec.zza(zzen, i);
        zzen.zzL(0);
        return (long) zza22;
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzen zzen, long j, zzake zzake) {
        byte[] zzN = zzen.zzN();
        zzaeg zzaeg = this.zza;
        if (zzaeg == null) {
            zzaeg zzaeg2 = new zzaeg(zzN, 17);
            this.zza = zzaeg2;
            zzx zzb2 = zzaeg2.zzc(Arrays.copyOfRange(zzN, 9, zzen.zzd()), (zzav) null).zzb();
            zzb2.zzG("audio/ogg");
            zzake.zza = zzb2.zzan();
            return true;
        } else if ((zzN[0] & Byte.MAX_VALUE) == 3) {
            zzaef zzb3 = zzaed.zzb(zzen);
            zzaeg zzf = zzaeg.zzf(zzb3);
            this.zza = zzf;
            this.zzb = new zzajx(zzf, zzb3);
            return true;
        } else if (!zzd(zzN)) {
            return true;
        } else {
            zzajx zzajx = this.zzb;
            if (zzajx != null) {
                zzajx.zza(j);
                zzake.zzb = this.zzb;
            }
            zzake.zza.getClass();
            return false;
        }
    }
}
