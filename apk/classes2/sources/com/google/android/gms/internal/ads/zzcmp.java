package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcmp implements zzgdj {
    final /* synthetic */ zzfjy zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzv zzc;
    final /* synthetic */ zzcmq zzd;

    zzcmp(zzcmq zzcmq, zzfjy zzfjy, String str, zzv zzv) {
        this.zza = zzfjy;
        this.zzb = str;
        this.zzc = zzv;
        Objects.requireNonNull(zzcmq);
        this.zzd = zzcmq;
    }

    public final void zza(Throwable th) {
        this.zzd.zzg.zza(new zzcmn(this, th, this.zza, this.zzb, this.zzc));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzg.zza(new zzcmo(this.zza, (String) obj, this.zzc));
    }
}
