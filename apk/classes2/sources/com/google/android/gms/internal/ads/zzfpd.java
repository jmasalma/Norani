package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfpd extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzfpd zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgzp zzd = zzbG();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzfpd zzfpd = new zzfpd();
        zza = zzfpd;
        zzgzh.zzbZ(zzfpd.class, zzfpd);
    }

    private zzfpd() {
    }

    public static zzfpb zza() {
        return (zzfpb) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzfpd zzfpd, String str) {
        str.getClass();
        zzfpd.zzc |= 1;
        zzfpd.zze = str;
    }

    static /* synthetic */ void zzd(zzfpd zzfpd, int i) {
        zzgzp zzgzp = zzfpd.zzd;
        if (!zzgzp.zzc()) {
            zzfpd.zzd = zzgzh.zzbH(zzgzp);
        }
        zzfpd.zzd.zzi(2);
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfpa.zza, "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzfpd();
        } else {
            if (ordinal == 4) {
                return new zzfpb((zzfpc) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzfpd.class) {
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
