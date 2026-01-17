package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzqq {
    private final zzqp zza;
    private final int zzb;
    private final zzqr zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzqq(AudioTrack audioTrack, zzqr zzqr) {
        this.zza = new zzqp(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzqr;
        zzh(0);
    }

    private final long zzf(long j, float f) {
        zzqp zzqp = this.zza;
        return zzg(zzqp.zza(), zzqp.zzb(), j, f);
    }

    private final long zzg(long j, long j2, long j3, float f) {
        return zzex.zzt(j, this.zzb) + zzex.zzq(j3 - j2, f);
    }

    private final void zzh(int i) {
        this.zzd = i;
        long j = 10000;
        if (i == 0) {
            this.zzg = 0;
            this.zzh = -1;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        } else {
            this.zzf = 10000;
            return;
        }
        this.zzf = j;
    }

    public final long zza(long j, float f) {
        return zzf(j, f);
    }

    public final void zzb(long j, float f, long j2) {
        zzqp zzqp;
        long j3 = j;
        if (j3 - this.zzg >= this.zzf) {
            this.zzg = j3;
            zzqp zzqp2 = this.zza;
            boolean zzc2 = zzqp2.zzc();
            if (zzc2) {
                long zzb2 = zzqp2.zzb();
                long zzf2 = zzf(j, f);
                if (Math.abs(zzb2 - j3) > 5000000) {
                    this.zzc.zzd(zzqp2.zza(), zzb2, j, j2);
                    zzh(4);
                } else if (Math.abs(zzf2 - j2) > 5000000) {
                    this.zzc.zzc(zzqp2.zza(), zzb2, j, j2);
                    zzh(4);
                } else if (this.zzd == 4) {
                    zzh(0);
                }
            }
            int i = this.zzd;
            if (i == 0) {
                zzqp zzqp3 = zzqp2;
                if (zzc2) {
                    if (zzqp3.zzb() >= this.zze) {
                        this.zzh = zzqp3.zza();
                        this.zzi = zzqp3.zzb();
                        zzh(1);
                    }
                } else if (j - this.zze > 500000) {
                    zzh(3);
                }
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3 && zzc2) {
                        zzh(0);
                    }
                } else if (!zzc2) {
                    zzh(0);
                }
            } else if (zzc2) {
                long zza2 = zzqp2.zza();
                long j4 = this.zzh;
                if (zza2 <= j4) {
                    zzqp = zzqp2;
                } else {
                    zzqp = zzqp2;
                    if (Math.abs(zzf(j, f) - zzg(j4, this.zzi, j, f)) < 1000) {
                        zzh(2);
                        return;
                    }
                }
                if (j - this.zze > 2000000) {
                    zzh(3);
                    return;
                }
                this.zzh = zzqp.zza();
                this.zzi = zzqp.zzb();
            } else {
                zzh(0);
            }
        }
    }

    public final void zzc() {
        zzh(0);
    }

    public final boolean zzd() {
        return this.zzd == 2;
    }

    public final boolean zze() {
        int i = this.zzd;
        return i == 0 || i == 1;
    }
}
