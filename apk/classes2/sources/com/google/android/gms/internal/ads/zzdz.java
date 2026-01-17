package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdz {
    private final zzdj zza;
    private final zzdt zzb;
    private final zzdx zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzdz(Looper looper, zzdj zzdj, zzdx zzdx) {
        this(new CopyOnWriteArraySet(), looper, zzdj, zzdx, true);
    }

    public static /* synthetic */ boolean zzg(zzdz zzdz, Message message) {
        Iterator it = zzdz.zzd.iterator();
        while (it.hasNext()) {
            ((zzdy) it.next()).zzb(zzdz.zzc);
            if (zzdz.zzb.zzh(1)) {
                break;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzdd.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzdz zza(Looper looper, zzdx zzdx) {
        return new zzdz(this.zzd, looper, this.zza, zzdx, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (!this.zzh) {
                this.zzd.add(new zzdy(obj));
            }
        }
    }

    public final void zzc() {
        zzh();
        ArrayDeque arrayDeque = this.zzf;
        if (!arrayDeque.isEmpty()) {
            zzdt zzdt = this.zzb;
            if (!zzdt.zzh(1)) {
                zzdt.zzl(zzdt.zzb(1));
            }
            ArrayDeque arrayDeque2 = this.zze;
            boolean isEmpty = true ^ arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (!isEmpty) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void zzd(int i, zzdw zzdw) {
        zzh();
        this.zzf.add(new zzdv(new CopyOnWriteArraySet(this.zzd), i, zzdw));
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzdy) it.next()).zzc(this.zzc);
        }
        copyOnWriteArraySet.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            zzdy zzdy = (zzdy) it.next();
            if (zzdy.zza.equals(obj)) {
                zzdy.zzc(this.zzc);
                copyOnWriteArraySet.remove(zzdy);
            }
        }
    }

    private zzdz(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdj zzdj, zzdx zzdx, boolean z) {
        this.zza = zzdj;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdx;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdj.zzd(looper, new zzdu(this));
        this.zzi = z;
    }
}
