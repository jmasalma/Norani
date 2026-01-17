package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzxt implements zzyw {
    protected final zzbm zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzz[] zzd;
    private int zze;

    public zzxt(zzbm zzbm, int[] iArr, int i) {
        int length = iArr.length;
        zzdd.zzf(length > 0);
        zzbm.getClass();
        zzbm zzbm2 = zzbm;
        this.zza = zzbm;
        this.zzb = length;
        this.zzd = new zzz[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzbm.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzd, new zzxs());
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzbm.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxt zzxt = (zzxt) obj;
            return this.zza.equals(zzxt.zza) && Arrays.equals(this.zzc, zzxt.zzc);
        }
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = identityHashCode;
        return identityHashCode;
    }

    public final zzz zza(int i) {
        return this.zzd[i];
    }

    public final zzz zzb() {
        return this.zzd[0];
    }

    public final zzbm zzc() {
        return this.zza;
    }

    public final int zze(int i) {
        return this.zzc[i];
    }

    public final int zzf() {
        return this.zzc[0];
    }

    public final int zzg(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int zzh() {
        return this.zzc.length;
    }
}
