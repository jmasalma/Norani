package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgvl extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgvl zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private zzgvr zze;
    /* access modifiers changed from: private */
    public zzgxz zzf = zzgxz.zzb;

    static {
        zzgvl zzgvl = new zzgvl();
        zza = zzgvl;
        zzgzh.zzbZ(zzgvl.class, zzgvl);
    }

    private zzgvl() {
    }

    public static zzgvj zzb() {
        return (zzgvj) zza.zzaZ();
    }

    public static zzgvl zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgvl) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    static /* synthetic */ void zzi(zzgvl zzgvl, zzgvr zzgvr) {
        zzgvr.getClass();
        zzgvl.zze = zzgvr;
        zzgvl.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgvl();
        } else {
            if (ordinal == 4) {
                return new zzgvj((zzgvk) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgvl.class) {
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

    public final zzgvr zzf() {
        zzgvr zzgvr = this.zze;
        return zzgvr == null ? zzgvr.zzd() : zzgvr;
    }

    public final zzgxz zzg() {
        return this.zzf;
    }
}
