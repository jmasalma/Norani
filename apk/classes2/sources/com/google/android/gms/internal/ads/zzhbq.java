package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhbq implements Iterator {
    final /* synthetic */ zzhbt zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzhbq(zzhbt zzhbt, zzhbs zzhbs) {
        Objects.requireNonNull(zzhbt);
        this.zza = zzhbt;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzhbt zzhbt = this.zza;
        if (i < zzhbt.zzb) {
            return true;
        }
        if (!zzhbt.zzc.isEmpty()) {
            return zza().hasNext();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzhbt zzhbt = this.zza;
        if (i < zzhbt.zzb) {
            return (zzhbp) zzhbt.zza[i];
        }
        return (Map.Entry) zza().next();
    }

    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            zzhbt zzhbt = this.zza;
            zzhbt.zzo();
            int i = this.zzb;
            if (i < zzhbt.zzb) {
                this.zzb = i - 1;
                Object unused = zzhbt.zzm(i);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
