package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeiz implements zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcvw zzb;
    private final zzcwq zzc;
    private final zzdef zzd;
    private final zzddx zze;
    private final zzcnn zzf;

    zzeiz(zzcvw zzcvw, zzcwq zzcwq, zzdef zzdef, zzddx zzddx, zzcnn zzcnn) {
        this.zzb = zzcvw;
        this.zzc = zzcwq;
        this.zzd = zzdef;
        this.zze = zzddx;
        this.zzf = zzcnn;
    }

    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzt();
            this.zze.zza(view);
        }
    }

    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
