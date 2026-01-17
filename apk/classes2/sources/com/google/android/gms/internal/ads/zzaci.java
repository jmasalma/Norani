package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaci {
    private final Handler zza;
    private final zzacj zzb;

    public zzaci(Handler handler, zzacj zzacj) {
        if (zzacj != null) {
            handler.getClass();
            Handler handler2 = handler;
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzacj;
    }

    public static /* synthetic */ void zza(zzaci zzaci, Exception exc) {
        String str = zzex.zza;
        zzacj zzacj = zzaci.zzb;
        zzacj zzacj2 = zzacj;
        zzacj.zzp(exc);
    }

    public static /* synthetic */ void zzb(zzaci zzaci, String str) {
        String str2 = zzex.zza;
        zzacj zzacj = zzaci.zzb;
        zzacj zzacj2 = zzacj;
        zzacj.zzr(str);
    }

    public static /* synthetic */ void zzc(zzaci zzaci, long j, int i) {
        String str = zzex.zza;
        zzacj zzacj = zzaci.zzb;
        zzacj zzacj2 = zzacj;
        zzacj.zzu(j, i);
    }

    public static /* synthetic */ void zzd(zzaci zzaci, int i, long j) {
        String str = zzex.zza;
        zzacj zzacj = zzaci.zzb;
        zzacj zzacj2 = zzacj;
        zzacj.zzm(i, j);
    }

    public static /* synthetic */ void zze(zzaci zzaci, zzcd zzcd) {
        String str = zzex.zza;
        zzacj zzacj = zzaci.zzb;
        zzacj zzacj2 = zzacj;
        zzacj.zzw(zzcd);
    }

    public static /* synthetic */ void zzf(zzaci zzaci, zzid zzid) {
        zzid.zza();
        String str = zzex.zza;
        zzacj zzacj = zzaci.zzb;
        zzacj zzacj2 = zzacj;
        zzacj.zzs(zzid);
    }

    public static /* synthetic */ void zzg(zzaci zzaci, zzz zzz, zzie zzie) {
        String str = zzex.zza;
        zzacj zzacj = zzaci.zzb;
        zzacj zzacj2 = zzacj;
        zzacj.zzv(zzz, zzie);
    }

    public static /* synthetic */ void zzh(zzaci zzaci, Object obj, long j) {
        String str = zzex.zza;
        zzacj zzacj = zzaci.zzb;
        zzacj zzacj2 = zzacj;
        zzacj.zzn(obj, j);
    }

    public static /* synthetic */ void zzi(zzaci zzaci, zzid zzid) {
        String str = zzex.zza;
        zzacj zzacj = zzaci.zzb;
        zzacj zzacj2 = zzacj;
        zzacj.zzt(zzid);
    }

    public static /* synthetic */ void zzj(zzaci zzaci, String str, long j, long j2) {
        String str2 = zzex.zza;
        zzacj zzacj = zzaci.zzb;
        zzacj zzacj2 = zzacj;
        zzacj.zzq(str, j, j2);
    }

    public final void zzk(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaby(this, str, j, j2));
        }
    }

    public final void zzl(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzach(this, str));
        }
    }

    public final void zzm(zzid zzid) {
        zzid.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzacg(this, zzid));
        }
    }

    public final void zzn(int i, long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaca(this, i, j));
        }
    }

    public final void zzo(zzid zzid) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzace(this, zzid));
        }
    }

    public final void zzp(zzz zzz, zzie zzie) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzacf(this, zzz, zzie));
        }
    }

    public final void zzq(Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzacb(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    public final void zzr(long j, int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzacc(this, j, i));
        }
    }

    public final void zzs(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzacd(this, exc));
        }
    }

    public final void zzt(zzcd zzcd) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzabz(this, zzcd));
        }
    }
}
