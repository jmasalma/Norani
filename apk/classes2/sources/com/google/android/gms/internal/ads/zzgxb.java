package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgxb implements zzgfl {
    private static final byte[] zza = {0};
    private final zzgro zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgxb(zzgpm zzgpm) throws GeneralSecurityException {
        this.zzb = new zzgwy(zzgpm.zze().zzd(zzgey.zza()));
        this.zzc = zzgpm.zzc().zzb();
        this.zzd = zzgpm.zzd().zzd();
        if (zzgpm.zzc().zzf().equals(zzgps.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgfl zza(zzgpm zzgpm) throws GeneralSecurityException {
        return new zzgxb(zzgpm);
    }

    public static zzgfl zzb(zzgqb zzgqb) throws GeneralSecurityException {
        return new zzgxb(zzgqb);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        if (bArr2.length > 0) {
            return zzgwe.zzb(this.zzd, this.zzb.zza(zzgwe.zzb(bArr, bArr2), this.zzc));
        }
        return zzgwe.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgxb(zzgqb zzgqb) throws GeneralSecurityException {
        String valueOf = String.valueOf(String.valueOf(zzgqb.zzc().zzf()));
        this.zzb = new zzgxa("HMAC".concat(valueOf), new SecretKeySpec(zzgqb.zze().zzd(zzgey.zza()), "HMAC"));
        this.zzc = zzgqb.zzc().zzb();
        this.zzd = zzgqb.zzd().zzd();
        if (zzgqb.zzc().zzg().equals(zzgqj.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgxb(zzgro zzgro, int i) throws GeneralSecurityException {
        this.zzb = zzgro;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgro.zza(new byte[0], i);
    }
}
