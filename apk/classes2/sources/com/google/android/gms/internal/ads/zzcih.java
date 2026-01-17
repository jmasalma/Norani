package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcih implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcih(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzcih zzc(zzhha zzhha, zzhha zzhha2) {
        return new zzcih(zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzbvk zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzfhx zzfhx = (zzfhx) this.zzb.zzb();
        zzbow zzb2 = zzv.zzg().zzb(zza2, VersionInfoParcel.forPackage(), zzfhx);
        zzboq zzboq = zzbot.zza;
        zzb2.zza("google.afma.request.getAdDictionary", zzboq, zzboq);
        return new zzbvm(zza2, zzv.zzg().zzb(zza2, VersionInfoParcel.forPackage(), zzfhx).zza("google.afma.sdkConstants.getSdkConstants", zzboq, zzboq), VersionInfoParcel.forPackage());
    }
}
