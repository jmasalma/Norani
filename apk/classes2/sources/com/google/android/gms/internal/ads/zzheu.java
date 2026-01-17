package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzheu extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzheu zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgxz zzf;
    private zzgxz zzg;

    static {
        zzheu zzheu = new zzheu();
        zza = zzheu;
        zzgzh.zzbZ(zzheu.class, zzheu);
    }

    private zzheu() {
        zzgxz zzgxz = zzgxz.zzb;
        this.zzf = zzgxz;
        this.zzg = zzgxz;
    }

    public static zzhes zzc() {
        return (zzhes) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzheu zzheu, zzgxz zzgxz) {
        zzgxz.getClass();
        zzheu.zzc |= 4;
        zzheu.zzf = zzgxz;
    }

    static /* synthetic */ void zzg(zzheu zzheu, String str) {
        zzheu.zzc |= 2;
        zzheu.zze = "image/png";
    }

    static /* synthetic */ void zzh(zzheu zzheu, int i) {
        zzheu.zzd = 1;
        zzheu.zzc = 1 | zzheu.zzc;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhet.zza, "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzheu();
        } else {
            if (ordinal == 4) {
                return new zzhes((zzhfx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzheu.class) {
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
