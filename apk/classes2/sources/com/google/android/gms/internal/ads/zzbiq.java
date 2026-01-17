package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbiq {
    /* access modifiers changed from: private */
    public final zzg zza;
    /* access modifiers changed from: private */
    public final zzf zzb;
    private zzbhk zzc;

    public zzbiq(zzg zzg, zzf zzf) {
        this.zza = zzg;
        this.zzb = zzf;
    }

    /* access modifiers changed from: private */
    public final synchronized zzbhk zzf(zzbhj zzbhj) {
        zzbhk zzbhk = this.zzc;
        if (zzbhk != null) {
            return zzbhk;
        }
        zzbhk zzbhk2 = new zzbhk(zzbhj);
        this.zzc = zzbhk2;
        return zzbhk2;
    }

    public final zzbht zzc() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbin(this, (zzbip) null);
    }

    public final zzbhw zzd() {
        return new zzbio(this, (zzbip) null);
    }
}
