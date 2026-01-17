package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzgyo extends zzgxl implements RandomAccess, zzgzk, zzhbb {
    private static final double[] zza;
    private static final zzgyo zzb;
    private double[] zzc;
    private int zzd;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        zzb = new zzgyo(dArr, 0, false);
    }

    zzgyo() {
        this(zza, 0, true);
    }

    public static zzgyo zze() {
        return zzb;
    }

    private static int zzj(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzk(int i) {
        int i2 = this.zzd;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void zzl(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        zzdJ();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i));
        }
        int i3 = i + 1;
        double[] dArr = this.zzc;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr2, 0, i);
            System.arraycopy(this.zzc, i, dArr2, i3, this.zzd - i);
            this.zzc = dArr2;
        }
        this.zzc[i] = doubleValue;
        this.zzd++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzdJ();
        byte[] bArr = zzgzu.zzb;
        collection.getClass();
        if (!(collection instanceof zzgyo)) {
            return super.addAll(collection);
        }
        zzgyo zzgyo = (zzgyo) collection;
        int i = zzgyo.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (IntCompanionObject.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.zzc;
            if (i3 > dArr.length) {
                this.zzc = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzgyo.zzc, 0, this.zzc, this.zzd, zzgyo.zzd);
            this.zzd = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgyo)) {
            return super.equals(obj);
        }
        zzgyo zzgyo = (zzgyo) obj;
        if (this.zzd != zzgyo.zzd) {
            return false;
        }
        double[] dArr = zzgyo.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (Double.doubleToLongBits(this.zzc[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzl(i);
        return Double.valueOf(this.zzc[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzc[i2]);
            byte[] bArr = zzgzu.zzb;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzdJ();
        zzl(i);
        double[] dArr = this.zzc;
        double d = dArr[i];
        int i2 = this.zzd;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzdJ();
        if (i2 >= i) {
            double[] dArr = this.zzc;
            System.arraycopy(dArr, i2, dArr, i, this.zzd - i2);
            this.zzd -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzdJ();
        zzl(i);
        double[] dArr = this.zzc;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.zzd;
    }

    public final double zzd(int i) {
        zzl(i);
        return this.zzc[i];
    }

    /* renamed from: zzg */
    public final zzgzk zzf(int i) {
        double[] dArr;
        if (i >= this.zzd) {
            if (i == 0) {
                dArr = zza;
            } else {
                dArr = Arrays.copyOf(this.zzc, i);
            }
            return new zzgyo(dArr, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(double d) {
        zzdJ();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            double[] dArr = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr, 0, this.zzd);
            this.zzc = dArr;
        }
        double[] dArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        dArr2[i2] = d;
    }

    /* access modifiers changed from: package-private */
    public final void zzi(int i) {
        int length = this.zzc.length;
        if (i > length) {
            if (length != 0) {
                while (length < i) {
                    length = zzj(length);
                }
                this.zzc = Arrays.copyOf(this.zzc, length);
                return;
            }
            this.zzc = new double[Math.max(i, 10)];
        }
    }

    private zzgyo(double[] dArr, int i, boolean z) {
        super(z);
        this.zzc = dArr;
        this.zzd = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Double) obj).doubleValue());
        return true;
    }
}
