package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhed extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhed zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private zzgxz zze;
    private zzgxz zzf;

    static {
        zzhed zzhed = new zzhed();
        zza = zzhed;
        zzgzh.zzbZ(zzhed.class, zzhed);
    }

    private zzhed() {
        zzgxz zzgxz = zzgxz.zzb;
        this.zze = zzgxz;
        this.zzf = zzgxz;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzhed();
        } else {
            if (ordinal == 4) {
                return new zzhec((zzhfx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhed.class) {
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
