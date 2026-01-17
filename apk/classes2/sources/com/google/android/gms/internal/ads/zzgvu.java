package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgvu extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgvu zza;
    private static volatile zzhba zzb;
    private int zzc;
    /* access modifiers changed from: private */
    public zzgxz zzd = zzgxz.zzb;

    static {
        zzgvu zzgvu = new zzgvu();
        zza = zzgvu;
        zzgzh.zzbZ(zzgvu.class, zzgvu);
    }

    private zzgvu() {
    }

    public static zzgvs zzb() {
        return (zzgvs) zza.zzaZ();
    }

    public static zzgvu zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgvu) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    public static zzhba zzg() {
        return zza.zzbN();
    }

    public final int zza() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzgvu();
        } else {
            if (ordinal == 4) {
                return new zzgvs((zzgvt) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgvu.class) {
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
}
