package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeen implements zzedm {
    private final zzcpx zza;
    private final Context zzb;
    private final zzdpj zzc;
    private final zzfcw zzd;
    private final Executor zze;
    private final zzfve zzf;
    private final zzdsd zzg;

    public zzeen(zzcpx zzcpx, Context context, Executor executor, zzdpj zzdpj, zzfcw zzfcw, zzfve zzfve, zzdsd zzdsd) {
        this.zzb = context;
        this.zza = zzcpx;
        this.zze = executor;
        this.zzc = zzdpj;
        this.zzd = zzfcw;
        this.zzf = zzfve;
        this.zzg = zzdsd;
    }

    public static /* synthetic */ ListenableFuture zzc(zzeen zzeen, zzfcn zzfcn, zzfca zzfca, Object obj) {
        View view;
        zzbcv zzbcv = zzbde.zzct;
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzeen.zzg.zza().putLong(zzdrr.RENDERING_WEBVIEW_CREATION_START.zza(), zzv.zzD().currentTimeMillis());
        }
        Context context = zzeen.zzb;
        zzr zza2 = zzfdc.zza(context, zzfca.zzu);
        zzcfg zza3 = zzeen.zzc.zza(zza2, zzfca, zzfcn.zzb.zzb);
        zza3.zzac(zzfca.zzW);
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzij)).booleanValue() || !zzfca.zzag) {
            view = new zzdpm(context, zza3.zzF(), (zzau) zzeen.zzf.apply(zzfca));
        } else {
            view = zzcqm.zza(context, zza3.zzF(), zzfca);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzeen.zzg.zza().putLong(zzdrr.RENDERING_WEBVIEW_CREATION_END.zza(), zzv.zzD().currentTimeMillis());
        }
        zzcpx zzcpx = zzeen.zza;
        zzcrq zzcrq = new zzcrq(zzfcn, zzfca, (String) null);
        Objects.requireNonNull(zza3);
        zzcot zza4 = zzcpx.zza(zzcrq, new zzcoz(view, zza3, new zzeeh(zza3), zzfdc.zzb(zza2)));
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzeen.zzg.zza().putLong(zzdrr.RENDERING_AD_COMPONENT_CREATION_END.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdpi zzi = zza4.zzi();
        zzdsd zzdsd = zzeen.zzg;
        zzi.zzi(zza3, false, (zzbki) null, zzdsd.zza());
        zzcwq zzc2 = zza4.zzc();
        zzeei zzeei = new zzeei(zza3);
        zzgdy zzgdy = zzcaf.zzg;
        zzc2.zzo(zzeei, zzgdy);
        zzfcf zzfcf = zzfca.zzs;
        String str = zzfcf.zza;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfC)).booleanValue() && zza4.zzl().zze(true)) {
            str = zzcgr.zzb(str, zzcgr.zza(zzfca));
        }
        zza4.zzi();
        ListenableFuture zzj = zzdpi.zzj(zza3, zzfcf.zzb, str, zzdsd.zza(), zzcpx.zzh());
        if (zzfca.zzM) {
            Objects.requireNonNull(zza3);
            zzj.addListener(new zzeej(zza3), zzeen.zze);
        }
        zzj.addListener(new zzeek(zzeen, zza3), zzeen.zze);
        return zzgdn.zzm(zzj, new zzeel(zza4), zzgdy);
    }

    public static /* synthetic */ void zzd(zzeen zzeen, zzcfg zzcfg) {
        zzcfg.zzab();
        zzfcw zzfcw = zzeen.zzd;
        zzcgi zzq = zzcfg.zzq();
        zzgc zzgc = zzfcw.zza;
        if (!(zzgc == null || zzq == null)) {
            zzq.zzs(zzgc);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzbv)).booleanValue() && !zzcfg.isAttachedToWindow()) {
            zzcfg.onPause();
            zzcfg.zzav(true);
        }
    }

    public final ListenableFuture zza(zzfcn zzfcn, zzfca zzfca) {
        return zzgdn.zzn(zzgdn.zzh((Object) null), new zzeem(this, zzfcn, zzfca), this.zze);
    }

    public final boolean zzb(zzfcn zzfcn, zzfca zzfca) {
        zzfcf zzfcf = zzfca.zzs;
        return (zzfcf == null || zzfcf.zza == null) ? false : true;
    }
}
