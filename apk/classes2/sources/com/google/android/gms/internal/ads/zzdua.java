package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdua implements zzdtk {
    /* access modifiers changed from: private */
    public final long zza;
    /* access modifiers changed from: private */
    public final zzdtp zzb;
    private final zzfbr zzc;

    zzdua(long j, Context context, zzdtp zzdtp, zzche zzche, String str) {
        this.zza = j;
        this.zzb = zzdtp;
        zzfbt zzv = zzche.zzv();
        zzv.zzb(context);
        zzv.zza(str);
        this.zzc = zzv.zzc().zza();
    }

    public final void zza() {
    }

    public final void zzb(zzm zzm) {
        try {
            this.zzc.zzh(zzm, new zzdty(this));
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc() {
        try {
            zzfbr zzfbr = this.zzc;
            zzfbr.zzn(new zzdtz(this));
            zzfbr.zzp(ObjectWrapper.wrap((Object) null));
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
