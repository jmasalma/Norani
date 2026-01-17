package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeun implements zzeuc {
    private final zzgdy zza;
    private final Context zzb;

    zzeun(zzgdy zzgdy, Context context) {
        this.zza = zzgdy;
        this.zzb = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0096 A[Catch:{ Exception -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x019f A[SYNTHETIC, Splitter:B:50:0x019f] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.google.android.gms.internal.ads.zzeul zzc(com.google.android.gms.internal.ads.zzeun r27) {
        /*
            r0 = r27
            java.lang.String r1 = "com.google.unity.ads.UNITY_VERSION"
            android.content.Context r2 = r0.zzb
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r5 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r5 = zzd(r3, r5)
            java.lang.String r6 = "http://www.google.com"
            android.content.pm.ResolveInfo r6 = zzd(r3, r6)
            java.lang.String r10 = r4.getCountry()
            com.google.android.gms.ads.internal.zzv.zzr()
            com.google.android.gms.ads.internal.client.zzbb.zzb()
            boolean r11 = com.google.android.gms.ads.internal.util.client.zzf.zzw()
            boolean r12 = com.google.android.gms.common.util.DeviceProperties.isLatchsky(r2)
            boolean r13 = com.google.android.gms.common.util.DeviceProperties.isSidewinder(r2)
            java.lang.String r14 = r4.getLanguage()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            android.os.LocaleList r4 = android.os.LocaleList.getDefault()
            r7 = 0
            r8 = r7
        L_0x003f:
            int r9 = r4.size()
            if (r8 >= r9) goto L_0x0053
            java.util.Locale r9 = r4.get(r8)
            java.lang.String r9 = r9.getLanguage()
            r15.add(r9)
            int r8 = r8 + 1
            goto L_0x003f
        L_0x0053:
            java.lang.String r4 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r4 = zzd(r3, r4)
            java.lang.String r8 = "."
            if (r4 != 0) goto L_0x005f
        L_0x005d:
            r2 = 0
            goto L_0x0086
        L_0x005f:
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            if (r4 != 0) goto L_0x0064
            goto L_0x005d
        L_0x0064:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch:{ NameNotFoundException -> 0x005d }
            java.lang.String r9 = r4.packageName     // Catch:{ NameNotFoundException -> 0x005d }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r9, r7)     // Catch:{ NameNotFoundException -> 0x005d }
            if (r2 == 0) goto L_0x005d
            int r2 = r2.versionCode     // Catch:{ NameNotFoundException -> 0x005d }
            java.lang.String r4 = r4.packageName     // Catch:{ NameNotFoundException -> 0x005d }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x005d }
            r9.<init>()     // Catch:{ NameNotFoundException -> 0x005d }
            r9.append(r2)     // Catch:{ NameNotFoundException -> 0x005d }
            r9.append(r8)     // Catch:{ NameNotFoundException -> 0x005d }
            r9.append(r4)     // Catch:{ NameNotFoundException -> 0x005d }
            java.lang.String r2 = r9.toString()     // Catch:{ NameNotFoundException -> 0x005d }
        L_0x0086:
            android.content.Context r4 = r0.zzb
            r9 = 128(0x80, float:1.794E-43)
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r4)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r7 = "com.android.vending"
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r7, r9)     // Catch:{ Exception -> 0x00ad }
            if (r4 == 0) goto L_0x00ad
            int r7 = r4.versionCode     // Catch:{ Exception -> 0x00ad }
            java.lang.String r4 = r4.packageName     // Catch:{ Exception -> 0x00ad }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ad }
            r9.<init>()     // Catch:{ Exception -> 0x00ad }
            r9.append(r7)     // Catch:{ Exception -> 0x00ad }
            r9.append(r8)     // Catch:{ Exception -> 0x00ad }
            r9.append(r4)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x00ad }
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            java.lang.String r19 = android.os.Build.FINGERPRINT
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.getLanguage()
            com.google.android.gms.internal.ads.zzbcv r8 = com.google.android.gms.internal.ads.zzbde.zznI
            com.google.android.gms.internal.ads.zzbdc r9 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r9.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0101
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 33
            if (r8 < r9) goto L_0x00ea
            android.content.Context r8 = r0.zzb
            java.lang.Class<android.app.LocaleManager> r9 = android.app.LocaleManager.class
            java.lang.Object r8 = r8.getSystemService(r9)
            android.app.LocaleManager r8 = (android.app.LocaleManager) r8
            if (r8 == 0) goto L_0x0101
            android.os.LocaleList r7 = r8.getSystemLocales()
            r8 = 0
            java.util.Locale r7 = r7.get(r8)
            java.lang.String r7 = r7.getLanguage()
            goto L_0x0101
        L_0x00ea:
            r8 = 0
            android.content.Context r7 = r0.zzb
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            android.os.LocaleList r7 = r7.getLocales()
            java.util.Locale r7 = r7.get(r8)
            java.lang.String r7 = r7.getLanguage()
        L_0x0101:
            r26 = r7
            android.content.Context r0 = r0.zzb
            if (r3 != 0) goto L_0x0109
        L_0x0107:
            r3 = 0
            goto L_0x0154
        L_0x0109:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r8 = "android.intent.action.VIEW"
            java.lang.String r9 = "http://www.example.com"
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r7.<init>(r8, r9)
            r8 = 0
            android.content.pm.ResolveInfo r9 = r3.resolveActivity(r7, r8)
            r8 = 65536(0x10000, float:9.18355E-41)
            java.util.List r3 = r3.queryIntentActivities(r7, r8)
            if (r3 == 0) goto L_0x0107
            if (r9 == 0) goto L_0x0107
            r8 = 0
        L_0x0126:
            int r7 = r3.size()
            if (r8 >= r7) goto L_0x0107
            java.lang.Object r7 = r3.get(r8)
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            r27 = r3
            android.content.pm.ActivityInfo r3 = r9.activityInfo
            java.lang.String r3 = r3.name
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.name
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x014f
            android.content.pm.ActivityInfo r3 = r9.activityInfo
            java.lang.String r3 = r3.packageName
            java.lang.String r7 = com.google.android.gms.internal.ads.zzhhh.zza(r0)
            boolean r3 = r3.equals(r7)
            goto L_0x0154
        L_0x014f:
            int r8 = r8 + 1
            r3 = r27
            goto L_0x0126
        L_0x0154:
            com.google.android.gms.ads.internal.zzv.zzr()
            android.os.StatFs r7 = new android.os.StatFs
            java.io.File r8 = android.os.Environment.getDataDirectory()
            java.lang.String r8 = r8.getAbsolutePath()
            r7.<init>(r8)
            long r7 = r7.getAvailableBytes()
            r20 = 1024(0x400, double:5.06E-321)
            long r21 = r7 / r20
            com.google.android.gms.internal.ads.zzbcv r7 = com.google.android.gms.internal.ads.zzbde.zzlN
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r8.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1
            if (r7 == 0) goto L_0x018b
            com.google.android.gms.ads.internal.zzv.zzr()
            boolean r7 = com.google.android.gms.ads.internal.util.zzs.zzC(r0)
            if (r7 == 0) goto L_0x018b
            r23 = r8
            goto L_0x018d
        L_0x018b:
            r23 = 0
        L_0x018d:
            com.google.android.gms.internal.ads.zzbcv r7 = com.google.android.gms.internal.ads.zzbde.zzlR
            com.google.android.gms.internal.ads.zzbdc r9 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r9.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x01bf
            com.google.android.gms.common.wrappers.PackageManagerWrapper r7 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x01bc }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x01bc }
            r9 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo(r0, r9)     // Catch:{ NameNotFoundException -> 0x01bc }
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x01bc }
            if (r0 == 0) goto L_0x01bc
            boolean r7 = r0.containsKey(r1)     // Catch:{ NameNotFoundException -> 0x01bc }
            if (r7 == 0) goto L_0x01bc
            java.lang.String r0 = r0.getString(r1)     // Catch:{ NameNotFoundException -> 0x01bc }
            goto L_0x01c1
        L_0x01bc:
            r24 = 0
            goto L_0x01c3
        L_0x01bf:
            java.lang.String r0 = ""
        L_0x01c1:
            r24 = r0
        L_0x01c3:
            if (r6 == 0) goto L_0x01c7
            r9 = r8
            goto L_0x01c8
        L_0x01c7:
            r9 = 0
        L_0x01c8:
            if (r5 == 0) goto L_0x01cb
            goto L_0x01cc
        L_0x01cb:
            r8 = 0
        L_0x01cc:
            com.google.android.gms.internal.ads.zzeul r0 = new com.google.android.gms.internal.ads.zzeul
            r7 = r0
            java.lang.String r20 = android.os.Build.MODEL
            int r25 = android.os.Build.VERSION.SDK_INT
            r16 = r2
            r17 = r4
            r18 = r19
            r19 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeun.zzc(com.google.android.gms.internal.ads.zzeun):com.google.android.gms.internal.ads.zzeul");
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    public final int zza() {
        return 38;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeum(this));
    }
}
