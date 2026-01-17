package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    /* synthetic */ zzp(zzn zzn, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzo zzo) {
        this.zza = zzn;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    static /* bridge */ /* synthetic */ zzcj zza(zzp zzp) {
        List list;
        List list2;
        PackageInfo packageInfo;
        long j;
        View view;
        WindowInsets windowInsets;
        DisplayCutout displayCutout;
        Bundle bundle;
        zzcj zzcj = new zzcj();
        String zza2 = zzp.zzd.zza();
        String str = null;
        if (TextUtils.isEmpty(zza2)) {
            try {
                zzn zzn = zzp.zza;
                bundle = zzn.zza.getPackageManager().getApplicationInfo(zzn.zza.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                zza2 = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(zza2)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzcj.zza = zza2;
        ConsentDebugSettings consentDebugSettings = zzp.zzc;
        if (!consentDebugSettings.isTestDevice()) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            int debugGeography = consentDebugSettings.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(zzce.GEO_OVERRIDE_EEA);
            } else if (debugGeography == 2) {
                arrayList.add(zzce.GEO_OVERRIDE_NON_EEA);
            } else if (debugGeography == 3) {
                arrayList.add(zzce.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (debugGeography == 4) {
                arrayList.add(zzce.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(zzce.PREVIEWING_DEBUG_MESSAGES);
            list = arrayList;
        }
        zzcj.zzi = list;
        zzn zzn2 = zzp.zza;
        zzcj.zze = zzn2.zzb.zzc();
        zzcj.zzd = Boolean.valueOf(zzp.zzd.isTagForUnderAgeOfConsent());
        zzcj.zzc = Locale.getDefault().toLanguageTag();
        zzcf zzcf = new zzcf();
        zzcf.zzb = Integer.valueOf(Build.VERSION.SDK_INT);
        zzcf.zza = Build.MODEL;
        zzcf.zzc = 2;
        zzcj.zzb = zzcf;
        Configuration configuration = zzn2.zza.getResources().getConfiguration();
        zzn2.zza.getResources().getConfiguration();
        zzch zzch = new zzch();
        zzch.zza = Integer.valueOf(configuration.screenWidthDp);
        zzch.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzch.zzc = Double.valueOf((double) zzn2.zza.getResources().getDisplayMetrics().density);
        if (Build.VERSION.SDK_INT < 28) {
            list2 = Collections.emptyList();
        } else {
            Activity activity = zzp.zzb;
            Window window = activity == null ? null : activity.getWindow();
            if (window == null) {
                view = null;
            } else {
                view = window.getDecorView();
            }
            if (view == null) {
                windowInsets = null;
            } else {
                windowInsets = view.getRootWindowInsets();
            }
            if (windowInsets == null) {
                displayCutout = null;
            } else {
                displayCutout = windowInsets.getDisplayCutout();
            }
            if (displayCutout == null) {
                list2 = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect next : displayCutout.getBoundingRects()) {
                    if (next != null) {
                        zzcg zzcg = new zzcg();
                        zzcg.zzb = Integer.valueOf(next.left);
                        zzcg.zzc = Integer.valueOf(next.right);
                        zzcg.zza = Integer.valueOf(next.top);
                        zzcg.zzd = Integer.valueOf(next.bottom);
                        arrayList2.add(zzcg);
                    }
                }
                list2 = arrayList2;
            }
        }
        zzch.zzd = list2;
        zzcj.zzf = zzch;
        Application zza3 = zzn2.zza;
        try {
            packageInfo = zzn2.zza.getPackageManager().getPackageInfo(zza3.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcd zzcd = new zzcd();
        zzcd.zza = zza3.getPackageName();
        zzn zzn3 = zzp.zza;
        CharSequence applicationLabel = zzn3.zza.getPackageManager().getApplicationLabel(zzn3.zza.getApplicationInfo());
        if (applicationLabel != null) {
            str = applicationLabel.toString();
        }
        zzcd.zzb = str;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = (long) packageInfo.versionCode;
            }
            zzcd.zzc = Long.toString(j);
        }
        zzcj.zzg = zzcd;
        zzci zzci = new zzci();
        zzci.zza = "3.2.0";
        zzcj.zzh = zzci;
        return zzcj;
    }
}
