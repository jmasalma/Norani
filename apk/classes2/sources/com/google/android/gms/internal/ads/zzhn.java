package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzhn {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ zzhn(MediaCodec.CryptoInfo cryptoInfo, zzho zzho) {
        this.zza = cryptoInfo;
    }

    static /* bridge */ /* synthetic */ void zza(zzhn zzhn, int i, int i2) {
        MediaCodec.CryptoInfo.Pattern pattern = zzhn.zzb;
        pattern.set(i, i2);
        zzhn.zza.setPattern(pattern);
    }
}
