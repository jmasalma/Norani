package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzahl extends zzahf {
    public final String zza;
    public final String zzb;

    public zzahl(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahl zzahl = (zzahl) obj;
            return this.zzf.equals(zzahl.zzf) && Objects.equals(this.zza, zzahl.zza) && Objects.equals(this.zzb, zzahl.zzb);
        }
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzf + ": url=" + this.zzb;
    }
}
