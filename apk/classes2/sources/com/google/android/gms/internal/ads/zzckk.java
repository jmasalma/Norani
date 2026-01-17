package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzckk implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzckk(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzckk zza(zzhha zzhha, zzhha zzhha2) {
        return new zzckk(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzu zzu = new zzu(zza2, (String) this.zzb.zzb());
        zzu zzu2 = zzu;
        return zzu;
    }
}
