package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdvt implements zzr, zzcgw {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzdvi zzc;
    private zzcfg zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private zzdn zzh;
    private boolean zzi;

    zzdvt(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    private final synchronized boolean zzl(zzdn zzdn) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzjp)).booleanValue()) {
            int i = zze.zza;
            zzo.zzj("Ad inspector had an internal error.");
            try {
                zzdn.zze(zzfdx.zzd(16, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            } catch (RemoteException unused) {
            }
        } else if (this.zzc == null) {
            int i2 = zze.zza;
            zzo.zzj("Ad inspector had an internal error.");
            try {
                zzv.zzp().zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdn.zze(zzfdx.zzd(16, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            } catch (RemoteException unused2) {
            }
        } else {
            if (!this.zze && !this.zzf) {
                if (zzv.zzD().currentTimeMillis() >= this.zzg + ((long) ((Integer) zzbd.zzc().zzb(zzbde.zzjs)).intValue())) {
                    return true;
                }
            }
            int i3 = zze.zza;
            zzo.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzdn.zze(zzfdx.zzd(19, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            } catch (RemoteException unused3) {
            }
        }
        return false;
        return false;
        return false;
    }

    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk();
            return;
        }
        int i2 = zze.zza;
        zzo.zzj("Ad inspector failed to load.");
        try {
            zzbzs zzp = zzv.zzp();
            zzp.zzw(new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            zzdn zzdn = this.zzh;
            if (zzdn != null) {
                zzdn.zze(zzfdx.zzd(17, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            }
        } catch (RemoteException e) {
            zzv.zzp().zzw(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    public final void zzd() {
    }

    public final void zzdk() {
    }

    public final void zzds() {
    }

    public final synchronized void zzdt() {
        this.zzf = true;
        zzk();
    }

    public final void zzdv() {
    }

    public final synchronized void zzdw(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            zze.zza("Inspector closed.");
            zzdn zzdn = this.zzh;
            if (zzdn != null) {
                try {
                    zzdn.zze((com.google.android.gms.ads.internal.client.zze) null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcfg zzcfg = this.zzd;
        if (zzcfg == null || zzcfg.zzaE()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzi(zzdvi zzdvi) {
        this.zzc = zzdvi;
    }

    public final synchronized void zzj(zzdn zzdn, zzbkz zzbkz, zzbks zzbks, zzbkg zzbkg) {
        zzdn zzdn2 = zzdn;
        synchronized (this) {
            if (zzl(zzdn)) {
                try {
                    zzv.zzB();
                    zzcfg zza2 = zzcft.zza(this.zza, zzchd.zza(), "", false, false, (zzavu) null, (zzbel) null, this.zzb, (zzbdt) null, (zzn) null, (zza) null, zzbcc.zza(), (zzfca) null, (zzfcd) null, (zzecl) null, (zzfda) null, (zzdsj) null);
                    this.zzd = zza2;
                    zzcgy zzN = zza2.zzN();
                    if (zzN == null) {
                        int i = zze.zza;
                        zzo.zzj("Failed to obtain a web view for the ad inspector");
                        try {
                            zzv.zzp().zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                            zzdn2.zze(zzfdx.zzd(17, "Failed to obtain a web view for the ad inspector", (com.google.android.gms.ads.internal.client.zze) null));
                        } catch (RemoteException e) {
                            zzv.zzp().zzw(e, "InspectorUi.openInspector 3");
                        }
                    } else {
                        this.zzh = zzdn2;
                        Context context = this.zza;
                        zzN.zzX((com.google.android.gms.ads.internal.client.zza) null, (zzbiv) null, (zzr) null, (zzbix) null, (zzad) null, false, (zzbki) null, (zzb) null, (zzbsv) null, (zzbya) null, (zzeca) null, (zzfjy) null, (zzdsj) null, zzbkz, (zzded) null, new zzbky(context), zzbks, zzbkg, (zzcmq) null);
                        zzN.zzC(this);
                        this.zzd.loadUrl((String) zzbd.zzc().zzb(zzbde.zzjq));
                        zzv.zzj();
                        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true, (zzdsj) null);
                        this.zzg = zzv.zzD().currentTimeMillis();
                    }
                } catch (zzcfs e2) {
                    int i2 = zze.zza;
                    zzo.zzk("Failed to obtain a web view for the ad inspector", e2);
                    try {
                        zzv.zzp().zzw(e2, "InspectorUi.openInspector 0");
                        zzdn2.zze(zzfdx.zzd(17, "Failed to obtain a web view for the ad inspector", (com.google.android.gms.ads.internal.client.zze) null));
                    } catch (RemoteException e3) {
                        zzv.zzp().zzw(e3, "InspectorUi.openInspector 1");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzk() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zze     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r2.zzf     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            com.google.android.gms.internal.ads.zzgdy r0 = com.google.android.gms.internal.ads.zzcaf.zzf     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.zzdvs r1 = new com.google.android.gms.internal.ads.zzdvs     // Catch:{ all -> 0x0018 }
            r1.<init>(r2)     // Catch:{ all -> 0x0018 }
            r0.execute(r1)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0016:
            monitor-exit(r2)
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvt.zzk():void");
    }
}
