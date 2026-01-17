package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzfwb implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfwe zzb;

    zzfwb(zzfwe zzfwe, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzfwe);
        this.zzb = zzfwe;
    }

    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        String str = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfvh.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
