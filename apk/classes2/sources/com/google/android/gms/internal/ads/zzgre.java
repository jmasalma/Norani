package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgre {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgoh zzc = zzgoh.zzb(new zzgra(), zzgpu.class, zzgoy.class);
    private static final zzgod zzd;
    private static final zzgmx zze = zzgmx.zzb(new zzgrc(), zzgpm.class, zzgox.class);
    private static final zzgmt zzf;

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzgrb(), zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgrd(), zzb2, zzgox.class);
    }

    public static /* synthetic */ zzgox zza(zzgpm zzgpm, zzgfn zzgfn) {
        zzgrp zzb2 = zzgrr.zzb();
        zzb2.zzb(zzg(zzgpm.zzc()));
        byte[] zzd2 = zzgpm.zze().zzd(zzgfn);
        zzb2.zza(zzgxz.zzv(zzd2, 0, zzd2.length));
        return zzgox.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgrr) zzb2.zzbr()).zzaN(), zzgtz.SYMMETRIC, zzh(zzgpm.zzc().zzf()), zzgpm.zzf());
    }

    public static /* synthetic */ zzgoy zzb(zzgpu zzgpu) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgrs zzb2 = zzgru.zzb();
        zzb2.zzb(zzg(zzgpu));
        zzb2.zza(zzgpu.zzc());
        zza2.zzc(((zzgru) zzb2.zzbr()).zzaN());
        zza2.zza(zzh(zzgpu.zzf()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static /* synthetic */ zzgpm zzc(zzgox zzgox, zzgfn zzgfn) {
        if (zzgox.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgrr zzd2 = zzgrr.zzd(zzgox.zze(), zzgyr.zza());
                if (zzd2.zza() == 0) {
                    zzgpr zze2 = zzgpu.zze();
                    zze2.zza(zzd2.zzg().zzd());
                    zze2.zzb(zzd2.zzf().zza());
                    zze2.zzc(zzf(zzgox.zzc()));
                    zzgpu zzd3 = zze2.zzd();
                    zzgpk zzb2 = zzgpm.zzb();
                    zzb2.zzc(zzd3);
                    zzb2.zza(zzgxf.zzb(zzd2.zzg().zzA(), zzgfn));
                    zzb2.zzb(zzgox.zzf());
                    return zzb2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgzw | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgpu zzd(zzgoy zzgoy) {
        if (zzgoy.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgru zzd2 = zzgru.zzd(zzgoy.zzc().zzh(), zzgyr.zza());
                zzgpr zze2 = zzgpu.zze();
                zze2.zza(zzd2.zza());
                zze2.zzb(zzd2.zzf().zza());
                zze2.zzc(zzf(zzgoy.zzc().zzg()));
                return zze2.zzd();
            } catch (zzgzw e) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoy.zzc().zzi())));
        }
    }

    public static void zze(zzgny zzgny) throws GeneralSecurityException {
        zzgny.zzi(zzc);
        zzgny.zzh(zzd);
        zzgny.zzg(zze);
        zzgny.zzf(zzf);
    }

    private static zzgps zzf(zzgvf zzgvf) throws GeneralSecurityException {
        int ordinal = zzgvf.ordinal();
        if (ordinal == 1) {
            return zzgps.zza;
        }
        if (ordinal == 2) {
            return zzgps.zzc;
        }
        if (ordinal == 3) {
            return zzgps.zzd;
        }
        if (ordinal == 4) {
            return zzgps.zzb;
        }
        int zza2 = zzgvf.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    private static zzgrx zzg(zzgpu zzgpu) {
        zzgrv zzb2 = zzgrx.zzb();
        zzb2.zza(zzgpu.zzb());
        return (zzgrx) zzb2.zzbr();
    }

    private static zzgvf zzh(zzgps zzgps) throws GeneralSecurityException {
        if (zzgps.zza.equals(zzgps)) {
            return zzgvf.TINK;
        }
        if (zzgps.zzb.equals(zzgps)) {
            return zzgvf.CRUNCHY;
        }
        if (zzgps.zzd.equals(zzgps)) {
            return zzgvf.RAW;
        }
        if (zzgps.zzc.equals(zzgps)) {
            return zzgvf.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgps))));
    }
}
