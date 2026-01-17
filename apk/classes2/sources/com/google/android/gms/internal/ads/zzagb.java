package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzagb extends zzagf {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzagb(zzafb zzafb) {
        super(zzafb);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzen zzen) throws zzage {
        String str;
        if (!this.zzc) {
            int zzm = zzen.zzm();
            int i = zzm >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzm >> 2) & 3];
                zzx zzx = new zzx();
                zzx.zzG("video/x-flv");
                zzx.zzah("audio/mpeg");
                zzx.zzD(1);
                zzx.zzai(i2);
                this.zza.zzm(zzx.zzan());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzx zzx2 = new zzx();
                zzx2.zzG("video/x-flv");
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                zzx2.zzah(str);
                zzx2.zzD(1);
                zzx2.zzai(8000);
                this.zza.zzm(zzx2.zzan());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzage("Audio format not supported: " + i);
            }
            this.zzc = true;
        } else {
            zzen.zzM(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(zzen zzen, long j) throws zzaz {
        if (this.zze == 2) {
            int zza = zzen.zza();
            zzafb zzafb = this.zza;
            zzafb.zzr(zzen, zza);
            zzafb.zzt(j, 1, zza, 0, (zzafa) null);
            return true;
        }
        int zzm = zzen.zzm();
        if (zzm == 0 && !this.zzd) {
            int zza2 = zzen.zza();
            byte[] bArr = new byte[zza2];
            zzen.zzH(bArr, 0, zza2);
            zzacp zza3 = zzacr.zza(bArr);
            zzx zzx = new zzx();
            zzx.zzG("video/x-flv");
            zzx.zzah("audio/mp4a-latm");
            zzx.zzE(zza3.zzc);
            zzx.zzD(zza3.zzb);
            zzx.zzai(zza3.zza);
            zzx.zzT(Collections.singletonList(bArr));
            this.zza.zzm(zzx.zzan());
            this.zzd = true;
            return false;
        } else if (this.zze == 10 && zzm != 1) {
            return false;
        } else {
            int zza4 = zzen.zza();
            zzafb zzafb2 = this.zza;
            zzafb2.zzr(zzen, zza4);
            zzafb2.zzt(j, 1, zza4, 0, (zzafa) null);
            return true;
        }
    }
}
