package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcdg implements Iterable {
    private final List zza = new ArrayList();

    public final Iterator iterator() {
        return this.zza.iterator();
    }

    /* access modifiers changed from: package-private */
    public final zzcdf zza(zzccb zzccb) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdf zzcdf = (zzcdf) it.next();
            if (zzcdf.zza == zzccb) {
                return zzcdf;
            }
        }
        return null;
    }

    public final void zzb(zzcdf zzcdf) {
        this.zza.add(zzcdf);
    }

    public final void zzc(zzcdf zzcdf) {
        this.zza.remove(zzcdf);
    }

    public final boolean zzd(zzccb zzccb) {
        ArrayList<zzcdf> arrayList = new ArrayList<>();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdf zzcdf = (zzcdf) it.next();
            if (zzcdf.zza == zzccb) {
                arrayList.add(zzcdf);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (zzcdf zzcdf2 : arrayList) {
            zzcdf2.zzb.zzf();
        }
        return true;
    }
}
