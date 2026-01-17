package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfph extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzfph zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfpd zzg;

    static {
        zzfph zzfph = new zzfph();
        zza = zzfph;
        zzgzh.zzbZ(zzfph.class, zzfph);
    }

    private zzfph() {
    }

    public static zzfpe zza() {
        return (zzfpe) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzfph zzfph, String str) {
        str.getClass();
        zzfph.zzc |= 2;
        zzfph.zze = str;
    }

    static /* synthetic */ void zzd(zzfph zzfph, zzfpd zzfpd) {
        zzfpd.getClass();
        zzfph.zzg = zzfpd;
        zzfph.zzc |= 8;
    }

    static /* synthetic */ void zzf(zzfph zzfph, int i) {
        zzfph.zzd = 1;
        zzfph.zzc = 1 | zzfph.zzc;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfpf.zza, "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzfph();
        } else {
            if (ordinal == 4) {
                return new zzfpe((zzfpg) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzfph.class) {
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
