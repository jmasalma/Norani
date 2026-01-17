package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbun;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzaq extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbpq zzc;
    final /* synthetic */ zzaz zzd;

    zzaq(zzaz zzaz, Context context, String str, zzbpq zzbpq) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbpq;
        Objects.requireNonNull(zzaz);
        this.zzd = zzaz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzv(this.zza, "native_ad");
        return new zzfk();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcr) throws RemoteException {
        return zzcr.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        zzbde.zza(context);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzle)).booleanValue()) {
            try {
                IBinder zze = ((zzbu) zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzap())).zze(ObjectWrapper.wrap(context), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbr(zze);
            } catch (RemoteException | zzr | NullPointerException e) {
                zzaz zzaz = this.zzd;
                zzaz.zzg = zzbun.zza(this.zza);
                zzaz.zzg.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        } else {
            return this.zzd.zzb.zza(this.zza, this.zzb, this.zzc);
        }
    }
}
