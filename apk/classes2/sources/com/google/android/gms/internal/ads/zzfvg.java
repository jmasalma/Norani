package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzfvg extends zzfvc implements Serializable {
    private final Pattern zza;

    public final String toString() {
        return this.zza.toString();
    }

    public final zzfvb zza(CharSequence charSequence) {
        return new zzfvf(this.zza.matcher(charSequence));
    }

    zzfvg(Pattern pattern) {
        pattern.getClass();
        Pattern pattern2 = pattern;
        this.zza = pattern;
    }
}
