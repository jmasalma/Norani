package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeui implements zzeuc {
    /* access modifiers changed from: private */
    public final Context zza;
    private final zzgdy zzb;

    zzeui(Context context, zzgdy zzgdy) {
        this.zza = context;
        this.zzb = zzgdy;
    }

    public final int zza() {
        return 59;
    }

    public final ListenableFuture zzb() {
        if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
            return this.zzb.zzb(new zzeuh(this));
        }
        return zzgdn.zzh(new zzeuj(-1, -1));
    }
}
