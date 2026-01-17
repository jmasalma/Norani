package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgvi extends zzgzh implements zzhat {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final zzgvi zzb;
    private static volatile zzhba zzc;
    private String zzd = "";
    private zzgzt zze = zzbK();

    static {
        zzgvi zzgvi = new zzgvi();
        zzb = zzgvi;
        zzgzh.zzbZ(zzgvi.class, zzgvi);
    }

    private zzgvi() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgui.class});
        } else if (ordinal == 3) {
            return new zzgvi();
        } else {
            if (ordinal == 4) {
                return new zzgvg((zzgvh) null);
            }
            if (ordinal == 5) {
                return zzb;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzc;
                if (zzhba == null) {
                    synchronized (zzgvi.class) {
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
