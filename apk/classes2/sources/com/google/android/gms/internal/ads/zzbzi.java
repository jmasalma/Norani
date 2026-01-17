package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbzi implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcak zzb;

    zzbzi(zzbzj zzbzj, Context context, zzcak zzcak) {
        this.zza = context;
        this.zzb = zzcak;
        Objects.requireNonNull(zzbzj);
    }

    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzb.zzd(e);
            zzo.zzh("Exception while getting advertising Id info", e);
        }
    }
}
