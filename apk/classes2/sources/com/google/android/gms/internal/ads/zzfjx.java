package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfjx implements zzgdj {
    final /* synthetic */ zzfhj zza;
    final /* synthetic */ zzfhu zzb;
    final /* synthetic */ zzcyi zzc;
    final /* synthetic */ zzfjy zzd;

    zzfjx(zzfjy zzfjy, zzfhj zzfhj, zzfhu zzfhu, zzcyi zzcyi) {
        this.zza = zzfhj;
        this.zzb = zzfhu;
        this.zzc = zzcyi;
        Objects.requireNonNull(zzfjy);
        this.zzd = zzfjy;
    }

    public final void zza(Throwable th) {
        zzfhj zzfhj = this.zza;
        if (zzfhj != null) {
            zzfhj.zzg(false);
            zzfhu zzfhu = this.zzb;
            if (zzfhu == null) {
                this.zzd.zzf.zzc(zzfhj.zzm());
                return;
            }
            zzfhu.zza(zzfhj);
            zzfhu.zzh();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7 A[Catch:{ JSONException -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r14) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.zzfhj r0 = r13.zza
            com.google.android.gms.ads.internal.util.client.zzt r14 = (com.google.android.gms.ads.internal.util.client.zzt) r14
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002a
            com.google.android.gms.ads.internal.util.client.zzt r3 = com.google.android.gms.ads.internal.util.client.zzt.zza
            if (r14 != r3) goto L_0x000e
            r14 = r2
            goto L_0x000f
        L_0x000e:
            r14 = r1
        L_0x000f:
            r0.zzg(r14)
            com.google.android.gms.internal.ads.zzfhu r14 = r13.zzb
            if (r14 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzfjy r14 = r13.zzd
            com.google.android.gms.internal.ads.zzfhx r14 = r14.zzf
            com.google.android.gms.internal.ads.zzfhn r0 = r0.zzm()
            r14.zzc(r0)
            goto L_0x002a
        L_0x0024:
            r14.zza(r0)
            r14.zzh()
        L_0x002a:
            com.google.android.gms.internal.ads.zzcyi r14 = r13.zzc
            if (r14 == 0) goto L_0x00fc
            com.google.android.gms.internal.ads.zzfjy r0 = r13.zzd
            com.google.android.gms.ads.internal.util.client.zzu r0 = r0.zzd
            java.lang.String r0 = r0.zzb()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0040
            goto L_0x00fc
        L_0x0040:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00f2 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x00f2 }
            android.os.Parcelable$Creator r0 = com.google.android.gms.ads.internal.client.zzt.CREATOR     // Catch:{ JSONException -> 0x00f2 }
            java.lang.String r0 = "type"
            java.lang.String r0 = r3.optString(r0)     // Catch:{ JSONException -> 0x00f2 }
            java.lang.String r4 = "precision"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00f2 }
            java.lang.String r5 = "currency"
            java.lang.String r9 = r3.optString(r5)     // Catch:{ JSONException -> 0x00f2 }
            java.lang.String r5 = "value"
            r6 = 0
            long r5 = r3.optLong(r5, r6)     // Catch:{ JSONException -> 0x00f2 }
            int r3 = r0.hashCode()     // Catch:{ JSONException -> 0x00f2 }
            r7 = 66934(0x10576, float:9.3795E-41)
            r8 = -1
            r10 = 2
            if (r3 == r7) goto L_0x008b
            r7 = 66944(0x10580, float:9.3809E-41)
            if (r3 == r7) goto L_0x0081
            r7 = 1349395245(0x506e232d, float:1.59811308E10)
            if (r3 == r7) goto L_0x0077
            goto L_0x0095
        L_0x0077:
            java.lang.String r3 = "ONE_PIXEL"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0095
            r0 = r10
            goto L_0x0096
        L_0x0081:
            java.lang.String r3 = "CPM"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0095
            r0 = r1
            goto L_0x0096
        L_0x008b:
            java.lang.String r3 = "CPC"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0095
            r0 = r2
            goto L_0x0096
        L_0x0095:
            r0 = r8
        L_0x0096:
            r3 = 3
            if (r0 == 0) goto L_0x00a7
            if (r0 == r2) goto L_0x00a4
            if (r0 == r10) goto L_0x009f
            r7 = r1
            goto L_0x00a8
        L_0x009f:
            r11 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r11
            r7 = r3
            goto L_0x00a8
        L_0x00a4:
            r11 = r5
            r7 = r10
            goto L_0x00a9
        L_0x00a7:
            r7 = r2
        L_0x00a8:
            r11 = r5
        L_0x00a9:
            int r0 = r4.hashCode()     // Catch:{ JSONException -> 0x00f2 }
            r5 = -2131980260(0xffffffff80ec901c, float:-2.1724874E-38)
            if (r0 == r5) goto L_0x00d1
            r5 = 399232571(0x17cbce3b, float:1.3170627E-24)
            if (r0 == r5) goto L_0x00c7
            r5 = 1271254246(0x4bc5cce6, float:2.5926092E7)
            if (r0 == r5) goto L_0x00bd
            goto L_0x00da
        L_0x00bd:
            java.lang.String r0 = "PUBLISHER_PROVIDED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00da
            r8 = r2
            goto L_0x00da
        L_0x00c7:
            java.lang.String r0 = "PRECISE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00da
            r8 = r10
            goto L_0x00da
        L_0x00d1:
            java.lang.String r0 = "ESTIMATED"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00da
            r8 = r1
        L_0x00da:
            if (r8 == 0) goto L_0x00e6
            if (r8 == r2) goto L_0x00e4
            if (r8 == r10) goto L_0x00e2
            r8 = r1
            goto L_0x00e7
        L_0x00e2:
            r8 = r3
            goto L_0x00e7
        L_0x00e4:
            r8 = r10
            goto L_0x00e7
        L_0x00e6:
            r8 = r2
        L_0x00e7:
            com.google.android.gms.ads.internal.client.zzt r0 = new com.google.android.gms.ads.internal.client.zzt     // Catch:{ JSONException -> 0x00f2 }
            r6 = r0
            r10 = r11
            r6.<init>(r7, r8, r9, r10)     // Catch:{ JSONException -> 0x00f2 }
            r14.zza(r0)     // Catch:{ JSONException -> 0x00f2 }
            return
        L_0x00f2:
            r14 = move-exception
            java.lang.String r0 = "UrlPinger.pingUrl"
            com.google.android.gms.internal.ads.zzbzs r1 = com.google.android.gms.ads.internal.zzv.zzp()
            r1.zzw(r14, r0)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjx.zzb(java.lang.Object):void");
    }
}
