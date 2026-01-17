package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgox implements zzgpb {
    private final String zza;
    private final zzgxe zzb;
    private final zzgxz zzc;
    private final zzgtz zzd;
    private final zzgvf zze;
    @Nullable
    private final Integer zzf;

    private zzgox(String str, zzgxe zzgxe, zzgxz zzgxz, zzgtz zzgtz, zzgvf zzgvf, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzgxe;
        this.zzc = zzgxz;
        this.zzd = zzgtz;
        this.zze = zzgvf;
        this.zzf = num;
    }

    public static zzgox zza(String str, zzgxz zzgxz, zzgtz zzgtz, zzgvf zzgvf, @Nullable Integer num) throws GeneralSecurityException {
        if (zzgvf == zzgvf.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgox(str, zzgpj.zza(str), zzgxz, zzgtz, zzgvf, num);
    }

    public final zzgtz zzb() {
        return this.zzd;
    }

    public final zzgvf zzc() {
        return this.zze;
    }

    public final zzgxe zzd() {
        return this.zzb;
    }

    public final zzgxz zze() {
        return this.zzc;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
