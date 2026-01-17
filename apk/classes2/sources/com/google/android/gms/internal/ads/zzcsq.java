package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcsq implements zzcxm, zza, zzcza, zzcws, zzcvy, zzdbm {
    private final Clock zza;
    private final zzbzl zzb;

    public zzcsq(Clock clock, zzbzl zzbzl) {
        this.zza = clock;
        this.zzb = zzbzl;
    }

    public final void onAdClicked() {
        this.zzb.zzd();
    }

    public final void zza() {
        this.zzb.zze();
    }

    public final void zzb() {
    }

    public final void zzc() {
    }

    public final void zzdn(zzbvq zzbvq) {
    }

    public final void zzdo(zzfcn zzfcn) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    public final void zzdu(zzbwc zzbwc, String str, String str2) {
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    public final void zzh() {
    }

    public final void zzi(zzbcj.zzb zzb2) {
        this.zzb.zzi();
    }

    public final void zzj(zzbcj.zzb zzb2) {
    }

    public final void zzk(zzm zzm) {
        this.zzb.zzj(zzm);
    }

    public final void zzl(boolean z) {
    }

    public final void zzm(zzbcj.zzb zzb2) {
        this.zzb.zzg();
    }

    public final void zzn(boolean z) {
    }

    public final void zzt() {
        this.zzb.zzf();
    }

    public final void zzu() {
        this.zzb.zzh(true);
    }
}
