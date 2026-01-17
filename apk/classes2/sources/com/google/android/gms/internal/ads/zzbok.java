package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbok implements zzbnc, zzboj {
    private final zzboj zza;
    private final HashSet zzb = new HashSet();

    public zzbok(zzboj zzboj) {
        this.zza = zzboj;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbnb.zzc(this, str, str2);
    }

    public final void zzc() {
        HashSet hashSet = this.zzb;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbkf) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbkf) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbnb.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbnb.zzb(this, str, jSONObject);
    }

    public final /* synthetic */ void zzp(String str, JSONObject jSONObject) {
        zzbnb.zzd(this, str, jSONObject);
    }

    public final void zzq(String str, zzbkf zzbkf) {
        this.zza.zzq(str, zzbkf);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbkf));
    }

    public final void zzr(String str, zzbkf zzbkf) {
        this.zza.zzr(str, zzbkf);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbkf));
    }
}
