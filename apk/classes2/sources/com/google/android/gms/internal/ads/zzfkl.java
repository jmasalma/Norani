package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfkl {
    private final zzdsj zza;
    private final String zzb;

    zzfkl(zzdsj zzdsj, Context context) {
        Object obj;
        this.zza = zzdsj;
        zzfrw zzfrw = zzs.zza;
        try {
            obj = Wrappers.packageManager(context).getApplicationLabel(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            int i = zze.zza;
            zzo.zzk("Failed to get application name", e);
            obj = "";
        }
        this.zzb = obj.toString();
    }

    private final void zzq(String str, String str2, long j, int i, int i2, String str3, zzfkt zzfkt, String str4) {
        zzdsi zza2 = this.zza.zza();
        zza2.zzb(str2, Long.toString(j));
        zza2.zzb("app", this.zzb);
        if (zzfkt != null) {
            zza2.zzb("ad_unit_id", zzfkt.zzb());
            zza2.zzb("ad_format", zzfkt.zza());
            zza2.zzb("pid", zzfkt.zzc());
        }
        zza2.zzb("action", str);
        if (str3 != null) {
            zza2.zzb("gqi", str3);
        }
        if (i >= 0) {
            zza2.zzb("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            zza2.zzb("cache_size", Integer.toString(i2));
        }
        zza2.zzb("pv", str4);
        zza2.zzj();
    }

    private final void zzr(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, String str4) {
        zzdsi zza2 = this.zza.zza();
        zza2.zzb("action", str);
        zza2.zzb("pat", Long.toString(j));
        zza2.zzb("app", this.zzb);
        zza2.zzb("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zza2.zzb("max_ads", Integer.toString(i));
        zza2.zzb("cache_size", Integer.toString(i2));
        zza2.zzb("pas", Integer.toString(i3));
        zza2.zzb("pv", "2");
        zza2.zzb("ad_unit_id", str3);
        zza2.zzb("pid", str2);
        zza2.zzj();
    }

    public final void zza(int i, int i2, long j, zzfkt zzfkt) {
        zzdsi zza2 = this.zza.zza();
        zza2.zzb("action", "cache_resize");
        zza2.zzb("cs_ts", Long.toString(j));
        zza2.zzb("app", this.zzb);
        zza2.zzb("orig_ma", Integer.toString(i));
        zza2.zzb("max_ads", Integer.toString(i2));
        zza2.zzb("ad_format", zzfkt.zza());
        zza2.zzb("ad_unit_id", zzfkt.zzb());
        zza2.zzb("pid", zzfkt.zzc());
        zza2.zzb("pv", "1");
        zza2.zzj();
    }

    public final void zzb(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzr("pd", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzc(long j, AdFormat adFormat, int i) {
        zzr("pda", j, (String) null, (String) null, adFormat, -1, -1, i, "2");
    }

    public final void zzd(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzr("pgc", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zze(AdFormat adFormat, long j, int i) {
        zzr("pgcs", j, (String) null, (String) null, adFormat, -1, -1, i, "2");
    }

    public final void zzf(int i, long j, String str, String str2, AdFormat adFormat, int i2) {
        zzr("pnav", j, str, str2, adFormat, i2, i, 1, "2");
    }

    public final void zzg(long j, String str) {
        zzq("poll_ad", "ppacwe_ts", j, -1, -1, (String) null, (zzfkt) null, "2");
    }

    public final void zzh(int i, int i2, long j, Long l, String str, zzfkt zzfkt, String str2) {
        zzdsi zza2 = this.zza.zza();
        zza2.zzb("plaac_ts", Long.toString(j));
        zza2.zzb("app", this.zzb);
        zza2.zzb("max_ads", Integer.toString(i));
        zza2.zzb("cache_size", Integer.toString(i2));
        zza2.zzb("action", "is_ad_available");
        if (zzfkt != null) {
            zza2.zzb("ad_unit_id", zzfkt.zzb());
            zza2.zzb("pid", zzfkt.zzc());
            zza2.zzb("ad_format", zzfkt.zza());
        }
        if (l != null) {
            zza2.zzb("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            zza2.zzb("gqi", str);
        }
        zza2.zzb("pv", str2);
        zza2.zzj();
    }

    public final void zzi(long j, String str, zzfkt zzfkt, int i, int i2, String str2) {
        zzq("paa", "pano_ts", j, i, i2, str, zzfkt, str2);
    }

    public final void zzj(long j, zzfkt zzfkt, int i, String str) {
        zzq("pae", "paeo_ts", j, i, 0, (String) null, zzfkt, str);
    }

    public final void zzk(long j, zzfkt zzfkt, com.google.android.gms.ads.internal.client.zze zze, int i, int i2, String str) {
        zzdsi zza2 = this.zza.zza();
        zza2.zzb("action", "pftla");
        zza2.zzb("pftlat_ts", Long.toString(j));
        zza2.zzb("pftlaec", Integer.toString(zze.zza));
        zza2.zzb("app", this.zzb);
        zza2.zzb("ad_format", zzfkt.zza());
        zza2.zzb("max_ads", Integer.toString(i));
        zza2.zzb("cache_size", Integer.toString(i2));
        zza2.zzb("ad_unit_id", zzfkt.zzb());
        zza2.zzb("pid", zzfkt.zzc());
        zza2.zzb("pv", str);
        zza2.zzj();
    }

    public final void zzl(long j, zzfkt zzfkt, int i, int i2, String str) {
        zzq("poll_ad", "ppac_ts", j, i, i2, (String) null, zzfkt, str);
    }

    public final void zzm(long j, int i, int i2, String str, zzfkt zzfkt, String str2) {
        zzdsi zza2 = this.zza.zza();
        zza2.zzb("ppla_ts", Long.toString(j));
        zza2.zzb("app", this.zzb);
        zza2.zzb("ad_format", zzfkt.zza());
        zza2.zzb("ad_unit_id", zzfkt.zzb());
        zza2.zzb("pid", zzfkt.zzc());
        zza2.zzb("max_ads", Integer.toString(i));
        zza2.zzb("cache_size", Integer.toString(i2));
        zza2.zzb("action", "poll_ad");
        if (str != null) {
            zza2.zzb("gqi", str);
        }
        zza2.zzb("pv", str2);
        zza2.zzj();
    }

    public final void zzn(long j, int i, int i2, String str, zzfkt zzfkt, String str2) {
        zzq("poll_ad", "psvroc_ts", j, i, i2, str, zzfkt, str2);
    }

    public final void zzo(Map map, long j, String str) {
        zzdsi zza2 = this.zza.zza();
        zza2.zzb("action", "start_preload");
        zza2.zzb("sp_ts", Long.toString(j));
        zza2.zzb("app", this.zzb);
        zza2.zzb("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String valueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zza2.zzb(valueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zza2.zzj();
    }

    public final void zzp(int i, long j, zzfkt zzfkt, String str) {
        zzdsi zza2 = this.zza.zza();
        zza2.zzb("action", "start_preload");
        zza2.zzb("sp_ts", Long.toString(j));
        zza2.zzb("app", this.zzb);
        zza2.zzb("ad_format", zzfkt.zza());
        zza2.zzb("ad_unit_id", zzfkt.zzb());
        zza2.zzb("pid", zzfkt.zzc());
        zza2.zzb("max_ads", Integer.toString(i));
        zza2.zzb("pv", str);
        zza2.zzj();
    }
}
