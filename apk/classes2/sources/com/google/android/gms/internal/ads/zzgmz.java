package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgmz implements zzgfa {
    final String zza;
    final Class zzb;
    final zzgtz zzc;

    zzgmz(String str, Class cls, zzgtz zzgtz, zzhba zzhba) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgtz;
    }

    public static zzgfa zzd(String str, Class cls, zzgtz zzgtz, zzhba zzhba) {
        return new zzgmz(str, cls, zzgtz, zzhba);
    }

    public final zzgub zza(zzgxz zzgxz) throws GeneralSecurityException {
        zzgud zza2 = zzguf.zza();
        zza2.zzb(this.zza);
        zza2.zzc(zzgxz);
        zza2.zza(zzgvf.RAW);
        zzgox zzgox = (zzgox) zzgny.zzc().zzd(zzgno.zzb().zza(zzgny.zzc().zzb(zzgoy.zza((zzguf) zza2.zzbr())), (Integer) null), zzgox.class, zzgey.zza());
        zzgty zza3 = zzgub.zza();
        zza3.zzb(zzgox.zzg());
        zza3.zzc(zzgox.zze());
        zza3.zza(zzgox.zzb());
        return (zzgub) zza3.zzbr();
    }

    public final Class zzb() {
        return this.zzb;
    }

    public final Object zzc(zzgxz zzgxz) throws GeneralSecurityException {
        return zzgnv.zza().zzb(zzgny.zzc().zza(zzgox.zza(this.zza, zzgxz, this.zzc, zzgvf.RAW, (Integer) null), zzgey.zza()), this.zzb);
    }
}
