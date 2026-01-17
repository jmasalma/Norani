package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdkk implements zzbkf {
    public final /* synthetic */ zzdkp zza;
    public final /* synthetic */ WindowManager zzb;
    public final /* synthetic */ View zzc;

    public /* synthetic */ zzdkk(zzdkp zzdkp, WindowManager windowManager, View view) {
        this.zza = zzdkp;
        this.zzb = windowManager;
        this.zzc = view;
    }

    public final void zza(Object obj, Map map) {
        zzdkp.zzb(this.zza, this.zzb, this.zzc, (zzcfg) obj, map);
    }
}
