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
import com.google.android.gms.internal.ads.zzbun;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzau extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaz zzb;

    zzau(zzaz zzaz, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzaz);
        this.zzb = zzaz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzv(this.zza, "mobile_ads_settings");
        return new zzfo();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcr) throws RemoteException {
        return zzcr.zzh(ObjectWrapper.wrap(this.zza), ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        zzbde.zza(context);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzle)).booleanValue()) {
            try {
                IBinder zze = ((zzdc) zzs.zzb(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzat())).zze(ObjectWrapper.wrap(context), ModuleDescriptor.MODULE_VERSION);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof zzdb ? (zzdb) queryLocalInterface : new zzcz(zze);
            } catch (RemoteException | zzr | NullPointerException e) {
                zzaz zzaz = this.zzb;
                zzaz.zzg = zzbun.zza(this.zza);
                zzaz.zzg.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        } else {
            return this.zzb.zzc.zza(this.zza);
        }
    }
}
