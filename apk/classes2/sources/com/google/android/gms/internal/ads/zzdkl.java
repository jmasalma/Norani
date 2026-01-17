package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdkl implements zzbkf {
    public final /* synthetic */ zzdkp zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ WindowManager zzc;

    public /* synthetic */ zzdkl(zzdkp zzdkp, View view, WindowManager windowManager) {
        this.zza = zzdkp;
        this.zzb = view;
        this.zzc = windowManager;
    }

    public final void zza(Object obj, Map map) {
        zzdkp.zzc(this.zza, this.zzb, this.zzc, (zzcfg) obj, map);
    }
}
