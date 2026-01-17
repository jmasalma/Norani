package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdul implements zzgdj {
    final /* synthetic */ zzdun zza;

    zzdul(zzdun zzdun) {
        Objects.requireNonNull(zzdun);
        this.zza = zzdun;
    }

    public final void zza(Throwable th) {
        synchronized (this) {
            zzdun zzdun = this.zza;
            zzdun.zzc = true;
            zzdun.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzv.zzD().elapsedRealtime() - zzdun.zzd));
            zzdun.zze.zzd(new Exception());
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        String str = (String) obj;
        synchronized (this) {
            zzdun zzdun = this.zza;
            zzdun.zzc = true;
            zzdun.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (zzv.zzD().elapsedRealtime() - zzdun.zzd));
            zzdun.zzi.execute(new zzduk(this, str));
        }
    }
}
