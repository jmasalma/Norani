package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcsd implements zzgdj {
    final /* synthetic */ zzcse zza;

    zzcsd(zzcse zzcse) {
        Objects.requireNonNull(zzcse);
        this.zza = zzcse;
    }

    public final void zza(Throwable th) {
        this.zza.zzf.zzl(false);
    }

    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        Void voidR = (Void) obj;
        this.zza.zzf.zzl(true);
    }
}
