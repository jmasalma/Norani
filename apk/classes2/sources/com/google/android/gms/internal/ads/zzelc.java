package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzelc implements zza, zzded {
    private zzbh zza;

    public final synchronized void onAdClicked() {
        zzbh zzbh = this.zza;
        if (zzbh != null) {
            try {
                zzbh.zzb();
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(zzbh zzbh) {
        this.zza = zzbh;
    }

    public final synchronized void zzdH() {
    }

    public final synchronized void zzdf() {
        zzbh zzbh = this.zza;
        if (zzbh != null) {
            try {
                zzbh.zzb();
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
