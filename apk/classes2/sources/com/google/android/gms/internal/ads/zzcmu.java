package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzv;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcmu implements zzcwb {
    private final zzfcd zza;
    private final zzfcn zzb;
    private final zzfju zzc;
    private final zzfjy zzd;

    public zzcmu(zzfcn zzfcn, zzfjy zzfjy, zzfju zzfju) {
        this.zzb = zzfcn;
        this.zzd = zzfjy;
        this.zzc = zzfju;
        this.zza = zzfcn.zzb.zzb;
    }

    public final void zzdD(zze zze) {
        List list = this.zza.zza;
        this.zzd.zze(this.zzc.zzd(this.zzb, (zzfca) null, list), (zzv) null);
    }
}
