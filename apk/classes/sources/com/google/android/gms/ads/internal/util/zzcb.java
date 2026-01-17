package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbde;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcb {
    private final Map zza = new HashMap();
    /* access modifiers changed from: private */
    public final List zzb = new ArrayList();
    private final Context zzc;

    zzcb(Context context) {
        this.zzc = context;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzb(String str) {
        SharedPreferences sharedPreferences;
        Map map = this.zza;
        if (!map.containsKey(str)) {
            if (Objects.equals(str, "__default__")) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
            } else {
                sharedPreferences = this.zzc.getSharedPreferences(str, 0);
            }
            zzca zzca = new zzca(this, str);
            map.put(str, zzca);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzca);
        }
    }

    public final void zzc() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkQ)).booleanValue()) {
            zzv.zzr();
            Map zzw = zzs.zzw((String) zzbd.zzc().zzb(zzbde.zzkV));
            for (String zzb2 : zzw.keySet()) {
                zzb(zzb2);
            }
            zzd(new zzbz(zzw));
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd(zzbz zzbz) {
        this.zzb.add(zzbz);
    }
}
