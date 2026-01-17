package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzefj implements zzdgn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfca zzd;
    private final zzcfg zze;
    private final zzfcw zzf;
    private final zzbki zzg;
    private final boolean zzh;
    private final zzecl zzi;
    private final zzdsj zzj;

    zzefj(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfca zzfca, zzcfg zzcfg, zzfcw zzfcw, boolean z, zzbki zzbki, zzecl zzecl, zzdsj zzdsj) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfca;
        this.zze = zzcfg;
        this.zzf = zzfcw;
        this.zzg = zzbki;
        this.zzh = z;
        this.zzi = zzecl;
        this.zzj = zzdsj;
    }

    public final zzfca zza() {
        return this.zzd;
    }

    public final void zzb(boolean z, Context context, zzcwl zzcwl) {
        zzdfc zzdfc = (zzdfc) zzgdn.zzq(this.zzc);
        zzcfg zzcfg = this.zze;
        zzcfg.zzaq(true);
        boolean z2 = this.zzh;
        boolean zze2 = z2 ? this.zzg.zze(false) : false;
        zzv.zzr();
        boolean zzJ = zzs.zzJ(this.zza);
        boolean z3 = z2 && this.zzg.zzd();
        float zza2 = z2 ? this.zzg.zza() : 0.0f;
        zzfca zzfca = this.zzd;
        zzl zzl = new zzl(zze2, zzJ, z3, zza2, -1, z, zzfca.zzO, false);
        if (zzcwl != null) {
            zzcwl.zzf();
        }
        zzv.zzj();
        zzdgc zzh2 = zzdfc.zzh();
        int i = zzfca.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzfca.zzB;
        zzfcf zzfcf = zzfca.zzs;
        AdOverlayInfoParcel adOverlayInfoParcel = r2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, zzh2, (zzad) null, zzcfg, i, versionInfoParcel, str, zzl, zzfcf.zzb, zzfcf.zza, this.zzf.zzf, zzcwl, zzfca.zzb() ? this.zzi : null, zzcfg.zzr());
        zzn.zza(context, adOverlayInfoParcel, true, this.zzj);
    }
}
