package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbao implements Comparator {
    public zzbao(zzbap zzbap) {
        Objects.requireNonNull(zzbap);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbad zzbad = (zzbad) obj;
        zzbad zzbad2 = (zzbad) obj2;
        if (zzbad.zzd() < zzbad2.zzd()) {
            return -1;
        }
        if (zzbad.zzd() <= zzbad2.zzd()) {
            if (zzbad.zzb() < zzbad2.zzb()) {
                return -1;
            }
            if (zzbad.zzb() <= zzbad2.zzb()) {
                float zza = (zzbad.zza() - zzbad.zzd()) * (zzbad.zzc() - zzbad.zzb());
                float zza2 = (zzbad2.zza() - zzbad2.zzd()) * (zzbad2.zzc() - zzbad2.zzb());
                if (zza > zza2) {
                    return -1;
                }
                if (zza >= zza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
