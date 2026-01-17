package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzdsj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzad zzad, zzaa zzaa, boolean z, zzdsj zzdsj, String str) {
        if (z) {
            return zzc(context, intent.getData(), zzad, zzaa);
        }
        try {
            String uri = intent.toURI();
            zze.zza("Launching an intent: " + uri);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zznx)).booleanValue()) {
                zzv.zzr();
                zzs.zzY(context, intent, zzdsj, str);
            } else {
                zzv.zzr();
                zzs.zzU(context, intent);
            }
            if (zzad != null) {
                zzad.zzg();
            }
            if (zzaa != null) {
                zzaa.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i = zze.zza;
            zzo.zzj(message);
            if (zzaa != null) {
                zzaa.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzc, zzad zzad, zzaa zzaa, zzdsj zzdsj, String str) {
        int i = 0;
        if (zzc == null) {
            int i2 = zze.zza;
            zzo.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbde.zza(context);
        Intent intent = zzc.zzh;
        if (intent != null) {
            return zza(context, intent, zzad, zzaa, zzc.zzj, zzdsj, str);
        }
        Intent intent2 = new Intent();
        String str2 = zzc.zzb;
        if (TextUtils.isEmpty(str2)) {
            int i3 = zze.zza;
            zzo.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = zzc.zzc;
        if (!TextUtils.isEmpty(str3)) {
            intent2.setDataAndType(Uri.parse(str2), str3);
        } else {
            intent2.setData(Uri.parse(str2));
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = zzc.zzd;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = zzc.zze;
        if (!TextUtils.isEmpty(str5)) {
            String[] split = str5.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(str5);
                int i4 = zze.zza;
                zzo.zzj("Could not parse component name from open GMSG: ".concat(valueOf));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str6 = zzc.zzf;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i5 = zze.zza;
                zzo.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzeQ)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzeP)).booleanValue()) {
                zzv.zzr();
                zzs.zzp(context, intent2);
            }
        }
        return zza(context, intent2, zzad, zzaa, zzc.zzj, zzdsj, str);
    }

    private static final boolean zzc(Context context, Uri uri, zzad zzad, zzaa zzaa) {
        int i;
        try {
            i = zzv.zzr().zzn(context, uri);
            if (zzad != null) {
                zzad.zzg();
            }
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i2 = zze.zza;
            zzo.zzj(message);
            i = 6;
        }
        if (zzaa != null) {
            zzaa.zzb(i);
        }
        return i == 5;
    }
}
