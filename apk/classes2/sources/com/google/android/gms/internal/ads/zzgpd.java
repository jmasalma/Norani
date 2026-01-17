package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgpd {
    private final Class zza;
    private final zzgxe zzb;

    /* synthetic */ zzgpd(Class cls, zzgxe zzgxe, zzgpf zzgpf) {
        this.zza = cls;
        this.zzb = zzgxe;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpd)) {
            return false;
        }
        zzgpd zzgpd = (zzgpd) obj;
        if (!zzgpd.zza.equals(this.zza) || !zzgpd.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        zzgxe zzgxe = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(zzgxe);
        return simpleName + ", object identifier: " + valueOf;
    }
}
