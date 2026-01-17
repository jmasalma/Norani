package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.preload.zzb;
import com.google.android.gms.internal.ads.zzbmz;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzep extends zzb {
    public zzep(Context context) {
        super(context, AdFormat.INTERSTITIAL);
    }

    public final InterstitialAd zza(String str) {
        zzbx zzbx;
        try {
            zzbx = this.zza.zzi(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            zzbx = null;
        }
        if (zzbx == null) {
            return null;
        }
        return new zzbmz(zzc(), zzbx);
    }
}
