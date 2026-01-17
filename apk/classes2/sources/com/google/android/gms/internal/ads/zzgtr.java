package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgtr extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgtr zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private zzgtx zze;
    /* access modifiers changed from: private */
    public zzgxz zzf = zzgxz.zzb;

    static {
        zzgtr zzgtr = new zzgtr();
        zza = zzgtr;
        zzgzh.zzbZ(zzgtr.class, zzgtr);
    }

    private zzgtr() {
    }

    public static zzgtp zzb() {
        return (zzgtp) zza.zzaZ();
    }

    public static zzgtr zzd() {
        return zza;
    }

    public static zzgtr zzf(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgtr) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    public static zzhba zzi() {
        return zza.zzbN();
    }

    static /* synthetic */ void zzk(zzgtr zzgtr, zzgtx zzgtx) {
        zzgtx.getClass();
        zzgtr.zze = zzgtx;
        zzgtr.zzc |= 1;
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
            return new zzgtr();
        } else {
            if (ordinal == 4) {
                return new zzgtp((zzgtq) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgtr.class) {
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

    public final zzgtx zzg() {
        zzgtx zzgtx = this.zze;
        return zzgtx == null ? zzgtx.zzf() : zzgtx;
    }

    public final zzgxz zzh() {
        return this.zzf;
    }
}
