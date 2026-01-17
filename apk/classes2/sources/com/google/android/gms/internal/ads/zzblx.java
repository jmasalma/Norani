package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzblx extends zzblu {
    final /* synthetic */ zzcak zza;

    zzblx(zzbly zzbly, zzcak zzcak) {
        this.zza = zzcak;
        Objects.requireNonNull(zzbly);
    }

    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}
