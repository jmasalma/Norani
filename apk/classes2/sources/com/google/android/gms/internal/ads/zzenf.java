package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzenf implements zzeuc {
    private final Context zza;
    private final zzgdy zzb;

    zzenf(zzgdy zzgdy, Context context) {
        this.zzb = zzgdy;
        this.zza = context;
    }

    public final int zza() {
        return 61;
    }

    public final ListenableFuture zzb() {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zznm)).booleanValue()) {
            return zzgdn.zzh(new zzeng((String) null, false));
        }
        ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            return zzgdn.zzh(new zzeng((String) null, false));
        }
        return this.zzb.zzb(new zzene(contentResolver));
    }
}
