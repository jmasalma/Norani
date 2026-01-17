package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaud extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzaud zza;
    private static volatile zzhba zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private zzgxz zzf = zzgxz.zzb;

    static {
        zzaud zzaud = new zzaud();
        zza = zzaud;
        zzgzh.zzbZ(zzaud.class, zzaud);
    }

    private zzaud() {
    }

    public static zzaud zzc() {
        return zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzgxz zzd() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzaud();
        } else {
            if (ordinal == 4) {
                return new zzauc((zzaui) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzaud.class) {
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
        return this.zze;
    }

    public final boolean zzg() {
        return (this.zzc & 1) != 0;
    }
}
