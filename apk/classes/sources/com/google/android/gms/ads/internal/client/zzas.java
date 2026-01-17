package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbun;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzas extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpq zzb;
    final /* synthetic */ zzaz zzc;

    zzas(zzaz zzaz, Context context, zzbpq zzbpq) {
        this.zza = context;
        this.zzb = zzbpq;
        Objects.requireNonNull(zzaz);
        this.zzc = zzaz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzv(this.zza, "ads_preloader");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcr) throws RemoteException {
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbpq zzbpq = this.zzb;
        zzck zzg = zzcr.zzg(wrap, zzbpq, ModuleDescriptor.MODULE_VERSION);
        zzg.zzo(zzbpq);
        return zzg;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzck zzck;
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbde.zza(context);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzle)).booleanValue()) {
            try {
                zzbpq zzbpq = this.zzb;
                IBinder zze = ((zzcl) zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", new zzar())).zze(wrap, zzbpq, ModuleDescriptor.MODULE_VERSION);
                if (zze == null) {
                    zzck = null;
                } else {
                    IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    zzck = queryLocalInterface instanceof zzck ? (zzck) queryLocalInterface : new zzci(zze);
                }
                zzck.zzo(zzbpq);
                return zzck;
            } catch (RemoteException | zzr | NullPointerException e) {
                zzaz zzaz = this.zzc;
                zzaz.zzg = zzbun.zza(this.zza);
                zzaz.zzg.zzh(e, "ClientApiBroker.getAdPreloader");
                return null;
            }
        } else {
            return this.zzc.zzh.zza(this.zza, this.zzb);
        }
    }
}
