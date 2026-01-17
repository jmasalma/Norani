package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgrr extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgrr zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    /* access modifiers changed from: private */
    public zzgxz zze = zzgxz.zzb;
    private zzgrx zzf;

    static {
        zzgrr zzgrr = new zzgrr();
        zza = zzgrr;
        zzgzh.zzbZ(zzgrr.class, zzgrr);
    }

    private zzgrr() {
    }

    public static zzgrp zzb() {
        return (zzgrp) zza.zzaZ();
    }

    public static zzgrr zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgrr) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    public static zzhba zzh() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzj(zzgrr zzgrr, zzgrx zzgrx) {
        zzgrx.getClass();
        zzgrr.zzf = zzgrx;
        zzgrr.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgrr();
        } else {
            if (ordinal == 4) {
                return new zzgrp((zzgrq) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgrr.class) {
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

    public final zzgrx zzf() {
        zzgrx zzgrx = this.zzf;
        return zzgrx == null ? zzgrx.zzd() : zzgrx;
    }

    public final zzgxz zzg() {
        return this.zze;
    }
}
