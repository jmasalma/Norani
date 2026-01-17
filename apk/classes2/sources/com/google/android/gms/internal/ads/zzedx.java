package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzedx implements zzedm {
    private final zzcog zza;
    private final Context zzb;
    private final zzdpj zzc;
    private final zzfcw zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbki zzg;
    private final boolean zzh = ((Boolean) zzbd.zzc().zzb(zzbde.zzjo)).booleanValue();
    private final zzecl zzi;
    private final zzdsd zzj;
    private final zzdsj zzk;

    public zzedx(zzcog zzcog, Context context, Executor executor, zzdpj zzdpj, zzfcw zzfcw, VersionInfoParcel versionInfoParcel, zzbki zzbki, zzecl zzecl, zzdsd zzdsd, zzdsj zzdsj) {
        this.zzb = context;
        this.zza = zzcog;
        this.zze = executor;
        this.zzc = zzdpj;
        this.zzd = zzfcw;
        this.zzf = versionInfoParcel;
        this.zzg = zzbki;
        this.zzi = zzecl;
        this.zzj = zzdsd;
        this.zzk = zzdsj;
    }

    public static /* synthetic */ ListenableFuture zzc(zzedx zzedx, zzfca zzfca, zzfcn zzfcn, zzdpn zzdpn, Object obj) {
        zzedx zzedx2;
        zzedx zzedx3 = zzedx;
        zzfca zzfca2 = zzfca;
        zzfcn zzfcn2 = zzfcn;
        zzbcv zzbcv = zzbde.zzct;
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzedx3.zzj.zza().putLong(zzdrr.RENDERING_WEBVIEW_CREATION_START.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdpj zzdpj = zzedx3.zzc;
        zzfcw zzfcw = zzedx3.zzd;
        zzcfg zza2 = zzdpj.zza(zzfcw.zze, zzfca2, zzfcn2.zzb.zzb);
        zza2.zzac(zzfca2.zzW);
        zzdpn.zza(zzedx3.zzb, zza2.zzF());
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzedx3.zzj.zza().putLong(zzdrr.RENDERING_WEBVIEW_CREATION_END.zza(), zzv.zzD().currentTimeMillis());
        }
        zzcak zzcak = new zzcak();
        zzcog zzcog = zzedx3.zza;
        zzcrq zzcrq = new zzcrq(zzfcn2, zzfca2, (String) null);
        VersionInfoParcel versionInfoParcel = zzedx3.zzf;
        boolean z = zzedx3.zzh;
        zzbki zzbki = zzedx3.zzg;
        zzedz zzedz = r1;
        zzbki zzbki2 = zzbki;
        zzcak zzcak2 = zzcak;
        boolean z2 = z;
        zzedz zzedz2 = new zzedz(versionInfoParcel, zzcak, zzfca, zza2, zzfcw, z, zzbki2, zzedx3.zzi, zzedx3.zzk);
        zzcod zza3 = zzcog.zza(zzcrq, new zzdff(zzedz2, zza2), new zzcoe(zzfca2.zzaa));
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzedx2 = zzedx;
            zzedx2.zzj.zza().putLong(zzdrr.RENDERING_AD_COMPONENT_CREATION_END.zza(), zzv.zzD().currentTimeMillis());
        } else {
            zzedx2 = zzedx;
        }
        zzdpi zzh2 = zza3.zzh();
        zzbki zzbki3 = true != z2 ? null : zzbki2;
        zzdsd zzdsd = zzedx2.zzj;
        zzh2.zzi(zza2, false, zzbki3, zzdsd.zza());
        zzcak2.zzc(zza3);
        zza3.zzc().zzo(new zzedv(zza2), zzcaf.zzg);
        zzfcf zzfcf = zzfca2.zzs;
        String str = zzfcf.zza;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfC)).booleanValue() && zza3.zzi().zze(true)) {
            str = zzcgr.zzb(str, zzcgr.zza(zzfca));
        }
        zza3.zzh();
        return zzgdn.zzm(zzdpi.zzj(zza2, zzfcf.zzb, str, zzdsd.zza(), zzcog.zzg()), new zzedw(zzedx2, zza2, zzfca2, zza3), zzedx2.zze);
    }

    public final ListenableFuture zza(zzfcn zzfcn, zzfca zzfca) {
        zzdpn zzdpn = new zzdpn();
        ListenableFuture zzh2 = zzgdn.zzh((Object) null);
        zzedt zzedt = new zzedt(this, zzfca, zzfcn, zzdpn);
        Executor executor = this.zze;
        ListenableFuture zzn = zzgdn.zzn(zzh2, zzedt, executor);
        Objects.requireNonNull(zzdpn);
        zzn.addListener(new zzedu(zzdpn), executor);
        return zzn;
    }

    public final boolean zzb(zzfcn zzfcn, zzfca zzfca) {
        zzfcf zzfcf = zzfca.zzs;
        return (zzfcf == null || zzfcf.zza == null) ? false : true;
    }
}
