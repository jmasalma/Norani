package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzyi extends zzbr {
    public static final zzyi zzF = new zzyi(new zzyh());
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    /* access modifiers changed from: private */
    public final SparseArray zzV;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzW;

    static {
        String str = zzex.zza;
        Integer.toString(zzbcj.zzq.zzf, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    private zzyi(zzyh zzyh) {
        super(zzyh);
        this.zzG = zzyh.zza;
        this.zzH = false;
        this.zzI = zzyh.zzb;
        this.zzJ = false;
        this.zzK = zzyh.zzc;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = zzyh.zzd;
        this.zzQ = zzyh.zze;
        this.zzR = zzyh.zzf;
        this.zzS = false;
        this.zzT = zzyh.zzg;
        this.zzU = false;
        this.zzV = zzyh.zzh;
        this.zzW = zzyh.zzi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzyi zzyi = (zzyi) obj;
            if (super.equals(zzyi) && this.zzG == zzyi.zzG && this.zzI == zzyi.zzI && this.zzK == zzyi.zzK && this.zzP == zzyi.zzP && this.zzQ == zzyi.zzQ && this.zzR == zzyi.zzR && this.zzT == zzyi.zzT) {
                SparseBooleanArray sparseBooleanArray = this.zzW;
                SparseBooleanArray sparseBooleanArray2 = zzyi.zzW;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzV;
                            SparseArray sparseArray2 = zzyi.zzV;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzxk zzxk = (zzxk) entry.getKey();
                                                if (map2.containsKey(zzxk)) {
                                                    if (!Objects.equals(entry.getValue(), map2.get(zzxk))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 28629151) + (this.zzP ? 1 : 0)) * 31) + (this.zzQ ? 1 : 0)) * 31) + (this.zzR ? 1 : 0)) * 961) + (this.zzT ? 1 : 0)) * 31;
    }

    public final zzyh zzc() {
        return new zzyh(this, (zzyt) null);
    }

    @Deprecated
    public final zzyj zzd(int i, zzxk zzxk) {
        Map map = (Map) this.zzV.get(i);
        if (map != null) {
            return (zzyj) map.get(zzxk);
        }
        return null;
    }

    public final boolean zze(int i) {
        return this.zzW.get(i);
    }

    @Deprecated
    public final boolean zzf(int i, zzxk zzxk) {
        Map map = (Map) this.zzV.get(i);
        return map != null && map.containsKey(zzxk);
    }
}
