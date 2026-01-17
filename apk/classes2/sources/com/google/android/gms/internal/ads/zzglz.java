package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzglz {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgoh zzc = zzgoh.zzb(new zzglv(), zzgka.class, zzgoy.class);
    private static final zzgod zzd;
    private static final zzgmx zze = zzgmx.zzb(new zzglx(), zzgju.class, zzgox.class);
    private static final zzgmt zzf;

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzglw(), zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgly(), zzb2, zzgox.class);
    }

    public static /* synthetic */ zzgju zza(zzgox zzgox, zzgfn zzgfn) {
        if (zzgox.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzgvu zzd2 = zzgvu.zzd(zzgox.zze(), zzgyr.zza());
                if (zzd2.zza() == 0) {
                    return zzgju.zzc(zzf(zzgox.zzc()), zzgxf.zzb(zzd2.zzf().zzA(), zzgfn), zzgox.zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzw unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgka zzb(zzgoy zzgoy) {
        if (zzgoy.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzgvx.zzd(zzgoy.zzc().zzh(), zzgyr.zza()).zza() == 0) {
                    return zzgka.zzc(zzf(zzgoy.zzc().zzg()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoy.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgox zzc(zzgju zzgju, zzgfn zzgfn) {
        zzgvs zzb2 = zzgvu.zzb();
        byte[] zzd2 = zzgju.zze().zzd(zzgfn);
        zzb2.zza(zzgxz.zzv(zzd2, 0, zzd2.length));
        return zzgox.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgvu) zzb2.zzbr()).zzaN(), zzgtz.SYMMETRIC, zzg(zzgju.zzd().zzb()), zzgju.zzf());
    }

    public static /* synthetic */ zzgoy zzd(zzgka zzgka) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza2.zzc(zzgvx.zzc().zzaN());
        zza2.zza(zzg(zzgka.zzb()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static void zze(zzgny zzgny) throws GeneralSecurityException {
        zzgny.zzi(zzc);
        zzgny.zzh(zzd);
        zzgny.zzg(zze);
        zzgny.zzf(zzf);
    }

    private static zzgjz zzf(zzgvf zzgvf) throws GeneralSecurityException {
        int ordinal = zzgvf.ordinal();
        if (ordinal == 1) {
            return zzgjz.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgjz.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgvf.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzgjz.zzb;
    }

    private static zzgvf zzg(zzgjz zzgjz) throws GeneralSecurityException {
        if (zzgjz.zza.equals(zzgjz)) {
            return zzgvf.TINK;
        }
        if (zzgjz.zzb.equals(zzgjz)) {
            return zzgvf.CRUNCHY;
        }
        if (zzgjz.zzc.equals(zzgjz)) {
            return zzgvf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgjz.toString()));
    }
}
