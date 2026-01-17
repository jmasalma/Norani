package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzegq implements zzedm {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    public final ListenableFuture zza(zzfcn zzfcn, zzfca zzfca) {
        zzfcn zzfcn2 = zzfcn;
        zzfca zzfca2 = zzfca;
        JSONObject jSONObject = zzfca2.zzv;
        String optString = jSONObject.optString("pubid", "");
        zzfcw zzfcw = zzfcn2.zza.zza;
        zzfcu zzfcu = new zzfcu();
        zzfcu.zzr(zzfcw);
        zzfcu.zzu(optString);
        zzm zzm = zzfcw.zzd;
        Bundle zzd = zzd(zzm.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = jSONObject.optString("mad_hac", (String) null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = jSONObject.optString("adJson", (String) null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfca2.zzD;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = jSONObject2.optString(next, (String) null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        int i = zzm.zza;
        Bundle bundle = zzd;
        int i2 = i;
        zzfcu.zzJ(new zzm(i2, zzm.zzb, zzd2, zzm.zzd, zzm.zze, zzm.zzf, zzm.zzg, zzm.zzh, zzm.zzi, zzm.zzj, zzm.zzk, zzm.zzl, bundle, zzm.zzn, zzm.zzo, zzm.zzp, zzm.zzq, zzm.zzr, zzm.zzs, zzm.zzt, zzm.zzu, zzm.zzv, zzm.zzw, zzm.zzx, zzm.zzy, zzm.zzz, zzm.zzA));
        zzfcw zzL = zzfcu.zzL();
        Bundle bundle2 = new Bundle();
        zzfcd zzfcd = zzfcn2.zzb.zzb;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList(zzfcd.zza));
        bundle3.putInt("refresh_interval", zzfcd.zzc);
        bundle3.putString("gws_query_id", zzfcd.zzb);
        bundle2.putBundle("parent_common_config", bundle3);
        String str = zzfcw.zzf;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", str);
        bundle4.putString("allocation_id", zzfca2.zzw);
        bundle4.putString("ad_source_name", zzfca2.zzF);
        bundle4.putStringArrayList("click_urls", new ArrayList(zzfca2.zzc));
        bundle4.putStringArrayList("imp_urls", new ArrayList(zzfca2.zzd));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList(zzfca2.zzp));
        bundle4.putStringArrayList("fill_urls", new ArrayList(zzfca2.zzm));
        bundle4.putStringArrayList("video_start_urls", new ArrayList(zzfca2.zzg));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList(zzfca2.zzh));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList(zzfca2.zzi));
        bundle4.putString("transaction_id", zzfca2.zzj);
        bundle4.putString("valid_from_timestamp", zzfca2.zzk);
        bundle4.putBoolean("is_closable_area_disabled", zzfca2.zzP);
        bundle4.putString("recursive_server_response_data", zzfca2.zzao);
        bundle4.putBoolean("is_analytics_logging_enabled", zzfca2.zzW);
        zzbwo zzbwo = zzfca2.zzl;
        if (zzbwo != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", zzbwo.zzb);
            bundle5.putString("rb_type", zzbwo.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return zzc(zzL, bundle2, zzfca2, zzfcn2);
    }

    public final boolean zzb(zzfcn zzfcn, zzfca zzfca) {
        return !TextUtils.isEmpty(zzfca.zzv.optString("pubid", ""));
    }

    /* access modifiers changed from: protected */
    public abstract ListenableFuture zzc(zzfcw zzfcw, Bundle bundle, zzfca zzfca, zzfcn zzfcn);
}
