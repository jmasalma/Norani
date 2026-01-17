package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzejq {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdpz zzb;

    public zzejq(zzdpz zzdpz) {
        this.zzb = zzdpz;
    }

    @CheckForNull
    public final zzbrp zza(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbrp) concurrentHashMap.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            zze.zzb("Couldn't create RTB adapter : ", e);
        }
    }
}
