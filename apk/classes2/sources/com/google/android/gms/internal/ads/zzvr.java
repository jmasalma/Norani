package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzvr {
    public final int zza;
    public final zzvh zzb;
    private final CopyOnWriteArrayList zzc;

    public zzvr() {
        this(new CopyOnWriteArrayList(), 0, (zzvh) null);
    }

    private zzvr(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzvh zzvh) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzvh;
    }

    public final zzvr zza(int i, zzvh zzvh) {
        return new zzvr(this.zzc, 0, zzvh);
    }

    public final void zzb(Handler handler, zzvs zzvs) {
        this.zzc.add(new zzvq(handler, zzvs));
    }

    public final void zzc(zzdn zzdn) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvq zzvq = (zzvq) it.next();
            zzex.zzP(zzvq.zza, new zzvp(zzdn, zzvq.zzb));
        }
    }

    public final void zzd(zzvd zzvd) {
        zzc(new zzvk(this, zzvd));
    }

    public final void zze(zzuy zzuy, zzvd zzvd) {
        zzc(new zzvo(this, zzuy, zzvd));
    }

    public final void zzf(zzuy zzuy, zzvd zzvd) {
        zzc(new zzvm(this, zzuy, zzvd));
    }

    public final void zzg(zzuy zzuy, zzvd zzvd, IOException iOException, boolean z) {
        zzc(new zzvn(this, zzuy, zzvd, iOException, z));
    }

    public final void zzh(zzuy zzuy, zzvd zzvd, int i) {
        zzc(new zzvl(this, zzuy, zzvd, i));
    }

    public final void zzi(zzvs zzvs) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzvq zzvq = (zzvq) it.next();
            if (zzvq.zzb == zzvs) {
                copyOnWriteArrayList.remove(zzvq);
            }
        }
    }
}
