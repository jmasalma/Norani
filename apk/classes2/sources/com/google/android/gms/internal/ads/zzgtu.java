package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgtu extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgtu zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgtx zzd;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgtu zzgtu = new zzgtu();
        zza = zzgtu;
        zzgzh.zzbZ(zzgtu.class, zzgtu);
    }

    private zzgtu() {
    }

    public static zzgts zzc() {
        return (zzgts) zza.zzaZ();
    }

    public static zzgtu zzf() {
        return zza;
    }

    public static zzgtu zzg(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgtu) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    static /* synthetic */ void zzj(zzgtu zzgtu, zzgtx zzgtx) {
        zzgtx.getClass();
        zzgtu.zzd = zzgtx;
        zzgtu.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgtu();
        } else {
            if (ordinal == 4) {
                return new zzgts((zzgtt) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgtu.class) {
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

    public final zzgtx zzh() {
        zzgtx zzgtx = this.zzd;
        return zzgtx == null ? zzgtx.zzf() : zzgtx;
    }
}
