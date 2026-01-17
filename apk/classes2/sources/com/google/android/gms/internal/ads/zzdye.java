package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdye extends zzdyi {
    private final Context zzg;
    private final Executor zzh;

    public zzdye(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbuv(context, zzv.zzv().zzb(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        zzbvi zzbvi;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    zzbve zzp = this.zzf.zzp();
                    zzbvq zzbvq = this.zze;
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zznp)).booleanValue()) {
                        zzbvi = new zzdyh(this.zza, this.zze);
                    } else {
                        zzbvi = new zzdyg(this);
                    }
                    zzp.zzg(zzbvq, zzbvi);
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyx(1));
                } catch (Throwable th) {
                    zzv.zzp().zzw(th, "RemoteAdRequestClientTask.onConnected");
                    this.zza.zzd(new zzdyx(1));
                }
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i = zze.zza;
        zzo.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyx(1));
    }

    public final ListenableFuture zza(zzbvq zzbvq) {
        synchronized (this.zzb) {
            if (this.zzc) {
                zzcak zzcak = this.zza;
                return zzcak;
            }
            this.zzc = true;
            this.zze = zzbvq;
            this.zzf.checkAvailabilityAndConnect();
            zzcak zzcak2 = this.zza;
            zzcak2.addListener(new zzdyd(this), zzcaf.zzg);
            zzc(this.zzg, zzcak2, this.zzh);
            return zzcak2;
        }
    }
}
