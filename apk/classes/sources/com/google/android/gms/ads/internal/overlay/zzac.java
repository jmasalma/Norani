package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzded;
import com.google.android.gms.internal.ads.zzdsj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzac extends zzbtp implements zzazw {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;
    private final boolean zzf;
    private boolean zzg = false;
    private boolean zzh = false;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0046, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzfe)).booleanValue() != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzac(android.app.Activity r3, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzc = r0
            r2.zzd = r0
            r2.zze = r0
            r2.zzg = r0
            r2.zzh = r0
            r2.zza = r4
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzeZ
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r1.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzfa
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r1.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzfe
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r1.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0079
        L_0x0048:
            com.google.android.gms.ads.internal.overlay.zzc r3 = r4.zza
            if (r3 == 0) goto L_0x0079
            boolean r3 = r3.zzj
            if (r3 == 0) goto L_0x0079
            java.lang.String r3 = android.os.Build.MANUFACTURER
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzfc
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r1.zzb(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L_0x0079
            java.lang.String r3 = android.os.Build.MODEL
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzfd
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r1.zzb(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L_0x0079
            r0 = 1
        L_0x0079:
            r2.zzf = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzac.<init>(android.app.Activity, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel):void");
    }

    public static /* synthetic */ void zzb(zzac zzac) {
        if (zzac.zzg) {
            zzac.zzb.finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzc() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzd     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0031
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r2.zza     // Catch:{ all -> 0x0033 }
            com.google.android.gms.ads.internal.overlay.zzr r0 = r0.zzc     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            r1 = 4
            r0.zzdw(r1)     // Catch:{ all -> 0x0033 }
        L_0x000f:
            r0 = 1
            r2.zzd = r0     // Catch:{ all -> 0x0033 }
            boolean r0 = r2.zzf     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzfe     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0033 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0033 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzazx r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch:{ all -> 0x0033 }
            r0.zze(r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return
        L_0x0031:
            monitor-exit(r2)
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzac.zzc():void");
    }

    public final boolean zzH() throws RemoteException {
        return ((Boolean) zzbd.zzc().zzb(zzbde.zzfa)).booleanValue() && this.zzf && this.zzg;
    }

    public final void zza(boolean z) {
        if (!z) {
            this.zzh = true;
        } else if (this.zzh) {
            int i = zze.zza;
            zzo.zze("Foregrounded: finishing activity from LauncherOverlay");
            this.zzb.finish();
        }
    }

    public final void zzh(int i, int i2, Intent intent) throws RemoteException {
    }

    public final void zzi() throws RemoteException {
    }

    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzl(Bundle bundle) {
        zzr zzr;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjn)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
        } else if (z) {
            this.zzb.finish();
        } else {
            if (bundle == null) {
                zza zza2 = adOverlayInfoParcel.zzb;
                if (zza2 != null) {
                    zza2.onAdClicked();
                }
                zzded zzded = adOverlayInfoParcel.zzu;
                if (zzded != null) {
                    zzded.zzdf();
                }
                Activity activity = this.zzb;
                if (!(activity.getIntent() == null || !activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (zzr = adOverlayInfoParcel.zzc) == null)) {
                    zzr.zzdt();
                }
            }
            if (this.zzf) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzfe)).booleanValue()) {
                    zzv.zzb().zzc(this);
                }
            }
            Activity activity2 = this.zzb;
            zzc zzc2 = adOverlayInfoParcel.zza;
            zzad zzad = adOverlayInfoParcel.zzi;
            zzv.zzi();
            if (!zza.zzb(activity2, zzc2, zzad, zzc2.zzi, (zzdsj) null, "")) {
                activity2.finish();
            }
        }
    }

    public final void zzm() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    public final void zzo() throws RemoteException {
        this.zzg = false;
        zzr zzr = this.zza.zzc;
        if (zzr != null) {
            zzr.zzdk();
        }
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    public final void zzp(int i, String[] strArr, int[] iArr) {
    }

    public final void zzq() throws RemoteException {
    }

    public final void zzr() throws RemoteException {
        if (this.zzc) {
            zze.zza("LauncherOverlay finishing activity");
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        this.zzg = true;
        zzr zzr = this.zza.zzc;
        if (zzr != null) {
            zzr.zzd();
        }
        if (this.zzf) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzeZ)).booleanValue()) {
                zzs.zza.postDelayed(new zzab(this), (long) ((Integer) zzbd.zzc().zzb(zzbde.zzfb)).intValue());
            }
        }
    }

    public final void zzs(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    public final void zzt() throws RemoteException {
    }

    public final void zzu() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    public final void zzv() throws RemoteException {
        zzr zzr = this.zza.zzc;
        if (zzr != null) {
            zzr.zzdv();
        }
    }

    public final void zzx() throws RemoteException {
        this.zze = true;
    }
}
