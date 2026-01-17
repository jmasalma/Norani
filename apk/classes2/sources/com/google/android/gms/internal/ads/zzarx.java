package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzarx extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzarx zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzg;
    private boolean zzh = true;
    private zzasp zzi;
    private zzass zzj;
    private boolean zzk;

    static {
        zzarx zzarx = new zzarx();
        zza = zzarx;
        zzgzh.zzbZ(zzarx.class, zzarx);
    }

    private zzarx() {
    }

    public static zzarv zza() {
        return (zzarv) zza.zzaZ();
    }

    static /* synthetic */ void zzg(zzarx zzarx, boolean z) {
        zzarx.zzc |= 8;
        zzarx.zzg = z;
    }

    static /* synthetic */ void zzh(zzarx zzarx, String str) {
        str.getClass();
        zzarx.zzc |= 4;
        zzarx.zzf = str;
    }

    public final zzasp zzc() {
        zzasp zzasp = this.zzi;
        return zzasp == null ? zzasp.zzc() : zzasp;
    }

    public final zzass zzd() {
        zzass zzass = this.zzj;
        return zzass == null ? zzass.zzb() : zzass;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", zzary.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (ordinal == 3) {
            return new zzarx();
        } else {
            if (ordinal == 4) {
                return new zzarv((zzarw) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzarx.class) {
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

    public final String zzf() {
        return this.zzf;
    }

    @Deprecated
    public final boolean zzi() {
        return this.zzg;
    }
}
