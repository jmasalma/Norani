package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.zzb;
import com.google.android.gms.internal.ads.zzbas;
import com.google.android.gms.internal.ads.zzbaw;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzeo extends zzb {
    public zzeo(Context context) {
        super(context, AdFormat.APP_OPEN_AD);
    }

    public final AppOpenAd zza(String str) {
        zzbaw zzbaw;
        try {
            zzbaw = this.zza.zzg(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            zzbaw = null;
        }
        if (zzbaw == null) {
            return null;
        }
        return new zzbas(zzbaw);
    }
}
