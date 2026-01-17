package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzamq implements zzadv {
    private final zzamr zza = new zzamr((String) null, 0, "audio/ac3");
    private final zzen zzb = new zzen(2786);
    private boolean zzc;

    public final int zzb(zzadw zzadw, zzaer zzaer) throws IOException {
        zzen zzen = this.zzb;
        int zza2 = zzadw.zza(zzen.zzN(), 0, 2786);
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
        zzen zzen = new zzen(10);
        int i = 0;
        while (true) {
            zzadl = (zzadl) zzadw;
            zzadl.zzm(zzen.zzN(), 0, 10, false);
            zzen.zzL(0);
            if (zzen.zzo() != 4801587) {
                break;
            }
            zzen.zzM(3);
            int zzl = zzen.zzl();
            i += zzl + 10;
            zzadl.zzl(zzl, false);
        }
        zzadw.zzj();
        zzadl.zzl(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzadl.zzm(zzen.zzN(), 0, 6, false);
            zzen.zzL(0);
            if (zzen.zzq() != 2935) {
                zzadw.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzadl.zzl(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int zzb2 = zzacu.zzb(zzen.zzN());
                if (zzb2 == -1) {
                    return false;
                }
                zzadl.zzl(zzb2 - 6, false);
            }
        }
    }
}
