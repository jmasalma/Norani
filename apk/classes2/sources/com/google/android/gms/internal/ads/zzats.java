package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzats extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzats zza;
    private static volatile zzhba zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private zzgzp zzg = zzbG();
    private long zzh;
    private boolean zzi;
    private zzgzt zzj = zzbK();
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        zzats zzats = new zzats();
        zza = zzats;
        zzgzh.zzbZ(zzats.class, zzats);
    }

    private zzats() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\b᠌\u0005\t᠌\u0006\n᠌\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzatw.class, "zzk", zzfus.zza(), "zzl", zzhcq.zza(), "zzm", zzhco.zza()});
        } else if (ordinal == 3) {
            return new zzats();
        } else {
            if (ordinal == 4) {
                return new zzatr((zzaui) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzats.class) {
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
