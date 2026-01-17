package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzglt {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgoh zzc = zzgoh.zzb(new zzglp(), zzgjt.class, zzgoy.class);
    private static final zzgod zzd;
    private static final zzgmx zze = zzgmx.zzb(new zzglr(), zzgjo.class, zzgox.class);
    private static final zzgmt zzf;

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzglq(), zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgls(), zzb2, zzgox.class);
    }

    public static /* synthetic */ zzgjo zza(zzgox zzgox, zzgfn zzgfn) {
        if (zzgox.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzgvl zzd2 = zzgvl.zzd(zzgox.zze(), zzgyr.zza());
                if (zzd2.zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } else if (zzd2.zzg().zzd() == 32) {
                    return zzgjo.zzc(zzgjt.zzd(zzf(zzgox.zzc()), zzd2.zzf().zza()), zzgxf.zzb(zzd2.zzg().zzA(), zzgfn), zzgox.zzf());
                } else {
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                }
            } catch (zzgzw unused) {
                throw new GeneralSecurityException("Parsing XAesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgjt zzb(zzgoy zzgoy) {
        if (zzgoy.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzgvo zzd2 = zzgvo.zzd(zzgoy.zzc().zzh(), zzgyr.zza());
                if (zzd2.zza() == 0) {
                    return zzgjt.zzd(zzf(zzgoy.zzc().zzg()), zzd2.zzf().zza());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoy.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgox zzc(zzgjo zzgjo, zzgfn zzgfn) {
        zzgvj zzb2 = zzgvl.zzb();
        byte[] zzd2 = zzgjo.zze().zzd(zzgfn);
        zzb2.zza(zzgxz.zzv(zzd2, 0, zzd2.length));
        zzgvp zzb3 = zzgvr.zzb();
        zzb3.zza(zzgjo.zzd().zzb());
        zzb2.zzb((zzgvr) zzb3.zzbr());
        return zzgox.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzgvl) zzb2.zzbr()).zzaN(), zzgtz.SYMMETRIC, zzg(zzgjo.zzd().zzc()), zzgjo.zzf());
    }

    public static /* synthetic */ zzgoy zzd(zzgjt zzgjt) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzgvm zzb2 = zzgvo.zzb();
        zzgvp zzb3 = zzgvr.zzb();
        zzb3.zza(zzgjt.zzb());
        zzb2.zza((zzgvr) zzb3.zzbr());
        zza2.zzc(((zzgvo) zzb2.zzbr()).zzaN());
        zza2.zza(zzg(zzgjt.zzc()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static void zze(zzgny zzgny) throws GeneralSecurityException {
        zzgny.zzi(zzc);
        zzgny.zzh(zzd);
        zzgny.zzg(zze);
        zzgny.zzf(zzf);
    }

    private static zzgjs zzf(zzgvf zzgvf) throws GeneralSecurityException {
        int ordinal = zzgvf.ordinal();
        if (ordinal == 1) {
            return zzgjs.zza;
        }
        if (ordinal == 3) {
            return zzgjs.zzb;
        }
        int zza2 = zzgvf.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    private static zzgvf zzg(zzgjs zzgjs) throws GeneralSecurityException {
        if (Objects.equals(zzgjs, zzgjs.zza)) {
            return zzgvf.TINK;
        }
        if (Objects.equals(zzgjs, zzgjs.zzb)) {
            return zzgvf.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgjs.toString()));
    }
}
