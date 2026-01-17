package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzgyw {
    private static final zzgyw zzb = new zzgyw(true);
    final zzhbt zza = new zzhbo();
    private boolean zzc;
    private boolean zzd;

    private zzgyw() {
    }

    static int zza(zzhck zzhck, int i, Object obj) {
        int zzD = zzgym.zzD(i << 3);
        if (zzhck == zzhck.GROUP) {
            zzhas zzhas = (zzhas) obj;
            byte[] bArr = zzgzu.zzb;
            if (!(zzhas instanceof zzgxj)) {
                zzD += zzD;
            } else {
                zzgxj zzgxj = (zzgxj) zzhas;
                throw null;
            }
        }
        return zzD + zzb(zzhck, obj);
    }

    static int zzb(zzhck zzhck, Object obj) {
        int zzd2;
        int zzD;
        zzhck zzhck2 = zzhck.DOUBLE;
        zzhcl zzhcl = zzhcl.INT;
        switch (zzhck.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i = zzgym.zzf;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i2 = zzgym.zzf;
                return 4;
            case 2:
                return zzgym.zzE(((Long) obj).longValue());
            case 3:
                return zzgym.zzE(((Long) obj).longValue());
            case 4:
                return zzgym.zzE((long) ((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i3 = zzgym.zzf;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i4 = zzgym.zzf;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i5 = zzgym.zzf;
                return 1;
            case 8:
                if (obj instanceof zzgxz) {
                    int i6 = zzgym.zzf;
                    zzd2 = ((zzgxz) obj).zzd();
                    zzD = zzgym.zzD(zzd2);
                    break;
                } else {
                    return zzgym.zzC((String) obj);
                }
            case 9:
                return ((zzhas) obj).zzaY();
            case 10:
                if (obj instanceof zzhac) {
                    int i7 = zzgym.zzf;
                    zzd2 = ((zzhac) obj).zza();
                    zzD = zzgym.zzD(zzd2);
                    break;
                } else {
                    return zzgym.zzz((zzhas) obj);
                }
            case 11:
                if (!(obj instanceof zzgxz)) {
                    int i8 = zzgym.zzf;
                    zzd2 = ((byte[]) obj).length;
                    zzD = zzgym.zzD(zzd2);
                    break;
                } else {
                    int i9 = zzgym.zzf;
                    zzd2 = ((zzgxz) obj).zzd();
                    zzD = zzgym.zzD(zzd2);
                    break;
                }
            case 12:
                return zzgym.zzD(((Integer) obj).intValue());
            case 13:
                if (obj instanceof zzgzl) {
                    return zzgym.zzE((long) ((zzgzl) obj).zza());
                }
                return zzgym.zzE((long) ((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i10 = zzgym.zzf;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i11 = zzgym.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzgym.zzD((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzgym.zzE((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzD + zzd2;
    }

    public static int zzc(zzgyv zzgyv, Object obj) {
        zzhck zzb2 = zzgyv.zzb();
        int zza2 = zzgyv.zza();
        if (!zzgyv.zze()) {
            return zza(zzb2, zza2, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzgyv.zzd()) {
            int i2 = 0;
            while (i < size) {
                i2 += zza(zzb2, zza2, list.get(i));
                i++;
            }
            return i2;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            int i3 = 0;
            while (i < size) {
                i3 += zzb(zzb2, list.get(i));
                i++;
            }
            return zzgym.zzD(zza2 << 3) + i3 + zzgym.zzD(i3);
        }
    }

    public static zzgyw zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzgyv zzgyv = (zzgyv) entry.getKey();
        if (zzgyv.zzc() != zzhcl.MESSAGE) {
            return true;
        }
        if (!zzgyv.zze()) {
            return zzk(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzk(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzhat) {
            return ((zzhat) obj).zzbw();
        }
        if (obj instanceof zzhac) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(Map.Entry entry) {
        int i;
        int zzD;
        int zzD2;
        zzgyv zzgyv = (zzgyv) entry.getKey();
        Object value = entry.getValue();
        if (zzgyv.zzc() != zzhcl.MESSAGE || zzgyv.zze() || zzgyv.zzd()) {
            return zzc(zzgyv, value);
        }
        if (value instanceof zzhac) {
            int zza2 = ((zzgyv) entry.getKey()).zza();
            int zzD3 = zzgym.zzD(8);
            i = zzD3 + zzD3;
            zzD = zzgym.zzD(16) + zzgym.zzD(zza2);
            int zzD4 = zzgym.zzD(24);
            int zza3 = ((zzhac) value).zza();
            zzD2 = zzD4 + zzgym.zzD(zza3) + zza3;
        } else {
            int zza4 = ((zzgyv) entry.getKey()).zza();
            int zzD5 = zzgym.zzD(8);
            i = zzD5 + zzD5;
            zzD = zzgym.zzD(16) + zzgym.zzD(zza4);
            zzD2 = zzgym.zzD(24) + zzgym.zzz((zzhas) value);
        }
        return i + zzD + zzD2;
    }

    private static final void zzm(zzgyv zzgyv, Object obj) {
        boolean z;
        zzhck zzb2 = zzgyv.zzb();
        byte[] bArr = zzgzu.zzb;
        obj.getClass();
        zzhck zzhck = zzhck.DOUBLE;
        zzhcl zzhcl = zzhcl.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzgxz) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzgzl)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzhas) || (obj instanceof zzhac)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzgyv.zza()), zzgyv.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgyw zzgyw = new zzgyw();
        zzhbt zzhbt = this.zza;
        int zzc2 = zzhbt.zzc();
        for (int i = 0; i < zzc2; i++) {
            Map.Entry zzg = zzhbt.zzg(i);
            zzgyw.zzh((zzgyv) ((zzhbp) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : zzhbt.zzd()) {
            zzgyw.zzh((zzgyv) entry.getKey(), entry.getValue());
        }
        zzgyw.zzd = this.zzd;
        return zzgyw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgyw)) {
            return false;
        }
        return this.zza.equals(((zzgyw) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzhbt zzhbt = this.zza;
        int zzc2 = zzhbt.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc2; i2++) {
            i += zzl(zzhbt.zzg(i2));
        }
        for (Map.Entry zzl : zzhbt.zzd()) {
            i += zzl(zzl);
        }
        return i;
    }

    public final Iterator zzf() {
        zzhbt zzhbt = this.zza;
        if (zzhbt.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzhaa(zzhbt.entrySet().iterator());
        }
        return zzhbt.entrySet().iterator();
    }

    public final void zzg() {
        if (!this.zzc) {
            zzhbt zzhbt = this.zza;
            int zzc2 = zzhbt.zzc();
            for (int i = 0; i < zzc2; i++) {
                Object value = zzhbt.zzg(i).getValue();
                if (value instanceof zzgzh) {
                    ((zzgzh) value).zzbU();
                }
            }
            for (Map.Entry value2 : zzhbt.zzd()) {
                Object value3 = value2.getValue();
                if (value3 instanceof zzgzh) {
                    ((zzgzh) value3).zzbU();
                }
            }
            zzhbt.zza();
            this.zzc = true;
        }
    }

    public final void zzh(zzgyv zzgyv, Object obj) {
        if (!zzgyv.zze()) {
            zzm(zzgyv, obj);
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzm(zzgyv, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzhac) {
            this.zzd = true;
        }
        this.zza.put(zzgyv, obj);
    }

    public final boolean zzi() {
        zzhbt zzhbt = this.zza;
        int zzc2 = zzhbt.zzc();
        for (int i = 0; i < zzc2; i++) {
            if (!zzj(zzhbt.zzg(i))) {
                return false;
            }
        }
        for (Map.Entry zzj : zzhbt.zzd()) {
            if (!zzj(zzj)) {
                return false;
            }
        }
        return true;
    }

    private zzgyw(boolean z) {
        zzg();
        zzg();
    }
}
