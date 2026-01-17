package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgsa extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgsa zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private zzgsg zze;
    private zzgtr zzf;

    static {
        zzgsa zzgsa = new zzgsa();
        zza = zzgsa;
        zzgzh.zzbZ(zzgsa.class, zzgsa);
    }

    private zzgsa() {
    }

    public static zzgry zzb() {
        return (zzgry) zza.zzaZ();
    }

    public static zzgsa zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgsa) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    public static zzhba zzh() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzi(zzgsa zzgsa, zzgsg zzgsg) {
        zzgsg.getClass();
        zzgsa.zze = zzgsg;
        zzgsa.zzc |= 1;
    }

    static /* synthetic */ void zzj(zzgsa zzgsa, zzgtr zzgtr) {
        zzgtr.getClass();
        zzgsa.zzf = zzgtr;
        zzgsa.zzc |= 2;
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
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgsa();
        } else {
            if (ordinal == 4) {
                return new zzgry((zzgrz) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgsa.class) {
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

    public final zzgsg zzf() {
        zzgsg zzgsg = this.zze;
        return zzgsg == null ? zzgsg.zzd() : zzgsg;
    }

    public final zzgtr zzg() {
        zzgtr zzgtr = this.zzf;
        return zzgtr == null ? zzgtr.zzd() : zzgtr;
    }
}
