package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzagg extends zzagf {
    private final zzen zzb = new zzen(zzfv.zza);
    private final zzen zzc = new zzen(4);
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzagg(zzafb zzafb) {
        super(zzafb);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzen zzen) throws zzage {
        int zzm = zzen.zzm();
        int i = zzm >> 4;
        int i2 = zzm & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzage("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(zzen zzen, long j) throws zzaz {
        int i;
        zzen zzen2 = zzen;
        int zzm = zzen.zzm();
        long zzh = (long) zzen.zzh();
        if (zzm == 0) {
            if (!this.zze) {
                zzen zzen3 = new zzen(new byte[zzen.zza()]);
                zzen2.zzH(zzen3.zzN(), 0, zzen.zza());
                zzacz zza = zzacz.zza(zzen3);
                this.zzd = zza.zzb;
                zzx zzx = new zzx();
                zzx.zzG("video/x-flv");
                zzx.zzah("video/avc");
                zzx.zzE(zza.zzl);
                zzx.zzam(zza.zzc);
                zzx.zzQ(zza.zzd);
                zzx.zzad(zza.zzk);
                zzx.zzT(zza.zza);
                this.zza.zzm(zzx.zzan());
                this.zze = true;
                return false;
            }
        } else if (zzm == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            zzen zzen4 = this.zzc;
            byte[] zzN = zzen4.zzN();
            zzN[0] = 0;
            zzN[1] = 0;
            zzN[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzen.zza() > 0) {
                zzen2.zzH(zzen4.zzN(), i3, this.zzd);
                zzen4.zzL(0);
                zzen zzen5 = this.zzb;
                int zzp = zzen4.zzp();
                zzen5.zzL(0);
                zzafb zzafb = this.zza;
                zzafb.zzr(zzen5, 4);
                zzafb.zzr(zzen2, zzp);
                i4 = i4 + 4 + zzp;
            }
            this.zza.zzt(j + (zzh * 1000), i, i4, 0, (zzafa) null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
