package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhej extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhej zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private zzhei zze;
    private zzhei zzf;

    static {
        zzhej zzhej = new zzhej();
        zza = zzhej;
        zzgzh.zzbZ(zzhej.class, zzhej);
    }

    private zzhej() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzheg.zza, "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzhej();
        } else {
            if (ordinal == 4) {
                return new zzhef((zzhfx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhej.class) {
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
