package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdii implements Runnable {
    public final /* synthetic */ zzdio zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzdii(zzdio zzdio, View view, boolean z, int i) {
        this.zza = zzdio;
        this.zzb = view;
        this.zzc = z;
        this.zzd = i;
    }

    public final void run() {
        zzdio.zzv(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
