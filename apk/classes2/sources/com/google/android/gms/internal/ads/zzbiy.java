package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbiy implements zzbkf {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    private static final Pattern zzb = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                int i = zze.zza;
                zzo.zzj("No label given for CSI tick.");
                return;
            }
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzcm)).booleanValue() && !zza.matcher(str2).matches()) {
                int i2 = zze.zza;
                zzo.zze("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            } else if (TextUtils.isEmpty(str4)) {
                int i3 = zze.zza;
                zzo.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = zzv.zzD().elapsedRealtime() + (Long.parseLong(str4) - zzv.zzD().currentTimeMillis());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    if (!((Boolean) zzbd.zzc().zzb(zzbde.zzcm)).booleanValue() || zza.matcher(str3).matches()) {
                        zzcfg.zzl().zzc(str2, str3, elapsedRealtime);
                        return;
                    }
                    int i4 = zze.zza;
                    zzo.zze("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                } catch (NumberFormatException e) {
                    int i5 = zze.zza;
                    zzo.zzk("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str5)) {
                int i6 = zze.zza;
                zzo.zzj("No value given for CSI experiment.");
                return;
            }
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzcm)).booleanValue() || zzb.matcher(str5).matches()) {
                zzcfg.zzl().zza().zzd("e", str5);
                return;
            }
            int i7 = zze.zza;
            zzo.zze("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str7 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str7)) {
                int i8 = zze.zza;
                zzo.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                int i9 = zze.zza;
                zzo.zzj("No name given for CSI extra.");
            } else {
                if (!((Boolean) zzbd.zzc().zzb(zzbde.zzcm)).booleanValue() || zza.matcher(str6).matches()) {
                    zzcfg.zzl().zza().zzd(str6, str7);
                    return;
                }
                int i10 = zze.zza;
                zzo.zze("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            }
        }
    }
}
