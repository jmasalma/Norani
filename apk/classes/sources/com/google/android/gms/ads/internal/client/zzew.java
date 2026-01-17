package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbmj;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzew extends zzbmj {
    final /* synthetic */ zzey zza;

    /* synthetic */ zzew(zzey zzey, zzex zzex) {
        Objects.requireNonNull(zzey);
        this.zza = zzey;
    }

    public final void zzb(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        zzey zzey = this.zza;
        synchronized (zzey.zzf) {
            zzey.zzi = false;
            zzey.zzj = true;
            arrayList = new ArrayList(zzey.zzh);
            zzey.zzh.clear();
        }
        InitializationStatus zzd = zzey.zzA(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzd);
        }
    }
}
