package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfbr extends zzbwu {
    private final zzfbn zza;
    private final zzfbd zzb;
    private final String zzc;
    /* access modifiers changed from: private */
    public final zzfco zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzavu zzg;
    private final zzdsj zzh;
    /* access modifiers changed from: private */
    public zzdon zzi;
    private boolean zzj = ((Boolean) zzbd.zzc().zzb(zzbde.zzaS)).booleanValue();

    public zzfbr(String str, zzfbn zzfbn, Context context, zzfbd zzfbd, zzfco zzfco, VersionInfoParcel versionInfoParcel, zzavu zzavu, zzdsj zzdsj) {
        this.zzc = str;
        this.zza = zzfbn;
        this.zzb = zzfbd;
        this.zzd = zzfco;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzavu;
        this.zzh = zzdsj;
    }

    private final synchronized void zzx(zzm zzm, zzbxc zzbxc, int i) throws RemoteException {
        if (!zzm.zzb()) {
            boolean z = false;
            if (((Boolean) zzbfc.zzk.zze()).booleanValue()) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzlE)).booleanValue()) {
                    z = true;
                }
            }
            if (this.zzf.clientJarVersion < ((Integer) zzbd.zzc().zzb(zzbde.zzlF)).intValue() || !z) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
        }
        zzfbd zzfbd = this.zzb;
        zzfbd.zzk(zzbxc);
        zzv.zzr();
        if (zzs.zzI(this.zze)) {
            if (zzm.zzs == null) {
                int i2 = zze.zza;
                zzo.zzg("Failed to load the ad because app ID is missing.");
                zzfbd.zzdD(zzfdx.zzd(4, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
                return;
            }
        }
        if (this.zzi == null) {
            zzfbf zzfbf = new zzfbf((String) null);
            zzfbn zzfbn = this.zza;
            zzfbn.zzj(i);
            zzfbn.zzb(zzm, this.zzc, zzfbf, new zzfbq(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long zzb() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdon r0 = r2.zzi     // Catch:{ all -> 0x0019 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbr.zzb():long");
    }

    public final Bundle zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdon zzdon = this.zzi;
        return zzdon != null ? zzdon.zza() : new Bundle();
    }

    public final zzea zzd() {
        zzdon zzdon;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgW)).booleanValue() && (zzdon = this.zzi) != null) {
            return zzdon.zzm();
        }
        return null;
    }

    public final zzbws zze() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdon zzdon = this.zzi;
        if (zzdon != null) {
            return zzdon.zzc();
        }
        return null;
    }

    public final String zzf() {
        return this.zzc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String zzg() throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdon r0 = r2.zzi     // Catch:{ all -> 0x0018 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbr.zzg():java.lang.String");
    }

    public final synchronized void zzh(zzm zzm, zzbxc zzbxc) throws RemoteException {
        zzx(zzm, zzbxc, 2);
    }

    public final synchronized void zzi(zzm zzm, zzbxc zzbxc) throws RemoteException {
        zzx(zzm, zzbxc, 3);
    }

    public final synchronized void zzj(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    public final void zzk(zzdq zzdq) {
        if (zzdq == null) {
            this.zzb.zzg((OnAdMetadataChangedListener) null);
        } else {
            this.zzb.zzg(new zzfbp(this, zzdq));
        }
    }

    public final void zzl(zzdt zzdt) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdt.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzi(zzdt);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzm(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdon r0 = r2.zzi     // Catch:{ all -> 0x0016 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbr.zzm(long):void");
    }

    public final void zzn(zzbwy zzbwy) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbwy);
    }

    public final synchronized void zzo(zzbxj zzbxj) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfco zzfco = this.zzd;
        zzfco.zza = zzbxj.zza;
        zzfco.zzb = zzbxj.zzb;
    }

    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzq(iObjectWrapper, this.zzj);
    }

    public final synchronized void zzq(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i = zze.zza;
            zzo.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzs(zzfdx.zzd(9, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            return;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdd)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final boolean zzr() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdon zzdon = this.zzi;
        return zzdon != null && !zzdon.zzf();
    }

    public final void zzs(zzbxd zzbxd) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbxd);
    }
}
