package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzcar {
    private final zzcak zza;
    /* access modifiers changed from: private */
    public final AtomicInteger zzb = new AtomicInteger(0);

    public zzcar() {
        zzcak zzcak = new zzcak();
        this.zza = zzcak;
        zzgdn.zzr(zzcak, new zzcap(this), zzcaf.zzg);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhZ)).booleanValue()) {
            zzv.zzp().zzv(th, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzcao zzcao, zzcam zzcam) {
        zzgdn.zzr(this.zza, new zzcaq(this, zzcao, zzcam), zzcaf.zzg);
    }
}
