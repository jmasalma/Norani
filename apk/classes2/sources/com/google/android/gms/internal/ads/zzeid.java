package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeid implements zzdgn {
    private final Context zza;
    private final zzdpj zzb;
    private final zzfcw zzc;
    private final VersionInfoParcel zzd;
    private final zzfca zze;
    private final ListenableFuture zzf;
    private final zzcfg zzg;
    private final zzbki zzh;
    private final boolean zzi;
    private final zzecl zzj;
    private final zzdsd zzk;
    private final zzdsj zzl;

    zzeid(Context context, zzdpj zzdpj, zzfcw zzfcw, VersionInfoParcel versionInfoParcel, zzfca zzfca, ListenableFuture listenableFuture, zzcfg zzcfg, zzbki zzbki, boolean z, zzecl zzecl, zzdsd zzdsd, zzdsj zzdsj) {
        this.zza = context;
        this.zzb = zzdpj;
        this.zzc = zzfcw;
        this.zzd = versionInfoParcel;
        this.zze = zzfca;
        this.zzf = listenableFuture;
        this.zzg = zzcfg;
        this.zzh = zzbki;
        this.zzi = z;
        this.zzj = zzecl;
        this.zzk = zzdsd;
        this.zzl = zzdsj;
    }

    public final zzfca zza() {
        return this.zze;
    }

    public final void zzb(boolean z, Context context, zzcwl zzcwl) {
        zzdoo zzdoo = (zzdoo) zzgdn.zzq(this.zzf);
        try {
            zzfca zzfca = this.zze;
            zzcfg zzcfg = this.zzg;
            zzecl zzecl = null;
            if (zzcfg.zzaG()) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzbb)).booleanValue()) {
                    zzcfg = this.zzb.zza(this.zzc.zze, (zzfca) null, (zzfcd) null);
                    zzbkx.zzb(zzcfg, zzdoo.zzg());
                    zzdpn zzdpn = new zzdpn();
                    zzdpn.zza(this.zza, zzcfg.zzF());
                    zzdoo.zzl().zzi(zzcfg, true, this.zzi ? this.zzh : null, this.zzk.zza());
                    zzcfg.zzN().zzC(new zzeib(zzdpn, zzcfg));
                    zzcgy zzN = zzcfg.zzN();
                    Objects.requireNonNull(zzcfg);
                    zzN.zzK(new zzeic(zzcfg));
                    zzfcf zzfcf = zzfca.zzs;
                    zzcfg.zzae(zzfcf.zzb, zzfcf.zza, (String) null);
                }
            }
            zzcfg zzcfg2 = zzcfg;
            zzcfg2.zzaq(true);
            boolean z2 = this.zzi;
            boolean zze2 = z2 ? this.zzh.zze(false) : false;
            zzv.zzr();
            boolean zzJ = zzs.zzJ(this.zza);
            boolean z3 = z2 && this.zzh.zzd();
            float zza2 = z2 ? this.zzh.zza() : 0.0f;
            zzfca zzfca2 = this.zze;
            zzl zzl2 = new zzl(zze2, zzJ, z3, zza2, -1, z, zzfca2.zzO, zzfca2.zzP);
            if (zzcwl != null) {
                zzcwl.zzf();
            }
            zzv.zzj();
            zzdgc zzh2 = zzdoo.zzh();
            int i = zzfca2.zzQ;
            VersionInfoParcel versionInfoParcel = this.zzd;
            String str = zzfca2.zzB;
            zzfcf zzfcf2 = zzfca2.zzs;
            String str2 = zzfcf2.zzb;
            String str3 = zzfcf2.zza;
            zzfcw zzfcw = this.zzc;
            if (zzfca2.zzb()) {
                zzecl = this.zzj;
            }
            zzn.zza(context, new AdOverlayInfoParcel((zza) null, zzh2, (zzad) null, zzcfg2, i, versionInfoParcel, str, zzl2, str2, str3, zzfcw.zzf, zzcwl, zzecl, zzcfg2.zzr()), true, this.zzl);
        } catch (zzcfs e) {
            int i2 = zze.zza;
            zzo.zzh("", e);
        }
    }
}
