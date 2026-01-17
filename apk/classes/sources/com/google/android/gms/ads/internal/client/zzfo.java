package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbpq;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzfo extends zzda {
    private zzbmk zza;

    public static /* synthetic */ void zzb(zzfo zzfo) {
        zzbmk zzbmk = zzfo.zza;
        if (zzbmk != null) {
            try {
                zzbmk.zzb(Collections.emptyList());
            } catch (RemoteException e) {
                zzo.zzk("Could not notify onComplete event.", e);
            }
        }
    }

    public final float zze() throws RemoteException {
        return 1.0f;
    }

    public final String zzf() {
        return "";
    }

    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    public final void zzh(String str) throws RemoteException {
    }

    public final void zzi() {
    }

    public final void zzj(boolean z) throws RemoteException {
    }

    public final void zzk() throws RemoteException {
        zzo.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzf.zza.post(new zzfn(this));
    }

    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzm(zzdn zzdn) {
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    public final void zzo(zzbpq zzbpq) throws RemoteException {
    }

    public final void zzp(boolean z) throws RemoteException {
    }

    public final void zzq(float f) throws RemoteException {
    }

    public final void zzr(String str) throws RemoteException {
    }

    public final void zzs(zzbmk zzbmk) throws RemoteException {
        this.zza = zzbmk;
    }

    public final void zzt(String str) {
    }

    public final void zzu(zzfx zzfx) throws RemoteException {
    }

    public final boolean zzv() throws RemoteException {
        return false;
    }
}
