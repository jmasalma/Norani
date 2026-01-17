package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgkf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgoh zzc = zzgoh.zzb(new zzgkb(), zzggr.class, zzgoy.class);
    private static final zzgod zzd;
    private static final zzgmx zze = zzgmx.zzb(new zzgkd(), zzggi.class, zzgox.class);
    private static final zzgmt zzf;

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzgkc(), zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgke(), zzb2, zzgox.class);
    }

    public static /* synthetic */ zzggi zza(zzgox zzgox, zzgfn zzgfn) {
        if (zzgox.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgsa zzd2 = zzgsa.zzd(zzgox.zze(), zzgyr.zza());
                if (zzd2.zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } else if (zzd2.zzf().zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                } else if (zzd2.zzg().zza() == 0) {
                    zzggn zzf2 = zzggr.zzf();
                    zzf2.zza(zzd2.zzf().zzg().zzd());
                    zzf2.zzc(zzd2.zzg().zzh().zzd());
                    zzf2.zzd(zzd2.zzf().zzf().zza());
                    zzf2.zze(zzd2.zzg().zzg().zza());
                    zzf2.zzb(zzf(zzd2.zzg().zzg().zzb()));
                    zzf2.zzf(zzg(zzgox.zzc()));
                    zzggr zzg = zzf2.zzg();
                    zzggg zzc2 = zzggi.zzc();
                    zzc2.zzd(zzg);
                    zzc2.zza(zzgxf.zzb(zzd2.zzf().zzg().zzA(), zzgfn));
                    zzc2.zzb(zzgxf.zzb(zzd2.zzg().zzh().zzA(), zzgfn));
                    zzc2.zzc(zzgox.zzf());
                    return zzc2.zze();
                } else {
                    throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                }
            } catch (zzgzw unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzggr zzb(zzgoy zzgoy) {
        if (zzgoy.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgsd zzc2 = zzgsd.zzc(zzgoy.zzc().zzh(), zzgyr.zza());
                if (zzc2.zzf().zzb() == 0) {
                    zzggn zzf2 = zzggr.zzf();
                    zzf2.zza(zzc2.zzd().zza());
                    zzf2.zzc(zzc2.zzf().zza());
                    zzf2.zzd(zzc2.zzd().zzf().zza());
                    zzf2.zze(zzc2.zzf().zzh().zza());
                    zzf2.zzb(zzf(zzc2.zzf().zzh().zzb()));
                    zzf2.zzf(zzg(zzgoy.zzc().zzg()));
                    return zzf2.zzg();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoy.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgox zzc(zzggi zzggi, zzgfn zzgfn) {
        zzgry zzb2 = zzgsa.zzb();
        zzgse zzb3 = zzgsg.zzb();
        zzgsk zzb4 = zzgsm.zzb();
        zzb4.zza(zzggi.zzd().zzd());
        zzb3.zzb((zzgsm) zzb4.zzbr());
        byte[] zzd2 = zzggi.zze().zzd(zzgfn);
        zzb3.zza(zzgxz.zzv(zzd2, 0, zzd2.length));
        zzb2.zza((zzgsg) zzb3.zzbr());
        zzgtp zzb5 = zzgtr.zzb();
        zzb5.zzb(zzh(zzggi.zzd()));
        byte[] zzd3 = zzggi.zzf().zzd(zzgfn);
        zzb5.zza(zzgxz.zzv(zzd3, 0, zzd3.length));
        zzb2.zzb((zzgtr) zzb5.zzbr());
        return zzgox.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgsa) zzb2.zzbr()).zzaN(), zzgtz.SYMMETRIC, zzi(zzggi.zzd().zzh()), zzggi.zzg());
    }

    public static /* synthetic */ zzgoy zzd(zzggr zzggr) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgsb zza3 = zzgsd.zza();
        zzgsh zzb2 = zzgsj.zzb();
        zzgsk zzb3 = zzgsm.zzb();
        zzb3.zza(zzggr.zzd());
        zzb2.zzb((zzgsm) zzb3.zzbr());
        zzb2.zza(zzggr.zzb());
        zza3.zza((zzgsj) zzb2.zzbr());
        zzgts zzc2 = zzgtu.zzc();
        zzc2.zzb(zzh(zzggr));
        zzc2.zza(zzggr.zzc());
        zza3.zzb((zzgtu) zzc2.zzbr());
        zza2.zzc(((zzgsd) zza3.zzbr()).zzaN());
        zza2.zza(zzi(zzggr.zzh()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static void zze(zzgny zzgny) throws GeneralSecurityException {
        zzgny.zzi(zzc);
        zzgny.zzh(zzd);
        zzgny.zzg(zze);
        zzgny.zzf(zzf);
    }

    private static zzggo zzf(zzgto zzgto) throws GeneralSecurityException {
        int ordinal = zzgto.ordinal();
        if (ordinal == 1) {
            return zzggo.zza;
        }
        if (ordinal == 2) {
            return zzggo.zzd;
        }
        if (ordinal == 3) {
            return zzggo.zzc;
        }
        if (ordinal == 4) {
            return zzggo.zze;
        }
        if (ordinal == 5) {
            return zzggo.zzb;
        }
        int zza2 = zzgto.zza();
        throw new GeneralSecurityException("Unable to parse HashType: " + zza2);
    }

    private static zzggp zzg(zzgvf zzgvf) throws GeneralSecurityException {
        int ordinal = zzgvf.ordinal();
        if (ordinal == 1) {
            return zzggp.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzggp.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgvf.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzggp.zzb;
    }

    private static zzgtx zzh(zzggr zzggr) throws GeneralSecurityException {
        zzgto zzgto;
        zzgtv zzc2 = zzgtx.zzc();
        zzc2.zzb(zzggr.zze());
        zzggo zzg = zzggr.zzg();
        if (zzggo.zza.equals(zzg)) {
            zzgto = zzgto.SHA1;
        } else if (zzggo.zzb.equals(zzg)) {
            zzgto = zzgto.SHA224;
        } else if (zzggo.zzc.equals(zzg)) {
            zzgto = zzgto.SHA256;
        } else if (zzggo.zzd.equals(zzg)) {
            zzgto = zzgto.SHA384;
        } else if (zzggo.zze.equals(zzg)) {
            zzgto = zzgto.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(zzg))));
        }
        zzc2.zza(zzgto);
        return (zzgtx) zzc2.zzbr();
    }

    private static zzgvf zzi(zzggp zzggp) throws GeneralSecurityException {
        if (zzggp.zza.equals(zzggp)) {
            return zzgvf.TINK;
        }
        if (zzggp.zzb.equals(zzggp)) {
            return zzgvf.CRUNCHY;
        }
        if (zzggp.zzc.equals(zzggp)) {
            return zzgvf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzggp))));
    }
}
