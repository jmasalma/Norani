package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzams implements zzadv {
    private final zzamt zza = new zzamt((String) null, 0, "audio/ac4");
    private final zzen zzb = new zzen(16384);
    private boolean zzc;

    public final int zzb(zzadw zzadw, zzaer zzaer) throws IOException {
        zzen zzen = this.zzb;
        int zza2 = zzadw.zza(zzen.zzN(), 0, 16384);
        if (zza2 == -1) {
            return -1;
        }
        zzen.zzL(0);
        zzen.zzK(zza2);
        if (!this.zzc) {
            this.zza.zzd(0, 4);
            this.zzc = true;
        }
        this.zza.zza(zzen);
        return 0;
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zza.zzb(zzady, new zzaon(IntCompanionObject.MIN_VALUE, 0, 1));
        zzady.zzG();
        zzady.zzP(new zzaet(-9223372036854775807L, 0));
    }

    public final void zzf(long j, long j2) {
        this.zzc = false;
        this.zza.zze();
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        zzadl zzadl;
        int i;
        zzen zzen = new zzen(10);
        int i2 = 0;
        while (true) {
            zzadl = (zzadl) zzadw;
            zzadl.zzm(zzen.zzN(), 0, 10, false);
            zzen.zzL(0);
            if (zzen.zzo() != 4801587) {
                break;
            }
            zzen.zzM(3);
            int zzl = zzen.zzl();
            i2 += zzl + 10;
            zzadl.zzl(zzl, false);
        }
        zzadw.zzj();
        zzadl.zzl(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzadl.zzm(zzen.zzN(), 0, 7, false);
            zzen.zzL(0);
            int zzq = zzen.zzq();
            if (zzq == 44096 || zzq == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] zzN = zzen.zzN();
                int i6 = zzacy.zza;
                if (zzN.length < 7) {
                    i = -1;
                } else {
                    byte b = ((zzN[2] & 255) << 8) | (zzN[3] & 255);
                    if (b == 65535) {
                        b = ((zzN[4] & 255) << Ascii.DLE) | ((zzN[5] & 255) << 8) | (zzN[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (zzq == 44097) {
                        i5 += 2;
                    }
                    i = b + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzadl.zzl(i - 7, false);
            } else {
                zzadw.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzadl.zzl(i4, false);
                i3 = 0;
            }
        }
    }
}
