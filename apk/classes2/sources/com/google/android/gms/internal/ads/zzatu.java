package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzatu extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzatu zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgxz zzd;
    private zzgxz zze;
    private zzgxz zzf;
    private zzgxz zzg;

    static {
        zzatu zzatu = new zzatu();
        zza = zzatu;
        zzgzh.zzbZ(zzatu.class, zzatu);
    }

    private zzatu() {
        zzgxz zzgxz = zzgxz.zzb;
        this.zzd = zzgxz;
        this.zze = zzgxz;
        this.zzf = zzgxz;
        this.zzg = zzgxz;
    }

    public static zzatt zza() {
        return (zzatt) zza.zzaZ();
    }

    public static zzatu zzc(byte[] bArr, zzgyr zzgyr) throws zzgzw {
        return (zzatu) zzgzh.zzbx(zza, bArr, zzgyr);
    }

    static /* synthetic */ void zzi(zzatu zzatu, zzgxz zzgxz) {
        zzatu.zzc |= 1;
        zzatu.zzd = zzgxz;
    }

    static /* synthetic */ void zzj(zzatu zzatu, zzgxz zzgxz) {
        zzatu.zzc |= 2;
        zzatu.zze = zzgxz;
    }

    static /* synthetic */ void zzk(zzatu zzatu, zzgxz zzgxz) {
        zzatu.zzc |= 8;
        zzatu.zzg = zzgxz;
    }

    static /* synthetic */ void zzl(zzatu zzatu, zzgxz zzgxz) {
        zzatu.zzc |= 4;
        zzatu.zzf = zzgxz;
    }

    public final zzgxz zzd() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzatu();
        } else {
            if (ordinal == 4) {
                return new zzatt((zzaui) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzatu.class) {
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

    public final zzgxz zzf() {
        return this.zze;
    }

    public final zzgxz zzg() {
        return this.zzg;
    }

    public final zzgxz zzh() {
        return this.zzf;
    }
}
