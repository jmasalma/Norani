package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcym extends zzdbt {
    private boolean zzb = false;

    public zzcym(Set set) {
        super(set);
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzq(new zzcyl());
            this.zzb = true;
        }
    }
}
