package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzul implements zzvf, zzve {
    public final zzvf zza;
    long zzb;
    private zzve zzc;
    private zzuk[] zzd = new zzuk[0];
    private long zze = 0;

    public zzul(zzvf zzvf, boolean z, long j, long j2) {
        this.zza = zzvf;
        this.zzb = j2;
    }

    private static long zzr(long j, long j2, long j3) {
        int i = (j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1));
        long max = Math.max(j, j2);
        return i != 0 ? Math.min(max, j3) : max;
    }

    public final long zza(long j, zzmi zzmi) {
        if (j == 0) {
            return 0;
        }
        long j2 = zzmi.zzc;
        String str = zzex.zza;
        long max = Math.max(0, Math.min(j2, j));
        long j3 = zzmi.zzd;
        long j4 = this.zzb;
        long max2 = Math.max(0, Math.min(j3, j4 == Long.MIN_VALUE ? LongCompanionObject.MAX_VALUE : j4 - j));
        if (!(max == j2 && max2 == j3)) {
            zzmi = new zzmi(max, max2);
        }
        return this.zza.zza(j, zzmi);
    }

    public final long zzb() {
        long zzb2 = this.zza.zzb();
        if (zzb2 != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzb2 < j) {
                return zzb2;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long zzc() {
        long zzc2 = this.zza.zzc();
        if (zzc2 != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzc2 < j) {
                return zzc2;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long zzd2 = zzd();
            return zzd2 != -9223372036854775807L ? zzd2 : j;
        }
        long zzd3 = this.zza.zzd();
        if (zzd3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzr(zzd3, 0, this.zzb);
    }

    public final long zze(long j) {
        this.zze = -9223372036854775807L;
        for (zzuk zzuk : this.zzd) {
            if (zzuk != null) {
                zzuk.zzc();
            }
        }
        return zzr(this.zza.zze(j), 0, this.zzb);
    }

    public final long zzf(zzyw[] zzywArr, boolean[] zArr, zzwz[] zzwzArr, boolean[] zArr2, long j) {
        zzyw[] zzywArr2 = zzywArr;
        zzwz[] zzwzArr2 = zzwzArr;
        int length = zzwzArr2.length;
        this.zzd = new zzuk[length];
        zzwz[] zzwzArr3 = new zzwz[length];
        int i = 0;
        while (true) {
            zzwz zzwz = null;
            if (i >= zzwzArr2.length) {
                break;
            }
            zzuk[] zzukArr = this.zzd;
            zzuk zzuk = (zzuk) zzwzArr2[i];
            zzukArr[i] = zzuk;
            if (zzuk != null) {
                zzwz = zzuk.zza;
            }
            zzwzArr3[i] = zzwz;
            i++;
        }
        long zzf = this.zza.zzf(zzywArr, zArr, zzwzArr3, zArr2, j);
        long zzr = zzr(zzf, j, this.zzb);
        long j2 = -9223372036854775807L;
        if (zzq()) {
            if (zzf >= j) {
                if (zzf != 0) {
                    int length2 = zzywArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        zzyw zzyw = zzywArr2[i2];
                        if (zzyw != null) {
                            zzz zzb2 = zzyw.zzb();
                            if (!zzay.zzf(zzb2.zzo, zzb2.zzk)) {
                                break;
                            }
                        }
                        i2++;
                    }
                }
            }
            j2 = zzr;
        }
        this.zze = j2;
        for (int i3 = 0; i3 < zzwzArr2.length; i3++) {
            zzwz zzwz2 = zzwzArr3[i3];
            if (zzwz2 == null) {
                this.zzd[i3] = null;
            } else {
                zzuk[] zzukArr2 = this.zzd;
                zzuk zzuk2 = zzukArr2[i3];
                if (zzuk2 == null || zzuk2.zza != zzwz2) {
                    zzukArr2[i3] = new zzuk(this, zzwz2);
                }
            }
            zzwzArr2[i3] = this.zzd[i3];
        }
        return zzr;
    }

    public final zzxk zzg() {
        return this.zza.zzg();
    }

    public final void zzh(long j, boolean z) {
        this.zza.zzh(j, false);
    }

    public final void zzi() throws IOException {
        this.zza.zzi();
    }

    public final /* bridge */ /* synthetic */ void zzj(zzxb zzxb) {
        zzvf zzvf = (zzvf) zzxb;
        zzve zzve = this.zzc;
        zzve.getClass();
        zzve zzve2 = zzve;
        zzve.zzj(this);
    }

    public final void zzk(zzve zzve, long j) {
        this.zzc = zzve;
        this.zza.zzk(this, j);
    }

    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    public final boolean zzo(zzla zzla) {
        return this.zza.zzo(zzla);
    }

    public final boolean zzp() {
        return this.zza.zzp();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }

    public final void zzl(zzvf zzvf) {
        zzve zzve = this.zzc;
        zzve.getClass();
        zzve zzve2 = zzve;
        zzve.zzl(this);
    }
}
