package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzftc;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzftf;
import com.google.android.gms.internal.ads.zzfty;
import com.google.android.gms.internal.ads.zzfua;
import com.google.android.gms.internal.ads.zzfub;
import com.google.android.gms.internal.ads.zzfuc;
import com.google.android.gms.internal.ads.zzfud;
import com.google.android.gms.internal.ads.zzfuq;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzz {
    private String zza = null;
    private String zzb = null;
    private zzcfg zzc = null;
    private zzfte zzd = null;
    private boolean zze = false;
    private zzfub zzf;

    public static /* synthetic */ void zza(zzz zzz, String str, Map map) {
        zzcfg zzcfg = zzz.zzc;
        if (zzcfg != null) {
            zzcfg.zzd(str, map);
        }
    }

    private final zzfud zzl() {
        zzfuc zzc2 = zzfud.zzc();
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlU)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc2.zzb(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc2.zza(this.zzb);
        }
        return zzc2.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzy(this);
        }
    }

    public final synchronized void zzb(zzcfg zzcfg, Context context) {
        this.zzc = zzcfg;
        if (!zzk(context)) {
            zzg("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zzf("on_play_store_bind", hashMap);
    }

    public final void zzc() {
        zzfte zzfte;
        if (!this.zze || (zzfte = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfte.zza(zzl(), this.zzf);
        zze("onLMDOverlayCollapse");
    }

    public final void zzd() {
        zzfte zzfte;
        if (!this.zze || (zzfte = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzftc zzc2 = zzftd.zzc();
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlU)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc2.zzb(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc2.zza(this.zzb);
        }
        zzfte.zzb(zzc2.zzc(), this.zzf);
    }

    /* access modifiers changed from: package-private */
    public final void zze(String str) {
        zzf(str, new HashMap());
    }

    /* access modifiers changed from: package-private */
    public final void zzf(String str, Map map) {
        zzcaf.zzf.execute(new zzx(this, str, map));
    }

    /* access modifiers changed from: package-private */
    public final void zzg(String str, String str2) {
        zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zzf("onError", hashMap);
        }
    }

    public final void zzh() {
        zzfte zzfte;
        if (!this.zze || (zzfte = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfte.zzc(zzl(), this.zzf);
        zze("onLMDOverlayExpand");
    }

    /* access modifiers changed from: package-private */
    public final void zzi(zzfua zzfua) {
        if (!TextUtils.isEmpty(zzfua.zzb())) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlU)).booleanValue()) {
                this.zza = zzfua.zzb();
            }
        }
        switch (zzfua.zza()) {
            case 8152:
                zze("onLMDOverlayOpened");
                return;
            case 8153:
                zze("onLMDOverlayClicked");
                return;
            case 8155:
                zze("onLMDOverlayClose");
                return;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfua.zza()));
                zzf("onLMDOverlayFailedToOpen", hashMap);
                return;
            default:
                return;
        }
    }

    public final void zzj(zzcfg zzcfg, zzfty zzfty) {
        if (zzcfg == null) {
            zzg("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcfg;
        if (this.zze || zzk(zzcfg.getContext())) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzlU)).booleanValue()) {
                this.zzb = zzfty.zzh();
            }
            zzm();
            zzfte zzfte = this.zzd;
            if (zzfte != null) {
                zzfte.zzd(zzfty, this.zzf);
                return;
            }
            return;
        }
        zzg("LMDOverlay not bound", "on_play_store_bind");
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfuq.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzftf.zza(context);
        } catch (NullPointerException e) {
            zze.zza("Error connecting LMD Overlay service");
            zzv.zzp().zzw(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
