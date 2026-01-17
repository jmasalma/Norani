package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfds {
    private static zzfds zza;
    private final Context zzb;
    private final zzcy zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfds(Context context, zzcy zzcy) {
        this.zzb = context;
        this.zzc = zzcy;
    }

    static zzcy zza(Context context) {
        try {
            return zzcx.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            int i = zze.zza;
            zzo.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfds zzd(Context context) {
        synchronized (zzfds.class) {
            zzfds zzfds = zza;
            if (zzfds != null) {
                return zzfds;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbff.zzb.zze()).longValue();
            zzcy zzcy = null;
            if (longValue > 0 && longValue <= 252530000) {
                zzcy = zza(applicationContext);
            }
            zzfds zzfds2 = new zzfds(applicationContext, zzcy);
            zza = zzfds2;
            return zzfds2;
        }
    }

    private final zzfd zzg() {
        zzcy zzcy = this.zzc;
        if (zzcy != null) {
            try {
                return zzcy.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbpq zzb() {
        return (zzbpq) this.zzd.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0021, code lost:
        r5 = zzg();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc(int r3, boolean r4, int r5) {
        /*
            r2 = this;
            com.google.android.gms.ads.internal.zzv.zzr()
            android.content.Context r3 = r2.zzb
            boolean r3 = com.google.android.gms.ads.internal.util.zzs.zzF(r3)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel
            r0 = 252530000(0xf0d4d50, float:6.9667266E-30)
            r1 = 1
            r4.<init>(r0, r5, r1, r3)
            com.google.android.gms.internal.ads.zzbeo r5 = com.google.android.gms.internal.ads.zzbff.zzc
            java.lang.Object r5 = r5.zze()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0021
            goto L_0x0030
        L_0x0021:
            com.google.android.gms.ads.internal.client.zzfd r5 = r2.zzg()
            if (r5 == 0) goto L_0x0030
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel
            int r5 = r5.zza()
            r4.<init>(r0, r5, r1, r3)
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfds.zzc(int, boolean, int):com.google.android.gms.ads.internal.util.client.VersionInfoParcel");
    }

    public final String zze() {
        zzfd zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(com.google.android.gms.internal.ads.zzbpq r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbff.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.client.zzcy r0 = r3.zzc
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r0 = r1
            goto L_0x0019
        L_0x0015:
            com.google.android.gms.internal.ads.zzbpq r0 = r0.getAdapterCreator()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L_0x001e
            r4 = r0
        L_0x001e:
            com.google.android.gms.internal.ads.zzfdr.zza(r2, r1, r4)
            return
        L_0x0022:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfdr.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfds.zzf(com.google.android.gms.internal.ads.zzbpq):void");
    }
}
