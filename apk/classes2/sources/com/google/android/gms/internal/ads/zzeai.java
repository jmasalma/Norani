package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.net.HttpHeaders;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeai implements zzfge {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfhj zzc;
    private final zzfhu zzd;

    public zzeai(String str, zzfhu zzfhu, zzfhj zzfhj) {
        this.zzb = str;
        this.zzd = zzfhu;
        this.zzc = zzfhj;
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdwm zzdwm;
        JSONObject zzb2;
        String str;
        zzeah zzeah = (zzeah) obj;
        int optInt = zzeah.zza.optInt("http_timeout_millis", 60000);
        zzbvs zza2 = zzeah.zzb;
        String str2 = "";
        if (zza2.zza() == -2) {
            HashMap hashMap = new HashMap();
            if (zzeah.zzb.zzj()) {
                String str3 = this.zzb;
                if (!TextUtils.isEmpty(str3)) {
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzbd)).booleanValue()) {
                        if (TextUtils.isEmpty(str3)) {
                            str = str2;
                        } else {
                            Matcher matcher = zza.matcher(str3);
                            str = str2;
                            while (matcher.find()) {
                                String group = matcher.group(1);
                                if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            hashMap.put(HttpHeaders.COOKIE, str);
                        }
                    } else {
                        hashMap.put(HttpHeaders.COOKIE, str3);
                    }
                }
            }
            if (zzeah.zzb.zzk() && (zzb2 = zzeah.zza) != null) {
                JSONObject optJSONObject = zzb2.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", str2))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", str2));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", str2))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", str2));
                    }
                } else {
                    zze.zza("DSID signal does not exist.");
                }
            }
            if (zzeah.zzb != null && !TextUtils.isEmpty(zzeah.zzb.zzf())) {
                str2 = zzeah.zzb.zzf();
            }
            zzfhu zzfhu = this.zzd;
            zzfhj zzfhj = this.zzc;
            zzfhj.zzg(true);
            zzfhu.zza(zzfhj);
            return new zzead(zzeah.zzb.zzg(), optInt, hashMap, str2.getBytes(StandardCharsets.UTF_8), "", zzeah.zzb.zzk());
        }
        if (zza2.zza() == 1) {
            if (zza2.zzh() != null) {
                str2 = TextUtils.join(", ", zza2.zzh());
                int i = zze.zza;
                zzo.zzg(str2);
            }
            zzdwm = new zzdwm(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzdwm = new zzdwm(1);
        }
        zzfhu zzfhu2 = this.zzd;
        zzfhj zzfhj2 = this.zzc;
        zzfhj2.zzh(zzdwm);
        zzfhj2.zzg(false);
        zzfhu2.zza(zzfhj2);
        throw zzdwm;
    }
}
