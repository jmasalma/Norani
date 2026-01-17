package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcwh implements zzdbs {
    public final /* synthetic */ zzdgm zza;

    public /* synthetic */ zzcwh(zzdgm zzdgm) {
        this.zza = zzdgm;
    }

    public final void zza(Object obj) {
        zzcwo zzcwo = (zzcwo) obj;
        String message = this.zza.getMessage();
        if (message == null) {
            message = "Internal show error.";
        }
        zzcwo.zzs(zzfdx.zzd(12, message, (zze) null));
    }
}
