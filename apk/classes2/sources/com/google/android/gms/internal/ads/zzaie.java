package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaie implements zzadv {
    private final zzen zza;
    private final zzaen zzb;
    private final zzaej zzc;
    private final zzael zzd;
    private final zzafb zze;
    private zzady zzf;
    private zzafb zzg;
    private zzafb zzh;
    private int zzi;
    private zzav zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzaig zzp;
    private boolean zzq;

    public zzaie() {
        throw null;
    }

    public zzaie(int i) {
        this.zza = new zzen(10);
        this.zzb = new zzaen();
        this.zzc = new zzaej();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzael();
        zzadr zzadr = new zzadr();
        this.zze = zzadr;
        this.zzh = zzadr;
        this.zzn = -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: com.google.android.gms.internal.ads.zzaib} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v49, resolved type: com.google.android.gms.internal.ads.zzaif} */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v28, types: [com.google.android.gms.internal.ads.zzaid] */
    /* JADX WARNING: type inference failed for: r8v10, types: [com.google.android.gms.internal.ads.zzaij] */
    /* JADX WARNING: type inference failed for: r8v12, types: [com.google.android.gms.internal.ads.zzaih] */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ae, code lost:
        if (r8 != null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b0, code lost:
        r8 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0227  */
    /* JADX WARNING: Unknown variable types count: 2 */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzg(com.google.android.gms.internal.ads.zzadw r35) throws java.io.IOException {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            int r2 = r0.zzi
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.zzm(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.android.gms.internal.ads.zzaig r2 = r0.zzp
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r2 != 0) goto L_0x0240
            com.google.android.gms.internal.ads.zzaen r2 = r0.zzb
            com.google.android.gms.internal.ads.zzen r14 = new com.google.android.gms.internal.ads.zzen
            int r9 = r2.zzc
            r14.<init>((int) r9)
            byte[] r9 = r14.zzN()
            int r10 = r2.zzc
            r1.zzh(r9, r4, r10)
            int r9 = r2.zza
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            if (r9 == 0) goto L_0x003a
            int r9 = r2.zze
            if (r9 == r8) goto L_0x0041
            r11 = r10
            goto L_0x0041
        L_0x003a:
            int r9 = r2.zze
            if (r9 == r8) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r11 = 13
        L_0x0041:
            int r9 = r14.zzd()
            int r12 = r11 + 4
            r13 = 1231971951(0x496e666f, float:976486.94)
            r15 = 1447187017(0x56425249, float:5.3414667E13)
            r8 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r9 < r12) goto L_0x005f
            r14.zzL(r11)
            int r9 = r14.zzg()
            if (r9 == r8) goto L_0x0073
            if (r9 != r13) goto L_0x005f
            r9 = r13
            goto L_0x0073
        L_0x005f:
            int r9 = r14.zzd()
            r11 = 40
            if (r9 < r11) goto L_0x0072
            r14.zzL(r10)
            int r9 = r14.zzg()
            if (r9 != r15) goto L_0x0072
            r9 = r15
            goto L_0x0073
        L_0x0072:
            r9 = r4
        L_0x0073:
            if (r9 == r13) goto L_0x0093
            if (r9 == r15) goto L_0x007f
            if (r9 == r8) goto L_0x0093
            r35.zzj()
        L_0x007c:
            r8 = 0
            goto L_0x014d
        L_0x007f:
            long r9 = r35.zzd()
            long r11 = r35.zzf()
            r13 = r2
            com.google.android.gms.internal.ads.zzaih r8 = com.google.android.gms.internal.ads.zzaih.zzb(r9, r11, r13, r14)
            int r9 = r2.zzc
            r1.zzk(r9)
            goto L_0x014d
        L_0x0093:
            com.google.android.gms.internal.ads.zzaii r10 = com.google.android.gms.internal.ads.zzaii.zzb(r2, r14)
            com.google.android.gms.internal.ads.zzaej r11 = r0.zzc
            boolean r12 = r11.zza()
            if (r12 != 0) goto L_0x00ab
            int r12 = r10.zzd
            if (r12 == r3) goto L_0x00ab
            int r13 = r10.zze
            if (r13 == r3) goto L_0x00ab
            r11.zza = r12
            r11.zzb = r13
        L_0x00ab:
            long r11 = r35.zzf()
            long r13 = r35.zzd()
            r16 = -1
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 == 0) goto L_0x00ec
            long r13 = r10.zzc
            int r15 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r15 == 0) goto L_0x00ec
            long r18 = r35.zzd()
            long r13 = r13 + r11
            int r15 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x00ec
            long r3 = r35.zzd()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r7 = "Data size mismatch between stream ("
            r15.<init>(r7)
            r15.append(r3)
            java.lang.String r3 = ") and Xing frame ("
            r15.append(r3)
            r15.append(r13)
            java.lang.String r3 = "), using Xing value."
            r15.append(r3)
            java.lang.String r3 = r15.toString()
            java.lang.String r4 = "Mp3Extractor"
            com.google.android.gms.internal.ads.zzea.zze(r4, r3)
        L_0x00ec:
            int r3 = r2.zzc
            r1.zzk(r3)
            if (r9 != r8) goto L_0x00f8
            com.google.android.gms.internal.ads.zzaij r8 = com.google.android.gms.internal.ads.zzaij.zzb(r10, r11)
            goto L_0x014d
        L_0x00f8:
            long r3 = r35.zzd()
            long r24 = r10.zza()
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0106
            goto L_0x007c
        L_0x0106:
            long r7 = r10.zzc
            int r9 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r9 == 0) goto L_0x0117
            long r3 = r11 + r7
            com.google.android.gms.internal.ads.zzaen r9 = r10.zza
            int r9 = r9.zzc
        L_0x0112:
            long r13 = (long) r9
            long r7 = r7 - r13
            r27 = r3
            goto L_0x0122
        L_0x0117:
            int r7 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
            long r7 = r3 - r11
            com.google.android.gms.internal.ads.zzaen r9 = r10.zza
            int r9 = r9.zzc
            goto L_0x0112
        L_0x0122:
            r22 = 8000000(0x7a1200, double:3.952525E-317)
            java.math.RoundingMode r26 = java.math.RoundingMode.HALF_UP
            r20 = r7
            long r3 = com.google.android.gms.internal.ads.zzex.zzu(r20, r22, r24, r26)
            int r31 = com.google.android.gms.internal.ads.zzgbt.zzb(r3)
            long r3 = r10.zzb
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            long r3 = com.google.android.gms.internal.ads.zzgbo.zzb(r7, r3, r9)
            int r32 = com.google.android.gms.internal.ads.zzgbt.zzb(r3)
            com.google.android.gms.internal.ads.zzaen r3 = r10.zza
            com.google.android.gms.internal.ads.zzaib r8 = new com.google.android.gms.internal.ads.zzaib
            int r3 = r3.zzc
            long r3 = (long) r3
            long r29 = r11 + r3
            r33 = 0
            r26 = r8
            r26.<init>(r27, r29, r31, r32, r33)
        L_0x014d:
            com.google.android.gms.internal.ads.zzav r3 = r0.zzj
            long r9 = r35.zzf()
            if (r3 == 0) goto L_0x019f
            int r4 = r3.zza()
            r7 = 0
        L_0x015a:
            if (r7 >= r4) goto L_0x019f
            com.google.android.gms.internal.ads.zzau r11 = r3.zzb(r7)
            boolean r12 = r11 instanceof com.google.android.gms.internal.ads.zzahi
            if (r12 == 0) goto L_0x019c
            com.google.android.gms.internal.ads.zzahi r11 = (com.google.android.gms.internal.ads.zzahi) r11
            int r4 = r3.zza()
            r7 = 0
        L_0x016b:
            if (r7 >= r4) goto L_0x0196
            com.google.android.gms.internal.ads.zzau r12 = r3.zzb(r7)
            boolean r13 = r12 instanceof com.google.android.gms.internal.ads.zzahk
            if (r13 == 0) goto L_0x0193
            com.google.android.gms.internal.ads.zzahk r12 = (com.google.android.gms.internal.ads.zzahk) r12
            java.lang.String r13 = r12.zzf
            java.lang.String r14 = "TLEN"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x0193
            com.google.android.gms.internal.ads.zzfyq r3 = r12.zzb
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            long r3 = java.lang.Long.parseLong(r3)
            long r3 = com.google.android.gms.internal.ads.zzex.zzs(r3)
            goto L_0x0197
        L_0x0193:
            int r7 = r7 + 1
            goto L_0x016b
        L_0x0196:
            r3 = r5
        L_0x0197:
            com.google.android.gms.internal.ads.zzaid r3 = com.google.android.gms.internal.ads.zzaid.zzb(r9, r11, r3)
            goto L_0x01a0
        L_0x019c:
            int r7 = r7 + 1
            goto L_0x015a
        L_0x019f:
            r3 = 0
        L_0x01a0:
            boolean r4 = r0.zzq
            if (r4 == 0) goto L_0x01aa
            com.google.android.gms.internal.ads.zzaif r3 = new com.google.android.gms.internal.ads.zzaif
            r3.<init>()
            goto L_0x01e6
        L_0x01aa:
            if (r3 == 0) goto L_0x01ae
            r8 = r3
            goto L_0x01b1
        L_0x01ae:
            if (r8 != 0) goto L_0x01b1
            r8 = 0
        L_0x01b1:
            if (r8 != 0) goto L_0x01dc
            com.google.android.gms.internal.ads.zzen r3 = r0.zza
            byte[] r4 = r3.zzN()
            r7 = 4
            r8 = 0
            r1.zzh(r4, r8, r7)
            r3.zzL(r8)
            int r3 = r3.zzg()
            r2.zza(r3)
            com.google.android.gms.internal.ads.zzaib r3 = new com.google.android.gms.internal.ads.zzaib
            long r8 = r35.zzd()
            long r10 = r35.zzf()
            int r12 = r2.zzf
            int r13 = r2.zzc
            r14 = 0
            r7 = r3
            r7.<init>(r8, r10, r12, r13, r14)
            goto L_0x01dd
        L_0x01dc:
            r3 = r8
        L_0x01dd:
            com.google.android.gms.internal.ads.zzafb r4 = r0.zzg
            long r7 = r3.zza()
            r4.zzl(r7)
        L_0x01e6:
            r0.zzp = r3
            com.google.android.gms.internal.ads.zzady r4 = r0.zzf
            r4.zzP(r3)
            com.google.android.gms.internal.ads.zzx r3 = new com.google.android.gms.internal.ads.zzx
            r3.<init>()
            java.lang.String r4 = "audio/mpeg"
            r3.zzG(r4)
            java.lang.String r4 = r2.zzb
            r3.zzah(r4)
            r4 = 4096(0x1000, float:5.74E-42)
            r3.zzX(r4)
            int r4 = r2.zze
            r3.zzD(r4)
            int r2 = r2.zzd
            r3.zzai(r2)
            com.google.android.gms.internal.ads.zzaej r2 = r0.zzc
            int r4 = r2.zza
            r3.zzM(r4)
            int r2 = r2.zzb
            r3.zzN(r2)
            com.google.android.gms.internal.ads.zzav r2 = r0.zzj
            r3.zzaa(r2)
            com.google.android.gms.internal.ads.zzaig r2 = r0.zzp
            int r2 = r2.zzc()
            r4 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r2 == r4) goto L_0x0230
            com.google.android.gms.internal.ads.zzaig r2 = r0.zzp
            int r2 = r2.zzc()
            r3.zzC(r2)
        L_0x0230:
            com.google.android.gms.internal.ads.zzafb r2 = r0.zzh
            com.google.android.gms.internal.ads.zzz r3 = r3.zzan()
            r2.zzm(r3)
            long r2 = r35.zzf()
            r0.zzm = r2
            goto L_0x0255
        L_0x0240:
            long r2 = r0.zzm
            r7 = 0
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0255
            long r7 = r35.zzf()
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0255
            long r2 = r2 - r7
            int r2 = (int) r2
            r1.zzk(r2)
        L_0x0255:
            int r2 = r0.zzo
            if (r2 != 0) goto L_0x02bf
            r35.zzj()
            boolean r2 = r34.zzl(r35)
            if (r2 == 0) goto L_0x0265
            r3 = -1
            goto L_0x02d3
        L_0x0265:
            com.google.android.gms.internal.ads.zzen r2 = r0.zza
            r3 = 0
            r2.zzL(r3)
            int r2 = r2.zzg()
            int r3 = r0.zzi
            long r3 = (long) r3
            boolean r3 = zzk(r2, r3)
            if (r3 == 0) goto L_0x02b7
            int r3 = com.google.android.gms.internal.ads.zzaeo.zzb(r2)
            r4 = -1
            if (r3 != r4) goto L_0x0280
            goto L_0x02b7
        L_0x0280:
            com.google.android.gms.internal.ads.zzaen r3 = r0.zzb
            r3.zza(r2)
            long r7 = r0.zzk
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0297
            com.google.android.gms.internal.ads.zzaig r2 = r0.zzp
            long r4 = r35.zzf()
            long r4 = r2.zze(r4)
            r0.zzk = r4
        L_0x0297:
            int r2 = r3.zzc
            r0.zzo = r2
            long r4 = r35.zzf()
            long r6 = (long) r2
            long r4 = r4 + r6
            r0.zzn = r4
            com.google.android.gms.internal.ads.zzaig r4 = r0.zzp
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzaic
            if (r5 != 0) goto L_0x02aa
            goto L_0x02bf
        L_0x02aa:
            com.google.android.gms.internal.ads.zzaic r4 = (com.google.android.gms.internal.ads.zzaic) r4
            long r1 = r0.zzl
            int r3 = r3.zzg
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.zzh(r1)
            r1 = 0
            throw r1
        L_0x02b7:
            r3 = 1
            r1.zzk(r3)
            r1 = 0
            r0.zzi = r1
            goto L_0x02d2
        L_0x02bf:
            r3 = 1
            com.google.android.gms.internal.ads.zzafb r4 = r0.zzh
            int r1 = r4.zzf(r1, r2, r3)
            r2 = -1
            if (r1 != r2) goto L_0x02cb
            r3 = r2
            goto L_0x02d3
        L_0x02cb:
            int r2 = r0.zzo
            int r2 = r2 - r1
            r0.zzo = r2
            if (r2 <= 0) goto L_0x02d4
        L_0x02d2:
            r3 = 0
        L_0x02d3:
            return r3
        L_0x02d4:
            com.google.android.gms.internal.ads.zzafb r4 = r0.zzh
            long r1 = r0.zzl
            long r5 = r0.zzh(r1)
            com.google.android.gms.internal.ads.zzaen r1 = r0.zzb
            int r8 = r1.zzc
            r9 = 0
            r10 = 0
            r7 = 1
            r4.zzt(r5, r7, r8, r9, r10)
            long r2 = r0.zzl
            int r1 = r1.zzg
            long r4 = (long) r1
            long r2 = r2 + r4
            r0.zzl = r2
            r1 = 0
            r0.zzo = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaie.zzg(com.google.android.gms.internal.ads.zzadw):int");
    }

    private final long zzh(long j) {
        return this.zzk + ((j * 1000000) / ((long) this.zzb.zzd));
    }

    private final void zzj() {
        zzaig zzaig = this.zzp;
        if ((zzaig instanceof zzaib) && zzaig.zzh()) {
            long j = this.zzn;
            if (j != -1 && j != this.zzp.zzd()) {
                this.zzp = ((zzaib) this.zzp).zzf(this.zzn);
                zzady zzady = this.zzf;
                zzady.getClass();
                zzady zzady2 = zzady;
                zzady.zzP(this.zzp);
                zzafb zzafb = this.zzg;
                zzafb.getClass();
                zzafb zzafb2 = zzafb;
                this.zzp.zza();
            }
        }
    }

    private static boolean zzk(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    private final boolean zzl(zzadw zzadw) throws IOException {
        zzaig zzaig = this.zzp;
        if (zzaig != null) {
            long zzd2 = zzaig.zzd();
            if (zzd2 != -1 && zzadw.zze() > zzd2 - 4) {
                return true;
            }
        }
        try {
            return !zzadw.zzm(this.zza.zzN(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzadw zzadw, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        zzadw.zzj();
        if (zzadw.zzf() == 0) {
            zzav zza2 = this.zzd.zza(zzadw, (zzahc) null);
            this.zzj = zza2;
            if (zza2 != null) {
                this.zzc.zzb(zza2);
            }
            i2 = (int) zzadw.zze();
            if (!z) {
                zzadw.zzk(i2);
            }
            i = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!zzl(zzadw)) {
                zzen zzen = this.zza;
                zzen.zzL(0);
                int zzg2 = zzen.zzg();
                if ((i == 0 || zzk(zzg2, (long) i)) && (zzb2 = zzaeo.zzb(zzg2)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzb.zza(zzg2);
                        i = zzg2;
                    }
                    zzadw.zzg(zzb2 - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 != (true != z ? 131072 : 32768)) {
                        if (z) {
                            zzadw.zzj();
                            zzadw.zzg(i2 + i5);
                        } else {
                            zzadw.zzk(1);
                        }
                        i = 0;
                        i4 = i5;
                        i3 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        zzj();
                        throw new EOFException();
                    }
                }
            } else if (i3 <= 0) {
                zzj();
                throw new EOFException();
            }
        }
        if (z) {
            zzadw.zzk(i2 + i4);
        } else {
            zzadw.zzj();
        }
        this.zzi = i;
        return true;
    }

    public final void zza() {
        this.zzq = true;
    }

    public final int zzb(zzadw zzadw, zzaer zzaer) throws IOException {
        zzdd.zzb(this.zzg);
        String str = zzex.zza;
        int zzg2 = zzg(zzadw);
        if (zzg2 == -1 && (this.zzp instanceof zzaic)) {
            if (this.zzp.zza() != zzh(this.zzl)) {
                zzaic zzaic = (zzaic) this.zzp;
                throw null;
            }
        }
        return zzg2;
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zzf = zzady;
        zzafb zzw = zzady.zzw(0, 1);
        this.zzg = zzw;
        this.zzh = zzw;
        this.zzf.zzG();
    }

    public final void zzf(long j, long j2) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0;
        this.zzo = 0;
        zzaig zzaig = this.zzp;
        if (zzaig instanceof zzaic) {
            zzaic zzaic = (zzaic) zzaig;
            throw null;
        }
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        return zzm(zzadw, true);
    }
}
