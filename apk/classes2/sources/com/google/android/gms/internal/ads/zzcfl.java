package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcfl implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbya zza;
    final /* synthetic */ zzcfo zzb;

    zzcfl(zzcfo zzcfo, zzbya zzbya) {
        this.zza = zzbya;
        Objects.requireNonNull(zzcfo);
        this.zzb = zzcfo;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzac(view, this.zza, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
