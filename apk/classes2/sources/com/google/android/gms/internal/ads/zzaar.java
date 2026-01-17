package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaar implements zzaco {
    private final zzabs zza;
    private final zzabx zzb;
    /* access modifiers changed from: private */
    public final Queue zzc = new ArrayDeque();
    /* access modifiers changed from: private */
    public Surface zzd;
    private zzz zze = new zzx().zzan();
    private long zzf = -9223372036854775807L;
    /* access modifiers changed from: private */
    public zzacl zzg = zzacl.zzb;
    /* access modifiers changed from: private */
    public Executor zzh = new zzaaj();
    /* access modifiers changed from: private */
    public zzabp zzi = new zzaak();

    public zzaar(zzabs zzabs, zzdj zzdj) {
        this.zza = zzabs;
        zzabs.zzi(zzdj);
        this.zzb = new zzabx(new zzaap(this, (zzaaq) null), zzabs);
    }

    public final boolean zzA(zzz zzz) {
        return true;
    }

    public final boolean zzB() {
        return this.zzb.zzg();
    }

    public final boolean zzC() {
        return true;
    }

    public final boolean zzD(boolean z) {
        return this.zza.zzm(z);
    }

    public final Surface zzb() {
        Surface surface = this.zzd;
        zzdd.zzb(surface);
        Surface surface2 = surface;
        return surface;
    }

    public final void zzh() {
        this.zza.zzb();
    }

    public final void zzi() {
        this.zzd = null;
        this.zza.zzk((Surface) null);
    }

    public final void zzj(boolean z) {
        if (z) {
            this.zza.zzg();
        }
        this.zzb.zza();
        this.zzc.clear();
    }

    public final void zzk(boolean z) {
        this.zza.zzc(z);
    }

    public final void zzl(int i, zzz zzz, long j, int i2, List list) {
        zzdd.zzf(list.isEmpty());
        int i3 = zzz.zzv;
        zzz zzz2 = this.zze;
        if (!(i3 == zzz2.zzv && zzz.zzw == zzz2.zzw)) {
            this.zzb.zzd(i3, zzz.zzw);
        }
        float f = zzz.zzz;
        if (f != this.zze.zzz) {
            this.zza.zzj(f);
        }
        this.zze = zzz;
        if (j != this.zzf) {
            this.zzb.zzc(i2, j);
            this.zzf = j;
        }
    }

    public final void zzm() {
        throw new UnsupportedOperationException();
    }

    public final void zzn() {
    }

    public final void zzp(long j) {
        throw new UnsupportedOperationException();
    }

    public final void zzq(int i) {
        this.zza.zzh(i);
    }

    public final void zzr(zzacl zzacl, Executor executor) {
        this.zzg = zzacl;
        this.zzh = executor;
    }

    public final void zzs(Surface surface, zzeo zzeo) {
        this.zzd = surface;
        this.zza.zzk(surface);
    }

    public final void zzt(float f) {
        this.zza.zzl(f);
    }

    public final void zzu(List list) {
        throw new UnsupportedOperationException();
    }

    public final void zzv(zzabp zzabp) {
        this.zzi = zzabp;
    }

    public final void zzw() {
        this.zzb.zzf();
    }

    public final void zzx() {
        this.zza.zzd();
    }

    public final void zzy() {
        this.zza.zze();
    }

    public final boolean zzz(long j, zzacm zzacm) {
        this.zzc.add(zzacm);
        this.zzb.zzb(j);
        this.zzh.execute(new zzaal(this));
        return true;
    }

    public final void zzo(long j, long j2) throws zzacn {
        try {
            this.zzb.zze(j, j2);
        } catch (zzin e) {
            throw new zzacn(e, this.zze);
        }
    }
}
