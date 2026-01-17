package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzbup;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzk extends RemoteCreator {
    private zzbup zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzby(iBinder);
    }

    public final zzbx zza(Context context, zzr zzr, String str, zzbpq zzbpq, int i) {
        zzbx zzbv;
        zzbde.zza(context);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzle)).booleanValue()) {
            try {
                IBinder zze = ((zzby) zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzj())).zze(ObjectWrapper.wrap(context), zzr, str, zzbpq, ModuleDescriptor.MODULE_VERSION, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(zze);
            } catch (RemoteException | zzr | NullPointerException e) {
                zzbup zza2 = zzbun.zza(context);
                this.zza = zza2;
                zza2.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzo.zzl("#007 Could not call remote method.", e);
                return null;
            }
        } else {
            try {
                IBinder zze2 = ((zzby) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzr, str, zzbpq, ModuleDescriptor.MODULE_VERSION, i);
                if (zze2 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface2 instanceof zzbx) {
                    zzbv = (zzbx) queryLocalInterface2;
                } else {
                    zzbv = new zzbv(zze2);
                }
                return zzbv;
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
                zzo.zzf("Could not create remote AdManager.", e2);
                return null;
            }
        }
    }
}
