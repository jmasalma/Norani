package com.google.android.gms.ads.internal.client;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final /* synthetic */ class zzel implements Runnable {
    public final /* synthetic */ zzen zza;
    public final /* synthetic */ IObjectWrapper zzb;

    public /* synthetic */ zzel(zzen zzen, IObjectWrapper iObjectWrapper) {
        this.zza = zzen;
        this.zzb = iObjectWrapper;
    }

    public final void run() {
        this.zza.zzm.addView((View) ObjectWrapper.unwrap(this.zzb));
    }
}
