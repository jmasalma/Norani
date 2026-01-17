package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgkx {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgoh zzc = zzgoh.zzb(new zzgkt(), zzghx.class, zzgoy.class);
    private static final zzgod zzd;
    private static final zzgmx zze = zzgmx.zzb(new zzgkv(), zzghp.class, zzgox.class);
    private static final zzgmt zzf;

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzgku(), zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgkw(), zzb2, zzgox.class);
    }

    public static /* synthetic */ zzghp zza(zzgox zzgox, zzgfn zzgfn) {
        if (zzgox.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgte zzd2 = zzgte.zzd(zzgox.zze(), zzgyr.zza());
                if (zzd2.zza() == 0) {
                    zzghu zzc2 = zzghx.zzc();
                    zzc2.zza(zzd2.zzf().zzd());
                    zzc2.zzb(zzf(zzgox.zzc()));
                    zzghx zzc3 = zzc2.zzc();
                    zzghn zzc4 = zzghp.zzc();
                    zzc4.zzc(zzc3);
                    zzc4.zzb(zzgxf.zzb(zzd2.zzf().zzA(), zzgfn));
                    zzc4.zza(zzgox.zzf());
                    return zzc4.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzw unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzghx zzb(zzgoy zzgoy) {
        if (zzgoy.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgth zzf2 = zzgth.zzf(zzgoy.zzc().zzh(), zzgyr.zza());
                if (zzf2.zzb() == 0) {
                    zzghu zzc2 = zzghx.zzc();
                    zzc2.zza(zzf2.zza());
                    zzc2.zzb(zzf(zzgoy.zzc().zzg()));
                    return zzc2.zzc();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoy.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgox zzc(zzghp zzghp, zzgfn zzgfn) {
        zzgtc zzb2 = zzgte.zzb();
        byte[] zzd2 = zzghp.zze().zzd(zzgfn);
        zzb2.zza(zzgxz.zzv(zzd2, 0, zzd2.length));
        return zzgox.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgte) zzb2.zzbr()).zzaN(), zzgtz.SYMMETRIC, zzg(zzghp.zzd().zzd()), zzghp.zzf());
    }

    public static /* synthetic */ zzgoy zzd(zzghx zzghx) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgtf zzc2 = zzgth.zzc();
        zzc2.zza(zzghx.zzb());
        zza2.zzc(((zzgth) zzc2.zzbr()).zzaN());
        zza2.zza(zzg(zzghx.zzd()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static void zze(zzgny zzgny) throws GeneralSecurityException {
        zzgny.zzi(zzc);
        zzgny.zzh(zzd);
        zzgny.zzg(zze);
        zzgny.zzf(zzf);
    }

    private static zzghv zzf(zzgvf zzgvf) throws GeneralSecurityException {
        int ordinal = zzgvf.ordinal();
        if (ordinal == 1) {
            return zzghv.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzghv.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgvf.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzghv.zzb;
    }

    private static zzgvf zzg(zzghv zzghv) throws GeneralSecurityException {
        if (zzghv.zza.equals(zzghv)) {
            return zzgvf.TINK;
        }
        if (zzghv.zzb.equals(zzghv)) {
            return zzgvf.CRUNCHY;
        }
        if (zzghv.zzc.equals(zzghv)) {
            return zzgvf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzghv))));
    }
}
