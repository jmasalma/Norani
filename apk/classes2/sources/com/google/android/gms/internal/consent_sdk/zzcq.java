package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final /* synthetic */ class zzcq implements ThreadFactory {
    public final /* synthetic */ zzcr zza;
    public final /* synthetic */ String zzb = "Google consent worker";

    public /* synthetic */ zzcq(zzcr zzcr, String str) {
        this.zza = zzcr;
    }

    public final Thread newThread(Runnable runnable) {
        return zzcr.zza(this.zza, this.zzb, runnable);
    }
}
