package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzara {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzaqp.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            zzaqp.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static zzapm zzb(zzapz zzapz) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        zzapz zzapz2 = zzapz;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzapz2.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get(HttpHeaders.DATE);
        long zza = str != null ? zza(str) : 0;
        String str2 = (String) map.get(HttpHeaders.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = (String) map.get(HttpHeaders.EXPIRES);
        long zza2 = str3 != null ? zza(str3) : 0;
        String str4 = (String) map.get(HttpHeaders.LAST_MODIFIED);
        long zza3 = str4 != null ? zza(str4) : 0;
        String str5 = (String) map.get(HttpHeaders.ETAG);
        if (i != 0) {
            j4 = currentTimeMillis + (j * 1000);
            j3 = z ? j4 : (j2 * 1000) + j4;
        } else {
            j3 = 0;
            if (zza <= 0 || zza2 < zza) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (zza2 - zza);
                j3 = j4;
            }
        }
        zzapm zzapm = new zzapm();
        zzapm.zza = zzapz2.zzb;
        zzapm.zzb = str5;
        zzapm.zzf = j4;
        zzapm.zze = j3;
        zzapm.zzc = zza;
        zzapm.zzd = zza3;
        zzapm.zzg = map;
        zzapm.zzh = zzapz2.zzd;
        return zzapm;
    }

    static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
