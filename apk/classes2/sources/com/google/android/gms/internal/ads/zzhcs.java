package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhcs extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhcs zza;
    private static volatile zzhba zzb;
    private zzgzp zzc = zzbG();
    private zzgzp zzd = zzbG();

    static {
        zzhcs zzhcs = new zzhcs();
        zza = zzhcs;
        zzgzh.zzbZ(zzhcs.class, zzhcs);
    }

    private zzhcs() {
    }

    public static zzhcs zzd(byte[] bArr, zzgyr zzgyr) throws zzgzw {
        return (zzhcs) zzgzh.zzbx(zza, bArr, zzgyr);
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzhcs();
        } else {
            if (ordinal == 4) {
                return new zzhcr((zzhct) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhcs.class) {
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
