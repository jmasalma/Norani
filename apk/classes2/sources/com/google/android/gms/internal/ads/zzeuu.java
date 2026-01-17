package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeuu implements zzgcu {
    public final ListenableFuture zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzgdn.zzh(new zzeuy("", 1, (zzeux) null));
        }
        zzhcy zzc = zzhcz.zzc();
        for (Topic topic : getTopicsResponse.getTopics()) {
            zzhcw zzc2 = zzhcx.zzc();
            zzc2.zzc(topic.getTopicId());
            zzc2.zza(topic.getModelVersion());
            zzc2.zzb(topic.getTaxonomyVersion());
            zzc.zza((zzhcx) zzc2.zzbr());
        }
        return zzgdn.zzh(new zzeuy(Base64.encodeToString(((zzhcz) zzc.zzbr()).zzaV(), 1), 1, (zzeux) null));
    }
}
