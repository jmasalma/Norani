package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgle {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgoh zzc = zzgoh.zzb(new zzgla(), zzgid.class, zzgoy.class);
    private static final zzgod zzd;
    private static final zzgmx zze = zzgmx.zzb(new zzglc(), zzghy.class, zzgox.class);
    private static final zzgmt zzf;

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzglb(), zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgld(), zzb2, zzgox.class);
    }

    public static /* synthetic */ zzghy zza(zzgox zzgox, zzgfn zzgfn) {
        if (zzgox.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgtk zzd2 = zzgtk.zzd(zzgox.zze(), zzgyr.zza());
                if (zzd2.zza() == 0) {
                    return zzghy.zzc(zzf(zzgox.zzc()), zzgxf.zzb(zzd2.zzf().zzA(), zzgfn), zzgox.zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzw unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgid zzb(zzgoy zzgoy) {
        if (zzgoy.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgtn.zzc(zzgoy.zzc().zzh(), zzgyr.zza());
                return zzgid.zzc(zzf(zzgoy.zzc().zzg()));
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoy.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgox zzc(zzghy zzghy, zzgfn zzgfn) {
        zzgti zzb2 = zzgtk.zzb();
        byte[] zzd2 = zzghy.zze().zzd(zzgfn);
        zzb2.zza(zzgxz.zzv(zzd2, 0, zzd2.length));
        return zzgox.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgtk) zzb2.zzbr()).zzaN(), zzgtz.SYMMETRIC, zzg(zzghy.zzd().zzb()), zzghy.zzf());
    }

    public static /* synthetic */ zzgoy zzd(zzgid zzgid) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza2.zzc(zzgtn.zzb().zzaN());
        zza2.zza(zzg(zzgid.zzb()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static void zze(zzgny zzgny) throws GeneralSecurityException {
        zzgny.zzi(zzc);
        zzgny.zzh(zzd);
        zzgny.zzg(zze);
        zzgny.zzf(zzf);
    }

    private static zzgic zzf(zzgvf zzgvf) throws GeneralSecurityException {
        int ordinal = zzgvf.ordinal();
        if (ordinal == 1) {
            return zzgic.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgic.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgvf.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzgic.zzb;
    }

    private static zzgvf zzg(zzgic zzgic) throws GeneralSecurityException {
        if (zzgic.zza.equals(zzgic)) {
            return zzgvf.TINK;
        }
        if (zzgic.zzb.equals(zzgic)) {
            return zzgvf.CRUNCHY;
        }
        if (zzgic.zzc.equals(zzgic)) {
            return zzgvf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgic.toString()));
    }
}
