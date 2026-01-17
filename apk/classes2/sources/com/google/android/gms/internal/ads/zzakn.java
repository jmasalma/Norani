package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzakn {
    public static void zza(zzako zzako, zzaks zzaks, zzdn zzdn) {
        for (int i = 0; i < zzako.zza(); i++) {
            long zzb = zzako.zzb(i);
            List zzc = zzako.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i != zzako.zza() - 1) {
                    long zzb2 = zzako.zzb(i + 1) - zzako.zzb(i);
                    if (zzb2 > 0) {
                        zzdn.zza(new zzakl(zzc, zzb, zzb2));
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
