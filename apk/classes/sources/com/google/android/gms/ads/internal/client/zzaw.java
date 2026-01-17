package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbun;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzaw extends zzba {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzaz zzd;

    zzaw(zzaz zzaz, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
        Objects.requireNonNull(zzaz);
        this.zzd = zzaz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzv(this.zzc, "native_ad_view_delegate");
        return new zzfp();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcr) throws RemoteException {
        return zzcr.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zzc;
        zzbde.zza(context);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzle)).booleanValue()) {
            try {
                return zzbgs.zzdC(((zzbgw) zzs.zzb(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzav())).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ModuleDescriptor.MODULE_VERSION));
            } catch (RemoteException | zzr | NullPointerException e) {
                zzaz zzaz = this.zzd;
                zzaz.zzg = zzbun.zza(this.zzc);
                zzaz.zzg.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        } else {
            zzaz zzaz2 = this.zzd;
            return zzaz2.zzd.zza(this.zzc, this.zza, this.zzb);
        }
    }
}
