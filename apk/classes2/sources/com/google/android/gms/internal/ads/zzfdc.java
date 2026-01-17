package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfdc {
    public static zzr zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfcb zzfcb = (zzfcb) it.next();
            if (zzfcb.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfcb.zza, zzfcb.zzb));
            }
        }
        return new zzr(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfcb zzb(zzr zzr) {
        return zzr.zzi ? new zzfcb(-3, 0, true) : new zzfcb(zzr.zze, zzr.zzb, false);
    }
}
