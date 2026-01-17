package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzawx {
    private static final String zzc = "zzawx";
    protected final Context zza;
    protected boolean zzb;
    private ExecutorService zzd;
    private DexClassLoader zze;
    private zzawc zzf;
    private byte[] zzg;
    private volatile AdvertisingIdClient zzh = null;
    private volatile boolean zzi;
    private final boolean zzj;
    /* access modifiers changed from: private */
    public volatile zzatq zzk;
    private Future zzl;
    private zzavx zzm;
    private zzavo zzn;
    private final Map zzo;
    private boolean zzp;
    private zzawq zzq;

    private zzawx(Context context) {
        boolean z = false;
        this.zzi = false;
        this.zzk = null;
        this.zzl = null;
        this.zzb = false;
        this.zzp = false;
        Context applicationContext = context.getApplicationContext();
        this.zzj = applicationContext != null ? true : z;
        context = applicationContext != null ? applicationContext : context;
        this.zza = context;
        this.zzo = new HashMap();
        if (this.zzq == null) {
            this.zzq = new zzawq(context);
        }
    }

    public static zzawx zzg(Context context, String str, String str2, boolean z, zzavx zzavx) {
        File cacheDir;
        File file;
        zzawx zzawx = new zzawx(context);
        try {
            zzawx.zzd = Executors.newCachedThreadPool(new zzawt());
            zzawx.zzi = z;
            if (z) {
                zzawx.zzd.submit(new zzawu(zzawx));
            }
            zzawx.zzd.execute(new zzaww(zzawx));
            try {
                GoogleApiAvailabilityLight instance = GoogleApiAvailabilityLight.getInstance();
                Context context2 = zzawx.zza;
                instance.getApkVersion(context2);
                zzawx.zzb = instance.isGooglePlayServicesAvailable(context2) == 0;
            } catch (Throwable unused) {
            }
            if (zzavx != null) {
                zzawx.zzm = zzavx;
            } else {
                zzawx.zzn(0, true);
            }
            if (zzaxa.zzc()) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzdD)).booleanValue()) {
                    throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                }
            }
            zzawc zzawc = new zzawc((SecureRandom) null);
            zzawx.zzf = zzawc;
            try {
                byte[] zzb2 = zzaul.zzb("ZXCHn3veSKESmIQGY5dTv+Y5At4diIt6mZtYwgFH5dU=", false);
                if (zzb2.length == 32) {
                    byte[] bArr = new byte[16];
                    ByteBuffer.wrap(zzb2, 4, 16).get(bArr);
                    for (int i = 0; i < 16; i++) {
                        bArr[i] = (byte) (bArr[i] ^ 68);
                    }
                    zzawx.zzg = bArr;
                    try {
                        Context context3 = zzawx.zza;
                        cacheDir = context3.getCacheDir();
                        if (cacheDir == null) {
                            cacheDir = context3.getDir("dex", 0);
                            if (cacheDir == null) {
                                throw new zzawn();
                            }
                        }
                        file = new File(String.format("%s/%s.jar", new Object[]{cacheDir, "1743000482668"}));
                        if (!file.exists()) {
                            byte[] zzb3 = zzawx.zzf.zzb(zzawx.zzg, "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");
                            file.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            if (Build.VERSION.SDK_INT >= 33) {
                                file.setReadOnly();
                            }
                            fileOutputStream.write(zzb3, 0, zzb3.length);
                            fileOutputStream.close();
                        }
                        zzawx.zzv(cacheDir, "1743000482668");
                        zzawx.zze = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), (String) null, context3.getClassLoader());
                        zzw(file);
                        zzawx.zzu(cacheDir, "1743000482668");
                        zzx(String.format("%s/%s.dex", new Object[]{cacheDir, "1743000482668"}));
                        zzawx.zzn = new zzavo(zzawx);
                        zzawx.zzp = true;
                        return zzawx;
                    } catch (SecurityException e) {
                        throw new zzawn(e);
                    } catch (FileNotFoundException e2) {
                        throw new zzawn(e2);
                    } catch (IOException e3) {
                        throw new zzawn(e3);
                    } catch (zzawb e4) {
                        throw new zzawn(e4);
                    } catch (NullPointerException e5) {
                        throw new zzawn(e5);
                    } catch (Throwable th) {
                        zzw(file);
                        zzawx.zzu(cacheDir, "1743000482668");
                        zzx(String.format("%s/%s.dex", new Object[]{cacheDir, "1743000482668"}));
                        throw th;
                    }
                } else {
                    throw new zzawb(zzawc);
                }
            } catch (IllegalArgumentException e6) {
                throw new zzawb(zzawc, e6);
            } catch (zzawb e7) {
                throw new zzawn(e7);
            }
        } catch (zzawn unused2) {
        }
    }

    /* access modifiers changed from: private */
    public final void zzt() {
        try {
            if (this.zzh == null && this.zzj) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zza);
                advertisingIdClient.start();
                this.zzh = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzh = null;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00bc */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2 A[SYNTHETIC, Splitter:B:39:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7 A[SYNTHETIC, Splitter:B:43:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e1 A[SYNTHETIC, Splitter:B:51:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e6 A[SYNTHETIC, Splitter:B:55:0x00e6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzu(java.io.File r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r10 = "test"
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "1743000482668"
            java.lang.Object[] r2 = new java.lang.Object[]{r9, r1}
            java.lang.String r3 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x001b
            goto L_0x00ec
        L_0x001b:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r1}
            java.lang.String r3 = "%s/%s.dex"
            java.lang.String r9 = java.lang.String.format(r3, r9)
            r2.<init>(r9)
            boolean r9 = r2.exists()
            if (r9 == 0) goto L_0x00ec
            long r3 = r2.length()
            r5 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ec
            int r9 = (int) r3
            byte[] r9 = new byte[r9]
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00cd }
            r4.<init>(r2)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00cd }
            int r5 = r4.read(r9)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            if (r5 > 0) goto L_0x0050
            r4.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            zzw(r2)
            return
        L_0x0050:
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            r5.print(r10)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            r5.print(r10)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            r5.print(r10)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            com.google.android.gms.internal.ads.zzatt r10 = com.google.android.gms.internal.ads.zzatu.zza()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            java.lang.String r5 = android.os.Build.VERSION.SDK     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            byte[] r5 = r5.getBytes()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            com.google.android.gms.internal.ads.zzgxz r6 = com.google.android.gms.internal.ads.zzgxz.zzb     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            int r6 = r5.length     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            r7 = 0
            com.google.android.gms.internal.ads.zzgxz r5 = com.google.android.gms.internal.ads.zzgxz.zzv(r5, r7, r6)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            r10.zzc(r5)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            byte[] r1 = r1.getBytes()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            int r5 = r1.length     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            com.google.android.gms.internal.ads.zzgxz r1 = com.google.android.gms.internal.ads.zzgxz.zzv(r1, r7, r5)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            r10.zzd(r1)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            com.google.android.gms.internal.ads.zzawc r1 = r8.zzf     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            byte[] r5 = r8.zzg     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            java.lang.String r9 = r1.zza(r5, r9)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            byte[] r9 = r9.getBytes()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            int r1 = r9.length     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            com.google.android.gms.internal.ads.zzgxz r1 = com.google.android.gms.internal.ads.zzgxz.zzv(r9, r7, r1)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            r10.zza(r1)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            byte[] r9 = com.google.android.gms.internal.ads.zzaus.zzf(r9)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            int r1 = r9.length     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            com.google.android.gms.internal.ads.zzgxz r9 = com.google.android.gms.internal.ads.zzgxz.zzv(r9, r7, r1)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            r10.zzb(r9)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            r0.createNewFile()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            r9.<init>(r0)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c5 }
            com.google.android.gms.internal.ads.zzgzh r10 = r10.zzbr()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c3 }
            com.google.android.gms.internal.ads.zzatu r10 = (com.google.android.gms.internal.ads.zzatu) r10     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c3 }
            byte[] r10 = r10.zzaV()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c3 }
            int r0 = r10.length     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c3 }
            r9.write(r10, r7, r0)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c3 }
            r9.close()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c3 }
            r4.close()     // Catch:{ IOException -> 0x00bc }
        L_0x00bc:
            r9.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            zzw(r2)
            return
        L_0x00c3:
            r10 = move-exception
            goto L_0x00c8
        L_0x00c5:
            r9 = move-exception
            r10 = r9
            r9 = r3
        L_0x00c8:
            r3 = r4
            goto L_0x00d0
        L_0x00ca:
            r9 = r3
        L_0x00cb:
            r3 = r4
            goto L_0x00df
        L_0x00cd:
            r9 = move-exception
            r10 = r9
            r9 = r3
        L_0x00d0:
            if (r3 == 0) goto L_0x00d5
            r3.close()     // Catch:{ IOException -> 0x00d5 }
        L_0x00d5:
            if (r9 == 0) goto L_0x00da
            r9.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            zzw(r2)
            throw r10
        L_0x00de:
            r9 = r3
        L_0x00df:
            if (r3 == 0) goto L_0x00e4
            r3.close()     // Catch:{ IOException -> 0x00e4 }
        L_0x00e4:
            if (r9 == 0) goto L_0x00e9
            r9.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            zzw(r2)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawx.zzu(java.io.File, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:31|32|33|34|35|36|79) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00da, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00d6 */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[ExcHandler: zzawb | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e5 A[SYNTHETIC, Splitter:B:60:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ea A[SYNTHETIC, Splitter:B:64:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f1 A[SYNTHETIC, Splitter:B:71:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f6 A[SYNTHETIC, Splitter:B:75:0x00f6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzv(java.io.File r8, java.lang.String r9) {
        /*
            r7 = this;
            java.io.File r9 = new java.io.File
            java.lang.String r0 = "1743000482668"
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r0}
            java.lang.String r2 = "%s/%s.tmp"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r9.<init>(r1)
            boolean r1 = r9.exists()
            r2 = 0
            if (r1 != 0) goto L_0x0019
            return r2
        L_0x0019:
            java.io.File r1 = new java.io.File
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            java.lang.String r3 = "%s/%s.dex"
            java.lang.String r8 = java.lang.String.format(r3, r8)
            r1.<init>(r8)
            boolean r8 = r1.exists()
            if (r8 != 0) goto L_0x00f9
            r8 = 0
            long r3 = r9.length()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00e1 }
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x003d
            zzw(r9)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00e1 }
            return r2
        L_0x003d:
            int r3 = (int) r3     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00e1 }
            byte[] r3 = new byte[r3]     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00e1 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00e1 }
            r4.<init>(r9)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00ee, all -> 0x00e1 }
            int r5 = r4.read(r3)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            if (r5 > 0) goto L_0x0059
            java.lang.String r0 = zzc     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r0, r1)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            zzw(r9)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            r4.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            return r2
        L_0x0059:
            com.google.android.gms.internal.ads.zzgyr r5 = com.google.android.gms.internal.ads.zzgyr.zza()     // Catch:{ NullPointerException -> 0x00d6, zzawb | IOException | NoSuchAlgorithmException -> 0x00de, zzawb | IOException | NoSuchAlgorithmException -> 0x00de }
            com.google.android.gms.internal.ads.zzatu r3 = com.google.android.gms.internal.ads.zzatu.zzc(r3, r5)     // Catch:{ NullPointerException -> 0x00d6, zzawb | IOException | NoSuchAlgorithmException -> 0x00de, zzawb | IOException | NoSuchAlgorithmException -> 0x00de }
            java.lang.String r5 = new java.lang.String     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            com.google.android.gms.internal.ads.zzgxz r6 = r3.zzh()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            byte[] r6 = r6.zzA()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            r5.<init>(r6)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            boolean r0 = r0.equals(r5)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            if (r0 == 0) goto L_0x00cf
            com.google.android.gms.internal.ads.zzgxz r0 = r3.zzf()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            byte[] r0 = r0.zzA()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            com.google.android.gms.internal.ads.zzgxz r5 = r3.zzd()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            byte[] r5 = r5.zzA()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            byte[] r5 = com.google.android.gms.internal.ads.zzaus.zzf(r5)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            boolean r0 = java.util.Arrays.equals(r0, r5)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            if (r0 == 0) goto L_0x00cf
            com.google.android.gms.internal.ads.zzgxz r0 = r3.zzg()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            byte[] r0 = r0.zzA()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            java.lang.String r5 = android.os.Build.VERSION.SDK     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            byte[] r5 = r5.getBytes()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            boolean r0 = java.util.Arrays.equals(r0, r5)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            if (r0 != 0) goto L_0x00a3
            goto L_0x00cf
        L_0x00a3:
            com.google.android.gms.internal.ads.zzawc r9 = r7.zzf     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            byte[] r0 = r7.zzg     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            java.lang.String r5 = new java.lang.String     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            com.google.android.gms.internal.ads.zzgxz r3 = r3.zzd()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            byte[] r3 = r3.zzA()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            r5.<init>(r3)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            byte[] r9 = r9.zzb(r0, r5)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            r1.createNewFile()     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            r0.<init>(r1)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            int r8 = r9.length     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            r0.write(r9, r2, r8)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            r4.close()     // Catch:{ IOException -> 0x00c7 }
        L_0x00c7:
            r0.close()     // Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            r8 = 1
            return r8
        L_0x00cc:
            r8 = move-exception
            r9 = r8
            goto L_0x00dc
        L_0x00cf:
            zzw(r9)     // Catch:{ zzawb | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00da }
            r4.close()     // Catch:{ IOException -> 0x00d5 }
        L_0x00d5:
            return r2
        L_0x00d6:
            r4.close()     // Catch:{ IOException -> 0x00d9 }
        L_0x00d9:
            return r2
        L_0x00da:
            r9 = move-exception
            r0 = r8
        L_0x00dc:
            r8 = r4
            goto L_0x00e3
        L_0x00de:
            r0 = r8
        L_0x00df:
            r8 = r4
            goto L_0x00ef
        L_0x00e1:
            r9 = move-exception
            r0 = r8
        L_0x00e3:
            if (r8 == 0) goto L_0x00e8
            r8.close()     // Catch:{ IOException -> 0x00e8 }
        L_0x00e8:
            if (r0 == 0) goto L_0x00ed
            r0.close()     // Catch:{ IOException -> 0x00ed }
        L_0x00ed:
            throw r9
        L_0x00ee:
            r0 = r8
        L_0x00ef:
            if (r8 == 0) goto L_0x00f4
            r8.close()     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            if (r0 == 0) goto L_0x00f9
            r0.close()     // Catch:{ IOException -> 0x00f9 }
        L_0x00f9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawx.zzv(java.io.File, java.lang.String):boolean");
    }

    private static final void zzw(File file) {
        if (!file.exists()) {
            Log.d(zzc, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
        } else {
            file.delete();
        }
    }

    private static final void zzx(String str) {
        zzw(new File(str));
    }

    public final int zza() {
        return this.zzn != null ? zzavo.zzd() : IntCompanionObject.MIN_VALUE;
    }

    public final Context zzb() {
        return this.zza;
    }

    public final zzatq zzc() {
        zzavx zzavx = this.zzm;
        if (zzavx == null) {
            return this.zzk;
        }
        if (zzavx.zza() == null || !zzavx.zza().isDone()) {
            return zzatq.zzc();
        }
        try {
            return (zzatq) this.zzm.zza().get();
        } catch (InterruptedException | ExecutionException unused) {
            return zzatq.zzc();
        }
    }

    public final zzavo zzd() {
        return this.zzn;
    }

    public final zzawc zze() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final zzawq zzf() {
        return this.zzq;
    }

    public final DexClassLoader zzh() {
        return this.zze;
    }

    public final Method zzi(String str, String str2) {
        zzayj zzayj = (zzayj) this.zzo.get(new Pair(str, str2));
        if (zzayj == null) {
            return null;
        }
        return zzayj.zza();
    }

    public final ExecutorService zzj() {
        return this.zzd;
    }

    public final Future zzk() {
        zzavx zzavx = this.zzm;
        return zzavx != null ? zzavx.zza() : this.zzl;
    }

    /* access modifiers changed from: package-private */
    public final void zzn(int i, boolean z) {
        if (this.zzb) {
            Future<?> submit = this.zzd.submit(new zzawv(this, i, true));
            if (i == 0) {
                this.zzl = submit;
            }
        }
    }

    public final boolean zzo() {
        return this.zzb;
    }

    public final boolean zzp() {
        return this.zzp;
    }

    public final boolean zzq() {
        return this.zzq.zza();
    }

    public final boolean zzr(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        Map map = this.zzo;
        if (map.containsKey(pair)) {
            return false;
        }
        map.put(pair, new zzayj(this, str, str2, clsArr));
        return true;
    }

    public final byte[] zzs() {
        return this.zzg;
    }
}
