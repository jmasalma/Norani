package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzflg extends zzbxb {
    final /* synthetic */ zzgeh zza;
    final /* synthetic */ zzbwv zzb;
    final /* synthetic */ zzflh zzc;

    zzflg(zzflh zzflh, zzgeh zzgeh, zzbwv zzbwv) {
        this.zza = zzgeh;
        this.zzb = zzbwv;
        Objects.requireNonNull(zzflh);
        this.zzc = zzflh;
    }

    public final void zze(int i) {
    }

    public final void zzf(zze zze) {
        String adError = zze.zzb().toString();
        zzflh zzflh = this.zzc;
        String str = zzflh.zze.zza;
        zzo.zzj("Failed to load rewarded ad with error: " + adError + ", adUnitId: " + str);
        Objects.requireNonNull(zzflh);
        zzflh.zzL(zze);
    }

    public final void zzg() {
        Objects.requireNonNull(this.zzc);
        zzfkb.zza(this.zzb, this.zza);
    }
}
