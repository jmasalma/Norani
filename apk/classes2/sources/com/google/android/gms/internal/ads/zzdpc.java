package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdpc implements View.OnTouchListener {
    public final /* synthetic */ zzdpi zza;

    public /* synthetic */ zzdpc(zzdpi zzdpi) {
        this.zza = zzdpi;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzdpi.zzh(this.zza, view, motionEvent);
        return false;
    }
}
