package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzewy implements zzeub {
    private final Map zza;

    public zzewy(Map map) {
        this.zza = map;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", zzbb.zzb().zzo(this.zza));
        } catch (JSONException e) {
            zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
