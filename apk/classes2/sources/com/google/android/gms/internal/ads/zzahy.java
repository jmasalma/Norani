package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.KotlinVersion;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzahy implements zzadv {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */
    public static final byte[] zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzc = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] zzd = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    /* access modifiers changed from: private */
    public static final UUID zze = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */
    public static final Map zzf;
    private long zzA;
    private boolean zzB;
    private zzahw zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;
    private zzeb zzK;
    private zzeb zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzady zzaj;
    private final zzaht zzak;
    private final zzaia zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzakr zzk;
    private final zzen zzl;
    private final zzen zzm;
    private final zzen zzn;
    private final zzen zzo;
    private final zzen zzp;
    private final zzen zzq;
    private final zzen zzr;
    private final zzen zzs;
    private final zzen zzt;
    private final zzen zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzex.zza;
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzf = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzahy() {
        this(new zzaht(), 2, zzakr.zza);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzp(zzadw zzadw, zzahw zzahw, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzahw.zzc)) {
            zzx(zzadw, zza, i);
            int i3 = this.zzab;
            zzw();
            return i3;
        } else if ("S_TEXT/ASS".equals(zzahw.zzc) || "S_TEXT/SSA".equals(zzahw.zzc)) {
            zzx(zzadw, zzc, i);
            int i4 = this.zzab;
            zzw();
            return i4;
        } else if ("S_TEXT/WEBVTT".equals(zzahw.zzc)) {
            zzx(zzadw, zzd, i);
            int i5 = this.zzab;
            zzw();
            return i5;
        } else {
            zzafb zzafb = zzahw.zzX;
            boolean z2 = true;
            if (!this.zzad) {
                if (zzahw.zzh) {
                    this.zzW &= -1073741825;
                    int i6 = 128;
                    if (!this.zzae) {
                        zzen zzen = this.zzn;
                        zzadw.zzi(zzen.zzN(), 0, 1);
                        this.zzaa++;
                        if ((zzen.zzN()[0] & 128) != 128) {
                            this.zzah = zzen.zzN()[0];
                            this.zzae = true;
                        } else {
                            throw zzaz.zza("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b = this.zzah;
                    if ((b & 1) == 1) {
                        byte b2 = b & 2;
                        this.zzW |= Ints.MAX_POWER_OF_TWO;
                        if (!this.zzai) {
                            zzen zzen2 = this.zzs;
                            zzadw.zzi(zzen2.zzN(), 0, 8);
                            this.zzaa += 8;
                            this.zzai = true;
                            zzen zzen3 = this.zzn;
                            if (b2 != 2) {
                                i6 = 0;
                            }
                            zzen3.zzN()[0] = (byte) (i6 | 8);
                            zzen3.zzL(0);
                            zzafb.zzs(zzen3, 1, 1);
                            this.zzab++;
                            zzen2.zzL(0);
                            zzafb.zzs(zzen2, 8, 1);
                            this.zzab += 8;
                        }
                        if (b2 == 2) {
                            if (!this.zzaf) {
                                zzen zzen4 = this.zzn;
                                zzadw.zzi(zzen4.zzN(), 0, 1);
                                this.zzaa++;
                                zzen4.zzL(0);
                                this.zzag = zzen4.zzm();
                                this.zzaf = true;
                            }
                            int i7 = this.zzag * 4;
                            zzen zzen5 = this.zzn;
                            zzen5.zzI(i7);
                            zzadw.zzi(zzen5.zzN(), 0, i7);
                            this.zzaa += i7;
                            int i8 = (this.zzag >> 1) + 1;
                            int i9 = (i8 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.zzv = ByteBuffer.allocate(i9);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i8);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                i2 = this.zzag;
                                if (i10 >= i2) {
                                    break;
                                }
                                int zzp2 = zzen5.zzp();
                                int i12 = zzp2 - i11;
                                if (i10 % 2 == 0) {
                                    this.zzv.putShort((short) i12);
                                } else {
                                    this.zzv.putInt(i12);
                                }
                                i10++;
                                i11 = zzp2;
                            }
                            int i13 = (i - this.zzaa) - i11;
                            if ((i2 & 1) == 1) {
                                this.zzv.putInt(i13);
                            } else {
                                this.zzv.putShort((short) i13);
                                this.zzv.putInt(0);
                            }
                            zzen zzen6 = this.zzt;
                            zzen6.zzJ(this.zzv.array(), i9);
                            zzafb.zzs(zzen6, i9, 1);
                            this.zzab += i9;
                        }
                    }
                } else {
                    byte[] bArr = zzahw.zzi;
                    if (bArr != null) {
                        this.zzq.zzJ(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzahw.zzc) ? zzahw.zzg > 0 : z) {
                    this.zzW |= 268435456;
                    this.zzu.zzI(0);
                    int zzd2 = (this.zzq.zzd() + i) - this.zzaa;
                    zzen zzen7 = this.zzn;
                    zzen7.zzI(4);
                    zzen7.zzN()[0] = (byte) ((zzd2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    zzen7.zzN()[1] = (byte) ((zzd2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    zzen7.zzN()[2] = (byte) ((zzd2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    zzen7.zzN()[3] = (byte) (zzd2 & KotlinVersion.MAX_COMPONENT_VALUE);
                    zzafb.zzs(zzen7, 4, 2);
                    this.zzab += 4;
                }
                this.zzad = true;
            }
            zzen zzen8 = this.zzq;
            int zzd3 = i + zzen8.zzd();
            if (!"V_MPEG4/ISO/AVC".equals(zzahw.zzc) && !"V_MPEGH/ISO/HEVC".equals(zzahw.zzc)) {
                if (zzahw.zzU != null) {
                    if (zzen8.zzd() != 0) {
                        z2 = false;
                    }
                    zzdd.zzf(z2);
                    zzahw.zzU.zzd(zzadw);
                }
                while (true) {
                    int i14 = this.zzaa;
                    if (i14 >= zzd3) {
                        break;
                    }
                    int zzq2 = zzq(zzadw, zzafb, zzd3 - i14);
                    this.zzaa += zzq2;
                    this.zzab += zzq2;
                }
            } else {
                zzen zzen9 = this.zzm;
                byte[] zzN2 = zzen9.zzN();
                zzN2[0] = 0;
                zzN2[1] = 0;
                zzN2[2] = 0;
                int i15 = zzahw.zzY;
                int i16 = 4 - i15;
                while (this.zzaa < zzd3) {
                    int i17 = this.zzac;
                    if (i17 == 0) {
                        int min = Math.min(i15, zzen8.zza());
                        zzadw.zzi(zzN2, i16 + min, i15 - min);
                        if (min > 0) {
                            zzen8.zzH(zzN2, i16, min);
                        }
                        this.zzaa += i15;
                        zzen9.zzL(0);
                        this.zzac = zzen9.zzp();
                        zzen zzen10 = this.zzl;
                        zzen10.zzL(0);
                        zzafb.zzr(zzen10, 4);
                        this.zzab += 4;
                    } else {
                        int zzq3 = zzq(zzadw, zzafb, i17);
                        this.zzaa += zzq3;
                        this.zzab += zzq3;
                        this.zzac -= zzq3;
                    }
                }
            }
            if ("A_VORBIS".equals(zzahw.zzc)) {
                zzen zzen11 = this.zzo;
                zzen11.zzL(0);
                zzafb.zzr(zzen11, 4);
                this.zzab += 4;
            }
            int i18 = this.zzab;
            zzw();
            return i18;
        }
    }

    private final int zzq(zzadw zzadw, zzafb zzafb, int i) throws IOException {
        zzen zzen = this.zzq;
        int zza2 = zzen.zza();
        if (zza2 <= 0) {
            return zzafb.zzf(zzadw, i, false);
        }
        int min = Math.min(i, zza2);
        zzafb.zzr(zzen, min);
        return min;
    }

    private final long zzr(long j) throws zzaz {
        long j2 = this.zzy;
        if (j2 != -9223372036854775807L) {
            return zzex.zzu(j, j2, 1000, RoundingMode.DOWN);
        }
        throw zzaz.zza("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzs(int i) throws zzaz {
        if (this.zzK == null || this.zzL == null) {
            throw zzaz.zza("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzt(int i) throws zzaz {
        if (this.zzC == null) {
            throw zzaz.zza("Element " + i + " must be in a TrackEntry", (Throwable) null);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f6  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzu(com.google.android.gms.internal.ads.zzahw r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.gms.internal.ads.zzafc r2 = r1.zzU
            r9 = 1
            if (r2 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzafb r3 = r1.zzX
            com.google.android.gms.internal.ads.zzafa r8 = r1.zzj
            r1 = r2
            r2 = r3
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r1.zzc(r2, r3, r5, r6, r7, r8)
            goto L_0x011c
        L_0x001c:
            java.lang.String r2 = r1.zzc
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            java.lang.String r4 = "S_TEXT/WEBVTT"
            java.lang.String r5 = "S_TEXT/SSA"
            java.lang.String r6 = "S_TEXT/ASS"
            r7 = 0
            r8 = 2
            if (r2 != 0) goto L_0x0046
            java.lang.String r2 = r1.zzc
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0046
            java.lang.String r2 = r1.zzc
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0046
            java.lang.String r2 = r1.zzc
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0062
        L_0x0046:
            int r2 = r0.zzS
            java.lang.String r10 = "MatroskaExtractor"
            if (r2 <= r9) goto L_0x0052
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            com.google.android.gms.internal.ads.zzea.zzf(r10, r2)
            goto L_0x0062
        L_0x0052:
            long r11 = r0.zzQ
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0066
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            com.google.android.gms.internal.ads.zzea.zzf(r10, r2)
        L_0x0062:
            r2 = r22
            goto L_0x00f0
        L_0x0066:
            java.lang.String r2 = r1.zzc
            com.google.android.gms.internal.ads.zzen r10 = r0.zzr
            byte[] r13 = r10.zzN()
            int r14 = r2.hashCode()
            r15 = 3
            switch(r14) {
                case 738597099: goto L_0x008f;
                case 738614379: goto L_0x0087;
                case 1045209816: goto L_0x007f;
                case 1422270023: goto L_0x0077;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x0097
        L_0x0077:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0097
            r2 = r7
            goto L_0x0098
        L_0x007f:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0097
            r2 = r15
            goto L_0x0098
        L_0x0087:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0097
            r2 = r8
            goto L_0x0098
        L_0x008f:
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0097
            r2 = r9
            goto L_0x0098
        L_0x0097:
            r2 = -1
        L_0x0098:
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x00bc
            if (r2 == r9) goto L_0x00b1
            if (r2 == r8) goto L_0x00b1
            if (r2 != r15) goto L_0x00ab
            java.lang.String r2 = "%02d:%02d:%02d.%03d"
            byte[] r2 = zzy(r11, r2, r3)
            r3 = 25
            goto L_0x00c4
        L_0x00ab:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x00b1:
            java.lang.String r2 = "%01d:%02d:%02d:%02d"
            r3 = 10000(0x2710, double:4.9407E-320)
            byte[] r2 = zzy(r11, r2, r3)
            r3 = 21
            goto L_0x00c4
        L_0x00bc:
            java.lang.String r2 = "%02d:%02d:%02d,%03d"
            byte[] r2 = zzy(r11, r2, r3)
            r3 = 19
        L_0x00c4:
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r7, r13, r3, r4)
            int r2 = r10.zzc()
        L_0x00cc:
            int r3 = r10.zzd()
            if (r2 >= r3) goto L_0x00e1
            byte[] r3 = r10.zzN()
            byte r3 = r3[r2]
            if (r3 != 0) goto L_0x00de
            r10.zzK(r2)
            goto L_0x00e1
        L_0x00de:
            int r2 = r2 + 1
            goto L_0x00cc
        L_0x00e1:
            com.google.android.gms.internal.ads.zzafb r2 = r1.zzX
            int r3 = r10.zzd()
            r2.zzr(r10, r3)
            int r2 = r10.zzd()
            int r2 = r22 + r2
        L_0x00f0:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto L_0x010c
            int r3 = r0.zzS
            if (r3 <= r9) goto L_0x0100
            com.google.android.gms.internal.ads.zzen r3 = r0.zzu
            r3.zzI(r7)
            goto L_0x010c
        L_0x0100:
            com.google.android.gms.internal.ads.zzen r3 = r0.zzu
            int r4 = r3.zzd()
            com.google.android.gms.internal.ads.zzafb r5 = r1.zzX
            r5.zzs(r3, r4, r8)
            int r2 = r2 + r4
        L_0x010c:
            r14 = r2
            com.google.android.gms.internal.ads.zzafb r10 = r1.zzX
            com.google.android.gms.internal.ads.zzafa r1 = r1.zzj
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.zzt(r11, r13, r14, r15, r16)
        L_0x011c:
            r0.zzN = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzu(com.google.android.gms.internal.ads.zzahw, long, int, int, int):void");
    }

    private final void zzv(zzadw zzadw, int i) throws IOException {
        zzen zzen = this.zzn;
        if (zzen.zzd() < i) {
            if (zzen.zzb() < i) {
                int zzb2 = zzen.zzb();
                zzen.zzF(Math.max(zzb2 + zzb2, i));
            }
            zzadw.zzi(zzen.zzN(), zzen.zzd(), i - zzen.zzd());
            zzen.zzK(i);
        }
    }

    private final void zzw() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = false;
        this.zzq.zzI(0);
    }

    private final void zzx(zzadw zzadw, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        zzen zzen = this.zzr;
        if (zzen.zzb() < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzen.zzJ(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzen.zzN(), 0, length);
        }
        zzadw.zzi(zzen.zzN(), length, i);
        zzen.zzL(0);
        zzen.zzK(i2);
    }

    private static byte[] zzy(long j, String str, long j2) {
        zzdd.zzd(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, new Object[]{valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))});
        String str2 = zzex.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    public final int zzb(zzadw zzadw, zzaer zzaer) throws IOException {
        int i = 0;
        this.zzN = false;
        while (!this.zzN) {
            if (this.zzak.zzc(zzadw)) {
                long zzf2 = zzadw.zzf();
                if (this.zzG) {
                    this.zzI = zzf2;
                    zzaer.zza = this.zzH;
                    this.zzG = false;
                    return 1;
                } else if (this.zzD) {
                    long j = this.zzI;
                    if (j != -1) {
                        zzaer.zza = j;
                        this.zzI = -1;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzh;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzahw zzahw = (zzahw) sparseArray.valueAt(i);
                    zzahw.zzX.getClass();
                    zzafc zzafc = zzahw.zzU;
                    if (zzafc != null) {
                        zzafc.zza(zzahw.zzX, zzahw.zzj);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        if (this.zzj) {
            zzady = new zzaku(zzady, this.zzk);
        }
        this.zzaj = zzady;
    }

    public final void zzf(long j, long j2) {
        this.zzJ = -9223372036854775807L;
        int i = 0;
        this.zzO = 0;
        this.zzak.zzb();
        this.zzg.zze();
        zzw();
        while (true) {
            SparseArray sparseArray = this.zzh;
            if (i < sparseArray.size()) {
                zzafc zzafc = ((zzahw) sparseArray.valueAt(i)).zzU;
                if (zzafc != null) {
                    zzafc.zzb();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        return new zzahz().zza(zzadw);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01de, code lost:
        if (r1.equals("V_MPEGH/ISO/HEVC") != false) goto L_0x0317;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(int r19) throws com.google.android.gms.internal.ads.zzaz {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            com.google.android.gms.internal.ads.zzady r1 = r7.zzaj
            com.google.android.gms.internal.ads.zzdd.zzb(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 8
            java.lang.String r3 = "A_OPUS"
            r4 = 0
            r6 = 2
            r8 = 1
            r9 = 0
            if (r0 == r1) goto L_0x0333
            r1 = 174(0xae, float:2.44E-43)
            r10 = -1
            r11 = 0
            if (r0 == r1) goto L_0x017e
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r2 = -1
            r6 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x0168
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x0139
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0123
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x010b
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00f6
            if (r0 == r6) goto L_0x0040
            goto L_0x03aa
        L_0x0040:
            boolean r0 = r7.zzD
            if (r0 != 0) goto L_0x00f1
            com.google.android.gms.internal.ads.zzady r0 = r7.zzaj
            com.google.android.gms.internal.ads.zzeb r1 = r7.zzK
            com.google.android.gms.internal.ads.zzeb r6 = r7.zzL
            long r14 = r7.zzx
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00e5
            long r2 = r7.zzA
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x00e5
            if (r1 == 0) goto L_0x00e5
            int r2 = r1.zza()
            if (r2 == 0) goto L_0x00e5
            if (r6 == 0) goto L_0x00e5
            int r2 = r6.zza()
            int r3 = r1.zza()
            if (r2 == r3) goto L_0x006c
            goto L_0x00e5
        L_0x006c:
            int r2 = r1.zza()
            int[] r3 = new int[r2]
            long[] r4 = new long[r2]
            long[] r5 = new long[r2]
            long[] r12 = new long[r2]
            r13 = r9
        L_0x0079:
            if (r13 >= r2) goto L_0x008e
            long r14 = r1.zzb(r13)
            r12[r13] = r14
            long r14 = r7.zzx
            long r16 = r6.zzb(r13)
            long r14 = r14 + r16
            r4[r13] = r14
            int r13 = r13 + 1
            goto L_0x0079
        L_0x008e:
            int r1 = r2 + -1
            if (r9 >= r1) goto L_0x00a5
            int r1 = r9 + 1
            r13 = r4[r1]
            r15 = r4[r9]
            long r13 = r13 - r15
            int r6 = (int) r13
            r3[r9] = r6
            r13 = r12[r1]
            r15 = r12[r9]
            long r13 = r13 - r15
            r5[r9] = r13
            r9 = r1
            goto L_0x008e
        L_0x00a5:
            r2 = r1
        L_0x00a6:
            if (r2 <= 0) goto L_0x00b3
            r9 = r12[r2]
            long r13 = r7.zzA
            int r6 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x00b3
            int r2 = r2 + -1
            goto L_0x00a6
        L_0x00b3:
            long r9 = r7.zzx
            long r13 = r7.zzw
            long r9 = r9 + r13
            r13 = r4[r2]
            long r9 = r9 - r13
            int r6 = (int) r9
            r3[r2] = r6
            long r9 = r7.zzA
            r13 = r12[r2]
            long r9 = r9 - r13
            r5[r2] = r9
            if (r2 >= r1) goto L_0x00df
            java.lang.String r1 = "MatroskaExtractor"
            java.lang.String r6 = "Discarding trailing cue points with timestamps greater than total duration"
            com.google.android.gms.internal.ads.zzea.zzf(r1, r6)
            int r2 = r2 + r8
            int[] r3 = java.util.Arrays.copyOf(r3, r2)
            long[] r4 = java.util.Arrays.copyOf(r4, r2)
            long[] r5 = java.util.Arrays.copyOf(r5, r2)
            long[] r12 = java.util.Arrays.copyOf(r12, r2)
        L_0x00df:
            com.google.android.gms.internal.ads.zzadi r1 = new com.google.android.gms.internal.ads.zzadi
            r1.<init>(r3, r4, r5, r12)
            goto L_0x00ec
        L_0x00e5:
            com.google.android.gms.internal.ads.zzaet r1 = new com.google.android.gms.internal.ads.zzaet
            long r2 = r7.zzA
            r1.<init>(r2, r4)
        L_0x00ec:
            r0.zzP(r1)
            r7.zzD = r8
        L_0x00f1:
            r7.zzK = r11
            r7.zzL = r11
            return
        L_0x00f6:
            android.util.SparseArray r0 = r7.zzh
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0104
            com.google.android.gms.internal.ads.zzady r0 = r7.zzaj
            r0.zzG()
            return
        L_0x0104:
            java.lang.String r0 = "No valid tracks were found"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r11)
            throw r0
        L_0x010b:
            long r0 = r7.zzy
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0116
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.zzy = r0
        L_0x0116:
            long r0 = r7.zzz
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x03aa
            long r0 = r7.zzr(r0)
            r7.zzA = r0
            return
        L_0x0123:
            r18.zzt(r19)
            com.google.android.gms.internal.ads.zzahw r0 = r7.zzC
            boolean r1 = r0.zzh
            if (r1 == 0) goto L_0x03aa
            byte[] r0 = r0.zzi
            if (r0 != 0) goto L_0x0132
            goto L_0x03aa
        L_0x0132:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r11)
            throw r0
        L_0x0139:
            r18.zzt(r19)
            com.google.android.gms.internal.ads.zzahw r0 = r7.zzC
            boolean r1 = r0.zzh
            if (r1 == 0) goto L_0x03aa
            com.google.android.gms.internal.ads.zzafa r1 = r0.zzj
            if (r1 == 0) goto L_0x0161
            com.google.android.gms.internal.ads.zzs r1 = new com.google.android.gms.internal.ads.zzs
            com.google.android.gms.internal.ads.zzr[] r2 = new com.google.android.gms.internal.ads.zzr[r8]
            com.google.android.gms.internal.ads.zzr r3 = new com.google.android.gms.internal.ads.zzr
            java.util.UUID r4 = com.google.android.gms.internal.ads.zzh.zza
            com.google.android.gms.internal.ads.zzahw r5 = r7.zzC
            com.google.android.gms.internal.ads.zzafa r5 = r5.zzj
            byte[] r5 = r5.zzb
            java.lang.String r6 = "video/webm"
            r3.<init>(r4, r11, r6, r5)
            r2[r9] = r3
            r1.<init>(r11, r2)
            r0.zzl = r1
            return
        L_0x0161:
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r11)
            throw r0
        L_0x0168:
            int r0 = r7.zzE
            if (r0 == r10) goto L_0x0177
            long r4 = r7.zzF
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0177
            if (r0 != r6) goto L_0x03aa
            r7.zzH = r4
            return
        L_0x0177:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r11)
            throw r0
        L_0x017e:
            com.google.android.gms.internal.ads.zzahw r0 = r7.zzC
            com.google.android.gms.internal.ads.zzdd.zzb(r0)
            r1 = r0
            com.google.android.gms.internal.ads.zzahw r1 = (com.google.android.gms.internal.ads.zzahw) r1
            java.lang.String r1 = r0.zzc
            if (r1 == 0) goto L_0x032c
            int r4 = r1.hashCode()
            switch(r4) {
                case -2095576542: goto L_0x030c;
                case -2095575984: goto L_0x0302;
                case -1985379776: goto L_0x02f7;
                case -1784763192: goto L_0x02ec;
                case -1730367663: goto L_0x02e1;
                case -1482641358: goto L_0x02d6;
                case -1482641357: goto L_0x02cb;
                case -1373388978: goto L_0x02c0;
                case -933872740: goto L_0x02b5;
                case -538363189: goto L_0x02aa;
                case -538363109: goto L_0x029f;
                case -425012669: goto L_0x0293;
                case -356037306: goto L_0x0287;
                case 62923557: goto L_0x027b;
                case 62923603: goto L_0x026f;
                case 62927045: goto L_0x0263;
                case 82318131: goto L_0x0258;
                case 82338133: goto L_0x024d;
                case 82338134: goto L_0x0242;
                case 99146302: goto L_0x0236;
                case 444813526: goto L_0x022a;
                case 542569478: goto L_0x021e;
                case 635596514: goto L_0x0212;
                case 725948237: goto L_0x0206;
                case 725957860: goto L_0x01fa;
                case 738597099: goto L_0x01ee;
                case 738614379: goto L_0x01e2;
                case 855502857: goto L_0x01d8;
                case 1045209816: goto L_0x01cc;
                case 1422270023: goto L_0x01c0;
                case 1809237540: goto L_0x01b5;
                case 1950749482: goto L_0x01a9;
                case 1950789798: goto L_0x019d;
                case 1951062397: goto L_0x0193;
                default: goto L_0x0191;
            }
        L_0x0191:
            goto L_0x0316
        L_0x0193:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0316
            r2 = 11
            goto L_0x0317
        L_0x019d:
            java.lang.String r2 = "A_FLAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 22
            goto L_0x0317
        L_0x01a9:
            java.lang.String r2 = "A_EAC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 17
            goto L_0x0317
        L_0x01b5:
            java.lang.String r2 = "V_MPEG2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 3
            goto L_0x0317
        L_0x01c0:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 27
            goto L_0x0317
        L_0x01cc:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 30
            goto L_0x0317
        L_0x01d8:
            java.lang.String r3 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0316
            goto L_0x0317
        L_0x01e2:
            java.lang.String r2 = "S_TEXT/SSA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 29
            goto L_0x0317
        L_0x01ee:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 28
            goto L_0x0317
        L_0x01fa:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 24
            goto L_0x0317
        L_0x0206:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 25
            goto L_0x0317
        L_0x0212:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 26
            goto L_0x0317
        L_0x021e:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 20
            goto L_0x0317
        L_0x022a:
            java.lang.String r2 = "V_THEORA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 10
            goto L_0x0317
        L_0x0236:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 32
            goto L_0x0317
        L_0x0242:
            java.lang.String r2 = "V_VP9"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = r8
            goto L_0x0317
        L_0x024d:
            java.lang.String r2 = "V_VP8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = r9
            goto L_0x0317
        L_0x0258:
            java.lang.String r2 = "V_AV1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = r6
            goto L_0x0317
        L_0x0263:
            java.lang.String r2 = "A_DTS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 19
            goto L_0x0317
        L_0x026f:
            java.lang.String r2 = "A_AC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 16
            goto L_0x0317
        L_0x027b:
            java.lang.String r2 = "A_AAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 13
            goto L_0x0317
        L_0x0287:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 21
            goto L_0x0317
        L_0x0293:
            java.lang.String r2 = "S_VOBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 31
            goto L_0x0317
        L_0x029f:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 7
            goto L_0x0317
        L_0x02aa:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 5
            goto L_0x0317
        L_0x02b5:
            java.lang.String r2 = "S_DVBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 33
            goto L_0x0317
        L_0x02c0:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 9
            goto L_0x0317
        L_0x02cb:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 15
            goto L_0x0317
        L_0x02d6:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 14
            goto L_0x0317
        L_0x02e1:
            java.lang.String r2 = "A_VORBIS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 12
            goto L_0x0317
        L_0x02ec:
            java.lang.String r2 = "A_TRUEHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 18
            goto L_0x0317
        L_0x02f7:
            java.lang.String r2 = "A_MS/ACM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 23
            goto L_0x0317
        L_0x0302:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 4
            goto L_0x0317
        L_0x030c:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0316
            r2 = 6
            goto L_0x0317
        L_0x0316:
            r2 = r10
        L_0x0317:
            switch(r2) {
                case 0: goto L_0x031b;
                case 1: goto L_0x031b;
                case 2: goto L_0x031b;
                case 3: goto L_0x031b;
                case 4: goto L_0x031b;
                case 5: goto L_0x031b;
                case 6: goto L_0x031b;
                case 7: goto L_0x031b;
                case 8: goto L_0x031b;
                case 9: goto L_0x031b;
                case 10: goto L_0x031b;
                case 11: goto L_0x031b;
                case 12: goto L_0x031b;
                case 13: goto L_0x031b;
                case 14: goto L_0x031b;
                case 15: goto L_0x031b;
                case 16: goto L_0x031b;
                case 17: goto L_0x031b;
                case 18: goto L_0x031b;
                case 19: goto L_0x031b;
                case 20: goto L_0x031b;
                case 21: goto L_0x031b;
                case 22: goto L_0x031b;
                case 23: goto L_0x031b;
                case 24: goto L_0x031b;
                case 25: goto L_0x031b;
                case 26: goto L_0x031b;
                case 27: goto L_0x031b;
                case 28: goto L_0x031b;
                case 29: goto L_0x031b;
                case 30: goto L_0x031b;
                case 31: goto L_0x031b;
                case 32: goto L_0x031b;
                case 33: goto L_0x031b;
                default: goto L_0x031a;
            }
        L_0x031a:
            goto L_0x0329
        L_0x031b:
            com.google.android.gms.internal.ads.zzady r1 = r7.zzaj
            int r2 = r0.zzd
            r0.zze(r1, r2)
            android.util.SparseArray r1 = r7.zzh
            int r2 = r0.zzd
            r1.put(r2, r0)
        L_0x0329:
            r7.zzC = r11
            return
        L_0x032c:
            java.lang.String r0 = "CodecId is missing in TrackEntry element"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r11)
            throw r0
        L_0x0333:
            int r0 = r7.zzO
            if (r0 != r6) goto L_0x03aa
            android.util.SparseArray r0 = r7.zzh
            int r1 = r7.zzU
            java.lang.Object r0 = r0.get(r1)
            r10 = r0
            com.google.android.gms.internal.ads.zzahw r10 = (com.google.android.gms.internal.ads.zzahw) r10
            r10.zzX.getClass()
            long r0 = r7.zzZ
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x036d
            java.lang.String r0 = r10.zzc
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x036d
            com.google.android.gms.internal.ads.zzen r0 = r7.zzu
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            long r2 = r7.zzZ
            java.nio.ByteBuffer r1 = r1.putLong(r2)
            byte[] r1 = r1.array()
            int r2 = r1.length
            r0.zzJ(r1, r2)
        L_0x036d:
            r0 = r9
            r1 = r0
        L_0x036f:
            int r2 = r7.zzS
            if (r0 >= r2) goto L_0x037b
            int[] r2 = r7.zzT
            r2 = r2[r0]
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L_0x036f
        L_0x037b:
            r0 = r9
        L_0x037c:
            int r2 = r7.zzS
            if (r0 >= r2) goto L_0x03a8
            long r2 = r7.zzP
            int r4 = r10.zzf
            int r4 = r4 * r0
            int r4 = r4 / 1000
            long r4 = (long) r4
            long r2 = r2 + r4
            int r4 = r7.zzW
            if (r0 != 0) goto L_0x0396
            boolean r0 = r7.zzY
            if (r0 != 0) goto L_0x0394
            r0 = r4 | 1
            r4 = r0
        L_0x0394:
            r11 = r9
            goto L_0x0397
        L_0x0396:
            r11 = r0
        L_0x0397:
            int[] r0 = r7.zzT
            r5 = r0[r11]
            int r12 = r1 - r5
            r0 = r18
            r1 = r10
            r6 = r12
            r0.zzu(r1, r2, r4, r5, r6)
            int r0 = r11 + 1
            r1 = r12
            goto L_0x037c
        L_0x03a8:
            r7.zzO = r9
        L_0x03aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzj(int):void");
    }

    /* access modifiers changed from: protected */
    public final void zzm(int i, long j, long j2) throws zzaz {
        zzdd.zzb(this.zzaj);
        if (i == 160) {
            this.zzY = false;
            this.zzZ = 0;
        } else if (i == 174) {
            zzahw zzahw = new zzahw();
            this.zzC = zzahw;
            zzahw.zza = this.zzB;
        } else if (i == 187) {
            this.zzM = false;
        } else if (i == 19899) {
            this.zzE = -1;
            this.zzF = -1;
        } else if (i == 20533) {
            zzt(i);
            this.zzC.zzh = true;
        } else if (i == 21968) {
            zzt(i);
            this.zzC.zzy = true;
        } else if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 == -1 || j3 == j) {
                this.zzx = j;
                this.zzw = j2;
                return;
            }
            throw zzaz.zza("Multiple Segment elements not supported", (Throwable) null);
        } else if (i == 475249515) {
            this.zzK = new zzeb(32);
            this.zzL = new zzeb(32);
        } else if (i != 524531317 || this.zzD) {
        } else {
            if (!this.zzi || this.zzH == -1) {
                this.zzaj.zzP(new zzaet(this.zzA, 0));
                this.zzD = true;
                return;
            }
            this.zzG = true;
        }
    }

    zzahy(zzaht zzaht, int i, zzakr zzakr) {
        this.zzx = -1;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzH = -1;
        this.zzI = -1;
        this.zzJ = -9223372036854775807L;
        this.zzak = zzaht;
        zzaht.zza(new zzahv(this, (zzahx) null));
        this.zzk = zzakr;
        boolean z = false;
        this.zzi = 1 == ((i & 1) ^ 1);
        this.zzj = (i & 2) == 0 ? true : z;
        this.zzg = new zzaia();
        this.zzh = new SparseArray();
        this.zzn = new zzen(4);
        this.zzo = new zzen(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzen(4);
        this.zzl = new zzen(zzfv.zza);
        this.zzm = new zzen(4);
        this.zzq = new zzen();
        this.zzr = new zzen();
        this.zzs = new zzen(8);
        this.zzt = new zzen();
        this.zzu = new zzen();
        this.zzT = new int[1];
    }

    /* access modifiers changed from: protected */
    public final void zzn(int i, String str) throws zzaz {
        if (i == 134) {
            zzt(i);
            this.zzC.zzc = str;
        } else if (i != 17026) {
            if (i == 21358) {
                zzt(i);
                this.zzC.zzb = str;
            } else if (i == 2274716) {
                zzt(i);
                this.zzC.zzaa = str;
            }
        } else if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzB = Objects.equals(str, "webm");
        } else {
            throw zzaz.zza("DocType " + str + " not supported", (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzh(int i, int i2, zzadw zzadw) throws IOException {
        zzahw zzahw;
        int i3;
        zzahw zzahw2;
        int i4;
        zzahw zzahw3;
        long j;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i2;
        zzadw zzadw2 = zzadw;
        int i10 = 1;
        int i11 = 0;
        if (i8 == 161 || i8 == 163) {
            int i12 = 8;
            if (this.zzO == 0) {
                zzaia zzaia = this.zzg;
                this.zzU = (int) zzaia.zzd(zzadw2, false, true, 8);
                this.zzV = zzaia.zza();
                this.zzQ = -9223372036854775807L;
                this.zzO = 1;
                this.zzn.zzI(0);
            }
            zzahw zzahw4 = (zzahw) this.zzh.get(this.zzU);
            if (zzahw4 == null) {
                zzadw2.zzk(i9 - this.zzV);
                this.zzO = 0;
                return;
            }
            zzahw4.zzX.getClass();
            if (this.zzO == 1) {
                zzv(zzadw2, 3);
                zzen zzen = this.zzn;
                int i13 = (zzen.zzN()[2] & 6) >> 1;
                if (i13 == 0) {
                    this.zzS = 1;
                    int[] zzz2 = zzz(this.zzT, 1);
                    this.zzT = zzz2;
                    zzz2[0] = (i9 - this.zzV) - 3;
                } else {
                    zzv(zzadw2, 4);
                    int i14 = (zzen.zzN()[3] & 255) + 1;
                    this.zzS = i14;
                    int[] zzz3 = zzz(this.zzT, i14);
                    this.zzT = zzz3;
                    if (i13 == 2) {
                        int i15 = this.zzS;
                        Arrays.fill(zzz3, 0, i15, ((i9 - this.zzV) - 4) / i15);
                    } else if (i13 == 1) {
                        int i16 = 0;
                        int i17 = 0;
                        int i18 = 4;
                        while (true) {
                            i5 = this.zzS - 1;
                            if (i16 >= i5) {
                                break;
                            }
                            this.zzT[i16] = 0;
                            while (true) {
                                i6 = i18 + 1;
                                zzv(zzadw2, i6);
                                byte b = zzen.zzN()[i18] & 255;
                                int[] iArr = this.zzT;
                                i7 = iArr[i16] + b;
                                iArr[i16] = i7;
                                if (b != 255) {
                                    break;
                                }
                                i18 = i6;
                            }
                            i17 += i7;
                            i16++;
                            i18 = i6;
                        }
                        this.zzT[i5] = ((i9 - this.zzV) - i18) - i17;
                    } else if (i13 == 3) {
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 4;
                        while (true) {
                            int i22 = this.zzS - 1;
                            if (i19 >= i22) {
                                zzahw2 = zzahw4;
                                this.zzT[i22] = ((i9 - this.zzV) - i21) - i20;
                                break;
                            }
                            this.zzT[i19] = i11;
                            int i23 = i21 + 1;
                            zzv(zzadw2, i23);
                            if (zzen.zzN()[i21] != 0) {
                                int i24 = i11;
                                while (true) {
                                    if (i24 >= i12) {
                                        zzahw3 = zzahw4;
                                        j = 0;
                                        break;
                                    }
                                    int i25 = i10 << (7 - i24);
                                    if ((zzen.zzN()[i21] & i25) != 0) {
                                        i23 += i24;
                                        zzv(zzadw2, i23);
                                        j = (long) (zzen.zzN()[i21] & 255 & (~i25));
                                        int i26 = i21 + 1;
                                        while (i26 < i23) {
                                            j = (j << i12) | ((long) (zzen.zzN()[i26] & 255));
                                            i26++;
                                            zzahw4 = zzahw4;
                                            i12 = 8;
                                        }
                                        zzahw3 = zzahw4;
                                        if (i19 > 0) {
                                            j -= (1 << ((i24 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        zzahw zzahw5 = zzahw4;
                                        i24++;
                                        i10 = 1;
                                        i12 = 8;
                                    }
                                }
                                i21 = i23;
                                if (j >= -2147483648L && j <= 2147483647L) {
                                    int[] iArr2 = this.zzT;
                                    int i27 = (int) j;
                                    if (i19 != 0) {
                                        i27 += iArr2[i19 - 1];
                                    }
                                    iArr2[i19] = i27;
                                    i20 += i27;
                                    i19++;
                                    zzahw4 = zzahw3;
                                    i10 = 1;
                                    i11 = 0;
                                    i12 = 8;
                                }
                            } else {
                                throw zzaz.zza("No valid varint length mask found", (Throwable) null);
                            }
                        }
                        throw zzaz.zza("EBML lacing sample size out of range.", (Throwable) null);
                    } else {
                        throw zzaz.zza("Unexpected lacing value: 2", (Throwable) null);
                    }
                }
                zzahw2 = zzahw4;
                this.zzP = this.zzJ + zzr((long) ((zzen.zzN()[0] << 8) | (zzen.zzN()[1] & 255)));
                zzahw = zzahw2;
                if (zzahw.zze != 2) {
                    if (i8 == 163) {
                        if ((zzen.zzN()[2] & 128) == 128) {
                            i8 = 163;
                        } else {
                            i8 = 163;
                        }
                    }
                    i4 = 0;
                    this.zzW = i4;
                    this.zzO = 2;
                    this.zzR = 0;
                    i3 = 163;
                }
                i4 = 1;
                this.zzW = i4;
                this.zzO = 2;
                this.zzR = 0;
                i3 = 163;
            } else {
                zzahw = zzahw4;
                i3 = 163;
            }
            if (i8 == i3) {
                while (true) {
                    int i28 = this.zzR;
                    if (i28 < this.zzS) {
                        zzu(zzahw, ((long) ((this.zzR * zzahw.zzf) / zzbcj.zzq.zzf)) + this.zzP, this.zzW, zzp(zzadw2, zzahw, this.zzT[i28], false), 0);
                        this.zzR++;
                    } else {
                        this.zzO = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i29 = this.zzR;
                    if (i29 < this.zzS) {
                        int[] iArr3 = this.zzT;
                        iArr3[i29] = zzp(zzadw2, zzahw, iArr3[i29], true);
                        this.zzR++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i8 != 165) {
            if (i8 == 16877) {
                zzt(i);
                zzahw zzahw6 = this.zzC;
                if (zzahw6.zzZ == 1685485123 || zzahw6.zzZ == 1685480259) {
                    zzahw6.zzO = new byte[i9];
                    zzadw2.zzi(zzahw6.zzO, 0, i9);
                    return;
                }
                zzadw2.zzk(i9);
            } else if (i8 == 16981) {
                zzt(i);
                zzahw zzahw7 = this.zzC;
                zzahw7.zzi = new byte[i9];
                zzadw2.zzi(zzahw7.zzi, 0, i9);
            } else if (i8 == 18402) {
                byte[] bArr = new byte[i9];
                zzadw2.zzi(bArr, 0, i9);
                zzt(i);
                this.zzC.zzj = new zzafa(1, bArr, 0, 0);
            } else if (i8 == 21419) {
                zzen zzen2 = this.zzp;
                Arrays.fill(zzen2.zzN(), (byte) 0);
                zzadw2.zzi(zzen2.zzN(), 4 - i9, i9);
                zzen2.zzL(0);
                this.zzE = (int) zzen2.zzu();
            } else if (i8 == 25506) {
                zzt(i);
                zzahw zzahw8 = this.zzC;
                zzahw8.zzk = new byte[i9];
                zzadw2.zzi(zzahw8.zzk, 0, i9);
            } else if (i8 == 30322) {
                zzt(i);
                zzahw zzahw9 = this.zzC;
                zzahw9.zzw = new byte[i9];
                zzadw2.zzi(zzahw9.zzw, 0, i9);
            } else {
                throw zzaz.zza("Unexpected id: " + i8, (Throwable) null);
            }
        } else if (this.zzO == 2) {
            zzahw zzahw10 = (zzahw) this.zzh.get(this.zzU);
            if (this.zzX != 4 || !"V_VP9".equals(zzahw10.zzc)) {
                zzadw2.zzk(i9);
                return;
            }
            zzen zzen3 = this.zzu;
            zzen3.zzI(i9);
            zzadw2.zzi(zzen3.zzN(), 0, i9);
        }
    }

    public zzahy(zzakr zzakr, int i) {
        this(new zzaht(), 0, zzakr);
    }

    /* access modifiers changed from: protected */
    public final void zzk(int i, double d) throws zzaz {
        if (i == 181) {
            zzt(i);
            this.zzC.zzR = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    zzt(i);
                    this.zzC.zzE = (float) d;
                    return;
                case 21970:
                    zzt(i);
                    this.zzC.zzF = (float) d;
                    return;
                case 21971:
                    zzt(i);
                    this.zzC.zzG = (float) d;
                    return;
                case 21972:
                    zzt(i);
                    this.zzC.zzH = (float) d;
                    return;
                case 21973:
                    zzt(i);
                    this.zzC.zzI = (float) d;
                    return;
                case 21974:
                    zzt(i);
                    this.zzC.zzJ = (float) d;
                    return;
                case 21975:
                    zzt(i);
                    this.zzC.zzK = (float) d;
                    return;
                case 21976:
                    zzt(i);
                    this.zzC.zzL = (float) d;
                    return;
                case 21977:
                    zzt(i);
                    this.zzC.zzM = (float) d;
                    return;
                case 21978:
                    zzt(i);
                    this.zzC.zzN = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            zzt(i);
                            this.zzC.zzt = (float) d;
                            return;
                        case 30324:
                            zzt(i);
                            this.zzC.zzu = (float) d;
                            return;
                        case 30325:
                            zzt(i);
                            this.zzC.zzv = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzz = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzl(int i, long j) throws zzaz {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        zzt(i);
                        this.zzC.zze = (int) j;
                        return;
                    case 136:
                        if (j == 1) {
                            z = true;
                        }
                        zzt(i);
                        this.zzC.zzW = z;
                        return;
                    case 155:
                        this.zzQ = zzr(j);
                        return;
                    case 159:
                        zzt(i);
                        this.zzC.zzP = (int) j;
                        return;
                    case 176:
                        zzt(i);
                        this.zzC.zzm = (int) j;
                        return;
                    case 179:
                        zzs(i);
                        this.zzK.zzc(zzr(j));
                        return;
                    case 186:
                        zzt(i);
                        this.zzC.zzn = (int) j;
                        return;
                    case 215:
                        zzt(i);
                        this.zzC.zzd = (int) j;
                        return;
                    case 231:
                        this.zzJ = zzr(j);
                        return;
                    case 238:
                        this.zzX = (int) j;
                        return;
                    case 241:
                        if (!this.zzM) {
                            zzs(i);
                            this.zzL.zzc(j);
                            this.zzM = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzY = true;
                        return;
                    case 16871:
                        zzt(i);
                        this.zzC.zzZ = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw zzaz.zza("ContentCompAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw zzaz.zza("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw zzaz.zza("EBMLReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw zzaz.zza("ContentEncAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw zzaz.zza("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.zzF = j + this.zzx;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        zzt(i);
                        if (i2 == 0) {
                            this.zzC.zzx = 0;
                            return;
                        } else if (i2 == 1) {
                            this.zzC.zzx = 2;
                            return;
                        } else if (i2 == 3) {
                            this.zzC.zzx = 1;
                            return;
                        } else if (i2 == 15) {
                            this.zzC.zzx = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        zzt(i);
                        this.zzC.zzp = (int) j;
                        return;
                    case 21682:
                        zzt(i);
                        this.zzC.zzr = (int) j;
                        return;
                    case 21690:
                        zzt(i);
                        this.zzC.zzq = (int) j;
                        return;
                    case 21930:
                        if (j == 1) {
                            z = true;
                        }
                        zzt(i);
                        this.zzC.zzV = z;
                        return;
                    case 21938:
                        zzt(i);
                        zzahw zzahw = this.zzC;
                        zzahw.zzy = true;
                        zzahw.zzo = (int) j;
                        return;
                    case 21998:
                        zzt(i);
                        this.zzC.zzg = (int) j;
                        return;
                    case 22186:
                        zzt(i);
                        this.zzC.zzS = j;
                        return;
                    case 22203:
                        zzt(i);
                        this.zzC.zzT = j;
                        return;
                    case 25188:
                        zzt(i);
                        this.zzC.zzQ = (int) j;
                        return;
                    case 30114:
                        this.zzZ = j;
                        return;
                    case 30321:
                        int i3 = (int) j;
                        zzt(i);
                        if (i3 == 0) {
                            this.zzC.zzs = 0;
                            return;
                        } else if (i3 == 1) {
                            this.zzC.zzs = 1;
                            return;
                        } else if (i3 == 2) {
                            this.zzC.zzs = 2;
                            return;
                        } else if (i3 == 3) {
                            this.zzC.zzs = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        zzt(i);
                        this.zzC.zzf = (int) j;
                        return;
                    case 2807729:
                        this.zzy = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i4 = (int) j;
                                zzt(i);
                                if (i4 == 1) {
                                    this.zzC.zzB = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.zzC.zzB = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                zzt(i);
                                int zzb2 = zzk.zzb((int) j);
                                if (zzb2 != -1) {
                                    this.zzC.zzA = zzb2;
                                    return;
                                }
                                return;
                            case 21947:
                                zzt(i);
                                this.zzC.zzy = true;
                                int zza2 = zzk.zza((int) j);
                                if (zza2 != -1) {
                                    this.zzC.zzz = zza2;
                                    return;
                                }
                                return;
                            case 21948:
                                zzt(i);
                                this.zzC.zzC = (int) j;
                                return;
                            case 21949:
                                zzt(i);
                                this.zzC.zzD = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw zzaz.zza("ContentEncodingScope " + j + " not supported", (Throwable) null);
            }
        } else if (j != 0) {
            throw zzaz.zza("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
    }
}
