package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzmq {
    private final zzv zza;
    private final SparseArray zzb;

    public zzmq(zzv zzv, SparseArray sparseArray) {
        this.zza = zzv;
        SparseArray sparseArray2 = new SparseArray(zzv.zzb());
        for (int i = 0; i < zzv.zzb(); i++) {
            int zza2 = zzv.zza(i);
            zzmp zzmp = (zzmp) sparseArray.get(zza2);
            zzmp.getClass();
            zzmp zzmp2 = zzmp;
            sparseArray2.append(zza2, zzmp);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzmp zzc(int i) {
        zzmp zzmp = (zzmp) this.zzb.get(i);
        zzmp.getClass();
        zzmp zzmp2 = zzmp;
        return zzmp;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
