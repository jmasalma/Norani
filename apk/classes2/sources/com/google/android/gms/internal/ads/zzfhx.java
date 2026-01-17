package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfhx implements Runnable {
    public static final Object zza = new Object();
    public static Boolean zzb;
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzfic zzg = zzfig.zzb();
    private String zzh = "";
    private int zzi;
    private final zzdpw zzj;
    private final List zzk;
    private final zzcgz zzl;
    private boolean zzm = false;
    private final zzbvy zzn;

    public zzfhx(Context context, VersionInfoParcel versionInfoParcel, zzdpw zzdpw, zzeag zzeag, zzbvy zzbvy, zzcgz zzcgz) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdpw;
        this.zzn = zzbvy;
        this.zzl = zzcgz;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjk)).booleanValue()) {
            this.zzk = zzs.zzd();
        } else {
            this.zzk = zzfyq.zzn();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            if (zzb == null) {
                boolean z = false;
                if (!((Boolean) zzbex.zzb.zze()).booleanValue()) {
                    zzb = false;
                } else {
                    if (Math.random() < ((Double) zzbex.zza.zze()).doubleValue()) {
                        z = true;
                    }
                    zzb = Boolean.valueOf(z);
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    public static /* synthetic */ void zzb(zzfhx zzfhx, zzfhn zzfhn) {
        synchronized (zzd) {
            if (!zzfhx.zzm) {
                zzfhx.zzm = true;
                if (zza()) {
                    try {
                        zzv.zzr();
                        zzfhx.zzh = zzs.zzq(zzfhx.zze);
                    } catch (RemoteException | RuntimeException e) {
                        zzv.zzp().zzw(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    zzfhx.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(zzfhx.zze);
                    int intValue = ((Integer) zzbd.zzc().zzb(zzbde.zzjf)).intValue();
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzmo)).booleanValue()) {
                        long j = (long) intValue;
                        zzcaf.zzd.scheduleWithFixedDelay(zzfhx, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = (long) intValue;
                        zzcaf.zzd.scheduleAtFixedRate(zzfhx, j2, j2, TimeUnit.MILLISECONDS);
                    }
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzjl)).booleanValue()) {
                        zzfhx.zzl.zzc();
                    }
                }
            }
        }
        if (zza() && zzfhn != null) {
            synchronized (zzc) {
                zzfic zzfic = zzfhx.zzg;
                if (zzfic.zza() < ((Integer) zzbd.zzc().zzb(zzbde.zzjg)).intValue()) {
                    zzfhy zza2 = zzfib.zza();
                    zza2.zzw(zzfhn.zzm());
                    zza2.zzs(zzfhn.zzl());
                    zza2.zzh(zzfhn.zzb());
                    zza2.zzy(3);
                    zza2.zzp(zzfhx.zzf.afmaVersion);
                    zza2.zzb(zzfhx.zzh);
                    zza2.zzl(Build.VERSION.RELEASE);
                    zza2.zzt(Build.VERSION.SDK_INT);
                    zza2.zzx(zzfhn.zzo());
                    zza2.zzk(zzfhn.zza());
                    zza2.zzf((long) zzfhx.zzi);
                    zza2.zzv(zzfhn.zzn());
                    zza2.zzc(zzfhn.zze());
                    zza2.zzg(zzfhn.zzg());
                    zza2.zzi(zzfhn.zzh());
                    zza2.zzj(zzfhx.zzj.zzb(zzfhn.zzh()));
                    zza2.zzm(zzfhn.zzi());
                    zza2.zzo(zzfhn.zzd());
                    zza2.zzd(zzfhn.zzf());
                    zza2.zzu(zzfhn.zzk());
                    zza2.zzq(zzfhn.zzj());
                    zza2.zzr(zzfhn.zzc());
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzjk)).booleanValue()) {
                        zza2.zza(zzfhx.zzk);
                    }
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzjl)).booleanValue()) {
                        zzcgz zzcgz = zzfhx.zzl;
                        zzhcs zza3 = zzcgz.zza();
                        String zzb2 = zzcgz.zzb();
                        if (zza3 != null) {
                            zza2.zze(zza3);
                        }
                        if (zzb2 != null) {
                            zza2.zzn(zzb2);
                        }
                    }
                    zzfid zza4 = zzfie.zza();
                    zza4.zza(zza2);
                    zzfic.zzb(zza4);
                }
            }
        }
    }

    public final void run() {
        byte[] zzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() != 0) {
                    try {
                        synchronized (obj) {
                            zzfic zzfic = this.zzg;
                            zzaV = ((zzfig) zzfic.zzbr()).zzaV();
                            zzfic.zzc();
                        }
                        zzead zzead = new zzead((String) zzbd.zzc().zzb(zzbde.zzje), 60000, new HashMap(), zzaV, "application/x-protobuf", false);
                        zzead zzead2 = zzead;
                        new zzeaf(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid()).zza(zzead);
                    } catch (Exception e) {
                        if (!(e instanceof zzdwm) || ((zzdwm) e).zza() != 3) {
                            zzv.zzp().zzv(e, "CuiMonitor.sendCuiPing");
                        }
                    }
                }
            }
        }
    }

    public final void zzc(zzfhn zzfhn) {
        zzcaf.zza.zza(new zzfhw(this, zzfhn));
    }
}
