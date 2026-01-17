package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzlf {
    private final zzbj zza = new zzbj();
    private final zzbk zzb = new zzbk();
    private final zzmo zzc;
    private final zzdt zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzix zzh;
    private zzlc zzi;
    private zzlc zzj;
    private zzlc zzk;
    private zzlc zzl;
    private zzlc zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private List zzq = new ArrayList();
    private final zzkk zzr;

    public zzlf(zzmo zzmo, zzdt zzdt, zzkk zzkk, zzix zzix) {
        this.zzc = zzmo;
        this.zzd = zzdt;
        this.zzr = zzkk;
        this.zzh = zzix;
    }

    private final int zzA(zzbl zzbl) {
        zzlc zzlc = this.zzi;
        if (zzlc == null) {
            return 0;
        }
        int zza2 = zzbl.zza(zzlc.zzb);
        while (true) {
            zza2 = zzbl.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlc.getClass();
                zzlc zzlc2 = zzlc;
                if (zzlc.zzg() == null || zzlc.zzg.zzh) {
                    zzlc zzg2 = zzlc.zzg();
                } else {
                    zzlc = zzlc.zzg();
                }
            }
            zzlc zzg22 = zzlc.zzg();
            if (zza2 == -1 || zzg22 == null || zzbl.zza(zzg22.zzb) != zza2) {
                int zza3 = zza(zzlc);
                zzlc.zzg = zzp(zzbl, zzlc.zzg);
            } else {
                zzlc = zzg22;
            }
        }
        int zza32 = zza(zzlc);
        zzlc.zzg = zzp(zzbl, zzlc.zzg);
        return zza32;
    }

    private final long zzB(zzbl zzbl, Object obj, int i) {
        zzbj zzbj = this.zza;
        zzbl.zzn(obj, zzbj);
        zzbj.zzg(i);
        long j = zzbj.zzg.zza(i).zzh;
        return 0;
    }

    private final long zzC(Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzlc zzlc = (zzlc) this.zzq.get(i);
            if (zzlc.zzb.equals(obj)) {
                return zzlc.zzg.zza.zzd;
            }
        }
        return -1;
    }

    private final zzld zzD(zzbl zzbl, zzlc zzlc, long j) {
        int i;
        Object obj;
        long j2;
        long j3;
        long j4;
        zzbl zzbl2 = zzbl;
        zzld zzld = zzlc.zzg;
        long zze2 = zzlc.zze();
        long j5 = zzld.zze;
        long j6 = (zze2 + j5) - j;
        if (zzld.zzh) {
            zzvh zzvh = zzld.zza;
            Object obj2 = zzvh.zza;
            int zza2 = zzbl2.zza(obj2);
            int i2 = this.zzf;
            boolean z = this.zzg;
            zzbk zzbk = this.zzb;
            zzbj zzbj = this.zza;
            Object obj3 = obj2;
            int zzi2 = zzbl.zzi(zza2, zzbj, zzbk, i2, z);
            if (zzi2 != -1) {
                int i3 = zzbl2.zzd(zzi2, zzbj, true).zzc;
                Object obj4 = zzbj.zzb;
                obj4.getClass();
                long j7 = zzvh.zzd;
                if (zzbl2.zze(i3, zzbk, 0).zzn == zzi2) {
                    Pair zzm2 = zzbl.zzm(zzbk, zzbj, i3, -9223372036854775807L, Math.max(0, j6));
                    if (zzm2 != null) {
                        obj4 = zzm2.first;
                        long longValue = ((Long) zzm2.second).longValue();
                        zzlc zzg2 = zzlc.zzg();
                        if (zzg2 == null || !zzg2.zzb.equals(obj4)) {
                            j7 = zzC(obj4);
                            if (j7 == -1) {
                                j7 = this.zze;
                                this.zze = 1 + j7;
                            }
                        } else {
                            j7 = zzg2.zzg.zza.zzd;
                        }
                        j3 = longValue;
                        j4 = -9223372036854775807L;
                    }
                } else {
                    j4 = 0;
                    j3 = 0;
                }
                zzvh zzH = zzH(zzbl, obj4, j3, j7, zzbk, zzbj);
                if (!(j4 == -9223372036854775807L || zzld.zzc == -9223372036854775807L)) {
                    zzbl2.zzn(obj3, zzbj).zzb();
                    int i4 = zzbj.zzg.zzd;
                }
                return zzE(zzbl, zzH, j4, j3);
            }
        } else {
            zzvh zzvh2 = zzld.zza;
            Object obj5 = zzvh2.zza;
            zzbj zzbj2 = this.zza;
            zzbl2.zzn(obj5, zzbj2);
            boolean z2 = zzld.zzg;
            if (zzvh2.zzb()) {
                int i5 = zzvh2.zzb;
                if (zzbj2.zza(i5) != -1) {
                    int zza3 = zzbj2.zzg.zza(i5).zza(zzvh2.zzc);
                    if (zza3 < 0) {
                        return zzF(zzbl, obj5, i5, zza3, zzld.zzc, zzvh2.zzd, false);
                    }
                    long j8 = zzld.zzc;
                    if (j8 == -9223372036854775807L) {
                        obj = obj5;
                        i = i5;
                        Pair zzm3 = zzbl.zzm(this.zzb, zzbj2, zzbj2.zzc, -9223372036854775807L, Math.max(0, j6));
                        if (zzm3 != null) {
                            j8 = ((Long) zzm3.second).longValue();
                            j2 = -9223372036854775807L;
                        }
                    } else {
                        obj = obj5;
                        i = i5;
                        j2 = j8;
                    }
                    zzB(zzbl2, obj, i);
                    return zzG(zzbl, obj, Math.max(0, j8), j2, zzvh2.zzd, false);
                }
            } else {
                Object obj6 = obj5;
                int i6 = zzvh2.zze;
                if (i6 != -1) {
                    zzbj2.zzj(i6);
                }
                int zze3 = zzbj2.zze(i6);
                zzbj2.zzk(i6);
                if (zze3 != zzbj2.zza(i6)) {
                    return zzF(zzbl, obj6, i6, zze3, j5, zzvh2.zzd, false);
                }
                zzB(zzbl2, obj6, i6);
                return zzG(zzbl, obj6, 0, j5, zzvh2.zzd, false);
            }
        }
        return null;
    }

    private final zzld zzE(zzbl zzbl, zzvh zzvh, long j, long j2) {
        zzvh zzvh2 = zzvh;
        Object obj = zzvh2.zza;
        zzbl zzbl2 = zzbl;
        zzbl.zzn(obj, this.zza);
        if (zzvh.zzb()) {
            return zzF(zzbl, obj, zzvh2.zzb, zzvh2.zzc, j, zzvh2.zzd, false);
        }
        return zzG(zzbl, obj, j2, j, zzvh2.zzd, false);
    }

    private final zzld zzF(zzbl zzbl, Object obj, int i, int i2, long j, long j2, boolean z) {
        zzvh zzvh = new zzvh(obj, i, i2, j2);
        Object obj2 = zzvh.zza;
        int i3 = zzvh.zzb;
        int i4 = zzvh.zzc;
        zzbj zzbj = this.zza;
        long zzf2 = zzbl.zzn(obj2, zzbj).zzf(i3, i4);
        if (i2 == zzbj.zze(i)) {
            zzbj.zzh();
        }
        zzbj.zzk(i3);
        return new zzld(zzvh, (zzf2 == -9223372036854775807L || zzf2 > 0) ? 0 : Math.max(0, -1 + zzf2), j, -9223372036854775807L, zzf2, false, false, false, false, false);
    }

    private final zzld zzG(zzbl zzbl, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        long j5;
        long j6;
        zzbl zzbl2 = zzbl;
        Object obj2 = obj;
        long j7 = j;
        zzbj zzbj = this.zza;
        zzbl2.zzn(obj2, zzbj);
        int zzc2 = zzbj.zzc(j7);
        if (zzc2 == -1) {
            zzbj.zzb();
        } else {
            zzbj.zzk(zzc2);
        }
        zzvh zzvh = new zzvh(obj2, j3, zzc2);
        boolean zzL = zzL(zzvh);
        boolean zzK = zzK(zzbl2, zzvh);
        boolean zzJ = zzJ(zzbl2, zzvh, zzL);
        if (zzc2 != -1) {
            zzbj.zzk(zzc2);
        }
        if (zzc2 != -1) {
            zzbj.zzj(zzc2);
        }
        if (zzc2 != -1) {
            zzbj.zzg(zzc2);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = zzbj.zzd;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0, j5 - 1);
        }
        return new zzld(zzvh, j7, j2, j6, j5, false, false, zzL, zzK, zzJ);
    }

    private static zzvh zzH(zzbl zzbl, Object obj, long j, long j2, zzbk zzbk, zzbj zzbj) {
        zzbl zzbl2 = zzbl;
        Object obj2 = obj;
        long j3 = j;
        zzbj zzbj2 = zzbj;
        zzbl.zzn(obj, zzbj2);
        zzbk zzbk2 = zzbk;
        zzbl.zze(zzbj2.zzc, zzbk, 0);
        zzbl.zza(obj);
        zzbj.zzb();
        zzbl.zzn(obj, zzbj2);
        int zzd2 = zzbj2.zzd(j);
        if (zzd2 == -1) {
            long j4 = j2;
            return new zzvh(obj, j2, zzbj2.zzc(j));
        }
        long j5 = j2;
        return new zzvh(obj, zzd2, zzbj2.zze(zzd2), j2);
    }

    private final void zzI() {
        zzvh zzvh;
        int i = zzfyq.zzd;
        zzfyn zzfyn = new zzfyn();
        for (zzlc zzlc = this.zzi; zzlc != null; zzlc = zzlc.zzg()) {
            zzfyn.zzf(zzlc.zzg.zza);
        }
        zzlc zzlc2 = this.zzj;
        if (zzlc2 == null) {
            zzvh = null;
        } else {
            zzvh = zzlc2.zzg.zza;
        }
        this.zzd.zzi(new zzle(this, zzfyn, zzvh));
    }

    private final boolean zzJ(zzbl zzbl, zzvh zzvh, boolean z) {
        int zza2 = zzbl.zza(zzvh.zza);
        zzbj zzbj = this.zza;
        int i = zzbl.zzd(zza2, zzbj, false).zzc;
        zzbk zzbk = this.zzb;
        if (!zzbl.zze(i, zzbk, 0).zzi) {
            if (zzbl.zzi(zza2, zzbj, zzbk, this.zzf, this.zzg) != -1 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean zzK(zzbl zzbl, zzvh zzvh) {
        if (!zzL(zzvh)) {
            return false;
        }
        Object obj = zzvh.zza;
        int i = zzbl.zzn(obj, this.zza).zzc;
        if (zzbl.zze(i, this.zzb, 0).zzo == zzbl.zza(obj)) {
            return true;
        }
        return false;
    }

    private static final boolean zzL(zzvh zzvh) {
        return !zzvh.zzb() && zzvh.zze == -1;
    }

    public final int zza(zzlc zzlc) {
        zzdd.zzb(zzlc);
        int i = 0;
        if (zzlc.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlc;
        while (zzlc.zzg() != null) {
            zzlc = zzlc.zzg();
            zzlc.getClass();
            zzlc zzlc2 = zzlc;
            if (zzlc == this.zzj) {
                zzlc zzlc3 = this.zzi;
                this.zzj = zzlc3;
                this.zzk = zzlc3;
                i = 3;
            }
            if (zzlc == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzlc.zzo();
            this.zzn--;
        }
        zzlc zzlc4 = this.zzl;
        zzlc4.getClass();
        zzlc zzlc5 = zzlc4;
        zzlc4.zzp((zzlc) null);
        zzI();
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzbl r17, long r18, long r20, long r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzlc r2 = r0.zzi
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r2 == 0) goto L_0x00a6
            com.google.android.gms.internal.ads.zzld r5 = r2.zzg
            if (r3 != 0) goto L_0x0015
            com.google.android.gms.internal.ads.zzld r3 = r0.zzp(r1, r5)
            r6 = r18
            goto L_0x0030
        L_0x0015:
            r6 = r18
            com.google.android.gms.internal.ads.zzld r8 = r0.zzD(r1, r3, r6)
            if (r8 == 0) goto L_0x00a1
            long r9 = r5.zzb
            long r11 = r8.zzb
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x00a1
            com.google.android.gms.internal.ads.zzvh r9 = r5.zza
            com.google.android.gms.internal.ads.zzvh r10 = r8.zza
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00a1
            r3 = r8
        L_0x0030:
            long r8 = r5.zzc
            com.google.android.gms.internal.ads.zzld r8 = r3.zza(r8)
            r2.zzg = r8
            long r8 = r5.zze
            long r10 = r3.zze
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0098
            r2.zzr()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0052
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0057
        L_0x0052:
            long r12 = r2.zze()
            long r10 = r10 + r12
        L_0x0057:
            com.google.android.gms.internal.ads.zzlc r1 = r0.zzj
            r12 = -9223372036854775808
            r3 = 1
            if (r2 != r1) goto L_0x006c
            com.google.android.gms.internal.ads.zzld r1 = r2.zzg
            boolean r1 = r1.zzg
            int r1 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x006a
            int r1 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r1 < 0) goto L_0x006c
        L_0x006a:
            r1 = r3
            goto L_0x006d
        L_0x006c:
            r1 = r4
        L_0x006d:
            com.google.android.gms.internal.ads.zzlc r14 = r0.zzk
            if (r2 != r14) goto L_0x007b
            int r12 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0079
            int r10 = (r22 > r10 ? 1 : (r22 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x007b
        L_0x0079:
            r10 = r3
            goto L_0x007c
        L_0x007b:
            r10 = r4
        L_0x007c:
            int r2 = r0.zza(r2)
            if (r2 == 0) goto L_0x0083
            return r2
        L_0x0083:
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x008a
            long r8 = r5.zzd
            r8 = r6
        L_0x008a:
            if (r1 == 0) goto L_0x0092
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r4 = r3
        L_0x0092:
            if (r10 == 0) goto L_0x0097
            r1 = r4 | 2
            return r1
        L_0x0097:
            return r4
        L_0x0098:
            com.google.android.gms.internal.ads.zzlc r3 = r2.zzg()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L_0x0007
        L_0x00a1:
            int r1 = r0.zza(r3)
            return r1
        L_0x00a6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzb(com.google.android.gms.internal.ads.zzbl, long, long, long):int");
    }

    public final int zzc(zzbl zzbl, int i) {
        this.zzf = i;
        return zzA(zzbl);
    }

    public final int zzd(zzbl zzbl, boolean z) {
        this.zzg = z;
        return zzA(zzbl);
    }

    public final zzlc zze() {
        zzlc zzlc = this.zzi;
        if (zzlc == null) {
            return null;
        }
        if (zzlc == this.zzj) {
            this.zzj = zzlc.zzg();
        }
        if (zzlc == this.zzk) {
            this.zzk = zzlc.zzg();
        }
        zzlc.zzo();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            zzlc zzlc2 = this.zzi;
            this.zzo = zzlc2.zzb;
            this.zzp = zzlc2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzg();
        zzI();
        return this.zzi;
    }

    public final zzlc zzf() {
        zzlc zzlc = this.zzk;
        zzdd.zzb(zzlc);
        zzlc zzlc2 = zzlc;
        this.zzk = zzlc.zzg();
        zzI();
        zzlc zzlc3 = this.zzk;
        zzdd.zzb(zzlc3);
        zzlc zzlc4 = zzlc3;
        return zzlc3;
    }

    public final zzlc zzg() {
        zzlc zzlc = this.zzk;
        zzlc zzlc2 = this.zzj;
        if (zzlc == zzlc2) {
            zzdd.zzb(zzlc2);
            zzlc zzlc3 = zzlc2;
            this.zzk = zzlc2.zzg();
        }
        zzlc zzlc4 = this.zzj;
        zzdd.zzb(zzlc4);
        zzlc zzlc5 = zzlc4;
        this.zzj = zzlc4.zzg();
        zzI();
        zzlc zzlc6 = this.zzj;
        zzdd.zzb(zzlc6);
        zzlc zzlc7 = zzlc6;
        return zzlc6;
    }

    public final zzlc zzi() {
        return this.zzl;
    }

    public final zzlc zzj() {
        return this.zzi;
    }

    public final zzlc zzk(zzvf zzvf) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzlc zzlc = (zzlc) this.zzq.get(i);
            if (zzlc.zza == zzvf) {
                return zzlc;
            }
        }
        return null;
    }

    public final zzlc zzl() {
        return this.zzm;
    }

    public final zzlc zzm() {
        return this.zzk;
    }

    public final zzlc zzn() {
        return this.zzj;
    }

    public final zzld zzo(long j, zzls zzls) {
        zzlc zzlc = this.zzl;
        if (zzlc != null) {
            return zzD(zzls.zza, zzlc, j);
        }
        return zzE(zzls.zza, zzls.zzb, zzls.zzc, zzls.zzs);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzld zzp(com.google.android.gms.internal.ads.zzbl r22, com.google.android.gms.internal.ads.zzld r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            com.google.android.gms.internal.ads.zzvh r3 = r2.zza
            boolean r13 = zzL(r3)
            boolean r14 = r0.zzK(r1, r3)
            boolean r15 = r0.zzJ(r1, r3, r13)
            java.lang.Object r4 = r3.zza
            com.google.android.gms.internal.ads.zzbj r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r6 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0033
            int r1 = r3.zze
            if (r1 != r4) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            r5.zzg(r1)
            r10 = r6
            goto L_0x0034
        L_0x0033:
            r10 = r8
        L_0x0034:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x0048
            int r1 = r3.zzb
            int r6 = r3.zzc
            long r6 = r5.zzf(r1, r6)
        L_0x0042:
            r19 = r6
            r7 = r10
            r9 = r19
            goto L_0x0052
        L_0x0048:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x004f
            r9 = r6
            r7 = r9
            goto L_0x0052
        L_0x004f:
            long r6 = r5.zzd
            goto L_0x0042
        L_0x0052:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x005e
            int r1 = r3.zzb
            r5.zzk(r1)
            goto L_0x0065
        L_0x005e:
            int r1 = r3.zze
            if (r1 == r4) goto L_0x0065
            r5.zzk(r1)
        L_0x0065:
            com.google.android.gms.internal.ads.zzld r16 = new com.google.android.gms.internal.ads.zzld
            long r4 = r2.zzb
            long r11 = r2.zzc
            boolean r1 = r2.zzf
            r17 = 0
            r18 = 0
            r1 = r16
            r2 = r3
            r3 = r4
            r5 = r11
            r11 = r17
            r12 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzp(com.google.android.gms.internal.ads.zzbl, com.google.android.gms.internal.ads.zzld):com.google.android.gms.internal.ads.zzld");
    }

    public final zzvh zzq(zzbl zzbl, Object obj, long j) {
        long zzC;
        int zza2;
        zzbj zzbj = this.zza;
        int i = zzbl.zzn(obj, zzbj).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (zza2 = zzbl.zza(obj2)) == -1 || zzbl.zzd(zza2, zzbj, false).zzc != i) {
            zzlc zzlc = this.zzi;
            while (true) {
                if (zzlc == null) {
                    zzlc zzlc2 = this.zzi;
                    while (true) {
                        if (zzlc2 != null) {
                            int zza3 = zzbl.zza(zzlc2.zzb);
                            if (zza3 != -1 && zzbl.zzd(zza3, zzbj, false).zzc == i) {
                                zzC = zzlc2.zzg.zza.zzd;
                                break;
                            }
                            zzlc2 = zzlc2.zzg();
                        } else {
                            zzC = zzC(obj);
                            if (zzC == -1) {
                                zzC = this.zze;
                                this.zze = 1 + zzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = zzC;
                                }
                            }
                        }
                    }
                } else if (zzlc.zzb.equals(obj)) {
                    zzC = zzlc.zzg.zza.zzd;
                    break;
                } else {
                    zzlc = zzlc.zzg();
                }
            }
        } else {
            zzC = this.zzp;
        }
        long j2 = zzC;
        zzbl.zzn(obj, zzbj);
        int i2 = zzbj.zzc;
        zzbk zzbk = this.zzb;
        zzbl.zze(i2, zzbk, 0);
        Object obj3 = obj;
        for (int zza4 = zzbl.zza(obj); zza4 >= zzbk.zzn; zza4--) {
            zzbl.zzd(zza4, zzbj, true);
            zzbj.zzb();
            if (zzbj.zzd(zzbj.zzd) != -1) {
                Object obj4 = zzbj.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzH(zzbl, obj3, j, j2, zzbk, zzbj);
    }

    public final void zzs() {
        if (this.zzn != 0) {
            zzlc zzlc = this.zzi;
            zzdd.zzb(zzlc);
            zzlc zzlc2 = zzlc;
            this.zzo = zzlc.zzb;
            this.zzp = zzlc.zzg.zza.zzd;
            while (zzlc != null) {
                zzlc.zzo();
                zzlc = zzlc.zzg();
            }
            this.zzi = null;
            this.zzl = null;
            this.zzj = null;
            this.zzk = null;
            this.zzn = 0;
            zzI();
        }
    }

    public final void zzt() {
        zzlc zzlc = this.zzm;
        if (zzlc == null || zzlc.zzt()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                zzlc zzlc2 = (zzlc) this.zzq.get(i);
                if (!zzlc2.zzt()) {
                    this.zzm = zzlc2;
                    return;
                }
            }
        }
    }

    public final void zzu(long j) {
        zzlc zzlc = this.zzl;
        if (zzlc != null) {
            zzlc.zzn(j);
        }
    }

    public final void zzv() {
        if (!this.zzq.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.zzq.size(); i++) {
                ((zzlc) this.zzq.get(i)).zzo();
            }
            this.zzq = arrayList;
            this.zzm = null;
            zzt();
        }
    }

    public final void zzw(zzbl zzbl, zzix zzix) {
        this.zzh = zzix;
        long j = zzix.zzb;
        zzv();
    }

    public final boolean zzx(zzvf zzvf) {
        zzlc zzlc = this.zzl;
        return zzlc != null && zzlc.zza == zzvf;
    }

    public final boolean zzy(zzvf zzvf) {
        zzlc zzlc = this.zzm;
        return zzlc != null && zzlc.zza == zzvf;
    }

    public final boolean zzz() {
        zzlc zzlc = this.zzl;
        if (zzlc == null) {
            return true;
        }
        if (zzlc.zzg.zzj || !zzlc.zzs() || this.zzl.zzg.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzn < 100;
    }

    public final zzlc zzh(zzld zzld) {
        long j;
        zzlc zzlc;
        zzlc zzlc2 = this.zzl;
        if (zzlc2 == null) {
            j = 1000000000000L;
        } else {
            j = (zzlc2.zze() + zzlc2.zzg.zze) - zzld.zzb;
        }
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzlc = null;
                break;
            }
            zzld zzld2 = ((zzlc) this.zzq.get(i)).zzg;
            long j2 = zzld2.zze;
            long j3 = zzld.zze;
            if ((j2 == -9223372036854775807L || j2 == j3) && zzld2.zzb == zzld.zzb && zzld2.zza.equals(zzld.zza)) {
                zzlc = (zzlc) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzlc == null) {
            zzlc = zzkt.zzg(this.zzr.zza, zzld, j);
        } else {
            zzlc.zzg = zzld;
            zzlc.zzq(j);
        }
        zzlc zzlc3 = this.zzl;
        if (zzlc3 != null) {
            zzlc3.zzp(zzlc);
        } else {
            this.zzi = zzlc;
            this.zzj = zzlc;
            this.zzk = zzlc;
        }
        this.zzo = null;
        this.zzl = zzlc;
        this.zzn++;
        zzI();
        return zzlc;
    }
}
