package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdtz extends zzbwx {
    final /* synthetic */ zzdua zza;

    zzdtz(zzdua zzdua) {
        Objects.requireNonNull(zzdua);
        this.zza = zzdua;
    }

    public final void zze() throws RemoteException {
        zzdua zzdua = this.zza;
        zzdua.zzb.zzj(zzdua.zza);
    }

    public final void zzf() throws RemoteException {
        zzdua zzdua = this.zza;
        zzdua.zzb.zzo(zzdua.zza);
    }

    public final void zzg() throws RemoteException {
        zzdua zzdua = this.zza;
        zzdua.zzb.zzk(zzdua.zza);
    }

    public final void zzh(int i) throws RemoteException {
        zzdua zzdua = this.zza;
        zzdua.zzb.zzn(zzdua.zza, i);
    }

    public final void zzi(zze zze) throws RemoteException {
        zzdua zzdua = this.zza;
        zzdua.zzb.zzn(zzdua.zza, zze.zza);
    }

    public final void zzj() throws RemoteException {
        zzdua zzdua = this.zza;
        zzdua.zzb.zzr(zzdua.zza);
    }

    public final void zzk(zzbws zzbws) throws RemoteException {
        zzdua zzdua = this.zza;
        zzdua.zzb.zzl(zzdua.zza, zzbws);
    }
}
