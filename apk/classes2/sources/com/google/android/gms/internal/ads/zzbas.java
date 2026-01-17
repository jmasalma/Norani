package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzfu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbas extends AppOpenAd {
    FullScreenContentCallback zza;
    private final zzbaw zzb;
    private final AtomicReference zzc;
    private final zzbat zzd = new zzbat();
    private OnPaidEventListener zze;
    private final AtomicLong zzf = new AtomicLong();

    public zzbas(zzbaw zzbaw) {
        this.zzb = zzbaw;
        this.zzc = new AtomicReference();
    }

    public final String getAdUnitId() {
        String str;
        String str2;
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.zzb.zzh();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
                str = null;
            }
            if (str == null) {
                this.zzc.set("");
            } else {
                this.zzc.set(str);
            }
            str2 = (String) this.zzc.get();
        }
        return str2;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                long zze2 = this.zzb.zze();
                AtomicLong atomicLong2 = this.zzf;
                atomicLong2.set(zze2);
                j = atomicLong2.get();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public final ResponseInfo getResponseInfo() {
        zzea zzea;
        try {
            zzea = this.zzb.zzg();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            zzea = null;
        }
        return ResponseInfo.zzb(zzea);
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
        this.zzd.zzg(fullScreenContentCallback);
    }

    public final void setImmersiveMode(boolean z) {
        try {
            this.zzb.zzi(z);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zze = onPaidEventListener;
        try {
            this.zzb.zzj(new zzfu(onPaidEventListener));
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setPlacementId(long j) {
        try {
            this.zzb.zzk(j);
            this.zzf.set(j);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity) {
        try {
            this.zzb.zzl(ObjectWrapper.wrap(activity), this.zzd);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzbas(zzbaw zzbaw, String str) {
        this.zzb = zzbaw;
        this.zzc = new AtomicReference(str);
    }
}
