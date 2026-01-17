package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhez extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhez zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzhea zzf;
    private zzhee zzg;
    private int zzh;
    private zzgzp zzi = zzbG();
    private String zzj = "";
    private int zzk;
    private zzgzt zzl = zzgzh.zzbK();
    private byte zzm = 2;

    static {
        zzhez zzhez = new zzhez();
        zza = zzhez;
        zzgzh.zzbZ(zzhez.class, zzhez);
    }

    private zzhez() {
    }

    public static zzhey zzd() {
        return (zzhey) zza.zzaZ();
    }

    static /* synthetic */ void zzh(zzhez zzhez, String str) {
        str.getClass();
        zzgzt zzgzt = zzhez.zzl;
        if (!zzgzt.zzc()) {
            zzhez.zzl = zzgzh.zzbL(zzgzt);
        }
        zzhez.zzl.add(str);
    }

    static /* synthetic */ void zzi(zzhez zzhez, int i) {
        zzhez.zzc |= 1;
        zzhez.zzd = i;
    }

    static /* synthetic */ void zzj(zzhez zzhez, zzhea zzhea) {
        zzhea.getClass();
        zzhez.zzf = zzhea;
        zzhez.zzc |= 4;
    }

    static /* synthetic */ void zzk(zzhez zzhez, String str) {
        str.getClass();
        zzhez.zzc |= 2;
        zzhez.zze = str;
    }

    static /* synthetic */ void zzl(zzhez zzhez, int i) {
        zzhez.zzk = i - 1;
        zzhez.zzc |= 64;
    }

    public final int zzc() {
        return this.zzl.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        switch (zzgzg.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzm);
            case 1:
                this.zzm = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return zzbQ(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhew.zza, "zzl"});
            case 3:
                return new zzhez();
            case 4:
                return new zzhey((zzhfx) null);
            case 5:
                return zza;
            case 6:
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhez.class) {
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

    public final String zzg() {
        return this.zze;
    }
}
