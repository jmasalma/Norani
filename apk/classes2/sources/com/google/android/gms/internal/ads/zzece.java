package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzece implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzecl zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ zzm zzc;

    public /* synthetic */ zzece(zzecl zzecl, Activity activity, zzm zzm) {
        this.zza = zzecl;
        this.zzb = activity;
        this.zzc = zzm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzecl.zzk(this.zza, this.zzb, this.zzc, dialogInterface, i);
    }
}
