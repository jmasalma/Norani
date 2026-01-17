package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgbs extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    zzgbs(int[] iArr, int i, int i2) {
        this.zza = iArr;
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzgbt.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgbs)) {
            return super.equals(obj);
        }
        zzgbs zzgbs = (zzgbs) obj;
        int i = this.zzc;
        int i2 = this.zzb;
        int i3 = zzgbs.zzc;
        int i4 = zzgbs.zzb;
        int i5 = i - i2;
        if (i3 - i4 != i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zza[i2 + i6] != zzgbs.zza[i4 + i6]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2 = this.zzc;
        int i3 = this.zzb;
        zzfvp.zza(i, i2 - i3, "index");
        return Integer.valueOf(this.zza[i3 + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.zzb; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zza[i2];
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r3.zza;
        r4 = ((java.lang.Integer) r4).intValue();
        r1 = r3.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int indexOf(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0018
            int[] r0 = r3.zza
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r1 = r3.zzb
            int r2 = r3.zzc
            int r4 = com.google.android.gms.internal.ads.zzgbt.zza(r0, r4, r1, r2)
            if (r4 < 0) goto L_0x0018
            int r4 = r4 - r1
            return r4
        L_0x0018:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbs.indexOf(java.lang.Object):int");
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int intValue = ((Integer) obj).intValue();
            int i = this.zzb;
            int i2 = this.zzc - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == intValue) {
                    break;
                } else {
                    i2--;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i2 = this.zzc;
        int i3 = this.zzb;
        Integer num = (Integer) obj;
        zzfvp.zza(i, i2 - i3, "index");
        int[] iArr = this.zza;
        int i4 = i3 + i;
        int i5 = iArr[i4];
        num.getClass();
        Integer num2 = num;
        iArr[i4] = num.intValue();
        return Integer.valueOf(i5);
    }

    public final int size() {
        return this.zzc - this.zzb;
    }

    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    public final List subList(int i, int i2) {
        int i3 = this.zzc;
        int i4 = this.zzb;
        zzfvp.zzk(i, i2, i3 - i4);
        if (i == i2) {
            return Collections.emptyList();
        }
        return new zzgbs(this.zza, i + i4, i4 + i2);
    }

    public final String toString() {
        int i = this.zzc;
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        int[] iArr = this.zza;
        sb.append(iArr[i2]);
        while (true) {
            i2++;
            if (i2 < i) {
                sb.append(", ");
                sb.append(iArr[i2]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
