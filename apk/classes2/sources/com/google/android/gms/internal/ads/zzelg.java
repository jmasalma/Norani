package com.google.android.gms.internal.ads;

import android.app.Activity;
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

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzelg extends zzbw {
    private final zzr zza;
    private final Context zzb;
    private final zzfad zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzeky zzf;
    private final zzfbd zzg;
    private final zzavu zzh;
    private final zzdsj zzi;
    /* access modifiers changed from: private */
    public zzdfb zzj;
    private boolean zzk = ((Boolean) zzbd.zzc().zzb(zzbde.zzaS)).booleanValue();

    public zzelg(Context context, zzr zzr, String str, zzfad zzfad, zzeky zzeky, zzfbd zzfbd, VersionInfoParcel versionInfoParcel, zzavu zzavu, zzdsj zzdsj) {
        this.zza = zzr;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfad;
        this.zzf = zzeky;
        this.zzg = zzfbd;
        this.zze = versionInfoParcel;
        this.zzh = zzavu;
        this.zzi = zzdsj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean zzf() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdfb r0 = r1.zzj     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.zza()     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelg.zzf():boolean");
    }

    public final synchronized void zzA() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdfb zzdfb = this.zzj;
        if (zzdfb != null) {
            zzdfb.zzn().zzb((Context) null);
        }
    }

    public final void zzB() {
    }

    public final synchronized void zzC() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdfb zzdfb = this.zzj;
        if (zzdfb != null) {
            zzdfb.zzn().zzc((Context) null);
        }
    }

    public final void zzD(zzbh zzbh) {
    }

    public final void zzE(zzbk zzbk) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzbk);
    }

    public final void zzF(zzcb zzcb) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final void zzG(zzr zzr) {
    }

    public final void zzH(zzco zzco) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzco);
    }

    public final void zzI(zzbaz zzbaz) {
    }

    public final void zzJ(zzx zzx) {
    }

    public final void zzK(zzcv zzcv) {
        this.zzf.zzn(zzcv);
    }

    public final void zzL(zzeh zzeh) {
    }

    public final synchronized void zzM(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z;
    }

    public final void zzN(zzbtz zzbtz) {
    }

    public final void zzO(boolean z) {
    }

    public final synchronized void zzP(zzbdz zzbdz) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbdz);
    }

    public final void zzQ(zzdt zzdt) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdt.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzf.zzl(zzdt);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzR(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdfb r0 = r2.zzj     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.zzcuu r1 = r0.zzl()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.zzcuu r0 = r0.zzl()     // Catch:{ all -> 0x0016 }
            r0.zzb(r3)     // Catch:{ all -> 0x0016 }
            monitor-exit(r2)
            return
        L_0x0014:
            monitor-exit(r2)
            return
        L_0x0016:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelg.zzR(long):void");
    }

    public final void zzS(zzbuc zzbuc, String str) {
    }

    public final void zzT(String str) {
    }

    public final void zzU(zzbwi zzbwi) {
        this.zzg.zzm(zzbwi);
    }

    public final void zzV(String str) {
    }

    public final void zzW(zzgc zzgc) {
    }

    public final synchronized void zzY(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            int i = zze.zza;
            zzo.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzs(zzfdx.zzd(9, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            return;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdd)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final synchronized void zzZ() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i = zze.zza;
            zzo.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzs(zzfdx.zzd(9, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            return;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdd)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) null);
    }

    public final synchronized boolean zzaa() {
        return false;
    }

    public final synchronized boolean zzab() {
        return this.zzc.zza();
    }

    public final synchronized boolean zzac() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzad(com.google.android.gms.ads.internal.client.zzm r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.zzb()     // Catch:{ all -> 0x0092 }
            r1 = 0
            if (r0 == 0) goto L_0x0009
            goto L_0x0049
        L_0x0009:
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfc.zzi     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x0092 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzlE     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x0092 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.zze     // Catch:{ all -> 0x0092 }
            int r2 = r2.clientJarVersion     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzlF     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0092 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x0092 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0092 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0092 }
            if (r2 < r3) goto L_0x0044
            if (r0 != 0) goto L_0x0049
        L_0x0044:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0092 }
        L_0x0049:
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x0092 }
            android.content.Context r0 = r5.zzb     // Catch:{ all -> 0x0092 }
            boolean r2 = com.google.android.gms.ads.internal.util.zzs.zzI(r0)     // Catch:{ all -> 0x0092 }
            r3 = 0
            if (r2 == 0) goto L_0x006d
            com.google.android.gms.ads.internal.client.zzc r2 = r6.zzs     // Catch:{ all -> 0x0092 }
            if (r2 != 0) goto L_0x006d
            int r6 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r6)     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzeky r6 = r5.zzf     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x0090
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfdx.zzd(r0, r3, r3)     // Catch:{ all -> 0x0092 }
            r6.zzdD(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0090
        L_0x006d:
            boolean r2 = r5.zzf()     // Catch:{ all -> 0x0092 }
            if (r2 != 0) goto L_0x0090
            boolean r1 = r6.zzf     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzfdt.zza(r0, r1)     // Catch:{ all -> 0x0092 }
            r5.zzj = r3     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzfad r0 = r5.zzc     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = r5.zzd     // Catch:{ all -> 0x0092 }
            com.google.android.gms.ads.internal.client.zzr r2 = r5.zza     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzezw r3 = new com.google.android.gms.internal.ads.zzezw     // Catch:{ all -> 0x0092 }
            r3.<init>(r2)     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzelf r2 = new com.google.android.gms.internal.ads.zzelf     // Catch:{ all -> 0x0092 }
            r2.<init>(r5)     // Catch:{ all -> 0x0092 }
            boolean r6 = r0.zzb(r6, r1, r3, r2)     // Catch:{ all -> 0x0092 }
            monitor-exit(r5)
            return r6
        L_0x0090:
            monitor-exit(r5)
            return r1
        L_0x0092:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0092 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelg.zzad(com.google.android.gms.ads.internal.client.zzm):boolean");
    }

    public final void zzae(zzcs zzcs) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long zzc() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdfb r0 = r2.zzj     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0015
            com.google.android.gms.internal.ads.zzcuu r1 = r0.zzl()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.internal.ads.zzcuu r0 = r0.zzl()     // Catch:{ all -> 0x0019 }
            long r0 = r0.zza()     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)
            return r0
        L_0x0015:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelg.zzc():long");
    }

    public final Bundle zze() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final zzr zzh() {
        return null;
    }

    public final zzbk zzj() {
        return this.zzf.zzg();
    }

    public final zzco zzk() {
        return this.zzf.zzi();
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
            com.google.android.gms.internal.ads.zzdfb r0 = r2.zzj     // Catch:{ all -> 0x0021 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelg.zzl():com.google.android.gms.ads.internal.client.zzea");
    }

    public final zzed zzm() {
        return null;
    }

    public final IObjectWrapper zzo() {
        return null;
    }

    public final synchronized String zzs() {
        return this.zzd;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String zzt() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdfb r0 = r2.zzj     // Catch:{ all -> 0x0018 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelg.zzt():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String zzu() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdfb r0 = r2.zzj     // Catch:{ all -> 0x0018 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelg.zzu():java.lang.String");
    }

    public final synchronized void zzy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdfb zzdfb = this.zzj;
        if (zzdfb != null) {
            zzdfb.zzn().zza((Context) null);
        }
    }

    public final void zzz(zzm zzm, zzbn zzbn) {
        this.zzf.zzk(zzbn);
        zzad(zzm);
    }
}
