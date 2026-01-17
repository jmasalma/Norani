package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzxy implements Comparator {
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return zzfyf.zzj().zzc((zzys) Collections.max(list, new zzyq()), (zzys) Collections.max(list2, new zzyq()), new zzyq()).zzb(list.size(), list2.size()).zzc((zzys) Collections.max(list, new zzyr()), (zzys) Collections.max(list2, new zzyr()), new zzyr()).zza();
    }
}
