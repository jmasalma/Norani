package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzrj implements zzqr {
    final /* synthetic */ zzro zza;

    /* synthetic */ zzrj(zzro zzro, zzrn zzrn) {
        Objects.requireNonNull(zzro);
        this.zza = zzro;
    }

    public final void zza(long j) {
        zzea.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
    }

    public final void zzb(long j) {
        zzro zzro = this.zza;
        if (zzro.zzq != null) {
            ((zzrs) zzro.zzq).zza.zzc.zzx(j);
        }
    }

    public final void zzc(long j, long j2, long j3, long j4) {
        zzro zzro = this.zza;
        long zzD = zzro.zzN();
        long zzE = zzro.zzO();
        zzea.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + zzD + ", " + zzE);
    }

    public final void zzd(long j, long j2, long j3, long j4) {
        zzro zzro = this.zza;
        long zzD = zzro.zzN();
        long zzE = zzro.zzO();
        zzea.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + zzD + ", " + zzE);
    }

    public final void zze(int i, long j) {
        zzro zzro = this.zza;
        if (zzro.zzq != null) {
            ((zzrs) zzro.zzq).zza.zzc.zzz(i, j, SystemClock.elapsedRealtime() - zzro.zzW);
        }
    }
}
