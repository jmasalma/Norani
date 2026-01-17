package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzr;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzdnl implements zza, zzbiv, zzr, zzbix, zzad {
    private zza zza;
    private zzbiv zzb;
    private zzr zzc;
    private zzbix zzd;
    private zzad zze;

    public final synchronized void onAdClicked() {
        zza zza2 = this.zza;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final synchronized void zza(String str, Bundle bundle) {
        zzbiv zzbiv = this.zzb;
        if (zzbiv != null) {
            zzbiv.zza(str, bundle);
        }
    }

    public final synchronized void zzb(String str, String str2) {
        zzbix zzbix = this.zzd;
        if (zzbix != null) {
            zzbix.zzb(str, str2);
        }
    }

    public final synchronized void zzd() {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzd();
        }
    }

    public final synchronized void zzdk() {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzdk();
        }
    }

    public final synchronized void zzds() {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzds();
        }
    }

    public final synchronized void zzdt() {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzdt();
        }
    }

    public final synchronized void zzdv() {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzdv();
        }
    }

    public final synchronized void zzdw(int i) {
        zzr zzr = this.zzc;
        if (zzr != null) {
            zzr.zzdw(i);
        }
    }

    public final synchronized void zzg() {
        zzad zzad = this.zze;
        if (zzad != null) {
            zzad.zzg();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzh(zza zza2, zzbiv zzbiv, zzr zzr, zzbix zzbix, zzad zzad) {
        this.zza = zza2;
        this.zzb = zzbiv;
        this.zzc = zzr;
        this.zzd = zzbix;
        this.zze = zzad;
    }
}
