package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzezk implements zzfve {
    final /* synthetic */ zzezn zza;

    zzezk(zzezn zzezn) {
        Objects.requireNonNull(zzezn);
        this.zza = zzezn;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbvq zzbvq = (zzbvq) obj;
        zzezl zzezl = new zzezl(zzbvq, new zzfev(zzbvq.zzj), (zzezm) null);
        zzezn zzezn = this.zza;
        zzezn.zzd = zzezl;
        return zzezn.zzd;
    }
}
