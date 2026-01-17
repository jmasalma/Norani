package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbqu extends zzbpv {
    private final Adapter zza;
    private final zzbwn zzb;

    zzbqu(Adapter adapter, zzbwn zzbwn) {
        this.zza = adapter;
        this.zzb = zzbwn;
    }

    public final void zze() throws RemoteException {
        zzbwn zzbwn = this.zzb;
        if (zzbwn != null) {
            zzbwn.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzf() throws RemoteException {
        zzbwn zzbwn = this.zzb;
        if (zzbwn != null) {
            zzbwn.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzg(int i) throws RemoteException {
        zzbwn zzbwn = this.zzb;
        if (zzbwn != null) {
            zzbwn.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    public final void zzh(zze zze) throws RemoteException {
    }

    public final void zzi(int i, String str) throws RemoteException {
    }

    public final void zzj(int i) throws RemoteException {
    }

    public final void zzk(zze zze) {
    }

    public final void zzl(String str) {
    }

    public final void zzm() throws RemoteException {
    }

    public final void zzn() throws RemoteException {
    }

    public final void zzo() throws RemoteException {
        zzbwn zzbwn = this.zzb;
        if (zzbwn != null) {
            zzbwn.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzp() throws RemoteException {
        zzbwn zzbwn = this.zzb;
        if (zzbwn != null) {
            zzbwn.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzq(String str, String str2) throws RemoteException {
    }

    public final void zzr(zzbhj zzbhj, String str) throws RemoteException {
    }

    public final void zzs(zzbwo zzbwo) throws RemoteException {
    }

    public final void zzt(zzbws zzbws) throws RemoteException {
        zzbwn zzbwn = this.zzb;
        if (zzbwn != null) {
            zzbwn.zzm(ObjectWrapper.wrap(this.zza), new zzbwo(zzbws.zzf(), zzbws.zze()));
        }
    }

    public final void zzu() throws RemoteException {
        zzbwn zzbwn = this.zzb;
        if (zzbwn != null) {
            zzbwn.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzv() throws RemoteException {
        zzbwn zzbwn = this.zzb;
        if (zzbwn != null) {
            zzbwn.zzo(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzw() throws RemoteException {
    }

    public final void zzx() throws RemoteException {
    }

    public final void zzy() throws RemoteException {
    }

    public final void zzz() throws RemoteException {
        zzbwn zzbwn = this.zzb;
        if (zzbwn != null) {
            zzbwn.zzp(ObjectWrapper.wrap(this.zza));
        }
    }
}
