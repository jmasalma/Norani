package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzcoz {
    private final zzcqy zza;
    private final View zzb;
    private final zzfcb zzc;
    private final zzcfg zzd;

    public zzcoz(View view, zzcfg zzcfg, zzcqy zzcqy, zzfcb zzfcb) {
        this.zzb = view;
        this.zzd = zzcfg;
        this.zza = zzcqy;
        this.zzc = zzfcb;
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcfg zzb() {
        return this.zzd;
    }

    public final zzcqy zzc() {
        return this.zza;
    }

    public zzcxk zzd(Set set) {
        return new zzcxk(set);
    }

    public final zzfcb zze() {
        return this.zzc;
    }
}
