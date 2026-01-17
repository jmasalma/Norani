package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcxs extends zzdbt implements zzbiv {
    private final Bundle zzb = new Bundle();

    zzcxs(Set set) {
        super(set);
    }

    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzq(new zzcxr());
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
