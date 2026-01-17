package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdyh extends zzbvh {
    private final zzcak zza;
    private final zzbvq zzb;

    zzdyh(zzcak zzcak, zzbvq zzbvq) {
        this.zza = zzcak;
        this.zzb = zzbvq;
    }

    public final void zze(zzbb zzbb) {
        this.zza.zzd(zzbb.zza());
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzdyy(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvq zzbvq) {
        this.zza.zzc(new zzdyy(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvq));
    }
}
