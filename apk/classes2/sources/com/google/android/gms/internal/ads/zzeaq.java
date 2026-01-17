package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeaq implements Callable {
    public final /* synthetic */ zzeao zza;

    public /* synthetic */ zzeaq(zzeao zzeao) {
        this.zza = zzeao;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
