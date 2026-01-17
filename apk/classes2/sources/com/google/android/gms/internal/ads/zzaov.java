package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaov implements zzadv {
    private zzady zza;
    private zzafb zzb;
    private int zzc = 0;
    private long zzd = -1;
    private zzaot zze;
    private int zzf = -1;
    private long zzg = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ec, code lost:
        if (r1 != 65534) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f3, code lost:
        if (r2 == 32) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r19, com.google.android.gms.internal.ads.zzaer r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.gms.internal.ads.zzafb r2 = r0.zzb
            com.google.android.gms.internal.ads.zzdd.zzb(r2)
            java.lang.String r2 = com.google.android.gms.internal.ads.zzex.zza
            int r2 = r0.zzc
            r3 = -1
            r4 = 4
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0159
            r7 = 2
            r8 = -1
            if (r2 == r5) goto L_0x0124
            r10 = 3
            if (r2 == r7) goto L_0x00a5
            if (r2 == r10) goto L_0x003f
            long r10 = r0.zzg
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r5 = r6
        L_0x0025:
            com.google.android.gms.internal.ads.zzdd.zzf(r5)
            long r4 = r0.zzg
            long r7 = r19.zzf()
            long r4 = r4 - r7
            com.google.android.gms.internal.ads.zzaot r2 = r0.zze
            r2.getClass()
            r7 = r2
            com.google.android.gms.internal.ads.zzaot r7 = (com.google.android.gms.internal.ads.zzaot) r7
            boolean r1 = r2.zzc(r1, r4)
            if (r1 == 0) goto L_0x003e
            return r3
        L_0x003e:
            return r6
        L_0x003f:
            android.util.Pair r2 = com.google.android.gms.internal.ads.zzaoy.zza(r19)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = r3.intValue()
            r0.zzf = r3
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r10 = r0.zzd
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0065
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0065
            r2 = r10
        L_0x0065:
            int r5 = r0.zzf
            long r10 = (long) r5
            long r10 = r10 + r2
            r0.zzg = r10
            long r1 = r19.zzd()
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0095
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0095
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Data exceeds input length: "
            r3.<init>(r5)
            r3.append(r10)
            java.lang.String r5 = ", "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "WavExtractor"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r3)
            r0.zzg = r1
            r10 = r1
        L_0x0095:
            com.google.android.gms.internal.ads.zzaot r1 = r0.zze
            r1.getClass()
            r2 = r1
            com.google.android.gms.internal.ads.zzaot r2 = (com.google.android.gms.internal.ads.zzaot) r2
            int r2 = r0.zzf
            r1.zza(r2, r10)
            r0.zzc = r4
            return r6
        L_0x00a5:
            com.google.android.gms.internal.ads.zzaow r15 = com.google.android.gms.internal.ads.zzaoy.zzb(r19)
            int r1 = r15.zza
            r2 = 17
            if (r1 != r2) goto L_0x00bb
            com.google.android.gms.internal.ads.zzaos r1 = new com.google.android.gms.internal.ads.zzaos
            com.google.android.gms.internal.ads.zzady r2 = r0.zza
            com.google.android.gms.internal.ads.zzafb r3 = r0.zzb
            r1.<init>(r2, r3, r15)
            r0.zze = r1
            goto L_0x010e
        L_0x00bb:
            r2 = 6
            if (r1 != r2) goto L_0x00cf
            com.google.android.gms.internal.ads.zzaou r1 = new com.google.android.gms.internal.ads.zzaou
            com.google.android.gms.internal.ads.zzady r13 = r0.zza
            com.google.android.gms.internal.ads.zzafb r14 = r0.zzb
            java.lang.String r16 = "audio/g711-alaw"
            r17 = -1
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zze = r1
            goto L_0x010e
        L_0x00cf:
            r2 = 7
            if (r1 != r2) goto L_0x00e3
            com.google.android.gms.internal.ads.zzaou r1 = new com.google.android.gms.internal.ads.zzaou
            com.google.android.gms.internal.ads.zzady r13 = r0.zza
            com.google.android.gms.internal.ads.zzafb r14 = r0.zzb
            java.lang.String r16 = "audio/g711-mlaw"
            r17 = -1
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zze = r1
            goto L_0x010e
        L_0x00e3:
            int r2 = r15.zze
            if (r1 == r5) goto L_0x00f6
            if (r1 == r10) goto L_0x00f1
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r1 == r3) goto L_0x00f6
        L_0x00ee:
            r17 = r6
            goto L_0x00fe
        L_0x00f1:
            r3 = 32
            if (r2 != r3) goto L_0x00ee
            goto L_0x00fc
        L_0x00f6:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r4 = com.google.android.gms.internal.ads.zzex.zzn(r2, r3)
        L_0x00fc:
            r17 = r4
        L_0x00fe:
            if (r17 == 0) goto L_0x0111
            com.google.android.gms.internal.ads.zzaou r1 = new com.google.android.gms.internal.ads.zzaou
            com.google.android.gms.internal.ads.zzady r13 = r0.zza
            com.google.android.gms.internal.ads.zzafb r14 = r0.zzb
            java.lang.String r16 = "audio/raw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zze = r1
        L_0x010e:
            r0.zzc = r10
            return r6
        L_0x0111:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported WAV format type: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zzc(r1)
            throw r1
        L_0x0124:
            int r2 = com.google.android.gms.internal.ads.zzaoy.zza
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            r3 = 8
            r2.<init>((int) r3)
            com.google.android.gms.internal.ads.zzaox r4 = com.google.android.gms.internal.ads.zzaox.zza(r1, r2)
            int r5 = r4.zza
            r10 = 1685272116(0x64733634, float:1.7945858E22)
            if (r5 == r10) goto L_0x013c
            r19.zzj()
            goto L_0x0154
        L_0x013c:
            r1.zzg(r3)
            r2.zzL(r6)
            byte[] r5 = r2.zzN()
            r1.zzh(r5, r6, r3)
            long r8 = r2.zzr()
            long r4 = r4.zzb
            int r2 = (int) r4
            int r2 = r2 + r3
            r1.zzk(r2)
        L_0x0154:
            r0.zzd = r8
            r0.zzc = r7
            return r6
        L_0x0159:
            long r7 = r19.zzf()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0165
            r2 = r5
            goto L_0x0166
        L_0x0165:
            r2 = r6
        L_0x0166:
            com.google.android.gms.internal.ads.zzdd.zzf(r2)
            int r2 = r0.zzf
            if (r2 == r3) goto L_0x0173
            r1.zzk(r2)
            r0.zzc = r4
            goto L_0x0188
        L_0x0173:
            boolean r2 = com.google.android.gms.internal.ads.zzaoy.zzc(r19)
            if (r2 == 0) goto L_0x0189
            long r2 = r19.zze()
            long r7 = r19.zzf()
            long r2 = r2 - r7
            int r2 = (int) r2
            r1.zzk(r2)
            r0.zzc = r5
        L_0x0188:
            return r6
        L_0x0189:
            java.lang.String r1 = "Unsupported or unrecognized wav file type."
            r2 = 0
            com.google.android.gms.internal.ads.zzaz r1 = com.google.android.gms.internal.ads.zzaz.zza(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaov.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zza = zzady;
        this.zzb = zzady.zzw(0, 1);
        zzady.zzG();
    }

    public final void zzf(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzaot zzaot = this.zze;
        if (zzaot != null) {
            zzaot.zzb(j2);
        }
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        return zzaoy.zzc(zzadw);
    }
}
