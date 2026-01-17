package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdiq {
    private zzbgm zza;

    public zzdiq(zzdib zzdib) {
        this.zza = zzdib;
    }

    public final synchronized zzbgm zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbgm zzbgm) {
        this.zza = zzbgm;
    }
}
