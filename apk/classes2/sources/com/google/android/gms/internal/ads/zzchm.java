package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzchm implements zzhgr {
    private final zzchh zza;

    private zzchm(zzchh zzchh) {
        this.zza = zzchh;
    }

    public static zzchm zza(zzchh zzchh) {
        return new zzchm(zzchh);
    }

    public static WeakReference zzd(zzchh zzchh) {
        WeakReference zzg = zzchh.zzg();
        zzhgz.zzb(zzg);
        WeakReference weakReference = zzg;
        return zzg;
    }

    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public final WeakReference zzc() {
        return zzd(this.zza);
    }
}
