package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcyi extends zzdbt implements zzcws, zzcxx {
    private final zzfca zzb;
    private final AtomicBoolean zzc = new AtomicBoolean();
    private final zzfcn zzd;

    public zzcyi(Set set, zzfca zzfca, zzfcn zzfcn) {
        super(set);
        this.zzb = zzfca;
        this.zzd = zzfcn;
    }

    private final void zzb() {
        zzt zzt;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzih)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzt = this.zzb.zzae) != null && zzt.zza == 3) {
            zzq(new zzcyg(zzt));
        }
    }

    public final void zza(zzt zzt) {
        if (zzaa.zzf(this.zzd) && this.zzb.zzaB) {
            zzq(new zzcyh(zzt));
        }
    }

    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    public final void zzt() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
