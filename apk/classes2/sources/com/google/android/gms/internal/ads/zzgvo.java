package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgvo extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgvo zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private zzgvr zze;

    static {
        zzgvo zzgvo = new zzgvo();
        zza = zzgvo;
        zzgzh.zzbZ(zzgvo.class, zzgvo);
    }

    private zzgvo() {
    }

    public static zzgvm zzb() {
        return (zzgvm) zza.zzaZ();
    }

    public static zzgvo zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgvo) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    static /* synthetic */ void zzg(zzgvo zzgvo, zzgvr zzgvr) {
        zzgvr.getClass();
        zzgvo.zze = zzgvr;
        zzgvo.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgvo();
        } else {
            if (ordinal == 4) {
                return new zzgvm((zzgvn) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgvo.class) {
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

    public final zzgvr zzf() {
        zzgvr zzgvr = this.zze;
        return zzgvr == null ? zzgvr.zzd() : zzgvr;
    }
}
