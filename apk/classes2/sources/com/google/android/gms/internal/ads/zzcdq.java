package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcdq extends zzcdn {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcdq(zzccb zzccb) {
        super(zzccb);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i = zze.zza;
            zzo.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfqt.zza(zzfqs.zza(), cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String valueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i2 = zze.zza;
            zzo.zzj("Could not create preload cache directory at ".concat(valueOf));
            this.zzg = null;
        } else if (!this.zzg.setReadable(true, false) || !this.zzg.setExecutable(true, false)) {
            String valueOf2 = String.valueOf(this.zzg.getAbsolutePath());
            int i3 = zze.zza;
            zzo.zzj("Could not set cache file permissions at ".concat(valueOf2));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(zzfqt.zza(zzfqs.zza(), this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02ec, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ed, code lost:
        r28 = r14;
        r24 = r15;
        r15 = "downloadTimeout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r11 = "Timeout exceeded. Limit: " + java.lang.Long.toString(r10) + " sec";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0314, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0315, code lost:
        r28 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0319, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x031c, code lost:
        r28 = r14;
        r24 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0322, code lost:
        r28 = r14;
        r24 = r15;
        r15 = "sizeExceeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r11 = "File too big for full file cache. Size: " + java.lang.Integer.toString(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0346, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0347, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x034a, code lost:
        r2 = r11;
        r11 = r19;
        r1 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0351, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0354, code lost:
        r11 = r19;
        r1 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x035a, code lost:
        r28 = r14;
        r24 = r15;
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0367, code lost:
        if (com.google.android.gms.ads.internal.util.zze.zzm(3) == false) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0369, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zze("Preloaded " + r14.format((long) r3) + " bytes from " + r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x038a, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0393, code lost:
        if (r0.isFile() == false) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0395, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r0.createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        zzh(r9, r12.getAbsolutePath(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03a9, code lost:
        r1 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        zze.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03ae, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03b0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03b4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03b6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03b7, code lost:
        r1 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03ba, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03be, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03c1, code lost:
        r19 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03c3, code lost:
        r1 = r14;
        r24 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03c6, code lost:
        r11 = r19;
        r15 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03ca, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03cc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03cf, code lost:
        r1 = r14;
        r15 = r15;
        r2 = null;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03d8, code lost:
        if ((r0 instanceof java.lang.RuntimeException) != false) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03da, code lost:
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03e8, code lost:
        if (r8.zzh != false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ea, code lost:
        r3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Preload aborted for URL \"" + r9 + "\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0403, code lost:
        r4 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzk("Preload failed for URL \"" + r9 + "\"", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0427, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not delete partial cache file at ".concat(java.lang.String.valueOf(r12.getAbsolutePath())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0438, code lost:
        zzg(r9, r12.getAbsolutePath(), r15, r2);
        zze.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0113, code lost:
        r15 = "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r1 = com.google.android.gms.internal.ads.zzfrr.zza().zzn(new com.google.android.gms.internal.ads.zzcdp(r9), 265, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
        if ((r1 instanceof java.net.HttpURLConnection) == false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0129, code lost:
        r2 = r1;
        r2 = r1.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        if (r2 >= 400) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0135, code lost:
        r15 = "badUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016a, code lost:
        throw new java.io.IOException("HTTP status code " + r2 + " at " + r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016e, code lost:
        r2 = "HTTP request failed. Code: " + java.lang.Integer.toString(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0170, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0173, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0174, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r7 = r1.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017b, code lost:
        if (r7 >= 0) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache aborted, missing content-length header at " + r9);
        zzg(r9, r12.getAbsolutePath(), "contentLengthMissing", (java.lang.String) null);
        r3.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a0, code lost:
        r6 = zzf;
        r2 = r6.format((long) r7);
        r5 = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzt)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b7, code lost:
        if (r7 <= r5) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b9, code lost:
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Content length " + r2 + " exceeds limit at " + r9);
        zzg(r9, r12.getAbsolutePath(), "sizeExceeded", "File too big for full file cache. Size: " + r2);
        r3.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f4, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f5, code lost:
        r3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Caching " + r2 + " bytes from " + r9);
        r4 = java.nio.channels.Channels.newChannel(r1.getInputStream());
        r3 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r2 = r3.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.zzv.zzD();
        r17 = r16.currentTimeMillis();
        r13 = new com.google.android.gms.ads.internal.util.zzbx(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzQ)).longValue());
        r10 = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzP)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0257, code lost:
        r19 = r3;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r20 = r4.read(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x025e, code lost:
        if (r20 < 0) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0260, code lost:
        r3 = r3 + r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0262, code lost:
        if (r3 > r5) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r1.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x026b, code lost:
        if (r2.write(r1) > 0) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x026d, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x027c, code lost:
        if ((r16.currentTimeMillis() - r17) > (1000 * r10)) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x027e, code lost:
        r20 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0282, code lost:
        if (r8.zzh != false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0288, code lost:
        if (r13.zzb() == false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x028a, code lost:
        r21 = r12.getAbsolutePath();
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0294, code lost:
        r24 = r15;
        r15 = com.google.android.gms.ads.internal.util.client.zzf.zza;
        r1 = r1;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r4 = r21;
        r21 = r5;
        r28 = r14;
        r14 = r6;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r1 = new com.google.android.gms.internal.ads.zzcdh(r30, r31, r4, r26, r7, false);
        r15.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b9, code lost:
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r29 = r7;
        r22 = r13;
        r28 = r14;
        r24 = r15;
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ca, code lost:
        r6 = r14;
        r1 = r20;
        r5 = r21;
        r13 = r22;
        r15 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r14 = r28;
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02df, code lost:
        r28 = r14;
        r24 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x03a0 */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b4 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r24 r28 
      PHI: (r24v6 java.lang.String) = (r24v3 java.lang.String), (r24v3 java.lang.String), (r24v3 java.lang.String), (r24v3 java.lang.String), (r24v3 java.lang.String), (r24v13 java.lang.String) binds: [B:123:0x035f, B:132:0x03a0, B:133:?, B:130:0x039d, B:131:?, B:95:0x02b2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r28v3 java.lang.String) = (r28v0 java.lang.String), (r28v0 java.lang.String), (r28v0 java.lang.String), (r28v0 java.lang.String), (r28v0 java.lang.String), (r28v12 java.lang.String) binds: [B:123:0x035f, B:132:0x03a0, B:133:?, B:130:0x039d, B:131:?, B:95:0x02b2] A[DONT_GENERATE, DONT_INLINE], Splitter:B:95:0x02b2] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0403  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzt(java.lang.String r31) {
        /*
            r30 = this;
            r8 = r30
            r9 = r31
            java.io.File r0 = r8.zzg
            r10 = 0
            r11 = 0
            if (r0 == 0) goto L_0x0449
        L_0x000a:
            java.io.File r0 = r8.zzg
            if (r0 != 0) goto L_0x0010
            r3 = r10
            goto L_0x002c
        L_0x0010:
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = r10
            r3 = r2
        L_0x0017:
            if (r2 >= r1) goto L_0x002c
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ".done"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L_0x0029
            int r3 = r3 + 1
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x002c:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzs
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 <= r0) goto L_0x0092
            java.io.File r0 = r8.zzg
            if (r0 != 0) goto L_0x0043
            goto L_0x0085
        L_0x0043:
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = r10
            r5 = r11
        L_0x004f:
            if (r4 >= r1) goto L_0x006c
            r6 = r0[r4]
            java.lang.String r7 = r6.getName()
            java.lang.String r12 = ".done"
            boolean r7 = r7.endsWith(r12)
            if (r7 != 0) goto L_0x0069
            long r12 = r6.lastModified()
            int r7 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0069
            r5 = r6
            r2 = r12
        L_0x0069:
            int r4 = r4 + 1
            goto L_0x004f
        L_0x006c:
            if (r5 == 0) goto L_0x0082
            boolean r0 = r5.delete()
            java.io.File r1 = r8.zza(r5)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L_0x0083
            boolean r1 = r1.delete()
            r0 = r0 & r1
            goto L_0x0083
        L_0x0082:
            r0 = r10
        L_0x0083:
            if (r0 != 0) goto L_0x000a
        L_0x0085:
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "Unable to expire stream cache"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)
            java.lang.String r0 = "expireFailed"
            r8.zzg(r9, r11, r0, r11)
            return r10
        L_0x0092:
            java.lang.String r0 = com.google.android.gms.ads.internal.util.client.zzf.zzk(r31)
            java.io.File r12 = new java.io.File
            com.google.android.gms.internal.ads.zzfqu r1 = com.google.android.gms.internal.ads.zzfqs.zza()
            java.io.File r2 = r8.zzg
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfqt.zza(r1, r2, r0)
            r12.<init>(r0)
            java.io.File r0 = r8.zza(r12)
            boolean r1 = r12.isFile()
            r13 = 1
            if (r1 == 0) goto L_0x00d3
            boolean r1 = r0.isFile()
            if (r1 != 0) goto L_0x00b7
            goto L_0x00d3
        L_0x00b7:
            long r0 = r12.length()
            int r0 = (int) r0
            java.lang.String r1 = java.lang.String.valueOf(r31)
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Stream cache hit at "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.ads.internal.util.client.zzo.zze(r1)
            java.lang.String r1 = r12.getAbsolutePath()
            r8.zzh(r9, r1, r0)
            return r13
        L_0x00d3:
            java.io.File r1 = r8.zzg
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r31)
            java.util.Set r3 = zze
            java.lang.String r14 = r1.concat(r2)
            monitor-enter(r3)
            boolean r1 = r3.contains(r14)     // Catch:{ all -> 0x0446 }
            if (r1 == 0) goto L_0x010f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0446 }
            r0.<init>()     // Catch:{ all -> 0x0446 }
            java.lang.String r1 = "Stream cache already in progress at "
            r0.append(r1)     // Catch:{ all -> 0x0446 }
            r0.append(r9)     // Catch:{ all -> 0x0446 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0446 }
            int r1 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x0446 }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ all -> 0x0446 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x0446 }
            java.lang.String r1 = "inProgress"
            r8.zzg(r9, r0, r1, r11)     // Catch:{ all -> 0x0446 }
            monitor-exit(r3)     // Catch:{ all -> 0x0446 }
            return r10
        L_0x010f:
            r3.add(r14)     // Catch:{ all -> 0x0446 }
            monitor-exit(r3)     // Catch:{ all -> 0x0446 }
            java.lang.String r15 = "error"
            com.google.android.gms.internal.ads.zzfrr r1 = com.google.android.gms.internal.ads.zzfrr.zza()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            com.google.android.gms.internal.ads.zzcdp r2 = new com.google.android.gms.internal.ads.zzcdp     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r2.<init>(r9)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r4 = 265(0x109, float:3.71E-43)
            r5 = -1
            java.net.HttpURLConnection r1 = r1.zzn(r2, r4, r5)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            boolean r2 = r1 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            if (r2 == 0) goto L_0x0177
            r2 = r1
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r4 = 400(0x190, float:5.6E-43)
            if (r2 >= r4) goto L_0x0135
            goto L_0x0177
        L_0x0135:
            java.lang.String r15 = "badUrl"
            java.lang.String r0 = java.lang.Integer.toString(r2)     // Catch:{ IOException -> 0x0172, RuntimeException -> 0x0170 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0172, RuntimeException -> 0x0170 }
            r1.<init>()     // Catch:{ IOException -> 0x0172, RuntimeException -> 0x0170 }
            java.lang.String r3 = "HTTP request failed. Code: "
            r1.append(r3)     // Catch:{ IOException -> 0x0172, RuntimeException -> 0x0170 }
            r1.append(r0)     // Catch:{ IOException -> 0x0172, RuntimeException -> 0x0170 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0172, RuntimeException -> 0x0170 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x016d, RuntimeException -> 0x016b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016d, RuntimeException -> 0x016b }
            r3.<init>()     // Catch:{ IOException -> 0x016d, RuntimeException -> 0x016b }
            java.lang.String r4 = "HTTP status code "
            r3.append(r4)     // Catch:{ IOException -> 0x016d, RuntimeException -> 0x016b }
            r3.append(r2)     // Catch:{ IOException -> 0x016d, RuntimeException -> 0x016b }
            java.lang.String r2 = " at "
            r3.append(r2)     // Catch:{ IOException -> 0x016d, RuntimeException -> 0x016b }
            r3.append(r9)     // Catch:{ IOException -> 0x016d, RuntimeException -> 0x016b }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x016d, RuntimeException -> 0x016b }
            r0.<init>(r2)     // Catch:{ IOException -> 0x016d, RuntimeException -> 0x016b }
            throw r0     // Catch:{ IOException -> 0x016d, RuntimeException -> 0x016b }
        L_0x016b:
            r0 = move-exception
            goto L_0x016e
        L_0x016d:
            r0 = move-exception
        L_0x016e:
            r2 = r1
            goto L_0x0174
        L_0x0170:
            r0 = move-exception
            goto L_0x0173
        L_0x0172:
            r0 = move-exception
        L_0x0173:
            r2 = r11
        L_0x0174:
            r1 = r14
            goto L_0x03d6
        L_0x0177:
            int r7 = r1.getContentLength()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            if (r7 >= 0) goto L_0x01a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r0.<init>()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r1 = "Stream cache aborted, missing content-length header at "
            r0.append(r1)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r0.append(r9)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            int r1 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r1 = "contentLengthMissing"
            r8.zzg(r9, r0, r1, r11)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r3.remove(r14)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            return r10
        L_0x01a0:
            java.text.DecimalFormat r6 = zzf     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            long r4 = (long) r7     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r2 = r6.format(r4)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzt     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.Object r4 = r5.zzb(r4)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            int r5 = r4.intValue()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            if (r7 <= r5) goto L_0x01f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r0.<init>()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r1 = "Content length "
            r0.append(r1)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r0.append(r2)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r1 = " exceeds limit at "
            r0.append(r1)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r0.append(r9)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            int r1 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r0.<init>()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r1 = "File too big for full file cache. Size: "
            r0.append(r1)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r0.append(r2)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r2 = "sizeExceeded"
            r8.zzg(r9, r1, r2, r0)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r3.remove(r14)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            return r10
        L_0x01f5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r3.<init>()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r4 = "Caching "
            r3.append(r4)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r3.append(r2)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r2 = " bytes from "
            r3.append(r2)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r3.append(r9)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            int r3 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            com.google.android.gms.ads.internal.util.client.zzo.zze(r2)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.nio.channels.ReadableByteChannel r4 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            r3.<init>(r12)     // Catch:{ IOException -> 0x03ce, RuntimeException -> 0x03cc }
            java.nio.channels.FileChannel r2 = r3.getChannel()     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            com.google.android.gms.common.util.Clock r16 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            long r17 = r16.currentTimeMillis()     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            com.google.android.gms.internal.ads.zzbcv r11 = com.google.android.gms.internal.ads.zzbde.zzQ     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            com.google.android.gms.internal.ads.zzbdc r10 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            java.lang.Object r10 = r10.zzb(r11)     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            long r10 = r10.longValue()     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            com.google.android.gms.ads.internal.util.zzbx r13 = new com.google.android.gms.ads.internal.util.zzbx     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            r13.<init>(r10)     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            com.google.android.gms.internal.ads.zzbcv r10 = com.google.android.gms.internal.ads.zzbde.zzP     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            com.google.android.gms.internal.ads.zzbdc r11 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            java.lang.Object r10 = r11.zzb(r10)     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            long r10 = r10.longValue()     // Catch:{ IOException -> 0x03c0, RuntimeException -> 0x03be }
            r19 = r3
            r3 = 0
        L_0x025a:
            int r20 = r4.read(r1)     // Catch:{ IOException -> 0x03bc, RuntimeException -> 0x03ba }
            if (r20 < 0) goto L_0x035a
            int r3 = r3 + r20
            if (r3 > r5) goto L_0x0322
            r1.flip()     // Catch:{ IOException -> 0x031b, RuntimeException -> 0x0319 }
        L_0x0267:
            int r20 = r2.write(r1)     // Catch:{ IOException -> 0x031b, RuntimeException -> 0x0319 }
            if (r20 > 0) goto L_0x0315
            r1.clear()     // Catch:{ IOException -> 0x031b, RuntimeException -> 0x0319 }
            long r20 = r16.currentTimeMillis()     // Catch:{ IOException -> 0x031b, RuntimeException -> 0x0319 }
            long r20 = r20 - r17
            r22 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r10
            int r20 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r20 > 0) goto L_0x02ed
            r20 = r1
            boolean r1 = r8.zzh     // Catch:{ IOException -> 0x031b, RuntimeException -> 0x0319 }
            if (r1 != 0) goto L_0x02df
            boolean r1 = r13.zzb()     // Catch:{ IOException -> 0x031b, RuntimeException -> 0x0319 }
            if (r1 == 0) goto L_0x02b9
            java.lang.String r21 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x031b, RuntimeException -> 0x0319 }
            android.os.Handler r1 = com.google.android.gms.ads.internal.util.client.zzf.zza     // Catch:{ IOException -> 0x031b, RuntimeException -> 0x0319 }
            r22 = r13
            com.google.android.gms.internal.ads.zzcdh r13 = new com.google.android.gms.internal.ads.zzcdh     // Catch:{ IOException -> 0x031b, RuntimeException -> 0x0319 }
            r23 = 0
            r24 = r15
            r15 = r1
            r1 = r13
            r25 = r2
            r2 = r30
            r26 = r3
            r3 = r31
            r27 = r4
            r4 = r21
            r21 = r5
            r5 = r26
            r28 = r14
            r14 = r6
            r6 = r7
            r29 = r7
            r7 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            r15.post(r13)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            goto L_0x02ca
        L_0x02b9:
            r25 = r2
            r26 = r3
            r27 = r4
            r21 = r5
            r29 = r7
            r22 = r13
            r28 = r14
            r24 = r15
            r14 = r6
        L_0x02ca:
            r6 = r14
            r1 = r20
            r5 = r21
            r13 = r22
            r15 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r14 = r28
            r7 = r29
            goto L_0x025a
        L_0x02df:
            r28 = r14
            r24 = r15
            java.lang.String r15 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            java.lang.String r1 = "abort requested"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            throw r0     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
        L_0x02ed:
            r28 = r14
            r24 = r15
            java.lang.String r15 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            r1.<init>()     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            java.lang.String r2 = "Timeout exceeded. Limit: "
            r1.append(r2)     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            r1.append(r0)     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            java.lang.String r0 = " sec"
            r1.append(r0)     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            java.lang.String r11 = r1.toString()     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0349, RuntimeException -> 0x0347 }
            java.lang.String r1 = "stream cache time limit exceeded"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0349, RuntimeException -> 0x0347 }
            throw r0     // Catch:{ IOException -> 0x0349, RuntimeException -> 0x0347 }
        L_0x0315:
            r28 = r14
            goto L_0x0267
        L_0x0319:
            r0 = move-exception
            goto L_0x031c
        L_0x031b:
            r0 = move-exception
        L_0x031c:
            r28 = r14
            r24 = r15
            goto L_0x03b7
        L_0x0322:
            r26 = r3
            r28 = r14
            r24 = r15
            java.lang.String r15 = "sizeExceeded"
            java.lang.String r0 = java.lang.Integer.toString(r26)     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            r1.<init>()     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            java.lang.String r2 = "File too big for full file cache. Size: "
            r1.append(r2)     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            r1.append(r0)     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            java.lang.String r11 = r1.toString()     // Catch:{ IOException -> 0x0353, RuntimeException -> 0x0351 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0349, RuntimeException -> 0x0347 }
            java.lang.String r1 = "stream cache file size limit exceeded"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0349, RuntimeException -> 0x0347 }
            throw r0     // Catch:{ IOException -> 0x0349, RuntimeException -> 0x0347 }
        L_0x0347:
            r0 = move-exception
            goto L_0x034a
        L_0x0349:
            r0 = move-exception
        L_0x034a:
            r2 = r11
            r11 = r19
            r1 = r28
            goto L_0x03d6
        L_0x0351:
            r0 = move-exception
            goto L_0x0354
        L_0x0353:
            r0 = move-exception
        L_0x0354:
            r11 = r19
            r1 = r28
            goto L_0x03ca
        L_0x035a:
            r28 = r14
            r24 = r15
            r14 = r6
            r19.close()     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            r1 = 3
            boolean r1 = com.google.android.gms.ads.internal.util.zze.zzm(r1)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            if (r1 == 0) goto L_0x038a
            long r1 = (long) r3     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            java.lang.String r1 = r14.format(r1)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            r2.<init>()     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            java.lang.String r4 = "Preloaded "
            r2.append(r4)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            r2.append(r1)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            java.lang.String r1 = " bytes from "
            r2.append(r1)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            r2.append(r9)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            com.google.android.gms.ads.internal.util.client.zzo.zze(r1)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
        L_0x038a:
            r1 = 1
            r2 = 0
            r12.setReadable(r1, r2)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            boolean r1 = r0.isFile()     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            if (r1 == 0) goto L_0x039d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            r0.setLastModified(r1)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            goto L_0x03a0
        L_0x039d:
            r0.createNewFile()     // Catch:{ IOException -> 0x03a0, RuntimeException -> 0x03b4 }
        L_0x03a0:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            r8.zzh(r9, r0, r3)     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            java.util.Set r0 = zze     // Catch:{ IOException -> 0x03b6, RuntimeException -> 0x03b4 }
            r1 = r28
            r0.remove(r1)     // Catch:{ IOException -> 0x03b2, RuntimeException -> 0x03b0 }
            r0 = 1
            return r0
        L_0x03b0:
            r0 = move-exception
            goto L_0x03c6
        L_0x03b2:
            r0 = move-exception
            goto L_0x03c6
        L_0x03b4:
            r0 = move-exception
            goto L_0x03b7
        L_0x03b6:
            r0 = move-exception
        L_0x03b7:
            r1 = r28
            goto L_0x03c6
        L_0x03ba:
            r0 = move-exception
            goto L_0x03c3
        L_0x03bc:
            r0 = move-exception
            goto L_0x03c3
        L_0x03be:
            r0 = move-exception
            goto L_0x03c1
        L_0x03c0:
            r0 = move-exception
        L_0x03c1:
            r19 = r3
        L_0x03c3:
            r1 = r14
            r24 = r15
        L_0x03c6:
            r11 = r19
            r15 = r24
        L_0x03ca:
            r2 = 0
            goto L_0x03d6
        L_0x03cc:
            r0 = move-exception
            goto L_0x03cf
        L_0x03ce:
            r0 = move-exception
        L_0x03cf:
            r1 = r14
            r24 = r15
            r15 = r24
            r2 = 0
            r11 = 0
        L_0x03d6:
            boolean r3 = r0 instanceof java.lang.RuntimeException
            if (r3 == 0) goto L_0x03e3
            java.lang.String r3 = "VideoStreamFullFileCache.preload"
            com.google.android.gms.internal.ads.zzbzs r4 = com.google.android.gms.ads.internal.zzv.zzp()
            r4.zzw(r0, r3)
        L_0x03e3:
            r11.close()     // Catch:{ IOException | NullPointerException -> 0x03e6 }
        L_0x03e6:
            boolean r3 = r8.zzh
            if (r3 == 0) goto L_0x0403
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Preload aborted for URL \""
            r0.<init>(r3)
            r0.append(r9)
            java.lang.String r3 = "\""
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r3 = com.google.android.gms.ads.internal.util.zze.zza
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r0)
            goto L_0x041b
        L_0x0403:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Preload failed for URL \""
            r3.<init>(r4)
            r3.append(r9)
            java.lang.String r4 = "\""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r4 = com.google.android.gms.ads.internal.util.zze.zza
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r3, r0)
        L_0x041b:
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x0438
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x0438
            java.lang.String r0 = r12.getAbsolutePath()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Could not delete partial cache file at "
            java.lang.String r0 = r3.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)
        L_0x0438:
            java.lang.String r0 = r12.getAbsolutePath()
            r8.zzg(r9, r0, r15, r2)
            java.util.Set r0 = zze
            r0.remove(r1)
        L_0x0444:
            r1 = 0
            return r1
        L_0x0446:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0446 }
            throw r0
        L_0x0449:
            java.lang.String r0 = "noCacheDir"
            r1 = 0
            r8.zzg(r9, r1, r0, r1)
            goto L_0x0444
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdq.zzt(java.lang.String):boolean");
    }
}
