package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdku implements zzcws {
    private final zzdit zza;
    private final zzdiy zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdku(zzdit zzdit, zzdiy zzdiy, Executor executor, Executor executor2) {
        this.zza = zzdit;
        this.zzb = zzdiy;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzcfg zzcfg) {
        this.zzc.execute(new zzdks(zzcfg));
    }

    public final void zzt() {
        if (this.zzb.zzd()) {
            zzdit zzdit = this.zza;
            zzedh zzu = zzdit.zzu();
            if (zzu == null && zzdit.zzw() != null) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzfG)).booleanValue()) {
                    ListenableFuture zzw = zzdit.zzw();
                    zzcak zzp = zzdit.zzp();
                    if (zzw != null && zzp != null) {
                        zzgdn.zzr(zzgdn.zzl(zzw, zzp), new zzdkt(this), this.zzd);
                        return;
                    }
                    return;
                }
            }
            if (zzu != null) {
                zzcfg zzr = zzdit.zzr();
                zzcfg zzs = zzdit.zzs();
                if (zzr == null) {
                    zzr = zzs == null ? null : zzs;
                }
                if (zzr != null) {
                    zzb(zzr);
                }
            }
        }
    }
}
