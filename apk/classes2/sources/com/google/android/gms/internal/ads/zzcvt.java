package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcvt {
    public static final zzbya zza(Context context, VersionInfoParcel versionInfoParcel, zzfca zzfca, zzbxw zzbxw) {
        String str;
        zzbxx zzbxx = zzfca.zzA;
        if (zzbxx == null) {
            return null;
        }
        zzfcf zzfcf = zzfca.zzs;
        if (zzfcf == null) {
            str = null;
        } else {
            str = zzfcf.zzb;
        }
        return new zzbxv(context, versionInfoParcel, zzbxx, str, zzbxw);
    }
}
