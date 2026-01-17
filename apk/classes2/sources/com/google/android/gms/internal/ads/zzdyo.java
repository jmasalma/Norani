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

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdyo extends zzdyi {
    private String zzg;
    private int zzh = 1;

    zzdyo(Context context) {
        this.zzf = new zzbuv(context, zzv.zzv().zzb(), this, this);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i = zze.zza;
        zzo.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyx(1));
    }

    public final ListenableFuture zza(zzbvq zzbvq) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                ListenableFuture zzg2 = zzgdn.zzg(new zzdyx(2));
                return zzg2;
            } else if (this.zzc) {
                zzcak zzcak = this.zza;
                return zzcak;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbvq;
                this.zzf.checkAvailabilityAndConnect();
                zzcak zzcak2 = this.zza;
                zzcak2.addListener(new zzdym(this), zzcaf.zzg);
                return zzcak2;
            }
        }
    }

    public final ListenableFuture zzd(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                ListenableFuture zzg2 = zzgdn.zzg(new zzdyx(2));
                return zzg2;
            } else if (this.zzc) {
                zzcak zzcak = this.zza;
                return zzcak;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                zzcak zzcak2 = this.zza;
                zzcak2.addListener(new zzdyn(this), zzcaf.zzg);
                return zzcak2;
            }
        }
    }

    public final void onConnected(Bundle bundle) {
        zzbvi zzbvi;
        zzbvi zzbvi2;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        zzbve zzp = this.zzf.zzp();
                        zzbvq zzbvq = this.zze;
                        if (((Boolean) zzbd.zzc().zzb(zzbde.zznp)).booleanValue()) {
                            zzbvi2 = new zzdyh(this.zza, this.zze);
                        } else {
                            zzbvi2 = new zzdyg(this);
                        }
                        zzp.zze(zzbvq, zzbvi2);
                    } else if (i == 3) {
                        zzbve zzp2 = this.zzf.zzp();
                        String str = this.zzg;
                        if (((Boolean) zzbd.zzc().zzb(zzbde.zznp)).booleanValue()) {
                            zzbvi = new zzdyh(this.zza, this.zze);
                        } else {
                            zzbvi = new zzdyg(this);
                        }
                        zzp2.zzh(str, zzbvi);
                    } else {
                        this.zza.zzd(new zzdyx(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyx(1));
                } catch (Throwable th) {
                    zzv.zzp().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new zzdyx(1));
                }
            }
        }
    }
}
