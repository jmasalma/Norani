package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgui extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgui zza;
    private static volatile zzhba zzb;
    private String zzc = "";
    private String zzd = "";
    private int zze;
    private boolean zzf;
    private String zzg = "";

    static {
        zzgui zzgui = new zzgui();
        zza = zzgui;
        zzgzh.zzbZ(zzgui.class, zzgui);
    }

    private zzgui() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzgui();
        } else {
            if (ordinal == 4) {
                return new zzgug((zzguh) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgui.class) {
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
