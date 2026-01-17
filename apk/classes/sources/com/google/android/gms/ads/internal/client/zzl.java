package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpq;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzl extends RemoteCreator {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return queryLocalInterface instanceof zzcl ? (zzcl) queryLocalInterface : new zzcl(iBinder);
    }

    @Nullable
    public final zzck zza(Context context, zzbpq zzbpq) {
        zzck zzck;
        try {
            IBinder zze = ((zzcl) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzbpq, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                zzck = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzck = queryLocalInterface instanceof zzck ? (zzck) queryLocalInterface : new zzci(zze);
            }
            zzck.zzo(zzbpq);
            return zzck;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzo.zzk("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }
}
