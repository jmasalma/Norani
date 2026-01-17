package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzejz extends zzbw {
    private final Context zza;
    private final zzbk zzb;
    private final zzfcw zzc;
    private final zzcos zzd;
    private final ViewGroup zze;
    private final zzdsj zzf;

    public zzejz(Context context, zzbk zzbk, zzfcw zzfcw, zzcos zzcos, zzdsj zzdsj) {
        this.zza = context;
        this.zzb = zzbk;
        this.zzc = zzfcw;
        this.zzd = zzcos;
        this.zzf = zzdsj;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zzd2 = zzcos.zzd();
        zzv.zzr();
        frameLayout.addView(zzd2, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzh().zzc);
        frameLayout.setMinimumWidth(zzh().zzf);
        this.zze = frameLayout;
    }

    public final void zzA() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzb((Context) null);
    }

    public final void zzB() throws RemoteException {
        this.zzd.zzh();
    }

    public final void zzC() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzc((Context) null);
    }

    public final void zzD(zzbh zzbh) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzE(zzbk zzbk) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzF(zzcb zzcb) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzG(zzr zzr) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcos zzcos = this.zzd;
        if (zzcos != null) {
            zzcos.zzi(this.zze, zzr);
        }
    }

    public final void zzH(zzco zzco) throws RemoteException {
        zzeky zzeky = this.zzc.zzc;
        if (zzeky != null) {
            zzeky.zzm(zzco);
        }
    }

    public final void zzI(zzbaz zzbaz) throws RemoteException {
    }

    public final void zzJ(zzx zzx) throws RemoteException {
    }

    public final void zzK(zzcv zzcv) {
    }

    public final void zzL(zzeh zzeh) throws RemoteException {
    }

    public final void zzM(boolean z) throws RemoteException {
    }

    public final void zzN(zzbtz zzbtz) throws RemoteException {
    }

    public final void zzO(boolean z) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzP(zzbdz zzbdz) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzQ(zzdt zzdt) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlX)).booleanValue()) {
            zzeky zzeky = this.zzc.zzc;
            if (zzeky != null) {
                try {
                    if (!zzdt.zzf()) {
                        this.zzf.zze();
                    }
                } catch (RemoteException e) {
                    int i = zze.zza;
                    zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
                }
                zzeky.zzl(zzdt);
                return;
            }
            return;
        }
        int i2 = zze.zza;
        zzo.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzR(long j) {
        zzcos zzcos = this.zzd;
        if (zzcos.zzl() != null) {
            zzcos.zzl().zzb(j);
        }
    }

    public final void zzS(zzbuc zzbuc, String str) throws RemoteException {
    }

    public final void zzT(String str) throws RemoteException {
    }

    public final void zzU(zzbwi zzbwi) throws RemoteException {
    }

    public final void zzV(String str) throws RemoteException {
    }

    public final void zzW(zzgc zzgc) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzY(IObjectWrapper iObjectWrapper) {
    }

    public final void zzZ() throws RemoteException {
    }

    public final boolean zzaa() throws RemoteException {
        zzcos zzcos = this.zzd;
        return zzcos != null && zzcos.zzs();
    }

    public final boolean zzab() throws RemoteException {
        return false;
    }

    public final boolean zzac() throws RemoteException {
        return false;
    }

    public final boolean zzad(zzm zzm) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    public final void zzae(zzcs zzcs) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final long zzc() {
        zzcos zzcos = this.zzd;
        if (zzcos == null || zzcos.zzl() == null) {
            return 0;
        }
        return zzcos.zzl().zza();
    }

    public final Bundle zze() throws RemoteException {
        int i = zze.zza;
        zzo.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    public final zzr zzh() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzfdc.zza(this.zza, Collections.singletonList(this.zzd.zzf()));
    }

    public final zzbk zzj() throws RemoteException {
        return this.zzb;
    }

    public final zzco zzk() throws RemoteException {
        return this.zzc.zzn;
    }

    public final zzea zzl() {
        return this.zzd.zzm();
    }

    public final zzed zzm() throws RemoteException {
        return this.zzd.zze();
    }

    public final IObjectWrapper zzo() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    public final String zzs() throws RemoteException {
        return this.zzc.zzf;
    }

    public final String zzt() throws RemoteException {
        zzcos zzcos = this.zzd;
        if (zzcos.zzm() != null) {
            return zzcos.zzm().zzg();
        }
        return null;
    }

    public final String zzu() throws RemoteException {
        zzcos zzcos = this.zzd;
        if (zzcos.zzm() != null) {
            return zzcos.zzm().zzg();
        }
        return null;
    }

    public final void zzy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    public final void zzz(zzm zzm, zzbn zzbn) {
    }
}
