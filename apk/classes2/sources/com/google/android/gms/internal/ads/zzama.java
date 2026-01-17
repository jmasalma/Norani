package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzama implements zzakt {
    private final zzen zza = new zzen();
    private final zzen zzb = new zzen();
    private final zzalz zzc;
    private Inflater zzd;

    public zzama(List list) {
        zzalz zzalz = new zzalz();
        this.zzc = zzalz;
        zzalz.zzb(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

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
        zzalz zzalz = this.zzc;
        zzalz.zzd();
        int zza2 = zzen.zza();
        zzcu zzcu = null;
        if (zza2 >= 2 && zzen.zzq() == zza2) {
            zzalz.zzc(zzen);
            zzcu = zzalz.zza(zzen);
        }
        zzdn.zza(new zzakl(zzcu != null ? zzfyq.zzo(zzcu) : zzfyq.zzn(), -9223372036854775807L, 5000000));
    }
}
