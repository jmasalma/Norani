package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzmi {
    public static final zzmi zza;
    public static final zzmi zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzmi zzmi = new zzmi(0, 0);
        zza = zzmi;
        new zzmi(LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE);
        new zzmi(LongCompanionObject.MAX_VALUE, 0);
        new zzmi(0, LongCompanionObject.MAX_VALUE);
        zzb = zzmi;
    }

    public zzmi(long j, long j2) {
        boolean z = true;
        zzdd.zzd(j >= 0);
        zzdd.zzd(j2 < 0 ? false : z);
        this.zzc = j;
        this.zzd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmi zzmi = (zzmi) obj;
            return this.zzc == zzmi.zzc && this.zzd == zzmi.zzd;
        }
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}
