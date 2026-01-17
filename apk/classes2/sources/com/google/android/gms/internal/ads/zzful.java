package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzful implements ServiceConnection {
    final /* synthetic */ zzfun zza;

    /* synthetic */ zzful(zzfun zzfun, zzfum zzfum) {
        Objects.requireNonNull(zzfun);
        this.zza = zzfun;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzfun zzfun = this.zza;
        zzfun.zzc.zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzfun.zzo(new zzfuj(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzfun zzfun = this.zza;
        zzfun.zzc.zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzfun.zzo(new zzfuk(this));
    }
}
