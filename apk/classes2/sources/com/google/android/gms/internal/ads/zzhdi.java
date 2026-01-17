package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhdi extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhdi zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private zzgzt zzg = zzgzh.zzbK();
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zzl = "";
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private zzgzt zzu = zzbK();
    private boolean zzv;
    private long zzw;
    private zzgzp zzx = zzbG();
    private boolean zzy;
    private zzgzp zzz = zzbG();

    static {
        zzhdi zzhdi = new zzhdi();
        zza = zzhdi;
        zzgzh.zzbZ(zzhdi.class, zzhdi);
    }

    private zzhdi() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzc", "zzd", zzhdh.zza, "zze", "zzf", "zzg", "zzh", zzhdf.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzhde.class, "zzv", "zzw", "zzx", zzhcv.zza(), "zzy", "zzz", zzhdg.zza});
        } else if (ordinal == 3) {
            return new zzhdi();
        } else {
            if (ordinal == 4) {
                return new zzhdb((zzhfx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhdi.class) {
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
