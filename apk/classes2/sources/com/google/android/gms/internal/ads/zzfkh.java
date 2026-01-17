package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfkh extends zzbm {
    final /* synthetic */ zzgeh zza;
    final /* synthetic */ zzbx zzb;
    final /* synthetic */ zzfki zzc;

    zzfkh(zzfki zzfki, zzgeh zzgeh, zzbx zzbx) {
        this.zza = zzgeh;
        this.zzb = zzbx;
        Objects.requireNonNull(zzfki);
        this.zzc = zzfki;
    }

    public final void zzb(zze zze) {
        String adError = zze.zzb().toString();
        zzfki zzfki = this.zzc;
        String str = zzfki.zze.zza;
        zzo.zzj("Failed to load interstitial ad with error: " + adError + " for ad unit: " + str);
        Objects.requireNonNull(zzfki);
        zzfki.zzL(zze);
    }

    public final void zzc() {
        Objects.requireNonNull(this.zzc);
        zzfkb.zza(this.zzb, this.zza);
    }
}
