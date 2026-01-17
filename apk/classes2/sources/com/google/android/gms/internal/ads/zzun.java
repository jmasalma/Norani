package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzun implements zzvs, zzsd {
    final /* synthetic */ zzup zza;
    private final Object zzb;
    private zzvr zzc;
    private zzsc zzd;

    public zzun(zzup zzup, Object obj) {
        Objects.requireNonNull(zzup);
        this.zza = zzup;
        this.zzc = zzup.zze((zzvh) null);
        this.zzd = zzup.zzc((zzvh) null);
        this.zzb = obj;
    }

    private final zzvd zzf(zzvd zzvd, zzvh zzvh) {
        zzup zzup = this.zza;
        Object obj = this.zzb;
        zzup.zzx(obj, zzvd.zzc, zzvh);
        zzup.zzx(obj, zzvd.zzd, zzvh);
        return zzvd;
    }

    private final boolean zzg(int i, zzvh zzvh) {
        zzvh zzvh2;
        if (zzvh != null) {
            zzvh2 = this.zza.zzy(this.zzb, zzvh);
            if (zzvh2 == null) {
                return false;
            }
        } else {
            zzvh2 = null;
        }
        zzup zzup = this.zza;
        zzup.zzw(this.zzb, 0);
        zzvr zzvr = this.zzc;
        int i2 = zzvr.zza;
        if (!Objects.equals(zzvr.zzb, zzvh2)) {
            this.zzc = zzup.zzf(0, zzvh2);
        }
        zzsc zzsc = this.zzd;
        int i3 = zzsc.zza;
        if (Objects.equals(zzsc.zzb, zzvh2)) {
            return true;
        }
        this.zzd = zzup.zzd(0, zzvh2);
        return true;
    }

    public final void zzag(int i, zzvh zzvh, zzvd zzvd) {
        if (zzg(0, zzvh)) {
            zzvr zzvr = this.zzc;
            zzf(zzvd, zzvh);
            zzvr.zzd(zzvd);
        }
    }

    public final void zzah(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd) {
        if (zzg(0, zzvh)) {
            zzvr zzvr = this.zzc;
            zzf(zzvd, zzvh);
            zzvr.zze(zzuy, zzvd);
        }
    }

    public final void zzai(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd) {
        if (zzg(0, zzvh)) {
            zzvr zzvr = this.zzc;
            zzf(zzvd, zzvh);
            zzvr.zzf(zzuy, zzvd);
        }
    }

    public final void zzaj(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd, IOException iOException, boolean z) {
        if (zzg(0, zzvh)) {
            zzvr zzvr = this.zzc;
            zzf(zzvd, zzvh);
            zzvr.zzg(zzuy, zzvd, iOException, z);
        }
    }

    public final void zzak(int i, zzvh zzvh, zzuy zzuy, zzvd zzvd, int i2) {
        if (zzg(0, zzvh)) {
            zzvr zzvr = this.zzc;
            zzf(zzvd, zzvh);
            zzvr.zzh(zzuy, zzvd, i2);
        }
    }
}
