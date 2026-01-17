package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzahh extends zzahf {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzahh(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahh zzahh = (zzahh) obj;
            return Objects.equals(this.zzb, zzahh.zzb) && Objects.equals(this.zza, zzahh.zza) && Objects.equals(this.zzc, zzahh.zzc);
        }
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }

    public final String toString() {
        return this.zzf + ": domain=" + this.zza + ", description=" + this.zzb;
    }
}
