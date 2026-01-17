package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzbqp implements MediationAdLoadCallback {
    final /* synthetic */ zzbpw zza;
    final /* synthetic */ zzbqr zzb;

    zzbqp(zzbqr zzbqr, zzbpw zzbpw) {
        this.zza = zzbpw;
        Objects.requireNonNull(zzbqr);
        this.zzb = zzbqr;
    }

    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
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
            this.zzb.zzi = (MediationRewardedAd) obj;
            this.zza.zzo();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        return new zzbxl(this.zza);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
            zzo.zze(canonicalName + "failed to loaded mediation ad: " + str);
            zzbpw zzbpw = this.zza;
            zzbpw.zzi(0, str);
            zzbpw.zzg(0);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }
}
