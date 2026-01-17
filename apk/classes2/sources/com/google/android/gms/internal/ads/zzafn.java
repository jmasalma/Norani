package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzafn implements zzadv {
    private final zzen zza;
    private final zzafl zzb;
    private final boolean zzc;
    private final zzakr zzd;
    private int zze;
    private zzady zzf;
    private zzafo zzg;
    private long zzh;
    /* access modifiers changed from: private */
    public zzafq[] zzi;
    private long zzj;
    private zzafq zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzafn() {
        this(1, zzakr.zza);
    }

    private final zzafq zzg(int i) {
        for (zzafq zzafq : this.zzi) {
            if (zzafq.zzf(i)) {
                return zzafq;
            }
        }
        return null;
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zze = 0;
        if (this.zzc) {
            zzady = new zzaku(zzady, this.zzd);
        }
        this.zzf = zzady;
        this.zzj = -1;
    }

    public final void zzf(long j, long j2) {
        this.zzj = -1;
        this.zzk = null;
        int i = 0;
        for (zzafq zze2 : this.zzi) {
            zze2.zze(j);
        }
        if (j == 0) {
            if (this.zzi.length != 0) {
                i = 3;
            }
            this.zze = i;
            return;
        }
        this.zze = 6;
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        zzen zzen = this.zza;
        zzadw.zzh(zzen.zzN(), 0, 12);
        zzen.zzL(0);
        if (zzen.zzi() != 1179011410) {
            return false;
        }
        zzen.zzM(4);
        if (zzen.zzi() == 541677121) {
            return true;
        }
        return false;
    }

    public zzafn(int i, zzakr zzakr) {
        this.zzd = zzakr;
        this.zzc = 1 != (i ^ 1) ? false : true;
        this.zza = new zzen(12);
        this.zzb = new zzafl((zzafm) null);
        this.zzf = new zzaep();
        this.zzi = new zzafq[0];
        this.zzm = -1;
        this.zzn = -1;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r17, com.google.android.gms.internal.ads.zzaer r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            long r2 = r0.zzj
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x002b
            long r9 = r17.zzf()
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0025
            r11 = 262144(0x40000, double:1.295163E-318)
            long r11 = r11 + r9
            int r6 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            long r2 = r2 - r9
            int r2 = (int) r2
            r1.zzk(r2)
            goto L_0x002b
        L_0x0025:
            r6 = r18
            r6.zza = r2
            r2 = r7
            goto L_0x002c
        L_0x002b:
            r2 = r8
        L_0x002c:
            r0.zzj = r4
            if (r2 == 0) goto L_0x0031
            return r7
        L_0x0031:
            int r2 = r0.zze
            r3 = 12
            r6 = 0
            if (r2 == 0) goto L_0x0365
            r9 = 1819436136(0x6c726468, float:1.1721368E27)
            r10 = 1414744396(0x5453494c, float:3.62987127E12)
            r11 = 2
            if (r2 == r7) goto L_0x031a
            r12 = 3
            if (r2 == r11) goto L_0x0217
            r11 = 1769369453(0x69766f6d, float:1.8620122E25)
            r13 = 4
            r9 = 16
            if (r2 == r12) goto L_0x018a
            r12 = 5
            r4 = 8
            if (r2 == r13) goto L_0x0163
            if (r2 == r12) goto L_0x00d0
            long r12 = r17.zzf()
            long r14 = r0.zzn
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0060
            r8 = -1
            goto L_0x00cf
        L_0x0060:
            com.google.android.gms.internal.ads.zzafq r2 = r0.zzk
            if (r2 == 0) goto L_0x006e
            boolean r1 = r2.zzg(r1)
            if (r1 != 0) goto L_0x006b
            goto L_0x00cf
        L_0x006b:
            r0.zzk = r6
            return r8
        L_0x006e:
            long r5 = r17.zzf()
            r12 = 1
            long r5 = r5 & r12
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x007c
            r1.zzk(r7)
        L_0x007c:
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r5 = r2.zzN()
            r1.zzh(r5, r8, r3)
            r2.zzL(r8)
            int r5 = r2.zzi()
            if (r5 != r10) goto L_0x00a0
            r2.zzL(r4)
            int r2 = r2.zzi()
            if (r2 != r11) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r3 = r4
        L_0x0099:
            r1.zzk(r3)
            r17.zzj()
            goto L_0x00cf
        L_0x00a0:
            int r2 = r2.zzi()
            r3 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r5 != r3) goto L_0x00b5
            long r2 = (long) r2
            long r4 = r17.zzf()
            long r4 = r4 + r2
            r1 = 8
            long r4 = r4 + r1
            r0.zzj = r4
            goto L_0x00cf
        L_0x00b5:
            r1.zzk(r4)
            r17.zzj()
            com.google.android.gms.internal.ads.zzafq r3 = r0.zzg(r5)
            if (r3 != 0) goto L_0x00ca
            long r2 = (long) r2
            long r4 = r17.zzf()
            long r4 = r4 + r2
            r0.zzj = r4
            goto L_0x00cf
        L_0x00ca:
            r3.zzd(r2)
            r0.zzk = r3
        L_0x00cf:
            return r8
        L_0x00d0:
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            int r3 = r0.zzo
            r2.<init>((int) r3)
            byte[] r3 = r2.zzN()
            int r5 = r0.zzo
            r1.zzi(r3, r8, r5)
            int r1 = r2.zza()
            if (r1 >= r9) goto L_0x00e9
            r5 = 0
            goto L_0x0104
        L_0x00e9:
            int r1 = r2.zzc()
            r2.zzM(r4)
            int r3 = r2.zzi()
            long r3 = (long) r3
            long r5 = r0.zzm
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fe
            r5 = 0
            goto L_0x0101
        L_0x00fe:
            r3 = 8
            long r5 = r5 + r3
        L_0x0101:
            r2.zzL(r1)
        L_0x0104:
            int r1 = r2.zza()
            if (r1 < r9) goto L_0x012b
            int r1 = r2.zzi()
            int r3 = r2.zzi()
            int r4 = r2.zzi()
            long r10 = (long) r4
            long r10 = r10 + r5
            r2.zzM(r13)
            com.google.android.gms.internal.ads.zzafq r1 = r0.zzg(r1)
            if (r1 == 0) goto L_0x0104
            r3 = r3 & r9
            if (r3 != r9) goto L_0x0126
            r3 = r7
            goto L_0x0127
        L_0x0126:
            r3 = r8
        L_0x0127:
            r1.zzb(r10, r3)
            goto L_0x0104
        L_0x012b:
            com.google.android.gms.internal.ads.zzafq[] r1 = r0.zzi
            int r2 = r1.length
            r3 = r8
        L_0x012f:
            if (r3 >= r2) goto L_0x0139
            r4 = r1[r3]
            r4.zzc()
            int r3 = r3 + 1
            goto L_0x012f
        L_0x0139:
            r0.zzp = r7
            com.google.android.gms.internal.ads.zzafq[] r1 = r0.zzi
            int r1 = r1.length
            if (r1 != 0) goto L_0x014f
            com.google.android.gms.internal.ads.zzady r1 = r0.zzf
            com.google.android.gms.internal.ads.zzaet r2 = new com.google.android.gms.internal.ads.zzaet
            long r3 = r0.zzh
            r5 = 0
            r2.<init>(r3, r5)
            r1.zzP(r2)
            goto L_0x015b
        L_0x014f:
            com.google.android.gms.internal.ads.zzady r1 = r0.zzf
            com.google.android.gms.internal.ads.zzafk r2 = new com.google.android.gms.internal.ads.zzafk
            long r3 = r0.zzh
            r2.<init>(r0, r3)
            r1.zzP(r2)
        L_0x015b:
            r1 = 6
            r0.zze = r1
            long r1 = r0.zzm
            r0.zzj = r1
            return r8
        L_0x0163:
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r3 = r2.zzN()
            r1.zzi(r3, r8, r4)
            r2.zzL(r8)
            int r3 = r2.zzi()
            int r2 = r2.zzi()
            r4 = 829973609(0x31786469, float:3.6145826E-9)
            if (r3 != r4) goto L_0x0181
            r0.zze = r12
            r0.zzo = r2
            goto L_0x0189
        L_0x0181:
            long r3 = r17.zzf()
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.zzj = r3
        L_0x0189:
            return r8
        L_0x018a:
            long r4 = r0.zzm
            r14 = -1
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x019e
            long r14 = r17.zzf()
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x019b
            goto L_0x019e
        L_0x019b:
            r0.zzj = r4
            return r8
        L_0x019e:
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r4 = r2.zzN()
            r1.zzh(r4, r8, r3)
            r17.zzj()
            r2.zzL(r8)
            com.google.android.gms.internal.ads.zzafl r4 = r0.zzb
            r4.zza(r2)
            int r2 = r2.zzi()
            int r5 = r4.zza
            r6 = 1179011410(0x46464952, float:12690.33)
            if (r5 != r6) goto L_0x01c1
            r1.zzk(r3)
            return r8
        L_0x01c1:
            if (r5 != r10) goto L_0x0209
            if (r2 == r11) goto L_0x01c6
            goto L_0x0209
        L_0x01c6:
            long r2 = r17.zzf()
            r0.zzm = r2
            int r4 = r4.zzb
            long r4 = (long) r4
            long r2 = r2 + r4
            r4 = 8
            long r2 = r2 + r4
            r0.zzn = r2
            boolean r4 = r0.zzp
            if (r4 != 0) goto L_0x01fc
            com.google.android.gms.internal.ads.zzafo r4 = r0.zzg
            r4.getClass()
            r5 = r4
            com.google.android.gms.internal.ads.zzafo r5 = (com.google.android.gms.internal.ads.zzafo) r5
            int r4 = r4.zzb
            r4 = r4 & r9
            if (r4 == r9) goto L_0x01f7
            com.google.android.gms.internal.ads.zzady r2 = r0.zzf
            com.google.android.gms.internal.ads.zzaet r3 = new com.google.android.gms.internal.ads.zzaet
            long r4 = r0.zzh
            r9 = 0
            r3.<init>(r4, r9)
            r2.zzP(r3)
            r0.zzp = r7
            goto L_0x01fc
        L_0x01f7:
            r0.zze = r13
            r0.zzj = r2
            return r8
        L_0x01fc:
            long r1 = r17.zzf()
            r3 = 12
            long r1 = r1 + r3
            r0.zzj = r1
            r1 = 6
            r0.zze = r1
            return r8
        L_0x0209:
            long r1 = r17.zzf()
            int r3 = r4.zzb
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 8
            long r1 = r1 + r3
            r0.zzj = r1
            return r8
        L_0x0217:
            int r2 = r0.zzl
            int r2 = r2 + -4
            com.google.android.gms.internal.ads.zzen r3 = new com.google.android.gms.internal.ads.zzen
            r3.<init>((int) r2)
            byte[] r4 = r3.zzN()
            r1.zzi(r4, r8, r2)
            com.google.android.gms.internal.ads.zzafr r1 = com.google.android.gms.internal.ads.zzafr.zzc(r9, r3)
            int r2 = r1.zza()
            if (r2 != r9) goto L_0x0302
            java.lang.Class<com.google.android.gms.internal.ads.zzafo> r2 = com.google.android.gms.internal.ads.zzafo.class
            com.google.android.gms.internal.ads.zzafj r2 = r1.zzb(r2)
            com.google.android.gms.internal.ads.zzafo r2 = (com.google.android.gms.internal.ads.zzafo) r2
            if (r2 == 0) goto L_0x02fa
            r0.zzg = r2
            int r3 = r2.zzc
            int r2 = r2.zza
            long r3 = (long) r3
            long r9 = (long) r2
            long r3 = r3 * r9
            r0.zzh = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.gms.internal.ads.zzfyq r1 = r1.zza
            int r3 = r1.size()
            r4 = r8
            r5 = r4
        L_0x0253:
            if (r4 >= r3) goto L_0x02e7
            java.lang.Object r9 = r1.get(r4)
            com.google.android.gms.internal.ads.zzafj r9 = (com.google.android.gms.internal.ads.zzafj) r9
            int r10 = r9.zza()
            r13 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r10 != r13) goto L_0x02e0
            com.google.android.gms.internal.ads.zzafr r9 = (com.google.android.gms.internal.ads.zzafr) r9
            int r10 = r5 + 1
            java.lang.Class<com.google.android.gms.internal.ads.zzafp> r13 = com.google.android.gms.internal.ads.zzafp.class
            com.google.android.gms.internal.ads.zzafj r13 = r9.zzb(r13)
            com.google.android.gms.internal.ads.zzafp r13 = (com.google.android.gms.internal.ads.zzafp) r13
            java.lang.Class<com.google.android.gms.internal.ads.zzafs> r14 = com.google.android.gms.internal.ads.zzafs.class
            com.google.android.gms.internal.ads.zzafj r14 = r9.zzb(r14)
            com.google.android.gms.internal.ads.zzafs r14 = (com.google.android.gms.internal.ads.zzafs) r14
            java.lang.String r15 = "AviExtractor"
            if (r13 != 0) goto L_0x0282
            java.lang.String r5 = "Missing Stream Header"
            com.google.android.gms.internal.ads.zzea.zzf(r15, r5)
            goto L_0x02da
        L_0x0282:
            if (r14 != 0) goto L_0x028a
            java.lang.String r5 = "Missing Stream Format"
            com.google.android.gms.internal.ads.zzea.zzf(r15, r5)
            goto L_0x02da
        L_0x028a:
            long r11 = r13.zzc()
            com.google.android.gms.internal.ads.zzz r14 = r14.zza
            com.google.android.gms.internal.ads.zzx r15 = r14.zzb()
            r15.zzR(r5)
            int r6 = r13.zze
            if (r6 == 0) goto L_0x029e
            r15.zzX(r6)
        L_0x029e:
            java.lang.Class<com.google.android.gms.internal.ads.zzaft> r6 = com.google.android.gms.internal.ads.zzaft.class
            com.google.android.gms.internal.ads.zzafj r6 = r9.zzb(r6)
            com.google.android.gms.internal.ads.zzaft r6 = (com.google.android.gms.internal.ads.zzaft) r6
            if (r6 == 0) goto L_0x02ad
            java.lang.String r6 = r6.zza
            r15.zzU(r6)
        L_0x02ad:
            java.lang.String r6 = r14.zzo
            int r6 = com.google.android.gms.internal.ads.zzay.zzb(r6)
            if (r6 == r7) goto L_0x02bc
            r9 = 2
            if (r6 != r9) goto L_0x02ba
            r6 = 2
            goto L_0x02bc
        L_0x02ba:
            r6 = 0
            goto L_0x02da
        L_0x02bc:
            com.google.android.gms.internal.ads.zzady r9 = r0.zzf
            com.google.android.gms.internal.ads.zzafb r6 = r9.zzw(r5, r6)
            com.google.android.gms.internal.ads.zzz r9 = r15.zzan()
            r6.zzm(r9)
            r6.zzl(r11)
            long r14 = r0.zzh
            long r11 = java.lang.Math.max(r14, r11)
            r0.zzh = r11
            com.google.android.gms.internal.ads.zzafq r9 = new com.google.android.gms.internal.ads.zzafq
            r9.<init>(r5, r13, r6)
            r6 = r9
        L_0x02da:
            if (r6 == 0) goto L_0x02df
            r2.add(r6)
        L_0x02df:
            r5 = r10
        L_0x02e0:
            int r4 = r4 + 1
            r6 = 0
            r11 = 2
            r12 = 3
            goto L_0x0253
        L_0x02e7:
            com.google.android.gms.internal.ads.zzafq[] r1 = new com.google.android.gms.internal.ads.zzafq[r8]
            java.lang.Object[] r1 = r2.toArray(r1)
            com.google.android.gms.internal.ads.zzafq[] r1 = (com.google.android.gms.internal.ads.zzafq[]) r1
            r0.zzi = r1
            com.google.android.gms.internal.ads.zzady r1 = r0.zzf
            r1.zzG()
            r1 = 3
            r0.zze = r1
            return r8
        L_0x02fa:
            java.lang.String r1 = "AviHeader not found"
            r2 = 0
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r2)
            throw r1
        L_0x0302:
            r2 = r6
            int r1 = r1.zza()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected header list type "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r2)
            throw r1
        L_0x031a:
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            byte[] r4 = r2.zzN()
            r1.zzi(r4, r8, r3)
            r2.zzL(r8)
            com.google.android.gms.internal.ads.zzafl r1 = r0.zzb
            r1.zza(r2)
            int r3 = r1.zza
            if (r3 != r10) goto L_0x0351
            int r2 = r2.zzi()
            if (r2 != r9) goto L_0x033d
            int r1 = r1.zzb
            r0.zzl = r1
            r1 = 2
            r0.zze = r1
            return r8
        L_0x033d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "hdrl expected, found: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r2)
            throw r1
        L_0x0351:
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "LIST expected, found: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r2)
            throw r1
        L_0x0365:
            r2 = r6
            boolean r4 = r16.zzi(r17)
            if (r4 == 0) goto L_0x0372
            r1.zzk(r3)
            r0.zze = r7
            return r8
        L_0x0372:
            java.lang.String r1 = "AVI Header List not found"
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafn.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }
}
