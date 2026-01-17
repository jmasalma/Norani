package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbis extends zzbhz {
    /* access modifiers changed from: private */
    public final OnAdManagerAdViewLoadedListener zza;

    public zzbis(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    public final void zze(zzbx zzbx, IObjectWrapper iObjectWrapper) {
        if (zzbx != null && iObjectWrapper != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzbx.zzj() instanceof zzg) {
                    zzg zzj = zzbx.zzj();
                    adManagerAdView.setAdListener(zzj != null ? zzj.zzb() : null);
                }
            } catch (RemoteException e) {
                zzo.zzh("", e);
            }
            try {
                if (zzbx.zzk() instanceof zzazr) {
                    zzazr zzk = zzbx.zzk();
                    if (zzk != null) {
                        appEventListener = zzk.zzb();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e2) {
                zzo.zzh("", e2);
            }
            zzf.zza.post(new zzbir(this, adManagerAdView, zzbx));
        }
    }
}
