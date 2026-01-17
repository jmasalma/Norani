package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaor {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzafb[] zzc;
    private final zzfz zzd;

    public zzaor(List list, String str) {
        this.zza = list;
        this.zzc = new zzafb[list.size()];
        zzfz zzfz = new zzfz(new zzaoq(this));
        this.zzd = zzfz;
        zzfz.zze(3);
    }

    public final void zzb(long j, zzen zzen) {
        if (zzen.zza() >= 9) {
            int zzg = zzen.zzg();
            int zzg2 = zzen.zzg();
            int zzm = zzen.zzm();
            if (zzg == 434 && zzg2 == 1195456820 && zzm == 3) {
                this.zzd.zzb(j, zzen);
            }
        }
    }

    public final void zzc(zzady zzady, zzaon zzaon) {
        int i = 0;
        while (true) {
            zzafb[] zzafbArr = this.zzc;
            if (i < zzafbArr.length) {
                zzaon.zzc();
                zzafb zzw = zzady.zzw(zzaon.zza(), 3);
                zzz zzz = (zzz) this.zza.get(i);
                String str = zzz.zzo;
                boolean z = true;
                if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                    z = false;
                }
                zzdd.zze(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
                zzx zzx = new zzx();
                zzx.zzS(zzaon.zzb());
                zzx.zzG(this.zzb);
                zzx.zzah(str);
                zzx.zzaj(zzz.zze);
                zzx.zzW(zzz.zzd);
                zzx.zzB(zzz.zzL);
                zzx.zzT(zzz.zzr);
                zzw.zzm(zzx.zzan());
                zzafbArr[i] = zzw;
                i++;
            } else {
                return;
            }
        }
    }
}
