package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzass extends zzgzh implements zzhat {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final zzass zzb;
    private static volatile zzhba zzc;
    private int zzd;
    private long zze = 100;
    private boolean zzf;
    private boolean zzg;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        zzass zzass = new zzass();
        zzb = zzass;
        zzgzh.zzbZ(zzass.class, zzass);
    }

    private zzass() {
    }

    public static zzass zzb() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (ordinal == 3) {
            return new zzass();
        } else {
            if (ordinal == 4) {
                return new zzasq((zzasr) null);
            }
            if (ordinal == 5) {
                return zzb;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzc;
                if (zzhba == null) {
                    synchronized (zzass.class) {
                        zzhba = zzc;
                        if (zzhba == null) {
                            zzhba = new zzgzc(zzb);
                            zzc = zzhba;
                        }
                    }
                }
                return zzhba;
            }
            throw null;
        }
    }
}
