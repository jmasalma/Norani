package com.google.android.gms.internal.ads;

import com.google.common.primitives.Ints;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzax {
    public final int zza;
    public final int zzb;

    public zzax(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final int zza() {
        int i = this.zzb;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i != 42) {
            return i != 22 ? i != 23 ? 0 : 15 : Ints.MAX_POWER_OF_TWO;
        }
        return 16;
    }
}
