package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzap {
    public final String zza;
    public final zzak zzb;
    public final zzaj zzc;
    public final zzat zzd;
    public final zzaf zze;
    public final zzam zzf;

    static {
        new zzad().zzc();
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ zzap(String str, zzag zzag, zzak zzak, zzaj zzaj, zzat zzat, zzam zzam, zzao zzao) {
        this.zza = str;
        this.zzb = zzak;
        this.zzc = zzaj;
        this.zzd = zzat;
        this.zze = zzag;
        this.zzf = zzam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        zzap zzap = (zzap) obj;
        return Objects.equals(this.zza, zzap.zza) && this.zze.equals(zzap.zze) && Objects.equals(this.zzb, zzap.zzb) && Objects.equals(this.zzc, zzap.zzc) && Objects.equals(this.zzd, zzap.zzd) && Objects.equals(this.zzf, zzap.zzf);
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        zzak zzak = this.zzb;
        return (((((((hashCode + (zzak != null ? zzak.hashCode() : 0)) * 31) + this.zzc.hashCode()) * 31) + this.zze.hashCode()) * 31) + this.zzd.hashCode()) * 31;
    }
}
