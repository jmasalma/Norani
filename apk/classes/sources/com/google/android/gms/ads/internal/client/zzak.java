package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzbpq;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzak extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpq zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    zzak(zzaz zzaz, Context context, zzbpq zzbpq, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbpq;
        this.zzc = onH5AdsEventListener;
        Objects.requireNonNull(zzaz);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zza() {
        return new zzblo();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcr) throws RemoteException {
        return zzcr.zzl(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION, new zzblb(this.zzc));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        try {
            return ((zzblk) zzs.zzb(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzaj())).zze(ObjectWrapper.wrap(context), this.zzb, ModuleDescriptor.MODULE_VERSION, new zzblb(this.zzc));
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }
}
