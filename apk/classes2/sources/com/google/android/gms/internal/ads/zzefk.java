package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzefk implements zzedm {
    private final Context zza;
    private final zzdpj zzb;
    private final zzdgf zzc;
    private final zzfcw zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbki zzg;
    private final boolean zzh = ((Boolean) zzbd.zzc().zzb(zzbde.zzjo)).booleanValue();
    private final zzecl zzi;
    private final zzdsd zzj;
    private final zzdsj zzk;

    public zzefk(Context context, VersionInfoParcel versionInfoParcel, zzfcw zzfcw, Executor executor, zzdgf zzdgf, zzdpj zzdpj, zzbki zzbki, zzecl zzecl, zzdsd zzdsd, zzdsj zzdsj) {
        this.zza = context;
        this.zzd = zzfcw;
        this.zzc = zzdgf;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdpj;
        this.zzg = zzbki;
        this.zzi = zzecl;
        this.zzj = zzdsd;
        this.zzk = zzdsj;
    }

    public static /* synthetic */ ListenableFuture zzc(zzefk zzefk, zzfca zzfca, zzfcn zzfcn, zzdpn zzdpn, Object obj) {
        zzefk zzefk2;
        zzefk zzefk3 = zzefk;
        zzfca zzfca2 = zzfca;
        zzfcn zzfcn2 = zzfcn;
        zzbcv zzbcv = zzbde.zzct;
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzefk3.zzj.zza().putLong(zzdrr.RENDERING_WEBVIEW_CREATION_START.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdpj zzdpj = zzefk3.zzb;
        zzfcw zzfcw = zzefk3.zzd;
        zzcfg zza2 = zzdpj.zza(zzfcw.zze, zzfca2, zzfcn2.zzb.zzb);
        zza2.zzac(zzfca2.zzW);
        Context context = zzefk3.zza;
        zzdpn.zza(context, zza2.zzF());
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzefk3.zzj.zza().putLong(zzdrr.RENDERING_WEBVIEW_CREATION_END.zza(), zzv.zzD().currentTimeMillis());
        }
        zzcak zzcak = new zzcak();
        zzdgf zzdgf = zzefk3.zzc;
        zzcrq zzcrq = new zzcrq(zzfcn2, zzfca2, (String) null);
        VersionInfoParcel versionInfoParcel = zzefk3.zzf;
        boolean z = zzefk3.zzh;
        zzbki zzbki = zzefk3.zzg;
        zzbki zzbki2 = zzbki;
        boolean z2 = z;
        zzbcv zzbcv2 = zzbcv;
        zzcak zzcak2 = zzcak;
        zzdgf zzdgf2 = zzdgf;
        zzdfc zzd2 = zzdgf2.zzd(zzcrq, new zzdff(new zzefj(context, versionInfoParcel, zzcak, zzfca, zza2, zzfcw, z, zzbki2, zzefk3.zzi, zzefk3.zzk), zza2));
        zzcak2.zzc(zzd2);
        if (((Boolean) zzbd.zzc().zzb(zzbcv2)).booleanValue()) {
            zzefk2 = zzefk;
            zzefk2.zzj.zza().putLong(zzdrr.RENDERING_AD_COMPONENT_CREATION_END.zza(), zzv.zzD().currentTimeMillis());
        } else {
            zzefk2 = zzefk;
        }
        zzd2.zzc().zzo(new zzefh(zza2), zzcaf.zzg);
        zzfca zzfca3 = zzfca;
        zzfcf zzfcf = zzfca3.zzs;
        String str = zzfcf.zza;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfC)).booleanValue() && zzd2.zzl().zze(true)) {
            str = zzcgr.zzb(str, zzcgr.zza(zzfca));
        }
        zzdpi zzi2 = zzd2.zzi();
        zzbki zzbki3 = true != z2 ? null : zzbki2;
        zzdsd zzdsd = zzefk2.zzj;
        zzi2.zzi(zza2, true, zzbki3, zzdsd.zza());
        zzd2.zzi();
        return zzgdn.zzm(zzdpi.zzj(zza2, zzfcf.zzb, str, zzdsd.zza(), zzdgf2.zze()), new zzefi(zzefk2, zza2, zzfca3, zzd2), zzefk2.zze);
    }

    public final ListenableFuture zza(zzfcn zzfcn, zzfca zzfca) {
        zzdpn zzdpn = new zzdpn();
        ListenableFuture zzh2 = zzgdn.zzh((Object) null);
        zzeff zzeff = new zzeff(this, zzfca, zzfcn, zzdpn);
        Executor executor = this.zze;
        ListenableFuture zzn = zzgdn.zzn(zzh2, zzeff, executor);
        Objects.requireNonNull(zzdpn);
        zzn.addListener(new zzefg(zzdpn), executor);
        return zzn;
    }

    public final boolean zzb(zzfcn zzfcn, zzfca zzfca) {
        zzfcf zzfcf = zzfca.zzs;
        return (zzfcf == null || zzfcf.zza == null) ? false : true;
    }
}
