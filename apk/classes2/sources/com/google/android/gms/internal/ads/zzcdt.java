package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzf;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcdt extends zzcdn implements zzhj {
    private static final AtomicInteger zzd = new AtomicInteger(0);
    private String zze;
    private final zzcca zzf;
    private boolean zzg;
    private final zzcds zzh = new zzcds();
    private final zzccx zzi = new zzccx();
    private ByteBuffer zzj;
    private boolean zzk;
    private final Object zzl = new Object();
    private final String zzm;
    private final int zzn;
    private boolean zzo;

    public zzcdt(zzccb zzccb, zzcca zzcca) {
        super(zzccb);
        this.zzf = zzcca;
        this.zzm = (String) zzfvn.zzd(zzccb != null ? zzccb.zzr() : null).zzb("");
        this.zzn = zzccb != null ? zzccb.zzf() : 0;
        zzd.incrementAndGet();
    }

    public static int zzi() {
        return zzd.get();
    }

    protected static final String zzv(String str) {
        return "cache:".concat(String.valueOf(zzf.zzk(str)));
    }

    private final void zzx() {
        int zza = (int) this.zzh.zza();
        int zza2 = (int) this.zzi.zza(this.zzj);
        int position = this.zzj.position();
        int round = Math.round(((float) zza2) * (((float) position) / ((float) zza)));
        int zzs = zzcbs.zzs();
        int zzu = zzcbs.zzu();
        String str = this.zze;
        zzn(str, zzv(str), position, zza, (long) round, (long) zza2, round > 0, zzs, zzu);
    }

    public final void release() {
        zzd.decrementAndGet();
    }

    public final void zza(zzgj zzgj, zzgo zzgo, boolean z, int i) {
    }

    public final void zzb(zzgj zzgj, zzgo zzgo, boolean z) {
    }

    public final void zzc(zzgj zzgj, zzgo zzgo, boolean z) {
    }

    public final void zzd(zzgj zzgj, zzgo zzgo, boolean z) {
        if (zzgj instanceof zzgw) {
            this.zzh.zzb((zzgw) zzgj);
        }
    }

    public final void zzf() {
        this.zzg = true;
    }

    public final String zzk() {
        return this.zze;
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzl) {
            ByteBuffer byteBuffer = this.zzj;
            if (byteBuffer != null && !this.zzk) {
                byteBuffer.flip();
                this.zzk = true;
            }
            this.zzg = true;
        }
        return this.zzj;
    }

    public final boolean zzm() {
        return this.zzo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: com.google.android.gms.internal.ads.zzgw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.android.gms.internal.ads.zzgw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.android.gms.internal.ads.zzccv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: com.google.android.gms.internal.ads.zzgw} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d3, code lost:
        if (r1.zzj.remaining() > 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d5, code lost:
        zzx();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dd, code lost:
        if (r1.zzg != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00df, code lost:
        r5 = r0.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e7, code lost:
        if ((r5 - r16) < r11) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e9, code lost:
        zzx();
        r16 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f5, code lost:
        if ((r5 - r8) > (1000 * r13)) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011a, code lost:
        throw new java.io.IOException("Timeout exceeded. Limit: " + r13 + " sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011d, code lost:
        r3 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0140, code lost:
        throw new java.io.IOException("Precache abort at " + r1.zzj.limit() + " bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0141, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzt(java.lang.String r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r1.zze = r2
            java.lang.String r3 = "error"
            java.lang.String r4 = zzv(r22)
            r5 = 0
            com.google.android.gms.internal.ads.zzgr r0 = new com.google.android.gms.internal.ads.zzgr     // Catch:{ Exception -> 0x014a }
            r0.<init>()     // Catch:{ Exception -> 0x014a }
            java.lang.String r6 = r1.zzb     // Catch:{ Exception -> 0x014a }
            r0.zzf(r6)     // Catch:{ Exception -> 0x014a }
            com.google.android.gms.internal.ads.zzcca r6 = r1.zzf     // Catch:{ Exception -> 0x014a }
            int r7 = r6.zzd     // Catch:{ Exception -> 0x014a }
            r0.zzc(r7)     // Catch:{ Exception -> 0x014a }
            int r7 = r6.zze     // Catch:{ Exception -> 0x014a }
            r0.zzd(r7)     // Catch:{ Exception -> 0x014a }
            r7 = 1
            r0.zzb(r7)     // Catch:{ Exception -> 0x014a }
            r0.zze(r1)     // Catch:{ Exception -> 0x014a }
            com.google.android.gms.internal.ads.zzgw r10 = r0.zza()     // Catch:{ Exception -> 0x014a }
            boolean r0 = r6.zzi     // Catch:{ Exception -> 0x014a }
            if (r0 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.zzccv r0 = new com.google.android.gms.internal.ads.zzccv     // Catch:{ Exception -> 0x014a }
            android.content.Context r9 = r1.zza     // Catch:{ Exception -> 0x014a }
            java.lang.String r11 = r1.zzm     // Catch:{ Exception -> 0x014a }
            int r12 = r1.zzn     // Catch:{ Exception -> 0x014a }
            r13 = 0
            r14 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x014a }
            r10 = r0
        L_0x0041:
            android.net.Uri r12 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x014a }
            com.google.android.gms.internal.ads.zzgo r0 = new com.google.android.gms.internal.ads.zzgo     // Catch:{ Exception -> 0x014a }
            r15 = -1
            r17 = 0
            r13 = 0
            r11 = r0
            r11.<init>(r12, r13, r15, r17)     // Catch:{ Exception -> 0x014a }
            r10.zzb(r0)     // Catch:{ Exception -> 0x014a }
            java.lang.ref.WeakReference r0 = r1.zzc     // Catch:{ Exception -> 0x014a }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014a }
            com.google.android.gms.internal.ads.zzccb r0 = (com.google.android.gms.internal.ads.zzccb) r0     // Catch:{ Exception -> 0x014a }
            if (r0 == 0) goto L_0x0061
            r0.zzt(r4, r1)     // Catch:{ Exception -> 0x014a }
        L_0x0061:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ Exception -> 0x014a }
            long r8 = r0.currentTimeMillis()     // Catch:{ Exception -> 0x014a }
            com.google.android.gms.internal.ads.zzbcv r11 = com.google.android.gms.internal.ads.zzbde.zzQ     // Catch:{ Exception -> 0x014a }
            com.google.android.gms.internal.ads.zzbdc r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ Exception -> 0x014a }
            java.lang.Object r11 = r12.zzb(r11)     // Catch:{ Exception -> 0x014a }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ Exception -> 0x014a }
            long r11 = r11.longValue()     // Catch:{ Exception -> 0x014a }
            com.google.android.gms.internal.ads.zzbcv r13 = com.google.android.gms.internal.ads.zzbde.zzP     // Catch:{ Exception -> 0x014a }
            com.google.android.gms.internal.ads.zzbdc r14 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ Exception -> 0x014a }
            java.lang.Object r13 = r14.zzb(r13)     // Catch:{ Exception -> 0x014a }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ Exception -> 0x014a }
            long r13 = r13.longValue()     // Catch:{ Exception -> 0x014a }
            int r6 = r6.zzc     // Catch:{ Exception -> 0x014a }
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)     // Catch:{ Exception -> 0x014a }
            r1.zzj = r6     // Catch:{ Exception -> 0x014a }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r6]     // Catch:{ Exception -> 0x014a }
            r16 = r8
        L_0x0097:
            java.nio.ByteBuffer r7 = r1.zzj     // Catch:{ Exception -> 0x014a }
            int r7 = r7.remaining()     // Catch:{ Exception -> 0x014a }
            int r7 = java.lang.Math.min(r7, r6)     // Catch:{ Exception -> 0x014a }
            int r7 = r10.zza(r15, r5, r7)     // Catch:{ Exception -> 0x014a }
            r6 = -1
            if (r7 != r6) goto L_0x00ba
            r6 = 1
            r1.zzo = r6     // Catch:{ Exception -> 0x014a }
            com.google.android.gms.internal.ads.zzccx r0 = r1.zzi     // Catch:{ Exception -> 0x014a }
            java.nio.ByteBuffer r6 = r1.zzj     // Catch:{ Exception -> 0x014a }
            long r6 = r0.zza(r6)     // Catch:{ Exception -> 0x014a }
            int r0 = (int) r6     // Catch:{ Exception -> 0x014a }
            long r6 = (long) r0     // Catch:{ Exception -> 0x014a }
            r1.zzj(r2, r4, r6)     // Catch:{ Exception -> 0x014a }
        L_0x00b8:
            r3 = 1
            goto L_0x00d9
        L_0x00ba:
            java.lang.Object r6 = r1.zzl     // Catch:{ Exception -> 0x014a }
            monitor-enter(r6)     // Catch:{ Exception -> 0x014a }
            boolean r5 = r1.zzg     // Catch:{ all -> 0x0145 }
            if (r5 != 0) goto L_0x00ca
            java.nio.ByteBuffer r5 = r1.zzj     // Catch:{ all -> 0x0145 }
            r18 = r3
            r3 = 0
            r5.put(r15, r3, r7)     // Catch:{ all -> 0x0143 }
            goto L_0x00cc
        L_0x00ca:
            r18 = r3
        L_0x00cc:
            monitor-exit(r6)     // Catch:{ all -> 0x0143 }
            java.nio.ByteBuffer r3 = r1.zzj     // Catch:{ Exception -> 0x0141 }
            int r3 = r3.remaining()     // Catch:{ Exception -> 0x0141 }
            if (r3 > 0) goto L_0x00da
            r21.zzx()     // Catch:{ Exception -> 0x0141 }
            goto L_0x00b8
        L_0x00d9:
            return r3
        L_0x00da:
            r3 = 1
            boolean r5 = r1.zzg     // Catch:{ Exception -> 0x0141 }
            if (r5 != 0) goto L_0x011d
            long r5 = r0.currentTimeMillis()     // Catch:{ Exception -> 0x0141 }
            long r19 = r5 - r16
            int r7 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x00ee
            r21.zzx()     // Catch:{ Exception -> 0x0141 }
            r16 = r5
        L_0x00ee:
            long r5 = r5 - r8
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r13
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 > 0) goto L_0x00fd
            r3 = r18
            r5 = 0
            r6 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0097
        L_0x00fd:
            java.lang.String r3 = "downloadTimeout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011b }
            r0.<init>()     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = "Timeout exceeded. Limit: "
            r0.append(r5)     // Catch:{ Exception -> 0x011b }
            r0.append(r13)     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = " sec"
            r0.append(r5)     // Catch:{ Exception -> 0x011b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011b }
            java.io.IOException r5 = new java.io.IOException     // Catch:{ Exception -> 0x011b }
            r5.<init>(r0)     // Catch:{ Exception -> 0x011b }
            throw r5     // Catch:{ Exception -> 0x011b }
        L_0x011b:
            r0 = move-exception
            goto L_0x014f
        L_0x011d:
            java.lang.String r3 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x011b }
            java.nio.ByteBuffer r5 = r1.zzj     // Catch:{ Exception -> 0x011b }
            int r5 = r5.limit()     // Catch:{ Exception -> 0x011b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011b }
            r6.<init>()     // Catch:{ Exception -> 0x011b }
            java.lang.String r7 = "Precache abort at "
            r6.append(r7)     // Catch:{ Exception -> 0x011b }
            r6.append(r5)     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = " bytes"
            r6.append(r5)     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x011b }
            r0.<init>(r5)     // Catch:{ Exception -> 0x011b }
            throw r0     // Catch:{ Exception -> 0x011b }
        L_0x0141:
            r0 = move-exception
            goto L_0x014d
        L_0x0143:
            r0 = move-exception
            goto L_0x0148
        L_0x0145:
            r0 = move-exception
            r18 = r3
        L_0x0148:
            monitor-exit(r6)     // Catch:{ all -> 0x0143 }
            throw r0     // Catch:{ Exception -> 0x0141 }
        L_0x014a:
            r0 = move-exception
            r18 = r3
        L_0x014d:
            r3 = r18
        L_0x014f:
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = ":"
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to preload url "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r6 = " Exception: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            int r6 = com.google.android.gms.ads.internal.util.zze.zza
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r5)
            r1.zzg(r2, r4, r3, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdt.zzt(java.lang.String):boolean");
    }
}
