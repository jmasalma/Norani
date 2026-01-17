package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgrm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgml zzc;
    private static final zzgml zzd;
    private static final zzgoh zze = zzgoh.zzb(new zzgri(), zzgql.class, zzgoy.class);
    private static final zzgod zzf;
    private static final zzgmx zzg = zzgmx.zzb(new zzgrk(), zzgqb.class, zzgox.class);
    private static final zzgmt zzh;

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzb2;
        zzgmj zza2 = zzgml.zza();
        zza2.zza(zzgvf.RAW, zzgqj.zzd);
        zza2.zza(zzgvf.TINK, zzgqj.zza);
        zza2.zza(zzgvf.LEGACY, zzgqj.zzc);
        zza2.zza(zzgvf.CRUNCHY, zzgqj.zzb);
        zzc = zza2.zzb();
        zzgmj zza3 = zzgml.zza();
        zza3.zza(zzgto.SHA1, zzgqi.zza);
        zza3.zza(zzgto.SHA224, zzgqi.zzb);
        zza3.zza(zzgto.SHA256, zzgqi.zzc);
        zza3.zza(zzgto.SHA384, zzgqi.zzd);
        zza3.zza(zzgto.SHA512, zzgqi.zze);
        zzd = zza3.zzb();
        zzf = zzgod.zzb(new zzgrj(), zzb2, zzgoy.class);
        zzh = zzgmt.zzb(new zzgrl(), zzb2, zzgox.class);
    }

    public static /* synthetic */ zzgox zza(zzgqb zzgqb, zzgfn zzgfn) {
        zzgtp zzb2 = zzgtr.zzb();
        zzb2.zzb(zzf(zzgqb.zzc()));
        byte[] zzd2 = zzgqb.zze().zzd(zzgfn);
        zzb2.zza(zzgxz.zzv(zzd2, 0, zzd2.length));
        return zzgox.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgtr) zzb2.zzbr()).zzaN(), zzgtz.SYMMETRIC, (zzgvf) zzc.zzb(zzgqb.zzc().zzg()), zzgqb.zzf());
    }

    public static /* synthetic */ zzgoy zzb(zzgql zzgql) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgts zzc2 = zzgtu.zzc();
        zzc2.zzb(zzf(zzgql));
        zzc2.zza(zzgql.zzc());
        zza2.zzc(((zzgtu) zzc2.zzbr()).zzaN());
        zza2.zza((zzgvf) zzc.zzb(zzgql.zzg()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static /* synthetic */ zzgqb zzc(zzgox zzgox, zzgfn zzgfn) {
        if (zzgox.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgtr zzf2 = zzgtr.zzf(zzgox.zze(), zzgyr.zza());
                if (zzf2.zza() == 0) {
                    zzgqh zze2 = zzgql.zze();
                    zze2.zzb(zzf2.zzh().zzd());
                    zze2.zzc(zzf2.zzg().zza());
                    zze2.zza((zzgqi) zzd.zzc(zzf2.zzg().zzb()));
                    zze2.zzd((zzgqj) zzc.zzc(zzgox.zzc()));
                    zzgql zze3 = zze2.zze();
                    zzgpz zzb2 = zzgqb.zzb();
                    zzb2.zzc(zze3);
                    zzb2.zzb(zzgxf.zzb(zzf2.zzh().zzA(), zzgfn));
                    zzb2.zza(zzgox.zzf());
                    return zzb2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzw | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgql zzd(zzgoy zzgoy) {
        if (zzgoy.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgtu zzg2 = zzgtu.zzg(zzgoy.zzc().zzh(), zzgyr.zza());
                if (zzg2.zzb() == 0) {
                    zzgqh zze2 = zzgql.zze();
                    zze2.zzb(zzg2.zza());
                    zze2.zzc(zzg2.zzh().zza());
                    zze2.zza((zzgqi) zzd.zzc(zzg2.zzh().zzb()));
                    zze2.zzd((zzgqj) zzc.zzc(zzgoy.zzc().zzg()));
                    return zze2.zze();
                }
                int zzb2 = zzg2.zzb();
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzb2);
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoy.zzc().zzi())));
        }
    }

    public static void zze(zzgny zzgny) throws GeneralSecurityException {
        zzgny.zzi(zze);
        zzgny.zzh(zzf);
        zzgny.zzg(zzg);
        zzgny.zzf(zzh);
    }

    private static zzgtx zzf(zzgql zzgql) throws GeneralSecurityException {
        zzgtv zzc2 = zzgtx.zzc();
        zzc2.zzb(zzgql.zzb());
        zzc2.zza((zzgto) zzd.zzb(zzgql.zzf()));
        return (zzgtx) zzc2.zzbr();
    }
}
