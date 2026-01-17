package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzhgm {
    final LinkedHashMap zza;

    zzhgm(int i) {
        this.zza = zzhgo.zzb(i);
    }

    /* access modifiers changed from: package-private */
    public final zzhgm zza(Object obj, zzhha zzhha) {
        zzhgz.zza(obj, "key");
        zzhgz.zza(zzhha, "provider");
        zzhha zzhha2 = zzhha;
        this.zza.put(obj, zzhha);
        return this;
    }
}
