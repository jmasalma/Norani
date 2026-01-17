package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhh extends zzgc {
    private final Context zza;
    private zzgo zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhh(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    private static int zzk(String str) throws zzhg {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzhg("Resource identifier must be an integer.", (Throwable) null, 1004);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzgo zzgo) throws zzhg {
        Resources resources;
        int i;
        String str;
        Uri normalizeScheme = zzgo.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                i = zzk(pathSegments.get(0));
            } else {
                int size = pathSegments.size();
                throw new zzhg("rawresource:// URI must have exactly one path element, found " + size);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            String str2 = path;
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                str = context.getPackageName();
            } else {
                str = normalizeScheme.getHost();
            }
            if (str.equals(context.getPackageName())) {
                resources = context.getResources();
            } else {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(str);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzhg("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                i = zzk(path);
            } else {
                i = resources.getIdentifier(str + ":" + path, "raw", (String) null);
                if (i == 0) {
                    throw new zzhg("Resource not found.", (Throwable) null, 2005);
                }
            }
        } else {
            String scheme = normalizeScheme.getScheme();
            throw new zzhg("Unsupported URI scheme (" + scheme + "). Only android.resource is supported.", (Throwable) null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzhg("Resource is compressed: ".concat(String.valueOf(String.valueOf(normalizeScheme))), (Throwable) null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new zzhg((String) null, e2, 2005);
        }
    }

    public final int zza(byte[] bArr, int i, int i2) throws zzhg {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new zzhg((String) null, e, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        String str = zzex.zza;
        InputStream inputStream2 = inputStream;
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.zze;
            if (j2 != -1) {
                this.zze = j2 - ((long) read);
            }
            zzg(read);
            return read;
        } else if (this.zze == -1) {
            return -1;
        } else {
            throw new zzhg("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }

    public final long zzb(zzgo zzgo) throws zzhg {
        long j;
        long j2;
        this.zzb = zzgo;
        zzi(zzgo);
        AssetFileDescriptor zzl = zzl(this.zza, zzgo);
        this.zzc = zzl;
        long length = zzl.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        int i = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        if (i != 0) {
            try {
                if (zzgo.zze > length) {
                    throw new zzhg((String) null, (Throwable) null, 2008);
                }
            } catch (zzhg e) {
                throw e;
            } catch (IOException e2) {
                throw new zzhg((String) null, e2, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long j3 = zzgo.zze;
        long skip = fileInputStream.skip(startOffset + j3) - startOffset;
        if (skip == j3) {
            if (i == 0) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.zze = -1;
                    j = -1;
                } else {
                    j = channel.size() - channel.position();
                    this.zze = j;
                    if (j < 0) {
                        throw new zzhg((String) null, (Throwable) null, 2008);
                    }
                }
            } else {
                j = length - skip;
                this.zze = j;
                if (j < 0) {
                    throw new zzgk(2008);
                }
            }
            long j4 = zzgo.zzf;
            int i2 = (j4 > -1 ? 1 : (j4 == -1 ? 0 : -1));
            if (i2 != 0) {
                if (j == -1) {
                    j2 = j4;
                } else {
                    j2 = Math.min(j, j4);
                }
                this.zze = j2;
            }
            this.zzf = true;
            zzj(zzgo);
            return i2 != 0 ? j4 : this.zze;
        }
        throw new zzhg((String) null, (Throwable) null, 2008);
    }

    public final Uri zzc() {
        zzgo zzgo = this.zzb;
        if (zzgo != null) {
            return zzgo.zza;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        throw new com.google.android.gms.internal.ads.zzhg((java.lang.String) null, r3, 2000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0049, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004f, code lost:
        throw new com.google.android.gms.internal.ads.zzhg((java.lang.String) null, r3, 2000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0050, code lost:
        r5.zzc = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        if (r5.zzf != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0056, code lost:
        r5.zzf = false;
        zzh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005b, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x000f, B:15:0x0025, B:24:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd() throws com.google.android.gms.internal.ads.zzhg {
        /*
            r5 = this;
            r0 = 0
            r5.zzb = r0
            r1 = 0
            r2 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r3 = r5.zzd     // Catch:{ IOException -> 0x002d }
            if (r3 == 0) goto L_0x000d
            r3.close()     // Catch:{ IOException -> 0x002d }
        L_0x000d:
            r5.zzd = r0
            android.content.res.AssetFileDescriptor r3 = r5.zzc     // Catch:{ IOException -> 0x0024 }
            if (r3 == 0) goto L_0x0016
            r3.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0016:
            r5.zzc = r0
            boolean r0 = r5.zzf
            if (r0 == 0) goto L_0x0021
            r5.zzf = r1
            r5.zzh()
        L_0x0021:
            return
        L_0x0022:
            r2 = move-exception
            goto L_0x0050
        L_0x0024:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzhg r4 = new com.google.android.gms.internal.ads.zzhg     // Catch:{ all -> 0x0022 }
            r4.<init>(r0, r3, r2)     // Catch:{ all -> 0x0022 }
            throw r4     // Catch:{ all -> 0x0022 }
        L_0x002b:
            r3 = move-exception
            goto L_0x0034
        L_0x002d:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzhg r4 = new com.google.android.gms.internal.ads.zzhg     // Catch:{ all -> 0x002b }
            r4.<init>(r0, r3, r2)     // Catch:{ all -> 0x002b }
            throw r4     // Catch:{ all -> 0x002b }
        L_0x0034:
            r5.zzd = r0
            android.content.res.AssetFileDescriptor r4 = r5.zzc     // Catch:{ IOException -> 0x0049 }
            if (r4 == 0) goto L_0x003d
            r4.close()     // Catch:{ IOException -> 0x0049 }
        L_0x003d:
            r5.zzc = r0
            boolean r0 = r5.zzf
            if (r0 == 0) goto L_0x0048
            r5.zzf = r1
            r5.zzh()
        L_0x0048:
            throw r3
        L_0x0049:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzhg r4 = new com.google.android.gms.internal.ads.zzhg     // Catch:{ all -> 0x0022 }
            r4.<init>(r0, r3, r2)     // Catch:{ all -> 0x0022 }
            throw r4     // Catch:{ all -> 0x0022 }
        L_0x0050:
            r5.zzc = r0
            boolean r0 = r5.zzf
            if (r0 == 0) goto L_0x005b
            r5.zzf = r1
            r5.zzh()
        L_0x005b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhh.zzd():void");
    }
}
