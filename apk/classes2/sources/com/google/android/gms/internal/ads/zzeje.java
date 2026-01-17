package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeje implements zzg {
    final /* synthetic */ zzcak zza;
    final /* synthetic */ zzfcn zzb;
    final /* synthetic */ zzfca zzc;
    final /* synthetic */ zzejk zzd;
    final /* synthetic */ zzejf zze;

    zzeje(zzejf zzejf, zzcak zzcak, zzfcn zzfcn, zzfca zzfca, zzejk zzejk) {
        this.zza = zzcak;
        this.zzb = zzfcn;
        this.zzc = zzfca;
        this.zzd = zzejk;
        Objects.requireNonNull(zzejf);
        this.zze = zzejf;
    }

    public final void zza(View view) {
        this.zza.zzc(this.zze.zzd.zza(this.zzb, this.zzc, view, this.zzd));
    }

    public final void zzb() {
    }

    public final void zzc() {
    }
}
