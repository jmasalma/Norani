package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzfi extends zzbp {
    final /* synthetic */ zzfk zza;

    /* synthetic */ zzfi(zzfk zzfk, zzfj zzfj) {
        Objects.requireNonNull(zzfk);
        this.zza = zzfk;
    }

    public final String zze() throws RemoteException {
        return null;
    }

    public final String zzf() throws RemoteException {
        return null;
    }

    public final void zzg(zzm zzm) throws RemoteException {
        zzh(zzm, 1);
    }

    public final void zzh(zzm zzm, int i) throws RemoteException {
        zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzf.zza.post(new zzfh(this));
    }

    public final boolean zzi() throws RemoteException {
        return false;
    }
}
