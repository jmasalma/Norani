package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaes {
    public final zzaev zza;
    public final zzaev zzb;

    public zzaes(zzaev zzaev, zzaev zzaev2) {
        zzaev zzaev3 = zzaev;
        this.zza = zzaev;
        zzaev zzaev4 = zzaev2;
        this.zzb = zzaev2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaes zzaes = (zzaes) obj;
            return this.zza.equals(zzaes.zza) && this.zzb.equals(zzaes.zzb);
        }
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzaev zzaev = this.zza;
        zzaev zzaev2 = this.zzb;
        String obj = zzaev.toString();
        String concat = zzaev.equals(zzaev2) ? "" : ", ".concat(zzaev2.toString());
        return "[" + obj + concat + "]";
    }
}
