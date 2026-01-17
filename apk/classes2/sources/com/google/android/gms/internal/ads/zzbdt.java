package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbdt {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbdt(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbdq zzf() {
        return new zzbdq(zzv.zzD().elapsedRealtime(), (String) null, (zzbdq) null);
    }

    public final zzbds zza() {
        zzbds zzbds;
        boolean booleanValue = ((Boolean) zzbd.zzc().zzb(zzbde.zzcc)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            List<zzbdq> list = this.zza;
            for (zzbdq zzbdq : list) {
                long zza2 = zzbdq.zza();
                String zzc2 = zzbdq.zzc();
                zzbdq zzb2 = zzbdq.zzb();
                if (zzb2 != null && zza2 > 0) {
                    sb.append(zzc2);
                    sb.append('.');
                    sb.append(zza2 - zzb2.zza());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb2.zza()))) {
                            hashMap.put(Long.valueOf(zzb2.zza()), new StringBuilder(zzc2));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb2.zza()));
                            sb2.append('+');
                            sb2.append(zzc2);
                        }
                    }
                }
            }
            list.clear();
            String str = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(zzv.zzD().currentTimeMillis() + (((Long) entry.getKey()).longValue() - zzv.zzD().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbds = new zzbds(sb.toString(), str);
        }
        return zzbds;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            zzv.zzp().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbdt zzbdt) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbdj zzg;
        if (!TextUtils.isEmpty(str2) && (zzg = zzv.zzp().zzg()) != null) {
            synchronized (this.zzc) {
                zzbdp zza2 = zzg.zza(str);
                Map map = this.zzb;
                map.put(str, zza2.zza((String) map.get(str), str2));
            }
        }
    }

    public final boolean zze(zzbdq zzbdq, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbdq(j, strArr[0], zzbdq));
        }
        return true;
    }
}
