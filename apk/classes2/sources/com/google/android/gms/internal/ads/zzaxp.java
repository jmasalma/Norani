package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxp implements Callable {
    private final zzawx zza;
    private final zzast zzb;

    public zzaxp(zzawx zzawx, zzast zzast) {
        this.zza = zzawx;
        this.zzb = zzast;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzawx zzawx = this.zza;
        if (zzawx.zzk() != null) {
            zzawx.zzk().get();
        }
        zzatq zzc = zzawx.zzc();
        if (zzc == null) {
            return null;
        }
        try {
            zzast zzast = this.zzb;
            synchronized (zzast) {
                zzast.zzaY(zzc.zzaV(), zzgyr.zza());
            }
            return null;
        } catch (zzgzw | NullPointerException unused) {
            return null;
        }
    }
}
