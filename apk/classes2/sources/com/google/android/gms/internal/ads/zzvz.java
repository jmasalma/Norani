package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzvz extends zzup {
    private static final zzap zza;
    private final zzvj[] zzb;
    private final List zzc;
    private final zzbl[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzvw zzh;
    private final zzus zzi;

    static {
        zzad zzad = new zzad();
        zzad.zza("MergingMediaSource");
        zza = zzad.zzc();
    }

    public zzvz(boolean z, boolean z2, zzus zzus, zzvj... zzvjArr) {
        this.zzb = zzvjArr;
        this.zzi = zzus;
        this.zze = new ArrayList(Arrays.asList(zzvjArr));
        this.zzc = new ArrayList(zzvjArr.length);
        int i = 0;
        while (true) {
            int length = zzvjArr.length;
            if (i < length) {
                this.zzc.add(new ArrayList());
                i++;
            } else {
                this.zzd = new zzbl[length];
                this.zzg = new long[0][];
                new HashMap();
                zzfzw.zzb(8).zzb(2).zza();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzvj zzvj, zzbl zzbl) {
        int i;
        Integer num = (Integer) obj;
        if (this.zzh == null) {
            if (this.zzf == -1) {
                i = zzbl.zzb();
                this.zzf = i;
            } else {
                int zzb2 = zzbl.zzb();
                int i2 = this.zzf;
                if (zzb2 != i2) {
                    this.zzh = new zzvw(0);
                    return;
                }
                i = i2;
            }
            if (this.zzg.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.zzd.length;
                iArr[0] = i;
                this.zzg = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            ArrayList arrayList = this.zze;
            arrayList.remove(zzvj);
            zzbl[] zzblArr = this.zzd;
            zzblArr[num.intValue()] = zzbl;
            if (arrayList.isEmpty()) {
                zzo(zzblArr[0]);
            }
        }
    }

    public final void zzG(zzvf zzvf) {
        zzvv zzvv = (zzvv) zzvf;
        int i = 0;
        while (true) {
            zzvj[] zzvjArr = this.zzb;
            if (i < zzvjArr.length) {
                List list = (List) this.zzc.get(i);
                zzvf zzn = zzvv.zzn(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    } else if (((zzvx) list.get(i2)).zzb.equals(zzn)) {
                        list.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                zzvjArr[i].zzG(zzvv.zzn(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final zzvf zzI(zzvh zzvh, zzzm zzzm, long j) {
        zzbl[] zzblArr = this.zzd;
        zzvj[] zzvjArr = this.zzb;
        int length = zzvjArr.length;
        zzvf[] zzvfArr = new zzvf[length];
        int zza2 = zzblArr[0].zza(zzvh.zza);
        for (int i = 0; i < length; i++) {
            zzvh zza3 = zzvh.zza(zzblArr[i].zzf(zza2));
            zzvfArr[i] = zzvjArr[i].zzI(zza3, zzzm, j - this.zzg[zza2][i]);
            ((List) this.zzc.get(i)).add(new zzvx(zza3, zzvfArr[i], (zzvy) null));
        }
        return new zzvv(this.zzi, this.zzg[zza2], zzvfArr);
    }

    public final zzap zzJ() {
        zzvj[] zzvjArr = this.zzb;
        return zzvjArr.length > 0 ? zzvjArr[0].zzJ() : zza;
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzhj zzhj) {
        super.zzn(zzhj);
        int i = 0;
        while (true) {
            zzvj[] zzvjArr = this.zzb;
            if (i < zzvjArr.length) {
                zzB(Integer.valueOf(i), zzvjArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    public final void zzt(zzap zzap) {
        this.zzb[0].zzt(zzap);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ zzvh zzy(Object obj, zzvh zzvh) {
        int intValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(intValue);
        for (int i = 0; i < list2.size(); i++) {
            if (((zzvx) list2.get(i)).zza.equals(zzvh)) {
                return ((zzvx) ((List) list.get(0)).get(i)).zza;
            }
        }
        return null;
    }

    public final void zzz() throws IOException {
        zzvw zzvw = this.zzh;
        if (zzvw == null) {
            super.zzz();
            return;
        }
        throw zzvw;
    }
}
