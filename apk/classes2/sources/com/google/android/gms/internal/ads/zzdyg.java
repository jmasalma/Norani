package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdyg extends zzbvh {
    final /* synthetic */ zzdyi zza;

    protected zzdyg(zzdyi zzdyi) {
        Objects.requireNonNull(zzdyi);
        this.zza = zzdyi;
    }

    public final void zze(zzbb zzbb) {
        this.zza.zza.zzd(zzbb.zza());
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdyi zzdyi = this.zza;
        zzdyi.zza.zzc(new zzdyy(autoCloseInputStream, zzdyi.zze));
    }

    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvq zzbvq) {
        this.zza.zza.zzc(new zzdyy(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvq));
    }
}
