package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbvz extends zzbwb {
    private final String zza;
    private final int zzb;

    public zzbvz(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbvz)) {
            return false;
        }
        zzbvz zzbvz = (zzbvz) obj;
        if (Objects.equal(this.zza, zzbvz.zza)) {
            if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbvz.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
