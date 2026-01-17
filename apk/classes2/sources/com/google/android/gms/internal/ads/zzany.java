package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzany {
    private final zzamz zza;
    private final zzeu zzb;
    private final zzem zzc = new zzem(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzany(zzamz zzamz, zzeu zzeu) {
        this.zza = zzamz;
        this.zzb = zzeu;
    }

    public final void zza(zzen zzen) throws zzaz {
        long j;
        long j2;
        zzen zzen2 = zzen;
        zzem zzem = this.zzc;
        zzen2.zzH(zzem.zza, 0, 3);
        zzem.zzl(0);
        zzem.zzn(8);
        this.zzd = zzem.zzp();
        this.zze = zzem.zzp();
        zzem.zzn(6);
        zzen2.zzH(zzem.zza, 0, zzem.zzd(8));
        zzem.zzl(0);
        if (this.zzd) {
            zzem.zzn(4);
            long zzd2 = (long) zzem.zzd(3);
            zzem.zzn(1);
            int zzd3 = zzem.zzd(15) << 15;
            zzem.zzn(1);
            long zzd4 = (long) zzem.zzd(15);
            zzem.zzn(1);
            if (this.zzf || !this.zze) {
                j2 = zzd2;
            } else {
                zzem.zzn(4);
                zzem.zzn(1);
                zzem.zzn(1);
                j2 = zzd2;
                zzem.zzn(1);
                this.zzb.zzb((((long) zzem.zzd(3)) << 30) | ((long) (zzem.zzd(15) << 15)) | ((long) zzem.zzd(15)));
                this.zzf = true;
            }
            j = this.zzb.zzb((j2 << 30) | ((long) zzd3) | zzd4);
        } else {
            j = 0;
        }
        zzamz zzamz = this.zza;
        zzamz.zzd(j, 4);
        zzamz.zza(zzen2);
        zzamz.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
