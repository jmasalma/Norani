package com.google.android.gms.internal.ads;

import java.util.List;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhfm extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhfm zza;
    private static volatile zzhba zzb;
    private zzgzt zzA = zzgzh.zzbK();
    private zzgzt zzB = zzgzh.zzbK();
    private zzhfi zzC;
    private zzgzt zzD = zzbK();
    private zzhdq zzE;
    private String zzF = "";
    private zzhdi zzG;
    private zzgzt zzH = zzbK();
    private zzhej zzI;
    private int zzJ;
    private zzgzt zzK = zzbK();
    private zzgzt zzL = zzbK();
    private long zzM;
    private zzhfl zzN;
    private zzheo zzO;
    private String zzP = "";
    private zzhff zzQ;
    private byte zzR = 2;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private zzhdm zzi;
    private zzgzt zzj = zzbK();
    private zzgzt zzk = zzbK();
    private String zzl = "";
    private zzheu zzm;
    private boolean zzn;
    private zzgzt zzo = zzgzh.zzbK();
    private String zzp = "";
    private boolean zzu;
    private boolean zzv;
    private zzgxz zzw = zzgxz.zzb;
    private zzhfb zzx;
    private boolean zzy;
    private String zzz = "";

    static {
        zzhfm zzhfm = new zzhfm();
        zza = zzhfm;
        zzgzh.zzbZ(zzhfm.class, zzhfm);
    }

    private zzhfm() {
    }

    public static zzhdk zzc() {
        return (zzhdk) zza.zzaZ();
    }

    static /* synthetic */ void zzi(zzhfm zzhfm, Iterable iterable) {
        zzgzt zzgzt = zzhfm.zzA;
        if (!zzgzt.zzc()) {
            zzhfm.zzA = zzgzh.zzbL(zzgzt);
        }
        zzgxi.zzaQ(iterable, zzhfm.zzA);
    }

    static /* synthetic */ void zzj(zzhfm zzhfm, Iterable iterable) {
        zzgzt zzgzt = zzhfm.zzB;
        if (!zzgzt.zzc()) {
            zzhfm.zzB = zzgzh.zzbL(zzgzt);
        }
        zzgxi.zzaQ(iterable, zzhfm.zzB);
    }

    static /* synthetic */ void zzk(zzhfm zzhfm, zzhez zzhez) {
        zzhez.getClass();
        zzgzt zzgzt = zzhfm.zzj;
        if (!zzgzt.zzc()) {
            zzhfm.zzj = zzgzh.zzbL(zzgzt);
        }
        zzhfm.zzj.add(zzhez);
    }

    static /* synthetic */ void zzl(zzhfm zzhfm) {
        zzhfm.zzc &= -65;
        zzhfm.zzl = zza.zzl;
    }

    static /* synthetic */ void zzm(zzhfm zzhfm, String str) {
        zzhfm.zzc |= 64;
        zzhfm.zzl = str;
    }

    static /* synthetic */ void zzn(zzhfm zzhfm, zzhfb zzhfb) {
        zzhfb.getClass();
        zzhfm.zzx = zzhfb;
        zzhfm.zzc |= ConstantsKt.DEFAULT_BUFFER_SIZE;
    }

    static /* synthetic */ void zzo(zzhfm zzhfm, zzhdm zzhdm) {
        zzhdm.getClass();
        zzhfm.zzi = zzhdm;
        zzhfm.zzc |= 32;
    }

    static /* synthetic */ void zzp(zzhfm zzhfm, String str) {
        zzhfm.zzc |= 8;
        zzhfm.zzg = str;
    }

    static /* synthetic */ void zzq(zzhfm zzhfm, zzheu zzheu) {
        zzheu.getClass();
        zzhfm.zzm = zzheu;
        zzhfm.zzc |= 128;
    }

    static /* synthetic */ void zzr(zzhfm zzhfm, String str) {
        zzhfm.zzc |= 4;
        zzhfm.zzf = str;
    }

    static /* synthetic */ void zzs(zzhfm zzhfm, int i) {
        zzhfm.zzd = i - 1;
        zzhfm.zzc |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        switch (zzgzg.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzR);
            case 1:
                this.zzR = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return zzbQ(zza, "\u0001$\u0000\u0001\u0001$$\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhez.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhev.zza, "zze", zzhdj.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhfq.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhfw.class, "zzE", "zzF", "zzG", "zzH", zzhdu.class, "zzI", "zzJ", zzhfg.zza, "zzK", zzhem.class, "zzL", zzher.class, "zzM", "zzN", "zzO", "zzP", "zzQ"});
            case 3:
                return new zzhfm();
            case 4:
                return new zzhdk((zzhfx) null);
            case 5:
                return zza;
            case 6:
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhfm.class) {
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

    public final String zzf() {
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }
}
