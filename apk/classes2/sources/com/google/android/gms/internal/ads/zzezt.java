package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzezt implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzezt(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzezt zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzezt(zzhha, zzhha2, zzhha3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.google.android.gms.internal.ads.zzezg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.google.android.gms.internal.ads.zzeyx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.android.gms.internal.ads.zzeyx} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: zza */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzezr zzb() {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzhha r0 = r8.zza
            java.lang.Object r0 = r0.zzb()
            android.content.Context r0 = (android.content.Context) r0
            com.google.android.gms.internal.ads.zzhha r1 = r8.zzb
            java.lang.Object r1 = r1.zzb()
            com.google.android.gms.internal.ads.zzfef r1 = (com.google.android.gms.internal.ads.zzfef) r1
            com.google.android.gms.internal.ads.zzhha r2 = r8.zzc
            java.lang.Object r2 = r2.zzb()
            com.google.android.gms.internal.ads.zzfex r2 = (com.google.android.gms.internal.ads.zzfex) r2
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzgA
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzbzs r3 = com.google.android.gms.ads.internal.zzv.zzp()
            com.google.android.gms.ads.internal.util.zzg r3 = r3.zzi()
            com.google.android.gms.internal.ads.zzbzm r3 = r3.zzg()
            goto L_0x0043
        L_0x0037:
            com.google.android.gms.internal.ads.zzbzs r3 = com.google.android.gms.ads.internal.zzv.zzp()
            com.google.android.gms.ads.internal.util.zzg r3 = r3.zzi()
            com.google.android.gms.internal.ads.zzbzm r3 = r3.zzh()
        L_0x0043:
            r4 = 0
            if (r3 == 0) goto L_0x004d
            boolean r3 = r3.zzh()
            if (r3 == 0) goto L_0x004d
            r4 = 1
        L_0x004d:
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzgQ
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r5.zzb(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 <= 0) goto L_0x00a5
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzgz
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r5.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0073
            if (r4 == 0) goto L_0x00a5
        L_0x0073:
            com.google.android.gms.internal.ads.zzeys r3 = new com.google.android.gms.internal.ads.zzeys
            r3.<init>()
            com.google.android.gms.internal.ads.zzfen r4 = com.google.android.gms.internal.ads.zzfen.AppOpen
            com.google.android.gms.internal.ads.zzeyv r5 = new com.google.android.gms.internal.ads.zzeyv
            r5.<init>(r3)
            com.google.android.gms.internal.ads.zzfew r0 = r2.zza(r4, r0, r1, r5)
            com.google.android.gms.internal.ads.zzeyx r7 = new com.google.android.gms.internal.ads.zzeyx
            com.google.android.gms.internal.ads.zzezh r2 = new com.google.android.gms.internal.ads.zzezh
            com.google.android.gms.internal.ads.zzezg r1 = new com.google.android.gms.internal.ads.zzezg
            r1.<init>()
            r2.<init>(r1)
            com.google.android.gms.internal.ads.zzfej r1 = r0.zza
            com.google.android.gms.internal.ads.zzezd r3 = new com.google.android.gms.internal.ads.zzezd
            com.google.android.gms.internal.ads.zzgdy r6 = com.google.android.gms.internal.ads.zzcaf.zza
            r3.<init>(r1, r6)
            com.google.android.gms.internal.ads.zzfff r4 = r0.zzb
            com.google.android.gms.internal.ads.zzfeq r0 = r1.zza()
            java.lang.String r5 = r0.zzf
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x00aa
        L_0x00a5:
            com.google.android.gms.internal.ads.zzezg r7 = new com.google.android.gms.internal.ads.zzezg
            r7.<init>()
        L_0x00aa:
            com.google.android.gms.internal.ads.zzezr r7 = (com.google.android.gms.internal.ads.zzezr) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzezt.zzb():com.google.android.gms.internal.ads.zzezr");
    }
}
