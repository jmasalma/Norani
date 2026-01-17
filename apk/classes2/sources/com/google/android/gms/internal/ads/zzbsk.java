package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbsk implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsl zza;

    zzbsk(zzbsl zzbsl) {
        Objects.requireNonNull(zzbsl);
        this.zza = zzbsl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzh("Operation denied by user.");
    }
}
