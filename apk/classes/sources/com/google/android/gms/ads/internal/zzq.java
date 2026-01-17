package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzavr;
import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzavu;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzq implements Callable {
    final /* synthetic */ zzu zza;

    zzq(zzu zzu) {
        Objects.requireNonNull(zzu);
        this.zza = zzu;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzu zzu = this.zza;
        String str = zzu.zza.afmaVersion;
        Context zzd = zzu.zzd;
        int i = zzavt.zzw;
        return new zzavu(zzavt.zzt(zzd, new zzavr(str, false)));
    }
}
