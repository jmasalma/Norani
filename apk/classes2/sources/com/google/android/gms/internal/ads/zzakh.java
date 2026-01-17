package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
abstract class zzakh {
    private final zzaka zza = new zzaka();
    private zzafb zzb;
    private zzady zzc;
    private zzakc zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzake zzj = new zzake();
    private long zzk;
    private boolean zzl;
    private boolean zzm;

    /* access modifiers changed from: protected */
    public abstract long zza(zzen zzen);

    /* access modifiers changed from: protected */
    public void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzake();
            this.zzf = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1;
        this.zzg = 0;
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean zzc(zzen zzen, long j, zzake zzake) throws IOException;

    /* access modifiers changed from: package-private */
    public final int zze(zzadw zzadw, zzaer zzaer) throws IOException {
        zzadw zzadw2 = zzadw;
        zzdd.zzb(this.zzb);
        String str = zzex.zza;
        int i = this.zzh;
        if (i == 0) {
            while (true) {
                zzaka zzaka = this.zza;
                if (!zzaka.zze(zzadw2)) {
                    this.zzh = 3;
                    return -1;
                }
                long zzf2 = zzadw.zzf();
                long j = this.zzf;
                this.zzk = zzf2 - j;
                if (zzc(zzaka.zza(), j, this.zzj)) {
                    this.zzf = zzadw.zzf();
                } else {
                    zzz zzz = this.zzj.zza;
                    this.zzi = zzz.zzH;
                    if (!this.zzm) {
                        this.zzb.zzm(zzz);
                        this.zzm = true;
                    }
                    zzakc zzakc = this.zzj.zzb;
                    if (zzakc != null) {
                        this.zzd = zzakc;
                    } else if (zzadw.zzd() == -1) {
                        this.zzd = new zzakf((zzakg) null);
                    } else {
                        zzakb zzb2 = zzaka.zzb();
                        this.zzd = new zzajw(this, this.zzf, zzadw.zzd(), (long) (zzb2.zzd + zzb2.zze), zzb2.zzb, (zzb2.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    zzaka.zzd();
                }
            }
        } else if (i == 1) {
            zzadw2.zzk((int) this.zzf);
            this.zzh = 2;
            return 0;
        } else if (i != 2) {
            return -1;
        } else {
            long zzd2 = this.zzd.zzd(zzadw2);
            if (zzd2 >= 0) {
                zzaer.zza = zzd2;
                return 1;
            }
            if (zzd2 < -1) {
                zzi(-(zzd2 + 2));
            }
            if (!this.zzl) {
                zzaeu zze2 = this.zzd.zze();
                zzdd.zzb(zze2);
                zzaeu zzaeu = zze2;
                this.zzc.zzP(zze2);
                this.zzb.zzl(zze2.zza());
                this.zzl = true;
            }
            if (this.zzk > 0 || this.zza.zze(zzadw2)) {
                this.zzk = 0;
                zzen zza2 = this.zza.zza();
                long zza3 = zza(zza2);
                if (zza3 >= 0) {
                    long j2 = this.zzg;
                    if (j2 + zza3 >= this.zze) {
                        long zzf3 = zzf(j2);
                        this.zzb.zzr(zza2, zza2.zzd());
                        this.zzb.zzt(zzf3, 1, zza2.zzd(), 0, (zzafa) null);
                        this.zze = -1;
                    }
                }
                this.zzg += zza3;
            } else {
                this.zzh = 3;
                return -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final long zzf(long j) {
        return (j * 1000000) / ((long) this.zzi);
    }

    /* access modifiers changed from: protected */
    public final long zzg(long j) {
        return (((long) this.zzi) * j) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zzady zzady, zzafb zzafb) {
        this.zzc = zzady;
        this.zzb = zzafb;
        zzb(true);
    }

    /* access modifiers changed from: protected */
    public void zzi(long j) {
        this.zzg = j;
    }

    /* access modifiers changed from: package-private */
    public final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzakc zzakc = this.zzd;
            String str = zzex.zza;
            zzakc zzakc2 = zzakc;
            zzakc.zzg(this.zze);
            this.zzh = 2;
        }
    }
}
