package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzggf implements zzgow {
    private static final zzggf zza = new zzggf();
    private static final zzgoq zzb = zzgoq.zzb(new zzggb(), zzgnd.class, zzget.class);

    zzggf() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzgnv.zza().zzd(zza);
        zzgnv.zza().zzc(zzb);
    }

    public static void zzd(zzgos zzgos) throws GeneralSecurityException {
        zzgos.zzb(zza);
    }

    public final Class zza() {
        return zzget.class;
    }

    public final Class zzb() {
        return zzget.class;
    }

    public final /* bridge */ /* synthetic */ Object zze(zzgmy zzgmy, zzgnh zzgnh, zzgor zzgor) throws GeneralSecurityException {
        zzgni zzgni;
        zzgni zzgni2;
        zzgxe zzgxe;
        zzgoj zzgoj = new zzgoj();
        for (int i = 0; i < zzgmy.zza(); i++) {
            zzgfg zzb2 = ((zzgfi) zzgmy).zzb(i);
            if (zzb2.zzc().equals(zzgfb.zza)) {
                zzgez zzb3 = zzb2.zzb();
                if (zzb3 instanceof zzgfz) {
                    zzgxe = ((zzgfz) zzb3).zzb();
                } else if (zzb3 instanceof zzgnd) {
                    zzgxe = ((zzgnd) zzb3).zzc();
                } else {
                    String name = zzb3.getClass().getName();
                    String valueOf = String.valueOf(zzb3.zza());
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + name + " with parameters " + valueOf);
                }
                zzgoj.zza(zzgxe, new zzggc((zzget) zzgor.zza(zzb2), zzb2.zza()));
            }
        }
        if (!zzgnh.zza()) {
            zzgnj zza2 = zzgnt.zzb().zza();
            zzgni zza3 = zza2.zza(zzgmy, zzgnh, "aead", "encrypt");
            zzgni = zza2.zza(zzgmy, zzgnh, "aead", "decrypt");
            zzgni2 = zza3;
        } else {
            zzgni2 = zzgnl.zza;
            zzgni = zzgni2;
        }
        zzgfi zzgfi = (zzgfi) zzgmy;
        return new zzggd(new zzggc((zzget) zzgor.zza(zzgfi.zzc()), zzgfi.zzc().zza()), zzgoj.zzb(), zzgni2, zzgni, (zzgge) null);
    }
}
