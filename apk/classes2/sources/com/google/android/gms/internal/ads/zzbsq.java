package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbsq implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsr zza;

    zzbsq(zzbsr zzbsr) {
        Objects.requireNonNull(zzbsr);
        this.zza = zzbsr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzh("User canceled the download.");
    }
}
