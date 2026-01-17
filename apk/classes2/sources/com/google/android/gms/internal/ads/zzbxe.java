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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbxe extends RewardedAd {
    private final AtomicReference zza;
    private final zzbwv zzb;
    private final Context zzc;
    private final zzbxn zzd;
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;
    private final long zzh;
    private final AtomicLong zzi;

    public zzbxe(Context context, zzbwv zzbwv) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference();
        this.zzb = zzbwv;
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
        String str;
        String str2;
        AtomicReference atomicReference = this.zza;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.zzb.zzf();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
                str = null;
            }
            if (str == null) {
                this.zza.set("");
            } else {
                this.zza.set(str);
            }
            str2 = (String) this.zza.get();
        }
        return str2;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.zzi;
        long j2 = 0;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                zzbwv zzbwv = this.zzb;
                if (zzbwv != null) {
                    j2 = zzbwv.zzb();
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
            AtomicLong atomicLong2 = this.zzi;
            atomicLong2.set(j2);
            j = atomicLong2.get();
        }
        return j;
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
            if (zze2 == null) {
                return RewardItem.DEFAULT_REWARD;
            }
            return new zzbxf(zze2);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
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
        try {
            this.zze = onAdMetadataChangedListener;
            zzbwv zzbwv = this.zzb;
            if (zzbwv != null) {
                zzbwv.zzk(new zzft(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
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
        if (serverSideVerificationOptions != null) {
            try {
                zzbwv zzbwv = this.zzb;
                if (zzbwv != null) {
                    zzbwv.zzo(new zzbxj(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzbxn zzbxn = this.zzd;
        zzbxn.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
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

    public final void zza(zzek zzek, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzbwv zzbwv = this.zzb;
            if (zzbwv != null) {
                zzek.zzp(this.zzh);
                zzbwv.zzh(zzq.zza.zza(this.zzc, zzek), new zzbxi(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzbxe(Context context, String str) {
        this(context, str, zzbb.zza().zzs(context, str, new zzbpm()));
    }

    public zzbxe(Context context, String str, zzbwv zzbwv) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference(str);
        this.zzb = zzbwv;
        this.zzd = new zzbxn();
    }
}
