package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbxf implements RewardItem {
    private final zzbws zza;

    public zzbxf(zzbws zzbws) {
        this.zza = zzbws;
    }

    public final int getAmount() {
        zzbws zzbws = this.zza;
        if (zzbws != null) {
            try {
                return zzbws.zze();
            } catch (RemoteException e) {
                zzo.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    public final String getType() {
        zzbws zzbws = this.zza;
        if (zzbws != null) {
            try {
                return zzbws.zzf();
            } catch (RemoteException e) {
                zzo.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
