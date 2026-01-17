package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaua extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzaua zza;
    private static volatile zzhba zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private String zzg = "D";
    private long zzh;
    private long zzi;

    static {
        zzaua zzaua = new zzaua();
        zza = zzaua;
        zzgzh.zzbZ(zzaua.class, zzaua);
    }

    private zzaua() {
    }

    public static zzatz zza() {
        return (zzatz) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzaua zzaua, String str) {
        zzaua.zzc |= 1;
        zzaua.zzd = "0.460000000";
    }

    static /* synthetic */ void zzd(zzaua zzaua, String str) {
        str.getClass();
        zzaua.zzc |= 2;
        zzaua.zze = str;
    }

    static /* synthetic */ void zzf(zzaua zzaua, String str) {
        str.getClass();
        zzaua.zzc |= 8;
        zzaua.zzg = str;
    }

    static /* synthetic */ void zzg(zzaua zzaua, long j) {
        zzaua.zzc |= 4;
        zzaua.zzf = j;
    }

    static /* synthetic */ void zzh(zzaua zzaua, long j) {
        zzaua.zzc |= 32;
        zzaua.zzi = j;
    }

    static /* synthetic */ void zzi(zzaua zzaua, long j) {
        zzaua.zzc |= 16;
        zzaua.zzh = j;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (ordinal == 3) {
            return new zzaua();
        } else {
            if (ordinal == 4) {
                return new zzatz((zzaui) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzaua.class) {
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
