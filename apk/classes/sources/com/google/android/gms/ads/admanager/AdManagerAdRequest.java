package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class AdManagerAdRequest extends AdRequest {

    /* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
    public static final class Builder extends AbstractAdRequestBuilder<Builder> {
        public Builder addCategoryExclusion(String str) {
            this.zza.zzo(str);
            return this;
        }

        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, (zza) null);
        }

        public Builder self() {
            return this;
        }

        public Builder setPublisherProvidedId(String str) {
            this.zza.zzC(str);
            return this;
        }
    }

    /* synthetic */ AdManagerAdRequest(Builder builder, zza zza) {
        super(builder);
    }

    public Bundle getCustomTargeting() {
        return this.zza.zzf();
    }

    public String getPublisherProvidedId() {
        return this.zza.zzk();
    }
}
