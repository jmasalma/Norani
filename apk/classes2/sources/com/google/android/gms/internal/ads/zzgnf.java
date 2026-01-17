package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgnf {
    private HashMap zza = new HashMap();

    public final zzgnh zza() {
        if (this.zza != null) {
            zzgnh zzgnh = new zzgnh(Collections.unmodifiableMap(this.zza), (zzgng) null);
            this.zza = null;
            return zzgnh;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
