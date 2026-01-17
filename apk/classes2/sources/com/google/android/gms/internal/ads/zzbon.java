package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbon {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbow zzc;
    private zzbow zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbow zza(Context context, VersionInfoParcel versionInfoParcel, zzfhx zzfhx) {
        zzbow zzbow;
        String str;
        synchronized (this.zza) {
            if (this.zzc == null) {
                if (((Boolean) zzbfk.zzf.zze()).booleanValue()) {
                    str = (String) zzbd.zzc().zzb(zzbde.zza);
                } else {
                    str = (String) zzbd.zzc().zzb(zzbde.zzb);
                }
                this.zzc = new zzbow(zzc(context), versionInfoParcel, str, zzfhx);
            }
            zzbow = this.zzc;
        }
        return zzbow;
    }

    public final zzbow zzb(Context context, VersionInfoParcel versionInfoParcel, zzfhx zzfhx) {
        zzbow zzbow;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbow(zzc(context), versionInfoParcel, (String) zzbfo.zza.zze(), zzfhx);
            }
            zzbow = this.zzd;
        }
        return zzbow;
    }
}
