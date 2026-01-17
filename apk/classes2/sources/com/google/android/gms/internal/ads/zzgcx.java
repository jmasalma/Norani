package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
abstract class zzgcx extends zzgcn {
    private List zza;

    zzgcx(zzfyl zzfyl, boolean z) {
        super(zzfyl, z, true);
        List list;
        if (zzfyl.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = zzfzg.zzb(zzfyl.size());
        }
        for (int i = 0; i < zzfyl.size(); i++) {
            list.add((Object) null);
        }
        this.zza = list;
    }

    /* access modifiers changed from: package-private */
    public final void zzA(int i) {
        super.zzA(i);
        this.zza = null;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzD(List list);

    /* access modifiers changed from: package-private */
    public final void zzx(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgcw(obj));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzy() {
        List list = this.zza;
        if (list != null) {
            zzc(zzD(list));
        }
    }
}
