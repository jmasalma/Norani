package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgss extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgss zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgsv zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgss zzgss = new zzgss();
        zza = zzgss;
        zzgzh.zzbZ(zzgss.class, zzgss);
    }

    private zzgss() {
    }

    public static zzgsq zzb() {
        return (zzgsq) zza.zzaZ();
    }

    public static zzgss zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgss) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    static /* synthetic */ void zzh(zzgss zzgss, zzgsv zzgsv) {
        zzgsv.getClass();
        zzgss.zzd = zzgsv;
        zzgss.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgss();
        } else {
            if (ordinal == 4) {
                return new zzgsq((zzgsr) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgss.class) {
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
        zzgsv zzgsv = this.zzd;
        return zzgsv == null ? zzgsv.zzd() : zzgsv;
    }
}
