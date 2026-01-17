package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzyh extends zzbq {
    /* access modifiers changed from: private */
    public boolean zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    /* access modifiers changed from: private */
    public boolean zzc;
    /* access modifiers changed from: private */
    public boolean zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public boolean zzg;
    /* access modifiers changed from: private */
    public final SparseArray zzh;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzi;

    public zzyh() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    /* access modifiers changed from: protected */
    public final zzyh zzw(zzbr zzbr) {
        super.zzj(zzbr);
        return this;
    }

    public final zzyh zzx(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i) != z) {
            if (z) {
                sparseBooleanArray.put(i, true);
            } else {
                sparseBooleanArray.delete(i);
            }
        }
        return this;
    }

    /* synthetic */ zzyh(zzyi zzyi, zzyt zzyt) {
        super(zzyi);
        this.zza = zzyi.zzG;
        this.zzb = zzyi.zzI;
        this.zzc = zzyi.zzK;
        this.zzd = zzyi.zzP;
        this.zze = zzyi.zzQ;
        this.zzf = zzyi.zzR;
        this.zzg = zzyi.zzT;
        SparseArray zza2 = zzyi.zzV;
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < zza2.size(); i++) {
            sparseArray.put(zza2.keyAt(i), new HashMap((Map) zza2.valueAt(i)));
        }
        this.zzh = sparseArray;
        this.zzi = zzyi.zzW.clone();
    }
}
