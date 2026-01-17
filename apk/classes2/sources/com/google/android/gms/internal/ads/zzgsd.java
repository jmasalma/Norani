package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgsd extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgsd zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgsj zzd;
    private zzgtu zze;

    static {
        zzgsd zzgsd = new zzgsd();
        zza = zzgsd;
        zzgzh.zzbZ(zzgsd.class, zzgsd);
    }

    private zzgsd() {
    }

    public static zzgsb zza() {
        return (zzgsb) zza.zzaZ();
    }

    public static zzgsd zzc(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgsd) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    static /* synthetic */ void zzg(zzgsd zzgsd, zzgsj zzgsj) {
        zzgsj.getClass();
        zzgsd.zzd = zzgsj;
        zzgsd.zzc |= 1;
    }

    static /* synthetic */ void zzh(zzgsd zzgsd, zzgtu zzgtu) {
        zzgtu.getClass();
        zzgsd.zze = zzgtu;
        zzgsd.zzc |= 2;
    }

    public final zzgsj zzd() {
        zzgsj zzgsj = this.zzd;
        return zzgsj == null ? zzgsj.zzd() : zzgsj;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgsd();
        } else {
            if (ordinal == 4) {
                return new zzgsb((zzgsc) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgsd.class) {
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

    public final zzgtu zzf() {
        zzgtu zzgtu = this.zze;
        return zzgtu == null ? zzgtu.zzf() : zzgtu;
    }
}
