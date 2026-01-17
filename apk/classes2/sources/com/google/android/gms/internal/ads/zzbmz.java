package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.client.zzfu;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbmz extends AdManagerInterstitialAd {
    private final Context zza;
    private final zzq zzb;
    private final zzbx zzc;
    private final AtomicReference zzd;
    private final zzbpm zze;
    private final long zzf;
    private AppEventListener zzg;
    private FullScreenContentCallback zzh;
    private OnPaidEventListener zzi;
    private final AtomicLong zzj;

    public zzbmz(Context context, zzbx zzbx) {
        this.zze = new zzbpm();
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference();
        this.zzb = zzq.zza;
        this.zzc = zzbx;
    }

    public final String getAdUnitId() {
        String str;
        String str2;
        AtomicReference atomicReference = this.zzd;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.zzc.zzs();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
                str = null;
            }
            if (str == null) {
                this.zzd.set("");
            } else {
                this.zzd.set(str);
            }
            str2 = (String) this.zzd.get();
        }
        return str2;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzg;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzh;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzi;
    }

    public final long getPlacementId() {
        AtomicLong atomicLong = this.zzj;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                zzbx zzbx = this.zzc;
                if (zzbx != null) {
                    long zzc2 = zzbx.zzc();
                    AtomicLong atomicLong2 = this.zzj;
                    atomicLong2.set(zzc2);
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
            zzbx zzbx = this.zzc;
            if (zzbx != null) {
                zzea = zzbx.zzl();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzea);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzg = appEventListener;
            zzbx zzbx = this.zzc;
            if (zzbx != null) {
                zzbx.zzH(appEventListener != null ? new zzazr(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.zzh = fullScreenContentCallback;
            zzbx zzbx = this.zzc;
            if (zzbx != null) {
                zzbx.zzK(new zzbe(fullScreenContentCallback));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setImmersiveMode(boolean z) {
        try {
            zzbx zzbx = this.zzc;
            if (zzbx != null) {
                zzbx.zzM(z);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzi = onPaidEventListener;
            zzbx zzbx = this.zzc;
            if (zzbx != null) {
                zzbx.zzQ(new zzfu(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setPlacementId(long j) {
        try {
            zzbx zzbx = this.zzc;
            if (zzbx != null) {
                zzbx.zzR(j);
                this.zzj.set(j);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity) {
        if (activity == null) {
            zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbx zzbx = this.zzc;
            if (zzbx != null) {
                zzbx.zzY(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(zzek zzek, AdLoadCallback adLoadCallback) {
        try {
            zzbx zzbx = this.zzc;
            if (zzbx != null) {
                zzek.zzp(this.zzf);
                zzbx.zzz(this.zzb.zza(this.zza, zzek), new zzh(adLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", "com.google.android.gms.ads", (AdError) null, (ResponseInfo) null));
        }
    }

    public zzbmz(Context context, String str) {
        zzbpm zzbpm = new zzbpm();
        this.zze = zzbpm;
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = zzq.zza;
        this.zzc = zzbb.zza().zzf(context, new zzr(), str, zzbpm);
    }

    public zzbmz(Context context, String str, zzbx zzbx) {
        zzq zzq = zzq.zza;
        this.zze = new zzbpm();
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = zzq;
        this.zzc = zzbx;
    }
}
