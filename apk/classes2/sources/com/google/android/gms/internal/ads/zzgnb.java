package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgnb extends zzgfm {
    private final String zza;
    private final zzgvf zzb;

    /* synthetic */ zzgnb(String str, zzgvf zzgvf, zzgnc zzgnc) {
        this.zza = str;
        this.zzb = zzgvf;
    }

    public final String toString() {
        String str;
        String str2 = this.zza;
        int ordinal = this.zzb.ordinal();
        if (ordinal != 1) {
            str = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY";
        } else {
            str = "TINK";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", new Object[]{str2, str});
    }

    public final boolean zza() {
        return this.zzb != zzgvf.RAW;
    }
}
