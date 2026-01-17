package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhfi extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhfi zza;
    private static volatile zzhba zzb;
    private int zzc;
    private String zzd = "";
    private zzgxz zze = zzgxz.zzb;

    static {
        zzhfi zzhfi = new zzhfi();
        zza = zzhfi;
        zzgzh.zzbZ(zzhfi.class, zzhfi);
    }

    private zzhfi() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzhfi();
        } else {
            if (ordinal == 4) {
                return new zzhfh((zzhfx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhfi.class) {
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
