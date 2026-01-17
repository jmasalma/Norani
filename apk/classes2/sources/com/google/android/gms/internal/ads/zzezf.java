package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzezf {
    public static void zza(AtomicReference atomicReference, zzeze zzeze) {
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                zzeze.zza(obj);
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = zze.zza;
                zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }
}
