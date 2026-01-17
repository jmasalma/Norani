package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdny;
import com.google.android.gms.internal.ads.zzgcu;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzaf implements zzgcu {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ zzdny[] zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzaf(zzau zzau, zzdny[] zzdnyArr, String str) {
        this.zza = zzau;
        this.zzb = zzdnyArr;
        this.zzc = str;
    }

    public final ListenableFuture zza(Object obj) {
        return zzau.zzx(this.zza, this.zzb, this.zzc, (zzdny) obj);
    }
}
