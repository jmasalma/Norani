package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzadh {
    public static void zza(long j, zzen zzen, zzafb[] zzafbArr) {
        int i;
        while (true) {
            boolean z = true;
            if (zzen.zza() > 1) {
                int zzc = zzc(zzen);
                int zzc2 = zzc(zzen);
                int zzc3 = zzen.zzc() + zzc2;
                if (zzc2 == -1 || zzc2 > zzen.zza()) {
                    zzea.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzc3 = zzen.zzd();
                } else if (zzc == 4 && zzc2 >= 8) {
                    int zzm = zzen.zzm();
                    int zzq = zzen.zzq();
                    if (zzq == 49) {
                        i = zzen.zzg();
                        zzq = 49;
                    } else {
                        i = 0;
                    }
                    int zzm2 = zzen.zzm();
                    if (zzq == 47) {
                        zzen.zzM(1);
                        zzq = 47;
                    }
                    boolean z2 = zzm == 181 && (zzq == 49 || zzq == 47) && zzm2 == 3;
                    if (zzq == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        zzb(j, zzen, zzafbArr);
                    }
                }
                zzen.zzL(zzc3);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j, zzen zzen, zzafb[] zzafbArr) {
        zzen zzen2 = zzen;
        zzafb[] zzafbArr2 = zzafbArr;
        int zzm = zzen.zzm();
        if ((zzm & 64) != 0) {
            int i = zzm & 31;
            zzen2.zzM(1);
            int zzc = zzen.zzc();
            for (zzafb zzafb : zzafbArr2) {
                int i2 = i * 3;
                zzen2.zzL(zzc);
                zzafb.zzr(zzen2, i2);
                zzdd.zzf(j != -9223372036854775807L);
                zzafb.zzt(j, 1, i2, 0, (zzafa) null);
            }
        }
    }

    private static int zzc(zzen zzen) {
        int i = 0;
        while (zzen.zza() != 0) {
            int zzm = zzen.zzm();
            i += zzm;
            if (zzm != 255) {
                return i;
            }
        }
        return -1;
    }
}
