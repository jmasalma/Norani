package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzabx {
    private final zzabs zza;
    private final zzabq zzb = new zzabq();
    private final zzet zzc = new zzet(10);
    private final zzet zzd = new zzet(10);
    private final zzec zze = new zzec(16);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private zzcd zzi = zzcd.zza;
    private long zzj;
    private final zzaap zzk;

    public zzabx(zzaap zzaap, zzabs zzabs) {
        this.zzk = zzaap;
        this.zza = zzabs;
    }

    private static Object zzh(zzet zzet) {
        zzdd.zzd(zzet.zza() > 0);
        while (zzet.zza() > 1) {
            zzet.zzb();
        }
        Object zzb2 = zzet.zzb();
        zzb2.getClass();
        return zzb2;
    }

    public final void zza() {
        this.zze.zzd();
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        zzet zzet = this.zzd;
        if (zzet.zza() > 0) {
            this.zzj = ((Long) zzh(zzet)).longValue();
        }
        zzet zzet2 = this.zzc;
        if (zzet2.zza() > 0) {
            zzet2.zzd(0, (zzcd) zzh(zzet2));
        }
    }

    public final void zzb(long j) {
        this.zze.zzc(j);
        this.zzf = j;
        this.zzh = -9223372036854775807L;
    }

    public final void zzc(int i, long j) {
        if (this.zze.zze()) {
            this.zza.zzf(i);
            this.zzj = j;
            return;
        }
        zzet zzet = this.zzd;
        long j2 = this.zzf;
        zzet.zzd(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
    }

    public final void zzd(int i, int i2) {
        long j = this.zzf;
        this.zzc.zzd(j == -9223372036854775807L ? 0 : j + 1, new zzcd(i, i2, 1.0f));
    }

    public final void zze(long j, long j2) throws zzin {
        long j3;
        while (true) {
            zzec zzec = this.zze;
            if (!zzec.zze()) {
                zzet zzet = this.zzd;
                long zza2 = zzec.zza();
                Long l = (Long) zzet.zzc(zza2);
                if (!(l == null || l.longValue() == this.zzj)) {
                    this.zzj = l.longValue();
                    this.zza.zzf(2);
                }
                zzabs zzabs = this.zza;
                long j4 = this.zzj;
                zzabq zzabq = this.zzb;
                zzec zzec2 = zzec;
                zzabs zzabs2 = zzabs;
                long j5 = zza2;
                int zza3 = zzabs.zza(zza2, j, j2, j4, false, false, zzabq);
                if (zza3 == 0 || zza3 == 1) {
                    this.zzg = j5;
                    long zzb2 = zzec2.zzb();
                    zzcd zzcd = (zzcd) this.zzc.zzc(zzb2);
                    if (zzcd != null && !zzcd.equals(zzcd.zza) && !zzcd.equals(this.zzi)) {
                        this.zzi = zzcd;
                        this.zzk.zza(zzcd);
                    }
                    if (zza3 == 0) {
                        j3 = System.nanoTime();
                    } else {
                        j3 = zzabq.zzd();
                    }
                    this.zzk.zzb(j3, zzb2, zzabs2.zzn());
                } else if (zza3 == 2 || zza3 == 3) {
                    this.zzg = j5;
                    zzec2.zzb();
                    zzaap zzaap = this.zzk;
                    zzaar zzaar = zzaap.zza;
                    zzaar.zzh.execute(new zzaan(zzaap));
                    ((zzacm) zzaar.zzc.remove()).zzb();
                } else if (zza3 == 4) {
                    this.zzg = j5;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void zzf() {
        long j = this.zzf;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            this.zzf = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
        }
        this.zzh = j;
    }

    public final boolean zzg() {
        long j = this.zzh;
        return j != -9223372036854775807L && this.zzg == j;
    }
}
