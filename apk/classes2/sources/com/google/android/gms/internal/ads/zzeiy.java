package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeiy extends zzcoz {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzeiy(zzeja zzeja, View view, zzcfg zzcfg, zzcqy zzcqy, zzfcb zzfcb) {
        super(view, (zzcfg) null, zzcqy, zzfcb);
        Objects.requireNonNull(zzeja);
    }

    public final zzcxk zzd(Set set) {
        return new zzcxk(Collections.emptySet());
    }
}
