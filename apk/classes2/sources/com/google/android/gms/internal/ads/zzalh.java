package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzalh implements zzakt {
    private final zzen zza = new zzen();
    private final zzen zzb = new zzen();
    private final zzalg zzc = new zzalg();
    private Inflater zzd;

    public final void zza(byte[] bArr, int i, int i2, zzaks zzaks, zzdn zzdn) {
        zzen zzen = this.zza;
        zzen.zzJ(bArr, i2 + i);
        zzen.zzL(i);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzen zzen2 = this.zzb;
        if (zzex.zzO(zzen, zzen2, this.zzd)) {
            zzen.zzJ(zzen2.zzN(), zzen2.zzd());
        }
        zzalg zzalg = this.zzc;
        zzalg.zze();
        ArrayList arrayList = new ArrayList();
        while (zzen.zza() >= 3) {
            int zzd2 = zzen.zzd();
            int zzm = zzen.zzm();
            int zzq = zzen.zzq();
            int zzc2 = zzen.zzc() + zzq;
            zzcu zzcu = null;
            if (zzc2 > zzd2) {
                zzen.zzL(zzd2);
            } else {
                if (zzm != 128) {
                    switch (zzm) {
                        case 20:
                            zzalg.zzd(zzalg, zzen, zzq);
                            break;
                        case zzbcj.zzt.zzm /*21*/:
                            zzalg.zzb(zzalg, zzen, zzq);
                            break;
                        case 22:
                            zzalg.zzc(zzalg, zzen, zzq);
                            break;
                    }
                } else {
                    zzcu zza2 = zzalg.zza();
                    zzalg.zze();
                    zzcu = zza2;
                }
                zzen.zzL(zzc2);
            }
            if (zzcu != null) {
                arrayList.add(zzcu);
            }
        }
        zzdn.zza(new zzakl(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
