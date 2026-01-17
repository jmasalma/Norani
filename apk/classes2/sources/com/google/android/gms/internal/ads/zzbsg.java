package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbsg implements zzr {
    final /* synthetic */ zzbsi zza;

    zzbsg(zzbsi zzbsi) {
        Objects.requireNonNull(zzbsi);
        this.zza = zzbsi;
    }

    public final void zzd() {
        zzo.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzdk() {
        zzo.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void zzds() {
        zzo.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    public final void zzdt() {
        zzo.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbsi zzbsi = this.zza;
        zzbsi.zzb.onAdOpened(zzbsi);
    }

    public final void zzdv() {
    }

    public final void zzdw(int i) {
        zzo.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbsi zzbsi = this.zza;
        zzbsi.zzb.onAdClosed(zzbsi);
    }
}
