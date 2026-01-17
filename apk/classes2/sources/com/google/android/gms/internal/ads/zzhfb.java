package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhfb extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhfb zza;
    private static volatile zzhba zzb;
    private int zzc;
    private String zzd = "";
    private long zze;
    private boolean zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private boolean zzk;

    static {
        zzhfb zzhfb = new zzhfb();
        zza = zzhfb;
        zzgzh.zzbZ(zzhfb.class, zzhfb);
    }

    private zzhfb() {
    }

    public static zzhfa zzc() {
        return (zzhfa) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhfb zzhfb, String str) {
        zzhfb.zzc |= 1;
        zzhfb.zzd = str;
    }

    static /* synthetic */ void zzg(zzhfb zzhfb, long j) {
        zzhfb.zzc |= 2;
        zzhfb.zze = j;
    }

    static /* synthetic */ void zzh(zzhfb zzhfb, boolean z) {
        zzhfb.zzc |= 4;
        zzhfb.zzf = z;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzhfc.zza, "zzh", "zzi", "zzj", "zzk"});
        } else if (ordinal == 3) {
            return new zzhfb();
        } else {
            if (ordinal == 4) {
                return new zzhfa((zzhfx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhfb.class) {
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
