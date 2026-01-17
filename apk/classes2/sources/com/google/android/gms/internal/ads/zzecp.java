package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzecp implements Runnable {
    public final /* synthetic */ zzfll zza;
    public final /* synthetic */ View zzb;

    public /* synthetic */ zzecp(zzfll zzfll, View view) {
        this.zza = zzfll;
        this.zzb = view;
    }

    public final void run() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfz)).booleanValue() && zzflj.zzb()) {
            this.zza.zzb(this.zzb, zzfls.NOT_VISIBLE, "Ad overlay");
        }
    }
}
