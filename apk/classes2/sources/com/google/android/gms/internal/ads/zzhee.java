package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhee extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhee zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzhed zzd;
    private zzgzt zze = zzbK();
    private zzgxz zzf;
    private zzgxz zzg;
    private int zzh;
    private zzgxz zzi;
    private byte zzj = 2;

    static {
        zzhee zzhee = new zzhee();
        zza = zzhee;
        zzgzh.zzbZ(zzhee.class, zzhee);
    }

    private zzhee() {
        zzgxz zzgxz = zzgxz.zzb;
        this.zzf = zzgxz;
        this.zzg = zzgxz;
        this.zzi = zzgxz;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        switch (zzgzg.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzj);
            case 1:
                this.zzj = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhdw.class, "zzf", "zzg", "zzh", "zzi"});
            case 3:
                return new zzhee();
            case 4:
                return new zzheb((zzhfx) null);
            case 5:
                return zza;
            case 6:
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhee.class) {
                        zzhba = zzb;
                        if (zzhba == null) {
                            zzhba = new zzgzc(zza);
                            zzb = zzhba;
                        }
                    }
                }
                return zzhba;
            default:
                throw null;
        }
    }
}
