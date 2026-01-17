package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzboy implements zzcam {
    final /* synthetic */ zzcak zza;
    final /* synthetic */ zzboc zzb;

    zzboy(zzbpa zzbpa, zzcak zzcak, zzboc zzboc) {
        this.zza = zzcak;
        this.zzb = zzboc;
        Objects.requireNonNull(zzbpa);
    }

    public final void zza() {
        zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbol("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
