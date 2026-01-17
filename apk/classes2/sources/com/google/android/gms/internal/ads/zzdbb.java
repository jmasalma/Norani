package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdbb implements zzcza {
    private int zza = ((Integer) zzbd.zzc().zzb(zzbde.zzbt)).intValue();
    private int zzb = ((Integer) zzbd.zzc().zzb(zzbde.zznl)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    public final void zzdn(zzbvq zzbvq) {
    }

    public final synchronized void zzdo(zzfcn zzfcn) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzbu)).booleanValue()) {
            try {
                zzfcd zzfcd = zzfcn.zzb.zzb;
                this.zza = zzfcd.zzc;
                this.zzb = zzfcd.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
