package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdon extends zzcra {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgn zze;
    private final zzddh zzf;
    private final zzcwl zzg;
    private final zzcxs zzh;
    private final zzcrv zzi;
    private final zzbws zzj;
    private final zzfot zzk;
    private final zzfcp zzl;
    private boolean zzm = false;

    zzdon(zzcqz zzcqz, Context context, zzcfg zzcfg, zzdgn zzdgn, zzddh zzddh, zzcwl zzcwl, zzcxs zzcxs, zzcrv zzcrv, zzfca zzfca, zzfot zzfot, zzfcp zzfcp) {
        super(zzcqz);
        String str;
        this.zzc = context;
        this.zze = zzdgn;
        this.zzd = new WeakReference(zzcfg);
        this.zzf = zzddh;
        this.zzg = zzcwl;
        this.zzh = zzcxs;
        this.zzi = zzcrv;
        this.zzk = zzfot;
        zzbwo zzbwo = zzfca.zzl;
        if (zzbwo != null) {
            str = zzbwo.zza;
        } else {
            str = "";
        }
        this.zzj = new zzbxm(str, zzbwo != null ? zzbwo.zzb : 1);
        this.zzl = zzfcp;
    }

    public final void finalize() throws Throwable {
        try {
            zzcfg zzcfg = (zzcfg) this.zzd.get();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzgU)).booleanValue()) {
                if (!this.zzm && zzcfg != null) {
                    zzgdy zzgdy = zzcaf.zzf;
                    Objects.requireNonNull(zzcfg);
                    zzgdy.execute(new zzdom(zzcfg));
                }
            } else if (zzcfg != null) {
                zzcfg.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbws zzc() {
        return this.zzj;
    }

    public final zzfcp zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcfg zzcfg = (zzcfg) this.zzd.get();
        return zzcfg != null && !zzcfg.zzaG();
    }

    public final boolean zzh(boolean z, Activity activity) {
        zzv.zzr();
        zzdgn zzdgn = this.zze;
        if (!zzs.zzO(zzdgn.zza())) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzaQ)).booleanValue()) {
                zzv.zzr();
                if (zzs.zzH(this.zzc)) {
                    int i = zze.zza;
                    zzo.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zzd();
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzaR)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzm) {
            int i2 = zze.zza;
            zzo.zzj("The rewarded ad have been showed.");
            this.zzg.zzc(zzfdx.zzd(10, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            return false;
        }
        this.zzm = true;
        zzddh zzddh = this.zzf;
        zzddh.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            zzdgn.zzb(z, context, this.zzg);
            zzddh.zza();
            return true;
        } catch (zzdgm e) {
            this.zzg.zze(e);
            return false;
        }
    }
}
