package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final /* synthetic */ class zzbz implements Executor {
    public final /* synthetic */ Handler zza;

    public /* synthetic */ zzbz(Handler handler) {
        this.zza = handler;
    }

    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
