package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeie implements zzedm {
    private final Context zza;
    private final zzdpj zzb;
    private final zzdos zzc;
    private final zzfcw zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbki zzg;
    private final boolean zzh = ((Boolean) zzbd.zzc().zzb(zzbde.zzjo)).booleanValue();
    private final zzecl zzi;
    private final zzdsd zzj;
    private final zzdsj zzk;

    public zzeie(Context context, VersionInfoParcel versionInfoParcel, zzfcw zzfcw, Executor executor, zzdos zzdos, zzdpj zzdpj, zzbki zzbki, zzecl zzecl, zzdsd zzdsd, zzdsj zzdsj) {
        this.zza = context;
        this.zzd = zzfcw;
        this.zzc = zzdos;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdpj;
        this.zzg = zzbki;
        this.zzi = zzecl;
        this.zzj = zzdsd;
        this.zzk = zzdsj;
    }

    public static /* synthetic */ ListenableFuture zzc(zzeie zzeie, zzfca zzfca, zzfcn zzfcn, zzdpn zzdpn, Object obj) {
        zzeie zzeie2 = zzeie;
        zzfca zzfca2 = zzfca;
        zzfcn zzfcn2 = zzfcn;
        zzbcv zzbcv = zzbde.zzct;
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzeie2.zzj.zza().putLong(zzdrr.RENDERING_WEBVIEW_CREATION_START.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdpj zzdpj = zzeie2.zzb;
        zzfcw zzfcw = zzeie2.zzd;
        zzcfg zza2 = zzdpj.zza(zzfcw.zze, zzfca2, zzfcn2.zzb.zzb);
        zza2.zzac(zzfca2.zzW);
        Context context = zzeie2.zza;
        zzdpn.zza(context, zza2.zzF());
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzeie2.zzj.zza().putLong(zzdrr.RENDERING_WEBVIEW_CREATION_END.zza(), zzv.zzD().currentTimeMillis());
        }
        zzcak zzcak = new zzcak();
        zzdos zzdos = zzeie2.zzc;
        zzcrq zzcrq = new zzcrq(zzfcn2, zzfca2, (String) null);
        VersionInfoParcel versionInfoParcel = zzeie2.zzf;
        zzbki zzbki = zzeie2.zzg;
        boolean z = zzeie2.zzh;
        zzecl zzecl = zzeie2.zzi;
        zzdsd zzdsd = zzeie2.zzj;
        boolean z2 = z;
        zzbki zzbki2 = zzbki;
        zzcfg zzcfg = zza2;
        zzdos zzdos2 = zzdos;
        zzdoo zzd2 = zzdos2.zzd(zzcrq, new zzdop(new zzeid(context, zzdpj, zzfcw, versionInfoParcel, zzfca, zzcak, zza2, zzbki2, z2, zzecl, zzdsd, zzeie2.zzk), zzcfg));
        zzcak.zzc(zzd2);
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzdsd.zza().putLong(zzdrr.RENDERING_AD_COMPONENT_CREATION_END.zza(), zzv.zzD().currentTimeMillis());
        }
        zzbkx.zzb(zzcfg, zzd2.zzg());
        zzd2.zzc().zzo(new zzehx(zzcfg), zzcaf.zzg);
        zzd2.zzl().zzi(zzcfg, true, true != z2 ? null : zzbki2, zzdsd.zza());
        zzfca zzfca3 = zzfca;
        zzfcf zzfcf = zzfca3.zzs;
        String str = zzfcf.zza;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfC)).booleanValue() && zzd2.zzm().zze(true)) {
            str = zzcgr.zzb(str, zzcgr.zza(zzfca));
        }
        zzd2.zzl();
        ListenableFuture zzj2 = zzdpi.zzj(zzcfg, zzfcf.zzb, str, zzdsd.zza(), zzdos2.zzg());
        zzeie zzeie3 = zzeie;
        return zzgdn.zzm(zzj2, new zzehy(zzeie3, zzcfg, zzfca3, zzd2), zzeie3.zze);
    }

    public final ListenableFuture zza(zzfcn zzfcn, zzfca zzfca) {
        zzdpn zzdpn = new zzdpn();
        ListenableFuture zzh2 = zzgdn.zzh((Object) null);
        zzehz zzehz = new zzehz(this, zzfca, zzfcn, zzdpn);
        Executor executor = this.zze;
        ListenableFuture zzn = zzgdn.zzn(zzh2, zzehz, executor);
        Objects.requireNonNull(zzdpn);
        zzn.addListener(new zzeia(zzdpn), executor);
        return zzn;
    }

    public final boolean zzb(zzfcn zzfcn, zzfca zzfca) {
        zzfcf zzfcf = zzfca.zzs;
        return (zzfcf == null || zzfcf.zza == null) ? false : true;
    }
}
