package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeim implements zzedo {
    private final zzejq zza;
    private final zzdpz zzb;

    zzeim(zzejq zzejq, zzdpz zzdpz) {
        this.zza = zzejq;
        this.zzb = zzdpz;
    }

    public final zzedp zza(String str, JSONObject jSONObject) throws zzfdd {
        zzbrp zzbrp;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzbQ)).booleanValue()) {
            try {
                zzbrp = this.zzb.zzb(str);
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzh("Coundn't create RTB adapter: ", e);
                zzbrp = null;
            }
        } else {
            zzbrp = this.zza.zza(str);
        }
        if (zzbrp == null) {
            return null;
        }
        return new zzedp(zzbrp, new zzefd(), str);
    }
}
