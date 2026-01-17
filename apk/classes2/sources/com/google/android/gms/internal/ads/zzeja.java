package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeja implements zzedm {
    private final Context zza;
    private final zzcpx zzb;
    private final zzbdz zzc;
    private final zzgdy zzd;
    private final zzfha zze;

    public zzeja(Context context, zzcpx zzcpx, zzfha zzfha, zzgdy zzgdy, zzbdz zzbdz) {
        this.zza = context;
        this.zzb = zzcpx;
        this.zze = zzfha;
        this.zzd = zzgdy;
        this.zzc = zzbdz;
    }

    public final ListenableFuture zza(zzfcn zzfcn, zzfca zzfca) {
        zzeiy zzeiy = new zzeiy(this, new View(this.zza), (zzcfg) null, new zzeiw(), (zzfcb) zzfca.zzu.get(0));
        zzcot zza2 = this.zzb.zza(new zzcrq(zzfcn, zzfca, (String) null), zzeiy);
        zzeiz zzm = zza2.zzm();
        zzfcf zzfcf = zzfca.zzs;
        zzbdu zzbdu = new zzbdu(zzm, zzfcf.zzb, zzfcf.zza);
        zzfgu zzfgu = zzfgu.CUSTOM_RENDER_SYN;
        zzfha zzfha = this.zze;
        Objects.requireNonNull(zzfha);
        return zzfgk.zzd(new zzeix(this, zzbdu), this.zzd, zzfgu, zzfha).zzb(zzfgu.CUSTOM_RENDER_ACK).zzd(zzgdn.zzh(zza2.zza())).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzs;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfcn r1, com.google.android.gms.internal.ads.zzfca r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbdz r1 = r0.zzc
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzfcf r1 = r2.zzs
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeja.zzb(com.google.android.gms.internal.ads.zzfcn, com.google.android.gms.internal.ads.zzfca):boolean");
    }
}
