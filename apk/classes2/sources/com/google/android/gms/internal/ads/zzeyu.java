package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeyu implements zzgcu {
    public final /* synthetic */ zzeyx zza;
    public final /* synthetic */ zzezs zzb;
    public final /* synthetic */ zzeyw zzc;
    public final /* synthetic */ zzezq zzd;
    public final /* synthetic */ zzcve zze;

    public /* synthetic */ zzeyu(zzeyx zzeyx, zzezs zzezs, zzeyw zzeyw, zzezq zzezq, zzcve zzcve) {
        this.zza = zzeyx;
        this.zzb = zzezs;
        this.zzc = zzeyw;
        this.zzd = zzezq;
        this.zze = zzcve;
    }

    public final ListenableFuture zza(Object obj) {
        return zzeyx.zzb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, (zzezc) obj);
    }
}
