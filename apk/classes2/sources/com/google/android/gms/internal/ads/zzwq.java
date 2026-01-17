package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzwq extends zzug implements zzwh {
    private final zzgi zza;
    private final zzsh zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzhj zzh;
    private zzap zzi;
    private final zzwn zzj;
    private final zzzq zzk;

    /* synthetic */ zzwq(zzap zzap, zzgi zzgi, zzwn zzwn, zzsh zzsh, zzzq zzzq, int i, int i2, zzz zzz, zzfwh zzfwh, zzwp zzwp) {
        this.zzi = zzap;
        this.zza = zzgi;
        this.zzj = zzwn;
        this.zzb = zzsh;
        this.zzk = zzzq;
        this.zzc = i;
    }

    private final void zzw() {
        long j = this.zze;
        boolean z = this.zzf;
        boolean z2 = this.zzg;
        zzap zzJ = zzJ();
        zzxd zzxd = r1;
        zzxd zzxd2 = new zzxd(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0, 0, z, false, false, (Object) null, zzJ, z2 ? zzJ.zzc : null);
        zzo(this.zzd ? new zzwm(this, zzxd) : zzxd);
    }

    public final void zzG(zzvf zzvf) {
        ((zzwl) zzvf).zzO();
    }

    public final zzvf zzI(zzvh zzvh, zzzm zzzm, long j) {
        zzgj zza2 = this.zza.zza();
        zzhj zzhj = this.zzh;
        if (zzhj != null) {
            zza2.zzf(zzhj);
        }
        zzak zzak = zzJ().zzb;
        zzak.getClass();
        zzak zzak2 = zzak;
        Uri uri = zzak.zza;
        zzwn zzwn = this.zzj;
        zzb();
        zzuj zzuj = r5;
        zzuj zzuj2 = new zzuj(zzwn.zza);
        return new zzwl(uri, zza2, zzuj, this.zzb, zzc(zzvh), this.zzk, zze(zzvh), this, zzzm, (String) null, this.zzc, 0, (zzz) null, zzex.zzs(-9223372036854775807L), (zzaai) null);
    }

    public final synchronized zzap zzJ() {
        return this.zzi;
    }

    public final void zza(long j, zzaeu zzaeu, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.zze;
        }
        boolean zzh2 = zzaeu.zzh();
        if (this.zzd || this.zze != j || this.zzf != zzh2 || this.zzg != z) {
            this.zze = j;
            this.zzf = zzh2;
            this.zzg = z;
            this.zzd = false;
            zzw();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzhj zzhj) {
        this.zzh = zzhj;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Looper looper = myLooper;
        zzb();
        zzw();
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
    }

    public final synchronized void zzt(zzap zzap) {
        this.zzi = zzap;
    }

    public final void zzz() {
    }
}
