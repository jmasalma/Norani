package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdpi {
    private final zzcvw zza;
    private final zzdeb zzb;
    /* access modifiers changed from: private */
    public final zzcxf zzc;
    private final zzcxs zzd;
    private final zzcye zze;
    private final zzdaz zzf;
    private final Executor zzg;
    private final zzddx zzh;
    private final zzcnn zzi;
    private final zzb zzj;
    private final zzbya zzk;
    private final zzavu zzl;
    /* access modifiers changed from: private */
    public final zzdaq zzm;
    private final zzeca zzn;
    private final zzfjy zzo;
    private final zzdsj zzp;
    private final zzcmq zzq;
    private final zzdpo zzr;

    public zzdpi(zzcvw zzcvw, zzcxf zzcxf, zzcxs zzcxs, zzcye zzcye, zzdaz zzdaz, Executor executor, zzddx zzddx, zzcnn zzcnn, zzb zzb2, zzbya zzbya, zzavu zzavu, zzdaq zzdaq, zzeca zzeca, zzfjy zzfjy, zzdsj zzdsj, zzdeb zzdeb, zzcmq zzcmq, zzdpo zzdpo) {
        this.zza = zzcvw;
        this.zzc = zzcxf;
        this.zzd = zzcxs;
        this.zze = zzcye;
        this.zzf = zzdaz;
        this.zzg = executor;
        this.zzh = zzddx;
        this.zzi = zzcnn;
        this.zzj = zzb2;
        this.zzk = zzbya;
        this.zzl = zzavu;
        this.zzm = zzdaq;
        this.zzn = zzeca;
        this.zzo = zzfjy;
        this.zzp = zzdsj;
        this.zzb = zzdeb;
        this.zzq = zzcmq;
        this.zzr = zzdpo;
    }

    public static /* synthetic */ boolean zzh(zzdpi zzdpi, View view, MotionEvent motionEvent) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkx)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            zzdpi.zzr.zzb(motionEvent);
        }
        zzdpi.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public static final ListenableFuture zzj(zzcfg zzcfg, String str, String str2, Bundle bundle, zzfhu zzfhu) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzct)).booleanValue()) {
            bundle.putLong(zzdrr.RENDERING_WEBVIEW_LOAD_HTML_START.zza(), zzv.zzD().currentTimeMillis());
        }
        zzcak zzcak = new zzcak();
        if (((Boolean) zzbex.zzf.zze()).booleanValue()) {
            zzfhj zza2 = zzfhi.zza(zzcfg.getContext(), 112);
            zza2.zzi();
            zzfht.zza(zzcak, zzfhu, zza2);
        }
        zzcfg.zzN().zzC(new zzdpg(bundle, zzcak));
        zzcfg.zzae(str, str2, (String) null);
        return zzcak;
    }

    public final void zzi(zzcfg zzcfg, boolean z, zzbki zzbki, Bundle bundle) {
        zzavp zzc2;
        zzcfg zzcfg2 = zzcfg;
        Bundle bundle2 = bundle;
        zzbcv zzbcv = zzbde.zzct;
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            bundle2.putLong(zzdrr.RENDERING_CONFIGURE_WEBVIEW_START.zza(), zzv.zzD().currentTimeMillis());
        }
        zzcgy zzN = zzcfg.zzN();
        zzdoz zzdoz = r4;
        zzdoz zzdoz2 = new zzdoz(this);
        zzcxs zzcxs = this.zzd;
        zzcye zzcye = this.zze;
        zzdpa zzdpa = r4;
        zzdpa zzdpa2 = new zzdpa(this);
        zzdpb zzdpb = r4;
        zzdpb zzdpb2 = new zzdpb(this);
        zzb zzb2 = this.zzj;
        zzdph zzdph = r4;
        zzdph zzdph2 = new zzdph(this);
        zzN.zzX(zzdoz, zzcxs, zzcye, zzdpa, zzdpb, z, zzbki, zzb2, zzdph, this.zzk, this.zzn, this.zzo, this.zzp, (zzbkz) null, this.zzb, (zzbky) null, (zzbks) null, (zzbkg) null, this.zzq);
        zzcfg2.setOnTouchListener(new zzdpc(this));
        zzcfg2.setOnClickListener(new zzdpd(this));
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcT)).booleanValue() && (zzc2 = this.zzl.zzc()) != null) {
            zzc2.zzo(zzcfg.zzF());
        }
        zzddx zzddx = this.zzh;
        Executor executor = this.zzg;
        zzddx.zzo(zzcfg2, executor);
        zzddx.zzo(new zzdpe(zzcfg2), executor);
        zzddx.zza(zzcfg.zzF());
        zzcfg2.zzag("/trackActiveViewUnit", new zzdpf(this, zzcfg2));
        this.zzi.zzi(zzcfg2);
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            bundle2.putLong(zzdrr.RENDERING_CONFIGURE_WEBVIEW_END.zza(), zzv.zzD().currentTimeMillis());
        }
    }
}
