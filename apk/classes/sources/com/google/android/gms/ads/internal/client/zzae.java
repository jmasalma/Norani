package com.google.android.gms.ads.internal.client;

import android.content.Context;
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
final class zzae extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpq zzb;

    zzae(zzaz zzaz, Context context, zzbpq zzbpq) {
        this.zza = context;
        this.zzb = zzbpq;
        Objects.requireNonNull(zzaz);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzv(this.zza, "out_of_context_tester");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcr) throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbde.zza(context);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjO)).booleanValue()) {
            return zzcr.zzi(wrap, this.zzb, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbde.zza(context);
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzjO)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdx) zzs.zzb(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzad())).zze(wrap, this.zzb, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | zzr | NullPointerException e) {
            zzbun.zza(this.zza).zzh(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
