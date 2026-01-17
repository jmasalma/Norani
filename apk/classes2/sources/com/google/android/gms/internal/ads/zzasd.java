package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzasd extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzasd zza;
    private static volatile zzhba zzb;
    private int zzc;
    private String zzd = "";
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private long zzj;
    private String zzk = "";
    private long zzl;
    private String zzm = "";
    private String zzn = "";
    private zzgzt zzo = zzbK();
    private int zzp;

    static {
        zzasd zzasd = new zzasd();
        zza = zzasd;
        zzgzh.zzbZ(zzasd.class, zzasd);
    }

    private zzasd() {
    }

    public static zzarz zza() {
        return (zzarz) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzasd zzasd, String str) {
        str.getClass();
        zzasd.zzc |= 1;
        zzasd.zzd = str;
    }

    static /* synthetic */ void zzd(zzasd zzasd, String str) {
        zzasd.zzc |= 16;
        zzasd.zzh = str;
    }

    static /* synthetic */ void zzf(zzasd zzasd, String str) {
        zzasd.zzc |= 1024;
        zzasd.zzn = str;
    }

    static /* synthetic */ void zzg(zzasd zzasd, String str) {
        str.getClass();
        zzasd.zzc |= 8;
        zzasd.zzg = str;
    }

    static /* synthetic */ void zzh(zzasd zzasd, long j) {
        zzasd.zzc |= 2;
        zzasd.zze = j;
    }

    static /* synthetic */ void zzi(zzasd zzasd, String str) {
        str.getClass();
        zzasd.zzc |= 4;
        zzasd.zzf = str;
    }

    static /* synthetic */ void zzj(zzasd zzasd, int i) {
        zzasd.zzp = i - 1;
        zzasd.zzc |= 2048;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzasb.class, "zzp", zzasc.zza});
        } else if (ordinal == 3) {
            return new zzasd();
        } else {
            if (ordinal == 4) {
                return new zzarz((zzase) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzasd.class) {
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
