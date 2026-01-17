package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzel {
    private static zzel zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;
    private boolean zzf;

    private zzel(Context context) {
        Executor zza2 = zzde.zza();
        this.zzb = zza2;
        zza2.execute(new zzee(this, context));
    }

    public static synchronized zzel zzb(Context context) {
        zzel zzel;
        synchronized (zzel.class) {
            if (zza == null) {
                zza = new zzel(context);
            }
            zzel = zza;
        }
        return zzel;
    }

    static /* synthetic */ void zzd(zzel zzel, Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (!(type == 4 || type == 5)) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            break;
                        case 18:
                            break;
                        case 20:
                            if (Build.VERSION.SDK_INT >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                        default:
                            i = 6;
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i != 5) {
            zzel.zzh(i);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                TelephonyManager telephonyManager2 = telephonyManager;
                zzef zzef = new zzef(zzel);
                telephonyManager.registerTelephonyCallback(zzel.zzb, zzef);
                telephonyManager.unregisterTelephonyCallback(zzef);
                return;
            }
            throw null;
        } catch (RuntimeException unused2) {
            zzel.zzh(5);
        }
    }

    private final void zzg() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzeh zzeh = (zzeh) it.next();
            if (zzeh.zzc()) {
                copyOnWriteArrayList.remove(zzeh);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r3.hasNext() == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        ((com.google.android.gms.internal.ads.zzeh) r3.next()).zzb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh(int r3) {
        /*
            r2 = this;
            r2.zzg()
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            boolean r1 = r2.zzf     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0010
            int r1 = r2.zze     // Catch:{ all -> 0x002d }
            if (r1 != r3) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0010:
            r1 = 1
            r2.zzf = r1     // Catch:{ all -> 0x002d }
            r2.zze = r3     // Catch:{ all -> 0x002d }
            java.util.concurrent.CopyOnWriteArrayList r3 = r2.zzc     // Catch:{ all -> 0x002d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r3.next()
            com.google.android.gms.internal.ads.zzeh r0 = (com.google.android.gms.internal.ads.zzeh) r0
            r0.zzb()
            goto L_0x001c
        L_0x002c:
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzel.zzh(int):void");
    }

    public final int zza() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    public final void zzf(zzzn zzzn, Executor executor) {
        boolean z;
        zzg();
        zzeh zzeh = new zzeh(this, zzzn, executor);
        synchronized (this.zzd) {
            this.zzc.add(zzeh);
            z = this.zzf;
        }
        if (z) {
            zzeh.zzb();
        }
    }
}
