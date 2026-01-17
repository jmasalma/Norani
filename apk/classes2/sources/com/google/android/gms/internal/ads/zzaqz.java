package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaqz implements zzapn {
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final zzaqy zzc;
    private final int zzd;

    public zzaqz(zzaqy zzaqy, int i) {
        this.zzc = zzaqy;
        this.zzd = 5242880;
    }

    static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    static long zzf(InputStream inputStream) throws IOException {
        return (((long) zzn(inputStream)) & 255) | ((((long) zzn(inputStream)) & 255) << 8) | ((((long) zzn(inputStream)) & 255) << 16) | ((((long) zzn(inputStream)) & 255) << 24) | ((((long) zzn(inputStream)) & 255) << 32) | ((((long) zzn(inputStream)) & 255) << 40) | ((((long) zzn(inputStream)) & 255) << 48) | ((((long) zzn(inputStream)) & 255) << 56);
    }

    static String zzh(zzaqx zzaqx) throws IOException {
        return new String(zzm(zzaqx, zzf(zzaqx)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzaqx zzaqx, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long zza2 = zzaqx.zza();
        if (i >= 0 && j <= zza2) {
            int i2 = (int) j;
            if (((long) i2) == j) {
                byte[] bArr = new byte[i2];
                new DataInputStream(zzaqx).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + zza2);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqw zzaqw) {
        Map map = this.zza;
        if (!map.containsKey(str)) {
            this.zzb += zzaqw.zza;
        } else {
            this.zzb += zzaqw.zza - ((zzaqw) map.get(str)).zza;
        }
        map.put(str, zzaqw);
    }

    private final void zzp(String str) {
        zzaqw zzaqw = (zzaqw) this.zza.remove(str);
        if (zzaqw != null) {
            this.zzb -= zzaqw.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final synchronized zzapm zza(String str) {
        zzaqx zzaqx;
        zzaqw zzaqw = (zzaqw) this.zza.get(str);
        if (zzaqw == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzaqx = new zzaqx(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            String str2 = zzaqw.zza(zzaqx).zzb;
            if (!TextUtils.equals(str, str2)) {
                zzaqp.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, str2);
                zzp(str);
                zzaqx.close();
                return null;
            }
            byte[] zzm = zzm(zzaqx, zzaqx.zza());
            zzapm zzapm = new zzapm();
            zzapm.zza = zzm;
            zzapm.zzb = zzaqw.zzc;
            zzapm.zzc = zzaqw.zzd;
            zzapm.zzd = zzaqw.zze;
            zzapm.zze = zzaqw.zzf;
            zzapm.zzf = zzaqw.zzg;
            List<zzapv> list = zzaqw.zzh;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzapv zzapv : list) {
                treeMap.put(zzapv.zza(), zzapv.zzb());
            }
            zzapm.zzg = treeMap;
            zzapm.zzh = Collections.unmodifiableList(list);
            zzaqx.close();
            return zzapm;
        } catch (IOException e) {
            zzaqp.zza("%s: %s", zzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        } catch (Throwable th) {
            zzaqx.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.internal.ads.zzaqy r0 = r8.zzc     // Catch:{ all -> 0x005d }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x005d }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x005d }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x005d }
            if (r1 != 0) goto L_0x005b
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x005d }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "Unable to create cache dir %s"
            com.google.android.gms.internal.ads.zzaqp.zzb(r1, r0)     // Catch:{ all -> 0x005d }
            monitor-exit(r8)
            return
        L_0x0022:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x005b
            r1 = 0
        L_0x0029:
            int r2 = r0.length     // Catch:{ all -> 0x005d }
            if (r1 >= r2) goto L_0x005b
            r2 = r0[r1]     // Catch:{ all -> 0x005d }
            long r3 = r2.length()     // Catch:{ IOException -> 0x0055 }
            com.google.android.gms.internal.ads.zzaqx r5 = new com.google.android.gms.internal.ads.zzaqx     // Catch:{ IOException -> 0x0055 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0055 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0055 }
            r7.<init>(r2)     // Catch:{ IOException -> 0x0055 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0055 }
            r5.<init>(r6, r3)     // Catch:{ IOException -> 0x0055 }
            com.google.android.gms.internal.ads.zzaqw r6 = com.google.android.gms.internal.ads.zzaqw.zza(r5)     // Catch:{ all -> 0x0050 }
            r6.zza = r3     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = r6.zzb     // Catch:{ all -> 0x0050 }
            r8.zzo(r3, r6)     // Catch:{ all -> 0x0050 }
            r5.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0058
        L_0x0050:
            r3 = move-exception
            r5.close()     // Catch:{ IOException -> 0x0055 }
            throw r3     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r2.delete()     // Catch:{ all -> 0x005d }
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x0029
        L_0x005b:
            monitor-exit(r8)
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x005d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqz.zzb():void");
    }

    public final synchronized void zzc(String str, boolean z) {
        zzapm zza2 = zza(str);
        if (zza2 != null) {
            zza2.zzf = 0;
            zza2.zze = 0;
            zzd(str, zza2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0155 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzd(java.lang.String r16, com.google.android.gms.internal.ads.zzapm r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.zzb     // Catch:{ all -> 0x018c }
            byte[] r5 = r2.zza     // Catch:{ all -> 0x018c }
            int r5 = r5.length     // Catch:{ all -> 0x018c }
            long r6 = (long) r5     // Catch:{ all -> 0x018c }
            long r3 = r3 + r6
            int r6 = r1.zzd     // Catch:{ all -> 0x018c }
            long r7 = (long) r6     // Catch:{ all -> 0x018c }
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r4 = 1063675494(0x3f666666, float:0.9)
            if (r3 <= 0) goto L_0x001e
            float r3 = (float) r5     // Catch:{ all -> 0x018c }
            float r5 = (float) r6     // Catch:{ all -> 0x018c }
            float r5 = r5 * r4
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x018a
        L_0x001e:
            java.io.File r3 = r15.zzg(r16)     // Catch:{ all -> 0x018c }
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0155 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0155 }
            r7.<init>(r3)     // Catch:{ IOException -> 0x0155 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0155 }
            com.google.android.gms.internal.ads.zzaqw r7 = new com.google.android.gms.internal.ads.zzaqw     // Catch:{ IOException -> 0x0155 }
            r7.<init>(r0, r2)     // Catch:{ IOException -> 0x0155 }
            r8 = 538247942(0x20150306, float:1.2621791E-19)
            zzj(r6, r8)     // Catch:{ IOException -> 0x0131 }
            java.lang.String r8 = r7.zzb     // Catch:{ IOException -> 0x0131 }
            zzl(r6, r8)     // Catch:{ IOException -> 0x0131 }
            java.lang.String r8 = r7.zzc     // Catch:{ IOException -> 0x0131 }
            if (r8 != 0) goto L_0x0043
            java.lang.String r8 = ""
        L_0x0043:
            zzl(r6, r8)     // Catch:{ IOException -> 0x0131 }
            long r8 = r7.zzd     // Catch:{ IOException -> 0x0131 }
            zzk(r6, r8)     // Catch:{ IOException -> 0x0131 }
            long r8 = r7.zze     // Catch:{ IOException -> 0x0131 }
            zzk(r6, r8)     // Catch:{ IOException -> 0x0131 }
            long r8 = r7.zzf     // Catch:{ IOException -> 0x0131 }
            zzk(r6, r8)     // Catch:{ IOException -> 0x0131 }
            long r8 = r7.zzg     // Catch:{ IOException -> 0x0131 }
            zzk(r6, r8)     // Catch:{ IOException -> 0x0131 }
            java.util.List r8 = r7.zzh     // Catch:{ IOException -> 0x0131 }
            if (r8 == 0) goto L_0x0084
            int r9 = r8.size()     // Catch:{ IOException -> 0x0131 }
            zzj(r6, r9)     // Catch:{ IOException -> 0x0131 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x0131 }
        L_0x0069:
            boolean r9 = r8.hasNext()     // Catch:{ IOException -> 0x0131 }
            if (r9 == 0) goto L_0x0087
            java.lang.Object r9 = r8.next()     // Catch:{ IOException -> 0x0131 }
            com.google.android.gms.internal.ads.zzapv r9 = (com.google.android.gms.internal.ads.zzapv) r9     // Catch:{ IOException -> 0x0131 }
            java.lang.String r10 = r9.zza()     // Catch:{ IOException -> 0x0131 }
            zzl(r6, r10)     // Catch:{ IOException -> 0x0131 }
            java.lang.String r9 = r9.zzb()     // Catch:{ IOException -> 0x0131 }
            zzl(r6, r9)     // Catch:{ IOException -> 0x0131 }
            goto L_0x0069
        L_0x0084:
            zzj(r6, r5)     // Catch:{ IOException -> 0x0131 }
        L_0x0087:
            r6.flush()     // Catch:{ IOException -> 0x0131 }
            byte[] r2 = r2.zza     // Catch:{ IOException -> 0x0155 }
            r6.write(r2)     // Catch:{ IOException -> 0x0155 }
            r6.close()     // Catch:{ IOException -> 0x0155 }
            long r8 = r3.length()     // Catch:{ IOException -> 0x0155 }
            r7.zza = r8     // Catch:{ IOException -> 0x0155 }
            r15.zzo(r0, r7)     // Catch:{ IOException -> 0x0155 }
            long r6 = r1.zzb     // Catch:{ IOException -> 0x0155 }
            int r0 = r1.zzd     // Catch:{ IOException -> 0x0155 }
            long r8 = (long) r0     // Catch:{ IOException -> 0x0155 }
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a6
            goto L_0x018a
        L_0x00a6:
            boolean r2 = com.google.android.gms.internal.ads.zzaqp.zzb     // Catch:{ IOException -> 0x0155 }
            if (r2 == 0) goto L_0x00b1
            java.lang.String r6 = "Pruning old cache entries."
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0155 }
            com.google.android.gms.internal.ads.zzaqp.zzd(r6, r7)     // Catch:{ IOException -> 0x0155 }
        L_0x00b1:
            long r6 = r1.zzb     // Catch:{ IOException -> 0x0155 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0155 }
            java.util.Map r10 = r1.zza     // Catch:{ IOException -> 0x0155 }
            java.util.Set r10 = r10.entrySet()     // Catch:{ IOException -> 0x0155 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x0155 }
            r11 = r5
        L_0x00c2:
            boolean r12 = r10.hasNext()     // Catch:{ IOException -> 0x0155 }
            if (r12 == 0) goto L_0x010c
            java.lang.Object r12 = r10.next()     // Catch:{ IOException -> 0x0155 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ IOException -> 0x0155 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ IOException -> 0x0155 }
            com.google.android.gms.internal.ads.zzaqw r12 = (com.google.android.gms.internal.ads.zzaqw) r12     // Catch:{ IOException -> 0x0155 }
            java.lang.String r13 = r12.zzb     // Catch:{ IOException -> 0x0155 }
            java.io.File r14 = r15.zzg(r13)     // Catch:{ IOException -> 0x0155 }
            boolean r14 = r14.delete()     // Catch:{ IOException -> 0x0155 }
            if (r14 == 0) goto L_0x00ea
            long r13 = r1.zzb     // Catch:{ IOException -> 0x0155 }
            r16 = r6
            long r5 = r12.zza     // Catch:{ IOException -> 0x0155 }
            long r13 = r13 - r5
            r1.zzb = r13     // Catch:{ IOException -> 0x0155 }
            goto L_0x00f9
        L_0x00ea:
            r16 = r6
            java.lang.String r5 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.String r6 = zzq(r13)     // Catch:{ IOException -> 0x0155 }
            java.lang.Object[] r6 = new java.lang.Object[]{r13, r6}     // Catch:{ IOException -> 0x0155 }
            com.google.android.gms.internal.ads.zzaqp.zza(r5, r6)     // Catch:{ IOException -> 0x0155 }
        L_0x00f9:
            r10.remove()     // Catch:{ IOException -> 0x0155 }
            int r11 = r11 + 1
            long r5 = r1.zzb     // Catch:{ IOException -> 0x0155 }
            float r5 = (float) r5     // Catch:{ IOException -> 0x0155 }
            float r6 = (float) r0     // Catch:{ IOException -> 0x0155 }
            float r6 = r6 * r4
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0108
            goto L_0x010e
        L_0x0108:
            r6 = r16
            r5 = 0
            goto L_0x00c2
        L_0x010c:
            r16 = r6
        L_0x010e:
            if (r2 == 0) goto L_0x018a
            java.lang.String r0 = "pruned %d files, %d bytes, %d ms"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x0155 }
            long r4 = r1.zzb     // Catch:{ IOException -> 0x0155 }
            r6 = r16
            long r4 = r4 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0155 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0155 }
            long r5 = r5 - r8
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x0155 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4, r5}     // Catch:{ IOException -> 0x0155 }
            com.google.android.gms.internal.ads.zzaqp.zzd(r0, r2)     // Catch:{ IOException -> 0x0155 }
            monitor-exit(r15)
            return
        L_0x0131:
            r0 = move-exception
            java.lang.String r2 = "%s"
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0155 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x0155 }
            com.google.android.gms.internal.ads.zzaqp.zza(r2, r0)     // Catch:{ IOException -> 0x0155 }
            r6.close()     // Catch:{ IOException -> 0x0155 }
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0155 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ IOException -> 0x0155 }
            com.google.android.gms.internal.ads.zzaqp.zza(r0, r2)     // Catch:{ IOException -> 0x0155 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0155 }
            r0.<init>()     // Catch:{ IOException -> 0x0155 }
            throw r0     // Catch:{ IOException -> 0x0155 }
        L_0x0155:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x0168
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x018c }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x018c }
            java.lang.String r2 = "Could not clean up file %s"
            com.google.android.gms.internal.ads.zzaqp.zza(r2, r0)     // Catch:{ all -> 0x018c }
        L_0x0168:
            com.google.android.gms.internal.ads.zzaqy r0 = r1.zzc     // Catch:{ all -> 0x018c }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x018c }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x018a
            r2 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x018c }
            java.lang.String r2 = "Re-initializing cache after external clearing."
            com.google.android.gms.internal.ads.zzaqp.zza(r2, r0)     // Catch:{ all -> 0x018c }
            java.util.Map r0 = r1.zza     // Catch:{ all -> 0x018c }
            r0.clear()     // Catch:{ all -> 0x018c }
            r2 = 0
            r1.zzb = r2     // Catch:{ all -> 0x018c }
            r15.zzb()     // Catch:{ all -> 0x018c }
            monitor-exit(r15)
            return
        L_0x018a:
            monitor-exit(r15)
            return
        L_0x018c:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x018c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqz.zzd(java.lang.String, com.google.android.gms.internal.ads.zzapm):void");
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (!delete) {
            zzaqp.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
        }
    }

    public zzaqz(File file, int i) {
        this.zzc = new zzaqv(this, file);
        this.zzd = 20971520;
    }
}
