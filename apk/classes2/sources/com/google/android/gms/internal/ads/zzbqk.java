package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzbqk implements InitializationCompleteCallback {
    final /* synthetic */ zzbmh zza;

    zzbqk(zzbqr zzbqr, zzbmh zzbmh) {
        this.zza = zzbmh;
        Objects.requireNonNull(zzbqr);
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }
}
