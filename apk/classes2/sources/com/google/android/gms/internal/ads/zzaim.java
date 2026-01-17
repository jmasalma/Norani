package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaim {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzen zzf;
    private final zzen zzg;
    private int zzh;
    private int zzi;

    public zzaim(zzen zzen, zzen zzen2, boolean z) throws zzaz {
        this.zzg = zzen;
        this.zzf = zzen2;
        this.zze = z;
        zzen2.zzL(12);
        this.zza = zzen2.zzp();
        zzen.zzL(12);
        this.zzi = zzen.zzp();
        zzadz.zzc(zzen.zzg() != 1 ? false : true, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long j;
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        if (this.zze) {
            j = this.zzf.zzw();
        } else {
            j = this.zzf.zzu();
        }
        this.zzd = j;
        if (this.zzb == this.zzh) {
            zzen zzen = this.zzg;
            this.zzc = zzen.zzp();
            zzen.zzM(4);
            int i2 = -1;
            int i3 = this.zzi - 1;
            this.zzi = i3;
            if (i3 > 0) {
                i2 = -1 + zzen.zzp();
            }
            this.zzh = i2;
        }
        return true;
    }
}
