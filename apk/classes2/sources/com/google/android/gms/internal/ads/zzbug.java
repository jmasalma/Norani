package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzbug extends zzbyw {
    final /* synthetic */ QueryInfoGenerationCallback zza;

    zzbug(zzbuh zzbuh, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zza = queryInfoGenerationCallback;
        Objects.requireNonNull(zzbuh);
    }

    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new QueryInfo(new zzfb(str, bundle, str2)));
    }
}
