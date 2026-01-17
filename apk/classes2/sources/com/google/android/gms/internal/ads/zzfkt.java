package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfkt {
    private final String zza;
    private final AdFormat zzb;
    private final String zzc;

    /* synthetic */ zzfkt(zzfkr zzfkr, zzfks zzfks) {
        this.zza = zzfkr.zza;
        this.zzb = zzfkr.zzb;
        this.zzc = zzfkr.zzc;
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof zzfkt) {
            zzfkt zzfkt = (zzfkt) obj;
            if (!this.zza.equals(zzfkt.zza) || (adFormat = this.zzb) == null || (adFormat2 = zzfkt.zzb) == null || !adFormat.equals(adFormat2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String zza() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }
}
