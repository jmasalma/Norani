package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfex {
    private final HashMap zza = new HashMap();

    public final zzfew zza(zzfen zzfen, Context context, zzfef zzfef, zzffd zzffd) {
        HashMap hashMap = this.zza;
        zzfew zzfew = (zzfew) hashMap.get(zzfen);
        if (zzfew != null) {
            return zzfew;
        }
        zzfek zzfek = new zzfek(zzfeq.zza(zzfen, context));
        zzfew zzfew2 = new zzfew(zzfek, new zzfff(zzfek, zzfef, zzffd));
        hashMap.put(zzfen, zzfew2);
        return zzfew2;
    }
}
