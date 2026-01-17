package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzepl implements zzhgr {
    public static zzepl zza() {
        return zzepk.zza;
    }

    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbcv zzbcv = zzbde.zzmh;
        if (!((String) zzbd.zzc().zzb(zzbcv)).isEmpty()) {
            arrayList = Arrays.asList(((String) zzbd.zzc().zzb(zzbcv)).split(","));
        }
        zzhgz.zzb(arrayList);
        List list = arrayList;
        return arrayList;
    }
}
