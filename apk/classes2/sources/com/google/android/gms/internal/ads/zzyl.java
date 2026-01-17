package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzyl implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzyu zza;

    zzyl(zzym zzym, zzyu zzyu) {
        this.zza = zzyu;
        Objects.requireNonNull(zzym);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.zzu();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.zzu();
    }
}
