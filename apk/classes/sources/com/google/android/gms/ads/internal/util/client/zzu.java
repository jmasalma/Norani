package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbun;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzu implements zze {
    private final Context zza;
    private final String zzb;
    private String zzc;

    public zzu(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzc(String str) throws MalformedURLException {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (URISyntaxException e) {
            zze(str, e);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zze)).booleanValue()) {
                url = zzd(str);
            }
        } catch (IllegalArgumentException | MalformedURLException e2) {
            zze(str, e2);
        }
        if (url != null) {
            return url;
        }
        zzo.zze("Falling back to direct new URL(\"" + str + "\") constructor.");
        return new URL(str);
    }

    private final URL zzd(String str) {
        URL url;
        try {
            zzo.zze("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
            try {
                String obj = uri.toString();
                zzo.zze("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"" + str + "\" -> encoded URI: " + obj);
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e) {
                e = e;
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e2) {
            e = e2;
            url = null;
            zze(str, e);
            return url;
        }
        return url;
    }

    private final void zze(String str, Throwable th) {
        String message = th.getMessage();
        zzo.zzj("Error while parsing ping URL: " + str + ". " + message);
        zzbun.zza(this.zza).zzi(th, "HttpUrlPinger.pingUrl", ((float) ((Integer) zzbd.zzc().zzb(zzbde.zznf)).intValue()) / 100.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d9, code lost:
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e3, code lost:
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e5, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e8, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Received non-success response code "
            java.lang.String r1 = "Error while pinging URL: "
            java.lang.String r2 = "Pinging URL: "
            com.google.android.gms.ads.internal.util.client.zzt r3 = com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE
            boolean r4 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            if (r4 == 0) goto L_0x0013
            r4 = 263(0x107, float:3.69E-43)
            android.net.TrafficStats.setThreadStatsTag(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
        L_0x0013:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            r4.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            r4.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            java.lang.String r2 = r4.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            com.google.android.gms.ads.internal.util.client.zzo.zze(r2)     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            java.net.URL r2 = r7.zzc(r8)     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            int r4 = com.google.android.gms.internal.ads.zzfra.zzb     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ all -> 0x00ae }
            java.lang.String r4 = r7.zzb     // Catch:{ all -> 0x00ae }
            r5 = 60000(0xea60, float:8.4078E-41)
            r2.setConnectTimeout(r5)     // Catch:{ all -> 0x00ae }
            r6 = 1
            r2.setInstanceFollowRedirects(r6)     // Catch:{ all -> 0x00ae }
            r2.setReadTimeout(r5)     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x0047
            java.lang.String r5 = "User-Agent"
            r2.setRequestProperty(r5, r4)     // Catch:{ all -> 0x00ae }
        L_0x0047:
            r4 = 0
            r2.setUseCaches(r4)     // Catch:{ all -> 0x00ae }
            com.google.android.gms.ads.internal.util.client.zzl r4 = new com.google.android.gms.ads.internal.util.client.zzl     // Catch:{ all -> 0x00ae }
            r5 = 0
            r4.<init>(r5)     // Catch:{ all -> 0x00ae }
            r4.zzc(r2, r5)     // Catch:{ all -> 0x00ae }
            int r5 = r2.getResponseCode()     // Catch:{ all -> 0x00ae }
            r4.zze(r2, r5)     // Catch:{ all -> 0x00ae }
            r4 = 200(0xc8, float:2.8E-43)
            if (r5 < r4) goto L_0x0082
            r4 = 300(0x12c, float:4.2E-43)
            if (r5 < r4) goto L_0x0064
            goto L_0x0082
        L_0x0064:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzii     // Catch:{ all -> 0x00ae }
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00ae }
            java.lang.Object r0 = r4.zzb(r0)     // Catch:{ all -> 0x00ae }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00ae }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = "X-Afma-Ad-Event-Value"
            java.lang.String r0 = r2.getHeaderField(r0)     // Catch:{ all -> 0x00ae }
            r7.zzc = r0     // Catch:{ all -> 0x00ae }
        L_0x007e:
            com.google.android.gms.ads.internal.util.client.zzt r0 = com.google.android.gms.ads.internal.util.client.zzt.SUCCESS     // Catch:{ all -> 0x00ae }
        L_0x0080:
            r3 = r0
            goto L_0x00a0
        L_0x0082:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r4.<init>(r0)     // Catch:{ all -> 0x00ae }
            r4.append(r5)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = " from pinging URL: "
            r4.append(r0)     // Catch:{ all -> 0x00ae }
            r4.append(r8)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00ae }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ all -> 0x00ae }
            r0 = 502(0x1f6, float:7.03E-43)
            if (r5 != r0) goto L_0x00a0
            com.google.android.gms.ads.internal.util.client.zzt r0 = com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE     // Catch:{ all -> 0x00ae }
            goto L_0x0080
        L_0x00a0:
            r2.disconnect()     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            boolean r8 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r8 == 0) goto L_0x00e8
            goto L_0x00e5
        L_0x00aa:
            r0 = move-exception
            goto L_0x00dc
        L_0x00ac:
            r0 = move-exception
            goto L_0x00dc
        L_0x00ae:
            r0 = move-exception
            r2.disconnect()     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x00ac, MalformedURLException -> 0x00aa, IOException -> 0x00b7, RuntimeException -> 0x00b5 }
        L_0x00b3:
            r8 = move-exception
            goto L_0x00e9
        L_0x00b5:
            r0 = move-exception
            goto L_0x00b8
        L_0x00b7:
            r0 = move-exception
        L_0x00b8:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r2.<init>(r1)     // Catch:{ all -> 0x00b3 }
            r2.append(r8)     // Catch:{ all -> 0x00b3 }
            java.lang.String r8 = ". "
            r2.append(r8)     // Catch:{ all -> 0x00b3 }
            r2.append(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r8)     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.ads.internal.util.client.zzt r3 = com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE     // Catch:{ all -> 0x00b3 }
            boolean r8 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r8 == 0) goto L_0x00e8
            goto L_0x00e5
        L_0x00dc:
            r7.zze(r8, r0)     // Catch:{ all -> 0x00b3 }
            boolean r8 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r8 == 0) goto L_0x00e8
        L_0x00e5:
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00e8:
            return r3
        L_0x00e9:
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r0 == 0) goto L_0x00f2
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00f2:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.zzu.zza(java.lang.String):com.google.android.gms.ads.internal.util.client.zzt");
    }

    public final String zzb() {
        return this.zzc;
    }
}
