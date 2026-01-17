package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgkr {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgoh zzc = zzgoh.zzb(new zzgkn(), zzghm.class, zzgoy.class);
    private static final zzgod zzd;
    private static final zzgmx zze = zzgmx.zzb(new zzgkp(), zzghe.class, zzgox.class);
    private static final zzgmt zzf;

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzgko(), zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgkq(), zzb2, zzgox.class);
    }

    public static /* synthetic */ zzghe zza(zzgox zzgox, zzgfn zzgfn) {
        if (zzgox.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgsy zzd2 = zzgsy.zzd(zzgox.zze(), zzgyr.zza());
                if (zzd2.zza() == 0) {
                    zzghj zzc2 = zzghm.zzc();
                    zzc2.zzb(zzd2.zzf().zzd());
                    zzc2.zza(12);
                    zzc2.zzc(16);
                    zzc2.zzd(zzf(zzgox.zzc()));
                    zzghm zze2 = zzc2.zze();
                    zzghc zzc3 = zzghe.zzc();
                    zzc3.zzc(zze2);
                    zzc3.zzb(zzgxf.zzb(zzd2.zzf().zzA(), zzgfn));
                    zzc3.zza(zzgox.zzf());
                    return zzc3.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzw unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzghm zzb(zzgoy zzgoy) {
        if (zzgoy.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgtb zzf2 = zzgtb.zzf(zzgoy.zzc().zzh(), zzgyr.zza());
                if (zzf2.zzb() == 0) {
                    zzghj zzc2 = zzghm.zzc();
                    zzc2.zzb(zzf2.zza());
                    zzc2.zza(12);
                    zzc2.zzc(16);
                    zzc2.zzd(zzf(zzgoy.zzc().zzg()));
                    return zzc2.zze();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoy.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgox zzc(zzghe zzghe, zzgfn zzgfn) {
        zzgsw zzb2 = zzgsy.zzb();
        byte[] zzd2 = zzghe.zze().zzd(zzgfn);
        zzb2.zza(zzgxz.zzv(zzd2, 0, zzd2.length));
        return zzgox.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgsy) zzb2.zzbr()).zzaN(), zzgtz.SYMMETRIC, zzg(zzghe.zzd().zzd()), zzghe.zzf());
    }

    public static /* synthetic */ zzgoy zzd(zzghm zzghm) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgsz zzc2 = zzgtb.zzc();
        zzc2.zza(zzghm.zzb());
        zza2.zzc(((zzgtb) zzc2.zzbr()).zzaN());
        zza2.zza(zzg(zzghm.zzd()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static void zze(zzgny zzgny) throws GeneralSecurityException {
        zzgny.zzi(zzc);
        zzgny.zzh(zzd);
        zzgny.zzg(zze);
        zzgny.zzf(zzf);
    }

    private static zzghk zzf(zzgvf zzgvf) throws GeneralSecurityException {
        int ordinal = zzgvf.ordinal();
        if (ordinal == 1) {
            return zzghk.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzghk.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgvf.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzghk.zzb;
    }

    private static zzgvf zzg(zzghk zzghk) throws GeneralSecurityException {
        if (zzghk.zza.equals(zzghk)) {
            return zzgvf.TINK;
        }
        if (zzghk.zzb.equals(zzghk)) {
            return zzgvf.CRUNCHY;
        }
        if (zzghk.zzc.equals(zzghk)) {
            return zzgvf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzghk))));
    }
}
