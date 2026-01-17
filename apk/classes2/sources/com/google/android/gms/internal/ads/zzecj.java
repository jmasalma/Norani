package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzecj implements DialogInterface.OnCancelListener {
    public final /* synthetic */ zzecl zza;
    public final /* synthetic */ zzm zzb;

    public /* synthetic */ zzecj(zzecl zzecl, zzm zzm) {
        this.zza = zzecl;
        this.zzb = zzm;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        zzecl.zzn(this.zza, this.zzb, dialogInterface);
    }
}
