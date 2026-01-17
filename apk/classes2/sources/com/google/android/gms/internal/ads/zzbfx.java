package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbfx {
    private final Context zza;

    public zzbfx(Context context) {
        this.zza = context;
    }

    public final void zza(zzbuu zzbuu) {
        try {
            ((zzbfy) zzs.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzbfw())).zze(zzbuu);
        } catch (zzr e) {
            zzo.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e.getMessage())));
        } catch (RemoteException e2) {
            zzo.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
