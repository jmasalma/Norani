package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzls {
    private static final zzvh zzu = new zzvh(new Object(), -1);
    public final zzbl zza;
    public final zzvh zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzin zzf;
    public final boolean zzg;
    public final zzxk zzh;
    public final zzze zzi;
    public final List zzj;
    public final zzvh zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzbb zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzls(zzbl zzbl, zzvh zzvh, long j, long j2, int i, zzin zzin, boolean z, zzxk zzxk, zzze zzze, List list, zzvh zzvh2, boolean z2, int i2, int i3, zzbb zzbb, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzbl;
        this.zzb = zzvh;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzin;
        this.zzg = z;
        this.zzh = zzxk;
        this.zzi = zzze;
        this.zzj = list;
        this.zzk = zzvh2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = i3;
        this.zzo = zzbb;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzt = j6;
    }

    public static zzls zzh(zzze zzze) {
        zzbl zzbl = zzbl.zza;
        zzvh zzvh = zzu;
        return new zzls(zzbl, zzvh, -9223372036854775807L, 0, 1, (zzin) null, false, zzxk.zza, zzze, zzfyq.zzn(), zzvh, false, 1, 0, zzbb.zza, 0, 0, 0, 0, false);
    }

    public static zzvh zzi() {
        return zzu;
    }

    public final zzls zza(boolean z) {
        zzxk zzxk = this.zzh;
        zzze zzze = this.zzi;
        List list = this.zzj;
        zzvh zzvh = this.zzk;
        boolean z2 = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzbb zzbb = this.zzo;
        long j = this.zzq;
        long j2 = this.zzr;
        long j3 = this.zzs;
        long j4 = this.zzt;
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z, zzxk, zzze, list, zzvh, z2, i, i2, zzbb, j, j2, j3, j4, false);
    }

    public final zzls zzb(zzvh zzvh) {
        boolean z = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzbb zzbb = this.zzo;
        long j = this.zzq;
        long j2 = this.zzr;
        long j3 = this.zzs;
        long j4 = this.zzt;
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzvh, z, i, i2, zzbb, j, j2, j3, j4, false);
    }

    public final zzls zzc(zzvh zzvh, long j, long j2, long j3, long j4, zzxk zzxk, zzze zzze, List list) {
        long j5 = j2;
        long j6 = j3;
        long j7 = j4;
        zzxk zzxk2 = zzxk;
        zzze zzze2 = zzze;
        List list2 = list;
        zzvh zzvh2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzbb zzbb = this.zzo;
        long j8 = this.zzq;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = this.zze;
        zzin zzin = this.zzf;
        boolean z2 = this.zzg;
        return new zzls(this.zza, zzvh, j5, j6, i3, zzin, z2, zzxk2, zzze2, list2, zzvh2, z, i, i2, zzbb, j8, j7, j, elapsedRealtime, false);
    }

    public final zzls zzd(boolean z, int i, int i2) {
        zzbb zzbb = this.zzo;
        long j = this.zzq;
        long j2 = this.zzr;
        long j3 = this.zzs;
        long j4 = this.zzt;
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, i2, zzbb, j, j2, j3, j4, false);
    }

    public final zzls zze(zzin zzin) {
        boolean z = this.zzg;
        zzxk zzxk = this.zzh;
        zzze zzze = this.zzi;
        List list = this.zzj;
        zzvh zzvh = this.zzk;
        boolean z2 = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzbb zzbb = this.zzo;
        long j = this.zzq;
        long j2 = this.zzr;
        long j3 = this.zzs;
        long j4 = this.zzt;
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzin, z, zzxk, zzze, list, zzvh, z2, i, i2, zzbb, j, j2, j3, j4, false);
    }

    public final zzls zzf(int i) {
        zzin zzin = this.zzf;
        boolean z = this.zzg;
        zzxk zzxk = this.zzh;
        zzze zzze = this.zzi;
        List list = this.zzj;
        zzvh zzvh = this.zzk;
        boolean z2 = this.zzl;
        int i2 = this.zzm;
        int i3 = this.zzn;
        zzbb zzbb = this.zzo;
        long j = this.zzq;
        long j2 = this.zzr;
        long j3 = this.zzs;
        long j4 = this.zzt;
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, i, zzin, z, zzxk, zzze, list, zzvh, z2, i2, i3, zzbb, j, j2, j3, j4, false);
    }

    public final zzls zzg(zzbl zzbl) {
        return new zzls(zzbl, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
