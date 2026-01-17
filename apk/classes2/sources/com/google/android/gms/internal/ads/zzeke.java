package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeke extends zzbw implements zzcyp {
    private final Context zza;
    private final zzeym zzb;
    private final String zzc;
    private final zzeky zzd;
    private zzr zze;
    private final zzfcu zzf;
    private final VersionInfoParcel zzg;
    private final zzdsj zzh;
    /* access modifiers changed from: private */
    public zzcos zzi;

    public zzeke(Context context, zzr zzr, String str, zzeym zzeym, zzeky zzeky, VersionInfoParcel versionInfoParcel, zzdsj zzdsj) {
        this.zza = context;
        this.zzb = zzeym;
        this.zze = zzr;
        this.zzc = str;
        this.zzd = zzeky;
        this.zzf = zzeym.zzf();
        this.zzg = versionInfoParcel;
        this.zzh = zzdsj;
        zzeym.zzo(this);
    }

    private final synchronized void zzg(zzr zzr) {
        zzfcu zzfcu = this.zzf;
        zzfcu.zzt(zzr);
        zzfcu.zzz(this.zze.zzn);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean zzi(com.google.android.gms.ads.internal.client.zzm r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.zzn()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0046 }
        L_0x000c:
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x0046 }
            android.content.Context r0 = r4.zza     // Catch:{ all -> 0x0046 }
            boolean r1 = com.google.android.gms.ads.internal.util.zzs.zzI(r0)     // Catch:{ all -> 0x0046 }
            r2 = 0
            if (r1 == 0) goto L_0x0032
            com.google.android.gms.ads.internal.client.zzc r1 = r5.zzs     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0032
            int r5 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r5)     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzeky r5 = r4.zzd     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x002f
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfdx.zzd(r0, r2, r2)     // Catch:{ all -> 0x0046 }
            r5.zzdD(r0)     // Catch:{ all -> 0x0046 }
        L_0x002f:
            monitor-exit(r4)
            r5 = 0
            return r5
        L_0x0032:
            boolean r1 = r5.zzf     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzfdt.zza(r0, r1)     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzeym r0 = r4.zzb     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = r4.zzc     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzekd r3 = new com.google.android.gms.internal.ads.zzekd     // Catch:{ all -> 0x0046 }
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            boolean r5 = r0.zzb(r5, r1, r2, r3)     // Catch:{ all -> 0x0046 }
            monitor-exit(r4)
            return r5
        L_0x0046:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeke.zzi(com.google.android.gms.ads.internal.client.zzm):boolean");
    }

    private final boolean zzn() {
        boolean z;
        if (((Boolean) zzbfc.zzf.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzlE)).booleanValue()) {
                z = true;
                return this.zzg.clientJarVersion >= ((Integer) zzbd.zzc().zzb(zzbde.zzlF)).intValue() || !z;
            }
        }
        z = false;
        if (this.zzg.clientJarVersion >= ((Integer) zzbd.zzc().zzb(zzbde.zzlF)).intValue()) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzlG)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzA() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfc.zzg     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzlC     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch:{ all -> 0x004c }
            int r0 = r0.clientJarVersion     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzlG     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcos r0 = r3.zzi     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzcwx r0 = r0.zzn()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.zzb(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeke.zzA():void");
    }

    public final synchronized void zzB() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcos zzcos = this.zzi;
        if (zzcos != null) {
            zzcos.zzh();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzlG)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzC() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfc.zzh     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzlA     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x004c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch:{ all -> 0x004c }
            int r0 = r0.clientJarVersion     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzlG     // Catch:{ all -> 0x004c }
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x004c }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcos r0 = r3.zzi     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzcwx r0 = r0.zzn()     // Catch:{ all -> 0x004c }
            r1 = 0
            r0.zzc(r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004a:
            monitor-exit(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeke.zzC():void");
    }

    public final void zzD(zzbh zzbh) {
        if (zzn()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzn(zzbh);
    }

    public final void zzE(zzbk zzbk) {
        if (zzn()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zzbk);
    }

    public final void zzF(zzcb zzcb) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final synchronized void zzG(zzr zzr) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzt(zzr);
        this.zze = zzr;
        zzcos zzcos = this.zzi;
        if (zzcos != null) {
            zzcos.zzi(this.zzb.zzc(), zzr);
        }
    }

    public final void zzH(zzco zzco) {
        if (zzn()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(zzco);
    }

    public final void zzI(zzbaz zzbaz) {
    }

    public final void zzJ(zzx zzx) {
    }

    public final void zzK(zzcv zzcv) {
    }

    public final void zzL(zzeh zzeh) {
    }

    public final void zzM(boolean z) {
    }

    public final void zzN(zzbtz zzbtz) {
    }

    public final synchronized void zzO(boolean z) {
        if (zzn()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzC(z);
    }

    public final synchronized void zzP(zzbdz zzbdz) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzp(zzbdz);
    }

    public final void zzQ(zzdt zzdt) {
        if (zzn()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdt.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzd.zzl(zzdt);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzR(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfcu r0 = r2.zzf     // Catch:{ all -> 0x001b }
            r0.zzH(r3)     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzcos r0 = r2.zzi     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzcuu r1 = r0.zzl()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzcuu r0 = r0.zzl()     // Catch:{ all -> 0x001b }
            r0.zzb(r3)     // Catch:{ all -> 0x001b }
            monitor-exit(r2)
            return
        L_0x0019:
            monitor-exit(r2)
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeke.zzR(long):void");
    }

    public final void zzS(zzbuc zzbuc, String str) {
    }

    public final void zzT(String str) {
    }

    public final void zzU(zzbwi zzbwi) {
    }

    public final void zzV(String str) {
    }

    public final synchronized void zzW(zzgc zzgc) {
        if (zzn()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzK(zzgc);
    }

    public final void zzY(IObjectWrapper iObjectWrapper) {
    }

    public final void zzZ() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:4|(1:8)|9|10|11|12|13|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzeym r0 = r3.zzb     // Catch:{ all -> 0x004e }
            boolean r0 = r0.zzs()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.zzfcu r0 = r3.zzf     // Catch:{ all -> 0x004e }
            com.google.android.gms.ads.internal.client.zzr r1 = r0.zzi()     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.zzcos r2 = r3.zzi     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x0029
            boolean r2 = r0.zzW()     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x0029
            android.content.Context r1 = r3.zza     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.zzcos r2 = r3.zzi     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.zzfcb r2 = r2.zzg()     // Catch:{ all -> 0x004e }
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch:{ all -> 0x004e }
            com.google.android.gms.ads.internal.client.zzr r1 = com.google.android.gms.internal.ads.zzfdc.zza(r1, r2)     // Catch:{ all -> 0x004e }
        L_0x0029:
            r3.zzg(r1)     // Catch:{ all -> 0x004e }
            r1 = 1
            r0.zzy(r1)     // Catch:{ all -> 0x004e }
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzg()     // Catch:{ RemoteException -> 0x0038 }
            r3.zzi(r0)     // Catch:{ RemoteException -> 0x0038 }
            goto L_0x003f
        L_0x0038:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "Failed to refresh the banner ad."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ all -> 0x004e }
        L_0x003f:
            com.google.android.gms.internal.ads.zzfcu r0 = r3.zzf     // Catch:{ all -> 0x004e }
            r1 = 0
            r0.zzy(r1)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)
            return
        L_0x0047:
            com.google.android.gms.internal.ads.zzeym r0 = r3.zzb     // Catch:{ all -> 0x004e }
            r0.zzl()     // Catch:{ all -> 0x004e }
            monitor-exit(r3)
            return
        L_0x004e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeke.zza():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzaa() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcos r0 = r1.zzi     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.zzs()     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x000e:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeke.zzaa():boolean");
    }

    public final synchronized boolean zzab() {
        return this.zzb.zza();
    }

    public final boolean zzac() {
        return false;
    }

    public final synchronized boolean zzad(zzm zzm) throws RemoteException {
        zzg(this.zze);
        return zzi(zzm);
    }

    public final synchronized void zzae(zzcs zzcs) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzY(zzcs);
    }

    public final synchronized void zzb() throws ExecutionException, InterruptedException {
        zzeym zzeym = this.zzb;
        if (zzeym.zzs()) {
            zzeym.zzq();
        } else {
            zzeym.zzm();
        }
    }

    public final Bundle zze() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized zzr zzh() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcos zzcos = this.zzi;
        if (zzcos != null) {
            return zzfdc.zza(this.zza, Collections.singletonList(zzcos.zzf()));
        }
        return this.zzf.zzi();
    }

    public final zzbk zzj() {
        return this.zzd.zzg();
    }

    public final zzco zzk() {
        return this.zzd.zzi();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzl() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzgW     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0021 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0021 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0021 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x0014
            goto L_0x001e
        L_0x0014:
            com.google.android.gms.internal.ads.zzcos r0 = r2.zzi     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzcvr r0 = r0.zzm()     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)
            return r0
        L_0x001e:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeke.zzl():com.google.android.gms.ads.internal.client.zzea");
    }

    public final synchronized zzed zzm() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcos zzcos = this.zzi;
        if (zzcos == null) {
            return null;
        }
        return zzcos.zze();
    }

    public final IObjectWrapper zzo() {
        if (zzn()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzc());
    }

    public final synchronized String zzs() {
        return this.zzc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String zzt() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcos r0 = r2.zzi     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0015
            com.google.android.gms.internal.ads.zzcvr r1 = r0.zzm()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.internal.ads.zzcvr r0 = r0.zzm()     // Catch:{ all -> 0x0018 }
            java.lang.String r0 = r0.zzg()     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return r0
        L_0x0015:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeke.zzt():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String zzu() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcos r0 = r2.zzi     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0015
            com.google.android.gms.internal.ads.zzcvr r1 = r0.zzm()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.internal.ads.zzcvr r0 = r0.zzm()     // Catch:{ all -> 0x0018 }
            java.lang.String r0 = r0.zzg()     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return r0
        L_0x0015:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeke.zzu():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzlG)).intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzy() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfc.zze     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzlB     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r3.zzg     // Catch:{ all -> 0x0047 }
            int r0 = r0.clientJarVersion     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzlG     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x0047 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0047 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0047 }
            if (r0 >= r1) goto L_0x003c
        L_0x0037:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0047 }
        L_0x003c:
            com.google.android.gms.internal.ads.zzcos r0 = r3.zzi     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0045
            r0.zzb()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x0045:
            monitor-exit(r3)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeke.zzy():void");
    }

    public final void zzz(zzm zzm, zzbn zzbn) {
    }

    public final synchronized long zzc() {
        zzcos zzcos = this.zzi;
        if (zzcos == null || zzcos.zzl() == null) {
            return this.zzf.zzb();
        }
        return zzcos.zzl().zza();
    }
}
