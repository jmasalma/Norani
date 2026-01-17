package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbxr implements Runnable {
    public final /* synthetic */ zzbxv zza;
    public final /* synthetic */ Bitmap zzb;

    public /* synthetic */ zzbxr(zzbxv zzbxv, Bitmap bitmap) {
        this.zza = zzbxv;
        this.zzb = bitmap;
    }

    public final void run() {
        zzbxv.zzd(this.zza, this.zzb);
    }
}
