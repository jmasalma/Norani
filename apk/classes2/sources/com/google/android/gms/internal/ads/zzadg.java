package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzadg {
    protected final zzada zza;
    protected final zzadf zzb;
    protected zzadc zzc;
    private final int zzd;

    protected zzadg(zzadd zzadd, zzadf zzadf, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzadf;
        this.zzd = i;
        this.zza = new zzada(zzadd, j, 0, j3, j4, j5, j6);
    }

    protected static final int zzf(zzadw zzadw, long j, zzaer zzaer) {
        if (j == zzadw.zzf()) {
            return 0;
        }
        zzaer.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzadw zzadw, long j) throws IOException {
        long zzf = j - zzadw.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        zzadw.zzk((int) zzf);
        return true;
    }

    public final int zza(zzadw zzadw, zzaer zzaer) throws IOException {
        while (true) {
            zzadc zzadc = this.zzc;
            zzdd.zzb(zzadc);
            zzadc zzadc2 = zzadc;
            long zzb2 = zzadc.zzf;
            long zza2 = zzadc.zzg;
            long zzc2 = zzadc.zzh;
            if (zza2 - zzb2 <= ((long) this.zzd)) {
                zzc(false, zzb2);
                return zzf(zzadw, zzb2, zzaer);
            } else if (!zzg(zzadw, zzc2)) {
                return zzf(zzadw, zzc2, zzaer);
            } else {
                zzadw.zzj();
                zzade zza3 = this.zzb.zza(zzadw, zzadc.zzb);
                int zza4 = zza3.zzb;
                if (zza4 == -3) {
                    zzc(false, zzc2);
                    return zzf(zzadw, zzc2, zzaer);
                } else if (zza4 == -2) {
                    zzadc.zzh(zzadc, zza3.zzc, zza3.zzd);
                } else if (zza4 != -1) {
                    zzg(zzadw, zza3.zzd);
                    zzc(true, zza3.zzd);
                    return zzf(zzadw, zza3.zzd, zzaer);
                } else {
                    zzadc.zzg(zzadc, zza3.zzc, zza3.zzd);
                }
            }
        }
    }

    public final zzaeu zzb() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2 = j;
        zzadc zzadc = this.zzc;
        if (zzadc == null || zzadc.zza != j2) {
            zzada zzada = this.zza;
            zzadc zzadc2 = r1;
            zzadc zzadc3 = new zzadc(j, zzada.zzf(j2), 0, zzada.zzc, zzada.zzd, zzada.zze, zzada.zzf);
            this.zzc = zzadc2;
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
