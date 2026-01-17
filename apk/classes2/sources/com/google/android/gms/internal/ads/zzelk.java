package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzelk implements zzcwb {
    public final /* synthetic */ zzeky zza;
    public final /* synthetic */ zzbmy zzb;

    public /* synthetic */ zzelk(zzeky zzeky, zzbmy zzbmy) {
        this.zza = zzeky;
        this.zzb = zzbmy;
    }

    public final void zzdD(zze zze) {
        this.zza.zzdD(zze);
        zzbmy zzbmy = this.zzb;
        if (zzbmy != null) {
            try {
                zzbmy.zzf(zze);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        if (zzbmy != null) {
            try {
                zzbmy.zze(zze.zza);
            } catch (RemoteException e2) {
                zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
