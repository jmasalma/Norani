package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdpr implements zzcwt {
    private final zzcfg zza;

    zzdpr(zzcfg zzcfg) {
        this.zza = zzcfg;
    }

    public final void zzdj(Context context) {
        zzcfg zzcfg = this.zza;
        if (zzcfg != null) {
            zzcfg.destroy();
        }
    }

    public final void zzdl(Context context) {
        zzcfg zzcfg = this.zza;
        if (zzcfg != null) {
            zzcfg.onPause();
        }
    }

    public final void zzdm(Context context) {
        zzcfg zzcfg = this.zza;
        if (zzcfg != null) {
            zzcfg.onResume();
        }
    }
}
