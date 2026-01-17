package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfml {
    private final zzfnz zza;
    private final String zzb;
    private final zzfls zzc;
    private final String zzd = "Ad overlay";

    public zzfml(View view, zzfls zzfls, String str) {
        this.zza = new zzfnz(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfls;
    }

    public final zzfls zza() {
        return this.zzc;
    }

    public final zzfnz zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
