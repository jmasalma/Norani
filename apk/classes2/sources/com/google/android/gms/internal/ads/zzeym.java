package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeym implements zzelo {
    private final Context zza;
    private final Executor zzb;
    private final zzche zzc;
    private final zzeky zzd;
    private final zzelc zze;
    private final ViewGroup zzf;
    private zzbdz zzg;
    /* access modifiers changed from: private */
    public final zzcyv zzh;
    /* access modifiers changed from: private */
    public final zzfhx zzi;
    /* access modifiers changed from: private */
    public final zzdbb zzj;
    private final zzfcu zzk;
    private ListenableFuture zzl;
    /* access modifiers changed from: private */
    public boolean zzm = true;
    /* access modifiers changed from: private */
    public zze zzn = null;
    private zzeln zzo = null;

    public zzeym(Context context, Executor executor, zzr zzr, zzche zzche, zzeky zzeky, zzelc zzelc, zzfcu zzfcu, zzdbb zzdbb) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzche;
        this.zzd = zzeky;
        this.zze = zzelc;
        this.zzk = zzfcu;
        this.zzh = zzche.zze();
        this.zzi = zzche.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdbb;
        zzfcu.zzt(zzr);
    }

    /* access modifiers changed from: private */
    public final void zzt() {
        this.zzl = null;
        zze zze2 = this.zzn;
        this.zzn = null;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zziA)).booleanValue() && zze2 != null) {
            this.zzb.execute(new zzeyi(this, zze2));
        }
        zzeln zzeln = this.zzo;
        if (zzeln != null) {
            zzeln.zza();
        }
    }

    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzl;
        return listenableFuture != null && !listenableFuture.isDone();
    }

    public final boolean zzb(zzm zzm2, String str, zzelm zzelm, zzeln zzeln) throws RemoteException {
        zzcpx zzcpx;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new zzeyk(this));
            return false;
        }
        if (!zza()) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzjp)).booleanValue() && zzm2.zzf) {
                this.zzc.zzk().zzo(true);
            }
            Bundle zza2 = zzdrt.zza(new Pair(zzdrr.PUBLIC_API_CALL.zza(), Long.valueOf(zzm2.zzz)), new Pair(zzdrr.DYNAMITE_ENTER.zza(), Long.valueOf(zzv.zzD().currentTimeMillis())));
            zzfcu zzfcu = this.zzk;
            zzfcu.zzu(str);
            zzfcu.zzJ(zzm2);
            zzfcu.zzB(zza2);
            Context context = this.zza;
            zzfcw zzL = zzfcu.zzL();
            zzfhj zzb2 = zzfhi.zzb(context, zzfht.zzf(zzL), 3, zzm2);
            zzfhu zzfhu = null;
            if (!((Boolean) zzbfk.zzd.zze()).booleanValue() || !zzfcu.zzi().zzk) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zziA)).booleanValue()) {
                    zzcpw zzd2 = this.zzc.zzd();
                    zzcvf zzcvf = new zzcvf();
                    zzcvf.zzf(context);
                    zzcvf.zzk(zzL);
                    zzd2.zzi(zzcvf.zzl());
                    zzdbu zzdbu = new zzdbu();
                    zzeky zzeky = this.zzd;
                    Executor executor = this.zzb;
                    zzdbu.zzj(zzeky, executor);
                    zzdbu.zzk(zzeky, executor);
                    zzd2.zzf(zzdbu.zzn());
                    zzd2.zze(new zzejh(this.zzg));
                    zzd2.zzd(new zzdgw(zzdje.zza, (zzbk) null));
                    zzd2.zzg(new zzcqs(this.zzh, this.zzj));
                    zzd2.zzc(new zzcop(this.zzf));
                    zzcpx = zzd2.zzk();
                } else {
                    zzcpw zzd3 = this.zzc.zzd();
                    zzcvf zzcvf2 = new zzcvf();
                    zzcvf2.zzf(context);
                    zzcvf2.zzk(zzL);
                    zzd3.zzi(zzcvf2.zzl());
                    zzdbu zzdbu2 = new zzdbu();
                    zzeky zzeky2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdbu2.zzj(zzeky2, executor2);
                    zzdbu2.zza(zzeky2, executor2);
                    zzdbu2.zza(this.zze, executor2);
                    zzdbu2.zzl(zzeky2, executor2);
                    zzdbu2.zzd(zzeky2, executor2);
                    zzdbu2.zze(zzeky2, executor2);
                    zzdbu2.zzf(zzeky2, executor2);
                    zzdbu2.zzb(zzeky2, executor2);
                    zzdbu2.zzk(zzeky2, executor2);
                    zzdbu2.zzi(zzeky2, executor2);
                    zzd3.zzf(zzdbu2.zzn());
                    zzd3.zze(new zzejh(this.zzg));
                    zzd3.zzd(new zzdgw(zzdje.zza, (zzbk) null));
                    zzd3.zzg(new zzcqs(this.zzh, this.zzj));
                    zzd3.zzc(new zzcop(this.zzf));
                    zzcpx = zzd3.zzk();
                }
                if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
                    zzfhu = zzcpx.zzh();
                    zzfhu.zzi(3);
                    zzfhu.zzb(zzm2.zzp);
                    zzfhu.zzf(zzm2.zzm);
                }
                this.zzo = zzeln;
                zzcse zzc2 = zzcpx.zzc();
                ListenableFuture zzh2 = zzc2.zzh(zzc2.zzi());
                this.zzl = zzh2;
                zzgdn.zzr(zzh2, new zzeyl(this, zzfhu, zzb2, zzcpx), this.zzb);
                return true;
            }
            zzeky zzeky3 = this.zzd;
            if (zzeky3 != null) {
                zzeky3.zzdD(zzfdx.zzd(7, (String) null, (zze) null));
            }
        } else if (!this.zzk.zzV()) {
            this.zzm = true;
        }
        return false;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final zzfcu zzf() {
        return this.zzk;
    }

    public final void zzl() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzm() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final void zzn(zzbh zzbh) {
        this.zze.zza(zzbh);
    }

    public final void zzo(zzcyp zzcyp) {
        this.zzh.zzo(zzcyp, this.zzb);
    }

    public final void zzp(zzbdz zzbdz) {
        this.zzg = zzbdz;
    }

    public final void zzq() {
        synchronized (this) {
            ListenableFuture listenableFuture = this.zzl;
            if (listenableFuture != null && listenableFuture.isDone()) {
                try {
                    zzcos zzcos = (zzcos) this.zzl.get();
                    this.zzl = null;
                    ViewGroup viewGroup = this.zzf;
                    viewGroup.removeAllViews();
                    zzcos.zzd();
                    ViewParent parent = zzcos.zzd().getParent();
                    if (parent instanceof ViewGroup) {
                        String str = "";
                        if (zzcos.zzm() != null) {
                            str = zzcos.zzm().zzg();
                        }
                        String str2 = "Banner view provided from " + str + " already has a parent view. Removing its old parent.";
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzj(str2);
                        ((ViewGroup) parent).removeView(zzcos.zzd());
                    }
                    zzbcv zzbcv = zzbde.zziA;
                    if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
                        zzdaj zzo2 = zzcos.zzo();
                        zzo2.zza(this.zzd);
                        zzo2.zzc(this.zze);
                    }
                    viewGroup.addView(zzcos.zzd());
                    zzeln zzeln = this.zzo;
                    if (zzeln != null) {
                        zzeln.zzb(zzcos);
                    }
                    if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
                        Executor executor = this.zzb;
                        zzeky zzeky = this.zzd;
                        Objects.requireNonNull(zzeky);
                        executor.execute(new zzeyj(zzeky));
                    }
                    if (zzcos.zza() >= 0) {
                        this.zzm = false;
                        zzcyv zzcyv = this.zzh;
                        zzcyv.zzd(zzcos.zza());
                        zzcyv.zze(zzcos.zzc());
                    } else {
                        this.zzm = true;
                        this.zzh.zzd(zzcos.zzc());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    zzt();
                    com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                    this.zzm = true;
                    this.zzh.zza();
                }
            } else if (this.zzl != null) {
                com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                this.zzm = true;
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                this.zzm = true;
                this.zzh.zza();
            }
        }
    }

    public final boolean zzs() {
        ViewParent parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzv.zzr();
        return zzs.zzX(view, view.getContext());
    }
}
