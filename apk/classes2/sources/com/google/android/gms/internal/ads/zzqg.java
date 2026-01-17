package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzqg {
    private final Handler zza;
    private final zzqh zzb;

    public zzqg(Handler handler, zzqh zzqh) {
        if (zzqh != null) {
            Handler handler2 = handler;
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzqh;
    }

    public static /* synthetic */ void zza(zzqg zzqg, zzid zzid) {
        String str = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zze(zzid);
    }

    public static /* synthetic */ void zzb(zzqg zzqg, String str) {
        String str2 = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zzc(str);
    }

    public static /* synthetic */ void zzc(zzqg zzqg, long j) {
        String str = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zzg(j);
    }

    public static /* synthetic */ void zzd(zzqg zzqg, zzqi zzqi) {
        String str = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zzk(zzqi);
    }

    public static /* synthetic */ void zze(zzqg zzqg, int i, long j, long j2) {
        String str = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zzl(i, j, j2);
    }

    public static /* synthetic */ void zzf(zzqg zzqg, Exception exc) {
        String str = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zzi(exc);
    }

    public static /* synthetic */ void zzg(zzqg zzqg, int i) {
        String str = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zzh(i);
    }

    public static /* synthetic */ void zzh(zzqg zzqg, Exception exc) {
        String str = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zza(exc);
    }

    public static /* synthetic */ void zzi(zzqg zzqg, zzz zzz, zzie zzie) {
        String str = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zzf(zzz, zzie);
    }

    public static /* synthetic */ void zzj(zzqg zzqg, boolean z) {
        String str = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zzo(z);
    }

    public static /* synthetic */ void zzk(zzqg zzqg, zzqi zzqi) {
        String str = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zzj(zzqi);
    }

    public static /* synthetic */ void zzl(zzqg zzqg, String str, long j, long j2) {
        String str2 = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zzb(str, j, j2);
    }

    public static /* synthetic */ void zzm(zzqg zzqg, zzid zzid) {
        zzid.zza();
        String str = zzex.zza;
        zzqh zzqh = zzqg.zzb;
        zzqh zzqh2 = zzqh;
        zzqh.zzd(zzid);
    }

    public final void zzn(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqa(this, exc));
        }
    }

    public final void zzo(int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpu(this, i));
        }
    }

    public final void zzp(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqb(this, exc));
        }
    }

    public final void zzq(zzqi zzqi) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpy(this, zzqi));
        }
    }

    public final void zzr(zzqi zzqi) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpz(this, zzqi));
        }
    }

    public final void zzs(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqe(this, str, j, j2));
        }
    }

    public final void zzt(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqf(this, str));
        }
    }

    public final void zzu(zzid zzid) {
        zzid.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpv(this, zzid));
        }
    }

    public final void zzv(zzid zzid) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpt(this, zzid));
        }
    }

    public final void zzw(zzz zzz, zzie zzie) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqc(this, zzz, zzie));
        }
    }

    public final void zzx(long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpw(this, j));
        }
    }

    public final void zzy(boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqd(this, z));
        }
    }

    public final void zzz(int i, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpx(this, i, j, j2));
        }
    }
}
