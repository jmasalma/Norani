package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhbn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhbx zzb = new zzhbz();

    static {
        int i = zzhbc.zza;
    }

    public static void zzA(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzu(i, list, z);
        }
    }

    public static void zzB(int i, List list, zzhcm zzhcm, zzhbl zzhbl) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzgyn) zzhcm).zzv(i, list.get(i2), zzhbl);
            }
        }
    }

    public static void zzC(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzy(i, list, z);
        }
    }

    public static void zzD(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzA(i, list, z);
        }
    }

    public static void zzE(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzC(i, list, z);
        }
    }

    public static void zzF(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzE(i, list, z);
        }
    }

    public static void zzG(int i, List list, zzhcm zzhcm) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzH(i, list);
        }
    }

    public static void zzH(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzJ(i, list, z);
        }
    }

    public static void zzI(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzL(i, list, z);
        }
    }

    static boolean zzJ(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    static int zza(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            i = 0;
            while (i2 < size) {
                i += zzgym.zzE((long) zzgzi.zzd(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgym.zzE((long) ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgym.zzD(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgym.zzD(i << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            i = 0;
            while (i2 < size) {
                i += zzgym.zzE((long) zzgzi.zzd(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgym.zzE((long) ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzg(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            i = 0;
            while (i2 < size) {
                i += zzgym.zzE(zzhah.zza(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgym.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzh(int i, Object obj, zzhbl zzhbl) {
        int i2 = i << 3;
        if (!(obj instanceof zzhad)) {
            return zzgym.zzD(i2) + zzgym.zzA((zzhas) obj, zzhbl);
        }
        int zzD = zzgym.zzD(i2);
        int zza2 = ((zzhad) obj).zza();
        return zzD + zzgym.zzD(zza2) + zza2;
    }

    static int zzi(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            i = 0;
            while (i2 < size) {
                int zzd = zzgzi.zzd(i2);
                i += zzgym.zzD((zzd >> 31) ^ (zzd + zzd));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzgym.zzD((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzj(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            i = 0;
            while (i2 < size) {
                long zza2 = zzhah.zza(i2);
                i += zzgym.zzE((zza2 >> 63) ^ (zza2 + zza2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzgym.zzE((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzi) {
            zzgzi zzgzi = (zzgzi) list;
            i = 0;
            while (i2 < size) {
                i += zzgym.zzD(zzgzi.zzd(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgym.zzD(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhah) {
            zzhah zzhah = (zzhah) list;
            i = 0;
            while (i2 < size) {
                i += zzgym.zzE(zzhah.zza(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgym.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzhbx zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i, List list, zzgzn zzgzn, Object obj2, zzhbx zzhbx) {
        if (zzgzn == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgzn.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = zzo(obj, i, intValue, obj2, zzhbx);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgzn.zza(intValue2)) {
                    obj2 = zzo(obj, i, intValue2, obj2, zzhbx);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzo(Object obj, int i, int i2, Object obj2, zzhbx zzhbx) {
        if (obj2 == null) {
            obj2 = zzhbx.zza(obj);
        }
        zzhbx.zzh(obj2, i, (long) i2);
        return obj2;
    }

    static void zzp(zzgys zzgys, Object obj, Object obj2) {
        if (!((zzgzd) obj2).zza.zza.isEmpty()) {
            zzgzd zzgzd = (zzgzd) obj;
            throw null;
        }
    }

    static void zzq(zzhbx zzhbx, Object obj, Object obj2) {
        zzgzh zzgzh = (zzgzh) obj;
        zzhby zzhby = zzgzh.zzt;
        zzhby zzhby2 = ((zzgzh) obj2).zzt;
        zzhby zzhby3 = zzhby;
        zzhby zzhby4 = zzhby2;
        if (!zzhby.zzc().equals(zzhby2)) {
            if (zzhby.zzc().equals(zzhby)) {
                zzhby = zzhby.zze(zzhby, zzhby2);
            } else {
                zzhby.zzd(zzhby2);
            }
        }
        zzhby zzhby5 = zzhby;
        zzgzh.zzt = zzhby;
    }

    public static void zzr(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzc(i, list, z);
        }
    }

    public static void zzs(int i, List list, zzhcm zzhcm) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zze(i, list);
        }
    }

    public static void zzt(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzg(i, list, z);
        }
    }

    public static void zzu(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzj(i, list, z);
        }
    }

    public static void zzv(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzl(i, list, z);
        }
    }

    public static void zzw(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzn(i, list, z);
        }
    }

    public static void zzx(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzp(i, list, z);
        }
    }

    public static void zzy(int i, List list, zzhcm zzhcm, zzhbl zzhbl) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzgyn) zzhcm).zzq(i, list.get(i2), zzhbl);
            }
        }
    }

    public static void zzz(int i, List list, zzhcm zzhcm, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhcm.zzs(i, list, z);
        }
    }
}
