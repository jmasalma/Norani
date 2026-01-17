package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdjq implements Runnable {
    public final /* synthetic */ zzdjt zza;
    public final /* synthetic */ ViewGroup zzb;

    public /* synthetic */ zzdjq(zzdjt zzdjt, ViewGroup viewGroup) {
        this.zza = zzdjt;
        this.zzb = viewGroup;
    }

    public final void run() {
        zzdjt.zza(this.zza, this.zzb);
    }
}
