package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzsc {
    public final int zza;
    public final zzvh zzb;
    private final CopyOnWriteArrayList zzc;

    public zzsc() {
        this(new CopyOnWriteArrayList(), 0, (zzvh) null);
    }

    private zzsc(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzvh zzvh) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzvh;
    }

    public final zzsc zza(int i, zzvh zzvh) {
        return new zzsc(this.zzc, 0, zzvh);
    }

    public final void zzb(Handler handler, zzsd zzsd) {
        this.zzc.add(new zzsb(handler, zzsd));
    }

    public final void zzc(zzsd zzsd) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzsb zzsb = (zzsb) it.next();
            if (zzsb.zza == zzsd) {
                copyOnWriteArrayList.remove(zzsb);
            }
        }
    }
}
