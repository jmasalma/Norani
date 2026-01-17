package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcon extends zzbav {
    private final zzcom zza;
    private final zzbx zzb;
    private final zzexy zzc;
    private boolean zzd = ((Boolean) zzbd.zzc().zzb(zzbde.zzaV)).booleanValue();
    private final zzdsj zze;

    public zzcon(zzcom zzcom, zzbx zzbx, zzexy zzexy, zzdsj zzdsj) {
        this.zza = zzcom;
        this.zzb = zzbx;
        this.zzc = zzexy;
        this.zze = zzdsj;
    }

    public final long zze() {
        zzcom zzcom = this.zza;
        if (zzcom == null || zzcom.zzl() == null) {
            return 0;
        }
        return zzcom.zzl().zza();
    }

    public final zzbx zzf() {
        return this.zzb;
    }

    public final zzea zzg() {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzgW)).booleanValue()) {
            return null;
        }
        return this.zza.zzm();
    }

    public final String zzh() {
        try {
            return this.zzb.zzs();
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void zzi(boolean z) {
        this.zzd = z;
    }

    public final void zzj(zzdt zzdt) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdt.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzn(zzdt);
        }
    }

    public final void zzk(long j) {
        zzcom zzcom = this.zza;
        if (zzcom != null && zzcom.zzl() != null) {
            zzcom.zzl().zzb(j);
        }
    }

    public final void zzl(IObjectWrapper iObjectWrapper, zzbbd zzbbd) {
        try {
            this.zzc.zzp(zzbbd);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbbd, this.zzd);
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
