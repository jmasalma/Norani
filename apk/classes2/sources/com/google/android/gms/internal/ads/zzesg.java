package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzesg implements zzeuc {
    private final zzgdy zza;
    private final zzfcw zzb;
    private final PackageInfo zzc;
    private final zzg zzd;

    public zzesg(zzgdy zzgdy, zzfcw zzfcw, PackageInfo packageInfo, zzg zzg) {
        this.zza = zzgdy;
        this.zzb = zzfcw;
        this.zzc = packageInfo;
        this.zzd = zzg;
    }

    public static /* synthetic */ zzesh zzc(zzesg zzesg) {
        return new zzesh(zzesg.zzb, zzesg.zzc, zzesg.zzd);
    }

    public final int zza() {
        return 26;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzesf(this));
    }
}
