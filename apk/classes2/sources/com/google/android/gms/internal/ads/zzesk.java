package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzesk implements zzeuc {
    private static String zza;
    private final zzgdy zzb;
    private final Context zzc;

    public zzesk(zzgdy zzgdy, Context context) {
        this.zzb = zzgdy;
        this.zzc = context;
    }

    public static /* synthetic */ zzesl zzc(zzesk zzesk) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfz)).booleanValue()) {
            return new zzesl((String) null);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfI)).booleanValue()) {
            if (zza == null) {
                zza = zzv.zzC().zzf(zzesk.zzc);
            }
            return new zzesl(zza);
        }
        return new zzesl(zzv.zzC().zzf(zzesk.zzc));
    }

    public final int zza() {
        return 27;
    }

    public final ListenableFuture zzb() {
        return this.zzb.zzb(new zzesj(this));
    }
}
