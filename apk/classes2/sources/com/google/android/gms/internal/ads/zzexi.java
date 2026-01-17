package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzexi implements zzelo {
    protected final zzche zza;
    private final Context zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public final zzexy zzd;
    /* access modifiers changed from: private */
    public final zzezr zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    /* access modifiers changed from: private */
    public final zzfhx zzh;
    private final zzfcu zzi;
    /* access modifiers changed from: private */
    @Nullable
    public ListenableFuture zzj;

    protected zzexi(Context context, Executor executor, zzche zzche, zzezr zzezr, zzexy zzexy, zzfcu zzfcu, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzche;
        this.zze = zzezr;
        this.zzd = zzexy;
        this.zzi = zzfcu;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzche.zzy();
    }

    /* access modifiers changed from: private */
    public final synchronized zzcvd zzm(zzezp zzezp) {
        zzexg zzexg = (zzexg) zzezp;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zziB)).booleanValue()) {
            zzcop zzcop = new zzcop(this.zzg);
            zzcvf zzcvf = new zzcvf();
            zzcvf.zzf(this.zzb);
            zzcvf.zzk(zzexg.zza);
            zzcvh zzl = zzcvf.zzl();
            zzdbu zzdbu = new zzdbu();
            zzexy zzexy = this.zzd;
            Executor executor = this.zzc;
            zzdbu.zzc(zzexy, executor);
            zzdbu.zzl(zzexy, executor);
            return zze(zzcop, zzl, zzdbu.zzn());
        }
        zzexy zzi2 = zzexy.zzi(this.zzd);
        zzdbu zzdbu2 = new zzdbu();
        Executor executor2 = this.zzc;
        zzdbu2.zzb(zzi2, executor2);
        zzdbu2.zzg(zzi2, executor2);
        zzdbu2.zzh(zzi2, executor2);
        zzdbu2.zzi(zzi2, executor2);
        zzdbu2.zzc(zzi2, executor2);
        zzdbu2.zzl(zzi2, executor2);
        zzdbu2.zzm(zzi2);
        zzcop zzcop2 = new zzcop(this.zzg);
        zzcvf zzcvf2 = new zzcvf();
        zzcvf2.zzf(this.zzb);
        zzcvf2.zzk(zzexg.zza);
        return zze(zzcop2, zzcvf2.zzl(), zzdbu2.zzn());
    }

    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzj;
        return listenableFuture != null && !listenableFuture.isDone();
    }

    public final synchronized boolean zzb(zzm zzm, String str, zzelm zzelm, zzeln zzeln) throws RemoteException {
        zzfhu zzfhu;
        zzcoc zzcoc;
        boolean z;
        if (!zzm.zzb()) {
            if (((Boolean) zzbfc.zzd.zze()).booleanValue()) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzlE)).booleanValue()) {
                    z = true;
                    if (this.zzf.clientJarVersion < ((Integer) zzbd.zzc().zzb(zzbde.zzlF)).intValue() || !z) {
                        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                    }
                }
            }
            z = false;
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        if (str == null) {
            int i = zze.zza;
            zzo.zzg("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new zzexc(this));
            return false;
        } else if (this.zzj != null) {
            return false;
        } else {
            if (!((Boolean) zzbex.zzc.zze()).booleanValue() || (zzcoc = (zzcoc) this.zze.zzd()) == null) {
                zzfhu = null;
            } else {
                zzfhu zzg2 = zzcoc.zzg();
                zzg2.zzi(7);
                zzg2.zzb(zzm.zzp);
                zzg2.zzf(zzm.zzm);
                zzfhu = zzg2;
            }
            Context context = this.zzb;
            boolean z2 = zzm.zzf;
            zzfdt.zza(context, z2);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzjp)).booleanValue() && z2) {
                this.zza.zzk().zzo(true);
            }
            Bundle zza2 = zzdrt.zza(new Pair(zzdrr.PUBLIC_API_CALL.zza(), Long.valueOf(zzm.zzz)), new Pair(zzdrr.DYNAMITE_ENTER.zza(), Long.valueOf(zzv.zzD().currentTimeMillis())));
            zzfcu zzfcu = this.zzi;
            zzfcu.zzu(str);
            zzfcu.zzt(zzr.zzb());
            zzfcu.zzJ(zzm);
            zzfcu.zzB(zza2);
            zzfcw zzL = zzfcu.zzL();
            zzfhj zzb2 = zzfhi.zzb(context, zzfht.zzf(zzL), 7, zzm);
            zzexg zzexg = new zzexg((zzexh) null);
            zzexg.zza = zzL;
            ListenableFuture zzc2 = this.zze.zzc(new zzezs(zzexg, (zzbvq) null), new zzexd(this), (Object) null);
            this.zzj = zzc2;
            zzgdn.zzr(zzc2, new zzexf(this, zzeln, zzfhu, zzb2, zzexg), this.zzc);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public abstract zzcvd zze(zzcop zzcop, zzcvh zzcvh, zzdbw zzdbw);

    public final void zzl(zzx zzx) {
        this.zzi.zzv(zzx);
    }
}
