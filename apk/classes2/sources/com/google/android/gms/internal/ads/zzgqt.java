package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgqt implements zzgow {
    private static final zzgqt zza = new zzgqt();
    private static final zzgoq zzb = zzgoq.zzb(new zzgqp(), zzgnd.class, zzgfl.class);

    zzgqt() {
    }

    static void zzc() throws GeneralSecurityException {
        zzgnv.zza().zzd(zza);
        zzgnv.zza().zzc(zzb);
    }

    public final Class zza() {
        return zzgfl.class;
    }

    public final Class zzb() {
        return zzgfl.class;
    }

    public final /* bridge */ /* synthetic */ Object zze(zzgmy zzgmy, zzgnh zzgnh, zzgor zzgor) throws GeneralSecurityException {
        zzgni zzgni;
        zzgni zzgni2;
        zzgxe zzgxe;
        zzgoj zzgoj = new zzgoj();
        for (int i = 0; i < zzgmy.zza(); i++) {
            zzgfg zzb2 = ((zzgfi) zzgmy).zzb(i);
            if (zzb2.zzc().equals(zzgfb.zza)) {
                zzgfl zzgfl = (zzgfl) zzgor.zza(zzb2);
                zzgez zzb3 = zzb2.zzb();
                if (zzb3 instanceof zzgqn) {
                    zzgxe = ((zzgqn) zzb3).zzd();
                } else if (zzb3 instanceof zzgnd) {
                    zzgxe = ((zzgnd) zzb3).zzc();
                } else {
                    String name = zzb3.getClass().getName();
                    String valueOf = String.valueOf(zzb3.zza());
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + name + " with parameters " + valueOf);
                }
                zzgoj.zza(zzgxe, new zzgqq(zzgfl, zzb2.zza()));
            }
        }
        if (!zzgnh.zza()) {
            zzgnj zza2 = zzgnt.zzb().zza();
            zzgni zza3 = zza2.zza(zzgmy, zzgnh, "mac", "compute");
            zzgni = zza2.zza(zzgmy, zzgnh, "mac", "verify");
            zzgni2 = zza3;
        } else {
            zzgni2 = zzgnl.zza;
            zzgni = zzgni2;
        }
        zzgfi zzgfi = (zzgfi) zzgmy;
        return new zzgqr(new zzgqq((zzgfl) zzgor.zza(zzgfi.zzc()), zzgfi.zzc().zza()), zzgoj.zzb(), zzgni2, zzgni, (zzgqs) null);
    }
}
