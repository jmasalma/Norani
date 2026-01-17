package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeom implements zzeub {
    private final double zza;
    private final boolean zzb;

    public zzeom(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcva) obj).zza;
        Bundle zza2 = zzfdk.zza(bundle, "device");
        bundle.putBundle("device", zza2);
        Bundle zza3 = zzfdk.zza(zza2, "battery");
        zza2.putBundle("battery", zza3);
        zza3.putBoolean("is_charging", this.zzb);
        zza3.putDouble("battery_level", this.zza);
    }
}
