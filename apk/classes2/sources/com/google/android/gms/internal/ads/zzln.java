package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzln implements zzvs, zzsd {
    final /* synthetic */ zzlr zza;
    private final zzlp zzb;

    public zzln(zzlr zzlr, zzlp zzlp) {
        Objects.requireNonNull(zzlr);
        this.zza = zzlr;
        this.zzb = zzlp;
    }

    private final Pair zzf(int i, zzvh zzvh) {
        zzvh zzvh2;
        zzvh zzvh3 = null;
        if (zzvh != null) {
            zzlp zzlp = this.zzb;
            int i2 = 0;
            while (true) {
                List list = zzlp.zzc;
                if (i2 >= list.size()) {
                    zzvh2 = null;
                    break;
                } else if (((zzvh) list.get(i2)).zzd == zzvh.zzd) {
                    Object obj = zzvh.zza;
                    Object obj2 = zzlp.zzb;
                    int i3 = zzly.zzb;
                    zzvh2 = zzvh.zza(Pair.create(obj2, obj));
                    break;
                } else {
                    i2++;
                }
            }
            if (zzvh2 == null) {
                return null;
            }
            zzvh3 = zzvh2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzvh3);
    }

    public final void zzag(int i, zzvh zzvh, zzvd zzvd) {
        Pair zzf = zzf(0, zzvh);
        if (zzf != null) {
            this.zza.zzi.zzi(new zzll(this, zzf, zzvd));
        }
    }

    public final void zzah(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd) {
        Pair zzf = zzf(0, zzvh);
        if (zzf != null) {
            this.zza.zzi.zzi(new zzlk(this, zzf, zzuy, zzvd));
        }
    }

    public final void zzai(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd) {
        Pair zzf = zzf(0, zzvh);
        if (zzf != null) {
            this.zza.zzi.zzi(new zzlm(this, zzf, zzuy, zzvd));
        }
    }

    public final void zzaj(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd, IOException iOException, boolean z) {
        Pair zzf = zzf(0, zzvh);
        if (zzf != null) {
            this.zza.zzi.zzi(new zzlj(this, zzf, zzuy, zzvd, iOException, z));
        }
    }

    public final void zzak(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd, int i2) {
        Pair zzf = zzf(0, zzvh);
        if (zzf != null) {
            this.zza.zzi.zzi(new zzli(this, zzf, zzuy, zzvd, i2));
        }
    }
}
