package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzd extends Thread {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;

    zzd(zzf zzf, Context context, String str) {
        this.zza = context;
        this.zzb = str;
        Objects.requireNonNull(zzf);
    }

    public final void run() {
        new zzu(this.zza, (String) null).zza(this.zzb);
    }
}
