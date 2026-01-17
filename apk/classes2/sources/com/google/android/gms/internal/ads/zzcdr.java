package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcdr extends zzcdn {
    public zzcdr(zzccb zzccb) {
        super(zzccb);
    }

    public final void zzf() {
    }

    public final boolean zzt(String str) {
        String zzk = zzf.zzk(str);
        zzccb zzccb = (zzccb) this.zzc.get();
        if (!(zzccb == null || zzk == null)) {
            zzccb.zzt(zzk, this);
        }
        int i = zze.zza;
        zzo.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zzk, "noop", "Noop cache is a noop.");
        return false;
    }
}
