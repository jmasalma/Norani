package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcft {
    public static final zzcfg zza(Context context, zzchd zzchd, String str, boolean z, boolean z2, zzavu zzavu, zzbel zzbel, VersionInfoParcel versionInfoParcel, zzbdt zzbdt, zzn zzn, zza zza, zzbcc zzbcc, zzfca zzfca, zzfcd zzfcd, zzecl zzecl, zzfda zzfda, zzdsj zzdsj) throws zzcfs {
        StrictMode.ThreadPolicy threadPolicy;
        zzbde.zza(context);
        try {
            zzcfr zzcfr = new zzcfr(context, zzchd, str, z, z2, zzavu, zzbel, versionInfoParcel, (zzbdt) null, zzn, zza, zzbcc, zzfca, zzfcd, zzfda, zzdsj, zzecl);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object zza2 = zzcfr.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return (zzcfg) zza2;
        } catch (Throwable th) {
            throw new zzcfs("Webview initialization failed.", th);
        }
    }
}
