package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzre {
    private final zzcn[] zza;
    private final zzrw zzb;
    private final zzcq zzc;

    public zzre(zzcn... zzcnArr) {
        zzrw zzrw = new zzrw();
        zzcq zzcq = new zzcq();
        zzcn[] zzcnArr2 = new zzcn[2];
        this.zza = zzcnArr2;
        System.arraycopy(zzcnArr, 0, zzcnArr2, 0, 0);
        this.zzb = zzrw;
        this.zzc = zzcq;
        zzcnArr2[0] = zzrw;
        zzcnArr2[1] = zzcq;
    }

    public final long zza(long j) {
        zzcq zzcq = this.zzc;
        return zzcq.zzg() ? zzcq.zzi(j) : j;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbb zzc(zzbb zzbb) {
        zzcq zzcq = this.zzc;
        zzcq.zzk(zzbb.zzb);
        zzcq.zzj(zzbb.zzc);
        return zzbb;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzcn[] zze() {
        return this.zza;
    }
}
