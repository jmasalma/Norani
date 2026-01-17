package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzuc {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzti zza() throws zztw {
        List zzd = zzd("audio/raw", false, false);
        if (zzd.isEmpty()) {
            return null;
        }
        return (zzti) zzd.get(0);
    }

    public static String zzb(zzz zzz) {
        Pair zza2;
        String str = zzz.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (zza2 = zzdk.zza(zzz)) != null) {
            int intValue = ((Integer) zza2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if (!"video/mv-hevc".equals(str)) {
            return null;
        }
        return "video/hevc";
    }

    public static List zzc(zztr zztr, zzz zzz, boolean z, boolean z2) throws zztw {
        String zzb2 = zzb(zzz);
        if (zzb2 == null) {
            return zzfyq.zzn();
        }
        return zztr.zza(zzb2, z, z2);
    }

    public static synchronized List zzd(String str, boolean z, boolean z2) throws zztw {
        synchronized (zzuc.class) {
            zztv zztv = new zztv(str, z, z2);
            HashMap hashMap = zzb;
            List list = (List) hashMap.get(zztv);
            if (list != null) {
                return list;
            }
            ArrayList zzg = zzg(zztv, new zztz(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                zzg.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                zzh(zzg, new zztt());
            }
            if (Build.VERSION.SDK_INT < 32 && zzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzti) zzg.get(0)).zza)) {
                zzg.add((zzti) zzg.remove(0));
            }
            zzfyq zzl = zzfyq.zzl(zzg);
            hashMap.put(zztv, zzl);
            return zzl;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zze(zztr zztr, zzz zzz, boolean z, boolean z2) throws zztw {
        List zza2 = zztr.zza(zzz.zzo, z, z2);
        List zzc = zzc(zztr, zzz, z, z2);
        int i = zzfyq.zzd;
        zzfyn zzfyn = new zzfyn();
        zzfyn.zzh(zza2);
        zzfyn.zzh(zzc);
        return zzfyn.zzi();
    }

    public static List zzf(List list, zzz zzz) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zztu(zzz));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r2 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0189, code lost:
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r2.append(r3);
        r2.append(".secure");
        r5.add(com.google.android.gms.internal.ads.zzti.zzd(r2.toString(), r15, r4, r9, r10, r0, r1, false, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r12.endsWith(".secure") == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList zzg(com.google.android.gms.internal.ads.zztv r23, com.google.android.gms.internal.ads.zztx r24) throws com.google.android.gms.internal.ads.zztw {
        /*
            r0 = r23
            r1 = r24
            java.lang.String r2 = "secure-playback"
            java.lang.String r3 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x01dc }
            r5.<init>()     // Catch:{ Exception -> 0x01dc }
            java.lang.String r15 = r0.zza     // Catch:{ Exception -> 0x01dc }
            int r14 = r24.zza()     // Catch:{ Exception -> 0x01dc }
            boolean r16 = r24.zze()     // Catch:{ Exception -> 0x01dc }
            r17 = 0
            r13 = r17
        L_0x001b:
            if (r13 >= r14) goto L_0x01db
            android.media.MediaCodecInfo r6 = r1.zzb(r13)     // Catch:{ Exception -> 0x01dc }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01dc }
            r8 = 29
            if (r7 < r8) goto L_0x0034
            boolean r7 = r6.isAlias()     // Catch:{ Exception -> 0x01dc }
            if (r7 == 0) goto L_0x0034
        L_0x002d:
            r20 = r2
            r22 = r13
            r2 = r14
            goto L_0x01d0
        L_0x0034:
            java.lang.String r12 = r6.getName()     // Catch:{ Exception -> 0x01dc }
            boolean r7 = r6.isEncoder()     // Catch:{ Exception -> 0x01dc }
            if (r7 != 0) goto L_0x002d
            java.lang.String r7 = ".secure"
            if (r16 != 0) goto L_0x0048
            boolean r9 = r12.endsWith(r7)     // Catch:{ Exception -> 0x01dc }
            if (r9 != 0) goto L_0x002d
        L_0x0048:
            java.lang.String[] r9 = r6.getSupportedTypes()     // Catch:{ Exception -> 0x01dc }
            int r10 = r9.length     // Catch:{ Exception -> 0x01dc }
            r11 = r17
        L_0x004f:
            if (r11 >= r10) goto L_0x005e
            r4 = r9[r11]     // Catch:{ Exception -> 0x01dc }
            boolean r18 = r4.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x01dc }
            if (r18 == 0) goto L_0x005b
            goto L_0x00db
        L_0x005b:
            int r11 = r11 + 1
            goto L_0x004f
        L_0x005e:
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r15.equals(r4)     // Catch:{ Exception -> 0x01dc }
            if (r4 == 0) goto L_0x0085
            java.lang.String r4 = "OMX.MS.HEVCDV.Decoder"
            boolean r4 = r4.equals(r12)     // Catch:{ Exception -> 0x01dc }
            if (r4 == 0) goto L_0x0072
            java.lang.String r4 = "video/hevcdv"
            goto L_0x00db
        L_0x0072:
            java.lang.String r4 = "OMX.RTK.video.decoder"
            boolean r4 = r4.equals(r12)     // Catch:{ Exception -> 0x01dc }
            if (r4 != 0) goto L_0x0082
            java.lang.String r4 = "OMX.realtek.video.decoder.tunneled"
            boolean r4 = r4.equals(r12)     // Catch:{ Exception -> 0x01dc }
            if (r4 == 0) goto L_0x009e
        L_0x0082:
            java.lang.String r4 = "video/dv_hevc"
            goto L_0x00db
        L_0x0085:
            java.lang.String r4 = "video/mv-hevc"
            boolean r4 = r15.equals(r4)     // Catch:{ Exception -> 0x01dc }
            if (r4 == 0) goto L_0x00a3
            java.lang.String r4 = "c2.qti.mvhevc.decoder"
            boolean r4 = r4.equals(r12)     // Catch:{ Exception -> 0x01dc }
            if (r4 != 0) goto L_0x00a0
            java.lang.String r4 = "c2.qti.mvhevc.decoder.secure"
            boolean r4 = r4.equals(r12)     // Catch:{ Exception -> 0x01dc }
            if (r4 == 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r4 = 0
            goto L_0x00db
        L_0x00a0:
            java.lang.String r4 = "video/x-mvhevc"
            goto L_0x00db
        L_0x00a3:
            java.lang.String r4 = "audio/alac"
            boolean r4 = r15.equals(r4)     // Catch:{ Exception -> 0x01dc }
            if (r4 == 0) goto L_0x00b6
            java.lang.String r4 = "OMX.lge.alac.decoder"
            boolean r4 = r4.equals(r12)     // Catch:{ Exception -> 0x01dc }
            if (r4 == 0) goto L_0x00b6
            java.lang.String r4 = "audio/x-lg-alac"
            goto L_0x00db
        L_0x00b6:
            java.lang.String r4 = "audio/flac"
            boolean r4 = r15.equals(r4)     // Catch:{ Exception -> 0x01dc }
            if (r4 == 0) goto L_0x00c9
            java.lang.String r4 = "OMX.lge.flac.decoder"
            boolean r4 = r4.equals(r12)     // Catch:{ Exception -> 0x01dc }
            if (r4 == 0) goto L_0x00c9
            java.lang.String r4 = "audio/x-lg-flac"
            goto L_0x00db
        L_0x00c9:
            java.lang.String r4 = "audio/ac3"
            boolean r4 = r15.equals(r4)     // Catch:{ Exception -> 0x01dc }
            if (r4 == 0) goto L_0x009e
            java.lang.String r4 = "OMX.lge.ac3.decoder"
            boolean r4 = r4.equals(r12)     // Catch:{ Exception -> 0x01dc }
            if (r4 == 0) goto L_0x009e
            java.lang.String r4 = "audio/lg-ac3"
        L_0x00db:
            if (r4 == 0) goto L_0x002d
            android.media.MediaCodecInfo$CodecCapabilities r9 = r6.getCapabilitiesForType(r4)     // Catch:{ Exception -> 0x01aa }
            boolean r10 = r1.zzd(r3, r4, r9)     // Catch:{ Exception -> 0x01aa }
            boolean r11 = r1.zzc(r3, r4, r9)     // Catch:{ Exception -> 0x01aa }
            boolean r8 = r0.zzc     // Catch:{ Exception -> 0x01aa }
            if (r8 != 0) goto L_0x00f0
            if (r11 != 0) goto L_0x002d
            goto L_0x00f4
        L_0x00f0:
            if (r10 != 0) goto L_0x00f4
            goto L_0x002d
        L_0x00f4:
            boolean r8 = r1.zzd(r2, r4, r9)     // Catch:{ Exception -> 0x01aa }
            boolean r10 = r1.zzc(r2, r4, r9)     // Catch:{ Exception -> 0x01aa }
            boolean r11 = r0.zzb     // Catch:{ Exception -> 0x01aa }
            if (r11 != 0) goto L_0x0102
            if (r10 != 0) goto L_0x002d
        L_0x0102:
            if (r11 == 0) goto L_0x0107
            if (r8 == 0) goto L_0x002d
            r8 = 1
        L_0x0107:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01aa }
            r0 = 29
            if (r10 < r0) goto L_0x0113
            boolean r0 = r6.isHardwareAccelerated()     // Catch:{ Exception -> 0x01aa }
            r10 = r0
            goto L_0x011d
        L_0x0113:
            boolean r0 = zzi(r6, r15)     // Catch:{ Exception -> 0x01aa }
            if (r0 != 0) goto L_0x011b
            r10 = 1
            goto L_0x011d
        L_0x011b:
            r10 = r17
        L_0x011d:
            boolean r0 = zzi(r6, r15)     // Catch:{ Exception -> 0x01aa }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01aa }
            r20 = r2
            r2 = 29
            if (r1 < r2) goto L_0x012e
            boolean r1 = r6.isVendor()     // Catch:{ Exception -> 0x01aa }
            goto L_0x0152
        L_0x012e:
            java.lang.String r1 = r6.getName()     // Catch:{ Exception -> 0x01aa }
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfuv.zza(r1)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r2 = "omx.google."
            boolean r2 = r1.startsWith(r2)     // Catch:{ Exception -> 0x01aa }
            if (r2 != 0) goto L_0x0150
            java.lang.String r2 = "c2.android."
            boolean r2 = r1.startsWith(r2)     // Catch:{ Exception -> 0x01aa }
            if (r2 != 0) goto L_0x0150
            java.lang.String r2 = "c2.google."
            boolean r1 = r1.startsWith(r2)     // Catch:{ Exception -> 0x01aa }
            if (r1 != 0) goto L_0x0150
            r1 = 1
            goto L_0x0152
        L_0x0150:
            r1 = r17
        L_0x0152:
            if (r16 == 0) goto L_0x0159
            if (r11 == r8) goto L_0x015f
            r19 = 1
            goto L_0x015b
        L_0x0159:
            r19 = r8
        L_0x015b:
            if (r16 != 0) goto L_0x017b
            if (r11 != 0) goto L_0x017b
        L_0x015f:
            r2 = 0
            r18 = 0
            r6 = r12
            r7 = r15
            r8 = r4
            r11 = r0
            r21 = r12
            r12 = r1
            r22 = r13
            r13 = r2
            r2 = r14
            r14 = r18
            com.google.android.gms.internal.ads.zzti r0 = com.google.android.gms.internal.ads.zzti.zzd(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0177 }
            r5.add(r0)     // Catch:{ Exception -> 0x0177 }
            goto L_0x01d0
        L_0x0177:
            r0 = move-exception
            r1 = r21
            goto L_0x01ac
        L_0x017b:
            r21 = r12
            r22 = r13
            r2 = r14
            if (r16 != 0) goto L_0x01d0
            if (r19 == 0) goto L_0x01d0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a5 }
            r2.<init>()     // Catch:{ Exception -> 0x01a5 }
            r3 = r21
            r2.append(r3)     // Catch:{ Exception -> 0x01a3 }
            r2.append(r7)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x01a3 }
            r13 = 0
            r14 = 1
            r7 = r15
            r8 = r4
            r11 = r0
            r12 = r1
            com.google.android.gms.internal.ads.zzti r0 = com.google.android.gms.internal.ads.zzti.zzd(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x01a3 }
            r5.add(r0)     // Catch:{ Exception -> 0x01a3 }
            goto L_0x01db
        L_0x01a3:
            r0 = move-exception
            goto L_0x01a8
        L_0x01a5:
            r0 = move-exception
            r3 = r21
        L_0x01a8:
            r1 = r3
            goto L_0x01ac
        L_0x01aa:
            r0 = move-exception
            r1 = r12
        L_0x01ac:
            java.lang.String r2 = "MediaCodecUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01dc }
            r3.<init>()     // Catch:{ Exception -> 0x01dc }
            java.lang.String r5 = "Failed to query codec "
            r3.append(r5)     // Catch:{ Exception -> 0x01dc }
            r3.append(r1)     // Catch:{ Exception -> 0x01dc }
            java.lang.String r1 = " ("
            r3.append(r1)     // Catch:{ Exception -> 0x01dc }
            r3.append(r4)     // Catch:{ Exception -> 0x01dc }
            java.lang.String r1 = ")"
            r3.append(r1)     // Catch:{ Exception -> 0x01dc }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.internal.ads.zzea.zzc(r2, r1)     // Catch:{ Exception -> 0x01dc }
            throw r0     // Catch:{ Exception -> 0x01dc }
        L_0x01d0:
            int r13 = r22 + 1
            r0 = r23
            r1 = r24
            r14 = r2
            r2 = r20
            goto L_0x001b
        L_0x01db:
            return r5
        L_0x01dc:
            r0 = move-exception
            com.google.android.gms.internal.ads.zztw r1 = new com.google.android.gms.internal.ads.zztw
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuc.zzg(com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zztx):java.util.ArrayList");
    }

    private static void zzh(List list, zzua zzua) {
        Collections.sort(list, new zzts(zzua));
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzay.zzh(str)) {
            return true;
        }
        String zza2 = zzfuv.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        if (zza2.startsWith("omx.")) {
            return false;
        }
        if (!zza2.startsWith("c2.")) {
            return true;
        }
        return false;
    }
}
