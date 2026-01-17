package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzguv extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzguv zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private zzguy zze;

    static {
        zzguv zzguv = new zzguv();
        zza = zzguv;
        zzgzh.zzbZ(zzguv.class, zzguv);
    }

    private zzguv() {
    }

    public static zzgut zzb() {
        return (zzgut) zza.zzaZ();
    }

    public static zzguv zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzguv) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    public static zzhba zzg() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzh(zzguv zzguv, zzguy zzguy) {
        zzguy.getClass();
        zzguv.zze = zzguy;
        zzguv.zzc |= 1;
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
            return new zzguv();
        } else {
            if (ordinal == 4) {
                return new zzgut((zzguu) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzguv.class) {
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

    public final zzguy zzf() {
        zzguy zzguy = this.zze;
        return zzguy == null ? zzguy.zzc() : zzguy;
    }
}
