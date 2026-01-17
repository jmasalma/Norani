package com.google.android.gms.internal.ads;

import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzfyv extends zzfyl implements Set {
    private transient zzfyq zza;

    zzfyv() {
    }

    static int zzh(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        }
        zzfvp.zzf(max < 1073741824, "collection too large");
        return Ints.MAX_POWER_OF_TWO;
    }

    public static zzfyu zzj(int i) {
        return new zzfyu(i, true);
    }

    public static zzfyv zzl(Collection collection) {
        if ((collection instanceof zzfyv) && !(collection instanceof SortedSet)) {
            zzfyv zzfyv = (zzfyv) collection;
            if (!zzfyv.zzf()) {
                return zzfyv;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzfyv zzm(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return zzgai.zza;
        }
        if (length != 1) {
            return zzv(length, (Object[]) objArr.clone());
        }
        return new zzgat(objArr[0]);
    }

    public static zzfyv zzn() {
        return zzgai.zza;
    }

    public static zzfyv zzo(Object obj) {
        return new zzgat(obj);
    }

    public static zzfyv zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzfyv zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzfyv zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfyv zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[9];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 3);
        return zzv(9, objArr2);
    }

    /* access modifiers changed from: private */
    public static boolean zzw(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfyv) || !zzu() || !((zzfyv) obj).zzu() || hashCode() == obj.hashCode()) {
            return zzgas.zzd(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return zzgas.zza(this);
    }

    public zzfyq zzd() {
        zzfyq zzfyq = this.zza;
        if (zzfyq != null) {
            return zzfyq;
        }
        zzfyq zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    /* renamed from: zze */
    public abstract zzgaw iterator();

    /* access modifiers changed from: package-private */
    public zzfyq zzi() {
        Object[] array = toArray();
        int i = zzfyq.zzd;
        return zzfyq.zzj(array, array.length);
    }

    /* access modifiers changed from: package-private */
    public boolean zzu() {
        return false;
    }

    /* access modifiers changed from: private */
    public static zzfyv zzv(int i, Object... objArr) {
        if (i == 0) {
            return zzgai.zza;
        }
        if (i == 1) {
            return new zzgat(Objects.requireNonNull(objArr[0]));
        }
        int zzh = zzh(i);
        Object[] objArr2 = new Object[zzh];
        int i2 = zzh - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            zzgaa.zza(obj, i5);
            int hashCode = obj.hashCode();
            int zza2 = zzfyi.zza(hashCode);
            while (true) {
                int i6 = zza2 & i2;
                Object obj2 = objArr2[i6];
                if (obj2 != null) {
                    if (obj2.equals(obj)) {
                        break;
                    }
                    zza2++;
                } else {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4++;
                    break;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new zzgat(Objects.requireNonNull(objArr[0]));
        }
        if (zzh(i4) < zzh / 2) {
            return zzv(i4, objArr);
        }
        if (zzw(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzgai(objArr, i3, objArr2, i2, i4);
    }
}
