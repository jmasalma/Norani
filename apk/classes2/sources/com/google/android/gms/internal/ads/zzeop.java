package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeop implements zzeuc {
    private final zzeyy zza;

    zzeop(zzeyy zzeyy) {
        this.zza = zzeyy;
    }

    public final int zza() {
        return 15;
    }

    public final ListenableFuture zzb() {
        zzeyy zzeyy = this.zza;
        if (zzeyy == null) {
            return zzgdn.zzh(new zzeoo((String) null));
        }
        String zza2 = zzeyy.zza();
        if (Strings.isEmptyOrWhitespace(zza2)) {
            return zzgdn.zzh(new zzeoo((String) null));
        }
        return zzgdn.zzh(new zzeoo(zza2));
    }
}
