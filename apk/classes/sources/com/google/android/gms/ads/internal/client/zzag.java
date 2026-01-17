package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbzd;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzag extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpq zzb;

    zzag(zzaz zzaz, Context context, zzbpq zzbpq) {
        this.zza = context;
        this.zzb = zzbpq;
        Objects.requireNonNull(zzaz);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcr) throws RemoteException {
        return zzcr.zzq(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        try {
            return ((zzbzd) zzs.zzb(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new zzaf())).zze(ObjectWrapper.wrap(context), this.zzb, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }
}
