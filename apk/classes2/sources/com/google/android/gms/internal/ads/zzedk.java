package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzedk {
    private final Context zza;

    zzedk(Context context) {
        this.zza = context;
    }

    public final ListenableFuture zza(boolean z) {
        try {
            GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(z).build();
            TopicsManagerFutures from = TopicsManagerFutures.from(this.zza);
            if (from != null) {
                return from.getTopicsAsync(build);
            }
            return zzgdn.zzg(new IllegalStateException());
        } catch (Exception e) {
            return zzgdn.zzg(e);
        }
    }
}
