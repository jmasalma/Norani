package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzevv implements zzeuc {
    private final JSONObject zza;

    zzevv(Context context) {
        this.zza = zzbvm.zzc(context, VersionInfoParcel.forPackage());
    }

    public static /* synthetic */ void zzc(zzevv zzevv, JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", zzevv.zza);
        } catch (JSONException unused) {
            zze.zza("Failed putting version constants.");
        }
    }

    public final int zza() {
        return 46;
    }

    public final ListenableFuture zzb() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzms)).booleanValue()) {
            return zzgdn.zzh(new zzevt());
        }
        return zzgdn.zzh(new zzevu(this));
    }
}
