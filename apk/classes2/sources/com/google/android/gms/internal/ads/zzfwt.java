package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfwt extends zzfzj {
    final /* synthetic */ zzfwv zza;

    zzfwt(zzfwv zzfwv) {
        Objects.requireNonNull(zzfwv);
        this.zza = zzfwv;
    }

    public final boolean contains(Object obj) {
        return zzfxp.zza(this.zza.zza.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new zzfwu(this.zza);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        zzfwv zzfwv = this.zza;
        zzfxi.zzo(zzfwv.zzb, ((Map.Entry) Objects.requireNonNull((Map.Entry) obj)).getKey());
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
