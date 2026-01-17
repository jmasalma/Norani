package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhgi extends AbstractList {
    private static final zzhgj zzc = zzhgj.zzb(zzhgi.class);
    final List zza;
    final Iterator zzb;

    public zzhgi(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    public final Object get(int i) {
        List list = this.zza;
        if (list.size() > i) {
            return list.get(i);
        }
        Iterator it = this.zzb;
        if (it.hasNext()) {
            list.add(it.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final Iterator iterator() {
        return new zzhgh(this);
    }

    public final int size() {
        zzhgj zzhgj = zzc;
        zzhgj.zza("potentially expensive size() call");
        zzhgj.zza("blowup running");
        while (true) {
            Iterator it = this.zzb;
            if (!it.hasNext()) {
                return this.zza.size();
            }
            this.zza.add(it.next());
        }
    }
}
