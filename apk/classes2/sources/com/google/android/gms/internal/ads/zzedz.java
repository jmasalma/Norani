package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzedz implements zzdgn {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfca zzc;
    private final zzcfg zzd;
    private final zzfcw zze;
    private final zzbki zzf;
    private final boolean zzg;
    private final zzecl zzh;
    private final zzdsj zzi;

    zzedz(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfca zzfca, zzcfg zzcfg, zzfcw zzfcw, boolean z, zzbki zzbki, zzecl zzecl, zzdsj zzdsj) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfca;
        this.zzd = zzcfg;
        this.zze = zzfcw;
        this.zzg = z;
        this.zzf = zzbki;
        this.zzh = zzecl;
        this.zzi = zzdsj;
    }

    public final zzfca zza() {
        return this.zzc;
    }

    public final void zzb(boolean z, Context context, zzcwl zzcwl) {
        zzcod zzcod = (zzcod) zzgdn.zzq(this.zzb);
        zzcfg zzcfg = this.zzd;
        zzcfg.zzaq(true);
        boolean z2 = this.zzg;
        boolean zze2 = z2 ? this.zzf.zze(true) : true;
        boolean z3 = z2 && this.zzf.zzd();
        float zza2 = z2 ? this.zzf.zza() : 0.0f;
        zzfca zzfca = this.zzc;
        zzl zzl = new zzl(zze2, true, z3, zza2, -1, z, zzfca.zzO, false);
        if (zzcwl != null) {
            zzcwl.zzf();
        }
        zzv.zzj();
        zzdgc zzg2 = zzcod.zzg();
        int i = zzfca.zzQ;
        if (i == -1) {
            zzx zzx = this.zze.zzj;
            if (zzx != null) {
                int i2 = zzx.zza;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                }
            }
            int i3 = zze.zza;
            zzo.zze("Error setting app open orientation; no targeting orientation available.");
        }
        int i4 = i;
        VersionInfoParcel versionInfoParcel = this.zza;
        String str = zzfca.zzB;
        zzfcf zzfcf = zzfca.zzs;
        AdOverlayInfoParcel adOverlayInfoParcel = r2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, zzg2, (zzad) null, zzcfg, i4, versionInfoParcel, str, zzl, zzfcf.zzb, zzfcf.zza, this.zze.zzf, zzcwl, zzfca.zzb() ? this.zzh : null, zzcfg.zzr());
        zzn.zza(context, adOverlayInfoParcel, true, this.zzi);
    }
}
