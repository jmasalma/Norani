package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeng implements zzeub {
    private final String zza;
    private final boolean zzb;

    public zzeng(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        zzcva zzcva = (zzcva) obj;
        if (str != null) {
            Bundle zza2 = zzfdk.zza(zzcva.zza, "pii");
            zza2.putString("afai", str);
            zza2.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
