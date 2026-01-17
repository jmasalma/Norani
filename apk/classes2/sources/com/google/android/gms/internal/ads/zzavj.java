package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzavj implements zzfpj {
    final /* synthetic */ zzfoi zza;

    zzavj(zzfoi zzfoi) {
        this.zza = zzfoi;
    }

    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
