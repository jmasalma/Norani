package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzfvj {
    private final String zza;
    private final zzfvi zzb;
    private zzfvi zzc;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfvi zzfvi = this.zzb.zzb;
        String str = "";
        while (zzfvi != null) {
            Object obj = zzfvi.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzfvi = zzfvi.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfvj zza(Object obj) {
        zzfvi zzfvi = new zzfvi();
        this.zzc.zzb = zzfvi;
        this.zzc = zzfvi;
        zzfvi.zza = obj;
        return this;
    }

    /* synthetic */ zzfvj(String str, zzfvk zzfvk) {
        zzfvi zzfvi = new zzfvi();
        this.zzb = zzfvi;
        this.zzc = zzfvi;
        str.getClass();
        String str2 = str;
        this.zza = str;
    }
}
