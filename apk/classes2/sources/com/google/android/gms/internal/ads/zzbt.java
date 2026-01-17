package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbt {
    public static final zzbt zza = new zzbt(zzfyq.zzn());
    private final zzfyq zzb;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
    }

    public zzbt(List list) {
        this.zzb = zzfyq.zzl(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbt) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzfyq zza() {
        return this.zzb;
    }

    public final boolean zzb(int i) {
        int i2 = 0;
        while (true) {
            zzfyq zzfyq = this.zzb;
            if (i2 >= zzfyq.size()) {
                return false;
            }
            zzbs zzbs = (zzbs) zzfyq.get(i2);
            if (zzbs.zzc() && zzbs.zza() == i) {
                return true;
            }
            i2++;
        }
    }
}
