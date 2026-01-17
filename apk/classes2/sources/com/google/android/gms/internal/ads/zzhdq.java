package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhdq extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhdq zza;
    private static volatile zzhba zzb;
    private int zzc;
    private String zzd = "";
    private zzhdp zze;
    private long zzf;
    private String zzg = "";

    static {
        zzhdq zzhdq = new zzhdq();
        zza = zzhdq;
        zzgzh.zzbZ(zzhdq.class, zzhdq);
    }

    private zzhdq() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzhdq();
        } else {
            if (ordinal == 4) {
                return new zzhdn((zzhfx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhdq.class) {
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
