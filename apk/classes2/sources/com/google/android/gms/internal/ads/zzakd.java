package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzakd extends zzakh {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzakd() {
    }

    public static boolean zzd(zzen zzen) {
        return zzk(zzen, zza);
    }

    private static boolean zzk(zzen zzen, byte[] bArr) {
        if (zzen.zza() < 8) {
            return false;
        }
        int zzc2 = zzen.zzc();
        byte[] bArr2 = new byte[8];
        zzen.zzH(bArr2, 0, 8);
        zzen.zzL(zzc2);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    public final long zza(zzen zzen) {
        return zzg(zzaeq.zzd(zzen.zzN()));
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzen zzen, long j, zzake zzake) throws zzaz {
        if (zzk(zzen, zza)) {
            byte[] copyOf = Arrays.copyOf(zzen.zzN(), zzen.zzd());
            byte b = copyOf[9] & 255;
            List zze = zzaeq.zze(copyOf);
            if (zzake.zza == null) {
                zzx zzx = new zzx();
                zzx.zzG("audio/ogg");
                zzx.zzah("audio/opus");
                zzx.zzD(b);
                zzx.zzai(48000);
                zzx.zzT(zze);
                zzake.zza = zzx.zzan();
                return true;
            }
        } else if (zzk(zzen, zzb)) {
            zzdd.zzb(zzake.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzen.zzM(8);
                zzav zzb2 = zzafh.zzb(zzfyq.zzm(zzafh.zzc(zzen, false, false).zza));
                if (zzb2 != null) {
                    zzx zzb3 = zzake.zza.zzb();
                    zzb3.zzaa(zzb2.zzd(zzake.zza.zzl));
                    zzake.zza = zzb3.zzan();
                }
            }
        } else {
            zzdd.zzb(zzake.zza);
            return false;
        }
        return true;
    }
}
