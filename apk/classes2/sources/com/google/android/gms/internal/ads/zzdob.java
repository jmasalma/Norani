package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzr;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdob extends zzdnl implements zzded {
    private zzded zza;

    public final synchronized void zzdH() {
        zzded zzded = this.zza;
        if (zzded != null) {
            zzded.zzdH();
        }
    }

    public final synchronized void zzdf() {
        zzded zzded = this.zza;
        if (zzded != null) {
            zzded.zzdf();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzi(zza zza2, zzbiv zzbiv, zzr zzr, zzbix zzbix, zzad zzad, zzded zzded) {
        super.zzh(zza2, zzbiv, zzr, zzbix, zzad);
        this.zza = zzded;
    }
}
