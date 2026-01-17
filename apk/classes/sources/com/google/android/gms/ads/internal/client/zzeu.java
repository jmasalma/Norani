package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.AdapterStatus;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzeu implements AdapterStatus {
    zzeu(zzey zzey) {
        Objects.requireNonNull(zzey);
    }

    public final String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    public final AdapterStatus.State getInitializationState() {
        return AdapterStatus.State.READY;
    }

    public final int getLatency() {
        return 0;
    }
}
