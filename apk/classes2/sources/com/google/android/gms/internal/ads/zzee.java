package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzee implements Runnable {
    public final /* synthetic */ zzel zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzee(zzel zzel, Context context) {
        this.zza = zzel;
        this.zzb = context;
    }

    public final void run() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.zzb.registerReceiver(new zzej(this.zza, (zzek) null), intentFilter);
    }
}
