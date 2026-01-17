package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzefa implements zzdgn {
    final /* synthetic */ zzcak zza;
    final /* synthetic */ zzfca zzb;
    final /* synthetic */ zzefb zzc;

    zzefa(zzefb zzefb, zzcak zzcak, zzfca zzfca) {
        this.zza = zzcak;
        this.zzb = zzfca;
        Objects.requireNonNull(zzefb);
        this.zzc = zzefb;
    }

    public final zzfca zza() {
        return this.zzb;
    }

    public final void zzb(boolean z, Context context, zzcwl zzcwl) {
        try {
            zzv.zzj();
            zzn.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zze);
        } catch (Exception unused) {
        }
    }
}
