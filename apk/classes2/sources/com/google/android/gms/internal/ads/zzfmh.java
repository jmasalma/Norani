package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfmh extends zzfmk {
    private static final zzfmh zzb = new zzfmh();

    private zzfmh() {
    }

    public static zzfmh zza() {
        return zzb;
    }

    public final void zzb(boolean z) {
        for (zzflp zzg : zzfmi.zza().zzc()) {
            zzg.zzg().zzk(z);
        }
    }

    public final boolean zzc() {
        for (zzflp zzf : zzfmi.zza().zzb()) {
            View zzf2 = zzf.zzf();
            if (zzf2 != null && zzf2.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
