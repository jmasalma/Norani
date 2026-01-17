package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgsp extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgsp zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private zzgsv zze;
    /* access modifiers changed from: private */
    public zzgxz zzf = zzgxz.zzb;

    static {
        zzgsp zzgsp = new zzgsp();
        zza = zzgsp;
        zzgzh.zzbZ(zzgsp.class, zzgsp);
    }

    private zzgsp() {
    }

    public static zzgsn zzb() {
        return (zzgsn) zza.zzaZ();
    }

    public static zzgsp zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgsp) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    public static zzhba zzh() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzj(zzgsp zzgsp, zzgsv zzgsv) {
        zzgsv.getClass();
        zzgsp.zze = zzgsv;
        zzgsp.zzc |= 1;
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
            return new zzgsp();
        } else {
            if (ordinal == 4) {
                return new zzgsn((zzgso) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgsp.class) {
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

    public final zzgsv zzf() {
        zzgsv zzgsv = this.zze;
        return zzgsv == null ? zzgsv.zzd() : zzgsv;
    }

    public final zzgxz zzg() {
        return this.zzf;
    }
}
