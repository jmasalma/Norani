package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaek {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final String zzn;
    public final zzfs zzo;

    private zzaek(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, int i13, String str, zzfs zzfs) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = i9;
        this.zzi = i10;
        this.zzj = i11;
        this.zzk = i12;
        this.zzl = f;
        this.zzm = i13;
        this.zzn = str;
        this.zzo = zzfs;
    }

    public static zzaek zza(zzen zzen) throws zzaz {
        return zzc(zzen, false, (zzfs) null);
    }

    public static zzaek zzb(zzen zzen, zzfs zzfs) throws zzaz {
        return zzc(zzen, true, zzfs);
    }

    private static zzaek zzc(zzen zzen, boolean z, zzfs zzfs) throws zzaz {
        boolean z2;
        String str;
        List list;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        zzfo zzfo;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzen zzen2 = zzen;
        boolean z4 = z;
        int i12 = 4;
        if (z4) {
            try {
                zzen2.zzM(4);
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                z2 = true;
            }
        } else {
            try {
                zzen2.zzM(21);
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                z2 = true;
                if (z2 != z4) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzaz.zza("Error parsing".concat(str), e);
            }
        }
        int zzm2 = zzen.zzm() & 3;
        int zzm3 = zzen.zzm();
        int zzc2 = zzen.zzc();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < zzm3; i15++) {
            zzen2.zzM(1);
            int zzq = zzen.zzq();
            for (int i16 = 0; i16 < zzq; i16++) {
                int zzq2 = zzen.zzq();
                i14 += zzq2 + 4;
                zzen2.zzM(zzq2);
            }
        }
        zzen2.zzL(zzc2);
        byte[] bArr = new byte[i14];
        zzfs zzfs2 = zzfs;
        int i17 = 0;
        float f = 1.0f;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        String str2 = null;
        int i30 = 0;
        while (i30 < zzm3) {
            int zzm4 = zzen.zzm() & 63;
            int zzq3 = zzen.zzq();
            int i31 = i13;
            zzfs zzfs3 = zzfs2;
            while (i31 < zzq3) {
                int zzq4 = zzen.zzq();
                int i32 = zzm3;
                System.arraycopy(zzfv.zza, i13, bArr, i17, i12);
                int i33 = i17 + 4;
                System.arraycopy(zzen.zzN(), zzen.zzc(), bArr, i33, zzq4);
                int i34 = 32;
                if (zzm4 != 32) {
                    i34 = zzm4;
                } else if (i31 == 0) {
                    zzfs3 = zzfv.zze(bArr, i33, i33 + zzq4);
                    i2 = zzq3;
                    i = zzm4;
                    i3 = 0;
                    i31 = 0;
                    i17 = i33 + zzq4;
                    zzen2.zzM(zzq4);
                    i31++;
                    i13 = i3;
                    zzm3 = i32;
                    zzq3 = i2;
                    zzm4 = i;
                    i12 = 4;
                }
                i2 = zzq3;
                if (i34 != 33) {
                    i = zzm4;
                    if (i34 == 39 && i31 == 0) {
                        int i35 = i17 + 6;
                        int i36 = (i33 + zzq4) - 1;
                        while (true) {
                            byte b = bArr[i36];
                            if (b == 0) {
                                if (i36 <= i35) {
                                    break;
                                }
                                i36--;
                            } else if (b != 0) {
                                if (i36 > i35) {
                                    zzfw zzfw = new zzfw(bArr, i35, i36 + 1);
                                    while (true) {
                                        if (!zzfw.zzg(16)) {
                                            break;
                                        }
                                        int zza2 = zzfw.zza(8);
                                        int i37 = 0;
                                        while (zza2 == 255) {
                                            i37 += KotlinVersion.MAX_COMPONENT_VALUE;
                                            zza2 = zzfw.zza(8);
                                        }
                                        int i38 = i37 + zza2;
                                        int zza3 = zzfw.zza(8);
                                        int i39 = 0;
                                        while (zza3 == 255) {
                                            i39 += KotlinVersion.MAX_COMPONENT_VALUE;
                                            zza3 = zzfw.zza(8);
                                        }
                                        int i40 = i39 + zza3;
                                        if (i40 == 0) {
                                            break;
                                        } else if (!zzfw.zzg(i40)) {
                                            break;
                                        } else if (i38 == 176) {
                                            int zzc3 = zzfw.zzc();
                                            boolean zzh2 = zzfw.zzh();
                                            int zzc4 = zzh2 ? zzfw.zzc() : 0;
                                            int zzc5 = zzfw.zzc();
                                            int i41 = 0;
                                            int i42 = -1;
                                            int i43 = -1;
                                            int i44 = -1;
                                            int i45 = -1;
                                            int i46 = -1;
                                            int i47 = -1;
                                            while (i41 <= zzc5) {
                                                i42 = zzfw.zzc();
                                                i43 = zzfw.zzc();
                                                i5 = i31;
                                                int zza4 = zzfw.zza(6);
                                                if (zza4 != 63) {
                                                    if (zza4 == 0) {
                                                        i4 = i18;
                                                        i6 = Math.max(0, zzc3 - 30);
                                                    } else {
                                                        i4 = i18;
                                                        i6 = Math.max(0, (zza4 + zzc3) - 31);
                                                    }
                                                    i45 = zzfw.zza(i6);
                                                    if (zzh2) {
                                                        int zza5 = zzfw.zza(6);
                                                        if (zza5 != 63) {
                                                            if (zza5 == 0) {
                                                                z3 = zzh2;
                                                                i7 = Math.max(0, zzc4 - 30);
                                                            } else {
                                                                z3 = zzh2;
                                                                i7 = Math.max(0, (zza5 + zzc4) - 31);
                                                            }
                                                            i47 = zzfw.zza(i7);
                                                            i46 = zza5;
                                                        }
                                                    } else {
                                                        z3 = zzh2;
                                                    }
                                                    if (zzfw.zzh()) {
                                                        zzfw.zzf(10);
                                                    }
                                                    i41++;
                                                    i44 = zza4;
                                                    i31 = i5;
                                                    zzh2 = z3;
                                                    i18 = i4;
                                                }
                                            }
                                            i5 = i31;
                                            i4 = i18;
                                            zzfo = new zzfo(zzc3, zzc4, zzc5 + 1, i42, i43, i44, i45, i46, i47);
                                        } else {
                                            zzfw.zzf(i40 * 8);
                                            i31 = i31;
                                            i18 = i18;
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i31;
                        i4 = i18;
                        zzfo = null;
                        if (!(zzfo == null || zzfs3 == null)) {
                            i3 = 0;
                            if (zzfo.zza == ((zzfi) zzfs3.zza.get(0)).zzb) {
                                i31 = i5;
                                i18 = i4;
                                i28 = 4;
                                i17 = i33 + zzq4;
                                zzen2.zzM(zzq4);
                                i31++;
                                i13 = i3;
                                zzm3 = i32;
                                zzq3 = i2;
                                zzm4 = i;
                                i12 = 4;
                            } else {
                                i28 = 5;
                                i31 = i5;
                                i18 = i4;
                                i17 = i33 + zzq4;
                                zzen2.zzM(zzq4);
                                i31++;
                                i13 = i3;
                                zzm3 = i32;
                                zzq3 = i2;
                                zzm4 = i;
                                i12 = 4;
                            }
                        }
                        i3 = 0;
                        i31 = i5;
                        i18 = i4;
                        i17 = i33 + zzq4;
                        zzen2.zzM(zzq4);
                        i31++;
                        i13 = i3;
                        zzm3 = i32;
                        zzq3 = i2;
                        zzm4 = i;
                        i12 = 4;
                    }
                } else if (i31 == 0) {
                    zzfp zzd2 = zzfv.zzd(bArr, i33, i33 + zzq4, zzfs3);
                    int i48 = zzd2.zze;
                    int i49 = zzd2.zzf;
                    int i50 = zzd2.zzg;
                    int i51 = zzd2.zza + 1;
                    int i52 = zzd2.zzh;
                    int i53 = zzd2.zzc + 8;
                    int i54 = zzd2.zzd + 8;
                    int i55 = zzd2.zzk;
                    int i56 = zzd2.zzl;
                    int i57 = zzd2.zzm;
                    float f2 = zzd2.zzi;
                    int i58 = zzd2.zzj;
                    zzfk zzfk = zzd2.zzb;
                    if (zzfk != null) {
                        i11 = i58;
                        i10 = i50;
                        i9 = i48;
                        i = zzm4;
                        i8 = i49;
                        str2 = zzdk.zzd(zzfk.zza, zzfk.zzb, zzfk.zzc, zzfk.zzd, zzfk.zze, zzfk.zzf);
                    } else {
                        i11 = i58;
                        i10 = i50;
                        i9 = i48;
                        i = zzm4;
                        i8 = i49;
                    }
                    i18 = i51;
                    i19 = i9;
                    i3 = 0;
                    i29 = i11;
                    i27 = i57;
                    i25 = i55;
                    i23 = i53;
                    i22 = i52;
                    i20 = i8;
                    int i59 = i56;
                    i24 = i54;
                    i21 = i10;
                    f = f2;
                    i26 = i59;
                    i17 = i33 + zzq4;
                    zzen2.zzM(zzq4);
                    i31++;
                    i13 = i3;
                    zzm3 = i32;
                    zzq3 = i2;
                    zzm4 = i;
                    i12 = 4;
                } else {
                    i = zzm4;
                }
                i5 = i31;
                i4 = i18;
                i3 = 0;
                i31 = i5;
                i18 = i4;
                i17 = i33 + zzq4;
                zzen2.zzM(zzq4);
                i31++;
                i13 = i3;
                zzm3 = i32;
                zzq3 = i2;
                zzm4 = i;
                i12 = 4;
            }
            int i60 = zzm3;
            int i61 = i13;
            int i62 = i18;
            i30++;
            zzfs2 = zzfs3;
            i12 = 4;
        }
        if (i14 == 0) {
            list = Collections.emptyList();
        } else {
            list = Collections.singletonList(bArr);
        }
        return new zzaek(list, zzm2 + 1, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, f, i29, str2, zzfs2);
    }
}
