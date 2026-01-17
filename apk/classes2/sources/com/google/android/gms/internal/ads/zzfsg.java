package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfsg {
    private static zzfsg zzb;
    final zzfsc zza;

    private zzfsg(Context context) {
        this.zza = zzfsc.zzb(context);
        zzfsb.zza(context);
    }

    public static final zzfsg zza(Context context) {
        zzfsg zzfsg;
        synchronized (zzfsg.class) {
            if (zzb == null) {
                zzb = new zzfsg(context);
            }
            zzfsg = zzb;
        }
        return zzfsg;
    }

    public final void zzb(zzfsa zzfsa) throws IOException {
        synchronized (zzfsg.class) {
            zzfsc zzfsc = this.zza;
            zzfsc.zze("vendor_scoped_gpid_v2_id");
            zzfsc.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
