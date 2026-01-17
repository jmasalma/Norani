package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzzj {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzzk zzzk) {
        zzc(zzzk);
        this.zza.add(new zzzi(handler, zzzk));
    }

    public final void zzb(int i, long j, long j2) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzzi zzzi = (zzzi) it.next();
            if (!zzzi.zzc) {
                zzzi.zza.post(new zzzh(zzzi, i, j, j2));
            }
        }
    }

    public final void zzc(zzzk zzzk) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zza;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzzi zzzi = (zzzi) it.next();
            if (zzzi.zzb == zzzk) {
                zzzi.zzc();
                copyOnWriteArrayList.remove(zzzi);
            }
        }
    }
}
