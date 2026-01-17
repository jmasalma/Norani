package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbsn implements View.OnClickListener {
    final /* synthetic */ zzbso zza;

    zzbsn(zzbso zzbso) {
        Objects.requireNonNull(zzbso);
        this.zza = zzbso;
    }

    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
