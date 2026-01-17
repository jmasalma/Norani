package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzic implements zzma, zzmd {
    private final Object zza = new Object();
    private final int zzb;
    private final zzkv zzc;
    private zzme zzd;
    private int zze;
    private zzph zzf;
    private zzdj zzg;
    private int zzh;
    private zzwz zzi;
    private zzz[] zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private zzbl zzp;
    private zzvh zzq;
    private zzmc zzr;

    public zzic(int i) {
        this.zzb = i;
        this.zzc = new zzkv();
        this.zzm = Long.MIN_VALUE;
        this.zzp = zzbl.zza;
    }

    private final void zzaa(long j, boolean z) throws zzin {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzA(j, z);
    }

    /* access modifiers changed from: protected */
    public void zzA(long j, boolean z) throws zzin {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzB() {
    }

    /* access modifiers changed from: protected */
    public final void zzC() {
        zzmc zzmc;
        synchronized (this.zza) {
            zzmc = this.zzr;
        }
        if (zzmc != null) {
            zzmc.zza(this);
        }
    }

    /* access modifiers changed from: protected */
    public void zzD() {
    }

    /* access modifiers changed from: protected */
    public void zzE() throws zzin {
    }

    /* access modifiers changed from: protected */
    public void zzF() {
    }

    /* access modifiers changed from: protected */
    public void zzG(zzz[] zzzArr, long j, long j2, zzvh zzvh) throws zzin {
    }

    public final void zzH() {
        zzdd.zzf(this.zzh == 0);
        zzB();
    }

    public final void zzI(zzz[] zzzArr, zzwz zzwz, long j, long j2, zzvh zzvh) throws zzin {
        zzdd.zzf(!this.zzn);
        this.zzi = zzwz;
        this.zzq = zzvh;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzzArr;
        this.zzk = j2;
        zzG(zzzArr, j, j2, zzvh);
    }

    public final void zzJ() {
        zzdd.zzf(this.zzh == 0);
        zzkv zzkv = this.zzc;
        zzkv.zzb = null;
        zzkv.zza = null;
        zzD();
    }

    public final void zzK(long j) throws zzin {
        zzaa(j, false);
    }

    public final void zzL() {
        this.zzn = true;
    }

    public final void zzM(zzmc zzmc) {
        synchronized (this.zza) {
            this.zzr = zzmc;
        }
    }

    public /* synthetic */ void zzN(float f, float f2) {
    }

    public final void zzO(zzbl zzbl) {
        if (!Objects.equals(this.zzp, zzbl)) {
            this.zzp = zzbl;
        }
    }

    public final void zzP() throws zzin {
        boolean z = true;
        if (this.zzh != 1) {
            z = false;
        }
        zzdd.zzf(z);
        this.zzh = 2;
        zzE();
    }

    public final void zzQ() {
        zzdd.zzf(this.zzh == 2);
        this.zzh = 1;
        zzF();
    }

    public final boolean zzR() {
        return this.zzm == Long.MIN_VALUE;
    }

    public final boolean zzS() {
        return this.zzn;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzcU() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final int zzcV(zzkv zzkv, zzhs zzhs, int i) {
        zzwz zzwz = this.zzi;
        zzwz.getClass();
        zzwz zzwz2 = zzwz;
        int zza2 = zzwz.zza(zzkv, zzhs, i);
        if (zza2 == -4) {
            if (zzhs.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzhs.zze + this.zzk;
            zzhs.zze = j;
            this.zzm = Math.max(this.zzm, j);
        } else if (zza2 == -5) {
            zzz zzz = zzkv.zza;
            zzz.getClass();
            zzz zzz2 = zzz;
            long j2 = zzz.zzt;
            if (j2 != LongCompanionObject.MAX_VALUE) {
                zzx zzb2 = zzz.zzb();
                zzb2.zzal(j2 + this.zzk);
                zzkv.zza = zzb2.zzan();
                return -5;
            }
        }
        return zza2;
    }

    /* access modifiers changed from: protected */
    public final long zzcW() {
        return this.zzl;
    }

    public int zze() throws zzin {
        return 0;
    }

    public /* synthetic */ long zzf(long j, long j2) {
        return 10000;
    }

    public final long zzh() {
        return this.zzm;
    }

    /* access modifiers changed from: protected */
    public final zzbl zzi() {
        return this.zzp;
    }

    /* access modifiers changed from: protected */
    public final zzin zzk(Throwable th, zzz zzz, boolean z, int i) {
        int i2 = 4;
        if (zzz != null && !this.zzo) {
            this.zzo = true;
            try {
                i2 = zzZ(zzz) & 7;
            } catch (zzin unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzin.zzb(th, zzV(), this.zze, zzz, i2, this.zzq, z, i);
    }

    /* access modifiers changed from: protected */
    public final zzkv zzl() {
        zzkv zzkv = this.zzc;
        zzkv.zzb = null;
        zzkv.zza = null;
        return zzkv;
    }

    public zzlb zzm() {
        return null;
    }

    public final zzmd zzn() {
        return this;
    }

    public final zzwz zzq() {
        return this.zzi;
    }

    public final void zzr() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    public final void zzs() {
        boolean z = true;
        if (this.zzh != 1) {
            z = false;
        }
        zzdd.zzf(z);
        zzkv zzkv = this.zzc;
        zzkv.zzb = null;
        zzkv.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzy();
        this.zzq = null;
    }

    public final void zzt(zzme zzme, zzz[] zzzArr, zzwz zzwz, long j, boolean z, boolean z2, long j2, long j3, zzvh zzvh) throws zzin {
        boolean z3 = z;
        zzdd.zzf(this.zzh == 0);
        this.zzd = zzme;
        zzvh zzvh2 = zzvh;
        this.zzq = zzvh2;
        this.zzh = 1;
        zzz(z3, z2);
        zzI(zzzArr, zzwz, j2, j3, zzvh2);
        zzaa(j2, z3);
    }

    public /* synthetic */ void zzu() {
    }

    public void zzv(int i, Object obj) throws zzin {
    }

    public final void zzw(int i, zzph zzph, zzdj zzdj) {
        this.zze = i;
        this.zzf = zzph;
        this.zzg = zzdj;
    }

    /* access modifiers changed from: protected */
    public void zzy() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzz(boolean z, boolean z2) throws zzin {
    }

    /* access modifiers changed from: protected */
    public final boolean zzT() {
        if (zzR()) {
            return this.zzn;
        }
        zzwz zzwz = this.zzi;
        zzwz.getClass();
        zzwz zzwz2 = zzwz;
        return zzwz.zze();
    }

    /* access modifiers changed from: protected */
    public final zzz[] zzU() {
        zzz[] zzzArr = this.zzj;
        zzzArr.getClass();
        return zzzArr;
    }

    /* access modifiers changed from: protected */
    public final zzdj zzcX() {
        zzdj zzdj = this.zzg;
        zzdj.getClass();
        zzdj zzdj2 = zzdj;
        return zzdj;
    }

    /* access modifiers changed from: protected */
    public final int zzd(long j) {
        zzwz zzwz = this.zzi;
        zzwz.getClass();
        zzwz zzwz2 = zzwz;
        return zzwz.zzb(j - this.zzk);
    }

    /* access modifiers changed from: protected */
    public final zzme zzo() {
        zzme zzme = this.zzd;
        zzme.getClass();
        zzme zzme2 = zzme;
        return zzme;
    }

    /* access modifiers changed from: protected */
    public final zzph zzp() {
        zzph zzph = this.zzf;
        zzph.getClass();
        zzph zzph2 = zzph;
        return zzph;
    }

    public final void zzx() throws IOException {
        zzwz zzwz = this.zzi;
        zzwz.getClass();
        zzwz zzwz2 = zzwz;
        zzwz.zzd();
    }
}
