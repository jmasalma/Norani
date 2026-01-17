package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeii implements zzdgn {
    final /* synthetic */ zzedp zza;
    final /* synthetic */ zzfca zzb;

    zzeii(zzeik zzeik, zzedp zzedp, zzfca zzfca) {
        this.zza = zzedp;
        this.zzb = zzfca;
        Objects.requireNonNull(zzeik);
    }

    public final zzfca zza() {
        return this.zzb;
    }

    public final void zzb(boolean z, Context context, zzcwl zzcwl) throws zzdgm {
        try {
            zzfdu zzfdu = (zzfdu) this.zza.zzb;
            zzfdu.zzv(z);
            zzfdu.zzA();
        } catch (zzfdd e) {
            int i = zze.zza;
            zzo.zzk("Cannot show rewarded video.", e);
            throw new zzdgm(e.getCause());
        }
    }
}
