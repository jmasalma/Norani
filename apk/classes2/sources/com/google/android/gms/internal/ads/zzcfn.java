package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcfn implements zzr {
    private final zzcfg zza;
    private final zzr zzb;

    public zzcfn(zzcfg zzcfg, zzr zzr) {
        this.zza = zzcfg;
        this.zzb = zzr;
    }

    public final void zzd() {
    }

    public final void zzdk() {
    }

    public final void zzds() {
        zzr zzr = this.zzb;
        if (zzr != null) {
            zzr.zzds();
        }
    }

    public final void zzdt() {
        zzr zzr = this.zzb;
        if (zzr != null) {
            zzr.zzdt();
        }
        this.zza.zzaa();
    }

    public final void zzdv() {
        zzr zzr = this.zzb;
        if (zzr != null) {
            zzr.zzdv();
        }
    }

    public final void zzdw(int i) {
        zzr zzr = this.zzb;
        if (zzr != null) {
            zzr.zzdw(i);
        }
        this.zza.zzY();
    }
}
