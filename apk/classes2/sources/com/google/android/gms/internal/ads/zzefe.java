package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzefe extends zzbwm implements zzcxi {
    private zzbwn zza;
    private zzcxh zzb;
    private zzdeo zzc;

    public final synchronized void zza(zzcxh zzcxh) {
        this.zzb = zzcxh;
    }

    public final synchronized void zzc(zzbwn zzbwn) {
        this.zza = zzbwn;
    }

    public final synchronized void zzd(zzdeo zzdeo) {
        this.zzc = zzdeo;
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwn zzbwn = this.zza;
        if (zzbwn != null) {
            ((zzeij) zzbwn).zzb.onAdClicked();
        }
    }

    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwn zzbwn = this.zza;
        if (zzbwn != null) {
            zzbwn.zzf(iObjectWrapper);
        }
    }

    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcxh zzcxh = this.zzb;
        if (zzcxh != null) {
            zzcxh.zza(i);
        }
    }

    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwn zzbwn = this.zza;
        if (zzbwn != null) {
            ((zzeij) zzbwn).zzc.zzb();
        }
    }

    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcxh zzcxh = this.zzb;
        if (zzcxh != null) {
            zzcxh.zzd();
        }
    }

    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwn zzbwn = this.zza;
        if (zzbwn != null) {
            ((zzeij) zzbwn).zza.zzdt();
        }
    }

    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdeo zzdeo = this.zzc;
        if (zzdeo != null) {
            zzedp zzedp = ((zzeih) zzdeo).zzc;
            int i2 = zze.zza;
            zzo.zzj("Fail to initialize adapter ".concat(String.valueOf(zzedp.zza)));
        }
    }

    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdeo zzdeo = this.zzc;
        if (zzdeo != null) {
            Executor zzc2 = ((zzeih) zzdeo).zzd.zzb;
            zzedp zzedp = ((zzeih) zzdeo).zzc;
            zzfca zzfca = ((zzeih) zzdeo).zzb;
            zzc2.execute(new zzeig((zzeih) zzdeo, ((zzeih) zzdeo).zza, zzfca, zzedp));
        }
    }

    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbwo zzbwo) throws RemoteException {
        zzbwn zzbwn = this.zza;
        if (zzbwn != null) {
            ((zzeij) zzbwn).zzd.zza(zzbwo);
        }
    }

    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwn zzbwn = this.zza;
        if (zzbwn != null) {
            ((zzeij) zzbwn).zzd.zza((zzbwo) null);
        }
    }

    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwn zzbwn = this.zza;
        if (zzbwn != null) {
            ((zzeij) zzbwn).zzc.zze();
        }
    }

    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwn zzbwn = this.zza;
        if (zzbwn != null) {
            ((zzeij) zzbwn).zzd.zzc();
        }
    }
}
