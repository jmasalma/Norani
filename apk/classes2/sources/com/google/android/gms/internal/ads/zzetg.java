package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzetg implements zzfve {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzetg(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        int i = zzeti.zzb;
        int i2 = zze.zza;
        String str = this.zza;
        zzo.zzg("Error calling adapter: ".concat(String.valueOf(str)));
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznu)).booleanValue()) {
            zzv.zzp().zzv(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)));
            return null;
        }
        zzv.zzp().zzw(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)));
        return null;
    }
}
