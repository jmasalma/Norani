package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzhgh implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhgi zzb;

    zzhgh(zzhgi zzhgi) {
        this.zzb = zzhgi;
    }

    public final boolean hasNext() {
        int i = this.zza;
        zzhgi zzhgi = this.zzb;
        return i < zzhgi.zza.size() || zzhgi.zzb.hasNext();
    }

    public final Object next() {
        int i = this.zza;
        zzhgi zzhgi = this.zzb;
        List list = zzhgi.zza;
        if (i < list.size()) {
            int i2 = this.zza;
            this.zza = i2 + 1;
            return list.get(i2);
        }
        list.add(zzhgi.zzb.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
