package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzqs {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private zzdj zzG;
    boolean zza;
    private final zzqr zzb;
    private final long[] zzc;
    private AudioTrack zzd;
    private int zze;
    private zzqq zzf;
    private int zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private Method zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzqs(zzqr zzqr) {
        zzqr zzqr2 = zzqr;
        this.zzb = zzqr;
        try {
            Class[] clsArr = null;
            this.zzo = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzD = -9223372036854775807L;
        this.zzC = -9223372036854775807L;
        this.zzG = zzdj.zza;
    }

    private final long zzl() {
        if (this.zzy != -9223372036854775807L) {
            return Math.min(this.zzB, zzo());
        }
        long zzb2 = this.zzG.zzb();
        if (zzb2 - this.zzt >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            AudioTrack audioTrack2 = audioTrack;
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.zzu <= 0 || playState != 3) {
                            playbackHeadPosition = 0;
                        } else if (this.zzz == -9223372036854775807L) {
                            this.zzz = zzb2;
                        }
                    }
                    this.zzz = -9223372036854775807L;
                }
                if (this.zzu > playbackHeadPosition) {
                    this.zzv++;
                }
                this.zzu = playbackHeadPosition;
            }
            this.zzt = zzb2;
        }
        return this.zzu + this.zzF + (this.zzv << 32);
    }

    private final long zzm(long j) {
        long j2;
        if (this.zzx != 0) {
            j2 = zzex.zzq(j + this.zzm, this.zzi);
        } else if (this.zzy != -9223372036854775807L) {
            j2 = zzex.zzt(zzo(), this.zzg);
        } else {
            j2 = zzn();
        }
        long max = Math.max(0, j2 - this.zzp);
        return this.zzy != -9223372036854775807L ? Math.min(zzex.zzt(this.zzB, this.zzg), max) : max;
    }

    private final long zzn() {
        return zzex.zzt(zzl(), this.zzg);
    }

    private final long zzo() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        AudioTrack audioTrack2 = audioTrack;
        if (audioTrack.getPlayState() == 2) {
            return this.zzA;
        }
        return this.zzA + zzex.zzp(zzex.zzq(zzex.zzs(this.zzG.zzb()) - this.zzy, this.zzi), this.zzg);
    }

    private final void zzp() {
        this.zzm = 0;
        this.zzx = 0;
        this.zzw = 0;
        this.zzn = 0;
        this.zzC = -9223372036854775807L;
        this.zzD = -9223372036854775807L;
        this.zzj = false;
    }

    public final long zza() {
        long j;
        Method method;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        AudioTrack audioTrack2 = audioTrack;
        if (audioTrack.getPlayState() == 3) {
            long zzc2 = this.zzG.zzc() / 1000;
            if (zzc2 - this.zzn >= 30000) {
                long zzn2 = zzn();
                if (zzn2 != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzw] = zzex.zzr(zzn2, this.zzi) - zzc2;
                    this.zzw = (this.zzw + 1) % 10;
                    int i = this.zzx;
                    if (i < 10) {
                        this.zzx = i + 1;
                    }
                    this.zzn = zzc2;
                    this.zzm = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.zzx;
                        if (i2 >= i3) {
                            break;
                        }
                        this.zzm += jArr[i2] / ((long) i3);
                        i2++;
                    }
                }
            }
            if (this.zzr && (method = this.zzo) != null && zzc2 - this.zzs >= 500000) {
                try {
                    AudioTrack audioTrack3 = this.zzd;
                    if (audioTrack3 != null) {
                        Integer num = (Integer) method.invoke(audioTrack3, new Object[0]);
                        String str = zzex.zza;
                        Integer num2 = num;
                        long intValue = (((long) num.intValue()) * 1000) - this.zzh;
                        this.zzp = intValue;
                        long max = Math.max(intValue, 0);
                        this.zzp = max;
                        if (max > 5000000) {
                            this.zzb.zza(max);
                            this.zzp = 0;
                        }
                        this.zzs = zzc2;
                    } else {
                        throw null;
                    }
                } catch (Exception unused) {
                    this.zzo = null;
                }
            }
            zzqq zzqq = this.zzf;
            zzqq.getClass();
            zzqq zzqq2 = zzqq;
            zzqq.zzb(zzc2, this.zzi, zzm(zzc2));
        }
        long zzc3 = this.zzG.zzc() / 1000;
        zzqq zzqq3 = this.zzf;
        zzqq3.getClass();
        zzqq zzqq4 = zzqq3;
        boolean zzd2 = zzqq3.zzd();
        if (zzd2) {
            j = zzqq3.zza(zzc3, this.zzi);
        } else {
            j = zzm(zzc3);
        }
        if (audioTrack.getPlayState() == 3) {
            if (this.zza) {
                long j2 = this.zzk;
                if (j2 != -9223372036854775807L && j >= j2 && (zzd2 || !zzqq3.zze())) {
                    long zza2 = this.zzG.zza() - zzex.zzv(zzex.zzr(j - j2, this.zzi));
                    this.zzk = -9223372036854775807L;
                    this.zzb.zzb(zza2);
                }
            }
            long j3 = this.zzD;
            if (j3 != -9223372036854775807L) {
                long zzq2 = zzex.zzq(zzc3 - j3, this.zzi);
                long j4 = this.zzC + zzq2;
                int i4 = ((j - this.zzC) > 0 ? 1 : ((j - this.zzC) == 0 ? 0 : -1));
                long abs = Math.abs(j4 - j);
                if (i4 != 0 && abs < 1000000) {
                    long j5 = (zzq2 * 10) / 100;
                    j = Math.max(j4 - j5, Math.min(j, j4 + j5));
                }
            }
            if (!this.zza && !this.zzj) {
                long j6 = this.zzC;
                if (j6 != -9223372036854775807L && j > j6) {
                    this.zzj = true;
                    String str2 = zzex.zza;
                    this.zzb.zzb(this.zzG.zza() - zzex.zzv(zzex.zzr(zzex.zzv(j - j6), this.zzi)));
                }
            }
            this.zzD = zzc3;
            this.zzC = j;
        }
        return j;
    }

    public final void zzb(long j) {
        this.zzA = zzl();
        this.zzy = zzex.zzs(this.zzG.zzb());
        this.zzB = j;
    }

    public final void zzc() {
        zzp();
        this.zzd = null;
        this.zzf = null;
    }

    public final void zzd(AudioTrack audioTrack, boolean z, int i, int i2, int i3, boolean z2) {
        this.zzd = audioTrack;
        this.zze = i3;
        this.zzf = new zzqq(audioTrack, this.zzb);
        this.zzg = audioTrack.getSampleRate();
        boolean zzK = zzex.zzK(i);
        this.zzr = zzK;
        this.zzh = zzK ? zzex.zzt((long) (i3 / i2), this.zzg) : -9223372036854775807L;
        this.zzu = 0;
        this.zzv = 0;
        this.zzE = false;
        this.zzF = 0;
        this.zzq = false;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzs = 0;
        this.zzp = 0;
        this.zzi = 1.0f;
        this.zzl = 0;
        this.zzk = -9223372036854775807L;
        this.zza = z2;
    }

    public final void zze(zzdj zzdj) {
        this.zzG = zzdj;
    }

    public final void zzf() {
        if (this.zzy != -9223372036854775807L) {
            this.zzy = zzex.zzs(this.zzG.zzb());
        }
        this.zzk = zzn();
        zzqq zzqq = this.zzf;
        zzqq.getClass();
        zzqq zzqq2 = zzqq;
        zzqq.zzc();
    }

    public final boolean zzg(long j) {
        return j > zzex.zzp(zza(), this.zzg);
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        AudioTrack audioTrack2 = audioTrack;
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzz != -9223372036854775807L && j > 0 && this.zzG.zzb() - this.zzz >= 200;
    }

    public final boolean zzj(long j) {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        AudioTrack audioTrack2 = audioTrack;
        audioTrack.getPlayState();
        AudioTrack audioTrack3 = this.zzd;
        audioTrack3.getClass();
        AudioTrack audioTrack4 = audioTrack3;
        int underrunCount = audioTrack3.getUnderrunCount();
        boolean z = underrunCount > this.zzl;
        this.zzl = underrunCount;
        if (z) {
            this.zzb.zze(this.zze, zzex.zzv(this.zzh));
        }
        return true;
    }

    public final boolean zzk() {
        zzp();
        if (this.zzy == -9223372036854775807L) {
            zzqq zzqq = this.zzf;
            zzqq.getClass();
            zzqq zzqq2 = zzqq;
            zzqq.zzc();
            return true;
        }
        this.zzA = zzl();
        return false;
    }
}
