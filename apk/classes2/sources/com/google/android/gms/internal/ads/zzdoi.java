package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdoi extends VideoController.VideoLifecycleCallbacks {
    private final zzdit zza;

    public zzdoi(zzdit zzdit) {
        this.zza = zzdit;
    }

    private static zzeg zza(zzdit zzdit) {
        zzed zzj = zzdit.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void onVideoEnd() {
        zzeg zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zze();
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzk("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoPause() {
        zzeg zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zzg();
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzk("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoStart() {
        zzeg zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zzi();
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzk("Unable to call onVideoEnd()", e);
            }
        }
    }
}
