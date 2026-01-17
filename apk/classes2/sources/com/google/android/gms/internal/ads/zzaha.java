package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaha extends zzahf {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzaha(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaha zzaha = (zzaha) obj;
            return Objects.equals(this.zzb, zzaha.zzb) && Objects.equals(this.zza, zzaha.zza) && Objects.equals(this.zzc, zzaha.zzc);
        }
    }

    public final int hashCode() {
        int hashCode = ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
        String str = this.zzc;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return this.zzf + ": language=" + this.zza + ", description=" + this.zzb + ", text=" + this.zzc;
    }
}
