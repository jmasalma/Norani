package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcov extends zzcos {
    private final Context zzc;
    private final View zzd;
    private final zzcfg zze;
    private final zzfcb zzf;
    private final zzcqy zzg;
    private final zzdje zzh;
    private final zzdef zzi;
    private final zzhgl zzj;
    private final Executor zzk;
    private zzr zzl;

    zzcov(zzcqz zzcqz, Context context, zzfcb zzfcb, View view, zzcfg zzcfg, zzcqy zzcqy, zzdje zzdje, zzdef zzdef, zzhgl zzhgl, Executor executor) {
        super(zzcqz);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcfg;
        this.zzf = zzfcb;
        this.zzg = zzcqy;
        this.zzh = zzdje;
        this.zzi = zzdef;
        this.zzj = zzhgl;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzj(zzcov zzcov) {
        zzbia zze2 = zzcov.zzh.zze();
        if (zze2 != null) {
            try {
                zze2.zze((zzbx) zzcov.zzj.zzb(), ObjectWrapper.wrap(zzcov.zzc));
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzh("RemoteException when notifyAdLoad is called", e);
            }
        }
    }

    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    public final int zzc() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzij)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzik)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    public final View zzd() {
        return this.zzd;
    }

    public final zzed zze() {
        try {
            return this.zzg.zza();
        } catch (zzfdd unused) {
            return null;
        }
    }

    public final zzfcb zzf() {
        zzr zzr = this.zzl;
        if (zzr != null) {
            return zzfdc.zzb(zzr);
        }
        zzfca zzfca = this.zzb;
        if (zzfca.zzac) {
            for (String str : zzfca.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfcb(view.getWidth(), view.getHeight(), false);
        }
        return (zzfcb) zzfca.zzr.get(0);
    }

    public final zzfcb zzg() {
        return this.zzf;
    }

    public final void zzh() {
        this.zzi.zza();
    }

    public final void zzi(ViewGroup viewGroup, zzr zzr) {
        zzcfg zzcfg;
        if (viewGroup != null && (zzcfg = this.zze) != null) {
            zzcfg.zzaj(zzchd.zzc(zzr));
            viewGroup.setMinimumHeight(zzr.zzc);
            viewGroup.setMinimumWidth(zzr.zzf);
            this.zzl = zzr;
        }
    }

    public final void zzk() {
        this.zzk.execute(new zzcou(this));
        super.zzk();
    }
}
