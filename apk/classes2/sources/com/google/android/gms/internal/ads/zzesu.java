package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzesu implements zzhgr {
    private final zzhha zza;

    private zzesu(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzesu zza(zzhha zzhha) {
        return new zzesu(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Bundle zza2 = ((zzcvk) this.zza).zza();
        Bundle bundle = zza2;
        return new zzess(zza2);
    }
}
