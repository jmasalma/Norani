package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfyw {
    public static Object zza(Iterable iterable, Object obj) {
        zzgaw zzc = ((zzgam) iterable).iterator();
        return zzc.hasNext() ? zzc.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfvq zzfvq) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            zzfvq.getClass();
            boolean z = false;
            while (it.hasNext()) {
                if (zzfvq.zza(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        zzfvq.getClass();
        zzfvq zzfvq2 = zzfvq;
        return zzd((List) iterable, zzfvq);
    }

    private static void zzc(List list, zzfvq zzfvq, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfvq.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    private static boolean zzd(List list, zzfvq zzfvq) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfvq.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        zzc(list, zzfvq, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        zzc(list, zzfvq, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
