package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzajj implements zzadv, zzaeu {
    private long zzA;
    private int zzB;
    private zzahm zzC;
    private final zzakr zza;
    private final int zzb;
    private final zzen zzc;
    private final zzen zzd;
    private final zzen zze;
    private final zzen zzf;
    private final ArrayDeque zzg;
    private final zzajn zzh;
    private final List zzi;
    private zzfyq zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzen zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private long zzv;
    private zzady zzw;
    private zzaji[] zzx;
    private long[][] zzy;
    private int zzz;

    @Deprecated
    public zzajj() {
        this(zzakr.zza, 16);
    }

    private static int zzj(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzajs zzajs, long j) {
        int zza2 = zzajs.zza(j);
        return zza2 == -1 ? zzajs.zzb(j) : zza2;
    }

    private static long zzl(zzajs zzajs, long j, long j2) {
        int zzk2 = zzk(zzajs, j);
        if (zzk2 == -1) {
            return j2;
        }
        return Math.min(zzajs.zzc[zzk2], j2);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    private final void zzn(long j) throws zzaz {
        zzajj zzajj;
        zzav zzav;
        ArrayDeque arrayDeque;
        int i;
        zzaej zzaej;
        List list;
        ArrayList arrayList;
        int i2;
        int i3;
        zzajj zzajj2 = this;
        while (true) {
            ArrayDeque arrayDeque2 = zzajj2.zzg;
            if (!arrayDeque2.isEmpty() && ((zzfc) arrayDeque2.peek()).zza == j) {
                zzfc zzfc = (zzfc) arrayDeque2.pop();
                if (zzfc.zzd == 1836019574) {
                    zzfc zza2 = zzfc.zza(1835365473);
                    new ArrayList();
                    zzav zzb2 = zza2 != null ? zzaix.zzb(zza2) : null;
                    ArrayList arrayList2 = new ArrayList();
                    boolean z = zzajj2.zzB == 1;
                    zzaej zzaej2 = new zzaej();
                    zzfd zzb3 = zzfc.zzb(1969517665);
                    if (zzb3 != null) {
                        zzav zzc2 = zzaix.zzc(zzb3);
                        zzaej2.zzb(zzc2);
                        zzav = zzc2;
                    } else {
                        zzav = null;
                    }
                    zzfd zzb4 = zzfc.zzb(1836476516);
                    zzb4.getClass();
                    zzfd zzfd = zzb4;
                    zzav zzav2 = new zzav(-9223372036854775807L, zzaix.zzd(zzb4.zza));
                    int i4 = zzajj2.zzb;
                    ArrayList arrayList3 = arrayList2;
                    int i5 = i4;
                    zzav zzav3 = zzav2;
                    zzaej zzaej3 = zzaej2;
                    List zzf2 = zzaix.zzf(zzfc, zzaej2, -9223372036854775807L, (zzs) null, 1 == (i4 & 1), z, new zzajh());
                    String zza3 = zzajg.zza(zzf2);
                    long j2 = -9223372036854775807L;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = -1;
                    while (i6 < zzf2.size()) {
                        zzajs zzajs = (zzajs) zzf2.get(i6);
                        if (zzajs.zzb == 0) {
                            arrayDeque = arrayDeque2;
                            i = i7;
                            zzaej = zzaej3;
                            arrayList = arrayList3;
                            list = zzf2;
                        } else {
                            zzajp zzajp = zzajs.zza;
                            zzady zzady = zzajj2.zzw;
                            i = i7 + 1;
                            int i9 = zzajp.zzb;
                            zzaji zzaji = new zzaji(zzajp, zzajs, zzady.zzw(i7, i9));
                            list = zzf2;
                            long j3 = zzajp.zze;
                            if (j3 == -9223372036854775807L) {
                                j3 = zzajs.zzh;
                            }
                            zzafb zzafb = zzaji.zzc;
                            zzafb.zzl(j3);
                            long max = Math.max(j2, j3);
                            zzz zzz2 = zzajp.zzg;
                            if ("audio/true-hd".equals(zzz2.zzo)) {
                                i2 = zzajs.zze * 16;
                            } else {
                                i2 = zzajs.zze + 30;
                            }
                            zzx zzb5 = zzz2.zzb();
                            zzb5.zzX(i2);
                            if (i9 == 2) {
                                int i10 = zzz2.zzf;
                                if ((i5 & 8) != 0) {
                                    i10 |= i8 == -1 ? 1 : 2;
                                }
                                zzb5.zzaf(i10);
                                i3 = 1;
                                i9 = 2;
                            } else {
                                i3 = 1;
                            }
                            if (i9 != i3 || !zzaej3.zza()) {
                                zzaej = zzaej3;
                            } else {
                                zzaej = zzaej3;
                                zzb5.zzM(zzaej.zza);
                                zzb5.zzN(zzaej.zzb);
                            }
                            zzav zzav4 = zzz2.zzl;
                            List list2 = zzajj2.zzi;
                            long j4 = max;
                            zzav[] zzavArr = new zzav[3];
                            zzavArr[0] = list2.isEmpty() ? null : new zzav(list2);
                            zzavArr[1] = zzav;
                            zzavArr[2] = zzav3;
                            if (zzav4 != null) {
                                arrayDeque = arrayDeque2;
                            } else {
                                arrayDeque = arrayDeque2;
                                zzav4 = new zzav(-9223372036854775807L, new zzau[0]);
                            }
                            if (zzb2 != null) {
                                for (int i11 = 0; i11 < zzb2.zza(); i11++) {
                                    zzau zzb6 = zzb2.zzb(i11);
                                    if (zzb6 instanceof zzfa) {
                                        zzfa zzfa = (zzfa) zzb6;
                                        if (!zzfa.zza.equals("com.android.capture.fps")) {
                                            zzav4 = zzav4.zzc(zzfa);
                                        } else if (i9 == 2) {
                                            zzav4 = zzav4.zzc(zzfa);
                                        }
                                    }
                                }
                            }
                            for (int i12 = 0; i12 < 3; i12++) {
                                zzav4 = zzav4.zzd(zzavArr[i12]);
                            }
                            if (zzav4.zza() > 0) {
                                zzb5.zzaa(zzav4);
                            }
                            zzb5.zzG(zza3);
                            zzafb.zzm(zzb5.zzan());
                            if (i9 == 2) {
                                if (i8 == -1) {
                                    i8 = arrayList3.size();
                                }
                            }
                            arrayList = arrayList3;
                            arrayList.add(zzaji);
                            j2 = j4;
                        }
                        i6++;
                        arrayList3 = arrayList;
                        zzf2 = list;
                        zzaej3 = zzaej;
                        i7 = i;
                        arrayDeque2 = arrayDeque;
                        zzajj2 = this;
                    }
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    zzajj = zzajj2;
                    zzajj.zzz = i8;
                    zzajj.zzA = j2;
                    zzaji[] zzajiArr = (zzaji[]) arrayList3.toArray(new zzaji[0]);
                    zzajj.zzx = zzajiArr;
                    int length = zzajiArr.length;
                    long[][] jArr = new long[length][];
                    int[] iArr = new int[length];
                    long[] jArr2 = new long[length];
                    boolean[] zArr = new boolean[length];
                    for (int i13 = 0; i13 < zzajiArr.length; i13++) {
                        jArr[i13] = new long[zzajiArr[i13].zzb.zzb];
                        jArr2[i13] = zzajiArr[i13].zzb.zzf[0];
                    }
                    int i14 = 0;
                    long j5 = 0;
                    int i15 = 0;
                    while (i15 < zzajiArr.length) {
                        long j6 = LongCompanionObject.MAX_VALUE;
                        int i16 = -1;
                        for (int i17 = i14; i17 < zzajiArr.length; i17++) {
                            if (!zArr[i17]) {
                                long j7 = jArr2[i17];
                                if (j7 <= j6) {
                                    i16 = i17;
                                    j6 = j7;
                                }
                            }
                        }
                        int i18 = iArr[i16];
                        long[] jArr3 = jArr[i16];
                        jArr3[i18] = j5;
                        zzajs zzajs2 = zzajiArr[i16].zzb;
                        int i19 = i15;
                        j5 += (long) zzajs2.zzd[i18];
                        int i20 = i18 + 1;
                        iArr[i16] = i20;
                        if (i20 < jArr3.length) {
                            jArr2[i16] = zzajs2.zzf[i20];
                            i15 = i19;
                        } else {
                            zArr[i16] = true;
                            i15 = i19 + 1;
                        }
                        i14 = 0;
                    }
                    zzajj.zzy = jArr;
                    zzajj.zzw.zzG();
                    zzajj.zzw.zzP(zzajj);
                    arrayDeque3.clear();
                    zzajj.zzk = 2;
                } else {
                    ArrayDeque arrayDeque4 = arrayDeque2;
                    zzajj = zzajj2;
                    if (!arrayDeque4.isEmpty()) {
                        ((zzfc) arrayDeque4.peek()).zzc(zzfc);
                    }
                }
                zzajj2 = zzajj;
            }
        }
        if (zzajj2.zzk != 2) {
            zzm();
        }
    }

    public final long zza() {
        return this.zzA;
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    public final void zze(zzady zzady) {
        if ((this.zzb & 16) == 0) {
            zzady = new zzaku(zzady, this.zza);
        }
        this.zzw = zzady;
    }

    public final void zzf(long j, long j2) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = false;
        if (j != 0) {
            for (zzaji zzaji : this.zzx) {
                zzajs zzajs = zzaji.zzb;
                int zza2 = zzajs.zza(j2);
                if (zza2 == -1) {
                    zza2 = zzajs.zzb(j2);
                }
                zzaji.zze = zza2;
                zzafc zzafc = zzaji.zzd;
                if (zzafc != null) {
                    zzafc.zzb();
                }
            }
        } else if (this.zzk != 3) {
            zzm();
        } else {
            this.zzh.zzb();
            this.zzi.clear();
        }
    }

    public final zzaes zzg(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int zzb2;
        long j6 = j;
        zzaji[] zzajiArr = this.zzx;
        if (zzajiArr.length == 0) {
            zzaev zzaev = zzaev.zza;
            return new zzaes(zzaev, zzaev);
        }
        int i = this.zzz;
        if (i != -1) {
            zzajs zzajs = zzajiArr[i].zzb;
            int zzk2 = zzk(zzajs, j6);
            if (zzk2 == -1) {
                zzaev zzaev2 = zzaev.zza;
                return new zzaes(zzaev2, zzaev2);
            }
            long[] jArr = zzajs.zzf;
            long j7 = jArr[zzk2];
            long[] jArr2 = zzajs.zzc;
            j2 = jArr2[zzk2];
            if (j7 >= j6 || zzk2 >= zzajs.zzb - 1 || (zzb2 = zzajs.zzb(j6)) == -1 || zzb2 == zzk2) {
                j5 = -9223372036854775807L;
                j3 = -1;
            } else {
                j5 = jArr[zzb2];
                j3 = jArr2[zzb2];
            }
            j4 = j5;
            j6 = j7;
        } else {
            j2 = LongCompanionObject.MAX_VALUE;
            j4 = -9223372036854775807L;
            j3 = -1;
        }
        int i2 = 0;
        while (true) {
            zzaji[] zzajiArr2 = this.zzx;
            if (i2 >= zzajiArr2.length) {
                break;
            }
            if (i2 != this.zzz) {
                zzajs zzajs2 = zzajiArr2[i2].zzb;
                long zzl2 = zzl(zzajs2, j6, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = zzl(zzajs2, j4, j3);
                }
                j2 = zzl2;
            }
            i2++;
        }
        zzaev zzaev3 = new zzaev(j6, j2);
        if (j4 == -9223372036854775807L) {
            return new zzaes(zzaev3, zzaev3);
        }
        return new zzaes(zzaev3, new zzaev(j4, j3));
    }

    public final boolean zzh() {
        return true;
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        zzaey zzb2 = zzajo.zzb(zzadw, (this.zzb & 2) != 0);
        this.zzj = zzb2 != null ? zzfyq.zzo(zzb2) : zzfyq.zzn();
        return zzb2 == null;
    }

    public zzajj(zzakr zzakr, int i) {
        this.zza = zzakr;
        this.zzb = i;
        this.zzj = zzfyq.zzn();
        this.zzk = (i & 4) != 0 ? 3 : 0;
        this.zzh = new zzajn();
        this.zzi = new ArrayList();
        this.zzf = new zzen(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzen(zzfv.zza);
        this.zzd = new zzen(6);
        this.zze = new zzen();
        this.zzp = -1;
        this.zzw = zzady.zza;
        this.zzx = new zzaji[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:249:0x0097 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0179 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r31, com.google.android.gms.internal.ads.zzaer r32) throws java.io.IOException {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
        L_0x0006:
            int r3 = r0.zzk
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r6 = 0
            r8 = 2
            r10 = -1
            r11 = 8
            r12 = 1
            if (r3 == 0) goto L_0x02bf
            r14 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r12) goto L_0x0230
            if (r3 == r8) goto L_0x002c
            com.google.android.gms.internal.ads.zzajn r3 = r0.zzh
            java.util.List r4 = r0.zzi
            r3.zza(r1, r2, r4)
            long r1 = r2.zza
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x002b
            r30.zzm()
        L_0x002b:
            return r12
        L_0x002c:
            long r3 = r31.zzf()
            int r11 = r0.zzp
            if (r11 != r10) goto L_0x00b5
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r25 = r10
            r26 = r25
            r20 = r12
            r27 = r20
            r18 = r16
            r21 = r18
            r23 = r21
            r11 = 0
        L_0x0048:
            com.google.android.gms.internal.ads.zzaji[] r5 = r0.zzx
            int r9 = r5.length
            if (r11 >= r9) goto L_0x009b
            r5 = r5[r11]
            int r9 = r5.zze
            com.google.android.gms.internal.ads.zzajs r5 = r5.zzb
            int r8 = r5.zzb
            if (r9 != r8) goto L_0x0058
            goto L_0x0097
        L_0x0058:
            long[] r5 = r5.zzc
            r28 = r5[r9]
            long[][] r5 = r0.zzy
            java.lang.String r8 = com.google.android.gms.internal.ads.zzex.zza
            long[][] r5 = (long[][]) r5
            r5 = r5[r11]
            r8 = r5[r9]
            long r28 = r28 - r3
            int r5 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0073
            int r5 = (r28 > r14 ? 1 : (r28 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r5 = 0
            goto L_0x0074
        L_0x0073:
            r5 = r12
        L_0x0074:
            if (r5 != 0) goto L_0x007a
            if (r27 != 0) goto L_0x0082
            r13 = 0
            goto L_0x007c
        L_0x007a:
            r13 = r27
        L_0x007c:
            if (r5 != r13) goto L_0x008b
            int r27 = (r28 > r23 ? 1 : (r28 == r23 ? 0 : -1))
            if (r27 >= 0) goto L_0x008b
        L_0x0082:
            r27 = r5
            r21 = r8
            r26 = r11
            r23 = r28
            goto L_0x008d
        L_0x008b:
            r27 = r13
        L_0x008d:
            int r13 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r13 >= 0) goto L_0x0097
            r20 = r5
            r18 = r8
            r25 = r11
        L_0x0097:
            int r11 = r11 + 1
            r8 = 2
            goto L_0x0048
        L_0x009b:
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x00ad
            if (r20 == 0) goto L_0x00ad
            r8 = 10485760(0xa00000, double:5.180654E-317)
            long r18 = r18 + r8
            int r5 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r5 < 0) goto L_0x00ad
            r11 = r25
            goto L_0x00af
        L_0x00ad:
            r11 = r26
        L_0x00af:
            r0.zzp = r11
            if (r11 != r10) goto L_0x00b5
            goto L_0x022f
        L_0x00b5:
            com.google.android.gms.internal.ads.zzaji[] r5 = r0.zzx
            r5 = r5[r11]
            com.google.android.gms.internal.ads.zzafb r8 = r5.zzc
            int r9 = r5.zze
            com.google.android.gms.internal.ads.zzajs r11 = r5.zzb
            long[] r13 = r11.zzc
            r16 = r13[r9]
            long r12 = r0.zzv
            long r12 = r16 + r12
            int[] r10 = r11.zzd
            r16 = r10[r9]
            com.google.android.gms.internal.ads.zzafc r14 = r5.zzd
            long r3 = r12 - r3
            int r15 = r0.zzq
            r19 = r12
            long r12 = (long) r15
            long r3 = r3 + r12
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x022a
            r6 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x00e2
            goto L_0x022a
        L_0x00e2:
            com.google.android.gms.internal.ads.zzajp r2 = r5.zza
            int r6 = r2.zzh
            r7 = 1
            if (r6 != r7) goto L_0x00ee
            r6 = 8
            long r3 = r3 + r6
            int r16 = r16 + -8
        L_0x00ee:
            r6 = r16
            int r3 = (int) r3
            r1.zzk(r3)
            com.google.android.gms.internal.ads.zzz r3 = r2.zzg
            java.lang.String r4 = r3.zzo
            java.lang.String r7 = "video/avc"
            boolean r7 = java.util.Objects.equals(r4, r7)
            if (r7 != 0) goto L_0x0105
            java.lang.String r7 = "video/hevc"
            java.util.Objects.equals(r4, r7)
        L_0x0105:
            r7 = 1
            r0.zzt = r7
            int r2 = r2.zzk
            if (r2 == 0) goto L_0x019d
            com.google.android.gms.internal.ads.zzen r4 = r0.zzd
            byte[] r12 = r4.zzN()
            r13 = 0
            r12[r13] = r13
            r12[r7] = r13
            r7 = 2
            r12[r7] = r13
            int r7 = 4 - r2
            int r6 = r6 + r7
        L_0x011d:
            int r13 = r0.zzr
            if (r13 >= r6) goto L_0x019a
            int r13 = r0.zzs
            if (r13 != 0) goto L_0x0181
            boolean r13 = r0.zzt
            if (r13 != 0) goto L_0x013e
            int r13 = com.google.android.gms.internal.ads.zzfv.zzb(r3)
            int r13 = r13 + r2
            r15 = r10[r9]
            r32 = r6
            int r6 = r0.zzq
            int r15 = r15 - r6
            if (r13 > r15) goto L_0x0140
            int r6 = com.google.android.gms.internal.ads.zzfv.zzb(r3)
            int r13 = r2 + r6
            goto L_0x0142
        L_0x013e:
            r32 = r6
        L_0x0140:
            r13 = r2
            r6 = 0
        L_0x0142:
            r1.zzi(r12, r7, r13)
            int r15 = r0.zzq
            int r15 = r15 + r13
            r0.zzq = r15
            r13 = 0
            r4.zzL(r13)
            int r15 = r4.zzg()
            if (r15 < 0) goto L_0x0179
            int r15 = r15 - r6
            r0.zzs = r15
            com.google.android.gms.internal.ads.zzen r15 = r0.zzc
            r15.zzL(r13)
            r13 = 4
            r8.zzr(r15, r13)
            int r15 = r0.zzr
            int r15 = r15 + r13
            r0.zzr = r15
            if (r6 <= 0) goto L_0x0197
            r8.zzr(r4, r6)
            int r15 = r0.zzr
            int r15 = r15 + r6
            r0.zzr = r15
            boolean r6 = com.google.android.gms.internal.ads.zzfv.zzj(r12, r13, r6, r3)
            if (r6 == 0) goto L_0x0197
            r6 = 1
            r0.zzt = r6
            goto L_0x0197
        L_0x0179:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r2)
            throw r1
        L_0x0181:
            r32 = r6
            r6 = 0
            int r13 = r8.zzf(r1, r13, r6)
            int r6 = r0.zzq
            int r6 = r6 + r13
            r0.zzq = r6
            int r6 = r0.zzr
            int r6 = r6 + r13
            r0.zzr = r6
            int r6 = r0.zzs
            int r6 = r6 - r13
            r0.zzs = r6
        L_0x0197:
            r6 = r32
            goto L_0x011d
        L_0x019a:
            r32 = r6
            goto L_0x01da
        L_0x019d:
            java.lang.String r2 = "audio/ac4"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x01ba
            int r2 = r0.zzr
            if (r2 != 0) goto L_0x01b7
            com.google.android.gms.internal.ads.zzen r2 = r0.zze
            com.google.android.gms.internal.ads.zzacy.zzc(r6, r2)
            r3 = 7
            r8.zzr(r2, r3)
            int r2 = r0.zzr
            int r2 = r2 + r3
            r0.zzr = r2
        L_0x01b7:
            int r6 = r6 + 7
            goto L_0x01bf
        L_0x01ba:
            if (r14 == 0) goto L_0x01bf
            r14.zzd(r1)
        L_0x01bf:
            int r2 = r0.zzr
            if (r2 >= r6) goto L_0x01da
            int r2 = r6 - r2
            r3 = 0
            int r2 = r8.zzf(r1, r2, r3)
            int r3 = r0.zzq
            int r3 = r3 + r2
            r0.zzq = r3
            int r3 = r0.zzr
            int r3 = r3 + r2
            r0.zzr = r3
            int r3 = r0.zzs
            int r3 = r3 - r2
            r0.zzs = r3
            goto L_0x01bf
        L_0x01da:
            long[] r1 = r11.zzf
            r2 = r1[r9]
            int[] r1 = r11.zzg
            r1 = r1[r9]
            boolean r4 = r0.zzt
            if (r4 != 0) goto L_0x01e9
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r4
        L_0x01e9:
            if (r14 == 0) goto L_0x0207
            r22 = 0
            r23 = 0
            r16 = r14
            r17 = r8
            r18 = r2
            r20 = r1
            r21 = r6
            r16.zzc(r17, r18, r20, r21, r22, r23)
            r1 = 1
            int r9 = r9 + r1
            int r1 = r11.zzb
            if (r9 != r1) goto L_0x0216
            r1 = 0
            r14.zza(r8, r1)
            goto L_0x0216
        L_0x0207:
            r21 = 0
            r22 = 0
            r16 = r8
            r17 = r2
            r19 = r1
            r20 = r6
            r16.zzt(r17, r19, r20, r21, r22)
        L_0x0216:
            int r1 = r5.zze
            r2 = 1
            int r1 = r1 + r2
            r5.zze = r1
            r1 = -1
            r0.zzp = r1
            r1 = 0
            r0.zzq = r1
            r0.zzr = r1
            r0.zzs = r1
            r0.zzt = r1
            r10 = 0
            goto L_0x022f
        L_0x022a:
            r3 = r19
            r2.zza = r3
            r10 = 1
        L_0x022f:
            return r10
        L_0x0230:
            long r5 = r0.zzm
            int r3 = r0.zzn
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r31.zzf()
            long r7 = r7 + r5
            com.google.android.gms.internal.ads.zzen r3 = r0.zzo
            if (r3 == 0) goto L_0x0290
            byte[] r9 = r3.zzN()
            int r10 = r0.zzn
            int r5 = (int) r5
            r1.zzi(r9, r10, r5)
            int r5 = r0.zzl
            if (r5 != r4) goto L_0x0277
            r4 = 1
            r0.zzu = r4
            r3.zzL(r11)
            int r4 = r3.zzg()
            int r4 = zzj(r4)
            if (r4 == 0) goto L_0x025e
            goto L_0x0274
        L_0x025e:
            r4 = 4
            r3.zzM(r4)
        L_0x0262:
            int r4 = r3.zza()
            if (r4 <= 0) goto L_0x0273
            int r4 = r3.zzg()
            int r4 = zzj(r4)
            if (r4 == 0) goto L_0x0262
            goto L_0x0274
        L_0x0273:
            r4 = 0
        L_0x0274:
            r0.zzB = r4
            goto L_0x02a9
        L_0x0277:
            java.util.ArrayDeque r4 = r0.zzg
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x02a9
            java.lang.Object r4 = r4.peek()
            com.google.android.gms.internal.ads.zzfc r4 = (com.google.android.gms.internal.ads.zzfc) r4
            com.google.android.gms.internal.ads.zzfd r5 = new com.google.android.gms.internal.ads.zzfd
            int r6 = r0.zzl
            r5.<init>(r6, r3)
            r4.zzd(r5)
            goto L_0x02a9
        L_0x0290:
            boolean r3 = r0.zzu
            if (r3 != 0) goto L_0x029e
            int r3 = r0.zzl
            r4 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r3 != r4) goto L_0x029e
            r3 = 1
            r0.zzB = r3
        L_0x029e:
            r3 = 262144(0x40000, double:1.295163E-318)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x02ab
            int r3 = (int) r5
            r1.zzk(r3)
        L_0x02a9:
            r13 = 0
            goto L_0x02b3
        L_0x02ab:
            long r3 = r31.zzf()
            long r3 = r3 + r5
            r2.zza = r3
            r13 = 1
        L_0x02b3:
            r0.zzn(r7)
            if (r13 == 0) goto L_0x0006
            int r3 = r0.zzk
            r5 = 2
            if (r3 == r5) goto L_0x0006
            r3 = 1
            return r3
        L_0x02bf:
            r5 = r8
            r3 = r12
            int r8 = r0.zzn
            if (r8 != 0) goto L_0x0329
            com.google.android.gms.internal.ads.zzen r8 = r0.zzf
            byte[] r9 = r8.zzN()
            r10 = 0
            boolean r9 = r1.zzn(r9, r10, r11, r3)
            if (r9 != 0) goto L_0x0317
            int r1 = r0.zzB
            if (r1 != r5) goto L_0x0315
            int r1 = r0.zzb
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0315
            com.google.android.gms.internal.ads.zzady r1 = r0.zzw
            r2 = 4
            com.google.android.gms.internal.ads.zzafb r1 = r1.zzw(r10, r2)
            com.google.android.gms.internal.ads.zzahm r2 = r0.zzC
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L_0x02ed
            r5 = 0
            goto L_0x02f7
        L_0x02ed:
            com.google.android.gms.internal.ads.zzav r5 = new com.google.android.gms.internal.ads.zzav
            r8 = 1
            com.google.android.gms.internal.ads.zzau[] r8 = new com.google.android.gms.internal.ads.zzau[r8]
            r8[r10] = r2
            r5.<init>(r3, r8)
        L_0x02f7:
            com.google.android.gms.internal.ads.zzx r2 = new com.google.android.gms.internal.ads.zzx
            r2.<init>()
            r2.zzaa(r5)
            com.google.android.gms.internal.ads.zzz r2 = r2.zzan()
            r1.zzm(r2)
            com.google.android.gms.internal.ads.zzady r1 = r0.zzw
            r1.zzG()
            com.google.android.gms.internal.ads.zzady r1 = r0.zzw
            com.google.android.gms.internal.ads.zzaet r2 = new com.google.android.gms.internal.ads.zzaet
            r2.<init>(r3, r6)
            r1.zzP(r2)
        L_0x0315:
            r1 = -1
            return r1
        L_0x0317:
            r0.zzn = r11
            r3 = 0
            r8.zzL(r3)
            long r9 = r8.zzu()
            r0.zzm = r9
            int r3 = r8.zzg()
            r0.zzl = r3
        L_0x0329:
            long r8 = r0.zzm
            r12 = 1
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x0346
            com.google.android.gms.internal.ads.zzen r3 = r0.zzf
            byte[] r5 = r3.zzN()
            r1.zzi(r5, r11, r11)
            int r5 = r0.zzn
            int r5 = r5 + r11
            r0.zzn = r5
            long r5 = r3.zzw()
            r0.zzm = r5
            goto L_0x0371
        L_0x0346:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0371
            long r5 = r31.zzd()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0362
            java.util.ArrayDeque r3 = r0.zzg
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzfc r3 = (com.google.android.gms.internal.ads.zzfc) r3
            if (r3 == 0) goto L_0x0361
            long r5 = r3.zza
            goto L_0x0362
        L_0x0361:
            r5 = r7
        L_0x0362:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0371
            long r7 = r31.zzf()
            long r5 = r5 - r7
            int r3 = r0.zzn
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.zzm = r5
        L_0x0371:
            long r5 = r0.zzm
            int r3 = r0.zzn
            long r7 = (long) r3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x04ab
            int r5 = r0.zzl
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x045f
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x045f
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x045f
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x045f
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x045f
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x045f
            if (r5 == r7) goto L_0x045f
            r6 = 1635284069(0x61787465, float:2.8644873E20)
            if (r5 != r6) goto L_0x03a6
            goto L_0x045f
        L_0x03a6:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x042b
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x042b
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r6) goto L_0x042b
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x042b
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x042b
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x042b
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x042b
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x042b
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x042b
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x042b
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x042b
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x042b
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x042b
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x042b
            if (r5 == r4) goto L_0x042b
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x042b
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x042b
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x03fe
            goto L_0x042b
        L_0x03fe:
            long r3 = r31.zzf()
            int r5 = r0.zzn
            long r5 = (long) r5
            long r10 = r3 - r5
            int r3 = r0.zzl
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0423
            long r14 = r10 + r5
            com.google.android.gms.internal.ads.zzahm r3 = new com.google.android.gms.internal.ads.zzahm
            long r7 = r0.zzm
            long r16 = r7 - r5
            r8 = 0
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r3
            r7.<init>(r8, r10, r12, r14, r16)
            r0.zzC = r3
        L_0x0423:
            r3 = 0
            r0.zzo = r3
            r3 = 1
            r0.zzk = r3
            goto L_0x0006
        L_0x042b:
            if (r3 != r11) goto L_0x042f
            r3 = 1
            goto L_0x0430
        L_0x042f:
            r3 = 0
        L_0x0430:
            com.google.android.gms.internal.ads.zzdd.zzf(r3)
            long r3 = r0.zzm
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x043e
            r3 = 1
            goto L_0x043f
        L_0x043e:
            r3 = 0
        L_0x043f:
            com.google.android.gms.internal.ads.zzdd.zzf(r3)
            com.google.android.gms.internal.ads.zzen r3 = new com.google.android.gms.internal.ads.zzen
            long r4 = r0.zzm
            int r4 = (int) r4
            r3.<init>((int) r4)
            com.google.android.gms.internal.ads.zzen r4 = r0.zzf
            byte[] r4 = r4.zzN()
            byte[] r5 = r3.zzN()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r11)
            r0.zzo = r3
            r3 = 1
            r0.zzk = r3
            goto L_0x0006
        L_0x045f:
            long r3 = r31.zzf()
            long r5 = r0.zzm
            long r3 = r3 + r5
            int r8 = r0.zzn
            long r8 = (long) r8
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x048b
            int r5 = r0.zzl
            if (r5 != r7) goto L_0x048b
            com.google.android.gms.internal.ads.zzen r5 = r0.zze
            r5.zzI(r11)
            byte[] r6 = r5.zzN()
            r7 = 0
            r1.zzh(r6, r7, r11)
            com.google.android.gms.internal.ads.zzaix.zzg(r5)
            int r5 = r5.zzc()
            r1.zzk(r5)
            r31.zzj()
        L_0x048b:
            long r3 = r3 - r8
            java.util.ArrayDeque r5 = r0.zzg
            com.google.android.gms.internal.ads.zzfc r6 = new com.google.android.gms.internal.ads.zzfc
            int r7 = r0.zzl
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.zzm
            int r7 = r0.zzn
            long r7 = (long) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x04a6
            r0.zzn(r3)
            goto L_0x0006
        L_0x04a6:
            r30.zzm()
            goto L_0x0006
        L_0x04ab:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajj.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }
}
