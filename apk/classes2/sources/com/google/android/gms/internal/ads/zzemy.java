package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemy implements zzeuc {
    private final zzgdy zza;
    private final zzdpz zzb;
    private final zzdun zzc;
    private final zzena zzd;

    public zzemy(zzgdy zzgdy, zzdpz zzdpz, zzdun zzdun, zzena zzena) {
        this.zza = zzgdy;
        this.zzb = zzdpz;
        this.zzc = zzdun;
        this.zzd = zzena;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:4|5|6|(3:9|10|(1:12))|13|14|(1:16)|17|18|25|23|1) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:5|6|(3:9|10|(1:12))|13|14|(1:16)|17|18|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0076 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d A[Catch:{ zzfdd -> 0x0076 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.google.android.gms.internal.ads.zzemz zzc(com.google.android.gms.internal.ads.zzemy r8) {
        /*
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzbD
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x007a
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzdpz r3 = r8.zzb     // Catch:{ zzfdd -> 0x001f }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ zzfdd -> 0x001f }
            r4.<init>()     // Catch:{ zzfdd -> 0x001f }
            com.google.android.gms.internal.ads.zzfdu r3 = r3.zzc(r2, r4)     // Catch:{ zzfdd -> 0x001f }
            r3.zzC()     // Catch:{ zzfdd -> 0x001f }
            com.google.android.gms.internal.ads.zzdun r4 = r8.zzc     // Catch:{ zzfdd -> 0x001f }
            boolean r4 = r4.zzt()     // Catch:{ zzfdd -> 0x001f }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ zzfdd -> 0x001f }
            r5.<init>()     // Catch:{ zzfdd -> 0x001f }
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzmb     // Catch:{ zzfdd -> 0x001f }
            com.google.android.gms.internal.ads.zzbdc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ zzfdd -> 0x001f }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ zzfdd -> 0x001f }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ zzfdd -> 0x001f }
            boolean r6 = r6.booleanValue()     // Catch:{ zzfdd -> 0x001f }
            if (r6 == 0) goto L_0x0058
            if (r4 == 0) goto L_0x0067
        L_0x0058:
            com.google.android.gms.internal.ads.zzbse r4 = r3.zzf()     // Catch:{ zzfdd -> 0x0067 }
            if (r4 == 0) goto L_0x0067
            java.lang.String r6 = "sdk_version"
            java.lang.String r4 = r4.toString()     // Catch:{ zzfdd -> 0x0067 }
            r5.putString(r6, r4)     // Catch:{ zzfdd -> 0x0067 }
        L_0x0067:
            com.google.android.gms.internal.ads.zzbse r3 = r3.zze()     // Catch:{ zzfdd -> 0x0076 }
            if (r3 == 0) goto L_0x0076
            java.lang.String r4 = "adapter_version"
            java.lang.String r3 = r3.toString()     // Catch:{ zzfdd -> 0x0076 }
            r5.putString(r4, r3)     // Catch:{ zzfdd -> 0x0076 }
        L_0x0076:
            r1.putBundle(r2, r5)     // Catch:{ zzfdd -> 0x001f }
            goto L_0x001f
        L_0x007a:
            com.google.android.gms.internal.ads.zzemz r0 = new com.google.android.gms.internal.ads.zzemz
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzmb
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0096
            com.google.android.gms.internal.ads.zzena r8 = r8.zzd
            r8.zzb(r0)
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzemy.zzc(com.google.android.gms.internal.ads.zzemy):com.google.android.gms.internal.ads.zzemz");
    }

    public final int zza() {
        return 1;
    }

    public final ListenableFuture zzb() {
        zzbcv zzbcv = zzbde.zzmb;
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzena zzena = this.zzd;
            if (zzena.zza() != null) {
                zzemz zza2 = zzena.zza();
                zza2.getClass();
                zzemz zzemz = zza2;
                return zzgdn.zzh(zza2);
            }
        }
        if (zzfwg.zzd((String) zzbd.zzc().zzb(zzbde.zzbD)) || (!((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue() && (this.zzd.zzd() || !this.zzc.zzt()))) {
            return zzgdn.zzh(new zzemz(new Bundle()));
        }
        this.zzd.zzc(true);
        return this.zza.zzb(new zzemx(this));
    }
}
