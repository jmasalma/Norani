package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfiw extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzfiw zza;
    private static volatile zzhba zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private boolean zzh;

    static {
        zzfiw zzfiw = new zzfiw();
        zza = zzfiw;
        zzgzh.zzbZ(zzfiw.class, zzfiw);
    }

    private zzfiw() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (ordinal == 3) {
            return new zzfiw();
        } else {
            if (ordinal == 4) {
                return new zzfiu((zzfiv) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzfiw.class) {
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
