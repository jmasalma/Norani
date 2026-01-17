package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeyq implements zzgcu {
    public final /* synthetic */ zzfes zza;
    public final /* synthetic */ zzcse zzb;

    public /* synthetic */ zzeyq(zzeys zzeys, zzfes zzfes, zzcse zzcse) {
        this.zza = zzfes;
        this.zzb = zzcse;
    }

    public final ListenableFuture zza(Object obj) {
        zzfcn zzfcn = (zzfcn) obj;
        this.zza.zzb = zzfcn;
        Iterator it = zzfcn.zzb.zza.iterator();
        boolean z = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator it2 = ((zzfca) it.next()).zza.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z = true;
                    }
                }
            } else if (z) {
                return this.zzb.zzh(zzgdn.zzh(zzfcn));
            }
        }
        return zzgdn.zzh((Object) null);
    }
}
