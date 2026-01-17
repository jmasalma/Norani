package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaw implements DialogInterface.OnClickListener {
    final /* synthetic */ Context zza;

    zzaw(zzax zzax, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzax);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzv.zzr();
        zzs.zzV(this.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
