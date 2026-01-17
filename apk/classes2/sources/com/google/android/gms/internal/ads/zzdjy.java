package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdjy implements zzbkf {
    public final /* synthetic */ zzdjz zza;
    public final /* synthetic */ zzbig zzb;

    public /* synthetic */ zzdjy(zzdjz zzdjz, zzbig zzbig) {
        this.zza = zzdjz;
        this.zzb = zzbig;
    }

    public final void zza(Object obj, Map map) {
        zzdjz zzdjz = this.zza;
        try {
            zzdjz.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            int i = zze.zza;
            zzo.zzg("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzbig zzbig = this.zzb;
        zzdjz.zza = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (zzbig == null) {
            int i2 = zze.zza;
            zzo.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzbig.zzf(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
