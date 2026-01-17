package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfkw implements Comparator {
    final /* synthetic */ zzfld zza;

    zzfkw(zzfld zzfld) {
        Objects.requireNonNull(zzfld);
        this.zza = zzfld;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzfku zzfku = (zzfku) obj;
        zzfku zzfku2 = (zzfku) obj2;
        Object zzc = zzfku2.zzc();
        zzfld zzfld = this.zza;
        int compare = Double.compare(zzfld.zzc(zzfld, zzfld.zza(zzc)), zzfld.zzc(zzfld, zzfld.zza(zzfku.zzc())));
        return compare == 0 ? Long.compare(zzfku.zzb(), zzfku2.zzb()) : compare;
    }
}
