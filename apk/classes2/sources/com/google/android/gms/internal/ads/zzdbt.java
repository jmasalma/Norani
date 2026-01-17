package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzdbt {
    protected final Map zza = new HashMap();

    protected zzdbt(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzddv zzddv) {
        zzo(zzddv.zza, zzddv.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzddv) it.next());
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzq(zzdbs zzdbs) {
        for (Map.Entry entry : this.zza.entrySet()) {
            ((Executor) entry.getValue()).execute(new zzdbr(zzdbs, entry.getKey()));
        }
    }
}
