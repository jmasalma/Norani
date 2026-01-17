package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgub extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgub zza;
    private static volatile zzhba zzb;
    private String zzc = "";
    private zzgxz zzd = zzgxz.zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgub zzgub = new zzgub();
        zza = zzgub;
        zzgzh.zzbZ(zzgub.class, zzgub);
    }

    private zzgub() {
    }

    public static zzgty zza() {
        return (zzgty) zza.zzaZ();
    }

    public static zzgub zzd() {
        return zza;
    }

    static /* synthetic */ void zzi(zzgub zzgub, String str) {
        str.getClass();
        zzgub.zzc = str;
    }

    static /* synthetic */ void zzj(zzgub zzgub, zzgxz zzgxz) {
        zzgxz.getClass();
        zzgub.zzd = zzgxz;
    }

    public final zzgtz zzb() {
        int i = this.zze;
        zzgtz zzgtz = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzgtz.REMOTE : zzgtz.ASYMMETRIC_PUBLIC : zzgtz.ASYMMETRIC_PRIVATE : zzgtz.SYMMETRIC : zzgtz.UNKNOWN_KEYMATERIAL;
        return zzgtz == null ? zzgtz.UNRECOGNIZED : zzgtz;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgub();
        } else {
            if (ordinal == 4) {
                return new zzgty((zzgua) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgub.class) {
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

    public final zzgxz zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
