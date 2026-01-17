package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdso;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzo {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzdso zzd;
    private final ExecutorService zze;

    zzo(Context context, zzdso zzdso, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzdso;
        this.zze = executorService;
    }

    public static /* synthetic */ void zzb(zzo zzo, Object obj, Pair pair) {
        CookieManager zza2;
        boolean z = false;
        if ((obj instanceof WebView) && (zza2 = zzv.zzs().zza(zzo.zzc)) != null) {
            z = zza2.acceptThirdPartyCookies((WebView) obj);
        }
        Map map = zzo.zza;
        Boolean valueOf = Boolean.valueOf(z);
        zzq zzq = (zzq) map.get(valueOf);
        if (zzq == null || zzq.zze()) {
            Map map2 = zzo.zzb;
            List list = (List) map2.get(valueOf);
            if (list == null) {
                list = new ArrayList();
                map2.put(valueOf, list);
            }
            list.add(pair);
            return;
        }
        zzo.zzi(zzq, pair, true);
    }

    private final void zzh(boolean z) {
        Map map = this.zzb;
        Boolean valueOf = Boolean.valueOf(z);
        if (!map.containsKey(valueOf)) {
            map.put(valueOf, new ArrayList());
            this.zze.submit(new zzm(this, z));
        }
    }

    private final void zzi(zzq zzq, Pair pair, boolean z) {
        zzq.zzd();
        QueryInfo zzb2 = zzq.zzb();
        if (zzb2 != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(zzb2);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzq.zzc());
        }
        zzdso zzdso = this.zzd;
        Pair[] pairArr = new Pair[7];
        boolean z2 = false;
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        pairArr[4] = new Pair("lat_ms", Long.toString(zzv.zzD().currentTimeMillis() - ((Long) pair.second).longValue()));
        pairArr[5] = new Pair("sgpc_h", Boolean.toString(z));
        if (zzq.zzb() != null) {
            z2 = true;
        }
        pairArr[6] = new Pair("sgpc_rs", Boolean.toString(z2));
        zzaa.zzd(zzdso, (zzdsd) null, "sgpcr", pairArr);
    }

    /* access modifiers changed from: private */
    public final synchronized void zzj(boolean z, boolean z2) {
        Boolean valueOf;
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        bundle.putBoolean("accept_3p_cookie", z);
        Map map = this.zza;
        Boolean valueOf2 = Boolean.valueOf(z);
        zzq zzq = (zzq) map.get(valueOf2);
        int i = 0;
        if (z2) {
            if (zzq != null) {
                i = zzq.zza() + 1;
            }
        }
        zzq zzq2 = (zzq) map.get(valueOf2);
        if (zzq2 == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(zzq2.zzf());
        }
        zzp zzp = new zzp(this, z, i, valueOf, this.zzd);
        AdRequest build = ((AdRequest.Builder) new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle)).build();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlz)).booleanValue()) {
            this.zze.submit(new zzn(this, build, zzp));
        } else {
            QueryInfo.generate(this.zzc, AdFormat.BANNER, build, zzp);
        }
    }

    public final synchronized void zze() {
        zzh(true);
        zzh(false);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzf(boolean z, zzq zzq) {
        Long l;
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z);
        zzq zzq2 = (zzq) map.get(valueOf);
        if (zzq2 == null || zzq2.zze() || zzq2.zzb() == null || zzq.zzb() != null) {
            map.put(valueOf, zzq);
        }
        if (zzq.zzb() != null) {
            l = (Long) zzbfj.zzf.zze();
        } else {
            l = (Long) zzbfj.zzg.zze();
        }
        zzcaf.zzd.schedule(new zzl(this, z, zzq.zzb() == null), l.longValue(), TimeUnit.SECONDS);
        Map map2 = this.zzb;
        List<Pair> list = (List) map2.get(valueOf);
        map2.put(valueOf, new ArrayList());
        if (list != null) {
            for (Pair zzi : list) {
                zzi(zzq, zzi, false);
            }
        }
    }

    public final synchronized void zzg(Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzcaf.zzf.execute(new zzk(this, obj, new Pair(queryInfoGenerationCallback, Long.valueOf(zzv.zzD().currentTimeMillis()))));
    }
}
