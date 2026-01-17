package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzecf implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzecl zza;
    public final /* synthetic */ zzm zzb;

    public /* synthetic */ zzecf(zzecl zzecl, zzm zzm) {
        this.zza = zzecl;
        this.zzb = zzm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzecl.zzc(this.zza, this.zzb, dialogInterface, i);
    }
}
