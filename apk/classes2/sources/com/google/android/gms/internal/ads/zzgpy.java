package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgpy implements zzgow {
    private static final zzgpy zza = new zzgpy();

    private zzgpy() {
    }

    static void zzc() throws GeneralSecurityException {
        zzgnv.zza().zzd(zza);
    }

    public final Class zza() {
        return zzgpv.class;
    }

    public final Class zzb() {
        return zzgpv.class;
    }

    public final /* bridge */ /* synthetic */ Object zze(zzgmy zzgmy, zzgnh zzgnh, zzgor zzgor) throws GeneralSecurityException {
        zzgxe zzgxe;
        zzgfi zzgfi = (zzgfi) zzgmy;
        zzgfg zzc = zzgfi.zzc();
        zzgoj zzgoj = new zzgoj();
        for (int i = 0; i < zzgmy.zza(); i++) {
            zzgfg zzb = zzgfi.zzb(i);
            if (zzb.zzc().equals(zzgfb.zza)) {
                zzgpv zzgpv = (zzgpv) zzgor.zza(zzb);
                zzgez zzb2 = zzb.zzb();
                if (zzb2 instanceof zzgqn) {
                    zzgxe = ((zzgqn) zzb2).zzd();
                } else if (zzb2 instanceof zzgnd) {
                    zzgxe = ((zzgnd) zzb2).zzc();
                } else {
                    String name = zzb2.getClass().getName();
                    String valueOf = String.valueOf(zzb2.zza());
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + name + " with parameters " + valueOf);
                }
                zzgoj.zza(zzgxe, zzgpv);
            }
        }
        return new zzgpw(zzgoj.zzb(), (zzgpv) zzgor.zza(zzc), (zzgpx) null);
    }
}
