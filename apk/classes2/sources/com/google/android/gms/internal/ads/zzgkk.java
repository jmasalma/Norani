package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgkk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgoh zzc = zzgoh.zzb(new zzgkg(), zzghb.class, zzgoy.class);
    private static final zzgod zzd;
    private static final zzgmx zze = zzgmx.zzb(new zzgki(), zzggu.class, zzgox.class);
    private static final zzgmt zzf;

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzgkh(), zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgkj(), zzb2, zzgox.class);
    }

    public static /* synthetic */ zzggu zza(zzgox zzgox, zzgfn zzgfn) {
        if (zzgox.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgsp zzd2 = zzgsp.zzd(zzgox.zze(), zzgyr.zza());
                if (zzd2.zza() == 0) {
                    zzggy zzd3 = zzghb.zzd();
                    zzd3.zzb(zzd2.zzg().zzd());
                    zzd3.zza(zzd2.zzf().zza());
                    zzd3.zzc(16);
                    zzd3.zzd(zzf(zzgox.zzc()));
                    zzghb zze2 = zzd3.zze();
                    zzggs zzc2 = zzggu.zzc();
                    zzc2.zzc(zze2);
                    zzc2.zzb(zzgxf.zzb(zzd2.zzg().zzA(), zzgfn));
                    zzc2.zza(zzgox.zzf());
                    return zzc2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzw unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzghb zzb(zzgoy zzgoy) {
        if (zzgoy.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgss zzd2 = zzgss.zzd(zzgoy.zzc().zzh(), zzgyr.zza());
                zzggy zzd3 = zzghb.zzd();
                zzd3.zzb(zzd2.zza());
                zzd3.zza(zzd2.zzf().zza());
                zzd3.zzc(16);
                zzd3.zzd(zzf(zzgoy.zzc().zzg()));
                return zzd3.zze();
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoy.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgox zzc(zzggu zzggu, zzgfn zzgfn) {
        zzgsn zzb2 = zzgsp.zzb();
        zzb2.zzb(zzg(zzggu.zzd()));
        byte[] zzd2 = zzggu.zze().zzd(zzgfn);
        zzb2.zza(zzgxz.zzv(zzd2, 0, zzd2.length));
        return zzgox.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgsp) zzb2.zzbr()).zzaN(), zzgtz.SYMMETRIC, zzh(zzggu.zzd().zze()), zzggu.zzf());
    }

    public static /* synthetic */ zzgoy zzd(zzghb zzghb) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgsq zzb2 = zzgss.zzb();
        zzb2.zzb(zzg(zzghb));
        zzb2.zza(zzghb.zzc());
        zza2.zzc(((zzgss) zzb2.zzbr()).zzaN());
        zza2.zza(zzh(zzghb.zze()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static void zze(zzgny zzgny) throws GeneralSecurityException {
        zzgny.zzi(zzc);
        zzgny.zzh(zzd);
        zzgny.zzg(zze);
        zzgny.zzf(zzf);
    }

    private static zzggz zzf(zzgvf zzgvf) throws GeneralSecurityException {
        int ordinal = zzgvf.ordinal();
        if (ordinal == 1) {
            return zzggz.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzggz.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgvf.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzggz.zzb;
    }

    private static zzgsv zzg(zzghb zzghb) throws GeneralSecurityException {
        zzgst zzb2 = zzgsv.zzb();
        zzb2.zza(zzghb.zzb());
        return (zzgsv) zzb2.zzbr();
    }

    private static zzgvf zzh(zzggz zzggz) throws GeneralSecurityException {
        if (zzggz.zza.equals(zzggz)) {
            return zzgvf.TINK;
        }
        if (zzggz.zzb.equals(zzggz)) {
            return zzgvf.CRUNCHY;
        }
        if (zzggz.zzc.equals(zzggz)) {
            return zzgvf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzggz))));
    }
}
