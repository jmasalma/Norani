package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzecv implements Runnable {
    public final /* synthetic */ zzflw zza;
    public final /* synthetic */ View zzb;

    public /* synthetic */ zzecv(zzflw zzflw, View view) {
        this.zza = zzflw;
        this.zzb = view;
    }

    public final void run() {
        this.zza.zzf(this.zzb, zzfls.NOT_VISIBLE, "Ad overlay");
    }
}
