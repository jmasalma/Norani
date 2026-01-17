package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeud implements Runnable {
    public final /* synthetic */ zzeuf zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzeuc zzc;
    public final /* synthetic */ Bundle zzd;

    public /* synthetic */ zzeud(zzeuf zzeuf, long j, zzeuc zzeuc, Bundle bundle) {
        this.zza = zzeuf;
        this.zzb = j;
        this.zzc = zzeuc;
        this.zzd = bundle;
    }

    public final void run() {
        zzeuf.zzb(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
