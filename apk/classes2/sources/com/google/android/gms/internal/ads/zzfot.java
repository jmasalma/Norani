package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfot {
    private final Context zza;
    private final Looper zzb;

    public zzfot(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfpe zza2 = zzfph.zza();
        Context context = this.zza;
        zza2.zza(context.getPackageName());
        zza2.zzc(2);
        zzfpb zza3 = zzfpd.zza();
        zza3.zza(str);
        zza3.zzb(2);
        zza2.zzb(zza3);
        new zzfou(context, this.zzb, (zzfph) zza2.zzbr()).zza();
    }
}
