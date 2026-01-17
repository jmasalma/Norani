package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaem implements zzaeu {
    private final zzeb zza;
    private final zzeb zzb;
    private long zzc;

    public zzaem(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdd.zzd(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzeb(length2);
            this.zzb = new zzeb(length2);
        } else {
            int i = length2 + 1;
            zzeb zzeb = new zzeb(i);
            this.zza = zzeb;
            zzeb zzeb2 = new zzeb(i);
            this.zzb = zzeb2;
            zzeb.zzc(0);
            zzeb2.zzc(0);
        }
        this.zza.zzd(jArr);
        this.zzb.zzd(jArr2);
        this.zzc = j;
    }

    public final long zza() {
        return this.zzc;
    }

    public final zzaes zzg(long j) {
        zzeb zzeb = this.zzb;
        if (zzeb.zza() == 0) {
            zzaev zzaev = zzaev.zza;
            return new zzaes(zzaev, zzaev);
        }
        int zzb2 = zzex.zzb(zzeb, j, true, true);
        long zzb3 = zzeb.zzb(zzb2);
        zzeb zzeb2 = this.zza;
        zzaev zzaev2 = new zzaev(zzb3, zzeb2.zzb(zzb2));
        if (zzaev2.zzb == j || zzb2 == zzeb.zza() - 1) {
            return new zzaes(zzaev2, zzaev2);
        }
        int i = zzb2 + 1;
        return new zzaes(zzaev2, new zzaev(zzeb.zzb(i), zzeb2.zzb(i)));
    }

    public final boolean zzh() {
        return this.zzb.zza() > 0;
    }
}
