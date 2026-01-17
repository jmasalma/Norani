package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzs extends AnimatorListenerAdapter {
    final /* synthetic */ zzu zza;

    zzs(zzu zzu) {
        Objects.requireNonNull(zzu);
        this.zza = zzu;
    }

    private final void zza(boolean z) {
        zzu zzu = this.zza;
        zzu.setEnabled(z);
        zzu.zza.setEnabled(z);
    }

    public final void onAnimationCancel(Animator animator) {
        zza(true);
    }

    public final void onAnimationEnd(Animator animator) {
        zza(true);
    }

    public final void onAnimationStart(Animator animator) {
        zza(false);
    }
}
