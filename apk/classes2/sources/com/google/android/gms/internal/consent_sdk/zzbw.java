package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class zzbw implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;

    public zzbw(zzdr zzdr, zzdr zzdr2, zzdr zzdr3) {
        this.zza = zzdr;
        this.zzb = zzdr3;
    }

    /* renamed from: zzb */
    public final zzbv zza() {
        Handler zzb2 = zzat.zzb();
        Handler handler = zzb2;
        zzcb zzb3 = ((zzcc) this.zzb).zza();
        zzcb zzcb = zzb3;
        return new zzbv((zzbx) this.zza.zza(), zzb2, zzb3);
    }
}
