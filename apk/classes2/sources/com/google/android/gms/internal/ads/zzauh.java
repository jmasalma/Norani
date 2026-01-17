package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzauh extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzauh zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgzt zzd = zzbK();
    private zzgxz zze = zzgxz.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzauh zzauh = new zzauh();
        zza = zzauh;
        zzgzh.zzbZ(zzauh.class, zzauh);
    }

    private zzauh() {
    }

    public static zzaug zza() {
        return (zzaug) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzauh zzauh, zzgxz zzgxz) {
        zzgzt zzgzt = zzauh.zzd;
        if (!zzgzt.zzc()) {
            zzauh.zzd = zzgzh.zzbL(zzgzt);
        }
        zzauh.zzd.add(zzgxz);
    }

    static /* synthetic */ void zzd(zzauh zzauh, zzgxz zzgxz) {
        zzauh.zzc |= 1;
        zzauh.zze = zzgxz;
    }

    static /* synthetic */ void zzf(zzauh zzauh, int i) {
        zzauh.zzg = i - 1;
        zzauh.zzc |= 4;
    }

    static /* synthetic */ void zzg(zzauh zzauh, int i) {
        zzauh.zzf = 4;
        zzauh.zzc |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzaub.zza, "zzg", zzatx.zza});
        } else if (ordinal == 3) {
            return new zzauh();
        } else {
            if (ordinal == 4) {
                return new zzaug((zzaui) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzauh.class) {
                        zzhba = zzb;
                        if (zzhba == null) {
                            zzhba = new zzgzc(zza);
                            zzb = zzhba;
                        }
                    }
                }
                return zzhba;
            }
            throw null;
        }
    }
}
