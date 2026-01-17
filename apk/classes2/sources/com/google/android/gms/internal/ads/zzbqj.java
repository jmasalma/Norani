package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzbqj implements MediationAdLoadCallback {
    final /* synthetic */ zzbpw zza;
    final /* synthetic */ Adapter zzb;
    final /* synthetic */ zzbqr zzc;

    zzbqj(zzbqr zzbqr, zzbpw zzbpw, Adapter adapter) {
        this.zza = zzbpw;
        this.zzb = adapter;
        Objects.requireNonNull(zzbqr);
        this.zzc = zzbqr;
    }

    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            zzo.zze(canonicalName + "failed to load mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            zzbpw zzbpw = this.zza;
            zzbpw.zzh(adError.zza());
            zzbpw.zzi(adError.getCode(), adError.getMessage());
            zzbpw.zzg(adError.getCode());
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzc.zzj = (MediationInterscrollerAd) obj;
            this.zza.zzo();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        return new zzbqh(this.zza);
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, "undefined"));
    }
}
