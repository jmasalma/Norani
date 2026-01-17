package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzejf implements zzedm {
    private final zzbdz zza;
    private final zzgdy zzb;
    private final zzfha zzc;
    /* access modifiers changed from: private */
    public final zzejo zzd;

    public zzejf(zzfha zzfha, zzgdy zzgdy, zzbdz zzbdz, zzejo zzejo) {
        this.zzc = zzfha;
        this.zzb = zzgdy;
        this.zza = zzbdz;
        this.zzd = zzejo;
    }

    public final ListenableFuture zza(zzfcn zzfcn, zzfca zzfca) {
        zzcak zzcak = new zzcak();
        zzejk zzejk = new zzejk();
        zzejk.zzd(new zzeje(this, zzcak, zzfcn, zzfca, zzejk));
        zzfcf zzfcf = zzfca.zzs;
        zzbdu zzbdu = new zzbdu(zzejk, zzfcf.zzb, zzfcf.zza);
        zzfgu zzfgu = zzfgu.CUSTOM_RENDER_SYN;
        zzfha zzfha = this.zzc;
        Objects.requireNonNull(zzfha);
        return zzfgk.zzd(new zzejd(this, zzbdu), this.zzb, zzfgu, zzfha).zzb(zzfgu.CUSTOM_RENDER_ACK).zzd(zzcak).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzs;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfcn r1, com.google.android.gms.internal.ads.zzfca r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbdz r1 = r0.zza
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejf.zzb(com.google.android.gms.internal.ads.zzfcn, com.google.android.gms.internal.ads.zzfca):boolean");
    }
}
