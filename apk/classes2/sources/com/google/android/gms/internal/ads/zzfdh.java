package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfdh implements zzgdj {
    final /* synthetic */ zzfdi zza;
    final /* synthetic */ int zzb;

    zzfdh(zzfdi zzfdi, int i) {
        this.zzb = i;
        Objects.requireNonNull(zzfdi);
        this.zza = zzfdi;
    }

    public final void zza(Throwable th) {
        zzv.zzp().zzw(th, "BufferingUrlPinger.attributionReportingManager");
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzb((String) obj, this.zzb, (zzcyi) null);
    }
}
