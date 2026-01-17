package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzml implements zzlb {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbb zzd = zzbb.zza;

    public zzml(zzdj zzdj) {
    }

    public final long zza() {
        long j;
        long j2 = this.zzb;
        if (!this.zza) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzbb zzbb = this.zzd;
        if (zzbb.zzb == 1.0f) {
            j = zzex.zzs(elapsedRealtime);
        } else {
            j = zzbb.zza(elapsedRealtime);
        }
        return j2 + j;
    }

    public final void zzb(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    public final zzbb zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if (!this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
            this.zza = true;
        }
    }

    public final void zze() {
        if (this.zza) {
            zzb(zza());
            this.zza = false;
        }
    }

    public final void zzg(zzbb zzbb) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbb;
    }

    public final /* synthetic */ boolean zzj() {
        return false;
    }
}
