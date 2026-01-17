package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaoh implements zzaoa {
    final /* synthetic */ zzaoj zza;
    private final zzem zzb = new zzem(new byte[4], 4);

    public zzaoh(zzaoj zzaoj) {
        Objects.requireNonNull(zzaoj);
        this.zza = zzaoj;
    }

    public final void zza(zzen zzen) {
        if (zzen.zzm() == 0 && (zzen.zzm() & 128) != 0) {
            zzen.zzM(6);
            int zza2 = zzen.zza() / 4;
            for (int i = 0; i < zza2; i++) {
                zzem zzem = this.zzb;
                zzen.zzG(zzem, 4);
                int zzd = zzem.zzd(16);
                zzem.zzn(3);
                if (zzd == 0) {
                    zzem.zzn(13);
                } else {
                    int zzd2 = zzem.zzd(13);
                    zzaoj zzaoj = this.zza;
                    if (zzaoj.zzg.get(zzd2) == null) {
                        zzaoj.zzg.put(zzd2, new zzaob(new zzaoi(zzaoj, zzd2)));
                        zzaoj.zzm = zzaoj.zzm + 1;
                    }
                }
            }
            this.zza.zzg.remove(0);
        }
    }

    public final void zzb(zzeu zzeu, zzady zzady, zzaon zzaon) {
    }
}
