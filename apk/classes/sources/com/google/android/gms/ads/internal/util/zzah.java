package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzah implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzah(zzau zzau, String str) {
        this.zza = zzau;
        this.zzb = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzau.zzg(this.zza, this.zzb, dialogInterface, i);
    }
}
