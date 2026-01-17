package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcj;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhav<T> implements zzhbl<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhce.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhas zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhbx zzm;
    private final zzgys zzn;

    private zzhav(int[] iArr, Object[] objArr, int i, int i2, zzhas zzhas, boolean z, int[] iArr2, int i3, int i4, zzhay zzhay, zzhaf zzhaf, zzhbx zzhbx, zzgys zzgys, zzhan zzhan) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzhas instanceof zzgzh;
        boolean z2 = false;
        if (zzgys != null && (zzhas instanceof zzgzd)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzhbx;
        this.zzn = zzgys;
        this.zzg = zzhas;
    }

    private final Object zzA(Object obj, int i) {
        zzhbl zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, (long) zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze2 = zzx.zze();
        if (object != null) {
            zzx.zzg(zze2, object);
        }
        return zze2;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzhbl zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, (long) (zzu(i2) & 1048575));
        if (zzQ(object)) {
            return object;
        }
        Object zze2 = zzx.zze();
        if (object != null) {
            zzx.zzg(zze2, object);
        }
        return zze2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            Unsafe unsafe = zzb;
            long zzu = (long) (zzu(i) & 1048575);
            Object object = unsafe.getObject(obj2, zzu);
            if (object != null) {
                zzhbl zzx = zzx(i);
                if (!zzN(obj, i)) {
                    if (!zzQ(object)) {
                        unsafe.putObject(obj, zzu, object);
                    } else {
                        Object zze2 = zzx.zze();
                        zzx.zzg(zze2, object);
                        unsafe.putObject(obj, zzu, zze2);
                    }
                    zzH(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzu);
                if (!zzQ(object2)) {
                    Object zze3 = zzx.zze();
                    zzx.zzg(zze3, object2);
                    unsafe.putObject(obj, zzu, zze3);
                    object2 = zze3;
                }
                zzx.zzg(object2, object);
                return;
            }
            int i2 = this.zzc[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i2 + " is present but null: " + obj3);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzR(obj2, i2, i)) {
            Unsafe unsafe = zzb;
            long zzu = (long) (zzu(i) & 1048575);
            Object object = unsafe.getObject(obj2, zzu);
            if (object != null) {
                zzhbl zzx = zzx(i);
                if (!zzR(obj, i2, i)) {
                    if (!zzQ(object)) {
                        unsafe.putObject(obj, zzu, object);
                    } else {
                        Object zze2 = zzx.zze();
                        zzx.zzg(zze2, object);
                        unsafe.putObject(obj, zzu, zze2);
                    }
                    zzI(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzu);
                if (!zzQ(object2)) {
                    Object zze3 = zzx.zze();
                    zzx.zzg(zze3, object2);
                    unsafe.putObject(obj, zzu, zze3);
                    object2 = zze3;
                }
                zzx.zzg(object2, object);
                return;
            }
            int i3 = iArr[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i3 + " is present but null: " + obj3);
        }
    }

    private final void zzG(Object obj, int i, zzhbf zzhbf) throws IOException {
        long j = (long) (i & 1048575);
        if (zzM(i)) {
            zzhce.zzv(obj, j, zzhbf.zzs());
        } else if (this.zzi) {
            zzhce.zzv(obj, j, zzhbf.zzr());
        } else {
            zzhce.zzv(obj, j, zzhbf.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = (long) (1048575 & zzr);
        if (j != 1048575) {
            zzhce.zzt(obj, j, (1 << (zzr >>> 20)) | zzhce.zzd(obj, j));
        }
    }

    private final void zzI(Object obj, int i, int i2) {
        zzhce.zzt(obj, (long) (zzr(i2) & 1048575), i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, (long) (zzu(i) & 1048575), obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, (long) (zzu(i2) & 1048575), obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = (long) (zzr & 1048575);
        if (j == 1048575) {
            int zzu = zzu(i);
            long j2 = (long) (zzu & 1048575);
            switch (zzt(zzu)) {
                case 0:
                    return Double.doubleToRawLongBits(zzhce.zzb(obj, j2)) != 0;
                case 1:
                    return Float.floatToRawIntBits(zzhce.zzc(obj, j2)) != 0;
                case 2:
                    return zzhce.zzf(obj, j2) != 0;
                case 3:
                    return zzhce.zzf(obj, j2) != 0;
                case 4:
                    return zzhce.zzd(obj, j2) != 0;
                case 5:
                    return zzhce.zzf(obj, j2) != 0;
                case 6:
                    return zzhce.zzd(obj, j2) != 0;
                case 7:
                    return zzhce.zzz(obj, j2);
                case 8:
                    Object zzh2 = zzhce.zzh(obj, j2);
                    if (zzh2 instanceof String) {
                        return !((String) zzh2).isEmpty();
                    }
                    if (zzh2 instanceof zzgxz) {
                        return !zzgxz.zzb.equals(zzh2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzhce.zzh(obj, j2) != null;
                case 10:
                    return !zzgxz.zzb.equals(zzhce.zzh(obj, j2));
                case 11:
                    return zzhce.zzd(obj, j2) != 0;
                case 12:
                    return zzhce.zzd(obj, j2) != 0;
                case 13:
                    return zzhce.zzd(obj, j2) != 0;
                case 14:
                    return zzhce.zzf(obj, j2) != 0;
                case 15:
                    return zzhce.zzd(obj, j2) != 0;
                case 16:
                    return zzhce.zzf(obj, j2) != 0;
                case 17:
                    return zzhce.zzh(obj, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (zzhce.zzd(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzhbl zzhbl) {
        return zzhbl.zzl(zzhce.zzh(obj, (long) (i & 1048575)));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgzh) {
            return ((zzgzh) obj).zzcd();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzhce.zzd(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzhce.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzhcm zzhcm) throws IOException {
        if (obj instanceof String) {
            zzhcm.zzG(i, (String) obj);
        } else {
            zzhcm.zzd(i, (zzgxz) obj);
        }
    }

    static zzhby zzd(Object obj) {
        zzgzh zzgzh = (zzgzh) obj;
        zzhby zzhby = zzgzh.zzt;
        if (zzhby != zzhby.zzc()) {
            return zzhby;
        }
        zzhby zzf2 = zzhby.zzf();
        zzgzh.zzt = zzf2;
        return zzf2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0391  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.ads.zzhav zzm(java.lang.Class r34, com.google.android.gms.internal.ads.zzhap r35, com.google.android.gms.internal.ads.zzhay r36, com.google.android.gms.internal.ads.zzhaf r37, com.google.android.gms.internal.ads.zzhbx r38, com.google.android.gms.internal.ads.zzgys r39, com.google.android.gms.internal.ads.zzhan r40) {
        /*
            r0 = r35
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzhbe
            if (r1 == 0) goto L_0x0408
            com.google.android.gms.internal.ads.zzhbe r0 = (com.google.android.gms.internal.ads.zzhbe) r0
            java.lang.String r1 = r0.zzd()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0025
            r4 = 1
        L_0x001b:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0026
            r4 = r7
            goto L_0x001b
        L_0x0025:
            r7 = 1
        L_0x0026:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0045
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0032:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0042
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L_0x0032
        L_0x0042:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L_0x0045:
            if (r7 != 0) goto L_0x0056
            int[] r7 = zza
            r9 = r3
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r17 = r14
            r16 = r7
            r7 = r17
            goto L_0x0168
        L_0x0056:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0062:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0072
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0062
        L_0x0072:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L_0x0075:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0094
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0081:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x0091
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x0081
        L_0x0091:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L_0x0094:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x00b3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00b0
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00a0
        L_0x00b0:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00b3:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00d2
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int r16 = r4 + r4
            int r16 = r16 + r7
            int[] r7 = new int[r13]
            r13 = r9
            r17 = r14
            r9 = r16
            r16 = r7
            r14 = r10
            r7 = r4
            r4 = r15
        L_0x0168:
            sun.misc.Unsafe r10 = zzb
            java.lang.Object[] r15 = r0.zze()
            com.google.android.gms.internal.ads.zzhas r18 = r0.zza()
            java.lang.Class r3 = r18.getClass()
            int r18 = r17 + r12
            int r12 = r11 + r11
            int r11 = r11 * 3
            int[] r11 = new int[r11]
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r21 = r17
            r22 = r18
            r19 = 0
            r20 = 0
        L_0x0188:
            if (r4 >= r2) goto L_0x03e6
            int r23 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x01b0
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = r23
            r23 = 13
        L_0x0198:
            int r24 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L_0x01aa
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r23
            r4 = r4 | r8
            int r23 = r23 + 13
            r8 = r24
            goto L_0x0198
        L_0x01aa:
            int r8 = r8 << r23
            r4 = r4 | r8
            r8 = r24
            goto L_0x01b2
        L_0x01b0:
            r8 = r23
        L_0x01b2:
            int r23 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L_0x01d8
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r6 = r23
            r23 = 13
        L_0x01c0:
            int r25 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r5) goto L_0x01d2
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r23
            r8 = r8 | r6
            int r23 = r23 + 13
            r6 = r25
            goto L_0x01c0
        L_0x01d2:
            int r6 = r6 << r23
            r8 = r8 | r6
            r6 = r25
            goto L_0x01da
        L_0x01d8:
            r6 = r23
        L_0x01da:
            r5 = r8 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x01e4
            int r5 = r19 + 1
            r16[r19] = r20
            r19 = r5
        L_0x01e4:
            r5 = r8 & 255(0xff, float:3.57E-43)
            r25 = r2
            r2 = r8 & 2048(0x800, float:2.87E-42)
            r26 = r14
            r14 = 51
            if (r5 < r14) goto L_0x02a1
            int r14 = r6 + 1
            char r6 = r1.charAt(r6)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x0222
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r1.charAt(r14)
            r32 = r13
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r13) goto L_0x021c
            r13 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r27
            r6 = r6 | r13
            int r27 = r27 + 13
            r14 = r31
            r13 = r32
            goto L_0x0203
        L_0x021c:
            int r13 = r14 << r27
            r6 = r6 | r13
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r13
            r14 = r27
        L_0x0226:
            int r13 = r5 + -51
            r27 = r14
            r14 = 9
            if (r13 == r14) goto L_0x0250
            r14 = 17
            if (r13 != r14) goto L_0x0233
            goto L_0x0250
        L_0x0233:
            r14 = 12
            if (r13 != r14) goto L_0x025e
            int r13 = r0.zzc()
            r14 = 1
            if (r13 == r14) goto L_0x0243
            if (r2 == 0) goto L_0x0241
            goto L_0x0243
        L_0x0241:
            r2 = 0
            goto L_0x025e
        L_0x0243:
            int r13 = r9 + 1
            int r24 = r20 / 3
            int r24 = r24 + r24
            int r24 = r24 + 1
            r9 = r15[r9]
            r12[r24] = r9
            goto L_0x025d
        L_0x0250:
            r14 = 1
            int r13 = r9 + 1
            int r24 = r20 / 3
            int r24 = r24 + r24
            int r28 = r24 + 1
            r9 = r15[r9]
            r12[r28] = r9
        L_0x025d:
            r9 = r13
        L_0x025e:
            int r6 = r6 + r6
            r13 = r15[r6]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0268
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x0270
        L_0x0268:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = zzC(r3, r13)
            r15[r6] = r13
        L_0x0270:
            long r13 = r10.objectFieldOffset(r13)
            int r13 = (int) r13
            int r6 = r6 + 1
            r14 = r15[r6]
            r28 = r2
            boolean r2 = r14 instanceof java.lang.reflect.Field
            if (r2 == 0) goto L_0x0282
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x028a
        L_0x0282:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = zzC(r3, r14)
            r15[r6] = r14
        L_0x028a:
            r2 = r13
            long r13 = r10.objectFieldOffset(r14)
            int r6 = (int) r13
            r13 = r9
            r29 = r27
            r27 = r4
            r9 = r6
            r6 = 0
            r4 = r1
            r33 = r28
            r28 = r0
            r0 = r2
            r2 = r33
            goto L_0x03a6
        L_0x02a1:
            r32 = r13
            int r13 = r9 + 1
            r14 = r15[r9]
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = zzC(r3, r14)
            r27 = r4
            r4 = 9
            if (r5 == r4) goto L_0x032b
            r4 = 17
            if (r5 != r4) goto L_0x02b9
            goto L_0x032b
        L_0x02b9:
            r4 = 27
            if (r5 == r4) goto L_0x031b
            r4 = 49
            if (r5 != r4) goto L_0x02c7
            int r9 = r9 + 2
            r28 = r0
            r0 = 1
            goto L_0x0320
        L_0x02c7:
            r4 = 12
            if (r5 == r4) goto L_0x0301
            r4 = 30
            if (r5 == r4) goto L_0x0301
            r4 = 44
            if (r5 != r4) goto L_0x02d4
            goto L_0x0301
        L_0x02d4:
            r4 = 50
            if (r5 != r4) goto L_0x02fd
            int r4 = r9 + 2
            int r28 = r21 + 1
            r16[r21] = r20
            int r21 = r20 / 3
            r13 = r15[r13]
            int r21 = r21 + r21
            r12[r21] = r13
            if (r2 == 0) goto L_0x02f6
            int r21 = r21 + 1
            int r13 = r9 + 3
            r4 = r15[r4]
            r12[r21] = r4
            r4 = r1
            r21 = r28
            r28 = r0
            goto L_0x0339
        L_0x02f6:
            r13 = r4
            r21 = r28
            r2 = 0
            r28 = r0
            goto L_0x0338
        L_0x02fd:
            r28 = r0
            r0 = 1
            goto L_0x0338
        L_0x0301:
            int r4 = r0.zzc()
            r28 = r0
            r0 = 1
            if (r4 == r0) goto L_0x0310
            if (r2 == 0) goto L_0x030d
            goto L_0x0310
        L_0x030d:
            r4 = r1
            r2 = 0
            goto L_0x0339
        L_0x0310:
            int r9 = r9 + 2
            int r4 = r20 / 3
            int r4 = r4 + r4
            int r4 = r4 + r0
            r13 = r15[r13]
            r12[r4] = r13
            goto L_0x0328
        L_0x031b:
            r28 = r0
            r0 = 1
            int r9 = r9 + 2
        L_0x0320:
            int r4 = r20 / 3
            int r4 = r4 + r4
            int r4 = r4 + r0
            r13 = r15[r13]
            r12[r4] = r13
        L_0x0328:
            r4 = r1
            r13 = r9
            goto L_0x0339
        L_0x032b:
            r28 = r0
            r0 = 1
            int r4 = r20 / 3
            int r4 = r4 + r4
            int r4 = r4 + r0
            java.lang.Class r9 = r14.getType()
            r12[r4] = r9
        L_0x0338:
            r4 = r1
        L_0x0339:
            long r0 = r10.objectFieldOffset(r14)
            int r0 = (int) r0
            r1 = r8 & 4096(0x1000, float:5.74E-42)
            r9 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 == 0) goto L_0x0391
            r1 = 17
            if (r5 > r1) goto L_0x0391
            int r1 = r6 + 1
            char r6 = r4.charAt(r6)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x036d
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0358:
            int r23 = r1 + 1
            char r1 = r4.charAt(r1)
            if (r1 < r14) goto L_0x0369
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r9
            r6 = r6 | r1
            int r9 = r9 + 13
            r1 = r23
            goto L_0x0358
        L_0x0369:
            int r1 = r1 << r9
            r6 = r6 | r1
            r1 = r23
        L_0x036d:
            int r9 = r7 + r7
            int r23 = r6 / 32
            int r9 = r9 + r23
            r14 = r15[r9]
            r29 = r1
            boolean r1 = r14 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x037e
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x0386
        L_0x037e:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = zzC(r3, r14)
            r15[r9] = r14
        L_0x0386:
            r30 = r2
            long r1 = r10.objectFieldOffset(r14)
            int r1 = (int) r1
            int r6 = r6 % 32
            r9 = r1
            goto L_0x0396
        L_0x0391:
            r30 = r2
            r29 = r6
            r6 = 0
        L_0x0396:
            r1 = 18
            if (r5 < r1) goto L_0x03a4
            r1 = 49
            if (r5 > r1) goto L_0x03a4
            int r1 = r22 + 1
            r16[r22] = r0
            r22 = r1
        L_0x03a4:
            r2 = r30
        L_0x03a6:
            int r1 = r20 + 1
            r11[r20] = r27
            int r14 = r20 + 2
            r27 = r3
            r3 = r8 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03b5
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b6
        L_0x03b5:
            r3 = 0
        L_0x03b6:
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x03bd
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03be
        L_0x03bd:
            r8 = 0
        L_0x03be:
            if (r2 == 0) goto L_0x03c3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x03c4
        L_0x03c3:
            r2 = 0
        L_0x03c4:
            int r5 = r5 << 20
            r3 = r3 | r8
            r2 = r2 | r3
            r2 = r2 | r5
            r0 = r0 | r2
            r11[r1] = r0
            int r20 = r20 + 3
            int r0 = r6 << 20
            r0 = r0 | r9
            r11[r14] = r0
            r1 = r4
            r9 = r13
            r2 = r25
            r14 = r26
            r3 = r27
            r0 = r28
            r4 = r29
            r13 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0188
        L_0x03e6:
            r28 = r0
            r32 = r13
            r26 = r14
            com.google.android.gms.internal.ads.zzhav r0 = new com.google.android.gms.internal.ads.zzhav
            com.google.android.gms.internal.ads.zzhas r14 = r28.zza()
            r15 = 0
            r9 = r0
            r10 = r11
            r11 = r12
            r12 = r32
            r13 = r26
            r19 = r36
            r20 = r37
            r21 = r38
            r22 = r39
            r23 = r40
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        L_0x0408:
            com.google.android.gms.internal.ads.zzhbu r0 = (com.google.android.gms.internal.ads.zzhbu) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhav.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzhap, com.google.android.gms.internal.ads.zzhay, com.google.android.gms.internal.ads.zzhaf, com.google.android.gms.internal.ads.zzhbx, com.google.android.gms.internal.ads.zzgys, com.google.android.gms.internal.ads.zzhan):com.google.android.gms.internal.ads.zzhav");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzhce.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzhce.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzhce.zzh(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzhce.zzh(obj, j)).longValue();
    }

    private final zzgzn zzw(int i) {
        int i2 = i / 3;
        return (zzgzn) this.zzd[i2 + i2 + 1];
    }

    private final zzhbl zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzhbl zzhbl = (zzhbl) objArr[i3];
        if (zzhbl != null) {
            return zzhbl;
        }
        zzhbl zzb2 = zzhbc.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzhbx zzhbx, Object obj3) {
        int i2 = this.zzc[i];
        Object zzh2 = zzhce.zzh(obj, (long) (zzu(i) & 1048575));
        if (zzh2 == null || zzw(i) == null) {
            return obj2;
        }
        zzham zzham = (zzham) zzh2;
        zzhal zzhal = (zzhal) zzz(i);
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0378, code lost:
        r1 = (r1 + r2) + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x037a, code lost:
        r12 = r12 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0398, code lost:
        r1 = r1 * r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x054c, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x055e, code lost:
        r12 = r12 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x066e, code lost:
        r0 = r0 + (r2 + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x06d7, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0760, code lost:
        r0 = r0 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0777, code lost:
        r0 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x078f, code lost:
        r0 = r0 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            sun.misc.Unsafe r8 = zzb
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r9
            r11 = r1
            r12 = r11
            r0 = r10
        L_0x000e:
            int[] r2 = r6.zzc
            int r3 = r2.length
            if (r11 >= r3) goto L_0x079e
            int r3 = r6.zzu(r11)
            int r4 = zzt(r3)
            r13 = r2[r11]
            int r5 = r11 + 2
            r2 = r2[r5]
            r5 = r2 & r10
            r14 = 17
            r15 = 1
            if (r4 > r14) goto L_0x003e
            if (r5 == r0) goto L_0x0035
            if (r5 != r10) goto L_0x002e
            r0 = r9
            goto L_0x0033
        L_0x002e:
            long r0 = (long) r5
            int r0 = r8.getInt(r7, r0)
        L_0x0033:
            r1 = r0
            r0 = r5
        L_0x0035:
            int r2 = r2 >>> 20
            int r2 = r15 << r2
            r14 = r0
            r16 = r1
            r5 = r2
            goto L_0x0042
        L_0x003e:
            r14 = r0
            r16 = r1
            r5 = r9
        L_0x0042:
            r0 = r3 & r10
            com.google.android.gms.internal.ads.zzgyx r1 = com.google.android.gms.internal.ads.zzgyx.DOUBLE_LIST_PACKED
            int r1 = r1.zza()
            if (r4 < r1) goto L_0x0051
            com.google.android.gms.internal.ads.zzgyx r1 = com.google.android.gms.internal.ads.zzgyx.SINT64_LIST_PACKED
            r1.zza()
        L_0x0051:
            long r2 = (long) r0
            r17 = 63
            switch(r4) {
                case 0: goto L_0x077b;
                case 1: goto L_0x0763;
                case 2: goto L_0x0743;
                case 3: goto L_0x0725;
                case 4: goto L_0x0706;
                case 5: goto L_0x06f0;
                case 6: goto L_0x06da;
                case 7: goto L_0x06c3;
                case 8: goto L_0x068f;
                case 9: goto L_0x0672;
                case 10: goto L_0x064b;
                case 11: goto L_0x062c;
                case 12: goto L_0x060c;
                case 13: goto L_0x05f6;
                case 14: goto L_0x05e0;
                case 15: goto L_0x05bc;
                case 16: goto L_0x0598;
                case 17: goto L_0x0579;
                case 18: goto L_0x056c;
                case 19: goto L_0x0561;
                case 20: goto L_0x053e;
                case 21: goto L_0x0522;
                case 22: goto L_0x0506;
                case 23: goto L_0x04fa;
                case 24: goto L_0x04ee;
                case 25: goto L_0x04d4;
                case 26: goto L_0x0473;
                case 27: goto L_0x0433;
                case 28: goto L_0x0401;
                case 29: goto L_0x03e7;
                case 30: goto L_0x03cd;
                case 31: goto L_0x03c1;
                case 32: goto L_0x03b5;
                case 33: goto L_0x039b;
                case 34: goto L_0x037d;
                case 35: goto L_0x0362;
                case 36: goto L_0x034b;
                case 37: goto L_0x0334;
                case 38: goto L_0x031d;
                case 39: goto L_0x0306;
                case 40: goto L_0x02ee;
                case 41: goto L_0x02d6;
                case 42: goto L_0x02bc;
                case 43: goto L_0x02a4;
                case 44: goto L_0x028c;
                case 45: goto L_0x0274;
                case 46: goto L_0x025c;
                case 47: goto L_0x0244;
                case 48: goto L_0x022c;
                case 49: goto L_0x0203;
                case 50: goto L_0x01d3;
                case 51: goto L_0x01c5;
                case 52: goto L_0x01b7;
                case 53: goto L_0x01a1;
                case 54: goto L_0x018b;
                case 55: goto L_0x0174;
                case 56: goto L_0x0166;
                case 57: goto L_0x0158;
                case 58: goto L_0x014a;
                case 59: goto L_0x011e;
                case 60: goto L_0x010a;
                case 61: goto L_0x00ee;
                case 62: goto L_0x00d8;
                case 63: goto L_0x00c1;
                case 64: goto L_0x00b3;
                case 65: goto L_0x00a5;
                case 66: goto L_0x008a;
                case 67: goto L_0x006f;
                case 68: goto L_0x0059;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x0793
        L_0x0059:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            java.lang.Object r0 = r8.getObject(r7, r2)
            com.google.android.gms.internal.ads.zzhas r0 = (com.google.android.gms.internal.ads.zzhas) r0
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r11)
            int r0 = com.google.android.gms.internal.ads.zzgym.zzy(r13, r0, r1)
            goto L_0x0576
        L_0x006f:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            long r1 = zzv(r7, r2)
            long r3 = r1 + r1
            long r1 = r1 >> r17
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            long r1 = r1 ^ r3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzE(r1)
            goto L_0x0760
        L_0x008a:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r1 = zzp(r7, r2)
            int r2 = r1 + r1
            int r1 = r1 >> 31
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            r1 = r1 ^ r2
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            goto L_0x0760
        L_0x00a5:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x078f
        L_0x00b3:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0777
        L_0x00c1:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r1 = zzp(r7, r2)
            long r1 = (long) r1
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzE(r1)
            goto L_0x0760
        L_0x00d8:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r1 = zzp(r7, r2)
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            goto L_0x0760
        L_0x00ee:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            java.lang.Object r1 = r8.getObject(r7, r2)
            com.google.android.gms.internal.ads.zzgxz r1 = (com.google.android.gms.internal.ads.zzgxz) r1
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = r1.zzd()
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            goto L_0x066e
        L_0x010a:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            java.lang.Object r0 = r8.getObject(r7, r2)
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r11)
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzh(r13, r0, r1)
            goto L_0x0576
        L_0x011e:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            java.lang.Object r1 = r8.getObject(r7, r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzgxz
            if (r2 == 0) goto L_0x013e
            com.google.android.gms.internal.ads.zzgxz r1 = (com.google.android.gms.internal.ads.zzgxz) r1
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = r1.zzd()
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            goto L_0x066e
        L_0x013e:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzC(r1)
            goto L_0x0760
        L_0x014a:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x06d7
        L_0x0158:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0777
        L_0x0166:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x078f
        L_0x0174:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r1 = zzp(r7, r2)
            long r1 = (long) r1
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzE(r1)
            goto L_0x0760
        L_0x018b:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            long r1 = zzv(r7, r2)
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzE(r1)
            goto L_0x0760
        L_0x01a1:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            long r1 = zzv(r7, r2)
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzE(r1)
            goto L_0x0760
        L_0x01b7:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0777
        L_0x01c5:
            boolean r0 = r6.zzR(r7, r13, r11)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x078f
        L_0x01d3:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.lang.Object r1 = r6.zzz(r11)
            com.google.android.gms.internal.ads.zzham r0 = (com.google.android.gms.internal.ads.zzham) r0
            com.google.android.gms.internal.ads.zzhal r1 = (com.google.android.gms.internal.ads.zzhal) r1
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0793
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x01f5
            goto L_0x0793
        L_0x01f5:
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            r0.getValue()
            r0 = 0
            throw r0
        L_0x0203:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r11)
            int r2 = com.google.android.gms.internal.ads.zzhbn.zza
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0217
            r4 = r9
            goto L_0x0229
        L_0x0217:
            r3 = r9
            r4 = r3
        L_0x0219:
            if (r3 >= r2) goto L_0x0229
            java.lang.Object r5 = r0.get(r3)
            com.google.android.gms.internal.ads.zzhas r5 = (com.google.android.gms.internal.ads.zzhas) r5
            int r5 = com.google.android.gms.internal.ads.zzgym.zzy(r13, r5, r1)
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L_0x0219
        L_0x0229:
            int r12 = r12 + r4
            goto L_0x0793
        L_0x022c:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzj(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x0244:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzi(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x025c:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zze(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x0274:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzc(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x028c:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zza(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x02a4:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzk(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x02bc:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.ads.zzhbn.zza
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x02d6:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzc(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x02ee:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zze(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x0306:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzf(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x031d:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzl(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x0334:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzg(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x034b:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzc(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0378
        L_0x0362:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zze(r0)
            if (r0 <= 0) goto L_0x0793
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
        L_0x0378:
            int r1 = r1 + r2
            int r1 = r1 + r0
        L_0x037a:
            int r12 = r12 + r1
            goto L_0x0793
        L_0x037d:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.ads.zzhbn.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x038e
        L_0x038b:
            r0 = r9
            goto L_0x0576
        L_0x038e:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzj(r0)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r2)
        L_0x0398:
            int r1 = r1 * r2
            goto L_0x0760
        L_0x039b:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.ads.zzhbn.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x03aa
            goto L_0x038b
        L_0x03aa:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzi(r0)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r2)
            goto L_0x0398
        L_0x03b5:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzd(r13, r0, r9)
            goto L_0x0576
        L_0x03c1:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzb(r13, r0, r9)
            goto L_0x0576
        L_0x03cd:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.ads.zzhbn.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x03dc
            goto L_0x038b
        L_0x03dc:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzhbn.zza(r0)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r2)
            goto L_0x0398
        L_0x03e7:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.ads.zzhbn.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x03f6
            goto L_0x038b
        L_0x03f6:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzk(r0)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r2)
            goto L_0x0398
        L_0x0401:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.ads.zzhbn.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0412
            r1 = r9
            goto L_0x037a
        L_0x0412:
            int r2 = r13 << 3
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r2)
            int r1 = r1 * r2
            r2 = r9
        L_0x041a:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x037a
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.internal.ads.zzgxz r3 = (com.google.android.gms.internal.ads.zzgxz) r3
            int r3 = r3.zzd()
            int r4 = com.google.android.gms.internal.ads.zzgym.zzD(r3)
            int r4 = r4 + r3
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto L_0x041a
        L_0x0433:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r11)
            int r2 = com.google.android.gms.internal.ads.zzhbn.zza
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0447
            r3 = r9
            goto L_0x0470
        L_0x0447:
            int r3 = r13 << 3
            int r3 = com.google.android.gms.internal.ads.zzgym.zzD(r3)
            int r3 = r3 * r2
            r4 = r9
        L_0x044f:
            if (r4 >= r2) goto L_0x0470
            java.lang.Object r5 = r0.get(r4)
            boolean r13 = r5 instanceof com.google.android.gms.internal.ads.zzhad
            if (r13 == 0) goto L_0x0466
            com.google.android.gms.internal.ads.zzhad r5 = (com.google.android.gms.internal.ads.zzhad) r5
            int r5 = r5.zza()
            int r13 = com.google.android.gms.internal.ads.zzgym.zzD(r5)
            int r13 = r13 + r5
            int r3 = r3 + r13
            goto L_0x046d
        L_0x0466:
            com.google.android.gms.internal.ads.zzhas r5 = (com.google.android.gms.internal.ads.zzhas) r5
            int r5 = com.google.android.gms.internal.ads.zzgym.zzA(r5, r1)
            int r3 = r3 + r5
        L_0x046d:
            int r4 = r4 + 1
            goto L_0x044f
        L_0x0470:
            int r12 = r12 + r3
            goto L_0x0793
        L_0x0473:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.ads.zzhbn.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0483
            goto L_0x054c
        L_0x0483:
            int r2 = r13 << 3
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r2)
            int r2 = r2 * r1
            boolean r3 = r0 instanceof com.google.android.gms.internal.ads.zzhae
            if (r3 == 0) goto L_0x04b2
            com.google.android.gms.internal.ads.zzhae r0 = (com.google.android.gms.internal.ads.zzhae) r0
            r3 = r9
        L_0x0491:
            if (r3 >= r1) goto L_0x055e
            java.lang.Object r4 = r0.zzc()
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzgxz
            if (r5 == 0) goto L_0x04a8
            com.google.android.gms.internal.ads.zzgxz r4 = (com.google.android.gms.internal.ads.zzgxz) r4
            int r4 = r4.zzd()
            int r5 = com.google.android.gms.internal.ads.zzgym.zzD(r4)
            int r5 = r5 + r4
            int r2 = r2 + r5
            goto L_0x04af
        L_0x04a8:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.zzgym.zzC(r4)
            int r2 = r2 + r4
        L_0x04af:
            int r3 = r3 + 1
            goto L_0x0491
        L_0x04b2:
            r3 = r9
        L_0x04b3:
            if (r3 >= r1) goto L_0x055e
            java.lang.Object r4 = r0.get(r3)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzgxz
            if (r5 == 0) goto L_0x04ca
            com.google.android.gms.internal.ads.zzgxz r4 = (com.google.android.gms.internal.ads.zzgxz) r4
            int r4 = r4.zzd()
            int r5 = com.google.android.gms.internal.ads.zzgym.zzD(r4)
            int r5 = r5 + r4
            int r2 = r2 + r5
            goto L_0x04d1
        L_0x04ca:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.zzgym.zzC(r4)
            int r2 = r2 + r4
        L_0x04d1:
            int r3 = r3 + 1
            goto L_0x04b3
        L_0x04d4:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.ads.zzhbn.zza
            int r0 = r0.size()
            if (r0 != 0) goto L_0x04e4
            goto L_0x038b
        L_0x04e4:
            int r1 = r13 << 3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r1 = r1 + r15
            int r0 = r0 * r1
            goto L_0x0576
        L_0x04ee:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzb(r13, r0, r9)
            goto L_0x0576
        L_0x04fa:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzd(r13, r0, r9)
            goto L_0x0576
        L_0x0506:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.ads.zzhbn.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0516
            goto L_0x038b
        L_0x0516:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzf(r0)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r2)
            goto L_0x0398
        L_0x0522:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.ads.zzhbn.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0532
            goto L_0x038b
        L_0x0532:
            int r2 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzl(r0)
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r2)
            goto L_0x0398
        L_0x053e:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r1 = com.google.android.gms.internal.ads.zzhbn.zza
            int r1 = r0.size()
            if (r1 != 0) goto L_0x054e
        L_0x054c:
            r2 = r9
            goto L_0x055e
        L_0x054e:
            int r1 = r13 << 3
            int r2 = com.google.android.gms.internal.ads.zzhbn.zzg(r0)
            int r0 = r0.size()
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
        L_0x055e:
            int r12 = r12 + r2
            goto L_0x0793
        L_0x0561:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzb(r13, r0, r9)
            goto L_0x0576
        L_0x056c:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzd(r13, r0, r9)
        L_0x0576:
            int r12 = r12 + r0
            goto L_0x0793
        L_0x0579:
            r0 = r19
            r1 = r20
            r3 = r2
            r2 = r11
            r9 = r3
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.android.gms.internal.ads.zzhas r0 = (com.google.android.gms.internal.ads.zzhas) r0
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r11)
            int r0 = com.google.android.gms.internal.ads.zzgym.zzy(r13, r0, r1)
            goto L_0x0576
        L_0x0598:
            r9 = r2
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            long r1 = r8.getLong(r7, r9)
            long r3 = r1 + r1
            long r1 = r1 >> r17
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            long r1 = r1 ^ r3
            int r1 = com.google.android.gms.internal.ads.zzgym.zzE(r1)
            goto L_0x0760
        L_0x05bc:
            r9 = r2
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r1 = r8.getInt(r7, r9)
            int r2 = r1 + r1
            int r1 = r1 >> 31
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            r1 = r1 ^ r2
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            goto L_0x0760
        L_0x05e0:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x078f
        L_0x05f6:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0777
        L_0x060c:
            r9 = r2
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r1 = r8.getInt(r7, r9)
            long r1 = (long) r1
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzE(r1)
            goto L_0x0760
        L_0x062c:
            r9 = r2
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r1 = r8.getInt(r7, r9)
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            goto L_0x0760
        L_0x064b:
            r9 = r2
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            java.lang.Object r1 = r8.getObject(r7, r9)
            com.google.android.gms.internal.ads.zzgxz r1 = (com.google.android.gms.internal.ads.zzgxz) r1
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = r1.zzd()
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
        L_0x066e:
            int r2 = r2 + r1
            int r0 = r0 + r2
            goto L_0x0576
        L_0x0672:
            r9 = r2
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r11)
            int r0 = com.google.android.gms.internal.ads.zzhbn.zzh(r13, r0, r1)
            goto L_0x0576
        L_0x068f:
            r9 = r2
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            java.lang.Object r1 = r8.getObject(r7, r9)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzgxz
            if (r2 == 0) goto L_0x06b7
            com.google.android.gms.internal.ads.zzgxz r1 = (com.google.android.gms.internal.ads.zzgxz) r1
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = r1.zzd()
            int r2 = com.google.android.gms.internal.ads.zzgym.zzD(r1)
            goto L_0x066e
        L_0x06b7:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzC(r1)
            goto L_0x0760
        L_0x06c3:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
        L_0x06d7:
            int r0 = r0 + r15
            goto L_0x0576
        L_0x06da:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x0777
        L_0x06f0:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            goto L_0x078f
        L_0x0706:
            r9 = r2
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r1 = r8.getInt(r7, r9)
            long r1 = (long) r1
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzE(r1)
            goto L_0x0760
        L_0x0725:
            r9 = r2
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            long r1 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzE(r1)
            goto L_0x0760
        L_0x0743:
            r9 = r2
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            long r1 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
            int r1 = com.google.android.gms.internal.ads.zzgym.zzE(r1)
        L_0x0760:
            int r0 = r0 + r1
            goto L_0x0576
        L_0x0763:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
        L_0x0777:
            int r0 = r0 + 4
            goto L_0x0576
        L_0x077b:
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0793
            int r0 = r13 << 3
            int r0 = com.google.android.gms.internal.ads.zzgym.zzD(r0)
        L_0x078f:
            int r0 = r0 + 8
            goto L_0x0576
        L_0x0793:
            int r11 = r11 + 3
            r0 = r14
            r1 = r16
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000e
        L_0x079e:
            r0 = r7
            com.google.android.gms.internal.ads.zzgzh r0 = (com.google.android.gms.internal.ads.zzgzh) r0
            com.google.android.gms.internal.ads.zzhby r0 = r0.zzt
            r1 = r0
            com.google.android.gms.internal.ads.zzhby r1 = (com.google.android.gms.internal.ads.zzhby) r1
            int r0 = r0.zza()
            int r12 = r12 + r0
            boolean r0 = r6.zzh
            if (r0 == 0) goto L_0x0800
            r0 = r7
            com.google.android.gms.internal.ads.zzgzd r0 = (com.google.android.gms.internal.ads.zzgzd) r0
            com.google.android.gms.internal.ads.zzgyw r0 = r0.zza
            com.google.android.gms.internal.ads.zzhbt r0 = r0.zza
            int r1 = r0.zzc()
            r9 = 0
            r18 = 0
        L_0x07bd:
            if (r9 >= r1) goto L_0x07d9
            java.util.Map$Entry r2 = r0.zzg(r9)
            r3 = r2
            com.google.android.gms.internal.ads.zzhbp r3 = (com.google.android.gms.internal.ads.zzhbp) r3
            java.lang.Comparable r3 = r3.zza()
            com.google.android.gms.internal.ads.zzgyv r3 = (com.google.android.gms.internal.ads.zzgyv) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.ads.zzgyw.zzc(r3, r2)
            int r18 = r18 + r2
            int r9 = r9 + 1
            goto L_0x07bd
        L_0x07d9:
            java.lang.Iterable r0 = r0.zzd()
            java.util.Iterator r0 = r0.iterator()
        L_0x07e1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x07fe
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.ads.zzgyv r2 = (com.google.android.gms.internal.ads.zzgyv) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.ads.zzgyw.zzc(r2, r1)
            int r18 = r18 + r1
            goto L_0x07e1
        L_0x07fe:
            int r12 = r12 + r18
        L_0x0800:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhav.zza(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b6, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0210, code lost:
        r2 = (int) (r2 ^ (r2 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0214, code lost:
        r1 = r1 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int[] r2 = r8.zzc
            int r3 = r2.length
            if (r0 >= r3) goto L_0x0219
            int r3 = r8.zzu(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = zzt(r3)
            r2 = r2[r0]
            long r4 = (long) r4
            r6 = 37
            r7 = 32
            switch(r3) {
                case 0: goto L_0x0204;
                case 1: goto L_0x01f9;
                case 2: goto L_0x01f0;
                case 3: goto L_0x01e7;
                case 4: goto L_0x01e0;
                case 5: goto L_0x01d7;
                case 6: goto L_0x01d0;
                case 7: goto L_0x01c5;
                case 8: goto L_0x01b8;
                case 9: goto L_0x01aa;
                case 10: goto L_0x019e;
                case 11: goto L_0x0196;
                case 12: goto L_0x018e;
                case 13: goto L_0x0186;
                case 14: goto L_0x017c;
                case 15: goto L_0x0174;
                case 16: goto L_0x016a;
                case 17: goto L_0x015d;
                case 18: goto L_0x0151;
                case 19: goto L_0x0151;
                case 20: goto L_0x0151;
                case 21: goto L_0x0151;
                case 22: goto L_0x0151;
                case 23: goto L_0x0151;
                case 24: goto L_0x0151;
                case 25: goto L_0x0151;
                case 26: goto L_0x0151;
                case 27: goto L_0x0151;
                case 28: goto L_0x0151;
                case 29: goto L_0x0151;
                case 30: goto L_0x0151;
                case 31: goto L_0x0151;
                case 32: goto L_0x0151;
                case 33: goto L_0x0151;
                case 34: goto L_0x0151;
                case 35: goto L_0x0151;
                case 36: goto L_0x0151;
                case 37: goto L_0x0151;
                case 38: goto L_0x0151;
                case 39: goto L_0x0151;
                case 40: goto L_0x0151;
                case 41: goto L_0x0151;
                case 42: goto L_0x0151;
                case 43: goto L_0x0151;
                case 44: goto L_0x0151;
                case 45: goto L_0x0151;
                case 46: goto L_0x0151;
                case 47: goto L_0x0151;
                case 48: goto L_0x0151;
                case 49: goto L_0x0151;
                case 50: goto L_0x0145;
                case 51: goto L_0x0131;
                case 52: goto L_0x011f;
                case 53: goto L_0x010f;
                case 54: goto L_0x00ff;
                case 55: goto L_0x00f1;
                case 56: goto L_0x00e1;
                case 57: goto L_0x00d3;
                case 58: goto L_0x00c1;
                case 59: goto L_0x00ad;
                case 60: goto L_0x009b;
                case 61: goto L_0x0089;
                case 62: goto L_0x007b;
                case 63: goto L_0x006d;
                case 64: goto L_0x005f;
                case 65: goto L_0x004f;
                case 66: goto L_0x0041;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0215
        L_0x001f:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhce.zzh(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0214
        L_0x0031:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            long r2 = zzv(r9, r4)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
            goto L_0x0210
        L_0x0041:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            int r2 = zzp(r9, r4)
            goto L_0x0214
        L_0x004f:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            long r2 = zzv(r9, r4)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
            goto L_0x0210
        L_0x005f:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            int r2 = zzp(r9, r4)
            goto L_0x0214
        L_0x006d:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            int r2 = zzp(r9, r4)
            goto L_0x0214
        L_0x007b:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            int r2 = zzp(r9, r4)
            goto L_0x0214
        L_0x0089:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhce.zzh(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0214
        L_0x009b:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhce.zzh(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0214
        L_0x00ad:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhce.zzh(r9, r4)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            goto L_0x0214
        L_0x00c1:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            boolean r2 = zzS(r9, r4)
            int r2 = com.google.android.gms.internal.ads.zzgzu.zza(r2)
            goto L_0x0214
        L_0x00d3:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            int r2 = zzp(r9, r4)
            goto L_0x0214
        L_0x00e1:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            long r2 = zzv(r9, r4)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
            goto L_0x0210
        L_0x00f1:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            int r2 = zzp(r9, r4)
            goto L_0x0214
        L_0x00ff:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            long r2 = zzv(r9, r4)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
            goto L_0x0210
        L_0x010f:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            long r2 = zzv(r9, r4)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
            goto L_0x0210
        L_0x011f:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            float r2 = zzo(r9, r4)
            int r2 = java.lang.Float.floatToIntBits(r2)
            goto L_0x0214
        L_0x0131:
            boolean r2 = r8.zzR(r9, r2, r0)
            if (r2 == 0) goto L_0x0215
            int r1 = r1 * 53
            double r2 = zzn(r9, r4)
            long r2 = java.lang.Double.doubleToLongBits(r2)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
            goto L_0x0210
        L_0x0145:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhce.zzh(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0214
        L_0x0151:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhce.zzh(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0214
        L_0x015d:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhce.zzh(r9, r4)
            if (r2 == 0) goto L_0x01b6
            int r6 = r2.hashCode()
            goto L_0x01b6
        L_0x016a:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.ads.zzhce.zzf(r9, r4)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
            goto L_0x0210
        L_0x0174:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.ads.zzhce.zzd(r9, r4)
            goto L_0x0214
        L_0x017c:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.ads.zzhce.zzf(r9, r4)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
            goto L_0x0210
        L_0x0186:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.ads.zzhce.zzd(r9, r4)
            goto L_0x0214
        L_0x018e:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.ads.zzhce.zzd(r9, r4)
            goto L_0x0214
        L_0x0196:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.ads.zzhce.zzd(r9, r4)
            goto L_0x0214
        L_0x019e:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhce.zzh(r9, r4)
            int r2 = r2.hashCode()
            goto L_0x0214
        L_0x01aa:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhce.zzh(r9, r4)
            if (r2 == 0) goto L_0x01b6
            int r6 = r2.hashCode()
        L_0x01b6:
            int r1 = r1 + r6
            goto L_0x0215
        L_0x01b8:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhce.zzh(r9, r4)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            goto L_0x0214
        L_0x01c5:
            int r1 = r1 * 53
            boolean r2 = com.google.android.gms.internal.ads.zzhce.zzz(r9, r4)
            int r2 = com.google.android.gms.internal.ads.zzgzu.zza(r2)
            goto L_0x0214
        L_0x01d0:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.ads.zzhce.zzd(r9, r4)
            goto L_0x0214
        L_0x01d7:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.ads.zzhce.zzf(r9, r4)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
            goto L_0x0210
        L_0x01e0:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.ads.zzhce.zzd(r9, r4)
            goto L_0x0214
        L_0x01e7:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.ads.zzhce.zzf(r9, r4)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
            goto L_0x0210
        L_0x01f0:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.ads.zzhce.zzf(r9, r4)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
            goto L_0x0210
        L_0x01f9:
            int r1 = r1 * 53
            float r2 = com.google.android.gms.internal.ads.zzhce.zzc(r9, r4)
            int r2 = java.lang.Float.floatToIntBits(r2)
            goto L_0x0214
        L_0x0204:
            int r1 = r1 * 53
            double r2 = com.google.android.gms.internal.ads.zzhce.zzb(r9, r4)
            long r2 = java.lang.Double.doubleToLongBits(r2)
            byte[] r4 = com.google.android.gms.internal.ads.zzgzu.zzb
        L_0x0210:
            long r4 = r2 >>> r7
            long r2 = r2 ^ r4
            int r2 = (int) r2
        L_0x0214:
            int r1 = r1 + r2
        L_0x0215:
            int r0 = r0 + 3
            goto L_0x0002
        L_0x0219:
            int r1 = r1 * 53
            r0 = r9
            com.google.android.gms.internal.ads.zzgzh r0 = (com.google.android.gms.internal.ads.zzgzh) r0
            com.google.android.gms.internal.ads.zzhby r0 = r0.zzt
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x0236
            int r1 = r1 * 53
            com.google.android.gms.internal.ads.zzgzd r9 = (com.google.android.gms.internal.ads.zzgzd) r9
            com.google.android.gms.internal.ads.zzgyw r9 = r9.zza
            com.google.android.gms.internal.ads.zzhbt r9 = r9.zza
            int r9 = r9.hashCode()
            int r1 = r1 + r9
        L_0x0236:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhav.zzb(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v101, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v102, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v106, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v107, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v109, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v111, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v116, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v117, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v119, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v121, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v123, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v125, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v129, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v135, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v98, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v100, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v101, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v102, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v103, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v104, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v150, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v155, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v156, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v161, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v162, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v163, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v166, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v170, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v173, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v174, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v175, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v178, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v180, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v183, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v184, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v185, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v188, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v190, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v194, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v195, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v197, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v203, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v69, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v207, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v208, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v210, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v212, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v213, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v215, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v219, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v220, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v223, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v160, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v161, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v226, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v162, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v227, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v229, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v230, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v233, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v235, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v238, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v239, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v240, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v244, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v247, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v94, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r3v91, types: [int] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x0592 A[SYNTHETIC] */
    final int zzc(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.ads.zzgxn r40) throws java.io.IOException {
        /*
            r34 = this;
            r6 = r34
            r7 = r35
            r15 = r36
            r14 = r38
            r13 = r39
            r12 = r40
            zzD(r35)
            sun.misc.Unsafe r11 = zzb
            r16 = 0
            r10 = -1
            r0 = r37
            r1 = r10
            r2 = r16
            r3 = r2
            r4 = r3
            r5 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001e:
            if (r0 >= r14) goto L_0x0bd8
            int r3 = r0 + 1
            byte r0 = r15[r0]
            if (r0 >= 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzi(r0, r15, r3, r12)
            int r3 = r12.zza
            r8 = r3
            r3 = r0
            goto L_0x0030
        L_0x002f:
            r8 = r0
        L_0x0030:
            int r0 = r8 >>> 3
            r9 = 3
            if (r0 <= r1) goto L_0x0045
            int r2 = r2 / r9
            int r1 = r6.zze
            if (r0 < r1) goto L_0x0043
            int r1 = r6.zzf
            if (r0 > r1) goto L_0x0043
            int r1 = r6.zzs(r0, r2)
            goto L_0x0049
        L_0x0043:
            r1 = r10
            goto L_0x0049
        L_0x0045:
            int r1 = r6.zzq(r0)
        L_0x0049:
            r2 = r1
            r18 = 0
            if (r2 != r10) goto L_0x005d
            r2 = r3
            r19 = r4
            r24 = r5
            r17 = r10
            r4 = r11
            r5 = r12
            r9 = r13
            r11 = r16
            r3 = r0
            goto L_0x0b77
        L_0x005d:
            r1 = r8 & 7
            int[] r10 = r6.zzc
            int r20 = r2 + 1
            r9 = r10[r20]
            r20 = r0
            int r0 = zzt(r9)
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r9 & r17
            long r13 = (long) r13
            r21 = r8
            r22 = 0
            java.lang.String r8 = ""
            r25 = r8
            java.lang.String r8 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r26 = r8
            r8 = 17
            if (r0 > r8) goto L_0x02ec
            int r8 = r2 + 2
            r8 = r10[r8]
            int r10 = r8 >>> 20
            r24 = 1
            int r10 = r24 << r10
            r28 = r9
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r9
            r17 = r10
            if (r8 == r5) goto L_0x00ab
            if (r5 == r9) goto L_0x009e
            long r9 = (long) r5
            r11.putInt(r7, r9, r4)
            r9 = 1048575(0xfffff, float:1.469367E-39)
        L_0x009e:
            if (r8 != r9) goto L_0x00a3
            r4 = r16
            goto L_0x00a8
        L_0x00a3:
            long r4 = (long) r8
            int r4 = r11.getInt(r7, r4)
        L_0x00a8:
            r24 = r8
            goto L_0x00ad
        L_0x00ab:
            r24 = r5
        L_0x00ad:
            switch(r0) {
                case 0: goto L_0x02b2;
                case 1: goto L_0x029a;
                case 2: goto L_0x0278;
                case 3: goto L_0x0278;
                case 4: goto L_0x0265;
                case 5: goto L_0x024d;
                case 6: goto L_0x0238;
                case 7: goto L_0x021c;
                case 8: goto L_0x01c0;
                case 9: goto L_0x0193;
                case 10: goto L_0x017e;
                case 11: goto L_0x0265;
                case 12: goto L_0x013e;
                case 13: goto L_0x0238;
                case 14: goto L_0x024d;
                case 15: goto L_0x0120;
                case 16: goto L_0x00f8;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            r10 = r2
            r9 = r20
            r8 = r21
            r0 = 3
            if (r1 != r0) goto L_0x02d5
            r4 = r4 | r17
            java.lang.Object r0 = r6.zzA(r7, r10)
            int r1 = r9 << 3
            r13 = r1 | 4
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r10)
            r2 = r8
            r8 = r0
            r5 = r9
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r1
            r1 = r10
            r17 = -1
            r10 = r36
            r20 = r5
            r5 = r11
            r11 = r3
            r3 = r12
            r12 = r38
            r37 = r4
            r4 = r38
            r14 = r40
            int r8 = com.google.android.gms.internal.ads.zzgxo.zzl(r8, r9, r10, r11, r12, r13, r14)
            r6.zzJ(r7, r1, r0)
            r13 = r39
            r12 = r3
            r14 = r4
            r11 = r5
            r0 = r8
            r10 = r17
            r5 = r24
            r4 = r37
            r3 = r2
            r2 = r1
            r1 = r20
            goto L_0x001e
        L_0x00f8:
            if (r1 != 0) goto L_0x011b
            r8 = r4 | r17
            int r10 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r3, r12)
            long r0 = r12.zzb
            long r4 = com.google.android.gms.internal.ads.zzgyf.zzF(r0)
            r3 = r20
            r0 = r11
            r1 = r35
            r9 = r3
            r37 = r10
            r10 = r2
            r2 = r13
            r0.putLong(r1, r2, r4)
            r0 = r37
            r14 = r38
            r13 = r39
            r4 = r8
            goto L_0x0138
        L_0x011b:
            r9 = r20
            r1 = r2
            r0 = r4
            goto L_0x0179
        L_0x0120:
            r10 = r2
            r9 = r20
            if (r1 != 0) goto L_0x0175
            r4 = r4 | r17
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r3, r12)
            int r1 = r12.zza
            int r1 = com.google.android.gms.internal.ads.zzgyf.zzD(r1)
            r11.putInt(r7, r13, r1)
            r14 = r38
            r13 = r39
        L_0x0138:
            r1 = r9
            r2 = r10
            r3 = r21
            goto L_0x02d0
        L_0x013e:
            r10 = r2
            r9 = r20
            if (r1 != 0) goto L_0x0175
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r3, r12)
            int r1 = r12.zza
            com.google.android.gms.internal.ads.zzgzn r2 = r6.zzw(r10)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r28 & r3
            if (r3 == 0) goto L_0x016c
            if (r2 == 0) goto L_0x016c
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x015c
            goto L_0x016c
        L_0x015c:
            com.google.android.gms.internal.ads.zzhby r2 = zzd(r35)
            long r13 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r8 = r21
            r2.zzj(r8, r1)
            goto L_0x02c9
        L_0x016c:
            r8 = r21
            r4 = r4 | r17
            r11.putInt(r7, r13, r1)
            goto L_0x02c9
        L_0x0175:
            r0 = r4
            r20 = r9
            r1 = r10
        L_0x0179:
            r5 = r11
            r2 = r21
            goto L_0x02db
        L_0x017e:
            r10 = r2
            r9 = r20
            r8 = r21
            r0 = 2
            if (r1 != r0) goto L_0x02d5
            r4 = r4 | r17
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza(r15, r3, r12)
            java.lang.Object r1 = r12.zzc
            r11.putObject(r7, r13, r1)
            goto L_0x02c9
        L_0x0193:
            r10 = r2
            r9 = r20
            r8 = r21
            r0 = 2
            if (r1 != r0) goto L_0x02d5
            r13 = r4 | r17
            java.lang.Object r14 = r6.zzA(r7, r10)
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r10)
            r0 = r14
            r2 = r36
            r4 = r38
            r5 = r40
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzm(r0, r1, r2, r3, r4, r5)
            r6.zzJ(r7, r10, r14)
            r14 = r38
            r3 = r8
            r1 = r9
            r2 = r10
            r4 = r13
            r5 = r24
            r10 = -1
            r13 = r39
            goto L_0x001e
        L_0x01c0:
            r10 = r2
            r9 = r20
            r8 = r21
            r0 = 2
            if (r1 != r0) goto L_0x02d5
            boolean r0 = zzM(r28)
            if (r0 == 0) goto L_0x01f0
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r3, r12)
            int r1 = r12.zza
            if (r1 < 0) goto L_0x01e8
            r2 = r4 | r17
            if (r1 != 0) goto L_0x01df
            r5 = r25
            r12.zzc = r5
            goto L_0x01e6
        L_0x01df:
            java.lang.String r3 = com.google.android.gms.internal.ads.zzhcj.zzh(r15, r0, r1)
            r12.zzc = r3
            int r0 = r0 + r1
        L_0x01e6:
            r4 = r2
            goto L_0x020f
        L_0x01e8:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r2 = r26
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x01f0:
            r5 = r25
            r2 = r26
            r0 = r4 | r17
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r3, r12)
            int r3 = r12.zza
            if (r3 < 0) goto L_0x0216
            if (r3 != 0) goto L_0x0203
            r12.zzc = r5
            goto L_0x020d
        L_0x0203:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.android.gms.internal.ads.zzgzu.zza
            r2.<init>(r15, r1, r3, r4)
            r12.zzc = r2
            int r1 = r1 + r3
        L_0x020d:
            r4 = r0
            r0 = r1
        L_0x020f:
            java.lang.Object r1 = r12.zzc
            r11.putObject(r7, r13, r1)
            goto L_0x02c9
        L_0x0216:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x021c:
            r10 = r2
            r9 = r20
            r8 = r21
            if (r1 != 0) goto L_0x02d5
            r4 = r4 | r17
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r3, r12)
            long r1 = r12.zzb
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x0231
            r1 = 1
            goto L_0x0233
        L_0x0231:
            r1 = r16
        L_0x0233:
            com.google.android.gms.internal.ads.zzhce.zzp(r7, r13, r1)
            goto L_0x02c9
        L_0x0238:
            r10 = r2
            r9 = r20
            r8 = r21
            r0 = 5
            if (r1 != r0) goto L_0x02d5
            int r0 = r3 + 4
            r4 = r4 | r17
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzb(r15, r3)
            r11.putInt(r7, r13, r1)
            goto L_0x02c9
        L_0x024d:
            r10 = r2
            r9 = r20
            r8 = r21
            r0 = 1
            if (r1 != r0) goto L_0x02d5
            int r18 = r3 + 8
            r17 = r4 | r17
            long r4 = com.google.android.gms.internal.ads.zzgxo.zzn(r15, r3)
            r0 = r11
            r1 = r35
            r2 = r13
            r0.putLong(r1, r2, r4)
            goto L_0x028e
        L_0x0265:
            r10 = r2
            r9 = r20
            r8 = r21
            if (r1 != 0) goto L_0x02d5
            r4 = r4 | r17
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r3, r12)
            int r1 = r12.zza
            r11.putInt(r7, r13, r1)
            goto L_0x02c9
        L_0x0278:
            r10 = r2
            r9 = r20
            r8 = r21
            if (r1 != 0) goto L_0x02d5
            r17 = r4 | r17
            int r18 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r3, r12)
            long r4 = r12.zzb
            r0 = r11
            r1 = r35
            r2 = r13
            r0.putLong(r1, r2, r4)
        L_0x028e:
            r14 = r38
            r13 = r39
            r3 = r8
            r1 = r9
            r2 = r10
            r4 = r17
            r0 = r18
            goto L_0x02d0
        L_0x029a:
            r10 = r2
            r9 = r20
            r8 = r21
            r0 = 5
            if (r1 != r0) goto L_0x02d5
            int r0 = r3 + 4
            r4 = r4 | r17
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzb(r15, r3)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            com.google.android.gms.internal.ads.zzhce.zzs(r7, r13, r1)
            goto L_0x02c9
        L_0x02b2:
            r10 = r2
            r9 = r20
            r8 = r21
            r0 = 1
            if (r1 != r0) goto L_0x02d5
            int r0 = r3 + 8
            r4 = r4 | r17
            long r1 = com.google.android.gms.internal.ads.zzgxo.zzn(r15, r3)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            com.google.android.gms.internal.ads.zzhce.zzr(r7, r13, r1)
        L_0x02c9:
            r14 = r38
            r13 = r39
            r3 = r8
            r1 = r9
            r2 = r10
        L_0x02d0:
            r5 = r24
            r10 = -1
            goto L_0x001e
        L_0x02d5:
            r0 = r4
            r2 = r8
            r20 = r9
            r1 = r10
            r5 = r11
        L_0x02db:
            r17 = -1
            r4 = r38
            r9 = r39
            r19 = r0
            r11 = r1
            r8 = r2
            r2 = r3
            r4 = r5
            r5 = r12
            r3 = r20
            goto L_0x0b77
        L_0x02ec:
            r8 = r2
            r19 = r4
            r24 = r5
            r28 = r9
            r5 = r11
            r11 = r21
            r9 = r25
            r2 = r26
            r17 = -1
            r4 = r38
            r12 = 27
            if (r0 != r12) goto L_0x0353
            r12 = 2
            if (r1 != r12) goto L_0x034b
            java.lang.Object r0 = r5.getObject(r7, r13)
            com.google.android.gms.internal.ads.zzgzt r0 = (com.google.android.gms.internal.ads.zzgzt) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0322
            int r1 = r0.size()
            if (r1 != 0) goto L_0x031a
            r1 = 10
            goto L_0x031b
        L_0x031a:
            int r1 = r1 + r1
        L_0x031b:
            com.google.android.gms.internal.ads.zzgzt r0 = r0.zzf(r1)
            r5.putObject(r7, r13, r0)
        L_0x0322:
            r13 = r0
            com.google.android.gms.internal.ads.zzhbl r0 = r6.zzx(r8)
            r1 = r8
            r8 = r0
            r0 = r20
            r9 = r11
            r10 = r36
            r2 = r11
            r11 = r3
            r3 = r40
            r12 = r38
            r14 = r40
            int r8 = com.google.android.gms.internal.ads.zzgxo.zze(r8, r9, r10, r11, r12, r13, r14)
            r13 = r39
            r12 = r3
            r14 = r4
            r11 = r5
            r10 = r17
            r4 = r19
            r5 = r24
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r8
            goto L_0x001e
        L_0x034b:
            r12 = r40
            r4 = r5
            r5 = r3
            r3 = r20
            goto L_0x0903
        L_0x0353:
            r12 = r40
            r25 = r9
            r33 = r10
            r10 = r8
            r8 = r20
            r20 = r33
            r9 = 49
            r26 = r2
            java.lang.String r2 = "Protocol message had invalid UTF-8."
            if (r0 > r9) goto L_0x08d0
            r21 = r8
            r9 = r28
            long r8 = (long) r9
            java.lang.Object r20 = r5.getObject(r7, r13)
            r28 = r2
            r2 = r20
            com.google.android.gms.internal.ads.zzgzt r2 = (com.google.android.gms.internal.ads.zzgzt) r2
            boolean r20 = r2.zzc()
            if (r20 != 0) goto L_0x038b
            int r20 = r2.size()
            r29 = r8
            int r8 = r20 + r20
            com.google.android.gms.internal.ads.zzgzt r2 = r2.zzf(r8)
            r5.putObject(r7, r13, r2)
            goto L_0x038d
        L_0x038b:
            r29 = r8
        L_0x038d:
            r13 = r2
            java.lang.String r2 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            switch(r0) {
                case 18: goto L_0x0826;
                case 19: goto L_0x07b8;
                case 20: goto L_0x076b;
                case 21: goto L_0x076b;
                case 22: goto L_0x073d;
                case 23: goto L_0x06dc;
                case 24: goto L_0x067a;
                case 25: goto L_0x0615;
                case 26: goto L_0x0539;
                case 27: goto L_0x0507;
                case 28: goto L_0x04a1;
                case 29: goto L_0x073d;
                case 30: goto L_0x0463;
                case 31: goto L_0x067a;
                case 32: goto L_0x06dc;
                case 33: goto L_0x040d;
                case 34: goto L_0x03ba;
                case 35: goto L_0x0826;
                case 36: goto L_0x07b8;
                case 37: goto L_0x076b;
                case 38: goto L_0x076b;
                case 39: goto L_0x073d;
                case 40: goto L_0x06dc;
                case 41: goto L_0x067a;
                case 42: goto L_0x0615;
                case 43: goto L_0x073d;
                case 44: goto L_0x0463;
                case 45: goto L_0x067a;
                case 46: goto L_0x06dc;
                case 47: goto L_0x040d;
                case 48: goto L_0x03ba;
                default: goto L_0x0393;
            }
        L_0x0393:
            r7 = r3
            r9 = r4
            r14 = r5
            r8 = r10
            r10 = r21
            r0 = 3
            if (r1 != r0) goto L_0x08b3
            r0 = r11 & -8
            r20 = r0 | 4
            com.google.android.gms.internal.ads.zzhbl r21 = r6.zzx(r8)
            r0 = r21
            r1 = r36
            r2 = r7
            r3 = r38
            r4 = r20
            r5 = r40
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzc(r0, r1, r2, r3, r4, r5)
            java.lang.Object r1 = r12.zzc
            r13.add(r1)
            goto L_0x0895
        L_0x03ba:
            r0 = 2
            if (r1 != r0) goto L_0x03e2
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzhah r13 = (com.google.android.gms.internal.ads.zzhah) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r3, r12)
            int r1 = r12.zza
            int r1 = r1 + r0
        L_0x03c8:
            if (r0 >= r1) goto L_0x03d8
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r0, r12)
            long r8 = r12.zzb
            long r8 = com.google.android.gms.internal.ads.zzgyf.zzF(r8)
            r13.zzg(r8)
            goto L_0x03c8
        L_0x03d8:
            if (r0 != r1) goto L_0x03dc
            goto L_0x045f
        L_0x03dc:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x03e2:
            if (r1 != 0) goto L_0x049c
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzhah r13 = (com.google.android.gms.internal.ads.zzhah) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r3, r12)
            long r1 = r12.zzb
            long r1 = com.google.android.gms.internal.ads.zzgyf.zzF(r1)
            r13.zzg(r1)
        L_0x03f5:
            if (r0 >= r4) goto L_0x045f
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r0, r12)
            int r2 = r12.zza
            if (r11 != r2) goto L_0x045f
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r1, r12)
            long r1 = r12.zzb
            long r1 = com.google.android.gms.internal.ads.zzgyf.zzF(r1)
            r13.zzg(r1)
            goto L_0x03f5
        L_0x040d:
            r0 = 2
            if (r1 != r0) goto L_0x0434
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzgzi r13 = (com.google.android.gms.internal.ads.zzgzi) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r3, r12)
            int r1 = r12.zza
            int r1 = r1 + r0
        L_0x041b:
            if (r0 >= r1) goto L_0x042b
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r0, r12)
            int r8 = r12.zza
            int r8 = com.google.android.gms.internal.ads.zzgyf.zzD(r8)
            r13.zzi(r8)
            goto L_0x041b
        L_0x042b:
            if (r0 != r1) goto L_0x042e
            goto L_0x045f
        L_0x042e:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0434:
            if (r1 != 0) goto L_0x049c
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzgzi r13 = (com.google.android.gms.internal.ads.zzgzi) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r3, r12)
            int r1 = r12.zza
            int r1 = com.google.android.gms.internal.ads.zzgyf.zzD(r1)
            r13.zzi(r1)
        L_0x0447:
            if (r0 >= r4) goto L_0x045f
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r0, r12)
            int r2 = r12.zza
            if (r11 != r2) goto L_0x045f
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r1, r12)
            int r1 = r12.zza
            int r1 = com.google.android.gms.internal.ads.zzgyf.zzD(r1)
            r13.zzi(r1)
            goto L_0x0447
        L_0x045f:
            r7 = r3
            r9 = r4
            r14 = r5
            goto L_0x0497
        L_0x0463:
            r0 = 2
            if (r1 != r0) goto L_0x0470
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzf(r15, r3, r13, r12)
            r20 = r0
            r14 = r3
            r9 = r4
            r8 = r5
            goto L_0x0484
        L_0x0470:
            if (r1 != 0) goto L_0x049c
            r0 = r11
            r1 = r36
            r2 = r3
            r14 = r3
            r3 = r38
            r9 = r4
            r4 = r13
            r8 = r5
            r5 = r40
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzj(r0, r1, r2, r3, r4, r5)
            r20 = r0
        L_0x0484:
            com.google.android.gms.internal.ads.zzgzn r3 = r6.zzw(r10)
            r4 = 0
            com.google.android.gms.internal.ads.zzhbx r5 = r6.zzm
            r0 = r35
            r1 = r21
            r2 = r13
            com.google.android.gms.internal.ads.zzhbn.zzn(r0, r1, r2, r3, r4, r5)
            r7 = r14
            r0 = r20
        L_0x0496:
            r14 = r8
        L_0x0497:
            r8 = r10
            r10 = r21
            goto L_0x08b4
        L_0x049c:
            r7 = r3
            r9 = r4
            r14 = r5
            goto L_0x0534
        L_0x04a1:
            r14 = r3
            r9 = r4
            r8 = r5
            r0 = 2
            if (r1 != r0) goto L_0x0532
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r14, r12)
            int r1 = r12.zza
            if (r1 < 0) goto L_0x04ff
            int r3 = r15.length
            int r3 = r3 - r0
            if (r1 > r3) goto L_0x04f9
            if (r1 != 0) goto L_0x04bb
            com.google.android.gms.internal.ads.zzgxz r1 = com.google.android.gms.internal.ads.zzgxz.zzb
            r13.add(r1)
            goto L_0x04c3
        L_0x04bb:
            com.google.android.gms.internal.ads.zzgxz r3 = com.google.android.gms.internal.ads.zzgxz.zzv(r15, r0, r1)
            r13.add(r3)
        L_0x04c2:
            int r0 = r0 + r1
        L_0x04c3:
            if (r0 >= r9) goto L_0x04f7
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r0, r12)
            int r3 = r12.zza
            if (r11 != r3) goto L_0x04f7
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r1, r12)
            int r1 = r12.zza
            if (r1 < 0) goto L_0x04ef
            int r3 = r15.length
            int r3 = r3 - r0
            if (r1 > r3) goto L_0x04e9
            if (r1 != 0) goto L_0x04e1
            com.google.android.gms.internal.ads.zzgxz r1 = com.google.android.gms.internal.ads.zzgxz.zzb
            r13.add(r1)
            goto L_0x04c3
        L_0x04e1:
            com.google.android.gms.internal.ads.zzgxz r3 = com.google.android.gms.internal.ads.zzgxz.zzv(r15, r0, r1)
            r13.add(r3)
            goto L_0x04c2
        L_0x04e9:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x04ef:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r2 = r26
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x04f7:
            r7 = r14
            goto L_0x0496
        L_0x04f9:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x04ff:
            r2 = r26
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0507:
            r14 = r3
            r9 = r4
            r8 = r5
            r0 = 2
            if (r1 != r0) goto L_0x0532
            com.google.android.gms.internal.ads.zzhbl r0 = r6.zzx(r10)
            r5 = r8
            r4 = r21
            r8 = r0
            r3 = r9
            r9 = r11
            r0 = r10
            r10 = r36
            r1 = r11
            r11 = r14
            r2 = r12
            r12 = r38
            r7 = r14
            r14 = r40
            int r8 = com.google.android.gms.internal.ads.zzgxo.zze(r8, r9, r10, r11, r12, r13, r14)
            r11 = r1
            r12 = r2
            r9 = r3
            r10 = r4
            r14 = r5
            r33 = r8
            r8 = r0
            r0 = r33
            goto L_0x08b4
        L_0x0532:
            r7 = r14
            r14 = r8
        L_0x0534:
            r8 = r10
            r10 = r21
            goto L_0x08b3
        L_0x0539:
            r7 = r3
            r3 = r4
            r0 = r10
            r4 = r21
            r2 = r26
            r8 = 2
            if (r1 != r8) goto L_0x060f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r29 & r8
            int r1 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r1 != 0) goto L_0x059b
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r7, r12)
            int r8 = r12.zza
            if (r8 < 0) goto L_0x0595
            if (r8 != 0) goto L_0x055c
            r10 = r25
            r13.add(r10)
            goto L_0x0569
        L_0x055c:
            r10 = r25
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r14 = com.google.android.gms.internal.ads.zzgzu.zza
            r9.<init>(r15, r1, r8, r14)
            r13.add(r9)
        L_0x0568:
            int r1 = r1 + r8
        L_0x0569:
            if (r1 >= r3) goto L_0x0592
            int r8 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r1, r12)
            int r9 = r12.zza
            if (r11 != r9) goto L_0x0592
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r8, r12)
            int r8 = r12.zza
            if (r8 < 0) goto L_0x058c
            if (r8 != 0) goto L_0x0581
            r13.add(r10)
            goto L_0x0569
        L_0x0581:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r14 = com.google.android.gms.internal.ads.zzgzu.zza
            r9.<init>(r15, r1, r8, r14)
            r13.add(r9)
            goto L_0x0568
        L_0x058c:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0592:
            r8 = r0
            goto L_0x05fe
        L_0x0595:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x059b:
            r10 = r25
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r7, r12)
            int r8 = r12.zza
            if (r8 < 0) goto L_0x0609
            if (r8 != 0) goto L_0x05ad
            r13.add(r10)
            r37 = r0
            goto L_0x05c2
        L_0x05ad:
            int r9 = r1 + r8
            boolean r14 = com.google.android.gms.internal.ads.zzhcj.zzi(r15, r1, r9)
            if (r14 == 0) goto L_0x0601
            java.lang.String r14 = new java.lang.String
            r37 = r0
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzgzu.zza
            r14.<init>(r15, r1, r8, r0)
            r13.add(r14)
            r1 = r9
        L_0x05c2:
            if (r1 >= r3) goto L_0x05fc
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r1, r12)
            int r8 = r12.zza
            if (r11 != r8) goto L_0x05fc
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r0, r12)
            int r0 = r12.zza
            if (r0 < 0) goto L_0x05f6
            if (r0 != 0) goto L_0x05da
            r13.add(r10)
            goto L_0x05c2
        L_0x05da:
            int r8 = r1 + r0
            boolean r9 = com.google.android.gms.internal.ads.zzhcj.zzi(r15, r1, r8)
            if (r9 == 0) goto L_0x05ee
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r14 = com.google.android.gms.internal.ads.zzgzu.zza
            r9.<init>(r15, r1, r0, r14)
            r13.add(r9)
            r1 = r8
            goto L_0x05c2
        L_0x05ee:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r2 = r28
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x05f6:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x05fc:
            r8 = r37
        L_0x05fe:
            r0 = r1
            goto L_0x074c
        L_0x0601:
            r2 = r28
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0609:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x060f:
            r8 = r0
        L_0x0610:
            r9 = r3
            r10 = r4
            r14 = r5
            goto L_0x08b3
        L_0x0615:
            r7 = r3
            r3 = r4
            r37 = r10
            r4 = r21
            r0 = 2
            if (r1 != r0) goto L_0x0647
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzgxp r13 = (com.google.android.gms.internal.ads.zzgxp) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r7, r12)
            int r1 = r12.zza
            int r1 = r1 + r0
        L_0x0629:
            if (r0 >= r1) goto L_0x063d
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r0, r12)
            long r8 = r12.zzb
            int r8 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r8 == 0) goto L_0x0637
            r8 = 1
            goto L_0x0639
        L_0x0637:
            r8 = r16
        L_0x0639:
            r13.zzg(r8)
            goto L_0x0629
        L_0x063d:
            if (r0 != r1) goto L_0x0641
            goto L_0x074a
        L_0x0641:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0647:
            if (r1 != 0) goto L_0x0767
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzgxp r13 = (com.google.android.gms.internal.ads.zzgxp) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r7, r12)
            long r1 = r12.zzb
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x0659
            r1 = 1
            goto L_0x065b
        L_0x0659:
            r1 = r16
        L_0x065b:
            r13.zzg(r1)
        L_0x065e:
            if (r0 >= r3) goto L_0x074a
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r0, r12)
            int r2 = r12.zza
            if (r11 != r2) goto L_0x074a
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r1, r12)
            long r1 = r12.zzb
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x0674
            r1 = 1
            goto L_0x0676
        L_0x0674:
            r1 = r16
        L_0x0676:
            r13.zzg(r1)
            goto L_0x065e
        L_0x067a:
            r7 = r3
            r3 = r4
            r37 = r10
            r4 = r21
            r0 = 2
            if (r1 != r0) goto L_0x06b8
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzgzi r13 = (com.google.android.gms.internal.ads.zzgzi) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r7, r12)
            int r1 = r12.zza
            int r8 = r0 + r1
            int r9 = r15.length
            if (r8 > r9) goto L_0x06b2
            int r9 = r13.size()
            int r1 = r1 / 4
            int r9 = r9 + r1
            r13.zzj(r9)
        L_0x069c:
            if (r0 >= r8) goto L_0x06a8
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzb(r15, r0)
            r13.zzi(r1)
            int r0 = r0 + 4
            goto L_0x069c
        L_0x06a8:
            if (r0 != r8) goto L_0x06ac
            goto L_0x074a
        L_0x06ac:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x06b2:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x06b8:
            r0 = 5
            if (r1 != r0) goto L_0x0767
            int r0 = r7 + 4
            int r1 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzgzi r13 = (com.google.android.gms.internal.ads.zzgzi) r13
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzb(r15, r7)
            r13.zzi(r1)
        L_0x06c8:
            if (r0 >= r3) goto L_0x074a
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r0, r12)
            int r2 = r12.zza
            if (r11 != r2) goto L_0x074a
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzb(r15, r1)
            r13.zzi(r0)
            int r0 = r1 + 4
            goto L_0x06c8
        L_0x06dc:
            r7 = r3
            r3 = r4
            r37 = r10
            r4 = r21
            r0 = 2
            if (r1 != r0) goto L_0x0719
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzhah r13 = (com.google.android.gms.internal.ads.zzhah) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r7, r12)
            int r1 = r12.zza
            int r8 = r0 + r1
            int r9 = r15.length
            if (r8 > r9) goto L_0x0713
            int r9 = r13.size()
            int r1 = r1 / 8
            int r9 = r9 + r1
            r13.zzi(r9)
        L_0x06fe:
            if (r0 >= r8) goto L_0x070a
            long r9 = com.google.android.gms.internal.ads.zzgxo.zzn(r15, r0)
            r13.zzg(r9)
            int r0 = r0 + 8
            goto L_0x06fe
        L_0x070a:
            if (r0 != r8) goto L_0x070d
            goto L_0x074a
        L_0x070d:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0713:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0719:
            r0 = 1
            if (r1 != r0) goto L_0x0767
            int r0 = r7 + 8
            int r1 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzhah r13 = (com.google.android.gms.internal.ads.zzhah) r13
            long r1 = com.google.android.gms.internal.ads.zzgxo.zzn(r15, r7)
            r13.zzg(r1)
        L_0x0729:
            if (r0 >= r3) goto L_0x074a
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r0, r12)
            int r2 = r12.zza
            if (r11 != r2) goto L_0x074a
            long r8 = com.google.android.gms.internal.ads.zzgxo.zzn(r15, r1)
            r13.zzg(r8)
            int r0 = r1 + 8
            goto L_0x0729
        L_0x073d:
            r7 = r3
            r3 = r4
            r37 = r10
            r4 = r21
            r0 = 2
            if (r1 != r0) goto L_0x0751
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzf(r15, r7, r13, r12)
        L_0x074a:
            r8 = r37
        L_0x074c:
            r9 = r3
            r10 = r4
            r14 = r5
            goto L_0x08b4
        L_0x0751:
            if (r1 != 0) goto L_0x0767
            r8 = r37
            r0 = r11
            r1 = r36
            r2 = r7
            r9 = r3
            r3 = r38
            r10 = r4
            r4 = r13
            r14 = r5
            r5 = r40
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzj(r0, r1, r2, r3, r4, r5)
            goto L_0x08b4
        L_0x0767:
            r8 = r37
            goto L_0x0610
        L_0x076b:
            r7 = r3
            r9 = r4
            r14 = r5
            r8 = r10
            r10 = r21
            r0 = 2
            if (r1 != r0) goto L_0x0795
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzhah r13 = (com.google.android.gms.internal.ads.zzhah) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r7, r12)
            int r1 = r12.zza
            int r1 = r1 + r0
        L_0x077f:
            if (r0 >= r1) goto L_0x078b
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r0, r12)
            long r3 = r12.zzb
            r13.zzg(r3)
            goto L_0x077f
        L_0x078b:
            if (r0 != r1) goto L_0x078f
            goto L_0x08b4
        L_0x078f:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0795:
            if (r1 != 0) goto L_0x08b3
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzhah r13 = (com.google.android.gms.internal.ads.zzhah) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r7, r12)
            long r1 = r12.zzb
            r13.zzg(r1)
        L_0x07a4:
            if (r0 >= r9) goto L_0x08b4
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r0, r12)
            int r2 = r12.zza
            if (r11 != r2) goto L_0x08b4
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r1, r12)
            long r1 = r12.zzb
            r13.zzg(r1)
            goto L_0x07a4
        L_0x07b8:
            r7 = r3
            r9 = r4
            r14 = r5
            r8 = r10
            r10 = r21
            r0 = 2
            if (r1 != r0) goto L_0x07fa
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzgyy r13 = (com.google.android.gms.internal.ads.zzgyy) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r7, r12)
            int r1 = r12.zza
            int r3 = r0 + r1
            int r4 = r15.length
            if (r3 > r4) goto L_0x07f4
            int r4 = r13.size()
            int r1 = r1 / 4
            int r4 = r4 + r1
            r13.zzi(r4)
        L_0x07da:
            if (r0 >= r3) goto L_0x07ea
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzb(r15, r0)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.zzh(r1)
            int r0 = r0 + 4
            goto L_0x07da
        L_0x07ea:
            if (r0 != r3) goto L_0x07ee
            goto L_0x08b4
        L_0x07ee:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x07f4:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x07fa:
            r0 = 5
            if (r1 != r0) goto L_0x08b3
            int r3 = r7 + 4
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzgyy r13 = (com.google.android.gms.internal.ads.zzgyy) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzb(r15, r7)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r13.zzh(r0)
        L_0x080e:
            if (r3 >= r9) goto L_0x0893
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r3, r12)
            int r1 = r12.zza
            if (r11 != r1) goto L_0x0893
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzb(r15, r0)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.zzh(r1)
            int r3 = r0 + 4
            goto L_0x080e
        L_0x0826:
            r7 = r3
            r9 = r4
            r14 = r5
            r8 = r10
            r10 = r21
            r0 = 2
            if (r1 != r0) goto L_0x0867
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzgyo r13 = (com.google.android.gms.internal.ads.zzgyo) r13
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r7, r12)
            int r1 = r12.zza
            int r3 = r0 + r1
            int r4 = r15.length
            if (r3 > r4) goto L_0x0861
            int r4 = r13.size()
            int r1 = r1 / 8
            int r4 = r4 + r1
            r13.zzi(r4)
        L_0x0848:
            if (r0 >= r3) goto L_0x0858
            long r4 = com.google.android.gms.internal.ads.zzgxo.zzn(r15, r0)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r13.zzh(r4)
            int r0 = r0 + 8
            goto L_0x0848
        L_0x0858:
            if (r0 != r3) goto L_0x085b
            goto L_0x08b4
        L_0x085b:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0861:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0867:
            r0 = 1
            if (r1 != r0) goto L_0x08b3
            int r3 = r7 + 8
            int r0 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzgyo r13 = (com.google.android.gms.internal.ads.zzgyo) r13
            long r0 = com.google.android.gms.internal.ads.zzgxo.zzn(r15, r7)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r13.zzh(r0)
        L_0x087b:
            if (r3 >= r9) goto L_0x0893
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r3, r12)
            int r1 = r12.zza
            if (r11 != r1) goto L_0x0893
            long r1 = com.google.android.gms.internal.ads.zzgxo.zzn(r15, r0)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            r13.zzh(r1)
            int r3 = r0 + 8
            goto L_0x087b
        L_0x0893:
            r0 = r3
            goto L_0x08b4
        L_0x0895:
            if (r0 >= r9) goto L_0x08b4
            int r2 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r0, r12)
            int r1 = r12.zza
            if (r11 != r1) goto L_0x08b4
            r0 = r21
            r1 = r36
            r3 = r38
            r4 = r20
            r5 = r40
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzc(r0, r1, r2, r3, r4, r5)
            java.lang.Object r1 = r12.zzc
            r13.add(r1)
            goto L_0x0895
        L_0x08b3:
            r0 = r7
        L_0x08b4:
            if (r0 == r7) goto L_0x08c7
            r7 = r35
            r13 = r39
            r2 = r8
            r1 = r10
            r3 = r11
            r11 = r14
            r10 = r17
            r4 = r19
            r5 = r24
            r14 = r9
            goto L_0x001e
        L_0x08c7:
            r7 = r35
            r9 = r39
            r2 = r0
            r3 = r10
            r5 = r12
            r4 = r14
            goto L_0x0907
        L_0x08d0:
            r7 = r3
            r4 = r5
            r3 = r8
            r8 = r10
            r10 = r25
            r9 = r28
            r5 = 50
            if (r0 != r5) goto L_0x090e
            r5 = 2
            if (r1 != r5) goto L_0x0900
            java.lang.Object r0 = r6.zzz(r8)
            r7 = r35
            java.lang.Object r1 = r4.getObject(r7, r13)
            boolean r2 = com.google.android.gms.internal.ads.zzhan.zza(r1)
            if (r2 == 0) goto L_0x08fd
            com.google.android.gms.internal.ads.zzham r2 = com.google.android.gms.internal.ads.zzham.zza()
            com.google.android.gms.internal.ads.zzham r2 = r2.zzb()
            com.google.android.gms.internal.ads.zzhan.zzb(r2, r1)
            r4.putObject(r7, r13, r2)
        L_0x08fd:
            com.google.android.gms.internal.ads.zzhal r0 = (com.google.android.gms.internal.ads.zzhal) r0
            throw r18
        L_0x0900:
            r5 = r7
            r7 = r35
        L_0x0903:
            r9 = r39
            r2 = r5
            r5 = r12
        L_0x0907:
            r33 = r11
            r11 = r8
            r8 = r33
            goto L_0x0b77
        L_0x090e:
            r5 = r7
            r7 = r35
            int r21 = r8 + 2
            r20 = r20[r21]
            r28 = r2
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r20 & r2
            r20 = r3
            long r2 = (long) r12
            switch(r0) {
                case 51: goto L_0x0b3d;
                case 52: goto L_0x0b1a;
                case 53: goto L_0x0afc;
                case 54: goto L_0x0afc;
                case 55: goto L_0x0add;
                case 56: goto L_0x0abd;
                case 57: goto L_0x0a9d;
                case 58: goto L_0x0a75;
                case 59: goto L_0x0a31;
                case 60: goto L_0x09fc;
                case 61: goto L_0x09dd;
                case 62: goto L_0x0add;
                case 63: goto L_0x09a6;
                case 64: goto L_0x0a9d;
                case 65: goto L_0x0abd;
                case 66: goto L_0x0985;
                case 67: goto L_0x095c;
                case 68: goto L_0x092e;
                default: goto L_0x0922;
            }
        L_0x0922:
            r12 = r5
            r3 = r20
            r5 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            goto L_0x0b60
        L_0x092e:
            r0 = 3
            if (r1 != r0) goto L_0x0922
            r0 = r11 & -8
            r13 = r0 | 4
            r0 = r20
            java.lang.Object r1 = r6.zzB(r7, r0, r8)
            com.google.android.gms.internal.ads.zzhbl r9 = r6.zzx(r8)
            r2 = r8
            r8 = r1
            r10 = r36
            r3 = r11
            r11 = r5
            r14 = r40
            r12 = r38
            r21 = r3
            r3 = r14
            int r8 = com.google.android.gms.internal.ads.zzgxo.zzl(r8, r9, r10, r11, r12, r13, r14)
            r6.zzK(r7, r0, r2, r1)
            r11 = r2
            r12 = r5
            r5 = r3
            r3 = r0
            r0 = r8
            r8 = r21
            goto L_0x0b61
        L_0x095c:
            r9 = r2
            r0 = r20
            r3 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != 0) goto L_0x0a2c
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r5, r3)
            r37 = r1
            long r1 = r3.zzb
            long r1 = com.google.android.gms.internal.ads.zzgyf.zzF(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.putObject(r7, r13, r1)
            r4.putInt(r7, r9, r0)
            r12 = r5
            r5 = r3
            r3 = r0
            r0 = r37
            goto L_0x0b61
        L_0x0985:
            r9 = r2
            r0 = r20
            r3 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != 0) goto L_0x0a2c
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r5, r3)
            int r2 = r3.zza
            int r2 = com.google.android.gms.internal.ads.zzgyf.zzD(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.putObject(r7, r13, r2)
            r4.putInt(r7, r9, r0)
            goto L_0x09f6
        L_0x09a6:
            r9 = r2
            r0 = r20
            r3 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != 0) goto L_0x0a2c
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r5, r3)
            int r2 = r3.zza
            com.google.android.gms.internal.ads.zzgzn r12 = r6.zzw(r11)
            if (r12 == 0) goto L_0x09d2
            boolean r12 = r12.zza(r2)
            if (r12 == 0) goto L_0x09c5
            goto L_0x09d2
        L_0x09c5:
            com.google.android.gms.internal.ads.zzhby r9 = zzd(r35)
            long r12 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            r9.zzj(r8, r2)
            goto L_0x09f6
        L_0x09d2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.putObject(r7, r13, r2)
            r4.putInt(r7, r9, r0)
            goto L_0x09f6
        L_0x09dd:
            r9 = r2
            r0 = r20
            r2 = 2
            r3 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != r2) goto L_0x0a2c
            int r1 = com.google.android.gms.internal.ads.zzgxo.zza(r15, r5, r3)
            java.lang.Object r2 = r3.zzc
            r4.putObject(r7, r13, r2)
            r4.putInt(r7, r9, r0)
        L_0x09f6:
            r12 = r5
            r5 = r3
            r3 = r0
            r0 = r1
            goto L_0x0b61
        L_0x09fc:
            r3 = r40
            r0 = r20
            r2 = 2
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != r2) goto L_0x0a2c
            java.lang.Object r9 = r6.zzB(r7, r0, r11)
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r11)
            r10 = r0
            r0 = r9
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r36
            r13 = r10
            r10 = r3
            r3 = r5
            r14 = r4
            r4 = r38
            r12 = r5
            r5 = r40
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzm(r0, r1, r2, r3, r4, r5)
            r6.zzK(r7, r13, r11, r9)
            r5 = r10
            r3 = r13
            r4 = r14
            goto L_0x0b61
        L_0x0a2c:
            r12 = r5
            r5 = r3
            r3 = r0
            goto L_0x0b60
        L_0x0a31:
            r31 = r2
            r12 = r5
            r3 = r20
            r0 = 2
            r5 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != r0) goto L_0x0b60
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r12, r5)
            int r1 = r5.zza
            if (r1 != 0) goto L_0x0a4e
            r4.putObject(r7, r13, r10)
        L_0x0a4b:
            r9 = r31
            goto L_0x0a70
        L_0x0a4e:
            int r2 = r0 + r1
            r10 = 536870912(0x20000000, float:1.0842022E-19)
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0a64
            boolean r9 = com.google.android.gms.internal.ads.zzhcj.zzi(r15, r0, r2)
            if (r9 == 0) goto L_0x0a5c
            goto L_0x0a64
        L_0x0a5c:
            com.google.android.gms.internal.ads.zzgzw r0 = new com.google.android.gms.internal.ads.zzgzw
            r1 = r28
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0a64:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zzgzu.zza
            r9.<init>(r15, r0, r1, r10)
            r4.putObject(r7, r13, r9)
            r0 = r2
            goto L_0x0a4b
        L_0x0a70:
            r4.putInt(r7, r9, r3)
            goto L_0x0b61
        L_0x0a75:
            r9 = r2
            r12 = r5
            r3 = r20
            r5 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != 0) goto L_0x0b60
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r12, r5)
            long r1 = r5.zzb
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x0a8f
            r27 = 1
            goto L_0x0a91
        L_0x0a8f:
            r27 = r16
        L_0x0a91:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r27)
            r4.putObject(r7, r13, r1)
            r4.putInt(r7, r9, r3)
            goto L_0x0b61
        L_0x0a9d:
            r9 = r2
            r12 = r5
            r3 = r20
            r0 = 5
            r5 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != r0) goto L_0x0b60
            int r0 = r12 + 4
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzb(r15, r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.putObject(r7, r13, r1)
            r4.putInt(r7, r9, r3)
            goto L_0x0b61
        L_0x0abd:
            r9 = r2
            r12 = r5
            r3 = r20
            r0 = 1
            r5 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != r0) goto L_0x0b60
            int r0 = r12 + 8
            long r1 = com.google.android.gms.internal.ads.zzgxo.zzn(r15, r12)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.putObject(r7, r13, r1)
            r4.putInt(r7, r9, r3)
            goto L_0x0b61
        L_0x0add:
            r9 = r2
            r12 = r5
            r3 = r20
            r5 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != 0) goto L_0x0b60
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzh(r15, r12, r5)
            int r1 = r5.zza
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.putObject(r7, r13, r1)
            r4.putInt(r7, r9, r3)
            goto L_0x0b61
        L_0x0afc:
            r9 = r2
            r12 = r5
            r3 = r20
            r5 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != 0) goto L_0x0b60
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzk(r15, r12, r5)
            long r1 = r5.zzb
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.putObject(r7, r13, r1)
            r4.putInt(r7, r9, r3)
            goto L_0x0b61
        L_0x0b1a:
            r9 = r2
            r12 = r5
            r3 = r20
            r0 = 5
            r5 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != r0) goto L_0x0b60
            int r0 = r12 + 4
            int r1 = com.google.android.gms.internal.ads.zzgxo.zzb(r15, r12)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r4.putObject(r7, r13, r1)
            r4.putInt(r7, r9, r3)
            goto L_0x0b61
        L_0x0b3d:
            r9 = r2
            r12 = r5
            r3 = r20
            r0 = 1
            r5 = r40
            r33 = r11
            r11 = r8
            r8 = r33
            if (r1 != r0) goto L_0x0b60
            int r0 = r12 + 8
            long r1 = com.google.android.gms.internal.ads.zzgxo.zzn(r15, r12)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r4.putObject(r7, r13, r1)
            r4.putInt(r7, r9, r3)
            goto L_0x0b61
        L_0x0b60:
            r0 = r12
        L_0x0b61:
            if (r0 == r12) goto L_0x0b74
            r14 = r38
            r13 = r39
            r1 = r3
            r12 = r5
            r3 = r8
            r2 = r11
            r10 = r17
            r5 = r24
            r11 = r4
            r4 = r19
            goto L_0x001e
        L_0x0b74:
            r9 = r39
            r2 = r0
        L_0x0b77:
            if (r8 != r9) goto L_0x0b87
            if (r9 == 0) goto L_0x0b87
            r13 = r4
            r10 = r8
            r4 = r19
            r5 = r24
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r2
            goto L_0x0be3
        L_0x0b87:
            boolean r0 = r6.zzh
            if (r0 == 0) goto L_0x0bb6
            com.google.android.gms.internal.ads.zzgyr r0 = r5.zzd
            int r1 = com.google.android.gms.internal.ads.zzgyr.zzb
            int r1 = com.google.android.gms.internal.ads.zzhbc.zza
            com.google.android.gms.internal.ads.zzgyr r1 = com.google.android.gms.internal.ads.zzgyr.zza
            if (r0 == r1) goto L_0x0bb6
            com.google.android.gms.internal.ads.zzhas r1 = r6.zzg
            int r10 = com.google.android.gms.internal.ads.zzgxo.zza
            com.google.android.gms.internal.ads.zzgzf r0 = r0.zzc(r1, r3)
            if (r0 != 0) goto L_0x0bb2
            com.google.android.gms.internal.ads.zzhby r10 = zzd(r35)
            r0 = r8
            r1 = r36
            r12 = r3
            r3 = r38
            r13 = r4
            r4 = r10
            r5 = r40
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzg(r0, r1, r2, r3, r4, r5)
            goto L_0x0bc7
        L_0x0bb2:
            r0 = r7
            com.google.android.gms.internal.ads.zzgzd r0 = (com.google.android.gms.internal.ads.zzgzd) r0
            throw r18
        L_0x0bb6:
            r12 = r3
            r13 = r4
            com.google.android.gms.internal.ads.zzhby r4 = zzd(r35)
            r0 = r8
            r1 = r36
            r3 = r38
            r5 = r40
            int r0 = com.google.android.gms.internal.ads.zzgxo.zzg(r0, r1, r2, r3, r4, r5)
        L_0x0bc7:
            r14 = r38
            r3 = r8
            r2 = r11
            r1 = r12
            r11 = r13
            r10 = r17
            r4 = r19
            r5 = r24
            r12 = r40
            r13 = r9
            goto L_0x001e
        L_0x0bd8:
            r19 = r4
            r24 = r5
            r9 = r13
            r13 = r11
            r8 = r0
            r10 = r3
            r0 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0be3:
            if (r5 == r0) goto L_0x0be9
            long r0 = (long) r5
            r13.putInt(r7, r0, r4)
        L_0x0be9:
            int r0 = r6.zzk
            r11 = r0
        L_0x0bec:
            int r0 = r6.zzl
            if (r11 >= r0) goto L_0x0c06
            int[] r0 = r6.zzj
            com.google.android.gms.internal.ads.zzhbx r4 = r6.zzm
            r2 = r0[r11]
            r12 = 0
            r0 = r34
            r1 = r35
            r3 = r12
            r5 = r35
            r0.zzy(r1, r2, r3, r4, r5)
            com.google.android.gms.internal.ads.zzhby r12 = (com.google.android.gms.internal.ads.zzhby) r12
            int r11 = r11 + 1
            goto L_0x0bec
        L_0x0c06:
            java.lang.String r0 = "Failed to parse the message."
            if (r9 != 0) goto L_0x0c15
            r1 = r38
            if (r8 != r1) goto L_0x0c0f
            goto L_0x0c1b
        L_0x0c0f:
            com.google.android.gms.internal.ads.zzgzw r1 = new com.google.android.gms.internal.ads.zzgzw
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0c15:
            r1 = r38
            if (r8 > r1) goto L_0x0c1c
            if (r10 != r9) goto L_0x0c1c
        L_0x0c1b:
            return r8
        L_0x0c1c:
            com.google.android.gms.internal.ads.zzgzw r1 = new com.google.android.gms.internal.ads.zzgzw
            r1.<init>((java.lang.String) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhav.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgxn):int");
    }

    public final Object zze() {
        return ((zzgzh) this.zzg).zzbj();
    }

    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgzh) {
                zzgzh zzgzh = (zzgzh) obj;
                zzgzh.zzbT();
                zzgzh.zzbS();
                zzgzh.zzbV();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzu = zzu(i);
                int i2 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = (long) i2;
                if (zzt != 9) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, iArr[i], i)) {
                            zzx(i).zzf(zzb.getObject(obj, j));
                        }
                    } else {
                        switch (zzt) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case zzbcj.zzt.zzm:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzgzt) zzhce.zzh(obj, j)).zzb();
                                continue;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzham) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i < iArr.length) {
                int zzu = zzu(i);
                int i2 = 1048575 & zzu;
                int zzt = zzt(zzu);
                int i3 = iArr[i];
                long j = (long) i2;
                switch (zzt) {
                    case 0:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzr(obj, j, zzhce.zzb(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 1:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzs(obj, j, zzhce.zzc(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 2:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzu(obj, j, zzhce.zzf(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 3:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzu(obj, j, zzhce.zzf(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 4:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 5:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzu(obj, j, zzhce.zzf(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 6:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 7:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzp(obj, j, zzhce.zzz(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 8:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzv(obj, j, zzhce.zzh(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 9:
                        zzE(obj, obj2, i);
                        break;
                    case 10:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzv(obj, j, zzhce.zzh(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 11:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 12:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 13:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 14:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzu(obj, j, zzhce.zzf(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 15:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 16:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzu(obj, j, zzhce.zzf(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 17:
                        zzE(obj, obj2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case zzbcj.zzt.zzm:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zzgzt zzgzt = (zzgzt) zzhce.zzh(obj, j);
                        zzgzt zzgzt2 = (zzgzt) zzhce.zzh(obj2, j);
                        int size = zzgzt.size();
                        int size2 = zzgzt2.size();
                        if (size > 0 && size2 > 0) {
                            if (!zzgzt.zzc()) {
                                zzgzt = zzgzt.zzf(size2 + size);
                            }
                            zzgzt.addAll(zzgzt2);
                        }
                        if (size > 0) {
                            zzgzt2 = zzgzt;
                        }
                        zzhce.zzv(obj, j, zzgzt2);
                        break;
                    case 50:
                        int i4 = zzhbn.zza;
                        zzhce.zzv(obj, j, zzhan.zzb(zzhce.zzh(obj, j), zzhce.zzh(obj2, j)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zzR(obj2, i3, i)) {
                            break;
                        } else {
                            zzhce.zzv(obj, j, zzhce.zzh(obj2, j));
                            zzI(obj, i3, i);
                            break;
                        }
                    case 60:
                        zzF(obj, obj2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zzR(obj2, i3, i)) {
                            break;
                        } else {
                            zzhce.zzv(obj, j, zzhce.zzh(obj2, j));
                            zzI(obj, i3, i);
                            break;
                        }
                    case 68:
                        zzF(obj, obj2, i);
                        break;
                }
                i += 3;
            } else {
                zzhbn.zzq(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzhbn.zzp(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void zzh(java.lang.Object r11, com.google.android.gms.internal.ads.zzhbf r12, com.google.android.gms.internal.ads.zzgyr r13) throws java.io.IOException {
        /*
            r10 = this;
            r13.getClass()
            zzD(r11)
            com.google.android.gms.internal.ads.zzhbx r6 = r10.zzm
            r7 = 0
            r8 = r7
        L_0x000a:
            int r1 = r12.zzc()     // Catch:{ all -> 0x005e }
            int r0 = r10.zzq(r1)     // Catch:{ all -> 0x005e }
            r9 = 0
            if (r0 >= 0) goto L_0x0065
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x002f
            int r12 = r10.zzk
        L_0x001c:
            int r13 = r10.zzl
            if (r12 >= r13) goto L_0x050c
            int[] r13 = r10.zzj
            r2 = r13[r12]
            r0 = r10
            r1 = r11
            r3 = r8
            r4 = r6
            r5 = r11
            r0.zzy(r1, r2, r3, r4, r5)
            int r12 = r12 + 1
            goto L_0x001c
        L_0x002f:
            boolean r0 = r10.zzh     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0035
            r0 = r7
            goto L_0x003b
        L_0x0035:
            com.google.android.gms.internal.ads.zzhas r0 = r10.zzg     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.zzgzf r0 = r13.zzc(r0, r1)     // Catch:{ all -> 0x005e }
        L_0x003b:
            if (r0 != 0) goto L_0x0061
            if (r8 != 0) goto L_0x0043
            java.lang.Object r8 = r6.zza(r11)     // Catch:{ all -> 0x005e }
        L_0x0043:
            boolean r0 = r6.zzk(r8, r12, r9)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x000a
            int r12 = r10.zzk
        L_0x004b:
            int r13 = r10.zzl
            if (r12 >= r13) goto L_0x050c
            int[] r13 = r10.zzj
            r2 = r13[r12]
            r0 = r10
            r1 = r11
            r3 = r8
            r4 = r6
            r5 = r11
            r0.zzy(r1, r2, r3, r4, r5)
            int r12 = r12 + 1
            goto L_0x004b
        L_0x005e:
            r12 = move-exception
            goto L_0x0512
        L_0x0061:
            r12 = r11
            com.google.android.gms.internal.ads.zzgzd r12 = (com.google.android.gms.internal.ads.zzgzd) r12     // Catch:{ all -> 0x005e }
            throw r7     // Catch:{ all -> 0x005e }
        L_0x0065:
            int r2 = r10.zzu(r0)     // Catch:{ all -> 0x005e }
            int r3 = zzt(r2)     // Catch:{ zzgzv -> 0x04ea }
            r4 = 1048575(0xfffff, float:1.469367E-39)
            switch(r3) {
                case 0: goto L_0x04c0;
                case 1: goto L_0x04b1;
                case 2: goto L_0x04a2;
                case 3: goto L_0x0493;
                case 4: goto L_0x0484;
                case 5: goto L_0x0475;
                case 6: goto L_0x0466;
                case 7: goto L_0x0457;
                case 8: goto L_0x044f;
                case 9: goto L_0x043d;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x03fd;
                case 13: goto L_0x03ee;
                case 14: goto L_0x03df;
                case 15: goto L_0x03d0;
                case 16: goto L_0x03c1;
                case 17: goto L_0x03af;
                case 18: goto L_0x03a3;
                case 19: goto L_0x0397;
                case 20: goto L_0x038b;
                case 21: goto L_0x037f;
                case 22: goto L_0x0373;
                case 23: goto L_0x0367;
                case 24: goto L_0x035b;
                case 25: goto L_0x034f;
                case 26: goto L_0x032a;
                case 27: goto L_0x031a;
                case 28: goto L_0x030e;
                case 29: goto L_0x0302;
                case 30: goto L_0x02ec;
                case 31: goto L_0x02e0;
                case 32: goto L_0x02d4;
                case 33: goto L_0x02c8;
                case 34: goto L_0x02bc;
                case 35: goto L_0x02b0;
                case 36: goto L_0x02a4;
                case 37: goto L_0x0298;
                case 38: goto L_0x028c;
                case 39: goto L_0x0280;
                case 40: goto L_0x0274;
                case 41: goto L_0x0268;
                case 42: goto L_0x025c;
                case 43: goto L_0x0250;
                case 44: goto L_0x023a;
                case 45: goto L_0x022e;
                case 46: goto L_0x0222;
                case 47: goto L_0x0216;
                case 48: goto L_0x020a;
                case 49: goto L_0x01fa;
                case 50: goto L_0x01c4;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a0;
                case 53: goto L_0x018e;
                case 54: goto L_0x017c;
                case 55: goto L_0x016a;
                case 56: goto L_0x0158;
                case 57: goto L_0x0146;
                case 58: goto L_0x0134;
                case 59: goto L_0x012c;
                case 60: goto L_0x011a;
                case 61: goto L_0x010c;
                case 62: goto L_0x00fa;
                case 63: goto L_0x00d5;
                case 64: goto L_0x00c3;
                case 65: goto L_0x00b1;
                case 66: goto L_0x009f;
                case 67: goto L_0x008d;
                case 68: goto L_0x007b;
                default: goto L_0x0073;
            }     // Catch:{ zzgzv -> 0x04ea }
        L_0x0073:
            if (r8 != 0) goto L_0x04cf
            java.lang.Object r8 = r6.zza(r11)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x04cf
        L_0x007b:
            java.lang.Object r2 = r10.zzB(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhas r2 = (com.google.android.gms.internal.ads.zzhas) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhbl r3 = r10.zzx(r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzt(r2, r3, r13)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzK(r11, r1, r0, r2)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x008d:
            r2 = r2 & r4
            long r3 = r12.zzn()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x009f:
            r2 = r2 & r4
            int r3 = r12.zzi()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x00b1:
            r2 = r2 & r4
            long r3 = r12.zzm()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x00c3:
            r2 = r2 & r4
            int r3 = r12.zzh()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x00d5:
            int r3 = r12.zze()     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzgzn r5 = r10.zzw(r0)     // Catch:{ zzgzv -> 0x04ea }
            if (r5 == 0) goto L_0x00ec
            boolean r5 = r5.zza(r3)     // Catch:{ zzgzv -> 0x04ea }
            if (r5 == 0) goto L_0x00e6
            goto L_0x00ec
        L_0x00e6:
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzhbn.zzo(r11, r1, r3, r8, r6)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x00ec:
            r2 = r2 & r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x00fa:
            r2 = r2 & r4
            int r3 = r12.zzj()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x010c:
            r2 = r2 & r4
            com.google.android.gms.internal.ads.zzgxz r3 = r12.zzp()     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x011a:
            java.lang.Object r2 = r10.zzB(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhas r2 = (com.google.android.gms.internal.ads.zzhas) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhbl r3 = r10.zzx(r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzu(r2, r3, r13)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzK(r11, r1, r0, r2)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x012c:
            r10.zzG(r11, r2, r12)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0134:
            r2 = r2 & r4
            boolean r3 = r12.zzN()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0146:
            r2 = r2 & r4
            int r3 = r12.zzf()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0158:
            r2 = r2 & r4
            long r3 = r12.zzk()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x016a:
            r2 = r2 & r4
            int r3 = r12.zzg()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x017c:
            r2 = r2 & r4
            long r3 = r12.zzo()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x018e:
            r2 = r2 & r4
            long r3 = r12.zzl()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x01a0:
            r2 = r2 & r4
            float r3 = r12.zzb()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x01b2:
            r2 = r2 & r4
            double r3 = r12.zza()     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r4, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzI(r11, r1, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x01c4:
            java.lang.Object r1 = r10.zzz(r0)     // Catch:{ zzgzv -> 0x04ea }
            int r0 = r10.zzu(r0)     // Catch:{ zzgzv -> 0x04ea }
            r0 = r0 & r4
            long r2 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzhce.zzh(r11, r2)     // Catch:{ zzgzv -> 0x04ea }
            if (r0 == 0) goto L_0x01ea
            boolean r4 = com.google.android.gms.internal.ads.zzhan.zza(r0)     // Catch:{ zzgzv -> 0x04ea }
            if (r4 == 0) goto L_0x01f5
            com.google.android.gms.internal.ads.zzham r4 = com.google.android.gms.internal.ads.zzham.zza()     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzham r4 = r4.zzb()     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhan.zzb(r4, r0)     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r2, r4)     // Catch:{ zzgzv -> 0x04ea }
            r0 = r4
            goto L_0x01f5
        L_0x01ea:
            com.google.android.gms.internal.ads.zzham r0 = com.google.android.gms.internal.ads.zzham.zza()     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzham r0 = r0.zzb()     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r2, r0)     // Catch:{ zzgzv -> 0x04ea }
        L_0x01f5:
            com.google.android.gms.internal.ads.zzham r0 = (com.google.android.gms.internal.ads.zzham) r0     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhal r1 = (com.google.android.gms.internal.ads.zzhal) r1     // Catch:{ zzgzv -> 0x04ea }
            throw r7     // Catch:{ zzgzv -> 0x04ea }
        L_0x01fa:
            r1 = r2 & r4
            com.google.android.gms.internal.ads.zzhbl r0 = r10.zzx(r0)     // Catch:{ zzgzv -> 0x04ea }
            long r1 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r1 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r1)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzC(r1, r0, r13)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x020a:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzJ(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0216:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzI(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0222:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzH(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x022e:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzG(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x023a:
            r2 = r2 & r4
            long r2 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r2 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r2)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzy(r2)     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzgzn r3 = r10.zzw(r0)     // Catch:{ zzgzv -> 0x04ea }
            r0 = r11
            r4 = r8
            r5 = r6
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzhbn.zzn(r0, r1, r2, r3, r4, r5)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0250:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzL(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x025c:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzv(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0268:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzz(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0274:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzA(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0280:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzD(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x028c:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzM(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0298:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzE(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x02a4:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzB(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x02b0:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzx(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x02bc:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzJ(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x02c8:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzI(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x02d4:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzH(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x02e0:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzG(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x02ec:
            r2 = r2 & r4
            long r2 = (long) r2     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r2 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r2)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzy(r2)     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzgzn r3 = r10.zzw(r0)     // Catch:{ zzgzv -> 0x04ea }
            r0 = r11
            r4 = r8
            r5 = r6
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzhbn.zzn(r0, r1, r2, r3, r4, r5)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0302:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzL(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x030e:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzw(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x031a:
            com.google.android.gms.internal.ads.zzhbl r0 = r10.zzx(r0)     // Catch:{ zzgzv -> 0x04ea }
            r1 = r2 & r4
            long r1 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r1 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r1)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzF(r1, r0, r13)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x032a:
            boolean r0 = zzM(r2)     // Catch:{ zzgzv -> 0x04ea }
            if (r0 == 0) goto L_0x0340
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r1 = r12
            com.google.android.gms.internal.ads.zzgyg r1 = (com.google.android.gms.internal.ads.zzgyg) r1     // Catch:{ zzgzv -> 0x04ea }
            r2 = 1
            r1.zzK(r0, r2)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0340:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r1 = r12
            com.google.android.gms.internal.ads.zzgyg r1 = (com.google.android.gms.internal.ads.zzgyg) r1     // Catch:{ zzgzv -> 0x04ea }
            r1.zzK(r0, r9)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x034f:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzv(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x035b:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzz(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0367:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzA(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0373:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzD(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x037f:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzM(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x038b:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzE(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0397:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzB(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x03a3:
            r0 = r2 & r4
            long r0 = (long) r0     // Catch:{ zzgzv -> 0x04ea }
            java.util.List r0 = com.google.android.gms.internal.ads.zzhaf.zza(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzx(r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x03af:
            java.lang.Object r1 = r10.zzA(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhas r1 = (com.google.android.gms.internal.ads.zzhas) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhbl r2 = r10.zzx(r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzt(r1, r2, r13)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzJ(r11, r0, r1)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x03c1:
            r1 = r2 & r4
            long r2 = r12.zzn()     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzu(r11, r4, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x03d0:
            r1 = r2 & r4
            int r2 = r12.zzi()     // Catch:{ zzgzv -> 0x04ea }
            long r3 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzt(r11, r3, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x03df:
            r1 = r2 & r4
            long r2 = r12.zzm()     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzu(r11, r4, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x03ee:
            r1 = r2 & r4
            int r2 = r12.zzh()     // Catch:{ zzgzv -> 0x04ea }
            long r3 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzt(r11, r3, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x03fd:
            int r3 = r12.zze()     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzgzn r5 = r10.zzw(r0)     // Catch:{ zzgzv -> 0x04ea }
            if (r5 == 0) goto L_0x0414
            boolean r5 = r5.zza(r3)     // Catch:{ zzgzv -> 0x04ea }
            if (r5 == 0) goto L_0x040e
            goto L_0x0414
        L_0x040e:
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzhbn.zzo(r11, r1, r3, r8, r6)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0414:
            r1 = r2 & r4
            long r1 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzt(r11, r1, r3)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x041f:
            r1 = r2 & r4
            int r2 = r12.zzj()     // Catch:{ zzgzv -> 0x04ea }
            long r3 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzt(r11, r3, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x042e:
            r1 = r2 & r4
            com.google.android.gms.internal.ads.zzgxz r2 = r12.zzp()     // Catch:{ zzgzv -> 0x04ea }
            long r3 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzv(r11, r3, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x043d:
            java.lang.Object r1 = r10.zzA(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhas r1 = (com.google.android.gms.internal.ads.zzhas) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhbl r2 = r10.zzx(r0)     // Catch:{ zzgzv -> 0x04ea }
            r12.zzu(r1, r2, r13)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzJ(r11, r0, r1)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x044f:
            r10.zzG(r11, r2, r12)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0457:
            r1 = r2 & r4
            boolean r2 = r12.zzN()     // Catch:{ zzgzv -> 0x04ea }
            long r3 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzp(r11, r3, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0466:
            r1 = r2 & r4
            int r2 = r12.zzf()     // Catch:{ zzgzv -> 0x04ea }
            long r3 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzt(r11, r3, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0475:
            r1 = r2 & r4
            long r2 = r12.zzk()     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzu(r11, r4, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0484:
            r1 = r2 & r4
            int r2 = r12.zzg()     // Catch:{ zzgzv -> 0x04ea }
            long r3 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzt(r11, r3, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x0493:
            r1 = r2 & r4
            long r2 = r12.zzo()     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzu(r11, r4, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x04a2:
            r1 = r2 & r4
            long r2 = r12.zzl()     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzu(r11, r4, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x04b1:
            r1 = r2 & r4
            float r2 = r12.zzb()     // Catch:{ zzgzv -> 0x04ea }
            long r3 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzs(r11, r3, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x04c0:
            r1 = r2 & r4
            double r2 = r12.zza()     // Catch:{ zzgzv -> 0x04ea }
            long r4 = (long) r1     // Catch:{ zzgzv -> 0x04ea }
            com.google.android.gms.internal.ads.zzhce.zzr(r11, r4, r2)     // Catch:{ zzgzv -> 0x04ea }
            r10.zzH(r11, r0)     // Catch:{ zzgzv -> 0x04ea }
            goto L_0x000a
        L_0x04cf:
            boolean r0 = r6.zzk(r8, r12, r9)     // Catch:{ zzgzv -> 0x04ea }
            if (r0 != 0) goto L_0x000a
            int r12 = r10.zzk
        L_0x04d7:
            int r13 = r10.zzl
            if (r12 >= r13) goto L_0x050c
            int[] r13 = r10.zzj
            r2 = r13[r12]
            r0 = r10
            r1 = r11
            r3 = r8
            r4 = r6
            r5 = r11
            r0.zzy(r1, r2, r3, r4, r5)
            int r12 = r12 + 1
            goto L_0x04d7
        L_0x04ea:
            if (r8 != 0) goto L_0x04f1
            java.lang.Object r0 = r6.zza(r11)     // Catch:{ all -> 0x005e }
            r8 = r0
        L_0x04f1:
            boolean r0 = r6.zzk(r8, r12, r9)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x000a
            int r12 = r10.zzk
        L_0x04f9:
            int r13 = r10.zzl
            if (r12 >= r13) goto L_0x050c
            int[] r13 = r10.zzj
            r2 = r13[r12]
            r0 = r10
            r1 = r11
            r3 = r8
            r4 = r6
            r5 = r11
            r0.zzy(r1, r2, r3, r4, r5)
            int r12 = r12 + 1
            goto L_0x04f9
        L_0x050c:
            if (r8 == 0) goto L_0x0511
            r6.zzj(r11, r8)
        L_0x0511:
            return
        L_0x0512:
            int r13 = r10.zzk
        L_0x0514:
            int r0 = r10.zzl
            if (r13 >= r0) goto L_0x0527
            int[] r0 = r10.zzj
            r2 = r0[r13]
            r0 = r10
            r1 = r11
            r3 = r8
            r4 = r6
            r5 = r11
            r0.zzy(r1, r2, r3, r4, r5)
            int r13 = r13 + 1
            goto L_0x0514
        L_0x0527:
            if (r8 == 0) goto L_0x052c
            r6.zzj(r11, r8)
        L_0x052c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhav.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzhbf, com.google.android.gms.internal.ads.zzgyr):void");
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgxn zzgxn) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzgxn);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v140, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0342, code lost:
        r16 = r10;
        r18 = r11;
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03c1, code lost:
        r21 = r4;
        r16 = r10;
        r18 = r11;
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x065a, code lost:
        r15 = r15 + 3;
        r0 = r9;
        r2 = r14;
        r10 = r16;
        r11 = r18;
        r13 = 1048575;
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r16 = r10;
        r18 = r11;
        r22 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x05f2  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0638  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(java.lang.Object r24, com.google.android.gms.internal.ads.zzhcm r25) throws java.io.IOException {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            r8 = r25
            boolean r0 = r6.zzh
            if (r0 == 0) goto L_0x0023
            r0 = r7
            com.google.android.gms.internal.ads.zzgzd r0 = (com.google.android.gms.internal.ads.zzgzd) r0
            com.google.android.gms.internal.ads.zzgyw r0 = r0.zza
            com.google.android.gms.internal.ads.zzhbt r1 = r0.zza
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0023
            java.util.Iterator r0 = r0.zzf()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r10 = r0
            goto L_0x0025
        L_0x0023:
            r1 = 0
            r10 = 0
        L_0x0025:
            int[] r11 = r6.zzc
            sun.misc.Unsafe r12 = zzb
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r13
            r2 = 0
            r15 = 0
        L_0x002f:
            int r3 = r11.length
            if (r15 >= r3) goto L_0x0668
            int r3 = r6.zzu(r15)
            int r4 = zzt(r3)
            r5 = r11[r15]
            r14 = 17
            if (r4 > r14) goto L_0x0065
            int r14 = r15 + 2
            r14 = r11[r14]
            r9 = r14 & r13
            if (r9 == r0) goto L_0x0058
            if (r9 != r13) goto L_0x004e
            r20 = r14
            r2 = 0
            goto L_0x0056
        L_0x004e:
            r20 = r14
            long r13 = (long) r9
            int r0 = r12.getInt(r7, r13)
            r2 = r0
        L_0x0056:
            r0 = r9
            goto L_0x005a
        L_0x0058:
            r20 = r14
        L_0x005a:
            int r9 = r20 >>> 20
            r13 = 1
            int r9 = r13 << r9
            r13 = r1
            r14 = r2
            r20 = r9
            r9 = r0
            goto L_0x006a
        L_0x0065:
            r9 = r0
            r13 = r1
            r14 = r2
            r20 = 0
        L_0x006a:
            if (r13 == 0) goto L_0x008b
            com.google.android.gms.internal.ads.zzgys r0 = r6.zzn
            java.lang.Object r1 = r13.getKey()
            com.google.android.gms.internal.ads.zzgze r1 = (com.google.android.gms.internal.ads.zzgze) r1
            int r1 = r1.zza
            if (r1 > r5) goto L_0x008b
            r0.zzb(r8, r13)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r10.next()
            r13 = r0
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            goto L_0x006a
        L_0x0089:
            r13 = 0
            goto L_0x006a
        L_0x008b:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3 & r19
            long r2 = (long) r0
            switch(r4) {
                case 0: goto L_0x0638;
                case 1: goto L_0x0615;
                case 2: goto L_0x05f2;
                case 3: goto L_0x05ce;
                case 4: goto L_0x05aa;
                case 5: goto L_0x0586;
                case 6: goto L_0x0562;
                case 7: goto L_0x053e;
                case 8: goto L_0x051a;
                case 9: goto L_0x04f2;
                case 10: goto L_0x04cc;
                case 11: goto L_0x04a8;
                case 12: goto L_0x0484;
                case 13: goto L_0x0460;
                case 14: goto L_0x043c;
                case 15: goto L_0x0418;
                case 16: goto L_0x03f4;
                case 17: goto L_0x03cb;
                case 18: goto L_0x03b3;
                case 19: goto L_0x03a4;
                case 20: goto L_0x0395;
                case 21: goto L_0x0386;
                case 22: goto L_0x0377;
                case 23: goto L_0x0368;
                case 24: goto L_0x0359;
                case 25: goto L_0x034a;
                case 26: goto L_0x0335;
                case 27: goto L_0x0323;
                case 28: goto L_0x0315;
                case 29: goto L_0x0305;
                case 30: goto L_0x02f5;
                case 31: goto L_0x02e5;
                case 32: goto L_0x02d5;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b5;
                case 35: goto L_0x02a5;
                case 36: goto L_0x0295;
                case 37: goto L_0x0285;
                case 38: goto L_0x0275;
                case 39: goto L_0x0265;
                case 40: goto L_0x0255;
                case 41: goto L_0x0245;
                case 42: goto L_0x0235;
                case 43: goto L_0x0225;
                case 44: goto L_0x0215;
                case 45: goto L_0x0205;
                case 46: goto L_0x01f5;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01d5;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b1;
                case 51: goto L_0x01a2;
                case 52: goto L_0x0193;
                case 53: goto L_0x0184;
                case 54: goto L_0x0175;
                case 55: goto L_0x0166;
                case 56: goto L_0x0157;
                case 57: goto L_0x0148;
                case 58: goto L_0x0139;
                case 59: goto L_0x012a;
                case 60: goto L_0x0117;
                case 61: goto L_0x0106;
                case 62: goto L_0x00f8;
                case 63: goto L_0x00ea;
                case 64: goto L_0x00dc;
                case 65: goto L_0x00ce;
                case 66: goto L_0x00c0;
                case 67: goto L_0x00b2;
                case 68: goto L_0x00a0;
                default: goto L_0x0094;
            }
        L_0x0094:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
        L_0x009c:
            r21 = 0
            goto L_0x065a
        L_0x00a0:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r12.getObject(r7, r2)
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r15)
            r8.zzq(r5, r0, r1)
            goto L_0x0094
        L_0x00b2:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            long r0 = zzv(r7, r2)
            r8.zzD(r5, r0)
            goto L_0x0094
        L_0x00c0:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            int r0 = zzp(r7, r2)
            r8.zzB(r5, r0)
            goto L_0x0094
        L_0x00ce:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            long r0 = zzv(r7, r2)
            r8.zzz(r5, r0)
            goto L_0x0094
        L_0x00dc:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            int r0 = zzp(r7, r2)
            r8.zzx(r5, r0)
            goto L_0x0094
        L_0x00ea:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            int r0 = zzp(r7, r2)
            r8.zzi(r5, r0)
            goto L_0x0094
        L_0x00f8:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            int r0 = zzp(r7, r2)
            r8.zzI(r5, r0)
            goto L_0x0094
        L_0x0106:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r12.getObject(r7, r2)
            com.google.android.gms.internal.ads.zzgxz r0 = (com.google.android.gms.internal.ads.zzgxz) r0
            r8.zzd(r5, r0)
            goto L_0x0094
        L_0x0117:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r12.getObject(r7, r2)
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r15)
            r8.zzv(r5, r0, r1)
            goto L_0x0094
        L_0x012a:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r12.getObject(r7, r2)
            zzT(r5, r0, r8)
            goto L_0x0094
        L_0x0139:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            boolean r0 = zzS(r7, r2)
            r8.zzb(r5, r0)
            goto L_0x0094
        L_0x0148:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            int r0 = zzp(r7, r2)
            r8.zzk(r5, r0)
            goto L_0x0094
        L_0x0157:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            long r0 = zzv(r7, r2)
            r8.zzm(r5, r0)
            goto L_0x0094
        L_0x0166:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            int r0 = zzp(r7, r2)
            r8.zzr(r5, r0)
            goto L_0x0094
        L_0x0175:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            long r0 = zzv(r7, r2)
            r8.zzK(r5, r0)
            goto L_0x0094
        L_0x0184:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            long r0 = zzv(r7, r2)
            r8.zzt(r5, r0)
            goto L_0x0094
        L_0x0193:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            float r0 = zzo(r7, r2)
            r8.zzo(r5, r0)
            goto L_0x0094
        L_0x01a2:
            boolean r0 = r6.zzR(r7, r5, r15)
            if (r0 == 0) goto L_0x0094
            double r0 = zzn(r7, r2)
            r8.zzf(r5, r0)
            goto L_0x0094
        L_0x01b1:
            java.lang.Object r0 = r12.getObject(r7, r2)
            if (r0 != 0) goto L_0x01b9
            goto L_0x0094
        L_0x01b9:
            java.lang.Object r0 = r6.zzz(r15)
            com.google.android.gms.internal.ads.zzhal r0 = (com.google.android.gms.internal.ads.zzhal) r0
            r17 = 0
            throw r17
        L_0x01c2:
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbl r2 = r6.zzx(r15)
            com.google.android.gms.internal.ads.zzhbn.zzy(r0, r1, r8, r2)
            goto L_0x0342
        L_0x01d5:
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 1
            com.google.android.gms.internal.ads.zzhbn.zzF(r0, r1, r8, r4)
            goto L_0x0342
        L_0x01e5:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzE(r0, r1, r8, r4)
            goto L_0x0342
        L_0x01f5:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzD(r0, r1, r8, r4)
            goto L_0x0342
        L_0x0205:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzC(r0, r1, r8, r4)
            goto L_0x0342
        L_0x0215:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzu(r0, r1, r8, r4)
            goto L_0x0342
        L_0x0225:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzH(r0, r1, r8, r4)
            goto L_0x0342
        L_0x0235:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzr(r0, r1, r8, r4)
            goto L_0x0342
        L_0x0245:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzv(r0, r1, r8, r4)
            goto L_0x0342
        L_0x0255:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzw(r0, r1, r8, r4)
            goto L_0x0342
        L_0x0265:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzz(r0, r1, r8, r4)
            goto L_0x0342
        L_0x0275:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzI(r0, r1, r8, r4)
            goto L_0x0342
        L_0x0285:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzA(r0, r1, r8, r4)
            goto L_0x0342
        L_0x0295:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzx(r0, r1, r8, r4)
            goto L_0x0342
        L_0x02a5:
            r4 = 1
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzt(r0, r1, r8, r4)
            goto L_0x0342
        L_0x02b5:
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            com.google.android.gms.internal.ads.zzhbn.zzF(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x02c5:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzE(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x02d5:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzD(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x02e5:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzC(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x02f5:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzu(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x0305:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzH(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x0315:
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzs(r0, r1, r8)
            goto L_0x0342
        L_0x0323:
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbl r2 = r6.zzx(r15)
            com.google.android.gms.internal.ads.zzhbn.zzB(r0, r1, r8, r2)
            goto L_0x0342
        L_0x0335:
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzG(r0, r1, r8)
        L_0x0342:
            r16 = r10
            r18 = r11
            r22 = r13
            goto L_0x009c
        L_0x034a:
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            com.google.android.gms.internal.ads.zzhbn.zzr(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x0359:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzv(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x0368:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzw(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x0377:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzz(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x0386:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzI(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x0395:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzA(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x03a4:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzx(r0, r1, r8, r4)
            goto L_0x03c1
        L_0x03b3:
            r4 = 0
            r17 = 0
            r0 = r11[r15]
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.ads.zzhbn.zzt(r0, r1, r8, r4)
        L_0x03c1:
            r21 = r4
            r16 = r10
            r18 = r11
            r22 = r13
            goto L_0x065a
        L_0x03cb:
            r4 = 0
            r17 = 0
            r0 = r23
            r1 = r24
            r16 = r10
            r18 = r11
            r10 = r2
            r2 = r15
            r3 = r9
            r21 = r4
            r4 = r14
            r22 = r13
            r13 = r5
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            java.lang.Object r0 = r12.getObject(r7, r10)
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r15)
            r8.zzq(r13, r0, r1)
            goto L_0x065a
        L_0x03f4:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            long r0 = r12.getLong(r7, r10)
            r8.zzD(r13, r0)
            goto L_0x065a
        L_0x0418:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            int r0 = r12.getInt(r7, r10)
            r8.zzB(r13, r0)
            goto L_0x065a
        L_0x043c:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            long r0 = r12.getLong(r7, r10)
            r8.zzz(r13, r0)
            goto L_0x065a
        L_0x0460:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            int r0 = r12.getInt(r7, r10)
            r8.zzx(r13, r0)
            goto L_0x065a
        L_0x0484:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            int r0 = r12.getInt(r7, r10)
            r8.zzi(r13, r0)
            goto L_0x065a
        L_0x04a8:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            int r0 = r12.getInt(r7, r10)
            r8.zzI(r13, r0)
            goto L_0x065a
        L_0x04cc:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            java.lang.Object r0 = r12.getObject(r7, r10)
            com.google.android.gms.internal.ads.zzgxz r0 = (com.google.android.gms.internal.ads.zzgxz) r0
            r8.zzd(r13, r0)
            goto L_0x065a
        L_0x04f2:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            java.lang.Object r0 = r12.getObject(r7, r10)
            com.google.android.gms.internal.ads.zzhbl r1 = r6.zzx(r15)
            r8.zzv(r13, r0, r1)
            goto L_0x065a
        L_0x051a:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            java.lang.Object r0 = r12.getObject(r7, r10)
            zzT(r13, r0, r8)
            goto L_0x065a
        L_0x053e:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            boolean r0 = com.google.android.gms.internal.ads.zzhce.zzz(r7, r10)
            r8.zzb(r13, r0)
            goto L_0x065a
        L_0x0562:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            int r0 = r12.getInt(r7, r10)
            r8.zzk(r13, r0)
            goto L_0x065a
        L_0x0586:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            long r0 = r12.getLong(r7, r10)
            r8.zzm(r13, r0)
            goto L_0x065a
        L_0x05aa:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            int r0 = r12.getInt(r7, r10)
            r8.zzr(r13, r0)
            goto L_0x065a
        L_0x05ce:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            long r0 = r12.getLong(r7, r10)
            r8.zzK(r13, r0)
            goto L_0x065a
        L_0x05f2:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            long r0 = r12.getLong(r7, r10)
            r8.zzt(r13, r0)
            goto L_0x065a
        L_0x0615:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            float r0 = com.google.android.gms.internal.ads.zzhce.zzc(r7, r10)
            r8.zzo(r13, r0)
            goto L_0x065a
        L_0x0638:
            r16 = r10
            r18 = r11
            r22 = r13
            r17 = 0
            r21 = 0
            r10 = r2
            r13 = r5
            r0 = r23
            r1 = r24
            r2 = r15
            r3 = r9
            r4 = r14
            r5 = r20
            boolean r0 = r0.zzO(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x065a
            double r0 = com.google.android.gms.internal.ads.zzhce.zzb(r7, r10)
            r8.zzf(r13, r0)
        L_0x065a:
            int r15 = r15 + 3
            r0 = r9
            r2 = r14
            r10 = r16
            r11 = r18
            r13 = r19
            r1 = r22
            goto L_0x002f
        L_0x0668:
            r16 = r10
            r17 = 0
        L_0x066c:
            if (r1 == 0) goto L_0x0684
            com.google.android.gms.internal.ads.zzgys r0 = r6.zzn
            r0.zzb(r8, r1)
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0681
            java.lang.Object r0 = r16.next()
            r1 = r0
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x066c
        L_0x0681:
            r1 = r17
            goto L_0x066c
        L_0x0684:
            r0 = r7
            com.google.android.gms.internal.ads.zzgzh r0 = (com.google.android.gms.internal.ads.zzgzh) r0
            com.google.android.gms.internal.ads.zzhby r0 = r0.zzt
            r1 = r0
            com.google.android.gms.internal.ads.zzhby r1 = (com.google.android.gms.internal.ads.zzhby) r1
            r0.zzl(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhav.zzj(java.lang.Object, com.google.android.gms.internal.ads.zzhcm):void");
    }

    public final boolean zzk(Object obj, Object obj2) {
        boolean z;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = (long) (zzu & 1048575);
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzhce.zzb(obj, j)) == Double.doubleToLongBits(zzhce.zzb(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzhce.zzc(obj, j)) == Float.floatToIntBits(zzhce.zzc(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (zzL(obj, obj2, i) && zzhce.zzf(obj, j) == zzhce.zzf(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (zzL(obj, obj2, i) && zzhce.zzf(obj, j) == zzhce.zzf(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (zzL(obj, obj2, i) && zzhce.zzf(obj, j) == zzhce.zzf(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (zzL(obj, obj2, i) && zzhce.zzz(obj, j) == zzhce.zzz(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (zzL(obj, obj2, i) && zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (zzL(obj, obj2, i) && zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (zzL(obj, obj2, i) && zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (zzL(obj, obj2, i) && zzhce.zzf(obj, j) == zzhce.zzf(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (zzL(obj, obj2, i) && zzhce.zzf(obj, j) == zzhce.zzf(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (zzL(obj, obj2, i) && zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case zzbcj.zzt.zzm:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j));
                    break;
                case 50:
                    z = zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzr = (long) (zzr(i) & 1048575);
                    if (zzhce.zzd(obj, zzr) == zzhce.zzd(obj2, zzr) && zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!((zzgzh) obj).zzt.equals(((zzgzh) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzgzd) obj).zza.equals(((zzgzd) obj2).zza);
        }
        return true;
    }

    public final boolean zzl(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int zzu = zzu(i6);
            int i8 = iArr2[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj2, (long) i9);
                }
                i = i3;
                i2 = i9;
            } else {
                i2 = i5;
                i = i3;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i6, i2, i, i10)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj2, i7, i6) && !zzP(obj2, zzu, zzx(i6))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzham) zzhce.zzh(obj2, (long) (zzu & 1048575))).isEmpty()) {
                            zzhal zzhal = (zzhal) zzz(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzhce.zzh(obj2, (long) (zzu & 1048575));
                if (!list.isEmpty()) {
                    zzhbl zzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzO(obj, i6, i2, i, i10) && !zzP(obj2, zzu, zzx(i6))) {
                return false;
            }
            i4++;
            i5 = i2;
            i3 = i;
        }
        return !this.zzh || ((zzgzd) obj2).zza.zzi();
    }
}
