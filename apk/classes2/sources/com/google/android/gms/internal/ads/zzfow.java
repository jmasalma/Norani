package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzfow implements OnFailureListener {
    public final /* synthetic */ zzfoz zza;

    public /* synthetic */ zzfow(zzfoz zzfoz) {
        this.zza = zzfoz;
    }

    public final void onFailure(Exception exc) {
        zzfoz.zzd(this.zza, exc);
    }
}
