package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzbrx implements MediationAdLoadCallback {
    final /* synthetic */ zzbrj zza;
    final /* synthetic */ zzbpw zzb;

    zzbrx(zzbsc zzbsc, zzbrj zzbrj, zzbpw zzbpw) {
        this.zza = zzbrj;
        this.zzb = zzbpw;
        Objects.requireNonNull(zzbsc);
    }

    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
        if (nativeAdMapper == null) {
            zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzo.zzh("", e);
                return null;
            }
        } else {
            try {
                this.zza.zzg(new zzbqv(nativeAdMapper));
            } catch (RemoteException e2) {
                zzo.zzh("", e2);
            }
            return new zzbsd(this.zzb);
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, "undefined"));
    }
}
