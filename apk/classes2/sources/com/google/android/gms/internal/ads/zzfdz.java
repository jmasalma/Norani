package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfdz implements zzhgr {
    private zzfdz(zzfdy zzfdy) {
    }

    public static zzfdz zza(zzfdy zzfdy) {
        return new zzfdz(zzfdy);
    }

    public final /* synthetic */ Object zzb() {
        Clock instance = DefaultClock.getInstance();
        zzhgz.zzb(instance);
        Clock clock = instance;
        return instance;
    }
}
