package com.google.android.gms.ads.preload;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public class PreloadConfiguration {
    private final String zza;
    @Deprecated
    private final AdFormat zzb;
    private final AdRequest zzc;
    private final int zzd;

    /* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
    public static class Builder {
        /* access modifiers changed from: private */
        public final String zza;
        /* access modifiers changed from: private */
        public AdFormat zzb;
        /* access modifiers changed from: private */
        public AdRequest zzc = new AdRequest.Builder().build();
        /* access modifiers changed from: private */
        public int zzd;

        public Builder(String str) {
            this.zza = str;
        }

        public PreloadConfiguration build() {
            return new PreloadConfiguration(this, (zzc) null);
        }

        public Builder setAdRequest(AdRequest adRequest) {
            this.zzc = adRequest;
            return this;
        }

        public Builder setBufferSize(int i) {
            this.zzd = i;
            return this;
        }

        @Deprecated
        public Builder(String str, AdFormat adFormat) {
            this.zza = str;
            this.zzb = adFormat;
        }
    }

    /* synthetic */ PreloadConfiguration(Builder builder, zzc zzc2) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zzd;
    }

    @Deprecated
    public AdFormat getAdFormat() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? AdFormat.INTERSTITIAL : adFormat;
    }

    public AdRequest getAdRequest() {
        return this.zzc;
    }

    public String getAdUnitId() {
        return this.zza;
    }

    public int getBufferSize() {
        return this.zzd;
    }
}
