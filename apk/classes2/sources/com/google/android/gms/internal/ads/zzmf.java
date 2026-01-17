package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzmf {
    private final zzma zza;
    private final int zzb;
    private final zzma zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzmf(zzma zzma, zzma zzma2, int i) {
        this.zza = zzma;
        this.zzb = i;
        this.zzc = zzma2;
    }

    private final int zzM(zzma zzma, zzlc zzlc, zzze zzze, zzil zzil) throws zzin {
        zzma zzma2 = zzma;
        zzlc zzlc2 = zzlc;
        zzze zzze2 = zzze;
        if (zzma2 != null && zzU(zzma)) {
            zzma zzma3 = this.zza;
            boolean z = zzma2 != zzma3;
            if ((zzma2 != zzma3 || !zzT()) && (zzma2 != this.zzc || !zzV())) {
                zzwz zzq = zzma.zzq();
                zzwz[] zzwzArr = zzlc2.zzc;
                int i = this.zzb;
                zzwz zzwz = zzwzArr[i];
                boolean zzb2 = zzze.zzb(i);
                if (zzb2 && zzq == zzwz) {
                    return 1;
                }
                if (!zzma.zzS()) {
                    zzz[] zzW = zzW(zzze2.zzc[i]);
                    zzwz zzwz2 = zzwzArr[i];
                    zzwz2.getClass();
                    zzwz zzwz3 = zzwz2;
                    zzma.zzI(zzW, zzwz2, zzlc.zzf(), zzlc.zze(), zzlc2.zzg.zza);
                    return 3;
                } else if (!zzma.zzX()) {
                    return 0;
                } else {
                    zzO(zzma, zzil);
                    if (!zzb2 || zzI()) {
                        zzQ(!z);
                    }
                    return 1;
                }
            }
        }
        return 1;
    }

    private final zzma zzN(zzlc zzlc) {
        if (zzlc != null) {
            int i = this.zzb;
            zzwz[] zzwzArr = zzlc.zzc;
            if (zzwzArr[i] != null) {
                zzma zzma = this.zza;
                zzwz zzq = zzma.zzq();
                zzwz zzwz = zzwzArr[i];
                if (zzq == zzwz) {
                    return zzma;
                }
                zzma zzma2 = this.zzc;
                if (zzma2 == null || zzma2.zzq() != zzwz) {
                    return null;
                }
                return zzma2;
            }
        }
        return null;
    }

    private final void zzO(zzma zzma, zzil zzil) {
        boolean z = true;
        if (!(this.zza == zzma || this.zzc == zzma)) {
            z = false;
        }
        zzdd.zzf(z);
        if (zzU(zzma)) {
            zzil.zzd(zzma);
            zzX(zzma);
            zzma.zzs();
        }
    }

    private final void zzP(zzma zzma, zzwz zzwz, zzil zzil, long j, boolean z) throws zzin {
        if (!zzU(zzma)) {
            return;
        }
        if (zzwz != zzma.zzq()) {
            zzO(zzma, zzil);
        } else if (z) {
            zzma.zzK(j);
        }
    }

    private final void zzQ(boolean z) {
        if (z) {
            if (this.zze) {
                this.zza.zzJ();
                this.zze = false;
            }
        } else if (this.zzf) {
            zzma zzma = this.zzc;
            zzma.getClass();
            zzma zzma2 = zzma;
            zzma.zzJ();
            this.zzf = false;
        }
    }

    private final boolean zzS(zzlc zzlc, zzma zzma) {
        if (zzma == null) {
            return true;
        }
        zzwz[] zzwzArr = zzlc.zzc;
        int i = this.zzb;
        zzwz zzwz = zzwzArr[i];
        if (zzma.zzq() != null) {
            if (zzma.zzq() == zzwz) {
                if (zzwz != null && !zzma.zzR()) {
                    zzlc.zzg();
                    boolean z = zzlc.zzg.zzg;
                }
            }
            zzlc zzg = zzlc.zzg();
            if (zzg == null || zzg.zzc[i] != zzma.zzq()) {
                return false;
            }
            return true;
        }
        return true;
    }

    private final boolean zzT() {
        int i = this.zzd;
        return i == 2 || i == 4;
    }

    private static boolean zzU(zzma zzma) {
        return zzma.zzcU() != 0;
    }

    private final boolean zzV() {
        return this.zzd == 3;
    }

    private static zzz[] zzW(zzyw zzyw) {
        int zzh = zzyw != null ? zzyw.zzh() : 0;
        zzz[] zzzArr = new zzz[zzh];
        for (int i = 0; i < zzh; i++) {
            zzyw.getClass();
            zzyw zzyw2 = zzyw;
            zzzArr[i] = zzyw.zza(i);
        }
        return zzzArr;
    }

    private static final void zzX(zzma zzma) {
        if (zzma.zzcU() == 2) {
            zzma.zzQ();
        }
    }

    private static final void zzY(zzma zzma, long j) {
        zzma.zzL();
        if (zzma instanceof zzxo) {
            zzxo zzxo = (zzxo) zzma;
            throw null;
        }
    }

    public final void zzA() throws zzin {
        zzma zzma = this.zza;
        if (zzma.zzcU() != 1 || this.zzd == 4) {
            zzma zzma2 = this.zzc;
            if (zzma2 != null && zzma2.zzcU() == 1 && this.zzd != 3) {
                zzma2.zzP();
                return;
            }
            return;
        }
        zzma.zzP();
    }

    public final void zzB() {
        int i;
        zzdd.zzf(!zzI());
        if (zzU(this.zza)) {
            i = 3;
        } else {
            zzma zzma = this.zzc;
            i = (zzma == null || !zzU(zzma)) ? 2 : 4;
        }
        this.zzd = i;
    }

    public final void zzC() {
        zzma zzma = this.zza;
        if (zzU(zzma)) {
            zzX(zzma);
        }
        zzma zzma2 = this.zzc;
        if (zzma2 != null && zzU(zzma2)) {
            zzX(zzma2);
        }
    }

    public final boolean zzD(zzlc zzlc) {
        zzma zzN = zzN(zzlc);
        return zzN == null || zzN.zzR() || zzN.zzY() || zzN.zzX();
    }

    public final boolean zzE(zzlc zzlc) {
        return zzS(zzlc, this.zza) && zzS(zzlc, this.zzc);
    }

    public final boolean zzF(zzlc zzlc) {
        zzma zzN = zzN(zzlc);
        zzN.getClass();
        zzma zzma = zzN;
        return zzN.zzR();
    }

    public final boolean zzG() {
        return this.zzc != null;
    }

    public final boolean zzH() {
        zzma zzma = this.zza;
        boolean zzX = zzU(zzma) ? zzma.zzX() : true;
        zzma zzma2 = this.zzc;
        return (zzma2 == null || !zzU(zzma2)) ? zzX : zzX & zzma2.zzX();
    }

    public final boolean zzI() {
        return zzT() || zzV();
    }

    public final boolean zzJ(zzlc zzlc) {
        return (zzT() && zzN(zzlc) == this.zza) || (zzV() && zzN(zzlc) == this.zzc);
    }

    public final boolean zzK(zzlc zzlc) {
        return zzN(zzlc) != null;
    }

    public final boolean zzL() {
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            return zzU(this.zza);
        }
        zzma zzma = this.zzc;
        zzma.getClass();
        zzma zzma2 = zzma;
        return zzU(zzma);
    }

    public final int zza() {
        zzma zzma = this.zzc;
        boolean zzU = zzU(this.zza);
        boolean z = false;
        if (zzma != null && zzU(zzma)) {
            z = true;
        }
        return (zzU ? 1 : 0) + (z ? 1 : 0);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final int zzc(zzlc zzlc, zzze zzze, zzil zzil) throws zzin {
        int zzM = zzM(this.zza, zzlc, zzze, zzil);
        return zzM == 1 ? zzM(this.zzc, zzlc, zzze, zzil) : zzM;
    }

    public final long zzd(long j, long j2) {
        zzma zzma = this.zza;
        long zzf2 = zzU(zzma) ? zzma.zzf(j, j2) : LongCompanionObject.MAX_VALUE;
        zzma zzma2 = this.zzc;
        return (zzma2 == null || !zzU(zzma2)) ? zzf2 : Math.min(zzf2, zzma2.zzf(j, j2));
    }

    public final long zze(zzlc zzlc) {
        return ((zzma) Objects.requireNonNull(zzN(zzlc))).zzh();
    }

    public final void zzf(zzil zzil) throws zzin {
        zzO(this.zza, zzil);
        zzma zzma = this.zzc;
        if (zzma != null) {
            boolean z = zzU(zzma) && this.zzd != 3;
            zzO(zzma, zzil);
            zzQ(false);
            if (z) {
                zzR(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzh(zzme zzme, zzyw zzyw, zzwz zzwz, long j, boolean z, boolean z2, long j2, long j3, zzvh zzvh, zzil zzil) throws zzin {
        zzil zzil2 = zzil;
        zzz[] zzW = zzW(zzyw);
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            this.zze = true;
            zzma zzma = this.zza;
            zzma.zzt(zzme, zzW, zzwz, j, z, z2, j2, j3, zzvh);
            zzil2.zze(zzma);
            return;
        }
        this.zzf = true;
        zzma zzma2 = this.zzc;
        zzma2.getClass();
        zzma zzma3 = zzma2;
        zzma2.zzt(zzme, zzW, zzwz, j, z, z2, j2, j3, zzvh);
        zzil2.zze(zzma2);
    }

    public final void zzi() {
        zzma zzma = this.zza;
        if (zzU(zzma)) {
            zzma.zzu();
            return;
        }
        zzma zzma2 = this.zzc;
        if (zzma2 != null && zzU(zzma2)) {
            zzma2.zzu();
        }
    }

    public final void zzj(int i, Object obj, zzlc zzlc) throws zzin {
        zzma zzN = zzN(zzlc);
        zzN.getClass();
        zzma zzma = zzN;
        zzN.zzv(11, obj);
    }

    public final void zzk(zzwz zzwz, zzil zzil, long j, boolean z) throws zzin {
        zzP(this.zza, zzwz, zzil, j, z);
        zzma zzma = this.zzc;
        if (zzma != null) {
            zzP(zzma, zzwz, zzil, j, z);
        }
    }

    public final void zzl() throws zzin {
        int i = this.zzd;
        int i2 = 0;
        if (i == 3 || i == 4) {
            zzR(i == 4);
            if (this.zzd != 4) {
                i2 = 1;
            }
            this.zzd = i2;
        } else if (i == 2) {
            this.zzd = 0;
        }
    }

    public final void zzm(zzze zzze, zzze zzze2, long j) {
        int i;
        int i2 = this.zzb;
        boolean zzb2 = zzze.zzb(i2);
        boolean zzb3 = zzze2.zzb(i2);
        zzma zzma = this.zzc;
        if (zzma == null || (i = this.zzd) == 3 || (i == 0 && zzU(this.zza))) {
            zzma = this.zza;
        } else {
            zzma zzma2 = zzma;
        }
        if (zzb2 && !zzma.zzS()) {
            zzb();
            zzme zzme = zzze.zzb[i2];
            zzme zzme2 = zzze2.zzb[i2];
            if (!zzb3 || !Objects.equals(zzme2, zzme) || zzI()) {
                zzY(zzma, j);
            }
        }
    }

    public final void zzn(zzlc zzlc) throws IOException {
        zzma zzN = zzN(zzlc);
        zzN.getClass();
        zzma zzma = zzN;
        zzN.zzx();
    }

    public final void zzo() {
        this.zza.zzH();
        this.zze = false;
        zzma zzma = this.zzc;
        if (zzma != null) {
            zzma.zzH();
            this.zzf = false;
        }
    }

    public final void zzp(long j, long j2) throws zzin {
        zzma zzma = this.zza;
        if (zzU(zzma)) {
            zzma.zzW(j, j2);
        }
        zzma zzma2 = this.zzc;
        if (zzma2 != null && zzU(zzma2)) {
            zzma2.zzW(j, j2);
        }
    }

    public final void zzq() {
        if (!zzU(this.zza)) {
            zzQ(true);
        }
        zzma zzma = this.zzc;
        if (zzma != null && !zzU(zzma)) {
            zzQ(false);
        }
    }

    public final void zzr(zzlc zzlc, long j) throws zzin {
        zzma zzN = zzN(zzlc);
        if (zzN != null) {
            zzN.zzK(j);
        }
    }

    public final void zzs(long j) {
        int i;
        zzma zzma = this.zza;
        if (!(!zzU(zzma) || (i = this.zzd) == 4 || i == 2)) {
            zzY(zzma, j);
        }
        zzma zzma2 = this.zzc;
        if (zzma2 != null && zzU(zzma2) && this.zzd != 3) {
            zzY(zzma2, j);
        }
    }

    public final void zzt(zzlc zzlc, long j) {
        zzma zzN = zzN(zzlc);
        zzN.getClass();
        zzma zzma = zzN;
        zzY(zzN, j);
    }

    public final void zzu(float f, float f2) throws zzin {
        this.zza.zzN(f, f2);
        zzma zzma = this.zzc;
        if (zzma != null) {
            zzma.zzN(f, f2);
        }
    }

    public final void zzv(zzmh zzmh) throws zzin {
        this.zza.zzv(18, zzmh);
        zzma zzma = this.zzc;
        if (zzma != null) {
            zzma.zzv(18, zzmh);
        }
    }

    public final void zzw(zzbl zzbl) {
        this.zza.zzO(zzbl);
        zzma zzma = this.zzc;
        if (zzma != null) {
            zzma.zzO(zzbl);
        }
    }

    public final void zzx(zzabp zzabp) throws zzin {
        if (zzb() == 2) {
            this.zza.zzv(7, zzabp);
            zzma zzma = this.zzc;
            if (zzma != null) {
                zzma.zzv(7, zzabp);
            }
        }
    }

    public final void zzy(Object obj) throws zzin {
        if (zzb() == 2) {
            int i = this.zzd;
            if (i == 4 || i == 1) {
                zzma zzma = this.zzc;
                zzma.getClass();
                zzma zzma2 = zzma;
                zzma.zzv(1, obj);
                return;
            }
            this.zza.zzv(1, obj);
        }
    }

    public final void zzz(float f) throws zzin {
        if (zzb() == 1) {
            zzma zzma = this.zza;
            Float valueOf = Float.valueOf(f);
            zzma.zzv(2, valueOf);
            zzma zzma2 = this.zzc;
            if (zzma2 != null) {
                zzma2.zzv(2, valueOf);
            }
        }
    }

    private final void zzR(boolean z) throws zzin {
        if (z) {
            zzma zzma = this.zzc;
            zzma.getClass();
            zzma zzma2 = zzma;
            zzma.zzv(17, this.zza);
            return;
        }
        zzma zzma3 = this.zza;
        zzma zzma4 = this.zzc;
        zzma4.getClass();
        zzma3.zzv(17, zzma4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(com.google.android.gms.internal.ads.zzil r8) {
        /*
            r7 = this;
            boolean r0 = r7.zzI()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r7.zzd
            r1 = 0
            r2 = 4
            r3 = 1
            if (r0 == r2) goto L_0x0015
            r4 = 2
            if (r0 != r4) goto L_0x0013
            r0 = r4
            goto L_0x0015
        L_0x0013:
            r4 = r1
            goto L_0x0016
        L_0x0015:
            r4 = r3
        L_0x0016:
            if (r4 == 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzma r5 = r7.zza
            goto L_0x0023
        L_0x001b:
            com.google.android.gms.internal.ads.zzma r5 = r7.zzc
            r5.getClass()
            r6 = r5
            com.google.android.gms.internal.ads.zzma r6 = (com.google.android.gms.internal.ads.zzma) r6
        L_0x0023:
            r7.zzO(r5, r8)
            r7.zzQ(r4)
            if (r0 != r2) goto L_0x002c
            r1 = r3
        L_0x002c:
            r7.zzd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmf.zzg(com.google.android.gms.internal.ads.zzil):void");
    }
}
