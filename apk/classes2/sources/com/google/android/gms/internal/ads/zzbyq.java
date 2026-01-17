package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbyq {
    static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String zzb(Uri uri, Context context, Map map) {
        if (!zzv.zzo().zzp(context)) {
            return uri.toString();
        }
        String zzb = zzv.zzo().zzb(context);
        if (zzb == null) {
            return uri.toString();
        }
        String str = (String) zzbd.zzc().zzb(zzbde.zzay);
        String uri2 = uri.toString();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzax)).booleanValue() && uri2.contains(str)) {
            zzv.zzo().zzj(context, zzb, (Map) map.get("_ac"));
            return zzd(uri2, context).replace(str, zzb);
        } else if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        } else {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzaw)).booleanValue()) {
                return uri2;
            }
            String uri3 = zza(zzd(uri2, context), "fbs_aeid", zzb).toString();
            zzv.zzo().zzj(context, zzb, (Map) map.get("_ac"));
            return uri3;
        }
    }

    public static String zzc(String str, Context context, boolean z, Map map) {
        String zzb;
        if ((((Boolean) zzbd.zzc().zzb(zzbde.zzaF)).booleanValue() && !z) || !zzv.zzo().zzp(context) || TextUtils.isEmpty(str) || (zzb = zzv.zzo().zzb(context)) == null) {
            return str;
        }
        String str2 = (String) zzbd.zzc().zzb(zzbde.zzay);
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzax)).booleanValue() || !str.contains(str2)) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzaw)).booleanValue()) {
                return str;
            }
            if (zzv.zzr().zzj(str)) {
                zzv.zzo().zzj(context, zzb, (Map) map.get("_ac"));
                return zza(zzd(str, context), "fbs_aeid", zzb).toString();
            } else if (!zzv.zzr().zzk(str)) {
                return str;
            } else {
                zzv.zzo().zzk(context, zzb, (Map) map.get("_ai"));
                return zza(zzd(str, context), "fbs_aeid", zzb).toString();
            }
        } else if (zzv.zzr().zzj(str)) {
            zzv.zzo().zzj(context, zzb, (Map) map.get("_ac"));
            return zzd(str, context).replace(str2, zzb);
        } else if (!zzv.zzr().zzk(str)) {
            return str;
        } else {
            zzv.zzo().zzk(context, zzb, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, zzb);
        }
    }

    private static String zzd(String str, Context context) {
        String zze = zzv.zzo().zze(context);
        String zzc = zzv.zzo().zzc(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zze)) {
            str = zza(str, "gmp_app_id", zze).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzc)) ? str : zza(str, "fbs_aiid", zzc).toString();
    }
}
