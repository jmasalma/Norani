package com.google.android.gms.internal.ads;

import android.graphics.Rect;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdmp implements zzazd {
    public final /* synthetic */ zzcfg zza;

    public /* synthetic */ zzdmp(zzcfg zzcfg) {
        this.zza = zzcfg;
    }

    public final void zzdr(zzazc zzazc) {
        zzcgy zzN = this.zza.zzN();
        Rect rect = zzazc.zzd;
        zzN.zzr(rect.left, rect.top, false);
    }
}
