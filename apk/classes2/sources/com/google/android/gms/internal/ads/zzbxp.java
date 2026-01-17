package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.client.zzfu;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbxp extends RewardedInterstitialAd {
    private final String zza;
    private final zzbwv zzb;
    private final Context zzc;
    private final zzbxn zzd;
    private FullScreenContentCallback zze;
    private OnAdMetadataChangedListener zzf;
    private OnPaidEventListener zzg;
    private final long zzh = System.currentTimeMillis();
    private final AtomicLong zzi = new AtomicLong();

    public zzbxp(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = zzbb.zza().zzs(context, str, new zzbpm());
        this.zzd = new zzbxn();
    }

    public final Bundle getAdMetadata() {
        try {
            zzbwv zzbwv = this.zzb;
            if (zzbwv != null) {
                return zzbwv.zzc();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        return this.zza;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zze;
    }

    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    public final long getPlacementId() {
        AtomicLong atomicLong = this.zzi;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                zzbwv zzbwv = this.zzb;
                if (zzbwv != null) {
                    long zzb2 = zzbwv.zzb();
                    AtomicLong atomicLong2 = this.zzi;
                    atomicLong2.set(zzb2);
                    long j = atomicLong2.get();
                    return j;
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public final ResponseInfo getResponseInfo() {
        zzea zzea = null;
        try {
            zzbwv zzbwv = this.zzb;
            if (zzbwv != null) {
                zzea = zzbwv.zzd();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzea);
    }

    public final RewardItem getRewardItem() {
        try {
            zzbwv zzbwv = this.zzb;
            zzbws zze2 = zzbwv != null ? zzbwv.zze() : null;
            if (zze2 != null) {
                return new zzbxf(zze2);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zze = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    public final void setImmersiveMode(boolean z) {
        try {
            zzbwv zzbwv = this.zzb;
            if (zzbwv != null) {
                zzbwv.zzj(z);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzf = onAdMetadataChangedListener;
        try {
            zzbwv zzbwv = this.zzb;
            if (zzbwv != null) {
                zzbwv.zzk(new zzft(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzg = onPaidEventListener;
        try {
            zzbwv zzbwv = this.zzb;
            if (zzbwv != null) {
                zzbwv.zzl(new zzfu(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setPlacementId(long j) {
        try {
            zzbwv zzbwv = this.zzb;
            if (zzbwv != null) {
                zzbwv.zzm(j);
                this.zzi.set(j);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            zzbwv zzbwv = this.zzb;
            if (zzbwv != null) {
                zzbwv.zzo(new zzbxj(serverSideVerificationOptions));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzbxn zzbxn = this.zzd;
        zzbxn.zzc(onUserEarnedRewardListener);
        try {
            zzbwv zzbwv = this.zzb;
            if (zzbwv != null) {
                zzbwv.zzn(zzbxn);
                zzbwv.zzp(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(zzek zzek, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            zzbwv zzbwv = this.zzb;
            if (zzbwv != null) {
                zzek.zzp(this.zzh);
                zzbwv.zzi(zzq.zza.zza(this.zzc, zzek), new zzbxo(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
