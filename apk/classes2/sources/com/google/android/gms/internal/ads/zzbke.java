package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbke {
    public static final zzbkf zzA = new zzbjs();
    public static final zzbkf zzB = new zzbju();
    public static final zzbkf zzC = new zzbjv();
    public static final zzbkf zza = new zzbjc();
    public static final zzbkf zzb = new zzbje();
    public static final zzbkf zzc = new zzbjh();
    public static final zzbkf zzd = new zzbjw();
    public static final zzbkf zze = new zzbjx();
    public static final zzbkf zzf = new zzbji();
    public static final zzbkf zzg = new zzbjy();
    public static final zzbkf zzh = new zzbjz();
    public static final zzbkf zzi = new zzbjf();
    public static final zzbkf zzj = new zzbka();
    public static final zzbkf zzk = new zzbkb();
    public static final zzbkf zzl = new zzcdb();
    public static final zzbkf zzm = new zzcdc();
    public static final zzbkf zzn = new zzbiy();
    public static final zzbkv zzo = new zzbkv();
    public static final zzbkf zzp = new zzbkc();
    public static final zzbkf zzq = new zzbkd();
    public static final zzbkf zzr = new zzbjj();
    public static final zzbkf zzs = new zzbjk();
    public static final zzbkf zzt = new zzbjl();
    public static final zzbkf zzu = new zzbjm();
    public static final zzbkf zzv = new zzbjn();
    public static final zzbkf zzw = new zzbjo();
    public static final zzbkf zzx = new zzbjp();
    public static final zzbkf zzy = new zzbjq();
    public static final zzbkf zzz = new zzbjr();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcfg r5, java.lang.String r6) {
        /*
            android.net.Uri r0 = android.net.Uri.parse(r6)
            com.google.android.gms.internal.ads.zzavu r1 = r5.zzI()     // Catch:{ zzavv -> 0x0052 }
            com.google.android.gms.internal.ads.zzfda r2 = r5.zzS()     // Catch:{ zzavv -> 0x0052 }
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzmu     // Catch:{ zzavv -> 0x0052 }
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ zzavv -> 0x0052 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ zzavv -> 0x0052 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ zzavv -> 0x0052 }
            boolean r3 = r3.booleanValue()     // Catch:{ zzavv -> 0x0052 }
            if (r3 == 0) goto L_0x0039
            if (r2 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x005d
            boolean r1 = r1.zzf(r0)     // Catch:{ zzavv -> 0x0052 }
            if (r1 == 0) goto L_0x005d
            android.content.Context r1 = r5.getContext()     // Catch:{ zzavv -> 0x0052 }
            android.view.View r3 = r5.zzF()     // Catch:{ zzavv -> 0x0052 }
            android.app.Activity r4 = r5.zzi()     // Catch:{ zzavv -> 0x0052 }
            android.net.Uri r0 = r2.zza(r0, r1, r3, r4)     // Catch:{ zzavv -> 0x0052 }
            goto L_0x005d
        L_0x0039:
            if (r1 == 0) goto L_0x005d
            boolean r2 = r1.zzf(r0)     // Catch:{ zzavv -> 0x0052 }
            if (r2 == 0) goto L_0x005d
            android.content.Context r2 = r5.getContext()     // Catch:{ zzavv -> 0x0052 }
            android.view.View r3 = r5.zzF()     // Catch:{ zzavv -> 0x0052 }
            android.app.Activity r4 = r5.zzi()     // Catch:{ zzavv -> 0x0052 }
            android.net.Uri r0 = r1.zza(r0, r2, r3, r4)     // Catch:{ zzavv -> 0x0052 }
            goto L_0x005d
        L_0x0052:
            java.lang.String r1 = "Unable to append parameter to URL: "
            java.lang.String r6 = r1.concat(r6)
            int r1 = com.google.android.gms.ads.internal.util.zze.zza
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r6)
        L_0x005d:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.google.android.gms.internal.ads.zzfca r1 = r5.zzD()
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.internal.ads.zzfca r6 = r5.zzD()
            java.util.Map r6 = r6.zzaw
        L_0x006e:
            android.content.Context r1 = r5.getContext()
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbyq.zzb(r0, r1, r6)
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfd.zze
            java.lang.Object r0 = r0.zze()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x00bf
            r2 = 252530000(0xf0d4d50, double:1.247663975E-315)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00bf
            com.google.common.util.concurrent.ListenableFuture r5 = r5.zzT()
            com.google.android.gms.internal.ads.zzgde r5 = com.google.android.gms.internal.ads.zzgde.zzw(r5)
            com.google.android.gms.internal.ads.zzbiz r0 = new com.google.android.gms.internal.ads.zzbiz
            r0.<init>()
            com.google.android.gms.internal.ads.zzgdy r1 = com.google.android.gms.internal.ads.zzcaf.zzg
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgdn.zze(r5, r2, r0, r1)
            com.google.android.gms.internal.ads.zzgde r5 = (com.google.android.gms.internal.ads.zzgde) r5
            com.google.android.gms.internal.ads.zzbja r0 = new com.google.android.gms.internal.ads.zzbja
            r0.<init>(r6)
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgdn.zzm(r5, r0, r1)
            com.google.android.gms.internal.ads.zzgde r5 = (com.google.android.gms.internal.ads.zzgde) r5
            com.google.android.gms.internal.ads.zzbjb r0 = new com.google.android.gms.internal.ads.zzbjb
            r0.<init>(r6)
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgdn.zze(r5, r6, r0, r1)
            com.google.android.gms.internal.ads.zzgde r5 = (com.google.android.gms.internal.ads.zzgde) r5
            return r5
        L_0x00bf:
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgdn.zzh(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbke.zza(com.google.android.gms.internal.ads.zzcfg, java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcgn r16, java.util.Map r17) {
        /*
            java.lang.String r1 = "openableIntents"
            android.content.Context r0 = r16.getContext()
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            java.lang.String r0 = "data"
            r3 = r17
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x010d }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x010d }
            java.lang.String r0 = "intents"
            org.json.JSONArray r3 = r3.getJSONArray(r0)     // Catch:{ JSONException -> 0x0100 }
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r5 = 0
            r6 = r5
        L_0x0026:
            int r0 = r3.length()
            if (r6 >= r0) goto L_0x00f8
            org.json.JSONObject r0 = r3.getJSONObject(r6)     // Catch:{ JSONException -> 0x00eb }
            java.lang.String r7 = "id"
            java.lang.String r7 = r0.optString(r7)
            java.lang.String r8 = "u"
            java.lang.String r8 = r0.optString(r8)
            java.lang.String r9 = "i"
            java.lang.String r9 = r0.optString(r9)
            java.lang.String r10 = "m"
            java.lang.String r10 = r0.optString(r10)
            java.lang.String r11 = "p"
            java.lang.String r11 = r0.optString(r11)
            java.lang.String r12 = "c"
            java.lang.String r12 = r0.optString(r12)
            java.lang.String r13 = "intent_url"
            java.lang.String r13 = r0.optString(r13)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r14 = 0
            if (r0 != 0) goto L_0x0077
            android.content.Intent r0 = android.content.Intent.parseUri(r13, r5)     // Catch:{ URISyntaxException -> 0x0066 }
            goto L_0x0078
        L_0x0066:
            r0 = move-exception
            r15 = r0
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r13 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r13 = "Error parsing the url: "
            java.lang.String r0 = r13.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r15)
        L_0x0077:
            r0 = r14
        L_0x0078:
            r13 = 1
            if (r0 != 0) goto L_0x00c4
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            boolean r15 = android.text.TextUtils.isEmpty(r8)
            if (r15 != 0) goto L_0x008d
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r0.setData(r8)
        L_0x008d:
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            if (r8 != 0) goto L_0x0096
            r0.setAction(r9)
        L_0x0096:
            boolean r8 = android.text.TextUtils.isEmpty(r10)
            if (r8 != 0) goto L_0x009f
            r0.setType(r10)
        L_0x009f:
            boolean r8 = android.text.TextUtils.isEmpty(r11)
            if (r8 != 0) goto L_0x00a8
            r0.setPackage(r11)
        L_0x00a8:
            boolean r8 = android.text.TextUtils.isEmpty(r12)
            if (r8 != 0) goto L_0x00c4
            java.lang.String r8 = "/"
            r9 = 2
            java.lang.String[] r8 = r12.split(r8, r9)
            int r10 = r8.length
            if (r10 != r9) goto L_0x00c4
            android.content.ComponentName r9 = new android.content.ComponentName
            r10 = r8[r5]
            r8 = r8[r13]
            r9.<init>(r10, r8)
            r0.setComponent(r9)
        L_0x00c4:
            r8 = r0
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r14 = r2.resolveActivity(r8, r0)     // Catch:{ NullPointerException -> 0x00cc }
            goto L_0x00d9
        L_0x00cc:
            r0 = move-exception
            r9 = r0
            com.google.android.gms.internal.ads.zzbzs r0 = com.google.android.gms.ads.internal.zzv.zzp()
            java.lang.String r8 = r8.toString()
            r0.zzw(r9, r8)
        L_0x00d9:
            if (r14 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r13 = r5
        L_0x00dd:
            r4.put(r7, r13)     // Catch:{ JSONException -> 0x00e1 }
            goto L_0x00f4
        L_0x00e1:
            r0 = move-exception
            r7 = r0
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "Error constructing openable urls response."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r7)
            goto L_0x00f4
        L_0x00eb:
            r0 = move-exception
            r7 = r0
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "Error parsing the intent data."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r7)
        L_0x00f4:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x00f8:
            r0 = r16
            com.google.android.gms.internal.ads.zzbna r0 = (com.google.android.gms.internal.ads.zzbna) r0
            r0.zze(r1, r4)
            return
        L_0x0100:
            r0 = r16
            com.google.android.gms.internal.ads.zzbna r0 = (com.google.android.gms.internal.ads.zzbna) r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0.zze(r1, r2)
            return
        L_0x010d:
            r0 = r16
            com.google.android.gms.internal.ads.zzbna r0 = (com.google.android.gms.internal.ads.zzbna) r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0.zze(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbke.zzb(com.google.android.gms.internal.ads.zzcgn, java.util.Map):void");
    }

    public static void zzc(Map map, zzded zzded) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlh)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzded != null) {
            zzded.zzdf();
        }
    }
}
