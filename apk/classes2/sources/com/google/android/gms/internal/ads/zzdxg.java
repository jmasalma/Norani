package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdxg implements zzhgr {
    private final zzhha zza;

    private zzdxg(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzdxg zza(zzhha zzhha) {
        return new zzdxg(zzhha);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzhha r0 = r4.zza
            com.google.android.gms.internal.ads.zzcvp r0 = (com.google.android.gms.internal.ads.zzcvp) r0
            com.google.android.gms.internal.ads.zzfcw r0 = r0.zzc()
            r1 = r0
            com.google.android.gms.internal.ads.zzfcw r1 = (com.google.android.gms.internal.ads.zzfcw) r1
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzhy
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0050
            com.google.android.gms.ads.internal.client.zzm r1 = r0.zzd
            java.lang.String r1 = r1.zzx
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "request_id"
            if (r2 != 0) goto L_0x0039
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0039 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x0039 }
            java.lang.String r1 = r2.getString(r3)     // Catch:{ JSONException -> 0x0039 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0039 }
            if (r2 != 0) goto L_0x0039
            goto L_0x0060
        L_0x0039:
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs
            if (r0 == 0) goto L_0x0050
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0050 }
            java.lang.String r0 = r0.zza     // Catch:{ JSONException -> 0x0050 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0050 }
            java.lang.String r1 = r1.getString(r3)     // Catch:{ JSONException -> 0x0050 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0050 }
            if (r0 == 0) goto L_0x0060
        L_0x0050:
            java.util.Random r0 = com.google.android.gms.ads.internal.client.zzbb.zze()
            int r0 = r0.nextInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L_0x0060:
            com.google.android.gms.internal.ads.zzhgz.zzb(r1)
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxg.zzb():java.lang.Object");
    }
}
