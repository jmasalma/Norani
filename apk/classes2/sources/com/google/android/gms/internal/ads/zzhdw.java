package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhdw extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhdw zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgxz zzd;
    private zzgxz zze;
    private byte zzf = 2;

    static {
        zzhdw zzhdw = new zzhdw();
        zza = zzhdw;
        zzgzh.zzbZ(zzhdw.class, zzhdw);
    }

    private zzhdw() {
        zzgxz zzgxz = zzgxz.zzb;
        this.zzd = zzgxz;
        this.zze = zzgxz;
    }

    public static zzhdv zzc() {
        return (zzhdv) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhdw zzhdw, zzgxz zzgxz) {
        zzhdw.zzc |= 1;
        zzhdw.zzd = zzgxz;
    }

    static /* synthetic */ void zzg(zzhdw zzhdw, zzgxz zzgxz) {
        zzhdw.zzc |= 2;
        zzhdw.zze = zzgxz;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        switch (zzgzg.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzf);
            case 1:
                this.zzf = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzhdw();
            case 4:
                return new zzhdv((zzhfx) null);
            case 5:
                return zza;
            case 6:
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhdw.class) {
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
