package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzfll {
    public static zzfll zza(zzflm zzflm, zzfln zzfln) {
        zzfni.zza();
        return new zzflp(zzflm, zzfln, UUID.randomUUID().toString());
    }

    public abstract void zzb(View view, zzfls zzfls, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
