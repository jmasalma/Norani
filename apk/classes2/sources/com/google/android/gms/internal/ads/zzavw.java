package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzavw implements Callable {
    public final /* synthetic */ Context zza;

    public /* synthetic */ zzavw(zzavx zzavx, Context context) {
        this.zza = context;
    }

    public final Object call() {
        Context context = this.zza;
        try {
            return zzfoq.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }
}
