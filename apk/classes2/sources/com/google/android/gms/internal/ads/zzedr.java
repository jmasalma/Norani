package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzedr {
    private final List zza = Collections.synchronizedList(new ArrayList());
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final String zzc;
    private zzfcd zzd = null;
    private zzfca zze = null;
    private zzv zzf = null;

    public zzedr(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfca zzfca) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdR)).booleanValue()) {
            return zzfca.zzap;
        }
        return zzfca.zzw;
    }

    private final synchronized void zzk(zzfca zzfca, int i) {
        Map map = this.zzb;
        String zzj = zzj(zzfca);
        if (!map.containsKey(zzj)) {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = zzfca.zzv;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, jSONObject.getString(next));
                } catch (JSONException unused) {
                }
            }
            zzv zzv = new zzv(zzfca.zzE, 0, (zze) null, bundle, zzfca.zzF, zzfca.zzG, zzfca.zzH, zzfca.zzI);
            try {
                this.zza.add(i, zzv);
            } catch (IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
            }
            this.zzb.put(zzj, zzv);
        }
    }

    private final void zzl(zzfca zzfca, long j, zze zze2, boolean z) {
        Map map = this.zzb;
        String zzj = zzj(zzfca);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzfca;
            }
            zzv zzv = (zzv) map.get(zzj);
            zzv.zzb = j;
            zzv.zzc = zze2;
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzgX)).booleanValue() && z) {
                this.zzf = zzv;
            }
        }
    }

    public final zzv zza() {
        return this.zzf;
    }

    public final zzcvr zzb() {
        return new zzcvr(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfca zzfca) {
        zzk(zzfca, this.zza.size());
    }

    public final void zze(zzfca zzfca) {
        Map map = this.zzb;
        Object obj = map.get(zzj(zzfca));
        List list = this.zza;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.zzf);
        }
        if (indexOf >= 0 && indexOf < map.size()) {
            this.zzf = (zzv) list.get(indexOf);
            while (true) {
                indexOf++;
                if (indexOf < list.size()) {
                    zzv zzv = (zzv) list.get(indexOf);
                    zzv.zzb = 0;
                    zzv.zzc = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzf(zzfca zzfca, long j, zze zze2) {
        zzl(zzfca, j, zze2, false);
    }

    public final void zzg(zzfca zzfca, long j, zze zze2) {
        zzl(zzfca, j, (zze) null, true);
    }

    public final synchronized void zzh(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            List list2 = this.zza;
            int indexOf = list2.indexOf((zzv) map.get(str));
            try {
                list2.remove(indexOf);
            } catch (IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfca) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzi(zzfcd zzfcd) {
        this.zzd = zzfcd;
    }
}
