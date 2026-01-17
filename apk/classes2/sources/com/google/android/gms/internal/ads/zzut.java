package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzut {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzgi zzc;

    public zzut(zzaea zzaea, zzakr zzakr) {
    }

    public final void zza(zzgi zzgi) {
        if (zzgi != this.zzc) {
            this.zzc = zzgi;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
