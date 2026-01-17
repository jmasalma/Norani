package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaej {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = zzex.zza;
            String str3 = group;
            int parseInt = Integer.parseInt(group, 16);
            String group2 = matcher.group(2);
            String str4 = group2;
            int parseInt2 = Integer.parseInt(group2, 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.zza = parseInt;
            this.zzb = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzav zzav) {
        for (int i = 0; i < zzav.zza(); i++) {
            zzau zzb2 = zzav.zzb(i);
            if (zzb2 instanceof zzaha) {
                zzaha zzaha = (zzaha) zzb2;
                if ("iTunSMPB".equals(zzaha.zzb) && zzc(zzaha.zzc)) {
                    return true;
                }
            } else if (zzb2 instanceof zzahh) {
                zzahh zzahh = (zzahh) zzb2;
                if ("com.apple.iTunes".equals(zzahh.zza) && "iTunSMPB".equals(zzahh.zzb) && zzc(zzahh.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
