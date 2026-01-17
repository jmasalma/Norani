package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzyu extends zzza implements zzmc {
    public static final /* synthetic */ int zzb = 0;
    /* access modifiers changed from: private */
    public static final zzgab zzc = zzgab.zzb(new zzxu());
    public final Context zza;
    private final Object zzd = new Object();
    private zzyi zze;
    private Thread zzf;
    private zzym zzg;
    private zze zzh;
    private final zzxq zzi;

    public zzyu(Context context) {
        zzxq zzxq = new zzxq();
        zzyi zzyi = zzyi.zzF;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzi = zzxq;
        if (zzyi instanceof zzyi) {
            zzyi zzyi2 = zzyi;
            this.zze = zzyi;
        } else {
            zzyh zzyh = new zzyh(zzyi, (zzyt) null);
            zzyh.zzw(zzyi);
            this.zze = new zzyi(zzyh);
        }
        this.zzh = zze.zza;
        if (this.zze.zzQ && context == null) {
            zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* bridge */ /* synthetic */ int zzb(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : IntCompanionObject.MAX_VALUE;
    }

    protected static int zzc(zzz zzz, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzz.zzd)) {
            return 4;
        }
        String zzh2 = zzh(str);
        String zzh3 = zzh(zzz.zzd);
        if (zzh3 == null || zzh2 == null) {
            if (!z || zzh3 != null) {
                return 0;
            }
            return 1;
        } else if (zzh3.startsWith(zzh2) || zzh2.startsWith(zzh3)) {
            return 3;
        } else {
            String str2 = zzex.zza;
            if (zzh3.split("-", 2)[0].equals(zzh2.split("-", 2)[0])) {
                return 2;
            }
            return 0;
        }
    }

    protected static String zzh(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static /* synthetic */ boolean zzm(zzyu zzyu, zzyi zzyi, zzz zzz) {
        zzym zzym;
        zzym zzym2;
        if (!zzyi.zzQ) {
            return true;
        }
        int i = zzz.zzG;
        char c = 65535;
        if (i == -1 || i <= 2) {
            return true;
        }
        String str = zzz.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        c = 0;
                        break;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if ((c == 0 || c == 1 || c == 2 || c == 3) && (Build.VERSION.SDK_INT < 32 || (zzym2 = zzyu.zzg) == null || !zzym2.zze())) {
                return true;
            }
        }
        if (Build.VERSION.SDK_INT < 32 || (zzym = zzyu.zzg) == null || !zzym.zze() || !zzym.zzc() || !zzyu.zzg.zzd()) {
            return false;
        }
        if (zzyu.zzg.zzb(zzyu.zzh, zzz)) {
            return true;
        }
        return false;
    }

    private static void zzt(zzxk zzxk, zzbr zzbr, Map map) {
        int i = 0;
        while (i < zzxk.zzb) {
            if (((zzbn) zzbr.zzD.get(zzxk.zzb(i))) == null) {
                i++;
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzu() {
        boolean z;
        zzym zzym;
        synchronized (this.zzd) {
            z = false;
            if (this.zze.zzQ && Build.VERSION.SDK_INT >= 32 && (zzym = this.zzg) != null && zzym.zze()) {
                z = true;
            }
        }
        if (z) {
            zzs();
        }
    }

    private static final Pair zzv(int i, zzyz zzyz, int[][][] iArr, zzyo zzyo, Comparator comparator) {
        Object obj;
        boolean z;
        zzyz zzyz2 = zzyz;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzyz2.zzc(i2)) {
                zzxk zzd2 = zzyz2.zzd(i2);
                int i3 = 0;
                while (i3 < zzd2.zzb) {
                    zzbm zzb2 = zzd2.zzb(i3);
                    List zza2 = zzyo.zza(i2, zzb2, iArr[i2][i3]);
                    int i4 = zzb2.zza;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        zzyp zzyp = (zzyp) zza2.get(i5);
                        int zzb3 = zzyp.zzb();
                        if (!zArr[i5] && zzb3 != 0) {
                            if (zzb3 == 1) {
                                obj = zzfyq.zzo(zzyp);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzyp);
                                int i7 = i6;
                                while (i7 < i4) {
                                    zzyp zzyp2 = (zzyp) zza2.get(i7);
                                    if (zzyp2.zzb() != 2 || !zzyp.zzc(zzyp2)) {
                                        z = true;
                                    } else {
                                        arrayList2.add(zzyp2);
                                        z = true;
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    boolean z2 = z;
                                    zzyz zzyz3 = zzyz;
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        zzyz zzyz4 = zzyz;
                        i5 = i6;
                    }
                    i3++;
                    zzyz zzyz5 = zzyz;
                }
            }
            zzyo zzyo2 = zzyo;
            i2++;
            zzyz2 = zzyz;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzyp) list.get(i8)).zzc;
        }
        zzyp zzyp3 = (zzyp) list.get(0);
        return Pair.create(new zzyv(zzyp3.zzb, iArr2, 0), Integer.valueOf(zzyp3.zza));
    }

    public final void zza(zzma zzma) {
        synchronized (this.zzd) {
            boolean z = this.zze.zzU;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: com.google.android.gms.internal.ads.zzyw[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.google.android.gms.internal.ads.zzxr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: com.google.android.gms.internal.ads.zzyx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: com.google.android.gms.internal.ads.zzyx} */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        r11 = r1.zza;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair zzd(com.google.android.gms.internal.ads.zzyz r27, int[][][] r28, int[] r29, com.google.android.gms.internal.ads.zzvh r30, com.google.android.gms.internal.ads.zzbl r31) throws com.google.android.gms.internal.ads.zzin {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r28
            r3 = r29
            java.lang.Object r4 = r1.zzd
            monitor-enter(r4)
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0295 }
            r1.zzf = r5     // Catch:{ all -> 0x0295 }
            com.google.android.gms.internal.ads.zzyi r5 = r1.zze     // Catch:{ all -> 0x0295 }
            monitor-exit(r4)     // Catch:{ all -> 0x0295 }
            boolean r4 = r5.zzQ
            if (r4 == 0) goto L_0x002b
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 32
            if (r4 < r6) goto L_0x002b
            com.google.android.gms.internal.ads.zzym r4 = r1.zzg
            if (r4 != 0) goto L_0x002b
            android.content.Context r4 = r1.zza
            com.google.android.gms.internal.ads.zzym r6 = new com.google.android.gms.internal.ads.zzym
            r6.<init>(r4, r1)
            r1.zzg = r6
        L_0x002b:
            r4 = 2
            com.google.android.gms.internal.ads.zzyv[] r6 = new com.google.android.gms.internal.ads.zzyv[r4]
            r7 = 0
            r8 = r7
        L_0x0030:
            r9 = 1
            if (r8 >= r4) goto L_0x0046
            int r10 = r0.zzc(r8)
            if (r10 != r4) goto L_0x0043
            com.google.android.gms.internal.ads.zzxk r10 = r0.zzd(r8)
            int r10 = r10.zzb
            if (r10 <= 0) goto L_0x0043
            r8 = r9
            goto L_0x0047
        L_0x0043:
            int r8 = r8 + 1
            goto L_0x0030
        L_0x0046:
            r8 = r7
        L_0x0047:
            com.google.android.gms.internal.ads.zzxz r10 = new com.google.android.gms.internal.ads.zzxz
            r10.<init>(r1, r5, r8, r3)
            com.google.android.gms.internal.ads.zzya r8 = new com.google.android.gms.internal.ads.zzya
            r8.<init>()
            android.util.Pair r8 = zzv(r9, r0, r2, r10, r8)
            if (r8 == 0) goto L_0x0065
            java.lang.Object r10 = r8.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r11 = r8.first
            com.google.android.gms.internal.ads.zzyv r11 = (com.google.android.gms.internal.ads.zzyv) r11
            r6[r10] = r11
        L_0x0065:
            if (r8 != 0) goto L_0x0069
            r8 = 0
            goto L_0x007d
        L_0x0069:
            java.lang.Object r11 = r8.first
            com.google.android.gms.internal.ads.zzyv r11 = (com.google.android.gms.internal.ads.zzyv) r11
            com.google.android.gms.internal.ads.zzbm r11 = r11.zza
            java.lang.Object r8 = r8.first
            com.google.android.gms.internal.ads.zzyv r8 = (com.google.android.gms.internal.ads.zzyv) r8
            int[] r8 = r8.zzb
            r8 = r8[r7]
            com.google.android.gms.internal.ads.zzz r8 = r11.zzb(r8)
            java.lang.String r8 = r8.zzd
        L_0x007d:
            com.google.android.gms.internal.ads.zzbp r11 = r5.zzu
            int r11 = r11.zzb
            boolean r11 = r5.zzk
            if (r11 == 0) goto L_0x008e
            android.content.Context r11 = r1.zza
            if (r11 == 0) goto L_0x008e
            android.graphics.Point r11 = com.google.android.gms.internal.ads.zzex.zzw(r11)
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            com.google.android.gms.internal.ads.zzxx r12 = new com.google.android.gms.internal.ads.zzxx
            r12.<init>(r5, r8, r3, r11)
            com.google.android.gms.internal.ads.zzxy r3 = new com.google.android.gms.internal.ads.zzxy
            r3.<init>()
            android.util.Pair r3 = zzv(r4, r0, r2, r12, r3)
            boolean r11 = r5.zzA
            r11 = 4
            if (r3 != 0) goto L_0x00b1
            com.google.android.gms.internal.ads.zzxv r12 = new com.google.android.gms.internal.ads.zzxv
            r12.<init>(r5)
            com.google.android.gms.internal.ads.zzxw r13 = new com.google.android.gms.internal.ads.zzxw
            r13.<init>()
            android.util.Pair r12 = zzv(r11, r0, r2, r12, r13)
            goto L_0x00b2
        L_0x00b1:
            r12 = 0
        L_0x00b2:
            if (r12 == 0) goto L_0x00c3
            java.lang.Object r3 = r12.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r12 = r12.first
            com.google.android.gms.internal.ads.zzyv r12 = (com.google.android.gms.internal.ads.zzyv) r12
            r6[r3] = r12
            goto L_0x00d3
        L_0x00c3:
            if (r3 == 0) goto L_0x00d3
            java.lang.Object r12 = r3.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.Object r3 = r3.first
            com.google.android.gms.internal.ads.zzyv r3 = (com.google.android.gms.internal.ads.zzyv) r3
            r6[r12] = r3
        L_0x00d3:
            boolean r3 = r5.zzx
            if (r3 == 0) goto L_0x00fb
            android.content.Context r3 = r1.zza
            if (r3 != 0) goto L_0x00dc
            goto L_0x00fb
        L_0x00dc:
            java.lang.String r12 = "captioning"
            java.lang.Object r3 = r3.getSystemService(r12)
            android.view.accessibility.CaptioningManager r3 = (android.view.accessibility.CaptioningManager) r3
            if (r3 == 0) goto L_0x00fb
            boolean r12 = r3.isEnabled()
            if (r12 != 0) goto L_0x00ed
            goto L_0x00fb
        L_0x00ed:
            java.util.Locale r3 = r3.getLocale()
            if (r3 != 0) goto L_0x00f4
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r12 = com.google.android.gms.internal.ads.zzex.zza
            java.lang.String r3 = r3.toLanguageTag()
            goto L_0x00fc
        L_0x00fb:
            r3 = 0
        L_0x00fc:
            com.google.android.gms.internal.ads.zzyc r12 = new com.google.android.gms.internal.ads.zzyc
            r12.<init>(r5, r8, r3)
            com.google.android.gms.internal.ads.zzyd r3 = new com.google.android.gms.internal.ads.zzyd
            r3.<init>()
            r8 = 3
            android.util.Pair r3 = zzv(r8, r0, r2, r12, r3)
            if (r3 == 0) goto L_0x011b
            java.lang.Object r12 = r3.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.Object r3 = r3.first
            com.google.android.gms.internal.ads.zzyv r3 = (com.google.android.gms.internal.ads.zzyv) r3
            r6[r12] = r3
        L_0x011b:
            r3 = r7
        L_0x011c:
            if (r3 >= r4) goto L_0x018e
            int r12 = r0.zzc(r3)
            if (r12 == r4) goto L_0x0186
            if (r12 == r9) goto L_0x0186
            if (r12 == r8) goto L_0x0186
            if (r12 == r11) goto L_0x0186
            com.google.android.gms.internal.ads.zzxk r12 = r0.zzd(r3)
            r13 = r2[r3]
            r14 = r7
            r16 = r14
            r15 = 0
            r17 = 0
        L_0x0136:
            int r8 = r12.zzb
            if (r14 >= r8) goto L_0x0176
            com.google.android.gms.internal.ads.zzbm r8 = r12.zzb(r14)
            r18 = r13[r14]
            r9 = r7
            r11 = r17
        L_0x0143:
            int r10 = r8.zza
            if (r9 >= r10) goto L_0x016d
            r10 = r18[r9]
            boolean r4 = r5.zzR
            boolean r4 = com.google.android.gms.internal.ads.zzmb.zza(r10, r4)
            if (r4 == 0) goto L_0x0168
            com.google.android.gms.internal.ads.zzz r4 = r8.zzb(r9)
            com.google.android.gms.internal.ads.zzyg r10 = new com.google.android.gms.internal.ads.zzyg
            r7 = r18[r9]
            r10.<init>(r4, r7)
            if (r11 == 0) goto L_0x0164
            int r4 = r10.compareTo(r11)
            if (r4 <= 0) goto L_0x0168
        L_0x0164:
            r15 = r8
            r16 = r9
            r11 = r10
        L_0x0168:
            int r9 = r9 + 1
            r4 = 2
            r7 = 0
            goto L_0x0143
        L_0x016d:
            int r14 = r14 + 1
            r17 = r11
            r4 = 2
            r7 = 0
            r9 = 1
            r11 = 4
            goto L_0x0136
        L_0x0176:
            if (r15 != 0) goto L_0x017a
            r4 = 0
            goto L_0x0184
        L_0x017a:
            com.google.android.gms.internal.ads.zzyv r4 = new com.google.android.gms.internal.ads.zzyv
            int[] r7 = new int[]{r16}
            r8 = 0
            r4.<init>(r15, r7, r8)
        L_0x0184:
            r6[r3] = r4
        L_0x0186:
            int r3 = r3 + 1
            r4 = 2
            r7 = 0
            r8 = 3
            r9 = 1
            r11 = 4
            goto L_0x011c
        L_0x018e:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 2
            r8 = 0
        L_0x0195:
            if (r8 >= r3) goto L_0x01a1
            com.google.android.gms.internal.ads.zzxk r4 = r0.zzd(r8)
            zzt(r4, r5, r2)
            int r8 = r8 + 1
            goto L_0x0195
        L_0x01a1:
            com.google.android.gms.internal.ads.zzxk r4 = r27.zze()
            zzt(r4, r5, r2)
            r8 = 0
        L_0x01a9:
            if (r8 >= r3) goto L_0x01c0
            int r4 = r0.zzc(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r2.get(r4)
            com.google.android.gms.internal.ads.zzbn r4 = (com.google.android.gms.internal.ads.zzbn) r4
            if (r4 != 0) goto L_0x01be
            int r8 = r8 + 1
            goto L_0x01a9
        L_0x01be:
            r4 = 0
            throw r4
        L_0x01c0:
            r4 = 0
            r8 = 0
        L_0x01c2:
            if (r8 >= r3) goto L_0x01dc
            com.google.android.gms.internal.ads.zzxk r2 = r0.zzd(r8)
            boolean r3 = r5.zzf(r8, r2)
            if (r3 != 0) goto L_0x01cf
            goto L_0x01d7
        L_0x01cf:
            com.google.android.gms.internal.ads.zzyj r2 = r5.zzd(r8, r2)
            if (r2 != 0) goto L_0x01db
            r6[r8] = r4
        L_0x01d7:
            int r8 = r8 + 1
            r3 = 2
            goto L_0x01c2
        L_0x01db:
            throw r4
        L_0x01dc:
            r2 = r3
            r8 = 0
        L_0x01de:
            if (r8 >= r2) goto L_0x0200
            int r2 = r0.zzc(r8)
            boolean r3 = r5.zze(r8)
            if (r3 != 0) goto L_0x01f9
            com.google.android.gms.internal.ads.zzfyv r3 = r5.zzE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x01f7
            goto L_0x01f9
        L_0x01f7:
            r4 = 0
            goto L_0x01fc
        L_0x01f9:
            r4 = 0
            r6[r8] = r4
        L_0x01fc:
            int r8 = r8 + 1
            r2 = 2
            goto L_0x01de
        L_0x0200:
            r4 = 0
            com.google.android.gms.internal.ads.zzxq r2 = r1.zzi
            com.google.android.gms.internal.ads.zzzl r3 = r26.zzq()
            com.google.android.gms.internal.ads.zzfyq r7 = com.google.android.gms.internal.ads.zzxr.zzd(r6)
            r8 = 2
            com.google.android.gms.internal.ads.zzyw[] r15 = new com.google.android.gms.internal.ads.zzyw[r8]
            r14 = 0
        L_0x020f:
            if (r14 >= r8) goto L_0x025b
            r8 = r6[r14]
            if (r8 == 0) goto L_0x0251
            int[] r11 = r8.zzb
            int r9 = r11.length
            if (r9 != 0) goto L_0x021b
            goto L_0x0251
        L_0x021b:
            r13 = 1
            if (r9 != r13) goto L_0x0238
            com.google.android.gms.internal.ads.zzbm r8 = r8.zza
            com.google.android.gms.internal.ads.zzyx r9 = new com.google.android.gms.internal.ads.zzyx
            r16 = 0
            r22 = r11[r16]
            r24 = 0
            r25 = 0
            r23 = 0
            r20 = r9
            r21 = r8
            r20.<init>(r21, r22, r23, r24, r25)
            r17 = r13
            r19 = r14
            goto L_0x024e
        L_0x0238:
            r16 = 0
            com.google.android.gms.internal.ads.zzbm r10 = r8.zza
            java.lang.Object r8 = r7.get(r14)
            com.google.android.gms.internal.ads.zzfyq r8 = (com.google.android.gms.internal.ads.zzfyq) r8
            r12 = 0
            r9 = r2
            r17 = r13
            r13 = r3
            r19 = r14
            r14 = r8
            com.google.android.gms.internal.ads.zzxr r9 = r9.zza(r10, r11, r12, r13, r14)
        L_0x024e:
            r15[r19] = r9
            goto L_0x0257
        L_0x0251:
            r19 = r14
            r16 = 0
            r17 = 1
        L_0x0257:
            int r14 = r19 + 1
            r8 = 2
            goto L_0x020f
        L_0x025b:
            r16 = 0
            com.google.android.gms.internal.ads.zzme[] r2 = new com.google.android.gms.internal.ads.zzme[r8]
            r7 = r16
        L_0x0261:
            if (r7 >= r8) goto L_0x028e
            int r3 = r0.zzc(r7)
            boolean r6 = r5.zze(r7)
            if (r6 != 0) goto L_0x0288
            com.google.android.gms.internal.ads.zzfyv r6 = r5.zzE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L_0x027a
            goto L_0x0288
        L_0x027a:
            int r3 = r0.zzc(r7)
            r6 = -2
            if (r3 == r6) goto L_0x0285
            r3 = r15[r7]
            if (r3 == 0) goto L_0x0288
        L_0x0285:
            com.google.android.gms.internal.ads.zzme r3 = com.google.android.gms.internal.ads.zzme.zza
            goto L_0x0289
        L_0x0288:
            r3 = r4
        L_0x0289:
            r2[r7] = r3
            int r7 = r7 + 1
            goto L_0x0261
        L_0x028e:
            boolean r0 = r5.zzS
            android.util.Pair r0 = android.util.Pair.create(r2, r15)
            return r0
        L_0x0295:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0295 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyu.zzd(com.google.android.gms.internal.ads.zzyz, int[][][], int[], com.google.android.gms.internal.ads.zzvh, com.google.android.gms.internal.ads.zzbl):android.util.Pair");
    }

    public final zzmc zze() {
        return this;
    }

    public final zzyi zzf() {
        zzyi zzyi;
        synchronized (this.zzd) {
            zzyi = this.zze;
        }
        return zzyi;
    }

    public final void zzj() {
        zzym zzym;
        synchronized (this.zzd) {
            Thread thread = this.zzf;
            if (thread != null) {
                zzdd.zzg(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzym = this.zzg) != null) {
            zzym.zza();
            this.zzg = null;
        }
        super.zzj();
    }

    public final void zzk(zze zze2) {
        if (!this.zzh.equals(zze2)) {
            this.zzh = zze2;
            zzu();
        }
    }

    public final void zzl(zzyh zzyh) {
        boolean z;
        zzyi zzyi = new zzyi(zzyh);
        synchronized (this.zzd) {
            z = !this.zze.equals(zzyi);
            this.zze = zzyi;
        }
        if (z) {
            if (zzyi.zzQ && this.zza == null) {
                zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    public final boolean zzn() {
        return true;
    }
}
