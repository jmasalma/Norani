package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzm;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeme implements zzeub {
    final zzfcw zza;
    private final long zzb;

    public zzeme(zzfcw zzfcw, long j) {
        this.zza = zzfcw;
        this.zzb = j;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcva) obj).zzb;
        zzfcw zzfcw = this.zza;
        bundle.putString("slotname", zzfcw.zzf);
        zzm zzm = zzfcw.zzd;
        boolean z = true;
        if (zzm.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i = zzm.zzg;
        zzfdk.zze(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (zzm.zza >= 8) {
            int i2 = zzm.zzt;
            if (i2 == -1) {
                z = false;
            }
            zzfdk.zze(bundle, "tag_for_under_age_of_consent", i2, z);
        }
        zzfdk.zzc(bundle, "url", zzm.zzl);
        zzfdk.zzd(bundle, "neighboring_content_urls", zzm.zzv);
        Bundle bundle2 = zzm.zzc;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) zzbd.zzc().zzb(zzbde.zzhP)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfdk.zzb(bundle, "extras", bundle3);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcva) obj).zza;
        zzfcw zzfcw = this.zza;
        zzm zzm = zzfcw.zzd;
        bundle.putInt("http_timeout_millis", zzm.zzw);
        bundle.putString("slotname", zzfcw.zzf);
        int i = zzfcw.zzo.zza;
        if (i != 0) {
            int i2 = i - 1;
            boolean z = true;
            if (i2 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i2 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            zzfdk.zzg(bundle, "is_sdk_preload", true, zzm.zzc());
            zzfdk.zzf(bundle, "prefetch_type", "zenith_v2", zzm.zzd());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
            long j = zzm.zzb;
            zzfdk.zzf(bundle, "cust_age", simpleDateFormat.format(new Date(j)), j != -1);
            zzfdk.zzb(bundle, "extras", zzm.zzc);
            int i3 = zzm.zzd;
            zzfdk.zze(bundle, "cust_gender", i3, i3 != -1);
            zzfdk.zzd(bundle, "kw", zzm.zze);
            int i4 = zzm.zzg;
            zzfdk.zze(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
            if (zzm.zzf) {
                bundle.putBoolean("test_request", true);
            }
            bundle.putInt("ppt_p13n", zzm.zzy);
            int i5 = zzm.zza;
            zzfdk.zze(bundle, "d_imp_hdr", 1, i5 >= 2 && zzm.zzh);
            String str = zzm.zzi;
            zzfdk.zzf(bundle, "ppid", str, i5 >= 2 && !TextUtils.isEmpty(str));
            Location location = zzm.zzk;
            if (location != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", location.getAccuracy() * 1000.0f);
                bundle2.putLong("lat", (long) (location.getLatitude() * 1.0E7d));
                bundle2.putLong("long", (long) (1.0E7d * location.getLongitude()));
                bundle2.putLong("time", location.getTime() * 1000);
                bundle.putBundle("uule", bundle2);
            }
            zzfdk.zzc(bundle, "url", zzm.zzl);
            zzfdk.zzd(bundle, "neighboring_content_urls", zzm.zzv);
            zzfdk.zzb(bundle, "custom_targeting", zzm.zzn);
            zzfdk.zzd(bundle, "category_exclusions", zzm.zzo);
            zzfdk.zzc(bundle, "request_agent", zzm.zzp);
            zzfdk.zzc(bundle, "request_pkg", zzm.zzq);
            zzfdk.zzg(bundle, "is_designed_for_families", zzm.zzr, i5 >= 7);
            if (i5 >= 8) {
                int i6 = zzm.zzt;
                if (i6 == -1) {
                    z = false;
                }
                zzfdk.zze(bundle, "tag_for_under_age_of_consent", i6, z);
                zzfdk.zzc(bundle, "max_ad_content_rating", zzm.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
