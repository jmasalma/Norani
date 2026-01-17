package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzezj implements zzfve {
    final /* synthetic */ zzezn zza;

    zzezj(zzezn zzezn) {
        Objects.requireNonNull(zzezn);
        this.zza = zzezn;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i = zze.zza;
        zzo.zzh("", (zzdyx) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzezn zzezn = this.zza;
        zzezn.zzd = new zzezl((zzbvq) null, zzezn.zze(), (zzezm) null);
        return zzezn.zzd;
    }
}
