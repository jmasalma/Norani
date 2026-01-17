package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcdf extends zzb {
    final zzccb zza;
    final zzcdn zzb;
    private final String zzc;
    private final String[] zzd;

    zzcdf(zzccb zzccb, zzcdn zzcdn, String str, String[] strArr) {
        this.zza = zzccb;
        this.zzb = zzcdn;
        this.zzc = str;
        this.zzd = strArr;
        zzv.zzA().zzb(this);
    }

    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            zzs.zza.post(new zzcde(this));
        }
    }

    public final ListenableFuture zzb() {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzci)).booleanValue() || !(this.zzb instanceof zzcdw)) {
            return zzcdf.super.zzb();
        }
        return zzcaf.zzf.zzb(new zzcdd(this));
    }

    public final String zze() {
        return this.zzc;
    }
}
