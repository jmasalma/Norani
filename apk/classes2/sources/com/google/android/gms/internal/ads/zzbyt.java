package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbyt {
    private final Map zza = new HashMap();
    /* access modifiers changed from: private */
    public final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbyf zzd;

    zzbyt(Context context, zzbyf zzbyf) {
        this.zzc = context;
        this.zzd = zzbyf;
    }

    public static /* synthetic */ void zzb(zzbyt zzbyt, Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            zzbyt.zzd.zzd();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzc(String str) {
        SharedPreferences sharedPreferences;
        Map map = this.zza;
        if (!map.containsKey(str)) {
            if (Objects.equals(str, "__default__")) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
            } else {
                sharedPreferences = this.zzc.getSharedPreferences(str, 0);
            }
            zzbys zzbys = new zzbys(this, str);
            map.put(str, zzbys);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzbys);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd(zzbyr zzbyr) {
        this.zzb.add(zzbyr);
    }
}
