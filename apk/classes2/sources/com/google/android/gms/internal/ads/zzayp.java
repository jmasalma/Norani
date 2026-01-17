package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzayp extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzayp zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzays zzd;
    private zzgxz zze;
    private zzgxz zzf;

    static {
        zzayp zzayp = new zzayp();
        zza = zzayp;
        zzgzh.zzbZ(zzayp.class, zzayp);
    }

    private zzayp() {
        zzgxz zzgxz = zzgxz.zzb;
        this.zze = zzgxz;
        this.zzf = zzgxz;
    }

    public static zzayp zzb(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzayp) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    public final zzays zzc() {
        zzays zzays = this.zzd;
        return zzays == null ? zzays.zzg() : zzays;
    }

    public final zzgxz zzd() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzayp();
        } else {
            if (ordinal == 4) {
                return new zzayn((zzayo) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzayp.class) {
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
        return this.zze;
    }
}
