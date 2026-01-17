package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzed;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeet implements zzcqy {
    public final /* synthetic */ zzedp zza;

    public /* synthetic */ zzeet(zzedp zzedp) {
        this.zza = zzedp;
    }

    public final zzed zza() {
        try {
            return ((zzbrp) this.zza.zzb).zze();
        } catch (RemoteException e) {
            throw new zzfdd(e);
        }
    }
}
