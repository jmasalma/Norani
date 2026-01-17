package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzdff {
    private final zzdgn zza;
    private final zzcfg zzb;

    public zzdff(zzdgn zzdgn, zzcfg zzcfg) {
        this.zza = zzdgn;
        this.zzb = zzcfg;
    }

    public final View zza() {
        zzcfg zzcfg = this.zzb;
        if (zzcfg == null) {
            return null;
        }
        return zzcfg.zzG();
    }

    public final View zzb() {
        zzcfg zzcfg = this.zzb;
        if (zzcfg != null) {
            return zzcfg.zzG();
        }
        return null;
    }

    public final zzcfg zzc() {
        return this.zzb;
    }

    public final zzddv zzd(Executor executor) {
        return new zzddv(new zzdfe(this.zzb), executor);
    }

    public final zzdgn zze() {
        return this.zza;
    }

    public Set zzf(zzcur zzcur) {
        return Collections.singleton(new zzddv(zzcur, zzcaf.zzg));
    }

    public Set zzg(zzcur zzcur) {
        return Collections.singleton(new zzddv(zzcur, zzcaf.zzg));
    }
}
