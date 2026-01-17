package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdjs implements zzbgd {
    final /* synthetic */ zzdkr zza;
    final /* synthetic */ ViewGroup zzb;

    zzdjs(zzdkr zzdkr, ViewGroup viewGroup) {
        this.zza = zzdkr;
        this.zzb = viewGroup;
    }

    public final JSONObject zza() {
        return this.zza.zzo();
    }

    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    public final void zzc() {
        zzfyq zzfyq = zzdjp.zza;
        zzdkr zzdkr = this.zza;
        Map zzm = zzdkr.zzm();
        if (zzm != null) {
            int size = zzfyq.size();
            int i = 0;
            while (i < size) {
                Object obj = zzm.get((String) zzfyq.get(i));
                i++;
                if (obj != null) {
                    zzdkr.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch((View) null, motionEvent);
    }
}
