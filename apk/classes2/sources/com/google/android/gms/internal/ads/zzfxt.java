package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfxt extends AbstractSet {
    final /* synthetic */ zzfxz zza;

    zzfxt(zzfxz zzfxz) {
        Objects.requireNonNull(zzfxz);
        this.zza = zzfxz;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        zzfxz zzfxz = this.zza;
        Map zzl = zzfxz.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzd = zzfxz.zzw(entry.getKey());
            if (zzd == -1 || !zzfvm.zza(zzfxz.zzj(zzfxz, zzd), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        zzfxz zzfxz = this.zza;
        Map zzl = zzfxz.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzfxr(zzfxz);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r1 = com.google.android.gms.internal.ads.zzfxz.zzc(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzfxz r0 = r9.zza
            java.util.Map r1 = r0.zzl()
            if (r1 == 0) goto L_0x0011
            java.util.Set r0 = r1.entrySet()
            boolean r10 = r0.remove(r10)
            return r10
        L_0x0011:
            boolean r1 = r10 instanceof java.util.Map.Entry
            if (r1 == 0) goto L_0x0052
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            boolean r1 = r0.zzr()
            if (r1 == 0) goto L_0x001e
            goto L_0x0052
        L_0x001e:
            int r1 = r0.zzv()
            java.lang.Object r2 = r10.getKey()
            java.lang.Object r3 = r10.getValue()
            java.lang.Object r5 = java.util.Objects.requireNonNull(r0.zze)
            int[] r6 = r0.zzA()
            java.lang.Object[] r7 = r0.zzB()
            java.lang.Object[] r8 = r0.zzC()
            r4 = r1
            int r10 = com.google.android.gms.internal.ads.zzfya.zzb(r2, r3, r4, r5, r6, r7, r8)
            r2 = -1
            if (r10 == r2) goto L_0x0052
            r0.zzq(r10, r1)
            int r10 = r0.zzg
            int r10 = r10 + r2
            r0.zzg = r10
            r0.zzo()
            r10 = 1
            return r10
        L_0x0052:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxt.remove(java.lang.Object):boolean");
    }

    public final int size() {
        return this.zza.size();
    }
}
