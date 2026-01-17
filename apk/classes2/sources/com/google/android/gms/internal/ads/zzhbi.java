package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhbi implements Iterator {
    private final ArrayDeque zza;
    private zzgxv zzb;

    /* synthetic */ zzhbi(zzgxz zzgxz, zzhbj zzhbj) {
        if (zzgxz instanceof zzhbk) {
            zzhbk zzhbk = (zzhbk) zzgxz;
            ArrayDeque arrayDeque = new ArrayDeque(zzhbk.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzhbk);
            this.zzb = zzb(zzhbk.zzd);
            return;
        }
        this.zza = null;
        this.zzb = (zzgxv) zzgxz;
    }

    private final zzgxv zzb(zzgxz zzgxz) {
        while (zzgxz instanceof zzhbk) {
            zzhbk zzhbk = (zzhbk) zzgxz;
            this.zza.push(zzhbk);
            zzgxz = zzhbk.zzd;
        }
        return (zzgxv) zzgxz;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zza */
    public final zzgxv next() {
        zzgxv zzgxv;
        zzgxv zzgxv2 = this.zzb;
        if (zzgxv2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgxv = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.zzb = zzgxv;
                } else {
                    zzgxv = zzb(((zzhbk) arrayDeque.pop()).zze);
                }
            } while (zzgxv.zzd() == 0);
            this.zzb = zzgxv;
            return zzgxv2;
        }
        throw new NoSuchElementException();
    }
}
