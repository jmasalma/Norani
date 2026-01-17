package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbsj implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsl zza;

    zzbsj(zzbsl zzbsl) {
        Objects.requireNonNull(zzbsl);
        this.zza = zzbsl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbsl zzbsl = this.zza;
        Intent zzb = zzbsl.zzb();
        zzv.zzr();
        zzs.zzU(zzbsl.zzb, zzb);
    }
}
