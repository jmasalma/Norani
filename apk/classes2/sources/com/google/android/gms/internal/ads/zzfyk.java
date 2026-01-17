package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzfyk {
    zzfyk() {
    }

    public abstract zzfyk zzb(Object obj);

    static int zze(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        } else if (i2 <= i) {
            return i;
        } else {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            return i3 < 0 ? IntCompanionObject.MAX_VALUE : i3;
        }
    }
}
