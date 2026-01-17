package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzguq extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzguq zza;
    private static volatile zzhba zzb;
    private String zzc = "";
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzguq zzguq = new zzguq();
        zza = zzguq;
        zzgzh.zzbZ(zzguq.class, zzguq);
    }

    private zzguq() {
    }

    public static zzgup zza() {
        return (zzgup) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzguq zzguq, String str) {
        str.getClass();
        zzguq.zzc = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzguq();
        } else {
            if (ordinal == 4) {
                return new zzgup((zzgur) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzguq.class) {
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
