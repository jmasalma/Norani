package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcna implements zzgdj {
    final /* synthetic */ zzcnc zza;

    zzcna(zzcnc zzcnc) {
        Objects.requireNonNull(zzcnc);
        this.zza = zzcnc;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcnc zzcnc = this.zza;
        zzfdi zzl = zzcnc.zzh;
        List zze = zzcnc.zzg.zze(zzcnc.zze, zzcnc.zzf, false, "", (String) obj, zzcnc.zzf.zzc, (zzcuu) null);
        int i = 1;
        if (true == zzv.zzp().zzA(zzcnc.zza)) {
            i = 2;
        }
        zzl.zzc(zze, i);
    }
}
