package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbun;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzay extends zzba {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaz zzd;

    zzay(zzaz zzaz, View view, HashMap hashMap, HashMap hashMap2) {
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
        Objects.requireNonNull(zzaz);
        this.zzd = zzaz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzv(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfq();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcr) throws RemoteException {
        HashMap hashMap = this.zzc;
        return zzcr.zzk(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(hashMap));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        View view = this.zza;
        zzbde.zza(view.getContext());
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzle)).booleanValue()) {
            try {
                return zzbgy.zze(((zzbhc) zzs.zzb(view.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzax())).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
            } catch (RemoteException | zzr | NullPointerException e) {
                zzaz zzaz = this.zzd;
                zzaz.zzg = zzbun.zza(this.zza.getContext());
                zzaz.zzg.zzh(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        } else {
            zzaz zzaz2 = this.zzd;
            return zzaz2.zzf.zza(this.zza, this.zzb, this.zzc);
        }
    }
}
