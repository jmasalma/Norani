package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbun;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzac extends zzba {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzaz zzb;

    zzac(zzaz zzaz, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzaz);
        this.zzb = zzaz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzv(this.zza, "ad_overlay");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcr) throws RemoteException {
        return zzcr.zzn(ObjectWrapper.wrap(this.zza));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Activity activity = this.zza;
        zzbde.zza(activity);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzle)).booleanValue()) {
            try {
                return zzbtp.zzI(((zzbtt) zzs.zzb(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzab())).zze(ObjectWrapper.wrap(activity)));
            } catch (RemoteException | zzr | NullPointerException e) {
                zzaz zzaz = this.zzb;
                zzaz.zzg = zzbun.zza(this.zza.getApplicationContext());
                zzaz.zzg.zzh(e, "ClientApiBroker.createAdOverlay");
                return null;
            }
        } else {
            zzaz zzaz2 = this.zzb;
            return zzaz2.zze.zza(this.zza);
        }
    }
}
