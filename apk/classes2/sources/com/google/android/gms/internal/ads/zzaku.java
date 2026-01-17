package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaku implements zzady {
    private final zzady zzb;
    private final zzakr zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzaku(zzady zzady, zzakr zzakr) {
        this.zzb = zzady;
        this.zzc = zzakr;
    }

    public final void zzG() {
        this.zzb.zzG();
        if (this.zze) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.zzd;
                if (i < sparseArray.size()) {
                    ((zzakw) sparseArray.valueAt(i)).zzb(true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzP(zzaeu zzaeu) {
        this.zzb.zzP(zzaeu);
    }

    public final zzafb zzw(int i, int i2) {
        if (i2 != 3) {
            this.zze = true;
            return this.zzb.zzw(i, i2);
        }
        SparseArray sparseArray = this.zzd;
        zzakw zzakw = (zzakw) sparseArray.get(i);
        if (zzakw != null) {
            return zzakw;
        }
        zzakw zzakw2 = new zzakw(this.zzb.zzw(i, 3), this.zzc);
        sparseArray.put(i, zzakw2);
        return zzakw2;
    }
}
