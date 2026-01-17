package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfhg implements zzddi, zzcwo, zzddm {
    private final zzfhu zza;
    private final zzfhj zzb;

    zzfhg(Context context, zzfhu zzfhu) {
        this.zza = zzfhu;
        this.zzb = zzfhi.zza(context, 13);
    }

    public final void zza() {
    }

    public final void zzb() {
        if (((Boolean) zzbex.zzd.zze()).booleanValue()) {
            zzfhu zzfhu = this.zza;
            zzfhj zzfhj = this.zzb;
            zzfhj.zzg(true);
            zzfhu.zza(zzfhj);
        }
    }

    public final void zzi() {
    }

    public final void zzj() {
        if (((Boolean) zzbex.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    public final void zzs(zze zze) {
        if (((Boolean) zzbex.zzd.zze()).booleanValue()) {
            zzfhu zzfhu = this.zza;
            zzfhj zzfhj = this.zzb;
            zzfhj.zzc(zze.zza().toString());
            zzfhj.zzg(false);
            zzfhu.zza(zzfhj);
        }
    }
}
