package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzays extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzays zza;
    private static volatile zzhba zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzays zzays = new zzays();
        zza = zzays;
        zzgzh.zzbZ(zzays.class, zzays);
    }

    private zzays() {
    }

    public static zzayq zzd() {
        return (zzayq) zza.zzaZ();
    }

    public static zzays zzg() {
        return zza;
    }

    public static zzays zzh(zzgxz zzgxz) throws zzgzw {
        return (zzays) zzgzh.zzbm(zza, zzgxz);
    }

    public static zzays zzi(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzays) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    static /* synthetic */ void zzl(zzays zzays, String str) {
        str.getClass();
        zzays.zzc |= 2;
        zzays.zze = str;
    }

    static /* synthetic */ void zzm(zzays zzays, long j) {
        zzays.zzc |= 8;
        zzays.zzg = j;
    }

    static /* synthetic */ void zzn(zzays zzays, long j) {
        zzays.zzc |= 4;
        zzays.zzf = j;
    }

    static /* synthetic */ void zzo(zzays zzays, long j) {
        zzays.zzc |= 16;
        zzays.zzh = j;
    }

    static /* synthetic */ void zzp(zzays zzays, String str) {
        str.getClass();
        zzays.zzc |= 1;
        zzays.zzd = str;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final long zzc() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (ordinal == 3) {
            return new zzays();
        } else {
            if (ordinal == 4) {
                return new zzayq((zzayr) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzays.class) {
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

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
