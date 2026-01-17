package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdnf implements zzbgd {
    final /* synthetic */ String zza = "_videoMediaView";
    final /* synthetic */ zzdng zzb;

    zzdnf(zzdng zzdng, String str) {
        Objects.requireNonNull(zzdng);
        this.zzb = zzdng;
    }

    public final JSONObject zza() {
        return null;
    }

    public final JSONObject zzb() {
        return null;
    }

    public final void zzc() {
        zzdng zzdng = this.zzb;
        if (zzdng.zzd != null) {
            zzdng.zzd.zzG(this.zza);
        }
    }

    public final void zzd(MotionEvent motionEvent) {
    }
}
