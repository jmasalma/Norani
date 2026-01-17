package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzfjp;
import com.google.android.gms.internal.ads.zzfjq;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbw extends zzb {
    private final zzu zza;
    private final String zzb;
    private final zzv zzc;

    public zzbw(Context context, String str, String str2, zzfjq zzfjq, zzv zzv) {
        this.zza = new zzu(context, com.google.android.gms.ads.internal.zzv.zzr().zzc(context, str));
        this.zzb = str2;
        this.zzc = zzv;
    }

    public final void zza() {
        zzv zzv = this.zzc;
        if (zzv != null) {
            new zzfjp(zzv.zzb(), this.zza, zzcaf.zze, (zzfjq) null).zzd(this.zzb);
            return;
        }
        this.zza.zza(this.zzb);
    }
}
