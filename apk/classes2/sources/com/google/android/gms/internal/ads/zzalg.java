package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzalg {
    private final zzen zza = new zzen();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static /* bridge */ /* synthetic */ void zzb(zzalg zzalg, zzen zzen, int i) {
        int zzo;
        if (i >= 4) {
            zzen.zzM(3);
            int i2 = i - 4;
            if ((zzen.zzm() & 128) != 0) {
                if (i2 >= 7 && (zzo = zzen.zzo()) >= 4) {
                    zzalg.zzh = zzen.zzq();
                    zzalg.zzi = zzen.zzq();
                    zzalg.zza.zzI(zzo - 4);
                    i2 = i - 11;
                } else {
                    return;
                }
            }
            zzen zzen2 = zzalg.zza;
            int zzc2 = zzen2.zzc();
            int zzd2 = zzen2.zzd();
            if (zzc2 < zzd2 && i2 > 0) {
                int min = Math.min(i2, zzd2 - zzc2);
                zzen.zzH(zzen2.zzN(), zzc2, min);
                zzen2.zzL(zzc2 + min);
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzc(zzalg zzalg, zzen zzen, int i) {
        if (i >= 19) {
            zzalg.zzd = zzen.zzq();
            zzalg.zze = zzen.zzq();
            zzen.zzM(11);
            zzalg.zzf = zzen.zzq();
            zzalg.zzg = zzen.zzq();
        }
    }

    static /* bridge */ /* synthetic */ void zzd(zzalg zzalg, zzen zzen, int i) {
        zzalg zzalg2 = zzalg;
        if (i % 5 == 2) {
            zzen.zzM(2);
            int[] iArr = zzalg2.zzb;
            Arrays.fill(iArr, 0);
            int i2 = 0;
            for (int i3 = i / 5; i2 < i3; i3 = i3) {
                int zzm = zzen.zzm();
                int zzm2 = zzen.zzm();
                int zzm3 = zzen.zzm();
                int zzm4 = zzen.zzm();
                double d = (double) zzm2;
                int zzm5 = zzen.zzm() << 24;
                String str = zzex.zza;
                double d2 = (double) (zzm3 - 128);
                double d3 = (double) (zzm4 - 128);
                iArr[zzm] = (Math.max(0, Math.min((int) (d + (1.402d * d2)), KotlinVersion.MAX_COMPONENT_VALUE)) << 16) | zzm5 | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), KotlinVersion.MAX_COMPONENT_VALUE)) << 8) | Math.max(0, Math.min((int) (d + (d3 * 1.772d)), KotlinVersion.MAX_COMPONENT_VALUE));
                i2++;
            }
            zzalg2.zzc = true;
        }
    }

    public final zzcu zza() {
        int i;
        int i2;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzen zzen = this.zza;
        if (zzen.zzd() == 0 || zzen.zzc() != zzen.zzd() || !this.zzc) {
            return null;
        }
        zzen.zzL(0);
        int i3 = this.zzh * this.zzi;
        int[] iArr = new int[i3];
        int i4 = 0;
        while (i4 < i3) {
            int zzm = zzen.zzm();
            if (zzm != 0) {
                i2 = i4 + 1;
                iArr[i4] = this.zzb[zzm];
            } else {
                int zzm2 = zzen.zzm();
                if (zzm2 != 0) {
                    int i5 = zzm2 & 63;
                    if ((zzm2 & 64) != 0) {
                        i5 = (i5 << 8) | zzen.zzm();
                    }
                    if ((zzm2 & 128) == 0) {
                        i = this.zzb[0];
                    } else {
                        i = this.zzb[zzen.zzm()];
                    }
                    i2 = i5 + i4;
                    Arrays.fill(iArr, i4, i2, i);
                }
            }
            i4 = i2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcs zzcs = new zzcs();
        zzcs.zzc(createBitmap);
        zzcs.zzh(((float) this.zzf) / ((float) this.zzd));
        zzcs.zzi(0);
        zzcs.zze(((float) this.zzg) / ((float) this.zze), 0);
        zzcs.zzf(0);
        zzcs.zzk(((float) this.zzh) / ((float) this.zzd));
        zzcs.zzd(((float) this.zzi) / ((float) this.zze));
        return zzcs.zzq();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzI(0);
        this.zzc = false;
    }
}
