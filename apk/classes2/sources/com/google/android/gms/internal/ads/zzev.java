package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzev implements ThreadFactory {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzev(String str) {
        this.zza = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = zzex.zza;
        return new Thread(runnable, this.zza);
    }
}
