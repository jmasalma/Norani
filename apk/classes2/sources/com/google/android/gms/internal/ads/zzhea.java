package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhea extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhea zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzhdz zzd;
    private zzgzt zze = zzbK();
    private zzgxz zzf;
    private zzgxz zzg;
    private int zzh;
    private byte zzi = 2;

    static {
        zzhea zzhea = new zzhea();
        zza = zzhea;
        zzgzh.zzbZ(zzhea.class, zzhea);
    }

    private zzhea() {
        zzgxz zzgxz = zzgxz.zzb;
        this.zzf = zzgxz;
        this.zzg = zzgxz;
    }

    public static zzhdx zzc() {
        return (zzhdx) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhea zzhea, zzhdw zzhdw) {
        zzhdw.getClass();
        zzgzt zzgzt = zzhea.zze;
        if (!zzgzt.zzc()) {
            zzhea.zze = zzgzh.zzbL(zzgzt);
        }
        zzhea.zze.add(zzhdw);
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        switch (zzgzg.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzi);
            case 1:
                this.zzi = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return zzbQ(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhdw.class, "zzf", "zzg", "zzh"});
            case 3:
                return new zzhea();
            case 4:
                return new zzhdx((zzhfx) null);
            case 5:
                return zza;
            case 6:
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhea.class) {
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
