package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzmn {
    private boolean zza;

    public zzmn(Context context, Looper looper, zzdj zzdj) {
        context.getApplicationContext();
        zzdj.zzd(looper, (Handler.Callback) null);
    }

    public final void zza(boolean z) {
        if (this.zza != z) {
            this.zza = z;
        }
    }
}
