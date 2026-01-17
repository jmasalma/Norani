package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgis {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgoh zzc = zzgoh.zzb(new zzgio(), zzgin.class, zzgoy.class);
    private static final zzgod zzd;
    private static final zzgmx zze = zzgmx.zzb(new zzgiq(), zzgil.class, zzgox.class);
    private static final zzgmt zzf;

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzgip(), zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgir(), zzb2, zzgox.class);
    }

    public static /* synthetic */ zzgil zza(zzgox zzgox, zzgfn zzgfn) {
        if (zzgox.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzguv zzd2 = zzguv.zzd(zzgox.zze(), zzgyr.zza());
                if (zzd2.zza() == 0) {
                    return zzgil.zzc(zzgin.zzc(zzd2.zzf().zzf(), zzf(zzgox.zzc())), zzgox.zzf());
                }
                String valueOf = String.valueOf(zzd2);
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + valueOf);
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgin zzb(zzgoy zzgoy) {
        if (zzgoy.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzgin.zzc(zzguy.zzd(zzgoy.zzc().zzh(), zzgyr.zza()).zzf(), zzf(zzgoy.zzc().zzg()));
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoy.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgox zzc(zzgil zzgil, zzgfn zzgfn) {
        zzgut zzb2 = zzguv.zzb();
        zzguw zza2 = zzguy.zza();
        zza2.zza(zzgil.zzd().zzd());
        zzb2.zza((zzguy) zza2.zzbr());
        return zzgox.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzguv) zzb2.zzbr()).zzaN(), zzgtz.REMOTE, zzg(zzgil.zzd().zzb()), zzgil.zze());
    }

    public static /* synthetic */ zzgoy zzd(zzgin zzgin) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzguw zza3 = zzguy.zza();
        zza3.zza(zzgin.zzd());
        zza2.zzc(((zzguy) zza3.zzbr()).zzaN());
        zza2.zza(zzg(zzgin.zzb()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static void zze(zzgny zzgny) throws GeneralSecurityException {
        zzgny.zzi(zzc);
        zzgny.zzh(zzd);
        zzgny.zzg(zze);
        zzgny.zzf(zzf);
    }

    private static zzgim zzf(zzgvf zzgvf) throws GeneralSecurityException {
        int ordinal = zzgvf.ordinal();
        if (ordinal == 1) {
            return zzgim.zza;
        }
        if (ordinal == 3) {
            return zzgim.zzb;
        }
        int zza2 = zzgvf.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    private static zzgvf zzg(zzgim zzgim) throws GeneralSecurityException {
        if (zzgim.zza.equals(zzgim)) {
            return zzgvf.TINK;
        }
        if (zzgim.zzb.equals(zzgim)) {
            return zzgvf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgim.toString()));
    }
}
