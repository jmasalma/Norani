package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbzz {
    private zzgdy zza;
    private zzdsj zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private long zze = -1;
    private long zzf = -1;

    public static /* synthetic */ void zza(zzbzz zzbzz) {
        zzdsj zzdsj;
        while (zzbzz.zzd.get()) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            zzs.zza.post(new zzbzx(atomicBoolean));
            try {
                Thread.sleep(zzbzz.zze);
                if (!atomicBoolean.get()) {
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zznV)).booleanValue() && (zzdsj = zzbzz.zzb) != null) {
                        zzdsi zza2 = zzdsj.zza();
                        zza2.zzb("action", "paa");
                        zza2.zzi();
                    }
                }
                do {
                    try {
                        Thread.sleep(zzbzz.zzf);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public final void zzb(zzgdy zzgdy, zzdsj zzdsj) {
        if (!this.zzc.getAndSet(true)) {
            this.zza = zzgdy;
            this.zzb = zzdsj;
            this.zze = ((Long) zzbd.zzc().zzb(zzbde.zznT)).longValue();
            this.zzf = ((Long) zzbd.zzc().zzb(zzbde.zznU)).longValue();
        }
    }

    public final void zzc() {
        zzgdy zzgdy;
        if (this.zzc.get() && this.zze >= 0 && this.zzf >= 0 && this.zzd.compareAndSet(false, true) && (zzgdy = this.zza) != null) {
            zzgdy.zza(new zzbzy(this));
        }
    }
}
