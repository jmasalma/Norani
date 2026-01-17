package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdmb implements zzgdj {
    final /* synthetic */ zzcak zza;

    zzdmb(zzdmc zzdmc, zzcak zzcak) {
        this.zza = zzcak;
        Objects.requireNonNull(zzdmc);
    }

    public final void zza(Throwable th) {
        int i = zze.zza;
        zzo.zzg("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfg zzcfg = (zzcfg) obj;
        if (zzcfg != null) {
            zzcfg.zzag("/video", new zzccz(new zzdma(this.zza)));
            zzcfg.zzaa();
            return;
        }
        this.zza.zzd(new zzehf(1, "Missing webview from video view future."));
    }
}
