package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdjz implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdny zzd;
    private final Clock zze;
    private zzbig zzf;
    private zzbkf zzg;

    public zzdjz(zzdny zzdny, Clock clock) {
        this.zzd = zzdny;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.zzc = null;
        }
    }

    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.zza == null || this.zzb == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.zza);
                hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzd.zzj("sendMessageToNativeJs", hashMap);
            }
            zzd();
        }
    }

    public final zzbig zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf != null && this.zzb != null) {
            zzd();
            try {
                this.zzf.zze();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzc(zzbig zzbig) {
        this.zzf = zzbig;
        zzbkf zzbkf = this.zzg;
        if (zzbkf != null) {
            this.zzd.zzn("/unconfirmedClick", zzbkf);
        }
        zzdjy zzdjy = new zzdjy(this, zzbig);
        this.zzg = zzdjy;
        this.zzd.zzl("/unconfirmedClick", zzdjy);
    }
}
