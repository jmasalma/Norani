package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfxw extends zzfxj {
    final /* synthetic */ zzfxz zza;
    private final Object zzb;
    private int zzc;

    zzfxw(zzfxz zzfxz, int i) {
        Objects.requireNonNull(zzfxz);
        this.zza = zzfxz;
        this.zzb = zzfxz.zzg(zzfxz, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1) {
            zzfxz zzfxz = this.zza;
            if (i < zzfxz.size() && zzfvm.zza(this.zzb, zzfxz.zzg(zzfxz, this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzw(this.zzb);
    }

    public final Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        zzfxz zzfxz = this.zza;
        Map zzl = zzfxz.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzfxz.zzj(zzfxz, i);
    }

    public final Object setValue(Object obj) {
        zzfxz zzfxz = this.zza;
        Map zzl = zzfxz.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzfxz.put(this.zzb, obj);
            return null;
        }
        Object zzj = zzfxz.zzj(zzfxz, i);
        zzfxz.zzn(zzfxz, this.zzc, obj);
        return zzj;
    }
}
