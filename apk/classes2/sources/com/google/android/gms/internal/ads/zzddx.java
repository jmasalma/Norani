package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzddx extends zzdbt implements zzazd {
    private final Map zzb = new WeakHashMap(1);
    private final Context zzc;
    private final zzfca zzd;

    public zzddx(Context context, Set set, zzfca zzfca) {
        super(set);
        this.zzc = context;
        this.zzd = zzfca;
    }

    public final synchronized void zza(View view) {
        Map map = this.zzb;
        zzaze zzaze = (zzaze) map.get(view);
        if (zzaze == null) {
            zzaze zzaze2 = new zzaze(this.zzc, view);
            zzaze2.zzd(this);
            map.put(view, zzaze2);
            zzaze = zzaze2;
        }
        if (this.zzd.zzX) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzbB)).booleanValue()) {
                zzaze.zzg(((Long) zzbd.zzc().zzb(zzbde.zzbA)).longValue());
                return;
            }
        }
        zzaze.zzf();
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzaze) map.get(view)).zze(this);
            map.remove(view);
        }
    }

    public final synchronized void zzdr(zzazc zzazc) {
        zzq(new zzddw(zzazc));
    }
}
