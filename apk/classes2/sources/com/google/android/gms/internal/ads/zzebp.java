package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzebp extends zzecm {
    private Activity zza;
    private zzm zzb;
    private String zzc;
    private String zzd;

    zzebp() {
    }

    public final zzecm zza(Activity activity) {
        if (activity != null) {
            this.zza = activity;
            return this;
        }
        throw new NullPointerException("Null activity");
    }

    public final zzecm zzb(zzm zzm) {
        this.zzb = zzm;
        return this;
    }

    public final zzecm zzc(String str) {
        this.zzc = str;
        return this;
    }

    public final zzecm zzd(String str) {
        this.zzd = str;
        return this;
    }

    public final zzecn zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzebr(activity, this.zzb, this.zzc, this.zzd, (zzebq) null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
