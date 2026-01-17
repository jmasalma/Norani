package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdll implements Callable {
    public final /* synthetic */ zzdln zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ ListenableFuture zzc;
    public final /* synthetic */ ListenableFuture zzd;
    public final /* synthetic */ ListenableFuture zze;
    public final /* synthetic */ ListenableFuture zzf;
    public final /* synthetic */ JSONObject zzg;
    public final /* synthetic */ ListenableFuture zzh;
    public final /* synthetic */ ListenableFuture zzi;
    public final /* synthetic */ ListenableFuture zzj;
    public final /* synthetic */ ListenableFuture zzk;
    public final /* synthetic */ ListenableFuture zzl;

    public /* synthetic */ zzdll(zzdln zzdln, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) {
        this.zza = zzdln;
        this.zzb = listenableFuture;
        this.zzc = listenableFuture2;
        this.zzd = listenableFuture3;
        this.zze = listenableFuture4;
        this.zzf = listenableFuture5;
        this.zzg = jSONObject;
        this.zzh = listenableFuture6;
        this.zzi = listenableFuture7;
        this.zzj = listenableFuture8;
        this.zzk = listenableFuture9;
        this.zzl = listenableFuture10;
    }

    public final Object call() {
        return zzdln.zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
    }
}
