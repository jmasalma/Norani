package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcnb implements zzgdj {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcnc zzb;

    zzcnb(zzcnc zzcnc, String str) {
        this.zza = str;
        Objects.requireNonNull(zzcnc);
        this.zzb = zzcnc;
    }

    public final void zza(Throwable th) {
        String str = this.zza;
        zzcnc zzcnc = this.zzb;
        zzcnc.zzh.zza(zzcnc.zzg.zze(zzcnc.zze, zzcnc.zzf, false, str, (String) null, zzcnc.zzx(), zzcnc.zzo), (zzcyi) null);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcnc zzcnc = this.zzb;
        zzcnc.zzh.zza(zzcnc.zzg.zze(zzcnc.zze, zzcnc.zzf, false, this.zza, (String) obj, zzcnc.zzx(), zzcnc.zzo), zzcnc.zzn);
    }
}
