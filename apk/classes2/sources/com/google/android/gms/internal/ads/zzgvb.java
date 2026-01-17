package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgvb extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgvb zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private zzgve zze;

    static {
        zzgvb zzgvb = new zzgvb();
        zza = zzgvb;
        zzgzh.zzbZ(zzgvb.class, zzgvb);
    }

    private zzgvb() {
    }

    public static zzguz zzb() {
        return (zzguz) zza.zzaZ();
    }

    public static zzgvb zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgvb) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    public static zzhba zzg() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzh(zzgvb zzgvb, zzgve zzgve) {
        zzgve.getClass();
        zzgvb.zze = zzgve;
        zzgvb.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgvb();
        } else {
            if (ordinal == 4) {
                return new zzguz((zzgva) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgvb.class) {
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

    public final zzgve zzf() {
        zzgve zzgve = this.zze;
        return zzgve == null ? zzgve.zzd() : zzgve;
    }
}
