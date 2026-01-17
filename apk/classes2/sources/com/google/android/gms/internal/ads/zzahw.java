package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinVersion;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzahw {
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = zzbcj.zzq.zzf;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public byte[] zzO;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public zzafc zzU;
    public boolean zzV;
    public boolean zzW = true;
    public zzafb zzX;
    public int zzY;
    /* access modifiers changed from: private */
    public int zzZ;
    public boolean zza;
    /* access modifiers changed from: private */
    public String zzaa = "eng";
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzafa zzj;
    public byte[] zzk;
    public zzs zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;

    protected zzahw() {
    }

    private static Pair zzf(zzen zzen) throws zzaz {
        try {
            zzen.zzM(16);
            long zzs2 = zzen.zzs();
            if (zzs2 == 1482049860) {
                return new Pair("video/divx", (Object) null);
            }
            if (zzs2 == 859189832) {
                return new Pair("video/3gpp", (Object) null);
            }
            if (zzs2 == 826496599) {
                int zzc2 = zzen.zzc() + 20;
                byte[] zzN2 = zzen.zzN();
                while (true) {
                    int length = zzN2.length;
                    if (zzc2 < length - 4) {
                        int i = zzc2 + 1;
                        if (zzN2[zzc2] == 0 && zzN2[i] == 0 && zzN2[zzc2 + 2] == 1 && zzN2[zzc2 + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzN2, zzc2, length)));
                        }
                        zzc2 = i;
                    } else {
                        throw zzaz.zza("Failed to find FourCC VC1 initialization data", (Throwable) null);
                    }
                }
            } else {
                zzea.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", (Object) null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing FourCC private data", (Throwable) null);
        }
    }

    private static List zzg(byte[] bArr) throws zzaz {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 0;
                int i2 = 1;
                while (true) {
                    byte b3 = bArr[i2];
                    i2++;
                    b = b3 & 255;
                    if (b != 255) {
                        break;
                    }
                    i += KotlinVersion.MAX_COMPONENT_VALUE;
                }
                int i3 = i + b;
                int i4 = 0;
                while (true) {
                    byte b4 = bArr[i2];
                    i2++;
                    b2 = b4 & 255;
                    if (b2 != 255) {
                        break;
                    }
                    i4 += KotlinVersion.MAX_COMPONENT_VALUE;
                }
                int i5 = i4 + b2;
                if (bArr[i2] == 1) {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i2, bArr2, 0, i3);
                    int i6 = i2 + i3;
                    if (bArr[i6] == 3) {
                        int i7 = i6 + i5;
                        if (bArr[i7] == 5) {
                            int length = bArr.length - i7;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i7, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzaz.zza("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw zzaz.zza("Error parsing vorbis codec private", (Throwable) null);
                }
                throw zzaz.zza("Error parsing vorbis codec private", (Throwable) null);
            }
            throw zzaz.zza("Error parsing vorbis codec private", (Throwable) null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing vorbis codec private", (Throwable) null);
        }
    }

    private static boolean zzh(zzen zzen) throws zzaz {
        try {
            int zzk2 = zzen.zzk();
            if (zzk2 == 1) {
                return true;
            }
            if (zzk2 == 65534) {
                zzen.zzL(24);
                return zzen.zzt() == zzahy.zze.getMostSignificantBits() && zzen.zzt() == zzahy.zze.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing MS/ACM codec private", (Throwable) null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzaz {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzaz.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: com.google.android.gms.internal.ads.zzfyq} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x025d, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0297, code lost:
        r1 = -1;
        r10 = -1;
        r17 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02c9, code lost:
        r10 = -1;
        r1 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x033b, code lost:
        r2 = r1;
        r10 = -1;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x035e, code lost:
        r2 = r1;
        r1 = -1;
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0396, code lost:
        r3 = r1;
        r1 = -1;
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03c6, code lost:
        r1 = -1;
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c8, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c9, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03cc, code lost:
        if (r0.zzO == null) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03ce, code lost:
        r4 = com.google.android.gms.internal.ads.zzez.zza(new com.google.android.gms.internal.ads.zzen(r0.zzO));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03d9, code lost:
        if (r4 == null) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03db, code lost:
        r3 = r4.zza;
        r17 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03df, code lost:
        r4 = r17;
        r5 = r0.zzW;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03e5, code lost:
        if (true == r0.zzV) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03e7, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03e9, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03ea, code lost:
        r5 = r5 | r6;
        r6 = new com.google.android.gms.internal.ads.zzx();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03f4, code lost:
        if (com.google.android.gms.internal.ads.zzay.zzh(r4) == false) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f6, code lost:
        r6.zzD(r0.zzP);
        r6.zzai(r0.zzR);
        r6.zzab(r10);
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x040a, code lost:
        if (com.google.android.gms.internal.ads.zzay.zzj(r4) == false) goto L_0x05aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x040e, code lost:
        if (r0.zzr != 0) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0410, code lost:
        r7 = r0.zzp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0412, code lost:
        if (r7 != -1) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0414, code lost:
        r7 = r0.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0416, code lost:
        r0.zzp = r7;
        r7 = r0.zzq;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x041a, code lost:
        if (r7 != -1) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x041c, code lost:
        r7 = r0.zzn;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x041e, code lost:
        r0.zzq = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0420, code lost:
        r7 = r0.zzp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0424, code lost:
        if (r7 == -1) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0426, code lost:
        r10 = r0.zzq;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0428, code lost:
        if (r10 == -1) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x042a, code lost:
        r10 = ((float) (r0.zzn * r7)) / ((float) (r0.zzm * r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0434, code lost:
        r10 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0437, code lost:
        if (r0.zzy == false) goto L_0x0519;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x043d, code lost:
        if (r0.zzE == -1.0f) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0443, code lost:
        if (r0.zzF == -1.0f) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0449, code lost:
        if (r0.zzG == -1.0f) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x044f, code lost:
        if (r0.zzH == -1.0f) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0455, code lost:
        if (r0.zzI == -1.0f) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x045b, code lost:
        if (r0.zzJ == -1.0f) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0461, code lost:
        if (r0.zzK == -1.0f) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0467, code lost:
        if (r0.zzL == -1.0f) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x046d, code lost:
        if (r0.zzM == -1.0f) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0473, code lost:
        if (r0.zzN != -1.0f) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0477, code lost:
        r7 = new byte[25];
        r8 = java.nio.ByteBuffer.wrap(r7).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r8.put((byte) 0);
        r8.putShort((short) ((int) ((r0.zzE * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzF * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzG * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzH * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzI * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzJ * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzK * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.zzL * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) (r0.zzM + 0.5f)));
        r8.putShort((short) ((int) (r0.zzN + 0.5f)));
        r8.putShort((short) r0.zzC);
        r8.putShort((short) r0.zzD);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04f2, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04f3, code lost:
        r8 = new com.google.android.gms.internal.ads.zzi();
        r8.zzc(r0.zzz);
        r8.zzb(r0.zzB);
        r8.zzd(r0.zzA);
        r8.zze(r7);
        r8.zzf(r0.zzo);
        r8.zza(r0.zzo);
        r7 = r8.zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0519, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x051c, code lost:
        if (r0.zzb == null) goto L_0x053a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0528, code lost:
        if (com.google.android.gms.internal.ads.zzahy.zzf.containsKey(r0.zzb) == false) goto L_0x053a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x052a, code lost:
        r13 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzahy.zzf.get(r0.zzb)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x053c, code lost:
        if (r0.zzs != 0) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0545, code lost:
        if (java.lang.Float.compare(r0.zzt, 0.0f) != 0) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x054d, code lost:
        if (java.lang.Float.compare(r0.zzu, 0.0f) != 0) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0555, code lost:
        if (java.lang.Float.compare(r0.zzv, 0.0f) != 0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0560, code lost:
        if (java.lang.Float.compare(r0.zzv, 90.0f) != 0) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0562, code lost:
        r11 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x056d, code lost:
        if (java.lang.Float.compare(r0.zzv, -180.0f) == 0) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0577, code lost:
        if (java.lang.Float.compare(r0.zzv, 180.0f) != 0) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0582, code lost:
        if (java.lang.Float.compare(r0.zzv, -90.0f) != 0) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0584, code lost:
        r11 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0587, code lost:
        r11 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x058a, code lost:
        r11 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x058b, code lost:
        r6.zzam(r0.zzm);
        r6.zzQ(r0.zzn);
        r6.zzad(r10);
        r6.zzag(r11);
        r6.zzae(r0.zzw);
        r6.zzak(r0.zzx);
        r6.zzF(r7);
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05ae, code lost:
        if ("application/x-subrip".equals(r4) != false) goto L_0x05df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05b4, code lost:
        if ("text/x-ssa".equals(r4) != false) goto L_0x05df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05bc, code lost:
        if ("text/vtt".equals(r4) != false) goto L_0x05df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05c4, code lost:
        if ("application/vobsub".equals(r4) != false) goto L_0x05df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05cc, code lost:
        if ("application/pgs".equals(r4) != false) goto L_0x05df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05d4, code lost:
        if ("application/dvbsubs".equals(r4) == false) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05de, code lost:
        throw com.google.android.gms.internal.ads.zzaz.zza("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05df, code lost:
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05e2, code lost:
        if (r0.zzb == null) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05ee, code lost:
        if (com.google.android.gms.internal.ads.zzahy.zzf.containsKey(r0.zzb) != false) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05f0, code lost:
        r6.zzU(r0.zzb);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05f5, code lost:
        r6.zzR(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05fc, code lost:
        if (true == r0.zza) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05fe, code lost:
        r8 = "video/x-matroska";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0601, code lost:
        r8 = "video/webm";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0603, code lost:
        r6.zzG(r8);
        r6.zzah(r4);
        r6.zzX(r1);
        r6.zzW(r0.zzaa);
        r6.zzaj(r5);
        r6.zzT(r2);
        r6.zzE(r3);
        r6.zzL(r0.zzl);
        r1 = r6.zzan();
        r2 = r20.zzw(r0.zzd, r7);
        r0.zzX = r2;
        r2.zzm(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0630, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.ads.zzady r20, int r21) throws com.google.android.gms.internal.ads.zzaz {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = r0.zzc
            int r2 = r1.hashCode()
            r3 = 24
            r5 = 16
            r6 = 32
            r8 = 8
            r9 = 1
            r10 = 4
            r11 = 0
            r12 = 3
            r13 = -1
            switch(r2) {
                case -2095576542: goto L_0x0193;
                case -2095575984: goto L_0x0189;
                case -1985379776: goto L_0x017e;
                case -1784763192: goto L_0x0173;
                case -1730367663: goto L_0x0168;
                case -1482641358: goto L_0x015d;
                case -1482641357: goto L_0x0152;
                case -1373388978: goto L_0x0147;
                case -933872740: goto L_0x013c;
                case -538363189: goto L_0x0131;
                case -538363109: goto L_0x0126;
                case -425012669: goto L_0x011a;
                case -356037306: goto L_0x010e;
                case 62923557: goto L_0x0102;
                case 62923603: goto L_0x00f7;
                case 62927045: goto L_0x00eb;
                case 82318131: goto L_0x00e0;
                case 82338133: goto L_0x00d5;
                case 82338134: goto L_0x00ca;
                case 99146302: goto L_0x00bf;
                case 444813526: goto L_0x00b3;
                case 542569478: goto L_0x00a7;
                case 635596514: goto L_0x009b;
                case 725948237: goto L_0x008f;
                case 725957860: goto L_0x0084;
                case 738597099: goto L_0x0078;
                case 738614379: goto L_0x006c;
                case 855502857: goto L_0x0061;
                case 1045209816: goto L_0x0055;
                case 1422270023: goto L_0x0049;
                case 1809237540: goto L_0x003e;
                case 1950749482: goto L_0x0032;
                case 1950789798: goto L_0x0026;
                case 1951062397: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x019d
        L_0x001a:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 12
            goto L_0x019e
        L_0x0026:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 22
            goto L_0x019e
        L_0x0032:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 17
            goto L_0x019e
        L_0x003e:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = r12
            goto L_0x019e
        L_0x0049:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 27
            goto L_0x019e
        L_0x0055:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 30
            goto L_0x019e
        L_0x0061:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = r8
            goto L_0x019e
        L_0x006c:
            java.lang.String r2 = "S_TEXT/SSA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 29
            goto L_0x019e
        L_0x0078:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 28
            goto L_0x019e
        L_0x0084:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = r3
            goto L_0x019e
        L_0x008f:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 25
            goto L_0x019e
        L_0x009b:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 26
            goto L_0x019e
        L_0x00a7:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 20
            goto L_0x019e
        L_0x00b3:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 10
            goto L_0x019e
        L_0x00bf:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = r6
            goto L_0x019e
        L_0x00ca:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = r9
            goto L_0x019e
        L_0x00d5:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = r11
            goto L_0x019e
        L_0x00e0:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 2
            goto L_0x019e
        L_0x00eb:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 19
            goto L_0x019e
        L_0x00f7:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = r5
            goto L_0x019e
        L_0x0102:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 13
            goto L_0x019e
        L_0x010e:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 21
            goto L_0x019e
        L_0x011a:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 31
            goto L_0x019e
        L_0x0126:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 7
            goto L_0x019e
        L_0x0131:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 5
            goto L_0x019e
        L_0x013c:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 33
            goto L_0x019e
        L_0x0147:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 9
            goto L_0x019e
        L_0x0152:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 15
            goto L_0x019e
        L_0x015d:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 14
            goto L_0x019e
        L_0x0168:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 11
            goto L_0x019e
        L_0x0173:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 18
            goto L_0x019e
        L_0x017e:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 23
            goto L_0x019e
        L_0x0189:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = r10
            goto L_0x019e
        L_0x0193:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x019d
            r2 = 6
            goto L_0x019e
        L_0x019d:
            r2 = r13
        L_0x019e:
            java.lang.String r14 = "text/x-ssa"
            java.lang.String r15 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "audio/raw"
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r7 = "MatroskaExtractor"
            java.lang.String r4 = ". Setting mimeType to audio/x-unknown"
            switch(r2) {
                case 0: goto L_0x03c4;
                case 1: goto L_0x03b7;
                case 2: goto L_0x03aa;
                case 3: goto L_0x03a7;
                case 4: goto L_0x039a;
                case 5: goto L_0x039a;
                case 6: goto L_0x039a;
                case 7: goto L_0x037d;
                case 8: goto L_0x0363;
                case 9: goto L_0x0345;
                case 10: goto L_0x0341;
                case 11: goto L_0x032f;
                case 12: goto L_0x02ee;
                case 13: goto L_0x02ce;
                case 14: goto L_0x02c7;
                case 15: goto L_0x02c4;
                case 16: goto L_0x02c0;
                case 17: goto L_0x02bc;
                case 18: goto L_0x02b1;
                case 19: goto L_0x02ad;
                case 20: goto L_0x02ad;
                case 21: goto L_0x02a9;
                case 22: goto L_0x029d;
                case 23: goto L_0x0260;
                case 24: goto L_0x023c;
                case 25: goto L_0x0212;
                case 26: goto L_0x01f7;
                case 27: goto L_0x01f1;
                case 28: goto L_0x01dc;
                case 29: goto L_0x01dc;
                case 30: goto L_0x01d8;
                case 31: goto L_0x01cc;
                case 32: goto L_0x01c8;
                case 33: goto L_0x01b7;
                default: goto L_0x01af;
            }
        L_0x01af:
            java.lang.String r1 = "Unrecognized codec identifier."
            r2 = 0
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r2)
            throw r1
        L_0x01b7:
            byte[] r2 = new byte[r10]
            byte[] r1 = r0.zzi(r1)
            java.lang.System.arraycopy(r1, r11, r2, r11, r10)
            com.google.android.gms.internal.ads.zzfyq r1 = com.google.android.gms.internal.ads.zzfyq.zzo(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L_0x035e
        L_0x01c8:
            java.lang.String r17 = "application/pgs"
            goto L_0x03c6
        L_0x01cc:
            byte[] r1 = r0.zzi(r1)
            com.google.android.gms.internal.ads.zzfyq r1 = com.google.android.gms.internal.ads.zzfyq.zzo(r1)
            java.lang.String r17 = "application/vobsub"
            goto L_0x035e
        L_0x01d8:
            java.lang.String r17 = "text/vtt"
            goto L_0x03c6
        L_0x01dc:
            byte[] r1 = com.google.android.gms.internal.ads.zzahy.zzb
            java.lang.String r2 = r0.zzc
            byte[] r2 = r0.zzi(r2)
            com.google.android.gms.internal.ads.zzfyq r1 = com.google.android.gms.internal.ads.zzfyq.zzp(r1, r2)
            r2 = r1
            r1 = r13
            r10 = r1
            r17 = r14
            goto L_0x03c9
        L_0x01f1:
            r1 = r13
            r10 = r1
            r17 = r15
            goto L_0x03c8
        L_0x01f7:
            int r1 = r0.zzQ
            if (r1 != r6) goto L_0x01fc
            goto L_0x025d
        L_0x01fc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported floating point PCM bit depth: "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r7, r1)
            goto L_0x0297
        L_0x0212:
            int r1 = r0.zzQ
            if (r1 != r8) goto L_0x0218
            r10 = r12
            goto L_0x025d
        L_0x0218:
            if (r1 != r5) goto L_0x021d
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x025d
        L_0x021d:
            if (r1 != r3) goto L_0x0222
            r10 = 1342177280(0x50000000, float:8.5899346E9)
            goto L_0x025d
        L_0x0222:
            if (r1 != r6) goto L_0x0227
            r10 = 1610612736(0x60000000, float:3.6893488E19)
            goto L_0x025d
        L_0x0227:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported big endian PCM bit depth: "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r7, r1)
            goto L_0x0297
        L_0x023c:
            int r1 = r0.zzQ
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r10 = com.google.android.gms.internal.ads.zzex.zzn(r1, r2)
            if (r10 != 0) goto L_0x025d
            int r1 = r0.zzQ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported little endian PCM bit depth: "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r7, r1)
            goto L_0x0297
        L_0x025d:
            r1 = r13
            goto L_0x03c8
        L_0x0260:
            com.google.android.gms.internal.ads.zzen r1 = new com.google.android.gms.internal.ads.zzen
            java.lang.String r2 = r0.zzc
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            boolean r1 = zzh(r1)
            if (r1 == 0) goto L_0x0292
            int r1 = r0.zzQ
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r10 = com.google.android.gms.internal.ads.zzex.zzn(r1, r2)
            if (r10 != 0) goto L_0x025d
            int r1 = r0.zzQ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported PCM bit depth: "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r7, r1)
            goto L_0x0297
        L_0x0292:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            com.google.android.gms.internal.ads.zzea.zzf(r7, r1)
        L_0x0297:
            r1 = r13
            r10 = r1
            r17 = r18
            goto L_0x03c8
        L_0x029d:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L_0x035e
        L_0x02a9:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x03c6
        L_0x02ad:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x03c6
        L_0x02b1:
            com.google.android.gms.internal.ads.zzafc r1 = new com.google.android.gms.internal.ads.zzafc
            r1.<init>()
            r0.zzU = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x03c6
        L_0x02bc:
            java.lang.String r17 = "audio/eac3"
            goto L_0x03c6
        L_0x02c0:
            java.lang.String r17 = "audio/ac3"
            goto L_0x03c6
        L_0x02c4:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x02c9
        L_0x02c7:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x02c9:
            r10 = r13
            r1 = r16
            goto L_0x03c8
        L_0x02ce:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.zzk
            com.google.android.gms.internal.ads.zzacp r2 = com.google.android.gms.internal.ads.zzacr.zza(r2)
            int r3 = r2.zza
            r0.zzR = r3
            int r3 = r2.zzb
            r0.zzP = r3
            java.lang.String r2 = r2.zzc
            java.lang.String r17 = "audio/mp4a-latm"
            r3 = r2
            r10 = r13
            r2 = r1
            r1 = r10
            goto L_0x03ca
        L_0x02ee:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r12)
            java.lang.String r2 = r0.zzc
            byte[] r2 = r0.zzi(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.zzS
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.zzT
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            r16 = 5760(0x1680, float:8.071E-42)
            java.lang.String r17 = "audio/opus"
            goto L_0x033b
        L_0x032f:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = zzg(r1)
            r16 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r17 = "audio/vorbis"
        L_0x033b:
            r2 = r1
            r10 = r13
            r1 = r16
            goto L_0x03c9
        L_0x0341:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x03c6
        L_0x0345:
            com.google.android.gms.internal.ads.zzen r1 = new com.google.android.gms.internal.ads.zzen
            java.lang.String r2 = r0.zzc
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            android.util.Pair r1 = zzf(r1)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
        L_0x035e:
            r2 = r1
            r1 = r13
            r10 = r1
            goto L_0x03c9
        L_0x0363:
            com.google.android.gms.internal.ads.zzen r1 = new com.google.android.gms.internal.ads.zzen
            java.lang.String r2 = r0.zzc
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzaek r1 = com.google.android.gms.internal.ads.zzaek.zza(r1)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzY = r3
            java.lang.String r1 = r1.zzn
            java.lang.String r17 = "video/hevc"
            goto L_0x0396
        L_0x037d:
            com.google.android.gms.internal.ads.zzen r1 = new com.google.android.gms.internal.ads.zzen
            java.lang.String r2 = r0.zzc
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzacz r1 = com.google.android.gms.internal.ads.zzacz.zza(r1)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzY = r3
            java.lang.String r1 = r1.zzl
            java.lang.String r17 = "video/avc"
        L_0x0396:
            r3 = r1
            r1 = r13
            r10 = r1
            goto L_0x03ca
        L_0x039a:
            byte[] r1 = r0.zzk
            if (r1 != 0) goto L_0x03a0
            r1 = 0
            goto L_0x03a4
        L_0x03a0:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x03a4:
            java.lang.String r17 = "video/mp4v-es"
            goto L_0x035e
        L_0x03a7:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x03c6
        L_0x03aa:
            byte[] r1 = r0.zzk
            if (r1 != 0) goto L_0x03b0
            r1 = 0
            goto L_0x03b4
        L_0x03b0:
            com.google.android.gms.internal.ads.zzfyq r1 = com.google.android.gms.internal.ads.zzfyq.zzo(r1)
        L_0x03b4:
            java.lang.String r17 = "video/av01"
            goto L_0x035e
        L_0x03b7:
            byte[] r1 = r0.zzk
            if (r1 != 0) goto L_0x03bd
            r1 = 0
            goto L_0x03c1
        L_0x03bd:
            com.google.android.gms.internal.ads.zzfyq r1 = com.google.android.gms.internal.ads.zzfyq.zzo(r1)
        L_0x03c1:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x035e
        L_0x03c4:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L_0x03c6:
            r1 = r13
            r10 = r1
        L_0x03c8:
            r2 = 0
        L_0x03c9:
            r3 = 0
        L_0x03ca:
            byte[] r4 = r0.zzO
            if (r4 == 0) goto L_0x03df
            com.google.android.gms.internal.ads.zzen r4 = new com.google.android.gms.internal.ads.zzen
            byte[] r5 = r0.zzO
            r4.<init>((byte[]) r5)
            com.google.android.gms.internal.ads.zzez r4 = com.google.android.gms.internal.ads.zzez.zza(r4)
            if (r4 == 0) goto L_0x03df
            java.lang.String r3 = r4.zza
            java.lang.String r17 = "video/dolby-vision"
        L_0x03df:
            r4 = r17
            boolean r5 = r0.zzW
            boolean r6 = r0.zzV
            if (r9 == r6) goto L_0x03e9
            r6 = r11
            goto L_0x03ea
        L_0x03e9:
            r6 = 2
        L_0x03ea:
            r5 = r5 | r6
            com.google.android.gms.internal.ads.zzx r6 = new com.google.android.gms.internal.ads.zzx
            r6.<init>()
            boolean r7 = com.google.android.gms.internal.ads.zzay.zzh(r4)
            if (r7 == 0) goto L_0x0406
            int r7 = r0.zzP
            r6.zzD(r7)
            int r7 = r0.zzR
            r6.zzai(r7)
            r6.zzab(r10)
            r7 = r9
            goto L_0x05e0
        L_0x0406:
            boolean r7 = com.google.android.gms.internal.ads.zzay.zzj(r4)
            if (r7 == 0) goto L_0x05aa
            int r7 = r0.zzr
            if (r7 != 0) goto L_0x0420
            int r7 = r0.zzp
            if (r7 != r13) goto L_0x0416
            int r7 = r0.zzm
        L_0x0416:
            r0.zzp = r7
            int r7 = r0.zzq
            if (r7 != r13) goto L_0x041e
            int r7 = r0.zzn
        L_0x041e:
            r0.zzq = r7
        L_0x0420:
            int r7 = r0.zzp
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r7 == r13) goto L_0x0434
            int r10 = r0.zzq
            if (r10 == r13) goto L_0x0434
            int r12 = r0.zzn
            int r12 = r12 * r7
            int r7 = r0.zzm
            int r7 = r7 * r10
            float r10 = (float) r12
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0435
        L_0x0434:
            r10 = r8
        L_0x0435:
            boolean r7 = r0.zzy
            if (r7 == 0) goto L_0x0519
            float r7 = r0.zzE
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x04f2
            float r7 = r0.zzF
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x04f2
            float r7 = r0.zzG
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x04f2
            float r7 = r0.zzH
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x04f2
            float r7 = r0.zzI
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x04f2
            float r7 = r0.zzJ
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x04f2
            float r7 = r0.zzK
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x04f2
            float r7 = r0.zzL
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x04f2
            float r7 = r0.zzM
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x04f2
            float r7 = r0.zzN
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0477
            goto L_0x04f2
        L_0x0477:
            r7 = 25
            byte[] r7 = new byte[r7]
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r7)
            java.nio.ByteOrder r12 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r8 = r8.order(r12)
            r8.put(r11)
            float r12 = r0.zzE
            r14 = 1195593728(0x47435000, float:50000.0)
            float r12 = r12 * r14
            r15 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r15
            int r12 = (int) r12
            short r12 = (short) r12
            r8.putShort(r12)
            float r12 = r0.zzF
            float r12 = r12 * r14
            float r12 = r12 + r15
            int r12 = (int) r12
            short r12 = (short) r12
            r8.putShort(r12)
            float r12 = r0.zzG
            float r12 = r12 * r14
            float r12 = r12 + r15
            int r12 = (int) r12
            short r12 = (short) r12
            r8.putShort(r12)
            float r12 = r0.zzH
            float r12 = r12 * r14
            float r12 = r12 + r15
            int r12 = (int) r12
            short r12 = (short) r12
            r8.putShort(r12)
            float r12 = r0.zzI
            float r12 = r12 * r14
            float r12 = r12 + r15
            int r12 = (int) r12
            short r12 = (short) r12
            r8.putShort(r12)
            float r12 = r0.zzJ
            float r12 = r12 * r14
            float r12 = r12 + r15
            int r12 = (int) r12
            short r12 = (short) r12
            r8.putShort(r12)
            float r12 = r0.zzK
            float r12 = r12 * r14
            float r12 = r12 + r15
            int r12 = (int) r12
            short r12 = (short) r12
            r8.putShort(r12)
            float r12 = r0.zzL
            float r12 = r12 * r14
            float r12 = r12 + r15
            int r12 = (int) r12
            short r12 = (short) r12
            r8.putShort(r12)
            float r12 = r0.zzM
            float r12 = r12 + r15
            int r12 = (int) r12
            short r12 = (short) r12
            r8.putShort(r12)
            float r12 = r0.zzN
            float r12 = r12 + r15
            int r12 = (int) r12
            short r12 = (short) r12
            r8.putShort(r12)
            int r12 = r0.zzC
            short r12 = (short) r12
            r8.putShort(r12)
            int r12 = r0.zzD
            short r12 = (short) r12
            r8.putShort(r12)
            goto L_0x04f3
        L_0x04f2:
            r7 = 0
        L_0x04f3:
            com.google.android.gms.internal.ads.zzi r8 = new com.google.android.gms.internal.ads.zzi
            r8.<init>()
            int r12 = r0.zzz
            r8.zzc(r12)
            int r12 = r0.zzB
            r8.zzb(r12)
            int r12 = r0.zzA
            r8.zzd(r12)
            r8.zze(r7)
            int r7 = r0.zzo
            r8.zzf(r7)
            int r7 = r0.zzo
            r8.zza(r7)
            com.google.android.gms.internal.ads.zzk r7 = r8.zzg()
            goto L_0x051a
        L_0x0519:
            r7 = 0
        L_0x051a:
            java.lang.String r8 = r0.zzb
            if (r8 == 0) goto L_0x053a
            java.util.Map r8 = com.google.android.gms.internal.ads.zzahy.zzf
            java.lang.String r12 = r0.zzb
            boolean r8 = r8.containsKey(r12)
            if (r8 == 0) goto L_0x053a
            java.util.Map r8 = com.google.android.gms.internal.ads.zzahy.zzf
            java.lang.String r12 = r0.zzb
            java.lang.Object r8 = r8.get(r12)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r13 = r8.intValue()
        L_0x053a:
            int r8 = r0.zzs
            if (r8 != 0) goto L_0x058a
            float r8 = r0.zzt
            r12 = 0
            int r8 = java.lang.Float.compare(r8, r12)
            if (r8 != 0) goto L_0x058a
            float r8 = r0.zzu
            int r8 = java.lang.Float.compare(r8, r12)
            if (r8 != 0) goto L_0x058a
            float r8 = r0.zzv
            int r8 = java.lang.Float.compare(r8, r12)
            if (r8 != 0) goto L_0x0558
            goto L_0x058b
        L_0x0558:
            float r8 = r0.zzv
            r11 = 1119092736(0x42b40000, float:90.0)
            int r8 = java.lang.Float.compare(r8, r11)
            if (r8 != 0) goto L_0x0565
            r11 = 90
            goto L_0x058b
        L_0x0565:
            float r8 = r0.zzv
            r11 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r8 = java.lang.Float.compare(r8, r11)
            if (r8 == 0) goto L_0x0587
            float r8 = r0.zzv
            r11 = 1127481344(0x43340000, float:180.0)
            int r8 = java.lang.Float.compare(r8, r11)
            if (r8 != 0) goto L_0x057a
            goto L_0x0587
        L_0x057a:
            float r8 = r0.zzv
            r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r8 = java.lang.Float.compare(r8, r11)
            if (r8 != 0) goto L_0x058a
            r11 = 270(0x10e, float:3.78E-43)
            goto L_0x058b
        L_0x0587:
            r11 = 180(0xb4, float:2.52E-43)
            goto L_0x058b
        L_0x058a:
            r11 = r13
        L_0x058b:
            int r8 = r0.zzm
            r6.zzam(r8)
            int r8 = r0.zzn
            r6.zzQ(r8)
            r6.zzad(r10)
            r6.zzag(r11)
            byte[] r8 = r0.zzw
            r6.zzae(r8)
            int r8 = r0.zzx
            r6.zzak(r8)
            r6.zzF(r7)
            r7 = 2
            goto L_0x05e0
        L_0x05aa:
            boolean r7 = r15.equals(r4)
            if (r7 != 0) goto L_0x05df
            boolean r7 = r14.equals(r4)
            if (r7 != 0) goto L_0x05df
            java.lang.String r7 = "text/vtt"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x05df
            java.lang.String r7 = "application/vobsub"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x05df
            java.lang.String r7 = "application/pgs"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x05df
            java.lang.String r7 = "application/dvbsubs"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x05d7
            goto L_0x05df
        L_0x05d7:
            java.lang.String r1 = "Unexpected MIME type."
            r2 = 0
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r2)
            throw r1
        L_0x05df:
            r7 = r12
        L_0x05e0:
            java.lang.String r8 = r0.zzb
            if (r8 == 0) goto L_0x05f5
            java.util.Map r8 = com.google.android.gms.internal.ads.zzahy.zzf
            java.lang.String r10 = r0.zzb
            boolean r8 = r8.containsKey(r10)
            if (r8 != 0) goto L_0x05f5
            java.lang.String r8 = r0.zzb
            r6.zzU(r8)
        L_0x05f5:
            r8 = r21
            r6.zzR(r8)
            boolean r8 = r0.zza
            if (r9 == r8) goto L_0x0601
            java.lang.String r8 = "video/x-matroska"
            goto L_0x0603
        L_0x0601:
            java.lang.String r8 = "video/webm"
        L_0x0603:
            r6.zzG(r8)
            r6.zzah(r4)
            r6.zzX(r1)
            java.lang.String r1 = r0.zzaa
            r6.zzW(r1)
            r6.zzaj(r5)
            r6.zzT(r2)
            r6.zzE(r3)
            com.google.android.gms.internal.ads.zzs r1 = r0.zzl
            r6.zzL(r1)
            com.google.android.gms.internal.ads.zzz r1 = r6.zzan()
            int r2 = r0.zzd
            r3 = r20
            com.google.android.gms.internal.ads.zzafb r2 = r3.zzw(r2, r7)
            r0.zzX = r2
            r2.zzm(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahw.zze(com.google.android.gms.internal.ads.zzady, int):void");
    }
}
