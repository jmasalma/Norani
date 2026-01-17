package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzafi implements zzadv {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc = "#!AMR\n".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzd = "#!AMR-WB\n".getBytes(StandardCharsets.UTF_8);
    private final byte[] zze;
    private final zzafb zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzady zzn;
    private zzafb zzo;
    private zzafb zzp;
    private zzaeu zzq;
    private long zzr;
    private boolean zzs;

    static {
        String str = zzex.zza;
    }

    public zzafi() {
        throw null;
    }

    public zzafi(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzadr zzadr = new zzadr();
        this.zzf = zzadr;
        this.zzp = zzadr;
    }

    private static boolean zzg(zzadw zzadw, byte[] bArr) throws IOException {
        zzadw.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzadw.zzh(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzadw zzadw) throws IOException {
        byte[] bArr = zzc;
        if (zzg(zzadw, bArr)) {
            this.zzg = false;
            zzadw.zzk(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzg(zzadw, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzadw.zzk(bArr2.length);
        return true;
    }

    public final int zzb(zzadw zzadw, zzaer zzaer) throws IOException {
        zzdd.zzb(this.zzo);
        String str = zzex.zza;
        if (zzadw.zzf() != 0 || zzh(zzadw)) {
            if (!this.zzs) {
                this.zzs = true;
                boolean z = this.zzg;
                String str2 = "audio/amr-wb";
                String str3 = true != z ? "audio/amr" : str2;
                if (true != z) {
                    str2 = "audio/3gpp";
                }
                int i = true != z ? 8000 : 16000;
                int i2 = z ? zzb[8] : zza[7];
                zzafb zzafb = this.zzo;
                zzx zzx = new zzx();
                zzx.zzG(str3);
                zzx.zzah(str2);
                zzx.zzX(i2);
                zzx.zzD(1);
                zzx.zzai(i);
                zzafb.zzm(zzx.zzan());
            }
            int zza2 = zza(zzadw);
            if (this.zzq == null) {
                zzaet zzaet = new zzaet(-9223372036854775807L, 0);
                this.zzq = zzaet;
                this.zzn.zzP(zzaet);
            }
            return zza2 == -1 ? -1 : 0;
        }
        throw zzaz.zza("Could not find AMR header.", (Throwable) null);
    }

    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    public final void zze(zzady zzady) {
        this.zzn = zzady;
        zzafb zzw = zzady.zzw(0, 1);
        this.zzo = zzw;
        this.zzp = zzw;
        zzady.zzG();
    }

    public final void zzf(long j, long j2) {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j2;
        this.zzm = 0;
    }

    public final boolean zzi(zzadw zzadw) throws IOException {
        return zzh(zzadw);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ EOFException -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[Catch:{ EOFException -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"realTrackOutput"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(com.google.android.gms.internal.ads.zzadw r12) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = "Illegal AMR "
            java.lang.String r1 = "Invalid padding bits for frame header "
            int r2 = r11.zzj
            r3 = 0
            r4 = -1
            r5 = 1
            if (r2 == 0) goto L_0x000c
            goto L_0x0055
        L_0x000c:
            r12.zzj()     // Catch:{ EOFException -> 0x00ab }
            byte[] r2 = r11.zze     // Catch:{ EOFException -> 0x00ab }
            r12.zzh(r2, r3, r5)     // Catch:{ EOFException -> 0x00ab }
            byte r2 = r2[r3]     // Catch:{ EOFException -> 0x00ab }
            r6 = r2 & 131(0x83, float:1.84E-43)
            r7 = 0
            if (r6 > 0) goto L_0x009a
            int r1 = r2 >> 3
            boolean r2 = r11.zzg     // Catch:{ EOFException -> 0x00ab }
            r1 = r1 & 15
            if (r2 == 0) goto L_0x002c
            r6 = 10
            if (r1 < r6) goto L_0x0037
            r6 = 13
            if (r1 <= r6) goto L_0x002c
            goto L_0x0037
        L_0x002c:
            if (r2 != 0) goto L_0x007a
            r6 = 12
            if (r1 < r6) goto L_0x0037
            r6 = 14
            if (r1 > r6) goto L_0x0037
            goto L_0x007a
        L_0x0037:
            if (r2 == 0) goto L_0x003e
            int[] r0 = zzb     // Catch:{ EOFException -> 0x00ab }
            r0 = r0[r1]     // Catch:{ EOFException -> 0x00ab }
            goto L_0x0042
        L_0x003e:
            int[] r0 = zza     // Catch:{ EOFException -> 0x00ab }
            r0 = r0[r1]     // Catch:{ EOFException -> 0x00ab }
        L_0x0042:
            r2 = r0
            r11.zzi = r2     // Catch:{ EOFException -> 0x00ab }
            r11.zzj = r2
            int r0 = r11.zzk
            if (r0 != r4) goto L_0x004e
            r11.zzk = r2
            r0 = r2
        L_0x004e:
            if (r0 != r2) goto L_0x0055
            int r0 = r11.zzl
            int r0 = r0 + r5
            r11.zzl = r0
        L_0x0055:
            com.google.android.gms.internal.ads.zzafb r0 = r11.zzp
            int r12 = r0.zzf(r12, r2, r5)
            if (r12 != r4) goto L_0x005e
            return r4
        L_0x005e:
            int r0 = r11.zzj
            int r0 = r0 - r12
            r11.zzj = r0
            if (r0 <= 0) goto L_0x0066
            return r3
        L_0x0066:
            com.google.android.gms.internal.ads.zzafb r4 = r11.zzp
            long r5 = r11.zzh
            int r8 = r11.zzi
            r9 = 0
            r10 = 0
            r7 = 1
            r4.zzt(r5, r7, r8, r9, r10)
            long r0 = r11.zzh
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzh = r0
            return r3
        L_0x007a:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r5 == r2) goto L_0x0081
            r12 = r3
        L_0x0081:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x00ab }
            r2.<init>(r0)     // Catch:{ EOFException -> 0x00ab }
            r2.append(r12)     // Catch:{ EOFException -> 0x00ab }
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch:{ EOFException -> 0x00ab }
            r2.append(r1)     // Catch:{ EOFException -> 0x00ab }
            java.lang.String r12 = r2.toString()     // Catch:{ EOFException -> 0x00ab }
            com.google.android.gms.internal.ads.zzaz r12 = com.google.android.gms.internal.ads.zzaz.zza(r12, r7)     // Catch:{ EOFException -> 0x00ab }
            throw r12     // Catch:{ EOFException -> 0x00ab }
        L_0x009a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x00ab }
            r12.<init>(r1)     // Catch:{ EOFException -> 0x00ab }
            r12.append(r2)     // Catch:{ EOFException -> 0x00ab }
            java.lang.String r12 = r12.toString()     // Catch:{ EOFException -> 0x00ab }
            com.google.android.gms.internal.ads.zzaz r12 = com.google.android.gms.internal.ads.zzaz.zza(r12, r7)     // Catch:{ EOFException -> 0x00ab }
            throw r12     // Catch:{ EOFException -> 0x00ab }
        L_0x00ab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafi.zza(com.google.android.gms.internal.ads.zzadw):int");
    }
}
