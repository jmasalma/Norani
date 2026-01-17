package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdug implements Runnable {
    public final /* synthetic */ zzdun zza;
    public final /* synthetic */ zzbmk zzb;

    public /* synthetic */ zzdug(zzdun zzdun, zzbmk zzbmk) {
        this.zza = zzdun;
        this.zzb = zzbmk;
    }

    public final void run() {
        zzdun zzdun = this.zza;
        try {
            this.zzb.zzb(zzdun.zzg());
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzh("", e);
        }
    }
}
