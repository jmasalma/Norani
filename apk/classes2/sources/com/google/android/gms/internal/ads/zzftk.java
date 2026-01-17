package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzftk implements Consumer {
    public final /* synthetic */ Bundle zza;

    public /* synthetic */ zzftk(Bundle bundle) {
        this.zza = bundle;
    }

    public final void accept(Object obj) {
        int i = zzftw.zzb;
        this.zza.putString("appId", (String) obj);
    }
}
