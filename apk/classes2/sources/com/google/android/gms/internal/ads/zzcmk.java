package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcmk implements zzgcu {
    public final /* synthetic */ zzcmq zza;
    public final /* synthetic */ Uri.Builder zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ InputEvent zzd;

    public /* synthetic */ zzcmk(zzcmq zzcmq, Uri.Builder builder, String str, InputEvent inputEvent) {
        this.zza = zzcmq;
        this.zzb = builder;
        this.zzc = str;
        this.zzd = inputEvent;
    }

    public final ListenableFuture zza(Object obj) {
        return zzcmq.zzb(this.zza, this.zzb, this.zzc, this.zzd, (Integer) obj);
    }
}
