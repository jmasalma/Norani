package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeuj implements zzeub {
    private final int zza;
    private final int zzb;

    zzeuj(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i;
        Bundle bundle = ((zzcva) obj).zza;
        int i2 = this.zza;
        if (i2 != -1 && (i = this.zzb) != -1) {
            bundle.putInt("sessions_without_flags", i2);
            bundle.putInt("crashes_without_flags", i);
            int i3 = zzbb.zza;
            if (zzbd.zzc().zze()) {
                bundle.putBoolean("did_reset", true);
            }
        }
    }
}
