package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgvx extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgvx zza;
    private static volatile zzhba zzb;
    private int zzc;

    static {
        zzgvx zzgvx = new zzgvx();
        zza = zzgvx;
        zzgzh.zzbZ(zzgvx.class, zzgvx);
    }

    private zzgvx() {
    }

    public static zzgvx zzc() {
        return zza;
    }

    public static zzgvx zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgvx) zzgzh.zzbr(zza, zzgxz, zzgyr);
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
            return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        } else if (ordinal == 3) {
            return new zzgvx();
        } else {
            if (ordinal == 4) {
                return new zzgvv((zzgvw) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgvx.class) {
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
