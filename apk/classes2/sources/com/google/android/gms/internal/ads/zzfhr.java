package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfhr implements zzgdj {
    final /* synthetic */ zzfhu zza;
    final /* synthetic */ zzfhj zzb;
    final /* synthetic */ boolean zzc;

    zzfhr(zzfhu zzfhu, zzfhj zzfhj, boolean z) {
        this.zza = zzfhu;
        this.zzb = zzfhj;
        this.zzc = z;
    }

    public final void zza(Throwable th) {
        zzfhj zzfhj = this.zzb;
        if (zzfhj.zzk()) {
            zzfhu zzfhu = this.zza;
            zzfhj.zzh(th);
            zzfhj.zzg(false);
            zzfhu.zza(zzfhj);
            if (this.zzc) {
                zzfhu.zzh();
            }
        }
    }

    public final void zzb(Object obj) {
        zzfhj zzfhj = this.zzb;
        zzfhj.zzg(true);
        zzfhu zzfhu = this.zza;
        zzfhu.zza(zzfhj);
        if (this.zzc) {
            zzfhu.zzh();
        }
    }
}
