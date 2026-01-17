package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzatp extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzatp zza;
    private static volatile zzhba zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        zzatp zzatp = new zzatp();
        zza = zzatp;
        zzgzh.zzbZ(zzatp.class, zzatp);
    }

    private zzatp() {
    }

    public static zzato zza() {
        return (zzato) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzatp zzatp, long j) {
        zzatp.zzc |= 32;
        zzatp.zzi = j;
    }

    static /* synthetic */ void zzd(zzatp zzatp, long j) {
        zzatp.zzc |= 4;
        zzatp.zzf = j;
    }

    static /* synthetic */ void zzf(zzatp zzatp, long j) {
        zzatp.zzc |= 1;
        zzatp.zzd = j;
    }

    static /* synthetic */ void zzg(zzatp zzatp, long j) {
        zzatp.zzc |= 8;
        zzatp.zzg = j;
    }

    static /* synthetic */ void zzh(zzatp zzatp, long j) {
        zzatp.zzc |= 16;
        zzatp.zzh = j;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (ordinal == 3) {
            return new zzatp();
        } else {
            if (ordinal == 4) {
                return new zzato((zzaui) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzatp.class) {
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
