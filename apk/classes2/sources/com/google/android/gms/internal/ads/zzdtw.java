package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdtw implements zzdtk {
    /* access modifiers changed from: private */
    public final long zza;
    private final zzelg zzb;

    zzdtw(long j, Context context, zzdtp zzdtp, zzche zzche, String str) {
        this.zza = j;
        zzfaf zzu = zzche.zzu();
        zzu.zzc(context);
        zzu.zza(new zzr());
        zzu.zzb(str);
        zzelg zza2 = zzu.zzd().zza();
        this.zzb = zza2;
        zza2.zzE(new zzdtv(this, zzdtp));
    }

    public final void zza() {
        this.zzb.zzy();
    }

    public final void zzb(zzm zzm) {
        this.zzb.zzad(zzm);
    }

    public final void zzc() {
        this.zzb.zzY(ObjectWrapper.wrap((Object) null));
    }
}
