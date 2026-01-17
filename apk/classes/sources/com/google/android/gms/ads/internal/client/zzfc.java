package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.zzb;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbxe;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzfc extends zzb {
    public zzfc(Context context) {
        super(context, AdFormat.REWARDED);
    }

    public final RewardedAd zza(String str) {
        zzbwv zzbwv;
        try {
            zzbwv = this.zza.zzl(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            zzbwv = null;
        }
        if (zzbwv == null) {
            return null;
        }
        return new zzbxe(zzc(), zzbwv);
    }
}
