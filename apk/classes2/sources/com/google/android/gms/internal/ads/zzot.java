package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbcj;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzot implements zzmo {
    private final zzdj zza;
    private final zzbj zzb;
    private final zzbk zzc = new zzbk();
    private final zzos zzd;
    private final SparseArray zze;
    private zzdz zzf;
    private zzbh zzg;
    private zzdt zzh;
    private boolean zzi;

    public static /* synthetic */ void zzX(zzot zzot) {
        zzmp zzV = zzot.zzV();
        zzot.zzaa(zzV, 1028, new zzmt(zzV));
        zzot.zzf.zze();
    }

    private final zzmp zzac(int i, zzvh zzvh) {
        zzbh zzbh = this.zzg;
        zzbh.getClass();
        if (zzvh == null) {
            zzbl zzo = zzbh.zzo();
            if (i >= zzo.zzc()) {
                zzo = zzbl.zza;
            }
            return zzW(zzo, i, (zzvh) null);
        } else if (this.zzd.zza(zzvh) != null) {
            return zzab(zzvh);
        } else {
            return zzW(zzbl.zza, i, zzvh);
        }
    }

    private final zzmp zzad() {
        return zzab(this.zzd.zzd());
    }

    private final zzmp zzae() {
        return zzab(this.zzd.zze());
    }

    private final zzmp zzaf(zzba zzba) {
        zzvh zzvh;
        if (!(zzba instanceof zzin) || (zzvh = ((zzin) zzba).zzh) == null) {
            return zzV();
        }
        return zzab(zzvh);
    }

    public final void zzA(zzid zzid) {
        zzmp zzae = zzae();
        zzaa(zzae, 1007, new zzmu(zzae, zzid));
    }

    public final void zzB(zzz zzz, zzie zzie) {
        zzmp zzae = zzae();
        zzaa(zzae, 1009, new zzog(zzae, zzz, zzie));
    }

    public final void zzC(long j) {
        zzmp zzae = zzae();
        zzaa(zzae, 1010, new zzni(zzae, j));
    }

    public final void zzD(Exception exc) {
        zzmp zzae = zzae();
        zzaa(zzae, 1014, new zzoo(zzae, exc));
    }

    public final void zzE(zzqi zzqi) {
        zzmp zzae = zzae();
        zzaa(zzae, 1031, new zzoc(zzae, zzqi));
    }

    public final void zzF(zzqi zzqi) {
        zzmp zzae = zzae();
        zzaa(zzae, 1032, new zzon(zzae, zzqi));
    }

    public final void zzG(int i, long j, long j2) {
        zzmp zzae = zzae();
        zzaa(zzae, 1011, new zzne(zzae, i, j, j2));
    }

    public final void zzH(int i, long j) {
        zzmp zzad = zzad();
        zzaa(zzad, 1018, new zzno(zzad, i, j));
    }

    public final void zzI(Object obj, long j) {
        zzmp zzae = zzae();
        zzaa(zzae, 26, new zzok(zzae, obj, j));
    }

    public final void zzJ(int i, int i2, boolean z) {
        zzmp zzae = zzae();
        zzaa(zzae, 1033, new zznr(zzae, i, i2, z));
    }

    public final void zzK(Exception exc) {
        zzmp zzae = zzae();
        zzaa(zzae, 1030, new zznd(zzae, exc));
    }

    public final void zzL(String str, long j, long j2) {
        zzmp zzae = zzae();
        zzaa(zzae, 1016, new zzom(zzae, str, j2, j));
    }

    public final void zzM(String str) {
        zzmp zzae = zzae();
        zzaa(zzae, 1019, new zznn(zzae, str));
    }

    public final void zzN(zzid zzid) {
        zzmp zzad = zzad();
        zzaa(zzad, 1020, new zzoa(zzad, zzid));
    }

    public final void zzO(zzid zzid) {
        zzmp zzae = zzae();
        zzaa(zzae, 1015, new zzoi(zzae, zzid));
    }

    public final void zzP(long j, int i) {
        zzmp zzad = zzad();
        zzaa(zzad, 1021, new zznu(zzad, j, i));
    }

    public final void zzQ(zzz zzz, zzie zzie) {
        zzmp zzae = zzae();
        zzaa(zzae, 1017, new zzob(zzae, zzz, zzie));
    }

    public final void zzR() {
        zzdt zzdt = this.zzh;
        zzdd.zzb(zzdt);
        zzdt zzdt2 = zzdt;
        zzdt.zzi(new zzoj(this));
    }

    public final void zzS(zzmr zzmr) {
        this.zzf.zzf(zzmr);
    }

    public final void zzT(zzbh zzbh, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z = false;
        }
        zzdd.zzf(z);
        zzbh.getClass();
        zzbh zzbh2 = zzbh;
        this.zzg = zzbh;
        this.zzh = this.zza.zzd(looper, (Handler.Callback) null);
        this.zzf = this.zzf.zza(looper, new zzng(this, zzbh));
    }

    /* access modifiers changed from: protected */
    public final zzmp zzV() {
        return zzab(this.zzd.zzb());
    }

    /* access modifiers changed from: protected */
    @RequiresNonNull({"player"})
    public final zzmp zzW(zzbl zzbl, int i, zzvh zzvh) {
        zzbl zzbl2 = zzbl;
        int i2 = i;
        boolean z = true;
        zzvh zzvh2 = true == zzbl.zzo() ? null : zzvh;
        long zzb2 = this.zza.zzb();
        if (!zzbl2.equals(this.zzg.zzo()) || i2 != this.zzg.zze()) {
            z = false;
        }
        long j = 0;
        if (zzvh2 == null || !zzvh2.zzb()) {
            if (z) {
                j = this.zzg.zzk();
            } else if (!zzbl.zzo()) {
                long j2 = zzbl2.zze(i2, this.zzc, 0).zzl;
                j = zzex.zzv(0);
            }
        } else if (z && this.zzg.zzc() == zzvh2.zzb && this.zzg.zzd() == zzvh2.zzc) {
            j = this.zzg.zzl();
        }
        return new zzmp(zzb2, zzbl, i, zzvh2, j, this.zzg.zzo(), this.zzg.zze(), this.zzd.zzb(), this.zzg.zzl(), this.zzg.zzn());
    }

    public final void zzZ(int i, long j, long j2) {
        zzmp zzab = zzab(this.zzd.zzc());
        zzaa(zzab, 1006, new zznb(zzab, i, j, j2));
    }

    public final void zza(int i) {
        zzmp zzae = zzae();
        zzaa(zzae, 21, new zzod(zzae, i));
    }

    /* access modifiers changed from: protected */
    public final void zzaa(zzmp zzmp, int i, zzdw zzdw) {
        this.zze.put(i, zzmp);
        zzdz zzdz = this.zzf;
        zzdz.zzd(i, zzdw);
        zzdz.zzc();
    }

    public final void zzag(int i, zzvh zzvh, zzvd zzvd) {
        zzmp zzac = zzac(i, zzvh);
        zzaa(zzac, 1004, new zznt(zzac, zzvd));
    }

    public final void zzah(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd) {
        zzmp zzac = zzac(i, zzvh);
        zzaa(zzac, 1002, new zznv(zzac, zzuy, zzvd));
    }

    public final void zzai(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd) {
        zzmp zzac = zzac(i, zzvh);
        zzaa(zzac, 1001, new zznz(zzac, zzuy, zzvd));
    }

    public final void zzaj(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd, IOException iOException, boolean z) {
        zzmp zzac = zzac(i, zzvh);
        zzaa(zzac, 1003, new zznf(zzac, zzuy, zzvd, iOException, z));
    }

    public final void zzak(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd, int i2) {
        zzmp zzac = zzac(i, zzvh);
        zzaa(zzac, zzbcj.zzq.zzf, new zzor(zzac, zzuy, zzvd, i2));
    }

    public final void zzb(zzbd zzbd) {
        zzmp zzV = zzV();
        zzaa(zzV, 13, new zzmx(zzV, zzbd));
    }

    public final void zzc(boolean z) {
        zzmp zzV = zzV();
        zzaa(zzV, 3, new zzmv(zzV, z));
    }

    public final void zzd(boolean z) {
        zzmp zzV = zzV();
        zzaa(zzV, 7, new zznj(zzV, z));
    }

    public final void zze(zzap zzap, int i) {
        zzmp zzV = zzV();
        zzaa(zzV, 1, new zzmz(zzV, zzap, i));
    }

    public final void zzf(zzat zzat) {
        zzmp zzV = zzV();
        zzaa(zzV, 14, new zzop(zzV, zzat));
    }

    public final void zzg(boolean z, int i) {
        zzmp zzV = zzV();
        zzaa(zzV, 5, new zznq(zzV, z, i));
    }

    public final void zzh(zzbb zzbb) {
        zzmp zzV = zzV();
        zzaa(zzV, 12, new zzms(zzV, zzbb));
    }

    public final void zzi(int i) {
        zzmp zzV = zzV();
        zzaa(zzV, 4, new zzny(zzV, i));
    }

    public final void zzj(int i) {
        zzmp zzV = zzV();
        zzaa(zzV, 6, new zznm(zzV, i));
    }

    public final void zzk(zzba zzba) {
        zzmp zzaf = zzaf(zzba);
        zzaa(zzaf, 10, new zznw(zzaf, zzba));
    }

    public final void zzl(zzba zzba) {
        zzmp zzaf = zzaf(zzba);
        zzaa(zzaf, 10, new zznp(zzaf, zzba));
    }

    public final void zzm(boolean z, int i) {
        zzmp zzV = zzV();
        zzaa(zzV, -1, new zznh(zzV, z, i));
    }

    public final void zzo(boolean z) {
        zzmp zzae = zzae();
        zzaa(zzae, 23, new zzna(zzae, z));
    }

    public final void zzp(int i, int i2) {
        zzmp zzae = zzae();
        zzaa(zzae, 24, new zzoq(zzae, i, i2));
    }

    public final void zzr(zzbt zzbt) {
        zzmp zzV = zzV();
        zzaa(zzV, 2, new zznk(zzV, zzbt));
    }

    public final void zzs(zzcd zzcd) {
        zzmp zzae = zzae();
        zzaa(zzae, 25, new zzoe(zzae, zzcd));
    }

    public final void zzt(float f) {
        zzmp zzae = zzae();
        zzaa(zzae, 22, new zznc(zzae, f));
    }

    public final void zzu(zzmr zzmr) {
        this.zzf.zzb(zzmr);
    }

    public final void zzv() {
        if (!this.zzi) {
            zzmp zzV = zzV();
            this.zzi = true;
            zzaa(zzV, -1, new zzof(zzV));
        }
    }

    public final void zzw(Exception exc) {
        zzmp zzae = zzae();
        zzaa(zzae, 1029, new zzol(zzae, exc));
    }

    public final void zzx(String str, long j, long j2) {
        zzmp zzae = zzae();
        zzaa(zzae, 1008, new zznl(zzae, str, j2, j));
    }

    public final void zzy(String str) {
        zzmp zzae = zzae();
        zzaa(zzae, 1012, new zzmw(zzae, str));
    }

    public final void zzz(zzid zzid) {
        zzmp zzad = zzad();
        zzaa(zzad, 1013, new zznx(zzad, zzid));
    }

    private final zzmp zzab(zzvh zzvh) {
        this.zzg.getClass();
        zzbl zza2 = zzvh == null ? null : this.zzd.zza(zzvh);
        if (zzvh == null || zza2 == null) {
            int zze2 = this.zzg.zze();
            zzbl zzo = this.zzg.zzo();
            if (zze2 >= zzo.zzc()) {
                zzo = zzbl.zza;
            }
            return zzW(zzo, zze2, (zzvh) null);
        }
        return zzW(zza2, zza2.zzn(zzvh.zza, this.zzb).zzc, zzvh);
    }

    public final void zzU(List list, zzvh zzvh) {
        zzbh zzbh = this.zzg;
        zzbh.getClass();
        zzbh zzbh2 = zzbh;
        this.zzd.zzh(list, zzvh, zzbh);
    }

    public final void zzn(zzbf zzbf, zzbf zzbf2, int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzos zzos = this.zzd;
        zzbh zzbh = this.zzg;
        zzbh.getClass();
        zzbh zzbh2 = zzbh;
        zzos.zzg(zzbh);
        zzmp zzV = zzV();
        zzaa(zzV, 11, new zzoh(zzV, i, zzbf, zzbf2));
    }

    public final void zzq(zzbl zzbl, int i) {
        zzbh zzbh = this.zzg;
        zzbh.getClass();
        zzbh zzbh2 = zzbh;
        this.zzd.zzi(zzbh);
        zzmp zzV = zzV();
        zzaa(zzV, 0, new zzmy(zzV, i));
    }

    public zzot(zzdj zzdj) {
        zzdj.getClass();
        zzdj zzdj2 = zzdj;
        this.zza = zzdj;
        this.zzf = new zzdz(zzex.zzz(), zzdj, new zzns());
        zzbj zzbj = new zzbj();
        this.zzb = zzbj;
        this.zzd = new zzos(zzbj);
        this.zze = new SparseArray();
    }
}
