package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhde extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhde zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzgxz zzf = zzgxz.zzb;

    static {
        zzhde zzhde = new zzhde();
        zza = zzhde;
        zzgzh.zzbZ(zzhde.class, zzhde);
    }

    private zzhde() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzhdd.zza, "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzhde();
        } else {
            if (ordinal == 4) {
                return new zzhdc((zzhfx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhde.class) {
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
