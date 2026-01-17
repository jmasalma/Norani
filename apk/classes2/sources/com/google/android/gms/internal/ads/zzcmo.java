package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcmo implements Runnable {
    public final /* synthetic */ zzfjy zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzv zzc;

    public /* synthetic */ zzcmo(zzfjy zzfjy, String str, zzv zzv) {
        this.zza = zzfjy;
        this.zzb = str;
        this.zzc = zzv;
    }

    public final void run() {
        this.zza.zzd(this.zzb, this.zzc, (zzfhu) null, (zzcyi) null);
    }
}
