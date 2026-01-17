package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdey extends zzdbt {
    private boolean zzb;

    protected zzdey(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzdev());
    }

    public final void zzb() {
        zzq(new zzdeu());
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzq(new zzdew());
            this.zzb = true;
        }
        zzq(new zzdex());
    }

    public final synchronized void zzd() {
        zzq(new zzdew());
        this.zzb = true;
    }
}
