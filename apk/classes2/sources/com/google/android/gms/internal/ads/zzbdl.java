package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbdl {
    public static boolean zza(zzbdt zzbdt, zzbdq zzbdq, String... strArr) {
        if (zzbdq == null) {
            return false;
        }
        zzbdt.zze(zzbdq, zzv.zzD().elapsedRealtime(), strArr);
        return true;
    }
}
