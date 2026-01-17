package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaod {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzafb[] zzc;
    private final zzfz zzd;

    public zzaod(List list, String str) {
        this.zza = list;
        this.zzc = new zzafb[list.size()];
        this.zzd = new zzfz(new zzaoc(this));
    }

    public final void zzb() {
        this.zzd.zzd();
    }

    public final void zzc(long j, zzen zzen) {
        this.zzd.zzb(j, zzen);
    }

    public final void zzd(zzady zzady, zzaon zzaon) {
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
                String str2 = zzz.zza;
                if (str2 == null) {
                    str2 = zzaon.zzb();
                }
                zzx zzx = new zzx();
                zzx.zzS(str2);
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

    public final void zze() {
        this.zzd.zzd();
    }

    public final void zzf(int i) {
        this.zzd.zze(i);
    }
}
