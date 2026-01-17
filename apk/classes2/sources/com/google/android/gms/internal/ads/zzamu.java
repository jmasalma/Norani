package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzamu implements zzadv {
    private final zzamv zza;
    private final zzen zzb;
    private final zzen zzc;
    private final zzem zzd;
    private zzady zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzamu() {
        throw null;
    }

    public zzamu(int i) {
        this.zza = new zzamv(true, (String) null, 0, "audio/mp4a-latm");
        this.zzb = new zzen(2048);
        this.zzg = -1;
        zzen zzen = new zzen(10);
        this.zzc = zzen;
        byte[] zzN = zzen.zzN();
        this.zzd = new zzem(zzN, zzN.length);
    }

    public final int zzb(zzadw zzadw, zzaer zzaer) throws IOException {
        zzdd.zzb(this.zze);
        zzen zzen = this.zzb;
        int zza2 = zzadw.zza(zzen.zzN(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzP(new zzaet(-9223372036854775807L, 0));
            this.zzi = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        zzen.zzL(0);
        zzen.zzK(zza2);
        if (!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
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
        this.zze = zzady;
        this.zza.zzb(zzady, new zzaon(IntCompanionObject.MIN_VALUE, 0, 1));
        zzady.zzG();
    }

    public final void zzf(long j, long j2) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j2;
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        zzen zzen;
        zzadl zzadl;
        int i = 0;
        while (true) {
            zzen = this.zzc;
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
        if (this.zzg == -1) {
            this.zzg = (long) i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzadl.zzm(zzen.zzN(), 0, 2, false);
            zzen.zzL(0);
            if (!zzamv.zzf(zzen.zzq())) {
                i4++;
                zzadw.zzj();
                zzadl.zzl(i4, false);
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzadl.zzm(zzen.zzN(), 0, 4, false);
                zzem zzem = this.zzd;
                zzem.zzl(14);
                int zzd2 = zzem.zzd(13);
                if (zzd2 <= 6) {
                    i4++;
                    zzadw.zzj();
                    zzadl.zzl(i4, false);
                } else {
                    zzadl.zzl(zzd2 - 6, false);
                    i3 += zzd2;
                }
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }
}
