package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzabd extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzabb zzd;
    private boolean zze;

    /* synthetic */ zzabd(zzabb zzabb, SurfaceTexture surfaceTexture, boolean z, zzabc zzabc) {
        super(surfaceTexture);
        this.zzd = zzabb;
        this.zza = z;
    }

    public static zzabd zza(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzdd.zzf(z2);
        zzabb zzabb = new zzabb();
        if (z) {
            i = zzb;
        }
        return zzabb.zza(i);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        synchronized (zzabd.class) {
            if (!zzc) {
                zzb = zzdr.zzd(context) ? zzdr.zze() ? 1 : 2 : 0;
                zzc = true;
            }
            i = zzb;
        }
        return i != 0;
    }

    public final void release() {
        super.release();
        zzabb zzabb = this.zzd;
        synchronized (zzabb) {
            if (!this.zze) {
                zzabb.zzb();
                this.zze = true;
            }
        }
    }
}
