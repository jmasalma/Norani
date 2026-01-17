package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzboq;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzfhi;
import com.google.android.gms.internal.ads.zzfhj;
import com.google.android.gms.internal.ads.zzfhx;
import com.google.android.gms.internal.ads.zzgdn;
import com.google.android.gms.internal.ads.zzgdy;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    public static /* synthetic */ ListenableFuture zza(zzf zzf, Long l, zzdsj zzdsj, zzfhj zzfhj, zzfhx zzfhx, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzv.zzp().zzi().zzs(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdsj, "cld_s", zzv.zzD().elapsedRealtime() - l.longValue());
            }
        }
        String optString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(optString)) {
            zzfhj.zzc(optString);
        }
        zzfhj.zzg(optBoolean);
        zzfhx.zzc(zzfhj.zzm());
        return zzgdn.zzh((Object) null);
    }

    /* access modifiers changed from: private */
    public static final void zzf(zzdsj zzdsj, String str, long j) {
        if (zzdsj != null) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zznb)).booleanValue()) {
                zzdsi zza2 = zzdsj.zza();
                zza2.zzb("action", "lat_init");
                zza2.zzb(str, Long.toString(j));
                zza2.zzj();
            }
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfhx zzfhx, zzdsj zzdsj, Long l, boolean z) {
        zzd(context, versionInfoParcel, true, (zzbzm) null, str, (String) null, runnable, zzfhx, zzdsj, l, z);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzbzm zzbzm, String str, String str2, Runnable runnable, zzfhx zzfhx, zzdsj zzdsj, Long l, boolean z2) {
        PackageInfo packageInfo;
        Context context2 = context;
        VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
        Runnable runnable2 = runnable;
        zzfhx zzfhx2 = zzfhx;
        Long l2 = l;
        if (zzv.zzD().elapsedRealtime() - this.zzb < 5000) {
            int i = zze.zza;
            zzo.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzv.zzD().elapsedRealtime();
        if (zzbzm != null && !TextUtils.isEmpty(zzbzm.zzc())) {
            if (zzv.zzD().currentTimeMillis() - zzbzm.zza() <= ((Long) zzbd.zzc().zzb(zzbde.zzew)).longValue() && zzbzm.zzi()) {
                return;
            }
        }
        if (context2 == null) {
            int i2 = zze.zza;
            zzo.zzj("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context2;
            }
            this.zza = applicationContext;
            zzfhj zza2 = zzfhi.zza(context, 4);
            zza2.zzi();
            zzbow zza3 = zzv.zzg().zza(this.zza, versionInfoParcel, zzfhx2);
            zzboq zzboq = zzbot.zza;
            zzbom zza4 = zza3.zza("google.afma.config.fetchAppSettings", zzboq, zzboq);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzbcv zzbcv = zzbde.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbd.zza().zza()));
                jSONObject.put("js", versionInfoParcel2.afmaVersion);
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzjV)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z2);
                }
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (!(applicationInfo == null || (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) == null)) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zze.zza("Error fetching PackageInfo.");
                }
                ListenableFuture zzb2 = zza4.zzb(jSONObject);
                zzd zzd = new zzd(this, l, zzdsj, zza2, zzfhx);
                zzgdy zzgdy = zzcaf.zzg;
                ListenableFuture zzn = zzgdn.zzn(zzb2, zzd, zzgdy);
                if (runnable2 != null) {
                    zzb2.addListener(runnable2, zzgdy);
                }
                if (l2 != null) {
                    zzb2.addListener(new zze(this, zzdsj, l2), zzgdy);
                }
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzia)).booleanValue()) {
                    zzcai.zzb(zzn, "ConfigLoader.maybeFetchNewAppSettings");
                } else {
                    zzcai.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
                }
            } catch (Exception e) {
                int i3 = zze.zza;
                zzo.zzh("Error requesting application settings", e);
                zza2.zzh(e);
                zza2.zzg(false);
                zzfhx2.zzc(zza2.zzm());
            }
        } else {
            int i4 = zze.zza;
            zzo.zzj("App settings could not be fetched. Required parameters missing");
        }
    }

    public final void zze(Context context, VersionInfoParcel versionInfoParcel, String str, zzbzm zzbzm, zzfhx zzfhx, boolean z) {
        zzd(context, versionInfoParcel, false, zzbzm, zzbzm != null ? zzbzm.zzb() : null, str, (Runnable) null, zzfhx, (zzdsj) null, (Long) null, z);
    }
}
