package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzgaq extends AbstractSet {
    private zzgaq() {
        throw null;
    }

    /* synthetic */ zzgaq(zzgar zzgar) {
    }

    static int zzd(Set set) {
        return set instanceof zzgaq ? ((zzgaq) set).zza() : set.size();
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        Set set;
        int zzd;
        int i;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || (zzd = zzd(set)) < 0) {
            return false;
        }
        if ((set = (Set) obj) instanceof zzgaq) {
            ((zzgaq) set).zzb();
            i = 0;
        } else {
            i = set.size();
        }
        if (zza() < i) {
            return false;
        }
        zzgaw zzc = iterator();
        int i2 = 0;
        while (zzc.hasNext()) {
            try {
                if (!set.contains(zzc.next())) {
                    return false;
                }
                i2++;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        if (i2 == zzd) {
            return true;
        }
        if (i2 < i) {
            return false;
        }
        Iterator it = set.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            it.next();
            i3++;
            if (i3 > i2) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract int zza();

    /* access modifiers changed from: package-private */
    public abstract int zzb();

    /* renamed from: zzc */
    public abstract zzgaw iterator();
}
