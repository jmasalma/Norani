package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfsf extends zzfsd {
    private static zzfsf zzd;

    private zzfsf(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfsf zzi(Context context) {
        zzfsf zzfsf;
        synchronized (zzfsf.class) {
            if (zzd == null) {
                zzd = new zzfsf(context);
            }
            zzfsf = zzd;
        }
        return zzfsf;
    }

    public final zzfsa zzh(long j, boolean z) throws IOException {
        synchronized (zzfsf.class) {
            if (!this.zzc.zzd()) {
                zzfsa zzfsa = new zzfsa();
                return zzfsa;
            }
            zzfsa zzb = zzb((String) null, (String) null, j, z);
            return zzb;
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfsf.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }
}
