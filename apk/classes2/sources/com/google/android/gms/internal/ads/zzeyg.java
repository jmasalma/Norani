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
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeyg extends zzbw implements zzr, zzbaq {
    protected zzcom zza;
    private final zzche zzb;
    private final Context zzc;
    private AtomicBoolean zzd = new AtomicBoolean();
    private final String zze;
    private final zzeya zzf;
    /* access modifiers changed from: private */
    public final zzexy zzg;
    private final VersionInfoParcel zzh;
    /* access modifiers changed from: private */
    public final zzdsj zzi;
    private long zzj = -1;
    private zzcnz zzk;

    public zzeyg(zzche zzche, Context context, String str, zzeya zzeya, zzexy zzexy, VersionInfoParcel versionInfoParcel, zzdsj zzdsj) {
        this.zzb = zzche;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzeya;
        this.zzg = zzexy;
        this.zzh = versionInfoParcel;
        this.zzi = zzdsj;
        zzexy.zzm(this);
    }

    /* access modifiers changed from: private */
    public final synchronized void zzq(int i) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzcnz zzcnz = this.zzk;
            if (zzcnz != null) {
                zzv.zzb().zze(zzcnz);
            }
            if (this.zza != null) {
                long j = -1;
                if (this.zzj != -1) {
                    j = zzv.zzD().elapsedRealtime() - this.zzj;
                }
                this.zza.zze(j, i);
            }
            zzy();
        }
    }

    public final synchronized void zzA() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    public final synchronized void zzB() {
    }

    public final synchronized void zzC() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    public final void zzD(zzbh zzbh) {
    }

    public final void zzE(zzbk zzbk) {
    }

    public final void zzF(zzcb zzcb) {
    }

    public final synchronized void zzG(com.google.android.gms.ads.internal.client.zzr zzr) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    public final void zzH(zzco zzco) {
    }

    public final void zzI(zzbaz zzbaz) {
        this.zzg.zzo(zzbaz);
    }

    public final void zzJ(zzx zzx) {
        this.zzf.zzl(zzx);
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
    }

    public final synchronized void zzP(zzbdz zzbdz) {
    }

    public final void zzQ(zzdt zzdt) {
    }

    public final void zzR(long j) {
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
    }

    public final void zzY(IObjectWrapper iObjectWrapper) {
    }

    public final synchronized void zzZ() {
    }

    public final void zza() {
        zzq(3);
    }

    public final synchronized boolean zzaa() {
        return false;
    }

    public final synchronized boolean zzab() {
        return this.zzf.zza();
    }

    public final boolean zzac() {
        return false;
    }

    public final synchronized boolean zzad(zzm zzm) throws RemoteException {
        boolean z;
        if (!zzm.zzb()) {
            if (((Boolean) zzbfc.zzd.zze()).booleanValue()) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzlE)).booleanValue()) {
                    z = true;
                    if (this.zzh.clientJarVersion < ((Integer) zzbd.zzc().zzb(zzbde.zzlF)).intValue() || !z) {
                        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                    }
                }
            }
            z = false;
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        zzv.zzr();
        if (zzs.zzI(this.zzc)) {
            if (zzm.zzs == null) {
                int i = zze.zza;
                zzo.zzg("Failed to load the ad because app ID is missing.");
                this.zzg.zzdD(zzfdx.zzd(4, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
                return false;
            }
        }
        if (zzab()) {
            return false;
        }
        this.zzd = new AtomicBoolean();
        return this.zzf.zzb(zzm, this.zze, new zzeye(this), new zzeyf(this));
    }

    public final synchronized void zzae(zzcs zzcs) {
    }

    public final long zzc() {
        return 0;
    }

    public final void zzd() {
    }

    public final void zzdk() {
    }

    public final void zzds() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzdt() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzcom r0 = r4.zza     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0006
            goto L_0x0033
        L_0x0006:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ all -> 0x0035 }
            long r0 = r0.elapsedRealtime()     // Catch:{ all -> 0x0035 }
            r4.zzj = r0     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzcom r0 = r4.zza     // Catch:{ all -> 0x0035 }
            int r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            if (r0 <= 0) goto L_0x0033
            com.google.android.gms.internal.ads.zzche r1 = r4.zzb     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzcnz r2 = new com.google.android.gms.internal.ads.zzcnz     // Catch:{ all -> 0x0035 }
            java.util.concurrent.ScheduledExecutorService r1 = r1.zzB()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ all -> 0x0035 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0035 }
            r4.zzk = r2     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzeyd r1 = new com.google.android.gms.internal.ads.zzeyd     // Catch:{ all -> 0x0035 }
            r1.<init>(r4)     // Catch:{ all -> 0x0035 }
            r2.zzd(r0, r1)     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)
            return
        L_0x0033:
            monitor-exit(r4)
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeyg.zzdt():void");
    }

    public final synchronized void zzdv() {
        zzcom zzcom = this.zza;
        if (zzcom != null) {
            zzcom.zze(zzv.zzD().elapsedRealtime() - this.zzj, 1);
        }
    }

    public final Bundle zze() {
        return new Bundle();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzr zzh() {
        return null;
    }

    public final zzbk zzj() {
        return null;
    }

    public final zzco zzk() {
        return null;
    }

    public final synchronized zzea zzl() {
        return null;
    }

    public final synchronized zzed zzm() {
        return null;
    }

    public final IObjectWrapper zzo() {
        return null;
    }

    public final synchronized String zzs() {
        return this.zze;
    }

    public final synchronized String zzt() {
        return null;
    }

    public final synchronized String zzu() {
        return null;
    }

    public final synchronized void zzy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcom zzcom = this.zza;
        if (zzcom != null) {
            zzcom.zzb();
        }
    }

    public final void zzz(zzm zzm, zzbn zzbn) {
    }

    public final void zzdw(int i) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0) {
                zzq(2);
            } else if (i2 == 1) {
                zzq(4);
            } else if (i2 != 2) {
                zzq(6);
            } else {
                zzq(3);
            }
        } else {
            throw null;
        }
    }
}
