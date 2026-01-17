package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdsm implements zzfhb {
    private final Map zza = new HashMap();
    private final zzdsd zzb;
    private final Clock zzc;
    private final Map zzd = new HashMap();

    public zzdsm(zzdsd zzdsd, Set set, Clock clock) {
        this.zzb = zzdsd;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdsl zzdsl = (zzdsl) it.next();
            this.zzd.put(zzdsl.zzc, zzdsl);
        }
        this.zzc = clock;
    }

    private final void zze(zzfgu zzfgu, boolean z) {
        String str;
        zzdsl zzdsl = (zzdsl) this.zzd.get(zzfgu);
        if (zzdsl != null) {
            if (true != z) {
                str = "f.";
            } else {
                str = "s.";
            }
            Map map = this.zza;
            zzfgu zzb2 = zzdsl.zzb;
            if (map.containsKey(zzb2)) {
                long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzb2)).longValue();
                Map zzb3 = this.zzb.zzb();
                String zzc2 = zzdsl.zza;
                zzb3.put("label.".concat(zzc2), str + elapsedRealtime);
            }
        }
    }

    public final void zzd(zzfgu zzfgu, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfgu)) {
            zzdsd zzdsd = this.zzb;
            String valueOf = String.valueOf(str);
            zzdsd.zzb().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) map.get(zzfgu)).longValue()))));
        }
        if (this.zzd.containsKey(zzfgu)) {
            zze(zzfgu, true);
        }
    }

    public final void zzdE(zzfgu zzfgu, String str) {
    }

    public final void zzdF(zzfgu zzfgu, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfgu)) {
            zzdsd zzdsd = this.zzb;
            String valueOf = String.valueOf(str);
            zzdsd.zzb().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) map.get(zzfgu)).longValue()))));
        }
        if (this.zzd.containsKey(zzfgu)) {
            zze(zzfgu, false);
        }
    }

    public final void zzdG(zzfgu zzfgu, String str) {
        this.zza.put(zzfgu, Long.valueOf(this.zzc.elapsedRealtime()));
    }
}
