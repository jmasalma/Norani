package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaoi implements zzaoa {
    final /* synthetic */ zzaoj zza;
    private final zzem zzb = new zzem(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzaoi(zzaoj zzaoj, int i) {
        Objects.requireNonNull(zzaoj);
        this.zza = zzaoj;
        this.zze = i;
    }

    public final void zza(zzen zzen) {
        int i;
        zzeu zzeu;
        int i2;
        zzem zzem;
        zzeu zzeu2;
        int i3;
        zzen zzen2 = zzen;
        if (zzen.zzm() == 2) {
            zzaoj zzaoj = this.zza;
            zzeu zzeu3 = (zzeu) zzaoj.zzb.get(0);
            if ((zzen.zzm() & 128) != 0) {
                zzen2.zzM(1);
                int zzq = zzen.zzq();
                int i4 = 3;
                zzen2.zzM(3);
                zzem zzem2 = this.zzb;
                zzen2.zzG(zzem2, 2);
                zzem2.zzn(3);
                int i5 = 13;
                zzaoj.zzr = zzem2.zzd(13);
                zzen2.zzG(zzem2, 2);
                int i6 = 4;
                zzem2.zzn(4);
                int i7 = 12;
                zzen2.zzM(zzem2.zzd(12));
                SparseArray sparseArray = this.zzc;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.zzd;
                sparseIntArray.clear();
                int zza2 = zzen.zza();
                while (zza2 > 0) {
                    int i8 = 5;
                    zzen2.zzG(zzem2, 5);
                    int zzd2 = zzem2.zzd(8);
                    zzem2.zzn(i4);
                    int zzd3 = zzem2.zzd(i5);
                    zzem2.zzn(i6);
                    int zzd4 = zzem2.zzd(i7);
                    int zzc2 = zzen.zzc();
                    int i9 = zzc2 + zzd4;
                    String str = null;
                    ArrayList arrayList = null;
                    int i10 = -1;
                    int i11 = 0;
                    while (zzen.zzc() < i9) {
                        int zzm = zzen.zzm();
                        int zzc3 = zzen.zzc() + zzen.zzm();
                        if (zzc3 > i9) {
                            break;
                        }
                        if (zzm == i8) {
                            long zzu = zzen.zzu();
                            if (zzu != 1094921523) {
                                if (zzu != 1161904947) {
                                    if (zzu != 1094921524) {
                                        if (zzu == 1212503619) {
                                            i3 = 36;
                                            i10 = i3;
                                        }
                                        zzeu2 = zzeu3;
                                        i2 = zzq;
                                        zzem = zzem2;
                                        zzen2.zzM(zzc3 - zzen.zzc());
                                        zzeu3 = zzeu2;
                                        zzem2 = zzem;
                                        zzq = i2;
                                        i8 = 5;
                                    }
                                }
                                zzeu2 = zzeu3;
                                i2 = zzq;
                                zzem = zzem2;
                                i10 = 135;
                                zzen2.zzM(zzc3 - zzen.zzc());
                                zzeu3 = zzeu2;
                                zzem2 = zzem;
                                zzq = i2;
                                i8 = 5;
                            }
                            zzeu2 = zzeu3;
                            i2 = zzq;
                            zzem = zzem2;
                            i10 = 129;
                            zzen2.zzM(zzc3 - zzen.zzc());
                            zzeu3 = zzeu2;
                            zzem2 = zzem;
                            zzq = i2;
                            i8 = 5;
                        } else {
                            if (zzm != 106) {
                                if (zzm != 122) {
                                    if (zzm == 127) {
                                        int zzm2 = zzen.zzm();
                                        if (zzm2 != 21) {
                                            if (zzm2 == 14) {
                                                i3 = 136;
                                            } else {
                                                if (zzm2 == 33) {
                                                    i3 = 139;
                                                }
                                                zzeu2 = zzeu3;
                                                i2 = zzq;
                                                zzem = zzem2;
                                                zzen2.zzM(zzc3 - zzen.zzc());
                                                zzeu3 = zzeu2;
                                                zzem2 = zzem;
                                                zzq = i2;
                                                i8 = 5;
                                            }
                                            i10 = i3;
                                            zzeu2 = zzeu3;
                                            i2 = zzq;
                                            zzem = zzem2;
                                            zzen2.zzM(zzc3 - zzen.zzc());
                                            zzeu3 = zzeu2;
                                            zzem2 = zzem;
                                            zzq = i2;
                                            i8 = 5;
                                        }
                                    } else if (zzm == 123) {
                                        i3 = 138;
                                        i10 = i3;
                                        zzeu2 = zzeu3;
                                        i2 = zzq;
                                        zzem = zzem2;
                                        zzen2.zzM(zzc3 - zzen.zzc());
                                        zzeu3 = zzeu2;
                                        zzem2 = zzem;
                                        zzq = i2;
                                        i8 = 5;
                                    } else if (zzm == 10) {
                                        String trim = zzen2.zzB(3, StandardCharsets.UTF_8).trim();
                                        i11 = zzen.zzm();
                                        str = trim;
                                        zzeu2 = zzeu3;
                                        i2 = zzq;
                                        zzem = zzem2;
                                        zzen2.zzM(zzc3 - zzen.zzc());
                                        zzeu3 = zzeu2;
                                        zzem2 = zzem;
                                        zzq = i2;
                                        i8 = 5;
                                    } else {
                                        if (zzm == 89) {
                                            ArrayList arrayList2 = new ArrayList();
                                            while (zzen.zzc() < zzc3) {
                                                zzem zzem3 = zzem2;
                                                String trim2 = zzen2.zzB(3, StandardCharsets.UTF_8).trim();
                                                int zzm3 = zzen.zzm();
                                                zzeu zzeu4 = zzeu3;
                                                byte[] bArr = new byte[4];
                                                zzen2.zzH(bArr, 0, 4);
                                                arrayList2.add(new zzaok(trim2, zzm3, bArr));
                                                zzeu3 = zzeu4;
                                                zzem2 = zzem3;
                                                zzq = zzq;
                                            }
                                            zzeu2 = zzeu3;
                                            i2 = zzq;
                                            zzem = zzem2;
                                            arrayList = arrayList2;
                                            i10 = 89;
                                        } else {
                                            zzeu2 = zzeu3;
                                            i2 = zzq;
                                            zzem = zzem2;
                                            if (zzm == 111) {
                                                i10 = 257;
                                            }
                                        }
                                        zzen2.zzM(zzc3 - zzen.zzc());
                                        zzeu3 = zzeu2;
                                        zzem2 = zzem;
                                        zzq = i2;
                                        i8 = 5;
                                    }
                                }
                                zzeu2 = zzeu3;
                                i2 = zzq;
                                zzem = zzem2;
                                i10 = 135;
                                zzen2.zzM(zzc3 - zzen.zzc());
                                zzeu3 = zzeu2;
                                zzem2 = zzem;
                                zzq = i2;
                                i8 = 5;
                            }
                            zzeu2 = zzeu3;
                            i2 = zzq;
                            zzem = zzem2;
                            i10 = 129;
                            zzen2.zzM(zzc3 - zzen.zzc());
                            zzeu3 = zzeu2;
                            zzem2 = zzem;
                            zzq = i2;
                            i8 = 5;
                        }
                        zzeu2 = zzeu3;
                        i2 = zzq;
                        zzem = zzem2;
                        i10 = 172;
                        zzen2.zzM(zzc3 - zzen.zzc());
                        zzeu3 = zzeu2;
                        zzem2 = zzem;
                        zzq = i2;
                        i8 = 5;
                    }
                    zzeu zzeu5 = zzeu3;
                    int i12 = zzq;
                    zzem zzem4 = zzem2;
                    zzen2.zzL(i9);
                    zzaol zzaol = new zzaol(i10, str, i11, arrayList, Arrays.copyOfRange(zzen.zzN(), zzc2, i9));
                    if (zzd2 == 6 || zzd2 == 5) {
                        zzd2 = zzaol.zza;
                    }
                    zza2 -= zzd4 + 5;
                    if (!zzaoj.zzh.get(zzd3)) {
                        zzaoo zzb2 = zzaoj.zze.zzb(zzd2, zzaol);
                        sparseIntArray.put(zzd3, zzd3);
                        sparseArray.put(zzd3, zzb2);
                    }
                    i6 = 4;
                    zzeu3 = zzeu5;
                    zzem2 = zzem4;
                    zzq = i12;
                    i4 = 3;
                    i5 = 13;
                    i7 = 12;
                }
                zzeu zzeu6 = zzeu3;
                int i13 = zzq;
                int size = sparseIntArray.size();
                int i14 = 0;
                while (i14 < size) {
                    int keyAt = sparseIntArray.keyAt(i14);
                    int valueAt = sparseIntArray.valueAt(i14);
                    zzaoj.zzh.put(keyAt, true);
                    zzaoj.zzi.put(valueAt, true);
                    zzaoo zzaoo = (zzaoo) sparseArray.valueAt(i14);
                    if (zzaoo != null) {
                        zzady zzk = zzaoj.zzl;
                        i = i13;
                        zzaon zzaon = new zzaon(i, keyAt, ConstantsKt.DEFAULT_BUFFER_SIZE);
                        zzeu = zzeu6;
                        zzaoo.zzb(zzeu, zzk, zzaon);
                        zzaoj.zzg.put(valueAt, zzaoo);
                    } else {
                        zzeu = zzeu6;
                        i = i13;
                    }
                    i14++;
                    zzeu6 = zzeu;
                    i13 = i;
                }
                zzaoj.zzg.remove(this.zze);
                zzaoj.zzm = 0;
                if (zzaoj.zzm == 0) {
                    zzaoj.zzl.zzG();
                    zzaoj.zzn = true;
                    return;
                }
                return;
            }
        }
    }

    public final void zzb(zzeu zzeu, zzady zzady, zzaon zzaon) {
    }
}
