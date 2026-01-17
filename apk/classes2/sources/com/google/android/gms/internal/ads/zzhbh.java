package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhbh {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhbh() {
    }

    static /* bridge */ /* synthetic */ zzgxz zza(zzhbh zzhbh, zzgxz zzgxz, zzgxz zzgxz2) {
        zzhbh.zzb(zzgxz);
        zzhbh.zzb(zzgxz2);
        ArrayDeque arrayDeque = zzhbh.zza;
        zzgxz zzgxz3 = (zzgxz) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzgxz3 = new zzhbk((zzgxz) arrayDeque.pop(), zzgxz3);
        }
        return zzgxz3;
    }

    private final void zzb(zzgxz zzgxz) {
        if (zzgxz.zzh()) {
            int zzc = zzc(zzgxz.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzhbk.zzc(zzc + 1);
            if (arrayDeque.isEmpty() || ((zzgxz) arrayDeque.peek()).zzd() >= zzc2) {
                arrayDeque.push(zzgxz);
                return;
            }
            int zzc3 = zzhbk.zzc(zzc);
            zzgxz zzgxz2 = (zzgxz) arrayDeque.pop();
            while (!arrayDeque.isEmpty() && ((zzgxz) arrayDeque.peek()).zzd() < zzc3) {
                zzgxz2 = new zzhbk((zzgxz) arrayDeque.pop(), zzgxz2);
            }
            zzhbk zzhbk = new zzhbk(zzgxz2, zzgxz);
            while (!arrayDeque.isEmpty() && ((zzgxz) arrayDeque.peek()).zzd() < zzhbk.zzc(zzc(zzhbk.zzd()) + 1)) {
                zzhbk = new zzhbk((zzgxz) arrayDeque.pop(), zzhbk);
            }
            arrayDeque.push(zzhbk);
        } else if (zzgxz instanceof zzhbk) {
            zzhbk zzhbk2 = (zzhbk) zzgxz;
            zzb(zzhbk2.zzd);
            zzb(zzhbk2.zze);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgxz.getClass()))));
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzhbk.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzhbh(zzhbj zzhbj) {
    }
}
