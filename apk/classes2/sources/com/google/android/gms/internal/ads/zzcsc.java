package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcsc implements zzgdj {
    final /* synthetic */ zzcse zza;

    zzcsc(zzcse zzcse) {
        Objects.requireNonNull(zzcse);
        this.zza = zzcse;
    }

    public final void zza(Throwable th) {
        this.zza.zzf.zzn(false);
    }

    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzbvq zzbvq = (zzbvq) obj;
        this.zza.zzf.zzn(true);
    }
}
