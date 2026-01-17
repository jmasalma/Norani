package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzezb implements zzgdj {
    zzezb(zzezd zzezd) {
        Objects.requireNonNull(zzezd);
    }

    public final void zza(Throwable th) {
        zze.zza("Notification of cache hit failed.");
    }

    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        Void voidR = (Void) obj;
        zze.zza("Notification of cache hit successful.");
    }
}
