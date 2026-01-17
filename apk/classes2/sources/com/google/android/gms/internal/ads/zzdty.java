package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdty extends zzbxb {
    final /* synthetic */ zzdua zza;

    zzdty(zzdua zzdua) {
        Objects.requireNonNull(zzdua);
        this.zza = zzdua;
    }

    public final void zze(int i) throws RemoteException {
        zzdua zzdua = this.zza;
        zzdua.zzb.zzm(zzdua.zza, i);
    }

    public final void zzf(zze zze) throws RemoteException {
        zzdua zzdua = this.zza;
        zzdua.zzb.zzm(zzdua.zza, zze.zza);
    }

    public final void zzg() throws RemoteException {
        zzdua zzdua = this.zza;
        zzdua.zzb.zzp(zzdua.zza);
    }
}
