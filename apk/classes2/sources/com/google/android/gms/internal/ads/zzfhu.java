package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfhu implements Runnable {
    private final List zza = new ArrayList();
    private final zzfhx zzb;
    private String zzc;
    private zzfhz zzd = zzfhz.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zze;
    private zzfcm zzf;
    private zze zzg;
    private Future zzh;
    private int zzi = 2;

    zzfhu(zzfhx zzfhx) {
        this.zzb = zzfhx;
    }

    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfhu zza(zzfhj zzfhj) {
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfhj.zzj();
            list.add(zzfhj);
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            this.zzh = zzcaf.zzd.schedule(this, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzjh)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfhu zzb(String str) {
        if (((Boolean) zzbex.zzc.zze()).booleanValue() && zzfht.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfhu zzc(zze zze2) {
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            this.zzg = zze2;
        }
        return this;
    }

    public final synchronized zzfhu zzd(ArrayList arrayList) {
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner")) {
                if (!arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial")) {
                        if (!arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                            if (!arrayList.contains("native")) {
                                if (!arrayList.contains(AdFormat.NATIVE.name())) {
                                    if (!arrayList.contains("rewarded")) {
                                        if (!arrayList.contains(AdFormat.REWARDED.name())) {
                                            if (arrayList.contains("app_open_ad")) {
                                                this.zzi = 7;
                                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                                this.zzi = 6;
                                            }
                                        }
                                    }
                                    this.zzi = 5;
                                }
                            }
                            this.zzi = 8;
                        }
                    }
                    this.zzi = 4;
                }
            }
            this.zzi = 3;
        }
        return this;
    }

    public final synchronized zzfhu zze(String str) {
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzfhu zzf(Bundle bundle) {
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            this.zzd = zzaa.zza(bundle);
        }
        return this;
    }

    public final synchronized zzfhu zzg(zzfcm zzfcm) {
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            this.zzf = zzfcm;
        }
        return this;
    }

    public final synchronized void zzh() {
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            List<zzfhj> list = this.zza;
            for (zzfhj zzfhj : list) {
                int i = this.zzi;
                if (i != 2) {
                    zzfhj.zzn(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfhj.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zze) && !zzfhj.zzl()) {
                    zzfhj.zzd(this.zze);
                }
                zzfcm zzfcm = this.zzf;
                if (zzfcm != null) {
                    zzfhj.zzb(zzfcm);
                } else {
                    zze zze2 = this.zzg;
                    if (zze2 != null) {
                        zzfhj.zza(zze2);
                    }
                }
                zzfhj.zzf(this.zzd);
                this.zzb.zzc(zzfhj.zzm());
            }
            list.clear();
        }
    }

    public final synchronized zzfhu zzi(int i) {
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            this.zzi = i;
        }
        return this;
    }
}
