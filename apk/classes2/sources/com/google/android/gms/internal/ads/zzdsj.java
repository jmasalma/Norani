package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdsj {
    /* access modifiers changed from: private */
    public final zzdso zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    /* access modifiers changed from: private */
    public final Map zzc;

    public zzdsj(zzdso zzdso, Executor executor) {
        this.zza = zzdso;
        this.zzc = zzdso.zza();
        this.zzb = executor;
    }

    public final zzdsi zza() {
        zzdsi zzdsi = new zzdsi(this);
        zzdsi unused = zzdsi.zzb.putAll(zzdsi.zza.zzc);
        return zzdsi;
    }

    public final void zze() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzma)).booleanValue()) {
            zzdsi zza2 = zza();
            zza2.zzb("action", "pecr");
            zza2.zzj();
        }
    }
}
