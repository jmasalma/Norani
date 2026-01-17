package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzdrr;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzb {
    private final Context zza;
    private final zzd zzb;
    private final long zzc;
    private final ScheduledExecutorService zzd;
    private final PackageInfo zze;

    zzb(Context context, long j, PackageInfo packageInfo, zzd zzd2, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzc = j;
        this.zze = packageInfo;
        this.zzb = zzd2;
        this.zzd = scheduledExecutorService;
    }

    public static String zzb(String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i % 555));
        }
        return new String(charArray);
    }

    public static /* synthetic */ void zzc(zzb zzb2, String str, zzau zzau, zzbze zzbze) {
        if (!zzb2.zzb.zzj(str) && !zzb2.zze()) {
            zzau.zzf(ObjectWrapper.wrap(zzb2.zza), zzbze, (zzbyx) null);
        }
    }

    private final boolean zze() {
        return this.zzb.zzf().size() >= ((Integer) zzbd.zzc().zzb(zzbde.zzhS)).intValue();
    }

    private static final void zzf(Bundle bundle, zzdrr zzdrr) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhT)).booleanValue()) {
            bundle.putLong(zzdrr.zza(), zzv.zzD().currentTimeMillis());
        }
    }

    private static final void zzg(Bundle bundle, int i) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0106, code lost:
        if (r12.zza() > r10) goto L_0x0118;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzbk zza(com.google.android.gms.internal.ads.zzbze r18, com.google.android.gms.ads.nonagon.signalgeneration.zzau r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r20
            java.lang.String r3 = "DiskCachingManager.getSignalResponse"
            com.google.android.gms.internal.ads.zzdrr r4 = com.google.android.gms.internal.ads.zzdrr.zzK
            zzf(r2, r4)
            com.google.android.gms.internal.ads.zzbzs r4 = com.google.android.gms.ads.internal.zzv.zzp()
            com.google.android.gms.ads.internal.util.zzg r4 = r4.zzi()
            boolean r4 = r4.zzN()
            r5 = 0
            if (r4 == 0) goto L_0x0026
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r0 = r1.zzb
            r0.zzg()
            r0 = 7
            zzg(r2, r0)
            goto L_0x0034
        L_0x0026:
            android.content.pm.PackageInfo r4 = r1.zze
            r6 = 10
            if (r4 != 0) goto L_0x0035
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r0 = r1.zzb
            r0.zzg()
            zzg(r2, r6)
        L_0x0034:
            return r5
        L_0x0035:
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r7 = r1.zzb
            android.content.Context r8 = r1.zza
            java.lang.String r9 = r7.zze()
            int r10 = r7.zzb()
            java.lang.String r11 = r7.zzd()
            int r12 = r7.zza()
            android.content.pm.ApplicationInfo r13 = r8.getApplicationInfo()
            java.lang.String r13 = r13.packageName
            boolean r9 = android.text.TextUtils.equals(r13, r9)
            if (r9 == 0) goto L_0x0125
            int r9 = r4.versionCode
            if (r10 != r9) goto L_0x0125
            java.lang.String r9 = android.os.Build.MODEL
            boolean r9 = android.text.TextUtils.equals(r9, r11)
            if (r9 == 0) goto L_0x0125
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r12 == r9) goto L_0x0067
            goto L_0x0125
        L_0x0067:
            java.util.Map r4 = r7.zzf()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0073:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0137
            java.lang.Object r9 = r4.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x0121 }
            java.lang.Object r11 = r9.getValue()     // Catch:{ IOException | JSONException -> 0x0121 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException | JSONException -> 0x0121 }
            r10.<init>(r11)     // Catch:{ IOException | JSONException -> 0x0121 }
            java.lang.String r11 = "ts_ms"
            long r10 = r10.getLong(r11)     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.common.util.Clock r12 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ IOException | JSONException -> 0x0121 }
            long r12 = r12.currentTimeMillis()     // Catch:{ IOException | JSONException -> 0x0121 }
            long r12 = r12 - r10
            com.google.android.gms.internal.ads.zzbcv r14 = com.google.android.gms.internal.ads.zzbde.zzhR     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.internal.ads.zzbdc r15 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ IOException | JSONException -> 0x0121 }
            java.lang.Object r14 = r15.zzb(r14)     // Catch:{ IOException | JSONException -> 0x0121 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ IOException | JSONException -> 0x0121 }
            long r14 = r14.longValue()     // Catch:{ IOException | JSONException -> 0x0121 }
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x00ae
            goto L_0x0118
        L_0x00ae:
            com.google.android.gms.internal.ads.zzfse r12 = com.google.android.gms.internal.ads.zzfse.zzj(r8)     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.internal.ads.zzbcv r13 = com.google.android.gms.internal.ads.zzbde.zzdz     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.internal.ads.zzbdc r14 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ IOException | JSONException -> 0x0121 }
            java.lang.Object r13 = r14.zzb(r13)     // Catch:{ IOException | JSONException -> 0x0121 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ IOException | JSONException -> 0x0121 }
            long r13 = r13.longValue()     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.internal.ads.zzbzs r15 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.ads.internal.util.zzg r15 = r15.zzi()     // Catch:{ IOException | JSONException -> 0x0121 }
            boolean r15 = r15.zzN()     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.internal.ads.zzfsa r12 = r12.zzh(r13, r15)     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.internal.ads.zzfsf r13 = com.google.android.gms.internal.ads.zzfsf.zzi(r8)     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.internal.ads.zzbcv r14 = com.google.android.gms.internal.ads.zzbde.zzdA     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.internal.ads.zzbdc r15 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ IOException | JSONException -> 0x0121 }
            java.lang.Object r14 = r15.zzb(r14)     // Catch:{ IOException | JSONException -> 0x0121 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ IOException | JSONException -> 0x0121 }
            long r14 = r14.longValue()     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.internal.ads.zzbzs r16 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.ads.internal.util.zzg r16 = r16.zzi()     // Catch:{ IOException | JSONException -> 0x0121 }
            boolean r6 = r16.zzN()     // Catch:{ IOException | JSONException -> 0x0121 }
            com.google.android.gms.internal.ads.zzfsa r6 = r13.zzh(r14, r6)     // Catch:{ IOException | JSONException -> 0x0121 }
            long r13 = r12.zza()     // Catch:{ IOException | JSONException -> 0x0121 }
            r15 = -1
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x0108
            long r12 = r12.zza()     // Catch:{ IOException | JSONException -> 0x0121 }
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x0118
        L_0x0108:
            long r12 = r6.zza()     // Catch:{ IOException | JSONException -> 0x0121 }
            int r12 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r12 == 0) goto L_0x0121
            long r12 = r6.zza()     // Catch:{ IOException | JSONException -> 0x0121 }
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x0121
        L_0x0118:
            java.lang.Object r6 = r9.getKey()     // Catch:{ IOException | JSONException -> 0x0121 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException | JSONException -> 0x0121 }
            r7.zzc(r6)     // Catch:{ IOException | JSONException -> 0x0121 }
        L_0x0121:
            r6 = 10
            goto L_0x0073
        L_0x0125:
            r7.zzg()
            android.content.pm.ApplicationInfo r6 = r8.getApplicationInfo()
            java.lang.String r6 = r6.packageName
            int r4 = r4.versionCode
            java.lang.String r8 = android.os.Build.MODEL
            int r9 = android.os.Build.VERSION.SDK_INT
            r7.zzi(r6, r4, r8, r9)
        L_0x0137:
            com.google.android.gms.internal.ads.zzdrr r4 = com.google.android.gms.internal.ads.zzdrr.zzL
            zzf(r2, r4)
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzv.zzD()
            long r6 = r4.currentTimeMillis()
            long r8 = r1.zzc
            long r6 = r6 - r8
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzhO
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r8.zzb(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r8 = r4.longValue()
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0160
            r0 = 2
            zzg(r2, r0)
            return r5
        L_0x0160:
            com.google.android.gms.internal.ads.zzdrr r4 = com.google.android.gms.internal.ads.zzdrr.zzM
            zzf(r2, r4)
            java.lang.String r7 = r0.zza
            java.lang.String r8 = r0.zzb
            com.google.android.gms.ads.internal.client.zzm r10 = r0.zzd
            android.os.Bundle r4 = r10.zzn
            java.lang.String r4 = r4.toString()
            android.os.Bundle r6 = r10.zzc
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = r10.zzi
            java.lang.String r11 = r10.zzp
            java.util.List r12 = r10.zzo
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            r13.append(r8)
            r13.append(r4)
            r13.append(r6)
            r13.append(r9)
            r13.append(r11)
            r13.append(r12)
            java.lang.String r4 = r13.toString()
            java.lang.String r4 = com.google.android.gms.ads.internal.util.client.zzf.zzl(r4)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x01ae
            r0 = 3
            zzg(r2, r0)
            return r5
        L_0x01ae:
            com.google.android.gms.internal.ads.zzdrr r6 = com.google.android.gms.internal.ads.zzdrr.zzN
            zzf(r2, r6)
            com.google.android.gms.internal.ads.zzdrr r6 = com.google.android.gms.internal.ads.zzdrr.zzO
            zzf(r2, r6)
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r6 = r1.zzb
            java.lang.String r13 = r6.zzc(r4)
            com.google.android.gms.internal.ads.zzdrr r6 = com.google.android.gms.internal.ads.zzdrr.zzP
            zzf(r2, r6)
            boolean r6 = r17.zze()
            if (r6 != 0) goto L_0x01f1
            com.google.android.gms.ads.internal.client.zzr r9 = r0.zzc
            com.google.android.gms.internal.ads.zzbze r0 = new com.google.android.gms.internal.ads.zzbze
            r11 = 2
            r6 = r0
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.util.concurrent.ScheduledExecutorService r6 = r1.zzd
            com.google.android.gms.ads.nonagon.signalgeneration.zza r7 = new com.google.android.gms.ads.nonagon.signalgeneration.zza
            r8 = r19
            r7.<init>(r1, r4, r8, r0)
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzhQ
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r4.zzb(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r8 = r0.longValue()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6.schedule(r7, r8, r0)
        L_0x01f1:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x01fc
            r0 = 4
            zzg(r2, r0)
            return r5
        L_0x01fc:
            com.google.android.gms.internal.ads.zzdrr r0 = com.google.android.gms.internal.ads.zzdrr.zzQ
            zzf(r2, r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0267 }
            r0.<init>(r13)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r4 = "sr"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x0267 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x0267 }
            if (r6 == 0) goto L_0x0218
            r0 = 8
            zzg(r2, r0)     // Catch:{ JSONException -> 0x0267 }
            return r5
        L_0x0218:
            java.lang.String r6 = "rs"
            java.lang.String r0 = r0.getString(r6)     // Catch:{ JSONException -> 0x0267 }
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0267 }
            if (r6 == 0) goto L_0x022a
            r0 = 9
            zzg(r2, r0)     // Catch:{ JSONException -> 0x0267 }
            return r5
        L_0x022a:
            java.lang.String r6 = new java.lang.String     // Catch:{ JSONException -> 0x0267 }
            r7 = 10
            byte[] r0 = android.util.Base64.decode(r0, r7)     // Catch:{ JSONException -> 0x0267 }
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ JSONException -> 0x0267 }
            r6.<init>(r0, r7)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r0 = zzb(r6)     // Catch:{ JSONException -> 0x0267 }
            com.google.android.gms.internal.ads.zzdrr r6 = com.google.android.gms.internal.ads.zzdrr.zzR     // Catch:{ JSONException -> 0x0267 }
            zzf(r2, r6)     // Catch:{ JSONException -> 0x0267 }
            com.google.android.gms.ads.nonagon.signalgeneration.zzbk r6 = new com.google.android.gms.ads.nonagon.signalgeneration.zzbk     // Catch:{ IOException -> 0x025a }
            android.util.JsonReader r7 = new android.util.JsonReader     // Catch:{ IOException -> 0x025a }
            java.io.StringReader r8 = new java.io.StringReader     // Catch:{ IOException -> 0x025a }
            r8.<init>(r4)     // Catch:{ IOException -> 0x025a }
            r7.<init>(r8)     // Catch:{ IOException -> 0x025a }
            r6.<init>(r7, r5)     // Catch:{ IOException -> 0x025a }
            r6.zzc = r0     // Catch:{ IOException -> 0x025a }
            r6.zze = r2     // Catch:{ IOException -> 0x025a }
            java.lang.String r0 = "sod_h"
            r4 = 1
            r2.putBoolean(r0, r4)     // Catch:{ IOException -> 0x025a }
            return r6
        L_0x025a:
            r0 = move-exception
            r4 = 6
            zzg(r2, r4)
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r3)
            return r5
        L_0x0267:
            r0 = move-exception
            r4 = 5
            zzg(r2, r4)
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzb.zza(com.google.android.gms.internal.ads.zzbze, com.google.android.gms.ads.nonagon.signalgeneration.zzau, android.os.Bundle):com.google.android.gms.ads.nonagon.signalgeneration.zzbk");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(java.lang.String r6, com.google.android.gms.ads.nonagon.signalgeneration.zzbk r7) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0079
            boolean r0 = r5.zze()
            if (r0 == 0) goto L_0x000d
            goto L_0x0079
        L_0x000d:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0060 }
            r1.<init>()     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r2 = "params"
            java.lang.String r3 = r7.zza     // Catch:{ JSONException -> 0x0060 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r2 = "signal_dictionary"
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ JSONException -> 0x0060 }
            android.os.Bundle r4 = r7.zzf     // Catch:{ JSONException -> 0x0060 }
            org.json.JSONObject r3 = r3.zzn(r4)     // Catch:{ JSONException -> 0x0060 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r2 = "sr"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r7 = r7.zzc     // Catch:{ JSONException -> 0x0060 }
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0060 }
            if (r1 == 0) goto L_0x003d
            java.lang.String r7 = ""
            goto L_0x006e
        L_0x003d:
            java.lang.String r7 = zzb(r7)     // Catch:{ JSONException -> 0x0060 }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ JSONException -> 0x0060 }
            byte[] r7 = r7.getBytes(r1)     // Catch:{ JSONException -> 0x0060 }
            r1 = 10
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r1)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r1 = "rs"
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r7 = "ts_ms"
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ JSONException -> 0x0060 }
            long r1 = r1.currentTimeMillis()     // Catch:{ JSONException -> 0x0060 }
            r0.put(r7, r1)     // Catch:{ JSONException -> 0x0060 }
            goto L_0x006a
        L_0x0060:
            r7 = move-exception
            java.lang.String r1 = "DiskCachingManager.createStringToWrite"
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r7, r1)
        L_0x006a:
            java.lang.String r7 = r0.toString()
        L_0x006e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0079
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r0 = r5.zzb
            r0.zzh(r6, r7)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzb.zzd(java.lang.String, com.google.android.gms.ads.nonagon.signalgeneration.zzbk):void");
    }
}
