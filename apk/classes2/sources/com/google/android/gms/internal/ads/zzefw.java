package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzefw implements Callable {
    public final /* synthetic */ zzegb zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ ListenableFuture zzc;
    public final /* synthetic */ zzfcn zzd;
    public final /* synthetic */ zzfca zze;
    public final /* synthetic */ JSONObject zzf;
    public final /* synthetic */ zzb zzg;
    public final /* synthetic */ zzbya zzh;

    public /* synthetic */ zzefw(zzegb zzegb, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfcn zzfcn, zzfca zzfca, JSONObject jSONObject, zzb zzb2, zzbya zzbya) {
        this.zza = zzegb;
        this.zzb = listenableFuture;
        this.zzc = listenableFuture2;
        this.zzd = zzfcn;
        this.zze = zzfca;
        this.zzf = jSONObject;
        this.zzg = zzb2;
        this.zzh = zzbya;
    }

    public final Object call() {
        return zzegb.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
