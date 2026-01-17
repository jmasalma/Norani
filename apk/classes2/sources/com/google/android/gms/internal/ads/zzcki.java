package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcki implements zzhgr {
    private final zzhha zza;

    private zzcki(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzcki zza(zzhha zzhha) {
        return new zzcki(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzfot zzfot = new zzfot(zza2, zzv.zzv().zzb());
        zzfot zzfot2 = zzfot;
        return zzfot;
    }
}
