package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzehd {
    private final zzfdo zza;
    private final zzdpw zzb;
    private final zzdsj zzc;

    public zzehd(zzfdo zzfdo, zzdpw zzdpw, zzdsj zzdsj) {
        this.zza = zzfdo;
        this.zzb = zzdpw;
        this.zzc = zzdsj;
    }

    public final void zza(zzfcd zzfcd, zzfca zzfca, int i, @Nullable zzedq zzedq, long j) {
        zzdpv zzdpv;
        zzdsi zza2 = this.zzc.zza();
        zza2.zzd(zzfcd);
        zza2.zzc(zzfca);
        zza2.zzb("action", "adapter_status");
        zza2.zzb("adapter_l", String.valueOf(j));
        zza2.zzb("sc", Integer.toString(i));
        if (zzedq != null) {
            zza2.zzb("arec", Integer.toString(zzedq.zzb().zza));
            String zza3 = this.zza.zza(zzedq.getMessage());
            if (zza3 != null) {
                zza2.zzb("areec", zza3);
            }
        }
        zzdpw zzdpw = this.zzb;
        Iterator it = zzfca.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdpv = null;
                break;
            }
            zzdpv = zzdpw.zza((String) it.next());
            if (zzdpv != null) {
                break;
            }
        }
        if (zzdpv != null) {
            zza2.zzb("ancn", zzdpv.zza);
            zzbse zzbse = zzdpv.zzb;
            if (zzbse != null) {
                zza2.zzb("adapter_v", zzbse.toString());
            }
            zzbse zzbse2 = zzdpv.zzc;
            if (zzbse2 != null) {
                zza2.zzb("adapter_sv", zzbse2.toString());
            }
        }
        zza2.zzj();
    }
}
