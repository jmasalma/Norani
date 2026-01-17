package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzfhj;
import com.google.android.gms.internal.ads.zzfhx;
import com.google.android.gms.internal.ads.zzgcu;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzd implements zzgcu {
    public final /* synthetic */ zzf zza;
    public final /* synthetic */ Long zzb;
    public final /* synthetic */ zzdsj zzc;
    public final /* synthetic */ zzfhj zzd;
    public final /* synthetic */ zzfhx zze;

    public /* synthetic */ zzd(zzf zzf, Long l, zzdsj zzdsj, zzfhj zzfhj, zzfhx zzfhx) {
        this.zza = zzf;
        this.zzb = l;
        this.zzc = zzdsj;
        this.zzd = zzfhj;
        this.zze = zzfhx;
    }

    public final ListenableFuture zza(Object obj) {
        return zzf.zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze, (JSONObject) obj);
    }
}
