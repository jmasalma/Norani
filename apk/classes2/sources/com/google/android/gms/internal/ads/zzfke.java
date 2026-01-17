package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfke extends zzbay {
    final /* synthetic */ zzgeh zza;
    final /* synthetic */ zzfv zzb;
    final /* synthetic */ zzfkf zzc;

    zzfke(zzfkf zzfkf, zzgeh zzgeh, zzfv zzfv) {
        this.zza = zzgeh;
        this.zzb = zzfv;
        Objects.requireNonNull(zzfkf);
        this.zzc = zzfkf;
    }

    public final void zzb(int i) {
    }

    public final void zzc(zze zze) {
        String adError = zze.zzb().toString();
        String str = this.zzb.zza;
        zzo.zzj("Failed to load app open ad with error parcel: " + adError + " for ad unit: " + str);
        zzfkf zzfkf = this.zzc;
        Objects.requireNonNull(zzfkf);
        zzfkf.zzL(zze);
    }

    public final void zzd(zzbaw zzbaw) {
        Objects.requireNonNull(this.zzc);
        zzfkb.zza(zzbaw, this.zza);
    }
}
