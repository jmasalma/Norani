package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzze {
    public final int zza;
    public final zzme[] zzb;
    public final zzyw[] zzc;
    public final zzbt zzd;
    public final Object zze;

    public zzze(zzme[] zzmeArr, zzyw[] zzywArr, zzbt zzbt, Object obj) {
        int length = zzmeArr.length;
        zzdd.zzd(length == zzywArr.length);
        this.zzb = zzmeArr;
        this.zzc = (zzyw[]) zzywArr.clone();
        this.zzd = zzbt;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(zzze zzze, int i) {
        if (zzze != null && Objects.equals(this.zzb[i], zzze.zzb[i]) && Objects.equals(this.zzc[i], zzze.zzc[i])) {
            return true;
        }
        return false;
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
