package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzans implements zzaoa {
    private zzz zza;
    private zzeu zzb;
    private zzafb zzc;

    public zzans(String str, String str2) {
        zzx zzx = new zzx();
        zzx.zzG("video/mp2t");
        zzx.zzah(str);
        this.zza = zzx.zzan();
    }

    public final void zza(zzen zzen) {
        zzdd.zzb(this.zzb);
        String str = zzex.zza;
        long zze = this.zzb.zze();
        long zzf = this.zzb.zzf();
        if (zze != -9223372036854775807L && zzf != -9223372036854775807L) {
            zzz zzz = this.zza;
            if (zzf != zzz.zzt) {
                zzx zzb2 = zzz.zzb();
                zzb2.zzal(zzf);
                zzz zzan = zzb2.zzan();
                this.zza = zzan;
                this.zzc.zzm(zzan);
            }
            int zza2 = zzen.zza();
            this.zzc.zzr(zzen, zza2);
            this.zzc.zzt(zze, 1, zza2, 0, (zzafa) null);
        }
    }

    public final void zzb(zzeu zzeu, zzady zzady, zzaon zzaon) {
        this.zzb = zzeu;
        zzaon.zzc();
        zzafb zzw = zzady.zzw(zzaon.zza(), 5);
        this.zzc = zzw;
        zzw.zzm(this.zza);
    }
}
