package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaaa {
    public static final zzzt zza = new zzzt(2, -9223372036854775807L, (zzzz) null);
    public static final zzzt zzb = new zzzt(3, -9223372036854775807L, (zzzz) null);
    /* access modifiers changed from: private */
    public final zzaai zzc = zzaag.zza(zzex.zzF("ExoPlayer:Loader:ProgressiveMediaPeriod"), new zzzr());
    /* access modifiers changed from: private */
    public zzzu zzd;
    /* access modifiers changed from: private */
    public IOException zze;

    public zzaaa(String str) {
    }

    public static zzzt zzb(boolean z, long j) {
        return new zzzt(z ? 1 : 0, j, (zzzz) null);
    }

    public final long zza(zzzv zzzv, zzzs zzzs, int i) {
        Looper myLooper = Looper.myLooper();
        zzdd.zzb(myLooper);
        Looper looper = myLooper;
        this.zze = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzzu(this, myLooper, zzzv, zzzs, i, elapsedRealtime).zzc(0);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzzu zzzu = this.zzd;
        zzdd.zzb(zzzu);
        zzzu zzzu2 = zzzu;
        zzzu.zza(false);
    }

    public final void zzh() {
        this.zze = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException == null) {
            zzzu zzzu = this.zzd;
            if (zzzu != null) {
                zzzu.zzb(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzj(zzzw zzzw) {
        zzzu zzzu = this.zzd;
        if (zzzu != null) {
            zzzu.zza(true);
        }
        zzaai zzaai = this.zzc;
        zzaai.execute(new zzzx(zzzw));
        zzaai.zza();
    }

    public final boolean zzk() {
        return this.zze != null;
    }

    public final boolean zzl() {
        return this.zzd != null;
    }
}
