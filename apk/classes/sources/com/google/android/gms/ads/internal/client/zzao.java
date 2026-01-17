package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpq;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzao extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbpq zzd;
    final /* synthetic */ zzaz zze;

    zzao(zzaz zzaz, Context context, zzr zzr, String str, zzbpq zzbpq) {
        this.zza = context;
        this.zzb = zzr;
        this.zzc = str;
        this.zzd = zzbpq;
        Objects.requireNonNull(zzaz);
        this.zze = zzaz;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzv(this.zza, "interstitial");
        return new zzfm();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcr) throws RemoteException {
        return zzcr.zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return this.zze.zza.zza(this.zza, this.zzb, this.zzc, this.zzd, 2);
    }
}
