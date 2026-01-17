package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbvv implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvx zzb;

    zzbvv(zzbvx zzbvx, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzbvx);
        this.zzb = zzbvx;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbvu zzbvu;
        zzbvx zzbvx = this.zzb;
        WeakHashMap zza2 = zzbvx.zza;
        Context context = this.zza;
        zzbvw zzbvw = (zzbvw) zza2.get(context);
        if (zzbvw != null) {
            if (zzbvw.zza + ((Long) zzbet.zzd.zze()).longValue() >= zzv.zzD().currentTimeMillis()) {
                zzbvu = new zzbvt(context, zzbvw.zzb).zza();
                zzbvx.zza.put(context, new zzbvw(zzbvx, zzbvu));
                return zzbvu;
            }
        }
        zzbvu = new zzbvt(context).zza();
        zzbvx.zza.put(context, new zzbvw(zzbvx, zzbvu));
        return zzbvu;
    }
}
