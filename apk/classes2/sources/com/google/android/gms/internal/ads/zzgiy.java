package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgiy extends zzgga {
    private final zzgiw zza;
    private final String zzb;
    private final zzgiv zzc;
    private final zzgga zzd;

    /* synthetic */ zzgiy(zzgiw zzgiw, String str, zzgiv zzgiv, zzgga zzgga, zzgix zzgix) {
        this.zza = zzgiw;
        this.zzb = str;
        this.zzc = zzgiv;
        this.zzd = zzgga;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgiy)) {
            return false;
        }
        zzgiy zzgiy = (zzgiy) obj;
        if (!zzgiy.zzc.equals(this.zzc) || !zzgiy.zzd.equals(this.zzd) || !zzgiy.zzb.equals(this.zzb) || !zzgiy.zza.equals(this.zza)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzgiy.class, this.zzb, this.zzc, this.zzd, this.zza});
    }

    public final String toString() {
        zzgiw zzgiw = this.zza;
        zzgga zzgga = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzgga);
        String valueOf3 = String.valueOf(zzgiw);
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + valueOf + ", dekParametersForNewKeys: " + valueOf2 + ", variant: " + valueOf3 + ")";
    }

    public final boolean zza() {
        return this.zza != zzgiw.zzb;
    }

    public final zzgga zzb() {
        return this.zzd;
    }

    public final zzgiw zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}
