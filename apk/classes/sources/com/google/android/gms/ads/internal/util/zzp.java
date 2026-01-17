package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.client.zzl;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzp extends BroadcastReceiver {
    /* synthetic */ zzp(zzs zzs, zzr zzr) {
        Objects.requireNonNull(zzs);
    }

    public final void onReceive(Context context, Intent intent) {
        zzl.zzi();
        zzd.zza(context);
    }
}
