package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgjd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgoh zzc = zzgoh.zzb(new zzgiz(), zzgiy.class, zzgoy.class);
    private static final zzgod zzd;
    private static final zzgmx zze = zzgmx.zzb(new zzgjb(), zzgit.class, zzgox.class);
    private static final zzgmt zzf;

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzgja(), zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgjc(), zzb2, zzgox.class);
    }

    public static /* synthetic */ zzgit zza(zzgox zzgox, zzgfn zzgfn) {
        if (zzgox.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                zzgvb zzd2 = zzgvb.zzd(zzgox.zze(), zzgyr.zza());
                if (zzd2.zza() == 0) {
                    return zzgit.zzc(zzf(zzd2.zzf(), zzgox.zzc()), zzgox.zzf());
                }
                String valueOf = String.valueOf(zzd2);
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + valueOf);
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgiy zzb(zzgoy zzgoy) {
        if (zzgoy.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zzf(zzgve.zzf(zzgoy.zzc().zzh(), zzgyr.zza()), zzgoy.zzc().zzg());
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoy.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgox zzc(zzgit zzgit, zzgfn zzgfn) {
        zzguz zzb2 = zzgvb.zzb();
        zzb2.zza(zzg(zzgit.zzd()));
        return zzgox.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgvb) zzb2.zzbr()).zzaN(), zzgtz.REMOTE, zzh(zzgit.zzd().zzc()), zzgit.zze());
    }

    public static /* synthetic */ zzgoy zzd(zzgiy zzgiy) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza2.zzc(zzg(zzgiy).zzaN());
        zza2.zza(zzh(zzgiy.zzc()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static void zze(zzgny zzgny) throws GeneralSecurityException {
        zzgny.zzi(zzc);
        zzgny.zzh(zzd);
        zzgny.zzg(zze);
        zzgny.zzf(zzf);
    }

    private static zzgiy zzf(zzgve zzgve, zzgvf zzgvf) throws GeneralSecurityException {
        zzgiv zzgiv;
        zzgiw zzgiw;
        zzgud zza2 = zzguf.zza();
        zza2.zzb(zzgve.zza().zzi());
        zza2.zzc(zzgve.zza().zzh());
        zza2.zza(zzgvf.RAW);
        zzgfm zza3 = zzgfo.zza(((zzguf) zza2.zzbr()).zzaV());
        if (zza3 instanceof zzghm) {
            zzgiv = zzgiv.zza;
        } else if (zza3 instanceof zzgid) {
            zzgiv = zzgiv.zzc;
        } else if (zza3 instanceof zzgka) {
            zzgiv = zzgiv.zzb;
        } else if (zza3 instanceof zzggr) {
            zzgiv = zzgiv.zzd;
        } else if (zza3 instanceof zzghb) {
            zzgiv = zzgiv.zze;
        } else if (zza3 instanceof zzghx) {
            zzgiv = zzgiv.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zza3.toString()));
        }
        zzgiu zzgiu = new zzgiu((zzgix) null);
        int ordinal = zzgvf.ordinal();
        if (ordinal == 1) {
            zzgiw = zzgiw.zza;
        } else if (ordinal == 3) {
            zzgiw = zzgiw.zzb;
        } else {
            int zza4 = zzgvf.zza();
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza4);
        }
        zzgiu.zzd(zzgiw);
        zzgiu.zzc(zzgve.zzg());
        zzgiu.zza((zzgga) zza3);
        zzgiu.zzb(zzgiv);
        return zzgiu.zze();
    }

    private static zzgve zzg(zzgiy zzgiy) throws GeneralSecurityException {
        try {
            zzguf zzf2 = zzguf.zzf(zzgfo.zzb(zzgiy.zzb()), zzgyr.zza());
            zzgvc zzb2 = zzgve.zzb();
            zzb2.zzb(zzgiy.zzd());
            zzb2.zza(zzf2);
            return (zzgve) zzb2.zzbr();
        } catch (zzgzw e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzgvf zzh(zzgiw zzgiw) throws GeneralSecurityException {
        if (zzgiw.zza.equals(zzgiw)) {
            return zzgvf.TINK;
        }
        if (zzgiw.zzb.equals(zzgiw)) {
            return zzgvf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgiw))));
    }
}
