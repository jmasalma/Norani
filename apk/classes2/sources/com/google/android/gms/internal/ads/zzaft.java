package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaft implements zzafj {
    public final String zza;

    private zzaft(String str) {
        this.zza = str;
    }

    public static zzaft zzb(zzen zzen) {
        return new zzaft(zzen.zzB(zzen.zza(), StandardCharsets.UTF_8));
    }

    public final int zza() {
        return 1852994675;
    }
}
