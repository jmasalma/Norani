package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzabi implements zzaco {
    final /* synthetic */ zzabo zza;
    private zzfyq zzb = zzfyq.zzn();
    private zzz zzc;
    private long zzd;
    private long zze = -9223372036854775807L;

    public zzabi(zzabo zzabo, Context context, int i) {
        Objects.requireNonNull(zzabo);
        this.zza = zzabo;
        zzex.zzL(context);
    }

    private final void zza(zzz zzz) {
        zzabo zzabo = this.zza;
        zzx zzb2 = zzz.zzb();
        zzb2.zzF(zzabo.zzA(zzz.zzE));
        zzb2.zzan();
        throw null;
    }

    public final boolean zzA(zzz zzz) throws zzacn {
        return zzabo.zzy(this.zza, zzz, 0);
    }

    public final boolean zzB() {
        return false;
    }

    public final boolean zzC() {
        return false;
    }

    public final boolean zzD(boolean z) {
        return this.zza.zze.zzD(false);
    }

    public final Surface zzb() {
        zzdd.zzf(false);
        throw null;
    }

    public final void zzh() {
        zzabo zzabo = this.zza;
        if (zzabo.zzh.zza() == 0) {
            zzabo.zze.zzh();
            return;
        }
        zzet zzet = new zzet(10);
        boolean z = true;
        while (zzabo.zzh.zza() > 0) {
            zzabm zzabm = (zzabm) zzabo.zzh.zzb();
            zzabm.getClass();
            zzabm zzabm2 = zzabm;
            if (z) {
                int i = zzabm.zzb;
                if (i == 0 || i == 1) {
                    zzabm = new zzabm(zzabm.zza, 0, zzabm.zzc);
                } else {
                    zzabo.zze.zzh();
                }
            }
            zzet.zzd(zzabm.zzc, zzabm);
            z = false;
        }
        zzabo.zzh = zzet;
    }

    public final void zzi() {
        this.zza.zzq();
    }

    public final void zzj(boolean z) {
        this.zze = -9223372036854775807L;
        zzabo.zzj(this.zza, z);
    }

    public final void zzk(boolean z) {
        zzabo zzabo = this.zza;
        if (zzabo.zzd) {
            zzabo.zze.zzk(z);
        }
    }

    public final void zzl(int i, zzz zzz, long j, int i2, List list) {
        zzz zzz2 = zzz;
        zzdd.zzf(false);
        this.zzb = zzfyq.zzl(list);
        this.zzc = zzz2;
        zzabo zzabo = this.zza;
        zzabo.zzq = -9223372036854775807L;
        zza(zzz2);
        long j2 = this.zze;
        long j3 = -4611686018427387904L;
        if (!zzabo.zzd) {
            if (j2 != -9223372036854775807L) {
                return;
            }
        } else if (j2 != -9223372036854775807L) {
            j3 = j2 + 1;
        }
        zzabo.zzh.zzd(j3, new zzabm(j + this.zzd, i2, j3));
    }

    public final void zzm() {
    }

    public final void zzn() {
        this.zza.zzr();
    }

    public final void zzo(long j, long j2) throws zzacn {
        this.zza.zze.zzo(j + this.zzd, j2);
    }

    public final void zzp(long j) {
        this.zzd = j;
    }

    public final void zzq(int i) {
        this.zza.zze.zzq(i);
    }

    public final void zzr(zzacl zzacl, Executor executor) {
    }

    public final void zzs(Surface surface, zzeo zzeo) {
        this.zza.zzs(surface, zzeo);
    }

    public final void zzt(float f) {
        this.zza.zze.zzt(f);
    }

    public final void zzu(List list) {
        if (!this.zzb.equals(list)) {
            this.zzb = zzfyq.zzl(list);
            zzz zzz = this.zzc;
            if (zzz != null) {
                zza(zzz);
            }
        }
    }

    public final void zzv(zzabp zzabp) {
        this.zza.zze.zzv(zzabp);
    }

    public final void zzw() {
        zzabo zzabo = this.zza;
        zzabo.zzq = this.zze;
        if (zzabo.zzp >= zzabo.zzq) {
            zzabo.zze.zzw();
        }
    }

    public final void zzx() {
        zzabo zzabo = this.zza;
        if (zzabo.zzd) {
            zzabo.zzu();
        }
    }

    public final void zzy() {
        zzabo zzabo = this.zza;
        if (zzabo.zzd) {
            zzabo.zzv();
        }
    }

    public final boolean zzz(long j, zzacm zzacm) {
        zzdd.zzf(false);
        if (!zzabo.zzz(this.zza)) {
            return false;
        }
        throw null;
    }
}
