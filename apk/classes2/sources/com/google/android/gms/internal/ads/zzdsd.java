package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdsd {
    private final ConcurrentHashMap zza;
    private final zzbzw zzb;
    private final zzfcw zzc;
    private final String zzd;
    private final String zze;
    private final zzk zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdsd(Context context, zzdso zzdso, zzbzw zzbzw, zzfcw zzfcw, String str, String str2, zzk zzk) {
        ActivityManager.MemoryInfo zzc2;
        String str3;
        ConcurrentHashMap zzc3 = zzdso.zzc();
        this.zza = zzc3;
        this.zzb = zzbzw;
        this.zzc = zzfcw;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzk;
        this.zzh = context;
        zzc3.put("ad_format", str2.toUpperCase(Locale.ROOT));
        String str4 = "1";
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjW)).booleanValue()) {
            int zzp = zzk.zzp();
            int i = zzp - 1;
            if (zzp != 0) {
                if (i != 0) {
                    str3 = i != 1 ? "na" : "2";
                } else {
                    str3 = str4;
                }
                zzc3.put("asv", str3);
            } else {
                throw null;
            }
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(zzv.zzp().zzb()));
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzcy)).booleanValue() && (zzc2 = zzf.zzc(context)) != null) {
                zzd("mem_avl", String.valueOf(zzc2.availMem));
                zzd("mem_tt", String.valueOf(zzc2.totalMem));
                zzd("low_m", true != zzc2.lowMemory ? "0" : str4);
            }
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhg)).booleanValue()) {
            int zzg2 = zzaa.zzg(zzfcw) - 1;
            if (zzg2 != 0) {
                if (zzg2 == 1) {
                    zzc3.put("request_id", str);
                    zzc3.put("se", "query_g");
                } else if (zzg2 == 2) {
                    zzc3.put("se", "r_adinfo");
                } else if (zzg2 != 3) {
                    zzc3.put("se", "r_both");
                } else {
                    zzc3.put("se", "r_adstring");
                }
                zzc3.put("scar", "true");
                zzd("ragent", zzfcw.zzd.zzp);
                zzd("rtype", zzaa.zzb(zzaa.zzc(zzfcw.zzd)));
                return;
            }
            zzc3.put("request_id", str);
            zzc3.put("scar", "false");
        }
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc() {
        String str;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznG)).booleanValue()) {
            if (true != this.zzc.zzp) {
                str = "0";
            } else {
                str = "1";
            }
            zzd("brr", str);
        }
    }

    public final void zzd(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }

    public final void zze(zzfcn zzfcn) {
        String str;
        zzfcm zzfcm = zzfcn.zzb;
        List list = zzfcm.zza;
        if (!list.isEmpty()) {
            int i = ((zzfca) list.get(0)).zzb;
            zzd("ad_format", zzfca.zza(i));
            if (i == 6) {
                ConcurrentHashMap concurrentHashMap = this.zza;
                if (true != this.zzb.zzm()) {
                    str = "0";
                } else {
                    str = "1";
                }
                concurrentHashMap.put("as", str);
            }
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcs)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzfcm.zzb.zzb);
    }

    public final void zzf(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("cnt")) {
                zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
            }
            if (bundle.containsKey("gnt")) {
                zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
            }
        }
    }
}
