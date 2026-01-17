package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzes implements zzdt {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzes(Handler handler) {
        this.zzb = handler;
    }

    static /* bridge */ /* synthetic */ void zzm(zzeq zzeq) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzeq);
            }
        }
    }

    private static zzeq zzn() {
        zzeq zzeq;
        List list = zza;
        synchronized (list) {
            if (list.isEmpty()) {
                zzeq = new zzeq((zzer) null);
            } else {
                zzeq = (zzeq) list.remove(list.size() - 1);
            }
        }
        return zzeq;
    }

    public final Looper zza() {
        return this.zzb.getLooper();
    }

    public final zzds zzb(int i) {
        Handler handler = this.zzb;
        zzeq zzn = zzn();
        zzn.zzb(handler.obtainMessage(i), this);
        return zzn;
    }

    public final zzds zzc(int i, Object obj) {
        Handler handler = this.zzb;
        zzeq zzn = zzn();
        zzn.zzb(handler.obtainMessage(i, obj), this);
        return zzn;
    }

    public final zzds zzd(int i, int i2, int i3) {
        Handler handler = this.zzb;
        zzeq zzn = zzn();
        zzn.zzb(handler.obtainMessage(i, i2, i3), this);
        return zzn;
    }

    public final zzds zze(int i, int i2, int i3, Object obj) {
        Handler handler = this.zzb;
        zzeq zzn = zzn();
        zzn.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzn;
    }

    public final void zzf(Object obj) {
        this.zzb.removeCallbacksAndMessages((Object) null);
    }

    public final void zzg(int i) {
        this.zzb.removeMessages(i);
    }

    public final boolean zzh(int i) {
        return this.zzb.hasMessages(1);
    }

    public final boolean zzi(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    public final boolean zzj(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    public final boolean zzk(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    public final boolean zzl(zzds zzds) {
        return ((zzeq) zzds).zzc(this.zzb);
    }
}
