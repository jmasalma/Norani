package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaba extends zztp implements zzabr {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private zzmh zzC;
    private boolean zzD;
    private long zzE;
    private int zzF;
    private long zzG;
    private zzcd zzH;
    private zzcd zzI;
    private int zzJ;
    private int zzK;
    private zzabp zzL;
    private long zzM;
    private long zzN;
    private boolean zzO;
    private final Context zze;
    private final boolean zzf;
    private final zzaci zzg;
    private final boolean zzh;
    private final zzabs zzi;
    private final zzabq zzj;
    private final PriorityQueue zzk;
    private zzaaz zzl;
    private boolean zzm;
    private boolean zzn;
    private zzaco zzo = null;
    private boolean zzp;
    private int zzq;
    private List zzr;
    /* access modifiers changed from: private */
    public Surface zzs;
    private zzabd zzt;
    private zzeo zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private int zzz;

    protected zzaba(zzaay zzaay) {
        super(2, zzaay.zzd, zzaay.zzc, false, 30.0f);
        Context applicationContext = zzaay.zza.getApplicationContext();
        this.zze = applicationContext;
        this.zzg = new zzaci(zzaay.zze, zzaay.zzf);
        this.zzf = this.zzo == null;
        this.zzi = new zzabs(applicationContext, this, 0);
        this.zzj = new zzabq();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzu = zzeo.zza;
        this.zzw = 1;
        this.zzx = 0;
        this.zzH = zzcd.zza;
        this.zzK = 0;
        this.zzI = null;
        this.zzJ = -1000;
        this.zzM = -9223372036854775807L;
        this.zzN = -9223372036854775807L;
        this.zzk = new PriorityQueue();
        this.zzC = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r3.equals("video/av01") != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00de, code lost:
        return ((r0 * r1) * 3) / r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzaf(com.google.android.gms.internal.ads.zzti r11, com.google.android.gms.internal.ads.zzz r12) {
        /*
            int r0 = r12.zzv
            int r1 = r12.zzw
            r2 = -1
            if (r0 == r2) goto L_0x00df
            if (r1 != r2) goto L_0x000b
            goto L_0x00df
        L_0x000b:
            java.lang.String r3 = r12.zzo
            r3.getClass()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            r5 = 2
            r6 = 1
            java.lang.String r7 = "video/avc"
            java.lang.String r8 = "video/av01"
            java.lang.String r9 = "video/hevc"
            if (r4 == 0) goto L_0x0045
            int r3 = com.google.android.gms.internal.ads.zzuc.zza
            android.util.Pair r12 = com.google.android.gms.internal.ads.zzdk.zza(r12)
            if (r12 == 0) goto L_0x0044
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r12 == r3) goto L_0x0042
            if (r12 == r6) goto L_0x0042
            if (r12 != r5) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r12 != r3) goto L_0x0044
            r3 = r8
            goto L_0x0045
        L_0x0042:
            r3 = r7
            goto L_0x0045
        L_0x0044:
            r3 = r9
        L_0x0045:
            int r12 = r3.hashCode()
            r4 = 3
            r10 = 4
            switch(r12) {
                case -1664118616: goto L_0x0084;
                case -1662735862: goto L_0x007d;
                case -1662541442: goto L_0x0075;
                case 1187890754: goto L_0x006b;
                case 1331836730: goto L_0x0063;
                case 1599127256: goto L_0x0059;
                case 1599127257: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x008e
        L_0x004f:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x008e
            r5 = 6
            goto L_0x008f
        L_0x0059:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x008e
            r5 = r4
            goto L_0x008f
        L_0x0063:
            boolean r12 = r3.equals(r7)
            if (r12 == 0) goto L_0x008e
            r5 = 5
            goto L_0x008f
        L_0x006b:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x008e
            r5 = r6
            goto L_0x008f
        L_0x0075:
            boolean r12 = r3.equals(r9)
            if (r12 == 0) goto L_0x008e
            r5 = r10
            goto L_0x008f
        L_0x007d:
            boolean r12 = r3.equals(r8)
            if (r12 == 0) goto L_0x008e
            goto L_0x008f
        L_0x0084:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x008e
            r5 = 0
            goto L_0x008f
        L_0x008e:
            r5 = r2
        L_0x008f:
            switch(r5) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00db;
                case 2: goto L_0x00db;
                case 3: goto L_0x00db;
                case 4: goto L_0x00d1;
                case 5: goto L_0x0096;
                case 6: goto L_0x0093;
                default: goto L_0x0092;
            }
        L_0x0092:
            goto L_0x00df
        L_0x0093:
            r10 = 8
            goto L_0x00db
        L_0x0096:
            java.lang.String r12 = "BRAVIA 4K 2015"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L_0x00df
            java.lang.String r12 = "Amazon"
            java.lang.String r3 = android.os.Build.MANUFACTURER
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x00c2
            java.lang.String r12 = "KFSOWI"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L_0x00df
            java.lang.String r12 = "AFTS"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x00c2
            boolean r11 = r11.zzf
            if (r11 != 0) goto L_0x00df
        L_0x00c2:
            java.lang.String r11 = com.google.android.gms.internal.ads.zzex.zza
            int r0 = r0 + 15
            int r1 = r1 + 15
            int r0 = r0 / 16
            int r1 = r1 / 16
            int r0 = r0 * r1
            int r0 = r0 * 768
            int r0 = r0 / r10
            return r0
        L_0x00d1:
            int r0 = r0 * r1
            int r0 = r0 * r4
            int r0 = r0 / r10
            r11 = 2097152(0x200000, float:2.938736E-39)
            int r11 = java.lang.Math.max(r11, r0)
            return r11
        L_0x00db:
            int r0 = r0 * r1
            int r0 = r0 * r4
            int r0 = r0 / r10
            return r0
        L_0x00df:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaba.zzaf(com.google.android.gms.internal.ads.zzti, com.google.android.gms.internal.ads.zzz):int");
    }

    protected static int zzag(zzti zzti, zzz zzz2) {
        int i = zzz2.zzp;
        if (i == -1) {
            return zzaf(zzti, zzz2);
        }
        List list = zzz2.zzr;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x04c1, code lost:
        if (r1.equals("deb") != false) goto L_0x0789;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x079e, code lost:
        if (r1.equals("JSN-L21") == false) goto L_0x07a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean zzbe(java.lang.String r15) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r15 = r15.startsWith(r0)
            r0 = 0
            if (r15 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<com.google.android.gms.internal.ads.zzaba> r15 = com.google.android.gms.internal.ads.zzaba.class
            monitor-enter(r15)
            boolean r1 = zzc     // Catch:{ all -> 0x07aa }
            if (r1 != 0) goto L_0x07a6
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x07aa }
            r2 = 28
            r3 = 5
            r4 = 6
            r5 = 4
            r6 = 7
            r7 = 2
            r8 = 3
            r9 = -1
            r10 = 1
            if (r1 > r2) goto L_0x0081
            java.lang.String r1 = android.os.Build.DEVICE     // Catch:{ all -> 0x07aa }
            int r11 = r1.hashCode()     // Catch:{ all -> 0x07aa }
            switch(r11) {
                case -1339091551: goto L_0x006f;
                case -1220081023: goto L_0x0065;
                case -1220066608: goto L_0x005b;
                case -1012436106: goto L_0x0051;
                case -760312546: goto L_0x0047;
                case -64886864: goto L_0x003d;
                case 3415681: goto L_0x0033;
                case 825323514: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0079
        L_0x0029:
            java.lang.String r11 = "machuca"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r3
            goto L_0x007a
        L_0x0033:
            java.lang.String r11 = "once"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r4
            goto L_0x007a
        L_0x003d:
            java.lang.String r11 = "magnolia"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r5
            goto L_0x007a
        L_0x0047:
            java.lang.String r11 = "aquaman"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r0
            goto L_0x007a
        L_0x0051:
            java.lang.String r11 = "oneday"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r6
            goto L_0x007a
        L_0x005b:
            java.lang.String r11 = "dangalUHD"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r7
            goto L_0x007a
        L_0x0065:
            java.lang.String r11 = "dangalFHD"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r8
            goto L_0x007a
        L_0x006f:
            java.lang.String r11 = "dangal"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0079
            r1 = r10
            goto L_0x007a
        L_0x0079:
            r1 = r9
        L_0x007a:
            switch(r1) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007e;
                case 4: goto L_0x007e;
                case 5: goto L_0x007e;
                case 6: goto L_0x007e;
                case 7: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0081
        L_0x007e:
            r0 = r10
            goto L_0x07a2
        L_0x0081:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x07aa }
            r11 = 27
            if (r1 > r11) goto L_0x0092
            java.lang.String r1 = "HWEML"
            java.lang.String r12 = android.os.Build.DEVICE     // Catch:{ all -> 0x07aa }
            boolean r1 = r1.equals(r12)     // Catch:{ all -> 0x07aa }
            if (r1 == 0) goto L_0x0092
            goto L_0x007e
        L_0x0092:
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x07aa }
            int r12 = r1.hashCode()     // Catch:{ all -> 0x07aa }
            r13 = 8
            switch(r12) {
                case -349662828: goto L_0x00ef;
                case -321033677: goto L_0x00e5;
                case 2006354: goto L_0x00db;
                case 2006367: goto L_0x00d1;
                case 2006371: goto L_0x00c7;
                case 1785421873: goto L_0x00bd;
                case 1785421876: goto L_0x00b3;
                case 1798172390: goto L_0x00a9;
                case 2119412532: goto L_0x009f;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x00f9
        L_0x009f:
            java.lang.String r12 = "AFTEUFF014"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00f9
            r1 = r3
            goto L_0x00fa
        L_0x00a9:
            java.lang.String r12 = "AFTSO001"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00f9
            r1 = r13
            goto L_0x00fa
        L_0x00b3:
            java.lang.String r12 = "AFTEU014"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00f9
            r1 = r5
            goto L_0x00fa
        L_0x00bd:
            java.lang.String r12 = "AFTEU011"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00f9
            r1 = r8
            goto L_0x00fa
        L_0x00c7:
            java.lang.String r12 = "AFTR"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00f9
            r1 = r7
            goto L_0x00fa
        L_0x00d1:
            java.lang.String r12 = "AFTN"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00f9
            r1 = r10
            goto L_0x00fa
        L_0x00db:
            java.lang.String r12 = "AFTA"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00f9
            r1 = r0
            goto L_0x00fa
        L_0x00e5:
            java.lang.String r12 = "AFTKMST12"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00f9
            r1 = r6
            goto L_0x00fa
        L_0x00ef:
            java.lang.String r12 = "AFTJMST12"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00f9
            r1 = r4
            goto L_0x00fa
        L_0x00f9:
            r1 = r9
        L_0x00fa:
            switch(r1) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007e;
                case 4: goto L_0x007e;
                case 5: goto L_0x007e;
                case 6: goto L_0x007e;
                case 7: goto L_0x007e;
                case 8: goto L_0x007e;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x07aa }
            r12 = 26
            if (r1 > r12) goto L_0x07a2
            java.lang.String r1 = android.os.Build.DEVICE     // Catch:{ all -> 0x07aa }
            int r14 = r1.hashCode()     // Catch:{ all -> 0x07aa }
            switch(r14) {
                case -2144781245: goto L_0x077d;
                case -2144781185: goto L_0x0772;
                case -2144781160: goto L_0x0767;
                case -2097309513: goto L_0x075c;
                case -2022874474: goto L_0x0751;
                case -1978993182: goto L_0x0746;
                case -1978990237: goto L_0x073b;
                case -1936688988: goto L_0x0730;
                case -1936688066: goto L_0x0725;
                case -1936688065: goto L_0x0719;
                case -1931988508: goto L_0x070d;
                case -1885099851: goto L_0x0701;
                case -1696512866: goto L_0x06f5;
                case -1680025915: goto L_0x06e9;
                case -1615810839: goto L_0x06dd;
                case -1600724499: goto L_0x06d1;
                case -1554255044: goto L_0x06c5;
                case -1481772737: goto L_0x06b9;
                case -1481772730: goto L_0x06ad;
                case -1481772729: goto L_0x06a1;
                case -1320080169: goto L_0x0695;
                case -1217592143: goto L_0x0689;
                case -1180384755: goto L_0x067d;
                case -1139198265: goto L_0x0671;
                case -1052835013: goto L_0x0665;
                case -993250464: goto L_0x065a;
                case -993250458: goto L_0x064f;
                case -965403638: goto L_0x0643;
                case -958336948: goto L_0x0637;
                case -879245230: goto L_0x062b;
                case -842500323: goto L_0x061f;
                case -821392978: goto L_0x0613;
                case -797483286: goto L_0x0607;
                case -794946968: goto L_0x05fb;
                case -788334647: goto L_0x05ef;
                case -782144577: goto L_0x05e3;
                case -575125681: goto L_0x05d7;
                case -521118391: goto L_0x05cb;
                case -430914369: goto L_0x05bf;
                case -290434366: goto L_0x05b3;
                case -282781963: goto L_0x05a7;
                case -277133239: goto L_0x059b;
                case -173639913: goto L_0x058f;
                case -56598463: goto L_0x0583;
                case 2126: goto L_0x0577;
                case 2564: goto L_0x056b;
                case 2715: goto L_0x055f;
                case 2719: goto L_0x0553;
                case 3091: goto L_0x0547;
                case 3483: goto L_0x053b;
                case 73405: goto L_0x052f;
                case 75537: goto L_0x0523;
                case 75739: goto L_0x0517;
                case 76779: goto L_0x050b;
                case 78669: goto L_0x04ff;
                case 79305: goto L_0x04f3;
                case 80618: goto L_0x04e7;
                case 88274: goto L_0x04db;
                case 98846: goto L_0x04d0;
                case 98848: goto L_0x04c5;
                case 99329: goto L_0x04bb;
                case 101481: goto L_0x04af;
                case 1513190: goto L_0x04a4;
                case 1514184: goto L_0x0499;
                case 1514185: goto L_0x048e;
                case 2133089: goto L_0x0482;
                case 2133091: goto L_0x0476;
                case 2133120: goto L_0x046a;
                case 2133151: goto L_0x045e;
                case 2133182: goto L_0x0452;
                case 2133184: goto L_0x0446;
                case 2436959: goto L_0x043a;
                case 2463773: goto L_0x042e;
                case 2464648: goto L_0x0422;
                case 2689555: goto L_0x0416;
                case 3154429: goto L_0x040a;
                case 3284551: goto L_0x03fe;
                case 3351335: goto L_0x03f2;
                case 3386211: goto L_0x03e6;
                case 41325051: goto L_0x03da;
                case 51349633: goto L_0x03cf;
                case 51350594: goto L_0x03c4;
                case 55178625: goto L_0x03b8;
                case 61542055: goto L_0x03ad;
                case 65355429: goto L_0x03a1;
                case 66214468: goto L_0x0395;
                case 66214470: goto L_0x0389;
                case 66214473: goto L_0x037d;
                case 66215429: goto L_0x0371;
                case 66215431: goto L_0x0365;
                case 66215433: goto L_0x0359;
                case 66216390: goto L_0x034d;
                case 76402249: goto L_0x0341;
                case 76404105: goto L_0x0335;
                case 76404911: goto L_0x0329;
                case 80963634: goto L_0x031d;
                case 82882791: goto L_0x0311;
                case 98715550: goto L_0x0305;
                case 101370885: goto L_0x02f9;
                case 102844228: goto L_0x02ed;
                case 165221241: goto L_0x02e2;
                case 182191441: goto L_0x02d6;
                case 245388979: goto L_0x02ca;
                case 287431619: goto L_0x02be;
                case 307593612: goto L_0x02b2;
                case 308517133: goto L_0x02a6;
                case 316215098: goto L_0x029a;
                case 316215116: goto L_0x028e;
                case 316246811: goto L_0x0282;
                case 316246818: goto L_0x0276;
                case 407160593: goto L_0x026a;
                case 507412548: goto L_0x025e;
                case 793982701: goto L_0x0252;
                case 794038622: goto L_0x0246;
                case 794040393: goto L_0x023a;
                case 835649806: goto L_0x022e;
                case 917340916: goto L_0x0222;
                case 958008161: goto L_0x0216;
                case 1060579533: goto L_0x020a;
                case 1150207623: goto L_0x01fe;
                case 1176899427: goto L_0x01f2;
                case 1280332038: goto L_0x01e6;
                case 1306947716: goto L_0x01da;
                case 1349174697: goto L_0x01ce;
                case 1522194893: goto L_0x01c2;
                case 1691543273: goto L_0x01b6;
                case 1691544261: goto L_0x01aa;
                case 1709443163: goto L_0x019e;
                case 1865889110: goto L_0x0192;
                case 1906253259: goto L_0x0186;
                case 1977196784: goto L_0x017a;
                case 2006372676: goto L_0x016e;
                case 2019281702: goto L_0x0162;
                case 2029784656: goto L_0x0156;
                case 2030379515: goto L_0x014a;
                case 2033393791: goto L_0x013e;
                case 2047190025: goto L_0x0132;
                case 2047252157: goto L_0x0126;
                case 2048319463: goto L_0x011a;
                case 2048855701: goto L_0x010e;
                default: goto L_0x010c;
            }
        L_0x010c:
            goto L_0x0788
        L_0x010e:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 66
            goto L_0x0789
        L_0x011a:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 65
            goto L_0x0789
        L_0x0126:
            java.lang.String r2 = "ELUGA_Prim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 33
            goto L_0x0789
        L_0x0132:
            java.lang.String r2 = "ELUGA_Note"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 32
            goto L_0x0789
        L_0x013e:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 14
            goto L_0x0789
        L_0x014a:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 64
            goto L_0x0789
        L_0x0156:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 63
            goto L_0x0789
        L_0x0162:
            java.lang.String r2 = "DM-01K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 29
            goto L_0x0789
        L_0x016e:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 19
            goto L_0x0789
        L_0x017a:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 69
            goto L_0x0789
        L_0x0186:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 100
            goto L_0x0789
        L_0x0192:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 117(0x75, float:1.64E-43)
            goto L_0x0789
        L_0x019e:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 68
            goto L_0x0789
        L_0x01aa:
            java.lang.String r2 = "CPH1715"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 24
            goto L_0x0789
        L_0x01b6:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 23
            goto L_0x0789
        L_0x01c2:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 133(0x85, float:1.86E-43)
            goto L_0x0789
        L_0x01ce:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 61
            goto L_0x0789
        L_0x01da:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 35
            goto L_0x0789
        L_0x01e6:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 62
            goto L_0x0789
        L_0x01f2:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 71
            goto L_0x0789
        L_0x01fe:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 78
            goto L_0x0789
        L_0x020a:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 96
            goto L_0x0789
        L_0x0216:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 72
            goto L_0x0789
        L_0x0222:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 10
            goto L_0x0789
        L_0x022e:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 81
            goto L_0x0789
        L_0x023a:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 59
            goto L_0x0789
        L_0x0246:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 58
            goto L_0x0789
        L_0x0252:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 57
            goto L_0x0789
        L_0x025e:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 114(0x72, float:1.6E-43)
            goto L_0x0789
        L_0x026a:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 106(0x6a, float:1.49E-43)
            goto L_0x0789
        L_0x0276:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 125(0x7d, float:1.75E-43)
            goto L_0x0789
        L_0x0282:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 124(0x7c, float:1.74E-43)
            goto L_0x0789
        L_0x028e:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 123(0x7b, float:1.72E-43)
            goto L_0x0789
        L_0x029a:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 122(0x7a, float:1.71E-43)
            goto L_0x0789
        L_0x02a6:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 12
            goto L_0x0789
        L_0x02b2:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 11
            goto L_0x0789
        L_0x02be:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 60
            goto L_0x0789
        L_0x02ca:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 82
            goto L_0x0789
        L_0x02d6:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 25
            goto L_0x0789
        L_0x02e2:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = r13
            goto L_0x0789
        L_0x02ed:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 77
            goto L_0x0789
        L_0x02f9:
            java.lang.String r2 = "l5460"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 76
            goto L_0x0789
        L_0x0305:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 67
            goto L_0x0789
        L_0x0311:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 135(0x87, float:1.89E-43)
            goto L_0x0789
        L_0x031d:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x0789
        L_0x0329:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 112(0x70, float:1.57E-43)
            goto L_0x0789
        L_0x0335:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 110(0x6e, float:1.54E-43)
            goto L_0x0789
        L_0x0341:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 108(0x6c, float:1.51E-43)
            goto L_0x0789
        L_0x034d:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 48
            goto L_0x0789
        L_0x0359:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 47
            goto L_0x0789
        L_0x0365:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 46
            goto L_0x0789
        L_0x0371:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 45
            goto L_0x0789
        L_0x037d:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 44
            goto L_0x0789
        L_0x0389:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 43
            goto L_0x0789
        L_0x0395:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 42
            goto L_0x0789
        L_0x03a1:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 30
            goto L_0x0789
        L_0x03ad:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = r6
            goto L_0x0789
        L_0x03b8:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 15
            goto L_0x0789
        L_0x03c4:
            java.lang.String r2 = "602LV"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = r5
            goto L_0x0789
        L_0x03cf:
            java.lang.String r2 = "601LV"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = r8
            goto L_0x0789
        L_0x03da:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 83
            goto L_0x0789
        L_0x03e6:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 92
            goto L_0x0789
        L_0x03f2:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 85
            goto L_0x0789
        L_0x03fe:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 75
            goto L_0x0789
        L_0x040a:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 50
            goto L_0x0789
        L_0x0416:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 136(0x88, float:1.9E-43)
            goto L_0x0789
        L_0x0422:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 111(0x6f, float:1.56E-43)
            goto L_0x0789
        L_0x042e:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 109(0x6d, float:1.53E-43)
            goto L_0x0789
        L_0x043a:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 93
            goto L_0x0789
        L_0x0446:
            java.lang.String r2 = "F04J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 41
            goto L_0x0789
        L_0x0452:
            java.lang.String r2 = "F04H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 40
            goto L_0x0789
        L_0x045e:
            java.lang.String r2 = "F03H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 39
            goto L_0x0789
        L_0x046a:
            java.lang.String r2 = "F02H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 38
            goto L_0x0789
        L_0x0476:
            java.lang.String r2 = "F01J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 37
            goto L_0x0789
        L_0x0482:
            java.lang.String r2 = "F01H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 36
            goto L_0x0789
        L_0x048e:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = r7
            goto L_0x0789
        L_0x0499:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = r10
            goto L_0x0789
        L_0x04a4:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = r0
            goto L_0x0789
        L_0x04af:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 49
            goto L_0x0789
        L_0x04bb:
            java.lang.String r3 = "deb"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0788
            goto L_0x0789
        L_0x04c5:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = r11
            goto L_0x0789
        L_0x04d0:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = r12
            goto L_0x0789
        L_0x04db:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 139(0x8b, float:1.95E-43)
            goto L_0x0789
        L_0x04e7:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 115(0x73, float:1.61E-43)
            goto L_0x0789
        L_0x04f3:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 107(0x6b, float:1.5E-43)
            goto L_0x0789
        L_0x04ff:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 94
            goto L_0x0789
        L_0x050b:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 86
            goto L_0x0789
        L_0x0517:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 80
            goto L_0x0789
        L_0x0523:
            java.lang.String r2 = "M04"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 79
            goto L_0x0789
        L_0x052f:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 73
            goto L_0x0789
        L_0x053b:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 84
            goto L_0x0789
        L_0x0547:
            java.lang.String r2 = "b5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 16
            goto L_0x0789
        L_0x0553:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 129(0x81, float:1.81E-43)
            goto L_0x0789
        L_0x055f:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 127(0x7f, float:1.78E-43)
            goto L_0x0789
        L_0x056b:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x0789
        L_0x0577:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 20
            goto L_0x0789
        L_0x0583:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 134(0x86, float:1.88E-43)
            goto L_0x0789
        L_0x058f:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 31
            goto L_0x0789
        L_0x059b:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 138(0x8a, float:1.93E-43)
            goto L_0x0789
        L_0x05a7:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 17
            goto L_0x0789
        L_0x05b3:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x0789
        L_0x05bf:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 105(0x69, float:1.47E-43)
            goto L_0x0789
        L_0x05cb:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 53
            goto L_0x0789
        L_0x05d7:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 51
            goto L_0x0789
        L_0x05e3:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 91
            goto L_0x0789
        L_0x05ef:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 132(0x84, float:1.85E-43)
            goto L_0x0789
        L_0x05fb:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 131(0x83, float:1.84E-43)
            goto L_0x0789
        L_0x0607:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 119(0x77, float:1.67E-43)
            goto L_0x0789
        L_0x0613:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 9
            goto L_0x0789
        L_0x061f:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 88
            goto L_0x0789
        L_0x062b:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 126(0x7e, float:1.77E-43)
            goto L_0x0789
        L_0x0637:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 34
            goto L_0x0789
        L_0x0643:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x0789
        L_0x064f:
            java.lang.String r2 = "A10-70L"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = r4
            goto L_0x0789
        L_0x065a:
            java.lang.String r2 = "A10-70F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = r3
            goto L_0x0789
        L_0x0665:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 87
            goto L_0x0789
        L_0x0671:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 118(0x76, float:1.65E-43)
            goto L_0x0789
        L_0x067d:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 70
            goto L_0x0789
        L_0x0689:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 18
            goto L_0x0789
        L_0x0695:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 52
            goto L_0x0789
        L_0x06a1:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 99
            goto L_0x0789
        L_0x06ad:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 98
            goto L_0x0789
        L_0x06b9:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 97
            goto L_0x0789
        L_0x06c5:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x0789
        L_0x06d1:
            java.lang.String r2 = "pacificrim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 95
            goto L_0x0789
        L_0x06dd:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 104(0x68, float:1.46E-43)
            goto L_0x0789
        L_0x06e9:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 21
            goto L_0x0789
        L_0x06f5:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 137(0x89, float:1.92E-43)
            goto L_0x0789
        L_0x0701:
            java.lang.String r2 = "RAIJIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 116(0x74, float:1.63E-43)
            goto L_0x0789
        L_0x070d:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 13
            goto L_0x0789
        L_0x0719:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 103(0x67, float:1.44E-43)
            goto L_0x0789
        L_0x0725:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 102(0x66, float:1.43E-43)
            goto L_0x0789
        L_0x0730:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 101(0x65, float:1.42E-43)
            goto L_0x0789
        L_0x073b:
            java.lang.String r2 = "NX573J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 90
            goto L_0x0789
        L_0x0746:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 89
            goto L_0x0789
        L_0x0751:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 22
            goto L_0x0789
        L_0x075c:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 74
            goto L_0x0789
        L_0x0767:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 56
            goto L_0x0789
        L_0x0772:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 55
            goto L_0x0789
        L_0x077d:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0788
            r2 = 54
            goto L_0x0789
        L_0x0788:
            r2 = r9
        L_0x0789:
            switch(r2) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007e;
                case 4: goto L_0x007e;
                case 5: goto L_0x007e;
                case 6: goto L_0x007e;
                case 7: goto L_0x007e;
                case 8: goto L_0x007e;
                case 9: goto L_0x007e;
                case 10: goto L_0x007e;
                case 11: goto L_0x007e;
                case 12: goto L_0x007e;
                case 13: goto L_0x007e;
                case 14: goto L_0x007e;
                case 15: goto L_0x007e;
                case 16: goto L_0x007e;
                case 17: goto L_0x007e;
                case 18: goto L_0x007e;
                case 19: goto L_0x007e;
                case 20: goto L_0x007e;
                case 21: goto L_0x007e;
                case 22: goto L_0x007e;
                case 23: goto L_0x007e;
                case 24: goto L_0x007e;
                case 25: goto L_0x007e;
                case 26: goto L_0x007e;
                case 27: goto L_0x007e;
                case 28: goto L_0x007e;
                case 29: goto L_0x007e;
                case 30: goto L_0x007e;
                case 31: goto L_0x007e;
                case 32: goto L_0x007e;
                case 33: goto L_0x007e;
                case 34: goto L_0x007e;
                case 35: goto L_0x007e;
                case 36: goto L_0x007e;
                case 37: goto L_0x007e;
                case 38: goto L_0x007e;
                case 39: goto L_0x007e;
                case 40: goto L_0x007e;
                case 41: goto L_0x007e;
                case 42: goto L_0x007e;
                case 43: goto L_0x007e;
                case 44: goto L_0x007e;
                case 45: goto L_0x007e;
                case 46: goto L_0x007e;
                case 47: goto L_0x007e;
                case 48: goto L_0x007e;
                case 49: goto L_0x007e;
                case 50: goto L_0x007e;
                case 51: goto L_0x007e;
                case 52: goto L_0x007e;
                case 53: goto L_0x007e;
                case 54: goto L_0x007e;
                case 55: goto L_0x007e;
                case 56: goto L_0x007e;
                case 57: goto L_0x007e;
                case 58: goto L_0x007e;
                case 59: goto L_0x007e;
                case 60: goto L_0x007e;
                case 61: goto L_0x007e;
                case 62: goto L_0x007e;
                case 63: goto L_0x007e;
                case 64: goto L_0x007e;
                case 65: goto L_0x007e;
                case 66: goto L_0x007e;
                case 67: goto L_0x007e;
                case 68: goto L_0x007e;
                case 69: goto L_0x007e;
                case 70: goto L_0x007e;
                case 71: goto L_0x007e;
                case 72: goto L_0x007e;
                case 73: goto L_0x007e;
                case 74: goto L_0x007e;
                case 75: goto L_0x007e;
                case 76: goto L_0x007e;
                case 77: goto L_0x007e;
                case 78: goto L_0x007e;
                case 79: goto L_0x007e;
                case 80: goto L_0x007e;
                case 81: goto L_0x007e;
                case 82: goto L_0x007e;
                case 83: goto L_0x007e;
                case 84: goto L_0x007e;
                case 85: goto L_0x007e;
                case 86: goto L_0x007e;
                case 87: goto L_0x007e;
                case 88: goto L_0x007e;
                case 89: goto L_0x007e;
                case 90: goto L_0x007e;
                case 91: goto L_0x007e;
                case 92: goto L_0x007e;
                case 93: goto L_0x007e;
                case 94: goto L_0x007e;
                case 95: goto L_0x007e;
                case 96: goto L_0x007e;
                case 97: goto L_0x007e;
                case 98: goto L_0x007e;
                case 99: goto L_0x007e;
                case 100: goto L_0x007e;
                case 101: goto L_0x007e;
                case 102: goto L_0x007e;
                case 103: goto L_0x007e;
                case 104: goto L_0x007e;
                case 105: goto L_0x007e;
                case 106: goto L_0x007e;
                case 107: goto L_0x007e;
                case 108: goto L_0x007e;
                case 109: goto L_0x007e;
                case 110: goto L_0x007e;
                case 111: goto L_0x007e;
                case 112: goto L_0x007e;
                case 113: goto L_0x007e;
                case 114: goto L_0x007e;
                case 115: goto L_0x007e;
                case 116: goto L_0x007e;
                case 117: goto L_0x007e;
                case 118: goto L_0x007e;
                case 119: goto L_0x007e;
                case 120: goto L_0x007e;
                case 121: goto L_0x007e;
                case 122: goto L_0x007e;
                case 123: goto L_0x007e;
                case 124: goto L_0x007e;
                case 125: goto L_0x007e;
                case 126: goto L_0x007e;
                case 127: goto L_0x007e;
                case 128: goto L_0x007e;
                case 129: goto L_0x007e;
                case 130: goto L_0x007e;
                case 131: goto L_0x007e;
                case 132: goto L_0x007e;
                case 133: goto L_0x007e;
                case 134: goto L_0x007e;
                case 135: goto L_0x007e;
                case 136: goto L_0x007e;
                case 137: goto L_0x007e;
                case 138: goto L_0x007e;
                case 139: goto L_0x007e;
                default: goto L_0x078c;
            }
        L_0x078c:
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x07aa }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x07aa }
            r3 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r2 == r3) goto L_0x0798
            goto L_0x07a2
        L_0x0798:
            java.lang.String r2 = "JSN-L21"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x07a2
            goto L_0x007e
        L_0x07a2:
            zzd = r0     // Catch:{ all -> 0x07aa }
            zzc = r10     // Catch:{ all -> 0x07aa }
        L_0x07a6:
            monitor-exit(r15)     // Catch:{ all -> 0x07aa }
            boolean r15 = zzd
            return r15
        L_0x07aa:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x07aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaba.zzbe(java.lang.String):boolean");
    }

    protected static final boolean zzbf(zzti zzti) {
        return Build.VERSION.SDK_INT >= 35 && zzti.zzh;
    }

    private final Surface zzbg(zzti zzti) {
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            return zzaco.zzb();
        }
        Surface surface = this.zzs;
        if (surface != null) {
            return surface;
        }
        if (zzbf(zzti)) {
            return null;
        }
        zzdd.zzf(zzbd(zzti));
        zzabd zzabd = this.zzt;
        if (!(zzabd == null || zzabd.zza == zzti.zzf)) {
            zzbl();
        }
        if (this.zzt == null) {
            this.zzt = zzabd.zza(this.zze, zzti.zzf);
        }
        return this.zzt;
    }

    private static List zzbh(Context context, zztr zztr, zzz zzz2, boolean z, boolean z2) throws zztw {
        String str = zzz2.zzo;
        if (str == null) {
            return zzfyq.zzn();
        }
        if ("video/dolby-vision".equals(str) && !zzaax.zza(context)) {
            List zzc2 = zzuc.zzc(zztr, zzz2, z, z2);
            if (!zzc2.isEmpty()) {
                return zzc2;
            }
        }
        return zzuc.zze(zztr, zzz2, z, z2);
    }

    private final void zzbi() {
        zzcd zzcd = this.zzI;
        if (zzcd != null) {
            this.zzg.zzt(zzcd);
        }
    }

    private final void zzbj(long j, long j2, zzz zzz2) {
        zzabp zzabp = this.zzL;
        if (zzabp != null) {
            zzabp.zzcT(j, j2, zzz2, zzaC());
        }
    }

    /* access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    public final void zzbk() {
        this.zzg.zzq(this.zzs);
        this.zzv = true;
    }

    private final void zzbl() {
        zzabd zzabd = this.zzt;
        if (zzabd != null) {
            zzabd.release();
            this.zzt = null;
        }
    }

    private final void zzbm(Object obj) throws zzin {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzs != surface) {
            this.zzs = surface;
            if (this.zzo == null) {
                this.zzi.zzk(surface);
            }
            this.zzv = false;
            int zzcU = zzcU();
            zztf zzaF = zzaF();
            if (zzaF != null && this.zzo == null) {
                zzti zzaH = zzaH();
                zzaH.getClass();
                zzti zzti = zzaH;
                if (!zzbn(zzaH) || this.zzm) {
                    zzaM();
                    zzaJ();
                } else {
                    Surface zzbg = zzbg(zzaH);
                    if (zzbg != null) {
                        zzaF.zzp(zzbg);
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        zzaF.zzi();
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            if (surface != null) {
                zzbi();
            } else {
                this.zzI = null;
                zzaco zzaco = this.zzo;
                if (zzaco != null) {
                    zzaco.zzi();
                }
            }
            if (zzcU == 2) {
                zzaco zzaco2 = this.zzo;
                if (zzaco2 != null) {
                    zzaco2.zzk(true);
                } else {
                    this.zzi.zzc(true);
                }
            }
        } else if (surface != null) {
            zzbi();
            Surface surface2 = this.zzs;
            if (surface2 != null && this.zzv) {
                this.zzg.zzq(surface2);
            }
        }
    }

    private final boolean zzbn(zzti zzti) {
        if (this.zzo != null) {
            return true;
        }
        Surface surface = this.zzs;
        return (surface != null && surface.isValid()) || zzbf(zzti) || zzbd(zzti);
    }

    private final boolean zzbo(zzhs zzhs) {
        return zzhs.zze < zzcW();
    }

    /* access modifiers changed from: protected */
    public final void zzA(long j, boolean z) throws zzin {
        zzaco zzaco = this.zzo;
        if (zzaco != null && !z) {
            zzaco.zzj(true);
        }
        super.zzA(j, z);
        if (this.zzo == null) {
            this.zzi.zzg();
        }
        if (z) {
            zzaco zzaco2 = this.zzo;
            if (zzaco2 != null) {
                zzaco2.zzk(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzA = 0;
    }

    /* access modifiers changed from: protected */
    public final void zzB() {
        zzaco zzaco = this.zzo;
        if (zzaco != null && this.zzf) {
            zzaco.zzn();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzD() {
        try {
            super.zzD();
        } finally {
            this.zzp = false;
            this.zzM = -9223372036854775807L;
            zzbl();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzE() {
        this.zzz = 0;
        this.zzy = zzcX().zzb();
        this.zzE = 0;
        this.zzF = 0;
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            zzaco.zzx();
        } else {
            this.zzi.zzd();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzF() {
        if (this.zzz > 0) {
            long zzb2 = zzcX().zzb();
            this.zzg.zzn(this.zzz, zzb2 - this.zzy);
            this.zzz = 0;
            this.zzy = zzb2;
        }
        int i = this.zzF;
        if (i != 0) {
            this.zzg.zzr(this.zzE, i);
            this.zzE = 0;
            this.zzF = 0;
        }
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            zzaco.zzy();
        } else {
            this.zzi.zze();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzG(zzz[] zzzArr, long j, long j2, zzvh zzvh) throws zzin {
        super.zzG(zzzArr, j, j2, zzvh);
        zzbl zzi2 = zzi();
        if (zzi2.zzo()) {
            this.zzN = -9223372036854775807L;
            return;
        }
        zzvh zzvh2 = zzvh;
        this.zzN = zzi2.zzn(zzvh.zza, new zzbj()).zzd;
    }

    public final void zzN(float f, float f2) throws zzin {
        super.zzN(f, f2);
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            zzaco.zzt(f);
        } else {
            this.zzi.zzl(f);
        }
    }

    public final String zzV() {
        return "MediaCodecVideoRenderer";
    }

    public final void zzW(long j, long j2) throws zzin {
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            try {
                zzaco.zzo(j, j2);
            } catch (zzacn e) {
                throw zzk(e, e.zza, false, 7001);
            }
        }
        super.zzW(j, j2);
    }

    public final boolean zzX() {
        if (!super.zzX()) {
            return false;
        }
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            return zzaco.zzB();
        }
        return true;
    }

    public final boolean zzY() {
        boolean zzY = super.zzY();
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            return zzaco.zzD(zzY);
        }
        if (!zzY || zzaF() != null) {
            return this.zzi.zzm(zzY);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final zzth zzaG(Throwable th, zzti zzti) {
        return new zzaau(th, zzti, this.zzs);
    }

    /* access modifiers changed from: protected */
    public final void zzaK(long j) {
        super.zzaK(j);
        this.zzB--;
    }

    /* access modifiers changed from: protected */
    public final void zzaL(zzhs zzhs) throws zzin {
        int zzay = zzay(zzhs);
        if (Build.VERSION.SDK_INT < 34 || (zzay & 32) == 0) {
            this.zzB++;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzaN() {
        super.zzaN();
        this.zzk.clear();
        this.zzB = 0;
        this.zzD = false;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaT(zzz zzz2) throws zzin {
        zzaco zzaco = this.zzo;
        if (zzaco == null || zzaco.zzC()) {
            return true;
        }
        try {
            zzaco.zzA(zzz2);
            return true;
        } catch (zzacn e) {
            throw zzk(e, zzz2, false, 7000);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzaU(zzhs zzhs) {
        boolean z = false;
        if (!zzR() && !zzhs.zzh() && this.zzN != -9223372036854775807L) {
            if (this.zzN - (zzhs.zze - zzaA()) > 100000 && zzbo(zzhs)) {
                if (zzhs.zze()) {
                    return false;
                }
                if (zzhs.zzi()) {
                    zzhs.zzb();
                    z = true;
                }
                if (z) {
                    this.zza.zzd++;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaV() {
        return this.zzC == null || this.zzD || zzaQ() || zzaz() != -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaW(zzti zzti) {
        return zzbn(zzti);
    }

    /* access modifiers changed from: protected */
    public final boolean zzaX() {
        zzti zzaH = zzaH();
        if (!(this.zzo == null || zzaH == null)) {
            String str = zzaH.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaX();
    }

    /* access modifiers changed from: protected */
    public final float zzaa(float f, zzz zzz2, zzz[] zzzArr) {
        zzti zzaH;
        float f2 = -1.0f;
        for (zzz zzz3 : zzzArr) {
            float f3 = zzz3.zzz;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.zzC == null || (zzaH = zzaH()) == null) {
            return f4;
        }
        float zza = zzaH.zza(zzz2.zzv, zzz2.zzw);
        return f4 != -1.0f ? Math.max(f4, zza) : zza;
    }

    /* access modifiers changed from: protected */
    public final int zzab(zztr zztr, zzz zzz2) throws zztw {
        boolean z;
        String str = zzz2.zzo;
        int i = 128;
        if (!zzay.zzj(str)) {
            return 128;
        }
        Context context = this.zze;
        int i2 = 0;
        boolean z2 = zzz2.zzs != null;
        List zzbh = zzbh(context, zztr, zzz2, z2, false);
        if (z2 && zzbh.isEmpty()) {
            zzbh = zzbh(context, zztr, zzz2, false, false);
        }
        if (zzbh.isEmpty()) {
            return 129;
        }
        if (!zzaY(zzz2)) {
            return 130;
        }
        zzti zzti = (zzti) zzbh.get(0);
        boolean zzf2 = zzti.zzf(zzz2);
        if (!zzf2) {
            int i3 = 1;
            while (true) {
                if (i3 >= zzbh.size()) {
                    break;
                }
                zzti zzti2 = (zzti) zzbh.get(i3);
                if (zzti2.zzf(zzz2)) {
                    zzf2 = true;
                    z = false;
                    zzti = zzti2;
                    break;
                }
                i3++;
            }
        }
        z = true;
        int i4 = true != zzf2 ? 3 : 4;
        int i5 = true != zzti.zzg(zzz2) ? 8 : 16;
        int i6 = true != zzti.zzg ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        if ("video/dolby-vision".equals(str) && !zzaax.zza(context)) {
            i = 256;
        }
        if (zzf2) {
            List zzbh2 = zzbh(context, zztr, zzz2, z2, true);
            if (!zzbh2.isEmpty()) {
                zzti zzti3 = (zzti) zzuc.zzf(zzbh2, zzz2).get(0);
                if (zzti3.zzf(zzz2) && zzti3.zzg(zzz2)) {
                    i2 = 32;
                }
            }
        }
        return i | i4 | i5 | i2 | i6;
    }

    /* access modifiers changed from: protected */
    public final zzie zzad(zzti zzti, zzz zzz2, zzz zzz3) {
        int i;
        int i2;
        zzie zzc2 = zzti.zzc(zzz2, zzz3);
        int i3 = zzc2.zze;
        zzaaz zzaaz = this.zzl;
        zzaaz.getClass();
        zzaaz zzaaz2 = zzaaz;
        if (zzz3.zzv > zzaaz.zza || zzz3.zzw > zzaaz.zzb) {
            i3 |= 256;
        }
        if (zzag(zzti, zzz3) > zzaaz.zzc) {
            i3 |= 64;
        }
        String str = zzti.zza;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = zzc2.zzd;
            i = 0;
        }
        return new zzie(str, zzz2, zzz3, i2, i);
    }

    /* access modifiers changed from: protected */
    public final zzie zzae(zzkv zzkv) throws zzin {
        zzie zzae = super.zzae(zzkv);
        zzz zzz2 = zzkv.zza;
        zzz2.getClass();
        zzz zzz3 = zzz2;
        this.zzg.zzp(zzz2, zzae);
        return zzae;
    }

    /* access modifiers changed from: protected */
    public final zztc zzaj(zzti zzti, zzz zzz2, MediaCrypto mediaCrypto, float f) {
        int i;
        int i2;
        zzaaz zzaaz;
        Point point;
        int i3;
        boolean z;
        zzz[] zzzArr;
        char c;
        boolean z2;
        int zzaf;
        zzti zzti2 = zzti;
        zzz zzz3 = zzz2;
        float f2 = f;
        zzz[] zzU = zzU();
        int length = zzU.length;
        int zzag = zzag(zzti, zzz2);
        int i4 = zzz3.zzw;
        int i5 = zzz3.zzv;
        if (length == 1) {
            if (!(zzag == -1 || (zzaf = zzaf(zzti, zzz2)) == -1)) {
                zzag = Math.min((int) (((float) zzag) * 1.5f), zzaf);
            }
            zzaaz = new zzaaz(i5, i4, zzag);
            i2 = i4;
            i = i5;
        } else {
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z3 = false;
            while (i8 < length) {
                zzz zzz4 = zzU[i8];
                zzk zzk2 = zzz3.zzE;
                if (zzk2 != null && zzz4.zzE == null) {
                    zzx zzb2 = zzz4.zzb();
                    zzb2.zzF(zzk2);
                    zzz4 = zzb2.zzan();
                }
                if (zzti2.zzc(zzz3, zzz4).zzd != 0) {
                    int i9 = zzz4.zzv;
                    c = 65535;
                    if (i9 != -1) {
                        zzzArr = zzU;
                        if (zzz4.zzw != -1) {
                            z2 = false;
                            z3 |= z2;
                            i7 = Math.max(i7, i9);
                            i6 = Math.max(i6, zzz4.zzw);
                            zzag = Math.max(zzag, zzag(zzti2, zzz4));
                        }
                    } else {
                        zzzArr = zzU;
                    }
                    z2 = true;
                    z3 |= z2;
                    i7 = Math.max(i7, i9);
                    i6 = Math.max(i6, zzz4.zzw);
                    zzag = Math.max(zzag, zzag(zzti2, zzz4));
                } else {
                    zzzArr = zzU;
                    c = 65535;
                }
                i8++;
                char c2 = c;
                zzU = zzzArr;
            }
            if (z3) {
                zzea.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i7 + "x" + i6);
                boolean z4 = i4 > i5;
                int i10 = z4 ? i4 : i5;
                int i11 = true != z4 ? i4 : i5;
                int[] iArr = zzb;
                int i12 = 0;
                while (true) {
                    if (i12 >= 9) {
                        i2 = i4;
                        i = i5;
                        break;
                    }
                    float f3 = (float) i11;
                    i2 = i4;
                    float f4 = (float) i10;
                    i = i5;
                    int i13 = iArr[i12];
                    int[] iArr2 = iArr;
                    float f5 = (float) i13;
                    if (i13 <= i10 || (i3 = (int) (f5 * (f3 / f4))) <= i11) {
                        break;
                    }
                    int i14 = true != z4 ? i13 : i3;
                    if (true != z4) {
                        i13 = i3;
                    }
                    point = zzti2.zzb(i14, i13);
                    float f6 = zzz3.zzz;
                    if (point != null) {
                        z = z4;
                        if (zzti2.zzh(point.x, point.y, (double) f6)) {
                            break;
                        }
                    } else {
                        z = z4;
                    }
                    i12++;
                    i4 = i2;
                    i5 = i;
                    iArr = iArr2;
                    z4 = z;
                }
                point = null;
                if (point != null) {
                    i7 = Math.max(i7, point.x);
                    i6 = Math.max(i6, point.y);
                    zzx zzb3 = zzz2.zzb();
                    zzb3.zzam(i7);
                    zzb3.zzQ(i6);
                    zzag = Math.max(zzag, zzaf(zzti2, zzb3.zzan()));
                    zzea.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i7 + "x" + i6);
                }
            } else {
                i2 = i4;
                i = i5;
            }
            zzaaz = new zzaaz(i7, i6, zzag);
        }
        String str = zzti2.zzc;
        this.zzl = zzaaz;
        boolean z5 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i);
        mediaFormat.setInteger("height", i2);
        zzed.zzb(mediaFormat, zzz3.zzr);
        float f7 = zzz3.zzz;
        if (f7 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f7);
        }
        zzed.zza(mediaFormat, "rotation-degrees", zzz3.zzA);
        zzk zzk3 = zzz3.zzE;
        if (zzk3 != null) {
            zzed.zza(mediaFormat, "color-transfer", zzk3.zzd);
            zzed.zza(mediaFormat, "color-standard", zzk3.zzb);
            zzed.zza(mediaFormat, "color-range", zzk3.zzc);
            byte[] bArr = zzk3.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzz3.zzo)) {
            int i15 = zzuc.zza;
            Pair zza = zzdk.zza(zzz2);
            if (zza != null) {
                zzed.zza(mediaFormat, "profile", ((Integer) zza.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaaz.zza);
        mediaFormat.setInteger("max-height", zzaaz.zzb);
        zzed.zza(mediaFormat, "max-input-size", zzaaz.zzc);
        mediaFormat.setInteger("priority", 0);
        float f8 = f;
        if (f8 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f8);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzJ));
        }
        Surface zzbg = zzbg(zzti);
        if (this.zzo != null && !zzex.zzL(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zztc.zzb(zzti2, mediaFormat, zzz3, zzbg, (MediaCrypto) null);
    }

    /* access modifiers changed from: protected */
    public final List zzak(zztr zztr, zzz zzz2, boolean z) throws zztw {
        return zzuc.zzf(zzbh(this.zze, zztr, zzz2, false, false), zzz2);
    }

    /* access modifiers changed from: protected */
    public final void zzam(zztf zztf, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zztf.zzn(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzA = 0;
        if (this.zzo == null) {
            zzcd zzcd = this.zzH;
            if (!zzcd.equals(zzcd.zza) && !zzcd.equals(this.zzI)) {
                this.zzI = zzcd;
                this.zzg.zzt(zzcd);
            }
            if (this.zzi.zzn() && this.zzs != null) {
                zzbk();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzan(zzhs zzhs) throws zzin {
        if (this.zzn) {
            ByteBuffer byteBuffer = zzhs.zzf;
            byteBuffer.getClass();
            ByteBuffer byteBuffer2 = byteBuffer;
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b != -75 || s != 60 || s2 != 1 || b2 != 4) {
                    return;
                }
                if (b3 == 0 || b3 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zztf zzaF = zzaF();
                    zzaF.getClass();
                    zztf zztf = zzaF;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzaF.zzq(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzao(Exception exc) {
        zzea.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    /* access modifiers changed from: protected */
    public final void zzap(String str, zztc zztc, long j, long j2) {
        this.zzg.zzk(str, j, j2);
        this.zzm = zzbe(str);
        zzti zzaH = zzaH();
        zzaH.getClass();
        zzti zzti = zzaH;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzaH.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzi2 = zzaH.zzi();
            int length = zzi2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (zzi2[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.zzn = z;
    }

    /* access modifiers changed from: protected */
    public final void zzaq(String str) {
        this.zzg.zzl(str);
    }

    /* access modifiers changed from: protected */
    public final void zzar(zzz zzz2, MediaFormat mediaFormat) {
        int i;
        int i2;
        zzz zzz3 = zzz2;
        MediaFormat mediaFormat2 = mediaFormat;
        zztf zzaF = zzaF();
        if (zzaF != null) {
            zzaF.zzr(this.zzw);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat2.containsKey("crop-right") && mediaFormat2.containsKey("crop-left") && mediaFormat2.containsKey("crop-bottom") && mediaFormat2.containsKey("crop-top");
        if (z) {
            i = (mediaFormat2.getInteger("crop-right") - mediaFormat2.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat2.getInteger("width");
        }
        if (z) {
            i2 = (mediaFormat2.getInteger("crop-bottom") - mediaFormat2.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat2.getInteger("height");
        }
        float f = zzz3.zzB;
        int i3 = zzz3.zzA;
        if (i3 == 90 || i3 == 270) {
            f = 1.0f / f;
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        this.zzH = new zzcd(i, i2, f);
        zzaco zzaco = this.zzo;
        if (zzaco == null || !this.zzO) {
            this.zzi.zzj(zzz3.zzz);
        } else {
            zzx zzb2 = zzz2.zzb();
            zzb2.zzam(i);
            zzb2.zzQ(i2);
            zzb2.zzad(f);
            zzz zzan = zzb2.zzan();
            int i5 = this.zzq;
            List list = this.zzr;
            if (list == null) {
                list = zzfyq.zzn();
            }
            zzaco.zzl(1, zzan, zzaB(), i5, list);
            this.zzq = 2;
        }
        this.zzO = false;
    }

    /* access modifiers changed from: protected */
    public final void zzas(zztf zztf, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zztf.zzo(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    /* access modifiers changed from: protected */
    public final void zzat() {
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            zzaco.zzw();
            long j = this.zzM;
            if (j == -9223372036854775807L) {
                j = zzaB();
                this.zzM = j;
            }
            this.zzo.zzp(-j);
        } else {
            this.zzi.zzf(2);
        }
        this.zzO = true;
    }

    /* access modifiers changed from: protected */
    public final void zzau() {
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            zzaco.zzw();
        }
    }

    /* access modifiers changed from: protected */
    public final int zzay(zzhs zzhs) {
        return (Build.VERSION.SDK_INT < 34 || this.zzC == null || !zzbo(zzhs)) ? 0 : 32;
    }

    /* access modifiers changed from: protected */
    public final void zzba(int i, int i2) {
        zzid zzid = this.zza;
        zzid.zzh += i;
        int i3 = i + i2;
        zzid.zzg += i3;
        this.zzz += i3;
        int i4 = this.zzA + i3;
        this.zzA = i4;
        zzid.zzi = Math.max(i4, zzid.zzi);
    }

    /* access modifiers changed from: protected */
    public final void zzbb(long j) {
        zzid zzid = this.zza;
        zzid.zzk += j;
        zzid.zzl++;
        this.zzE += j;
        this.zzF++;
    }

    public final boolean zzbc(long j, long j2, long j3, boolean z, boolean z2) throws zzin {
        int zzd2;
        if (this.zzo != null && this.zzf) {
            j2 -= -this.zzM;
        }
        if (j >= -500000 || z || (zzd2 = zzd(j2)) == 0) {
            return false;
        }
        if (z2) {
            zzid zzid = this.zza;
            int i = zzid.zzd + zzd2;
            zzid.zzd = i;
            zzid.zzf += this.zzB;
            zzid.zzd = i + this.zzk.size();
        } else {
            this.zza.zzj++;
            zzba(zzd2 + this.zzk.size(), this.zzB);
        }
        zzaP();
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            zzaco.zzj(false);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean zzbd(zzti zzti) {
        if (zzbe(zzti.zza)) {
            return false;
        }
        if (zzti.zzf) {
            return zzabd.zzb(this.zze);
        }
        return true;
    }

    public final void zzu() {
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            int i = this.zzq;
            if (i == 0 || i == 1) {
                this.zzq = 0;
            } else {
                zzaco.zzh();
            }
        } else {
            this.zzi.zzb();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzy() {
        this.zzI = null;
        this.zzN = -9223372036854775807L;
        this.zzv = false;
        this.zzD = true;
        try {
            super.zzy();
        } finally {
            zzaci zzaci = this.zzg;
            zzaci.zzm(this.zza);
            zzaci.zzt(zzcd.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzz(boolean z, boolean z2) throws zzin {
        super.zzz(z, z2);
        zzo();
        this.zzg.zzo(this.zza);
        if (!this.zzp) {
            if (this.zzr != null && this.zzo == null) {
                zzabh zzabh = new zzabh(this.zze, this.zzi);
                zzabh.zze(true);
                zzabh.zzd(zzcX());
                zzabo zzf2 = zzabh.zzf();
                zzf2.zzt(1);
                this.zzo = zzf2.zze(0);
            }
            this.zzp = true;
        }
        boolean z3 = !z2;
        zzaco zzaco = this.zzo;
        if (zzaco != null) {
            zzaco.zzr(new zzaav(this), zzgef.zzc());
            zzabp zzabp = this.zzL;
            if (zzabp != null) {
                this.zzo.zzv(zzabp);
            }
            if (this.zzs != null && !this.zzu.equals(zzeo.zza)) {
                this.zzo.zzs(this.zzs, this.zzu);
            }
            this.zzo.zzq(this.zzx);
            this.zzo.zzt(zzax());
            List list = this.zzr;
            if (list != null) {
                this.zzo.zzu(list);
            }
            this.zzq = z3;
            zzaI();
            return;
        }
        zzabs zzabs = this.zzi;
        zzabs.zzi(zzcX());
        zzabs.zzf(z3 ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    public final boolean zzav(long j, long j2, zztf zztf, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzz zzz2) throws zzin {
        zztf zztf2 = zztf;
        int i4 = i;
        long j4 = j3;
        zztf.getClass();
        long zzaA = j4 - zzaA();
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzk;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j4) {
                zzba(i5, 0);
                zzaco zzaco = this.zzo;
            } else {
                priorityQueue.poll();
                i5++;
            }
        }
        zzba(i5, 0);
        zzaco zzaco2 = this.zzo;
        if (zzaco2 == null) {
            zzabs zzabs = this.zzi;
            long zzaB = zzaB();
            zzabq zzabq = this.zzj;
            int zza = zzabs.zza(j3, j, j2, zzaB, z, z2, zzabq);
            if (zza == 0) {
                long zzc2 = zzcX().zzc();
                zzbj(zzaA, zzc2, zzz2);
                zzam(zztf, i, zzaA, zzc2);
                zzbb(zzabq.zzc());
                return true;
            } else if (zza == 1) {
                zztf zztf3 = zztf2;
                long zzd2 = zzabq.zzd();
                long zzc3 = zzabq.zzc();
                if (zzd2 == this.zzG) {
                    zzas(zztf2, i4, zzaA);
                } else {
                    zzbj(zzaA, zzd2, zzz2);
                    zzam(zztf, i, zzaA, zzd2);
                }
                zzbb(zzc3);
                this.zzG = zzd2;
                return true;
            } else if (zza == 2) {
                Trace.beginSection("dropVideoBuffer");
                zztf2.zzo(i4, false);
                Trace.endSection();
                zzba(0, 1);
                zzbb(zzabq.zzc());
                return true;
            } else if (zza != 3) {
                return false;
            } else {
                zzas(zztf2, i4, zzaA);
                zzbb(zzabq.zzc());
                return true;
            }
        } else if (!z || z2) {
            return zzaco2.zzz(j4, new zzaaw(this, zztf, i, zzaA));
        } else {
            zzas(zztf2, i4, zzaA);
            return true;
        }
    }

    public final void zzv(int i, Object obj) throws zzin {
        boolean z = true;
        if (i == 1) {
            zzbm(obj);
        } else if (i == 7) {
            obj.getClass();
            zzabp zzabp = (zzabp) obj;
            this.zzL = zzabp;
            zzaco zzaco = this.zzo;
            if (zzaco != null) {
                zzaco.zzv(zzabp);
            }
        } else if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzK != intValue) {
                this.zzK = intValue;
            }
        } else if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzw = intValue2;
            zztf zzaF = zzaF();
            if (zzaF != null) {
                zzaF.zzr(intValue2);
            }
        } else if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzx = intValue3;
            zzaco zzaco2 = this.zzo;
            if (zzaco2 != null) {
                zzaco2.zzq(intValue3);
            } else {
                this.zzi.zzh(intValue3);
            }
        } else if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbz.zza)) {
                zzaco zzaco3 = this.zzo;
                if (zzaco3 != null && zzaco3.zzC()) {
                    zzaco3.zzm();
                    return;
                }
                return;
            }
            this.zzr = list;
            zzaco zzaco4 = this.zzo;
            if (zzaco4 != null) {
                zzaco4.zzu(list);
            }
        } else if (i != 14) {
            switch (i) {
                case 16:
                    obj.getClass();
                    this.zzJ = ((Integer) obj).intValue();
                    zztf zzaF2 = zzaF();
                    if (zzaF2 != null && Build.VERSION.SDK_INT >= 35) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("importance", Math.max(0, -this.zzJ));
                        zzaF2.zzq(bundle);
                        return;
                    }
                    return;
                case 17:
                    Surface surface = this.zzs;
                    zzbm((Object) null);
                    obj.getClass();
                    ((zzaba) obj).zzv(1, surface);
                    return;
                case 18:
                    boolean z2 = this.zzC != null;
                    zzmh zzmh = (zzmh) obj;
                    this.zzC = zzmh;
                    if (zzmh == null) {
                        z = false;
                    }
                    if (z2 != z) {
                        zzaZ();
                        return;
                    }
                    return;
                default:
                    super.zzv(i, obj);
                    return;
            }
        } else {
            obj.getClass();
            zzeo zzeo = (zzeo) obj;
            if (zzeo.zzb() != 0 && zzeo.zza() != 0) {
                this.zzu = zzeo;
                zzaco zzaco5 = this.zzo;
                if (zzaco5 != null) {
                    Surface surface2 = this.zzs;
                    zzdd.zzb(surface2);
                    Surface surface3 = surface2;
                    zzaco5.zzs(surface2, zzeo);
                }
            }
        }
    }
}
