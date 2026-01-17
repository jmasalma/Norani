package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzax implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzax(zzay zzay, Context context, String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        Objects.requireNonNull(zzay);
    }

    public final void run() {
        zzv.zzr();
        Context context = this.zza;
        AlertDialog.Builder zzL = zzs.zzL(context);
        zzL.setMessage(this.zzb);
        if (this.zzc) {
            zzL.setTitle("Error");
        } else {
            zzL.setTitle("Info");
        }
        if (this.zzd) {
            zzL.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzL.setPositiveButton("Learn More", new zzaw(this, context));
            zzL.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzL.create().show();
    }
}
