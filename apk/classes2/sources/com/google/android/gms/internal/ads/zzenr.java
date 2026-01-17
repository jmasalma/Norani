package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzenr implements zzgcu {
    public final ListenableFuture zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzgdn.zzh(new zzenu((String) null, -1));
        }
        return zzgdn.zzh(new zzenu(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
