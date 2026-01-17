package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemh implements zzeuc {
    private final zzgdy zza;
    private final zzfcw zzb;
    private final int zzc;

    zzemh(zzgdy zzgdy, zzfcw zzfcw, zzfdl zzfdl, int i) {
        this.zza = zzgdy;
        this.zzb = zzfcw;
        this.zzc = i;
    }

    public static /* synthetic */ zzemi zzc(zzemh zzemh) {
        List list;
        String str = null;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhl)).booleanValue()) {
            zzfcw zzfcw = zzemh.zzb;
            if (zzemh.zzc != 2) {
                String zzc2 = zzaa.zzc(zzfcw.zzd);
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzhn)).booleanValue()) {
                    list = Arrays.asList(((String) zzbd.zzc().zzb(zzbde.zzho)).split(","));
                } else {
                    list = Arrays.asList(((String) zzbd.zzc().zzb(zzbde.zzhm)).split(","));
                }
                if (list.contains(zzaa.zzb(zzc2))) {
                    str = zzfdl.zza();
                }
            }
        }
        return new zzemi(str);
    }

    public final int zza() {
        return 5;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzemg(this));
    }
}
