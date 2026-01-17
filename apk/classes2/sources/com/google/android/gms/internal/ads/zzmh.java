package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzmh {
    public static final zzmh zza = new zzmh(new zzmg());
    public final zzfyv zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = false;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zzmh(zzmg zzmg) {
        this.zzb = zzmg.zza;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzmh)) {
            return false;
        }
        zzmh zzmh = (zzmh) obj;
        if (!this.zzb.equals(zzmh.zzb)) {
            return false;
        }
        boolean z = zzmh.zzf;
        Double d = zzmh.zzc;
        if (!Objects.equals((Object) null, (Object) null)) {
            return false;
        }
        Double d2 = zzmh.zzd;
        if (!Objects.equals((Object) null, (Object) null)) {
            return false;
        }
        boolean z2 = zzmh.zze;
        boolean z3 = zzmh.zzg;
        boolean z4 = zzmh.zzh;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zzb, null, null, 1, false, 1, true});
    }
}
