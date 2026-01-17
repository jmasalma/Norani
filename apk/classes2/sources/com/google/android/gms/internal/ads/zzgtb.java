package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgtb extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgtb zza;
    private static volatile zzhba zzb;
    /* access modifiers changed from: private */
    public int zzc;
    private int zzd;

    static {
        zzgtb zzgtb = new zzgtb();
        zza = zzgtb;
        zzgzh.zzbZ(zzgtb.class, zzgtb);
    }

    private zzgtb() {
    }

    public static zzgsz zzc() {
        return (zzgsz) zza.zzaZ();
    }

    public static zzgtb zzf(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgtb) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzgtb();
        } else {
            if (ordinal == 4) {
                return new zzgsz((zzgta) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgtb.class) {
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
