package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdzx implements zzgdj {
    final /* synthetic */ zzbvq zza;
    final /* synthetic */ zzbvi zzb;

    zzdzx(zzeab zzeab, zzbvq zzbvq, zzbvi zzbvi) {
        this.zza = zzbvq;
        this.zzb = zzbvi;
        Objects.requireNonNull(zzeab);
    }

    public final void zza(Throwable th) {
        try {
            this.zzb.zze(zzbb.zzb(th));
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue()) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzcr)).booleanValue() && (bundle = this.zza.zzm) != null) {
                    bundle.putLong(zzdrr.BINDER_CALL_START.zza(), zzv.zzD().currentTimeMillis());
                }
                this.zzb.zzg(parcelFileDescriptor, this.zza);
                return;
            }
            this.zzb.zzf(parcelFileDescriptor);
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }
}
