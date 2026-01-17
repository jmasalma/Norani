package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzuz implements zzvf, zzve {
    public final zzvh zza;
    private final long zzb;
    private zzvj zzc;
    private zzvf zzd;
    private zzve zze;
    private long zzf = -9223372036854775807L;
    private final zzzm zzg;

    public zzuz(zzvh zzvh, zzzm zzzm, long j) {
        this.zza = zzvh;
        this.zzg = zzzm;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final long zza(long j, zzmi zzmi) {
        zzvf zzvf = this.zzd;
        String str = zzex.zza;
        zzvf zzvf2 = zzvf;
        return zzvf.zza(j, zzmi);
    }

    public final long zzb() {
        zzvf zzvf = this.zzd;
        String str = zzex.zza;
        zzvf zzvf2 = zzvf;
        return zzvf.zzb();
    }

    public final long zzc() {
        zzvf zzvf = this.zzd;
        String str = zzex.zza;
        zzvf zzvf2 = zzvf;
        return zzvf.zzc();
    }

    public final long zzd() {
        zzvf zzvf = this.zzd;
        String str = zzex.zza;
        zzvf zzvf2 = zzvf;
        return zzvf.zzd();
    }

    public final long zze(long j) {
        zzvf zzvf = this.zzd;
        String str = zzex.zza;
        zzvf zzvf2 = zzvf;
        return zzvf.zze(j);
    }

    public final long zzf(zzyw[] zzywArr, boolean[] zArr, zzwz[] zzwzArr, boolean[] zArr2, long j) {
        long j2 = this.zzf;
        long j3 = (j2 == -9223372036854775807L || j != this.zzb) ? j : j2;
        this.zzf = -9223372036854775807L;
        zzvf zzvf = this.zzd;
        String str = zzex.zza;
        zzvf zzvf2 = zzvf;
        return zzvf.zzf(zzywArr, zArr, zzwzArr, zArr2, j3);
    }

    public final zzxk zzg() {
        zzvf zzvf = this.zzd;
        String str = zzex.zza;
        zzvf zzvf2 = zzvf;
        return zzvf.zzg();
    }

    public final void zzh(long j, boolean z) {
        zzvf zzvf = this.zzd;
        String str = zzex.zza;
        zzvf zzvf2 = zzvf;
        zzvf.zzh(j, false);
    }

    public final void zzi() throws IOException {
        zzvf zzvf = this.zzd;
        if (zzvf != null) {
            zzvf.zzi();
            return;
        }
        zzvj zzvj = this.zzc;
        if (zzvj != null) {
            zzvj.zzz();
        }
    }

    public final /* bridge */ /* synthetic */ void zzj(zzxb zzxb) {
        zzvf zzvf = (zzvf) zzxb;
        zzve zzve = this.zze;
        String str = zzex.zza;
        zzve zzve2 = zzve;
        zzve.zzj(this);
    }

    public final void zzk(zzve zzve, long j) {
        this.zze = zzve;
        zzvf zzvf = this.zzd;
        if (zzvf != null) {
            zzvf.zzk(this, zzv(this.zzb));
        }
    }

    public final void zzl(zzvf zzvf) {
        zzve zzve = this.zze;
        String str = zzex.zza;
        zzve zzve2 = zzve;
        zzve.zzl(this);
    }

    public final void zzm(long j) {
        zzvf zzvf = this.zzd;
        String str = zzex.zza;
        zzvf zzvf2 = zzvf;
        zzvf.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    public final boolean zzo(zzla zzla) {
        zzvf zzvf = this.zzd;
        return zzvf != null && zzvf.zzo(zzla);
    }

    public final boolean zzp() {
        zzvf zzvf = this.zzd;
        return zzvf != null && zzvf.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzvh zzvh) {
        long zzv = zzv(this.zzb);
        zzvj zzvj = this.zzc;
        zzvj.getClass();
        zzvj zzvj2 = zzvj;
        zzvf zzI = zzvj.zzI(zzvh, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzk(this, zzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(zzvj zzvj) {
        zzdd.zzf(this.zzc == null);
        this.zzc = zzvj;
    }

    public final void zzt() {
        zzvf zzvf = this.zzd;
        if (zzvf != null) {
            zzvj zzvj = this.zzc;
            zzvj.getClass();
            zzvj zzvj2 = zzvj;
            zzvj.zzG(zzvf);
        }
    }
}
