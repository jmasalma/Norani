package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzkh extends zzg implements zziy {
    public static final /* synthetic */ int zzd = 0;
    /* access modifiers changed from: private */
    public final zzdi zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private zzmh zzE;
    private zzmi zzF;
    private zzix zzG;
    private zzbd zzH;
    private zzat zzI;
    /* access modifiers changed from: private */
    public Object zzJ;
    private Surface zzK;
    private int zzL;
    private zzeo zzM;
    private zze zzN;
    private float zzO;
    /* access modifiers changed from: private */
    public boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzat zzT;
    private zzls zzU;
    private int zzV;
    private long zzW;
    private final zzjj zzX;
    private zzxc zzY;
    final zzze zzb;
    final zzbd zzc;
    private final zzdm zze = new zzdm(zzdj.zza);
    private final Context zzf;
    private final zzbh zzg;
    private final zzma[] zzh;
    private final zzma[] zzi;
    private final zzzd zzj;
    private final zzdt zzk;
    private final zzkt zzl;
    /* access modifiers changed from: private */
    public final zzdz zzm;
    private final CopyOnWriteArraySet zzn;
    private final zzbj zzo;
    private final List zzp;
    private final boolean zzq;
    /* access modifiers changed from: private */
    public final zzmo zzr;
    private final Looper zzs;
    private final zzzl zzt;
    private final zzdj zzu;
    private final zzkd zzv;
    private final zzke zzw;
    private final zzmm zzx;
    private final zzmn zzy;
    private final long zzz;

    static {
        zzaq.zzb("media3.exoplayer");
    }

    public zzkh(zziw zziw, zzbh zzbh) {
        int i;
        zziw zziw2;
        zziw zziw3 = zziw;
        zzbh zzbh2 = zzbh;
        try {
            zzea.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0-alpha01] [" + zzex.zza + "]");
            this.zzf = zziw3.zza.getApplicationContext();
            this.zzr = (zzmo) zziw3.zzh.apply(zziw3.zzb);
            this.zzS = zziw3.zzj;
            this.zzN = zziw3.zzk;
            this.zzL = zziw3.zzl;
            this.zzP = false;
            this.zzz = zziw3.zzq;
            zzkd zzkd = new zzkd(this, (zzkg) null);
            this.zzv = zzkd;
            this.zzw = new zzke((zzkg) null);
            Handler handler = new Handler(zziw3.zzi);
            zzcem zzcem = ((zzip) zziw3.zzc).zza;
            zzcem zzcem2 = zzcem;
            zzma[] zzac = zzceo.zzac(zzcem.zza, handler, zzkd, zzkd, zzkd, zzkd);
            this.zzh = zzac;
            int length = zzac.length;
            this.zzi = new zzma[2];
            int i2 = 0;
            while (true) {
                zzma[] zzmaArr = this.zzi;
                int length2 = zzmaArr.length;
                if (i2 >= 2) {
                    break;
                }
                zzma zzma = this.zzh[i2];
                zzmaArr[i2] = null;
                i2++;
            }
            zzzd zzzd = (zzzd) zziw3.zze.zza();
            this.zzj = zzzd;
            zzvg zza = zziw.zza(((zziq) zziw3.zzd).zza);
            zzzl zzh2 = zzzp.zzh(((zzit) zziw3.zzg).zza);
            this.zzt = zzh2;
            this.zzq = zziw3.zzm;
            this.zzF = zziw3.zzn;
            this.zzE = zziw3.zzo;
            Looper looper = zziw3.zzi;
            this.zzs = looper;
            zzdj zzdj = zziw3.zzb;
            this.zzu = zzdj;
            this.zzg = zzbh2;
            zzdz zzdz = new zzdz(looper, zzdj, new zzji(this));
            this.zzm = zzdz;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzn = copyOnWriteArraySet;
            this.zzp = new ArrayList();
            this.zzY = new zzxc(0);
            this.zzG = zzix.zza;
            int length3 = this.zzh.length;
            zzze zzze = new zzze(new zzme[2], new zzyw[2], zzbt.zza, (Object) null);
            this.zzb = zzze;
            this.zzo = new zzbj();
            zzbc zzbc = new zzbc();
            zzbc.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzzd.zzn();
            zzbc.zzd(29, true);
            zzbc.zzd(23, false);
            zzbc.zzd(25, false);
            zzbc.zzd(33, false);
            zzbc.zzd(26, false);
            zzbc.zzd(34, false);
            zzbd zze2 = zzbc.zze();
            this.zzc = zze2;
            zzbc zzbc2 = new zzbc();
            zzbc2.zzb(zze2);
            zzbc2.zza(4);
            zzbc2.zza(10);
            this.zzH = zzbc2.zze();
            this.zzk = zzdj.zzd(looper, (Handler.Callback) null);
            zzjj zzjj = new zzjj(this);
            this.zzX = zzjj;
            this.zzU = zzls.zzh(zzze);
            this.zzr.zzT(zzbh2, looper);
            zzph zzph = new zzph(zziw3.zzt);
            Context context = this.zzf;
            zzma[] zzmaArr2 = this.zzh;
            zzma[] zzmaArr3 = this.zzi;
            zzmo zzmo = this.zzr;
            zzmi zzmi = this.zzF;
            zzig zzig = zziw3.zzu;
            zzdj zzdj2 = zzdj;
            zzkt zzkt = r7;
            zzjj zzjj2 = zzjj;
            Context context2 = context;
            zzze zzze2 = zzze;
            zzma[] zzmaArr4 = zzmaArr2;
            CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
            zzma[] zzmaArr5 = zzmaArr3;
            zzdz zzdz2 = zzdz;
            zzze zzze3 = zzze2;
            zzdj zzdj3 = zzdj2;
            long j = zziw3.zzp;
            Looper looper2 = looper;
            zzkt zzkt2 = new zzkt(context2, zzmaArr4, zzmaArr5, zzzd, zzze3, (zzkx) zziw3.zzf.zza(), zzh2, 0, false, zzmo, zzmi, zzig, j, false, false, looper2, zzdj3, zzjj2, zzph, (zzlt) null, this.zzG, this.zzw);
            this.zzl = zzkt2;
            Looper zze3 = zzkt2.zze();
            this.zzO = 1.0f;
            zzat zzat = zzat.zza;
            this.zzI = zzat;
            this.zzT = zzat;
            this.zzV = -1;
            int i3 = zzcw.zza;
            this.zzQ = true;
            zzmo zzmo2 = this.zzr;
            if (zzmo2 != null) {
                zzdz2.zzb(zzmo2);
                Looper looper3 = looper2;
                zzh2.zzf(new Handler(looper3), this.zzr);
                copyOnWriteArraySet2.add(this.zzv);
                if (Build.VERSION.SDK_INT >= 31) {
                    i = 1;
                    zziw2 = zziw;
                    zzdj3.zzd(zzkt2.zze(), (Handler.Callback) null).zzi(new zzjx(this.zzf, zziw2.zzr, this, zzph));
                } else {
                    i = 1;
                    zziw2 = zziw;
                }
                zzdi zzdi = new zzdi((Object) null, zze3, looper3, zzdj3, new zzjk(this));
                this.zzA = zzdi;
                zzdi.zzd(new zzjl(this));
                new zzhx(zziw2.zza, zze3, zziw2.zzi, this.zzv, zzdj3);
                this.zzx = new zzmm(zziw2.zza, zze3, zzdj3);
                this.zzy = new zzmn(zziw2.zza, zze3, zzdj3);
                int i4 = zzo.zza;
                zzcd zzcd = zzcd.zza;
                this.zzM = zzeo.zza;
                zzkt2.zzs(this.zzE);
                zzkt2.zzq(this.zzN, false);
                zzad(i, 3, this.zzN);
                zzad(2, 4, Integer.valueOf(this.zzL));
                zzad(2, 5, 0);
                zzad(i, 9, Boolean.valueOf(this.zzP));
                zzad(6, 8, this.zzw);
                zzad(-1, 16, Integer.valueOf(this.zzS));
                return;
            }
            throw null;
        } finally {
            this.zze.zzf();
        }
    }

    public static /* synthetic */ void zzJ(zzkh zzkh) {
        String str = zzex.zza;
        zzkh.zzA.zze(Integer.valueOf(zzcj.zzc(zzkh.zzf).generateAudioSessionId()));
    }

    public static /* synthetic */ void zzK(zzkh zzkh, zzkq zzkq) {
        boolean z;
        long j;
        int i = zzkh.zzB - zzkq.zzb;
        zzkh.zzB = i;
        boolean z2 = true;
        if (zzkq.zzc) {
            zzkh.zzC = zzkq.zzd;
            zzkh.zzD = true;
        }
        if (i == 0) {
            zzbl zzbl = zzkq.zza.zza;
            if (!zzkh.zzU.zza.zzo() && zzbl.zzo()) {
                zzkh.zzV = -1;
                zzkh.zzW = 0;
            }
            if (!zzbl.zzo()) {
                List zzw2 = ((zzly) zzbl).zzw();
                int size = zzw2.size();
                List list = zzkh.zzp;
                zzdd.zzf(size == list.size());
                for (int i2 = 0; i2 < zzw2.size(); i2++) {
                    ((zzkf) list.get(i2)).zzc((zzbl) zzw2.get(i2));
                }
            }
            long j2 = -9223372036854775807L;
            if (zzkh.zzD) {
                if (zzkq.zza.zzb.equals(zzkh.zzU.zzb) && zzkq.zza.zzd == zzkh.zzU.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (zzbl.zzo() || zzkq.zza.zzb.zzb()) {
                        j = zzkq.zza.zzd;
                    } else {
                        zzls zzls = zzkq.zza;
                        zzvh zzvh = zzls.zzb;
                        j = zzls.zzd;
                        zzkh.zzW(zzbl, zzvh, j);
                    }
                    z = z2;
                    j2 = j;
                } else {
                    z = z2;
                }
            } else {
                z = false;
            }
            zzkh.zzD = false;
            zzkh.zzag(zzkq.zza, 1, z, zzkh.zzC, j2, -1, false);
        }
    }

    public static /* synthetic */ void zzL(zzkh zzkh, int i, int i2) {
        zzkh.zzai();
        Integer valueOf = Integer.valueOf(i2);
        zzkh.zzad(1, 10, valueOf);
        zzkh.zzad(2, 10, valueOf);
        zzjm zzjm = new zzjm(i2);
        zzdz zzdz = zzkh.zzm;
        zzdz.zzd(21, zzjm);
        zzdz.zzc();
    }

    static /* bridge */ /* synthetic */ void zzP(zzkh zzkh, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkh.zzae(surface);
        zzkh.zzK = surface;
    }

    private final int zzS(zzls zzls) {
        zzbl zzbl = zzls.zza;
        if (zzbl.zzo()) {
            return this.zzV;
        }
        return zzbl.zzn(zzls.zzb.zza, this.zzo).zzc;
    }

    private final long zzT(zzls zzls) {
        zzvh zzvh = zzls.zzb;
        if (!zzvh.zzb()) {
            return zzex.zzv(zzU(zzls));
        }
        zzbl zzbl = zzls.zza;
        zzbl.zzn(zzvh.zza, this.zzo);
        long j = zzls.zzc;
        if (j != -9223372036854775807L) {
            return zzex.zzv(0) + zzex.zzv(j);
        }
        long j2 = zzbl.zze(zzS(zzls), this.zza, 0).zzl;
        return zzex.zzv(0);
    }

    private final long zzU(zzls zzls) {
        zzbl zzbl = zzls.zza;
        if (zzbl.zzo()) {
            return zzex.zzs(this.zzW);
        }
        boolean z = zzls.zzp;
        long j = zzls.zzs;
        zzvh zzvh = zzls.zzb;
        if (zzvh.zzb()) {
            return j;
        }
        zzW(zzbl, zzvh, j);
        return j;
    }

    private static long zzV(zzls zzls) {
        zzbk zzbk = new zzbk();
        zzbj zzbj = new zzbj();
        zzbl zzbl = zzls.zza;
        zzbl.zzn(zzls.zzb.zza, zzbj);
        long j = zzls.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzbl.zze(zzbj.zzc, zzbk, 0).zzl;
        return 0;
    }

    private final long zzW(zzbl zzbl, zzvh zzvh, long j) {
        zzbl.zzn(zzvh.zza, this.zzo);
        return j;
    }

    private final Pair zzX(zzbl zzbl, int i, long j) {
        if (zzbl.zzo()) {
            this.zzV = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzW = j;
            return null;
        }
        if (i == -1 || i >= zzbl.zzc()) {
            i = zzbl.zzg(false);
            long j2 = zzbl.zze(i, this.zza, 0).zzl;
            j = zzex.zzv(0);
        }
        return zzbl.zzl(this.zza, this.zzo, i, zzex.zzs(j));
    }

    private static zzls zzY(zzls zzls, int i) {
        zzls zzf2 = zzls.zzf(i);
        if (i == 1 || i == 4) {
            return zzf2.zza(false);
        }
        return zzf2;
    }

    private final zzls zzZ(zzls zzls, zzbl zzbl, Pair pair) {
        zzxk zzxk;
        zzze zzze;
        List list;
        int i;
        long j;
        zzbl zzbl2 = zzbl;
        Pair pair2 = pair;
        zzdd.zzd(zzbl.zzo() || pair2 != null);
        zzbl zzbl3 = zzls.zza;
        long zzT2 = zzT(zzls);
        zzls zzg2 = zzls.zzg(zzbl);
        if (zzbl.zzo()) {
            zzvh zzi2 = zzls.zzi();
            long zzs2 = zzex.zzs(this.zzW);
            zzls zzb2 = zzg2.zzc(zzi2, zzs2, zzs2, zzs2, 0, zzxk.zza, this.zzb, zzfyq.zzn()).zzb(zzi2);
            zzb2.zzq = zzb2.zzs;
            return zzb2;
        }
        zzvh zzvh = zzg2.zzb;
        Object obj = zzvh.zza;
        String str = zzex.zza;
        Pair pair3 = pair2;
        boolean z = !obj.equals(pair2.first);
        zzvh zzvh2 = z ? new zzvh(pair2.first, -1) : zzvh;
        long longValue = ((Long) pair2.second).longValue();
        long zzs3 = zzex.zzs(zzT2);
        if (!zzbl3.zzo()) {
            zzbl3.zzn(obj, this.zzo);
        }
        if (z || longValue < zzs3) {
            long j2 = longValue;
            zzvh zzvh3 = zzvh2;
            zzdd.zzf(!zzvh3.zzb());
            if (z) {
                zzxk = zzxk.zza;
            } else {
                zzxk = zzg2.zzh;
            }
            zzxk zzxk2 = zzxk;
            if (z) {
                zzze = this.zzb;
            } else {
                zzze = zzg2.zzi;
            }
            zzze zzze2 = zzze;
            if (z) {
                list = zzfyq.zzn();
            } else {
                list = zzg2.zzj;
            }
            zzls zzb3 = zzg2.zzc(zzvh3, j2, j2, j2, 0, zzxk2, zzze2, list).zzb(zzvh3);
            zzb3.zzq = j2;
            return zzb3;
        } else if (i == 0) {
            int zza = zzbl2.zza(zzg2.zzk.zza);
            if (zza != -1) {
                zzbj zzbj = this.zzo;
                if (zzbl2.zzd(zza, zzbj, false).zzc == zzbl2.zzn(zzvh2.zza, zzbj).zzc) {
                    return zzg2;
                }
            }
            Object obj2 = zzvh2.zza;
            zzbj zzbj2 = this.zzo;
            zzbl2.zzn(obj2, zzbj2);
            if (zzvh2.zzb()) {
                j = zzbj2.zzf(zzvh2.zzb, zzvh2.zzc);
            } else {
                j = zzbj2.zzd;
            }
            zzls zzb4 = zzg2.zzc(zzvh2, zzg2.zzs, zzg2.zzs, zzg2.zzd, j - zzg2.zzs, zzg2.zzh, zzg2.zzi, zzg2.zzj).zzb(zzvh2);
            zzb4.zzq = j;
            return zzb4;
        } else {
            zzvh zzvh4 = zzvh2;
            zzdd.zzf(!zzvh4.zzb());
            long max = Math.max(0, zzg2.zzr - (longValue - zzs3));
            long j3 = zzg2.zzq;
            if (zzg2.zzk.equals(zzvh)) {
                j3 = longValue + max;
            }
            zzls zzc2 = zzg2.zzc(zzvh4, longValue, longValue, longValue, max, zzg2.zzh, zzg2.zzi, zzg2.zzj);
            zzc2.zzq = j3;
            return zzc2;
        }
    }

    private final zzlw zzaa(zzlv zzlv) {
        int zzS2 = zzS(this.zzU);
        zzbl zzbl = this.zzU.zza;
        if (zzS2 == -1) {
            zzS2 = 0;
        }
        zzdj zzdj = this.zzu;
        zzkt zzkt = this.zzl;
        return new zzlw(zzkt, zzlv, zzbl, zzS2, zzdj, zzkt.zze());
    }

    /* access modifiers changed from: private */
    public final /* synthetic */ void zzab(zzkq zzkq) {
        this.zzk.zzi(new zzjo(this, zzkq));
    }

    /* access modifiers changed from: private */
    public final void zzac(int i, int i2) {
        if (i != this.zzM.zzb() || i2 != this.zzM.zza()) {
            this.zzM = new zzeo(i, i2);
            zzdz zzdz = this.zzm;
            zzdz.zzd(24, new zzjf(i, i2));
            zzdz.zzc();
            zzad(2, 14, new zzeo(i, i2));
        }
    }

    private final void zzad(int i, int i2, Object obj) {
        zzma[] zzmaArr = this.zzh;
        int length = zzmaArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzma zzma = zzmaArr[i3];
            if (i == -1 || zzma.zzb() == i) {
                zzlw zzaa = zzaa(zzma);
                zzaa.zzf(i2);
                zzaa.zze(obj);
                zzaa.zzd();
            }
        }
        zzma[] zzmaArr2 = this.zzi;
        int length2 = zzmaArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzma zzma2 = zzmaArr2[i4];
            if (zzma2 != null && (i == -1 || zzma2.zzb() == i)) {
                zzlw zzaa2 = zzaa(zzma2);
                zzaa2.zzf(i2);
                zzaa2.zze(obj);
                zzaa2.zzd();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzae(Object obj) {
        Surface surface;
        Object obj2 = this.zzJ;
        boolean z = false;
        if (!(obj2 == null || obj2 == obj)) {
            z = true;
        }
        boolean zzx2 = this.zzl.zzx(obj, z ? this.zzz : -9223372036854775807L);
        if (z && this.zzJ == (surface = this.zzK)) {
            surface.release();
            this.zzK = null;
        }
        this.zzJ = obj;
        if (!zzx2) {
            zzaf(zzin.zzd(new zzku(3), 1003));
        }
    }

    private final void zzaf(zzin zzin) {
        zzls zzls = this.zzU;
        zzls zzb2 = zzls.zzb(zzls.zzb);
        zzb2.zzq = zzb2.zzs;
        zzb2.zzr = 0;
        zzls zzY2 = zzY(zzb2, 1);
        if (zzin != null) {
            zzY2 = zzY2.zze(zzin);
        }
        this.zzB++;
        this.zzl.zzu();
        zzag(zzY2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x046e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x049f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04b6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04c2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0288  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzag(com.google.android.gms.internal.ads.zzls r44, int r45, boolean r46, int r47, long r48, int r50, boolean r51) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            r2 = r47
            com.google.android.gms.internal.ads.zzls r3 = r0.zzU
            r0.zzU = r1
            com.google.android.gms.internal.ads.zzbl r4 = r3.zza
            com.google.android.gms.internal.ads.zzbl r5 = r1.zza
            boolean r6 = r4.equals(r5)
            r7 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r6 = r6 ^ r7
            boolean r9 = r5.zzo()
            r11 = 3
            r12 = -1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r14 = 0
            r10 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r10)
            if (r9 == 0) goto L_0x003a
            boolean r9 = r4.zzo()
            if (r9 == 0) goto L_0x003a
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r12, r13)
            r15 = r3
            r18 = r4
            goto L_0x0051
        L_0x003a:
            boolean r9 = r5.zzo()
            boolean r10 = r4.zzo()
            if (r9 == r10) goto L_0x0056
            android.util.Pair r9 = new android.util.Pair
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r9.<init>(r8, r10)
            r15 = r3
            r18 = r4
            r8 = r9
        L_0x0051:
            r3 = r2
            r2 = r46
            goto L_0x00da
        L_0x0056:
            com.google.android.gms.internal.ads.zzvh r9 = r3.zzb
            java.lang.Object r10 = r9.zza
            com.google.android.gms.internal.ads.zzbj r11 = r0.zzo
            com.google.android.gms.internal.ads.zzbj r10 = r4.zzn(r10, r11)
            int r10 = r10.zzc
            com.google.android.gms.internal.ads.zzbk r7 = r0.zza
            com.google.android.gms.internal.ads.zzbk r10 = r4.zze(r10, r7, r14)
            java.lang.Object r10 = r10.zzb
            com.google.android.gms.internal.ads.zzvh r14 = r1.zzb
            java.lang.Object r15 = r14.zza
            com.google.android.gms.internal.ads.zzbj r11 = r5.zzn(r15, r11)
            int r11 = r11.zzc
            r15 = r3
            r18 = r4
            r3 = 0
            com.google.android.gms.internal.ads.zzbk r7 = r5.zze(r11, r7, r3)
            java.lang.Object r3 = r7.zzb
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x00b3
            if (r46 == 0) goto L_0x0090
            if (r2 != 0) goto L_0x008d
            r2 = 0
            r3 = 1
            r4 = 1
            goto L_0x009d
        L_0x008d:
            r3 = 1
            r4 = 1
            goto L_0x0092
        L_0x0090:
            r3 = 0
            r4 = 0
        L_0x0092:
            if (r3 == 0) goto L_0x009a
            r7 = 1
            if (r2 != r7) goto L_0x009a
            r3 = r4
            r4 = 2
            goto L_0x009d
        L_0x009a:
            if (r6 == 0) goto L_0x00ad
            r4 = 3
        L_0x009d:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.<init>(r8, r4)
            r8 = r7
            r42 = r3
            r3 = r2
            r2 = r42
            goto L_0x00da
        L_0x00ad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00b3:
            if (r46 == 0) goto L_0x00d3
            if (r2 != 0) goto L_0x00d0
            long r2 = r9.zzd
            long r9 = r14.zzd
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00cd
            android.util.Pair r2 = new android.util.Pair
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.<init>(r8, r4)
            r8 = r2
            r2 = 1
            r3 = 0
            goto L_0x00da
        L_0x00cd:
            r2 = 1
            r3 = 0
            goto L_0x00d5
        L_0x00d0:
            r3 = r2
            r2 = 1
            goto L_0x00d5
        L_0x00d3:
            r3 = r2
            r2 = 0
        L_0x00d5:
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r12, r13)
        L_0x00da:
            java.lang.Object r4 = r8.first
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.Object r7 = r8.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r4 == 0) goto L_0x010f
            boolean r9 = r5.zzo()
            if (r9 != 0) goto L_0x0109
            com.google.android.gms.internal.ads.zzvh r9 = r1.zzb
            java.lang.Object r9 = r9.zza
            com.google.android.gms.internal.ads.zzbj r10 = r0.zzo
            com.google.android.gms.internal.ads.zzbj r9 = r5.zzn(r9, r10)
            int r9 = r9.zzc
            com.google.android.gms.internal.ads.zzbk r10 = r0.zza
            r11 = 0
            com.google.android.gms.internal.ads.zzbk r5 = r5.zze(r9, r10, r11)
            com.google.android.gms.internal.ads.zzap r5 = r5.zzd
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            com.google.android.gms.internal.ads.zzat r9 = com.google.android.gms.internal.ads.zzat.zza
            r0.zzT = r9
            goto L_0x0110
        L_0x010f:
            r5 = 0
        L_0x0110:
            r9 = r15
            if (r4 != 0) goto L_0x011d
            java.util.List r10 = r9.zzj
            java.util.List r11 = r1.zzj
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x014c
        L_0x011d:
            com.google.android.gms.internal.ads.zzat r10 = r0.zzT
            com.google.android.gms.internal.ads.zzar r10 = r10.zza()
            java.util.List r11 = r1.zzj
            r12 = 0
        L_0x0126:
            int r13 = r11.size()
            if (r12 >= r13) goto L_0x0146
            java.lang.Object r13 = r11.get(r12)
            com.google.android.gms.internal.ads.zzav r13 = (com.google.android.gms.internal.ads.zzav) r13
            r14 = 0
        L_0x0133:
            int r15 = r13.zza()
            if (r14 >= r15) goto L_0x0143
            com.google.android.gms.internal.ads.zzau r15 = r13.zzb(r14)
            r15.zza(r10)
            int r14 = r14 + 1
            goto L_0x0133
        L_0x0143:
            int r12 = r12 + 1
            goto L_0x0126
        L_0x0146:
            com.google.android.gms.internal.ads.zzat r10 = r10.zzw()
            r0.zzT = r10
        L_0x014c:
            com.google.android.gms.internal.ads.zzbl r10 = r43.zzo()
            boolean r11 = r10.zzo()
            if (r11 == 0) goto L_0x0159
            com.google.android.gms.internal.ads.zzat r10 = r0.zzT
            goto L_0x0176
        L_0x0159:
            int r11 = r43.zze()
            com.google.android.gms.internal.ads.zzbk r12 = r0.zza
            r13 = 0
            com.google.android.gms.internal.ads.zzbk r10 = r10.zze(r11, r12, r13)
            com.google.android.gms.internal.ads.zzap r10 = r10.zzd
            com.google.android.gms.internal.ads.zzat r11 = r0.zzT
            com.google.android.gms.internal.ads.zzar r11 = r11.zza()
            com.google.android.gms.internal.ads.zzat r10 = r10.zzd
            r11.zzb(r10)
            com.google.android.gms.internal.ads.zzat r10 = r11.zzw()
        L_0x0176:
            com.google.android.gms.internal.ads.zzat r11 = r0.zzI
            boolean r11 = r10.equals(r11)
            r12 = 1
            r11 = r11 ^ r12
            r0.zzI = r10
            boolean r10 = r9.zzl
            boolean r12 = r1.zzl
            if (r10 == r12) goto L_0x0188
            r10 = 1
            goto L_0x0189
        L_0x0188:
            r10 = 0
        L_0x0189:
            int r12 = r9.zze
            int r13 = r1.zze
            if (r12 == r13) goto L_0x0191
            r12 = 1
            goto L_0x0192
        L_0x0191:
            r12 = 0
        L_0x0192:
            if (r12 != 0) goto L_0x0196
            if (r10 == 0) goto L_0x0199
        L_0x0196:
            r43.zzah()
        L_0x0199:
            boolean r13 = r9.zzg
            boolean r14 = r1.zzg
            if (r13 == r14) goto L_0x01a1
            r13 = 1
            goto L_0x01a2
        L_0x01a1:
            r13 = 0
        L_0x01a2:
            if (r6 == 0) goto L_0x01b1
            com.google.android.gms.internal.ads.zzdz r6 = r0.zzm
            com.google.android.gms.internal.ads.zziz r14 = new com.google.android.gms.internal.ads.zziz
            r15 = r45
            r14.<init>(r1, r15)
            r15 = 0
            r6.zzd(r15, r14)
        L_0x01b1:
            if (r2 == 0) goto L_0x02d2
            com.google.android.gms.internal.ads.zzbj r2 = new com.google.android.gms.internal.ads.zzbj
            r2.<init>()
            boolean r14 = r18.zzo()
            if (r14 != 0) goto L_0x01e8
            com.google.android.gms.internal.ads.zzvh r14 = r9.zzb
            java.lang.Object r14 = r14.zza
            r15 = r18
            r15.zzn(r14, r2)
            int r8 = r2.zzc
            int r18 = r15.zza(r14)
            com.google.android.gms.internal.ads.zzbk r6 = r0.zza
            r47 = r12
            r19 = r13
            r12 = 0
            com.google.android.gms.internal.ads.zzbk r15 = r15.zze(r8, r6, r12)
            java.lang.Object r12 = r15.zzb
            com.google.android.gms.internal.ads.zzap r6 = r6.zzd
            r23 = r6
            r22 = r8
            r21 = r12
            r24 = r14
            r25 = r18
            goto L_0x01f6
        L_0x01e8:
            r47 = r12
            r19 = r13
            r22 = r50
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = -1
        L_0x01f6:
            if (r3 != 0) goto L_0x021c
            com.google.android.gms.internal.ads.zzvh r6 = r9.zzb
            boolean r8 = r6.zzb()
            if (r8 == 0) goto L_0x020d
            int r8 = r6.zzb
            int r6 = r6.zzc
            long r12 = r2.zzf(r8, r6)
            long r14 = zzV(r9)
            goto L_0x022e
        L_0x020d:
            int r6 = r6.zze
            r8 = -1
            if (r6 == r8) goto L_0x0219
            com.google.android.gms.internal.ads.zzls r2 = r0.zzU
            long r12 = zzV(r2)
            goto L_0x022d
        L_0x0219:
            long r12 = r2.zzd
            goto L_0x022d
        L_0x021c:
            com.google.android.gms.internal.ads.zzvh r2 = r9.zzb
            boolean r2 = r2.zzb()
            if (r2 == 0) goto L_0x022b
            long r12 = r9.zzs
            long r14 = zzV(r9)
            goto L_0x022e
        L_0x022b:
            long r12 = r9.zzs
        L_0x022d:
            r14 = r12
        L_0x022e:
            com.google.android.gms.internal.ads.zzbf r2 = new com.google.android.gms.internal.ads.zzbf
            java.lang.String r6 = com.google.android.gms.internal.ads.zzex.zza
            com.google.android.gms.internal.ads.zzvh r6 = r9.zzb
            int r8 = r6.zzb
            int r6 = r6.zzc
            long r26 = com.google.android.gms.internal.ads.zzex.zzv(r12)
            long r28 = com.google.android.gms.internal.ads.zzex.zzv(r14)
            r20 = r2
            r30 = r8
            r31 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r28, r30, r31)
            int r6 = r43.zze()
            com.google.android.gms.internal.ads.zzls r8 = r0.zzU
            com.google.android.gms.internal.ads.zzbl r8 = r8.zza
            boolean r8 = r8.zzo()
            if (r8 != 0) goto L_0x0288
            com.google.android.gms.internal.ads.zzls r8 = r0.zzU
            com.google.android.gms.internal.ads.zzvh r12 = r8.zzb
            java.lang.Object r12 = r12.zza
            com.google.android.gms.internal.ads.zzbl r8 = r8.zza
            com.google.android.gms.internal.ads.zzbj r13 = r0.zzo
            r8.zzn(r12, r13)
            com.google.android.gms.internal.ads.zzls r8 = r0.zzU
            com.google.android.gms.internal.ads.zzbl r8 = r8.zza
            int r8 = r8.zza(r12)
            com.google.android.gms.internal.ads.zzls r13 = r0.zzU
            com.google.android.gms.internal.ads.zzbl r13 = r13.zza
            com.google.android.gms.internal.ads.zzbk r14 = r0.zza
            r18 = r10
            r15 = r11
            r10 = 0
            com.google.android.gms.internal.ads.zzbk r13 = r13.zze(r6, r14, r10)
            java.lang.Object r10 = r13.zzb
            com.google.android.gms.internal.ads.zzap r11 = r14.zzd
            r35 = r8
            r31 = r10
            r33 = r11
            r34 = r12
            goto L_0x0293
        L_0x0288:
            r18 = r10
            r15 = r11
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = -1
        L_0x0293:
            long r36 = com.google.android.gms.internal.ads.zzex.zzv(r48)
            com.google.android.gms.internal.ads.zzbf r8 = new com.google.android.gms.internal.ads.zzbf
            com.google.android.gms.internal.ads.zzls r10 = r0.zzU
            com.google.android.gms.internal.ads.zzvh r10 = r10.zzb
            boolean r10 = r10.zzb()
            if (r10 == 0) goto L_0x02b0
            com.google.android.gms.internal.ads.zzls r10 = r0.zzU
            long r10 = zzV(r10)
            long r10 = com.google.android.gms.internal.ads.zzex.zzv(r10)
            r38 = r10
            goto L_0x02b2
        L_0x02b0:
            r38 = r36
        L_0x02b2:
            com.google.android.gms.internal.ads.zzls r10 = r0.zzU
            com.google.android.gms.internal.ads.zzvh r10 = r10.zzb
            int r11 = r10.zzb
            int r10 = r10.zzc
            r30 = r8
            r32 = r6
            r40 = r11
            r41 = r10
            r30.<init>(r31, r32, r33, r34, r35, r36, r38, r40, r41)
            com.google.android.gms.internal.ads.zzdz r6 = r0.zzm
            com.google.android.gms.internal.ads.zzjs r10 = new com.google.android.gms.internal.ads.zzjs
            r10.<init>(r3, r2, r8)
            r2 = 11
            r6.zzd(r2, r10)
            goto L_0x02d9
        L_0x02d2:
            r18 = r10
            r15 = r11
            r47 = r12
            r19 = r13
        L_0x02d9:
            if (r4 == 0) goto L_0x02e7
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzm
            com.google.android.gms.internal.ads.zzjt r3 = new com.google.android.gms.internal.ads.zzjt
            r3.<init>(r5, r7)
            r7 = 1
            r2.zzd(r7, r3)
            goto L_0x02e8
        L_0x02e7:
            r7 = 1
        L_0x02e8:
            com.google.android.gms.internal.ads.zzin r2 = r9.zzf
            com.google.android.gms.internal.ads.zzin r3 = r1.zzf
            r4 = 10
            if (r2 == r3) goto L_0x0304
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzm
            com.google.android.gms.internal.ads.zzju r5 = new com.google.android.gms.internal.ads.zzju
            r5.<init>(r1)
            r2.zzd(r4, r5)
            if (r3 == 0) goto L_0x0304
            com.google.android.gms.internal.ads.zzjv r3 = new com.google.android.gms.internal.ads.zzjv
            r3.<init>(r1)
            r2.zzd(r4, r3)
        L_0x0304:
            com.google.android.gms.internal.ads.zzze r2 = r9.zzi
            com.google.android.gms.internal.ads.zzze r3 = r1.zzi
            if (r2 == r3) goto L_0x031c
            com.google.android.gms.internal.ads.zzzd r2 = r0.zzj
            java.lang.Object r3 = r3.zze
            r2.zzp(r3)
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzm
            com.google.android.gms.internal.ads.zzjw r3 = new com.google.android.gms.internal.ads.zzjw
            r3.<init>(r1)
            r5 = 2
            r2.zzd(r5, r3)
        L_0x031c:
            if (r15 == 0) goto L_0x032c
            com.google.android.gms.internal.ads.zzat r2 = r0.zzI
            com.google.android.gms.internal.ads.zzdz r3 = r0.zzm
            com.google.android.gms.internal.ads.zzja r5 = new com.google.android.gms.internal.ads.zzja
            r5.<init>(r2)
            r2 = 14
            r3.zzd(r2, r5)
        L_0x032c:
            if (r19 == 0) goto L_0x0339
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzm
            com.google.android.gms.internal.ads.zzjb r3 = new com.google.android.gms.internal.ads.zzjb
            r3.<init>(r1)
            r5 = 3
            r2.zzd(r5, r3)
        L_0x0339:
            if (r47 != 0) goto L_0x033d
            if (r18 == 0) goto L_0x0348
        L_0x033d:
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzm
            com.google.android.gms.internal.ads.zzjc r3 = new com.google.android.gms.internal.ads.zzjc
            r3.<init>(r1)
            r5 = -1
            r2.zzd(r5, r3)
        L_0x0348:
            r2 = 4
            if (r47 == 0) goto L_0x0355
            com.google.android.gms.internal.ads.zzdz r3 = r0.zzm
            com.google.android.gms.internal.ads.zzjd r5 = new com.google.android.gms.internal.ads.zzjd
            r5.<init>(r1)
            r3.zzd(r2, r5)
        L_0x0355:
            r3 = 5
            if (r18 != 0) goto L_0x035e
            int r5 = r9.zzm
            int r6 = r1.zzm
            if (r5 == r6) goto L_0x0368
        L_0x035e:
            com.google.android.gms.internal.ads.zzdz r5 = r0.zzm
            com.google.android.gms.internal.ads.zzjh r6 = new com.google.android.gms.internal.ads.zzjh
            r6.<init>(r1)
            r5.zzd(r3, r6)
        L_0x0368:
            int r5 = r9.zzn
            int r6 = r1.zzn
            r8 = 6
            if (r5 == r6) goto L_0x0379
            com.google.android.gms.internal.ads.zzdz r5 = r0.zzm
            com.google.android.gms.internal.ads.zzjn r6 = new com.google.android.gms.internal.ads.zzjn
            r6.<init>(r1)
            r5.zzd(r8, r6)
        L_0x0379:
            boolean r5 = r9.zzj()
            boolean r6 = r44.zzj()
            r10 = 7
            if (r5 == r6) goto L_0x038e
            com.google.android.gms.internal.ads.zzdz r5 = r0.zzm
            com.google.android.gms.internal.ads.zzjq r6 = new com.google.android.gms.internal.ads.zzjq
            r6.<init>(r1)
            r5.zzd(r10, r6)
        L_0x038e:
            com.google.android.gms.internal.ads.zzbb r5 = r9.zzo
            com.google.android.gms.internal.ads.zzbb r6 = r1.zzo
            boolean r5 = r5.equals(r6)
            r6 = 12
            if (r5 != 0) goto L_0x03a4
            com.google.android.gms.internal.ads.zzdz r5 = r0.zzm
            com.google.android.gms.internal.ads.zzjr r11 = new com.google.android.gms.internal.ads.zzjr
            r11.<init>(r1)
            r5.zzd(r6, r11)
        L_0x03a4:
            com.google.android.gms.internal.ads.zzbd r5 = r0.zzH
            com.google.android.gms.internal.ads.zzbh r11 = r0.zzg
            com.google.android.gms.internal.ads.zzbd r12 = r0.zzc
            java.lang.String r13 = com.google.android.gms.internal.ads.zzex.zza
            boolean r13 = r11.zzx()
            r14 = r11
            com.google.android.gms.internal.ads.zzg r14 = (com.google.android.gms.internal.ads.zzg) r14
            com.google.android.gms.internal.ads.zzbl r15 = r14.zzo()
            boolean r17 = r15.zzo()
            if (r17 != 0) goto L_0x03d1
            int r7 = r14.zze()
            com.google.android.gms.internal.ads.zzbk r6 = r14.zza
            r17 = r5
            r4 = 0
            com.google.android.gms.internal.ads.zzbk r6 = r15.zze(r7, r6, r4)
            boolean r4 = r6.zzh
            if (r4 == 0) goto L_0x03d3
            r7 = 1
            goto L_0x03d4
        L_0x03d1:
            r17 = r5
        L_0x03d3:
            r7 = 0
        L_0x03d4:
            com.google.android.gms.internal.ads.zzbl r4 = r14.zzo()
            boolean r5 = r4.zzo()
            if (r5 == 0) goto L_0x03e3
            r5 = -1
            r6 = 0
            r16 = 0
            goto L_0x03fa
        L_0x03e3:
            int r5 = r14.zze()
            r14.zzi()
            r14.zzw()
            r6 = 0
            int r4 = r4.zzk(r5, r6, r6)
            r5 = -1
            if (r4 == r5) goto L_0x03f8
            r16 = 1
            goto L_0x03fa
        L_0x03f8:
            r16 = r6
        L_0x03fa:
            com.google.android.gms.internal.ads.zzbl r4 = r14.zzo()
            boolean r15 = r4.zzo()
            if (r15 == 0) goto L_0x0406
        L_0x0404:
            r4 = r6
            goto L_0x0417
        L_0x0406:
            int r15 = r14.zze()
            r14.zzi()
            r14.zzw()
            int r4 = r4.zzj(r15, r6, r6)
            if (r4 == r5) goto L_0x0404
            r4 = 1
        L_0x0417:
            com.google.android.gms.internal.ads.zzbl r5 = r14.zzo()
            boolean r15 = r5.zzo()
            if (r15 != 0) goto L_0x0437
            int r15 = r14.zze()
            com.google.android.gms.internal.ads.zzbk r6 = r14.zza
            r18 = r9
            r8 = 0
            com.google.android.gms.internal.ads.zzbk r5 = r5.zze(r15, r6, r8)
            boolean r5 = r5.zzb()
            if (r5 == 0) goto L_0x043b
            r5 = 1
            goto L_0x043c
        L_0x0437:
            r18 = r9
            r8 = 0
        L_0x043b:
            r5 = 0
        L_0x043c:
            com.google.android.gms.internal.ads.zzbl r6 = r14.zzo()
            boolean r15 = r6.zzo()
            if (r15 != 0) goto L_0x0456
            int r15 = r14.zze()
            com.google.android.gms.internal.ads.zzbk r14 = r14.zza
            com.google.android.gms.internal.ads.zzbk r6 = r6.zze(r15, r14, r8)
            boolean r6 = r6.zzi
            if (r6 == 0) goto L_0x0456
            r6 = 1
            goto L_0x0457
        L_0x0456:
            r6 = 0
        L_0x0457:
            com.google.android.gms.internal.ads.zzbl r8 = r11.zzo()
            boolean r8 = r8.zzo()
            com.google.android.gms.internal.ads.zzbc r9 = new com.google.android.gms.internal.ads.zzbc
            r9.<init>()
            r9.zzb(r12)
            r11 = r13 ^ 1
            r9.zzd(r2, r11)
            if (r7 == 0) goto L_0x0472
            if (r13 != 0) goto L_0x0472
            r2 = 1
            goto L_0x0473
        L_0x0472:
            r2 = 0
        L_0x0473:
            r9.zzd(r3, r2)
            if (r16 == 0) goto L_0x047c
            if (r13 != 0) goto L_0x047c
            r2 = 1
            goto L_0x047d
        L_0x047c:
            r2 = 0
        L_0x047d:
            r3 = 6
            r9.zzd(r3, r2)
            if (r8 != 0) goto L_0x048d
            if (r16 != 0) goto L_0x0489
            if (r5 == 0) goto L_0x0489
            if (r7 == 0) goto L_0x048d
        L_0x0489:
            if (r13 != 0) goto L_0x048d
            r2 = 1
            goto L_0x048e
        L_0x048d:
            r2 = 0
        L_0x048e:
            r9.zzd(r10, r2)
            if (r4 == 0) goto L_0x0497
            if (r13 != 0) goto L_0x0497
            r2 = 1
            goto L_0x0498
        L_0x0497:
            r2 = 0
        L_0x0498:
            r3 = 8
            r9.zzd(r3, r2)
            if (r8 != 0) goto L_0x04a9
            if (r4 != 0) goto L_0x04a5
            if (r5 == 0) goto L_0x04a9
            if (r6 == 0) goto L_0x04a9
        L_0x04a5:
            if (r13 != 0) goto L_0x04a9
            r2 = 1
            goto L_0x04aa
        L_0x04a9:
            r2 = 0
        L_0x04aa:
            r3 = 9
            r9.zzd(r3, r2)
            r2 = 10
            r9.zzd(r2, r11)
            if (r7 == 0) goto L_0x04ba
            if (r13 != 0) goto L_0x04ba
            r2 = 1
            goto L_0x04bb
        L_0x04ba:
            r2 = 0
        L_0x04bb:
            r3 = 11
            r9.zzd(r3, r2)
            if (r7 == 0) goto L_0x04c8
            if (r13 != 0) goto L_0x04c8
            r2 = 12
            r7 = 1
            goto L_0x04cb
        L_0x04c8:
            r2 = 12
            r7 = 0
        L_0x04cb:
            r9.zzd(r2, r7)
            com.google.android.gms.internal.ads.zzbd r2 = r9.zze()
            r0.zzH = r2
            r3 = r17
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x04e8
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzm
            com.google.android.gms.internal.ads.zzjp r3 = new com.google.android.gms.internal.ads.zzjp
            r3.<init>(r0)
            r4 = 13
            r2.zzd(r4, r3)
        L_0x04e8:
            com.google.android.gms.internal.ads.zzdz r2 = r0.zzm
            r2.zzc()
            r2 = r18
            boolean r2 = r2.zzp
            boolean r1 = r1.zzp
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzag(com.google.android.gms.internal.ads.zzls, int, boolean, int, long, int, boolean):void");
    }

    private final void zzah() {
        int zzg2 = zzg();
        if (zzg2 == 2 || zzg2 == 3) {
            zzai();
            boolean z = this.zzU.zzp;
            this.zzx.zza(zzv());
            this.zzy.zza(zzv());
            return;
        }
        this.zzx.zza(false);
        this.zzy.zza(false);
    }

    private final void zzai() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        Looper looper = this.zzs;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzex.zza;
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (!this.zzQ) {
                if (this.zzR) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzea.zzg("ExoPlayerImpl", format, illegalStateException);
                this.zzR = true;
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    public final void zzA() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzex.zza;
        String zza = zzaq.zza();
        zzea.zze("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.8.0-alpha01] [" + str + "] [" + zza + "]");
        zzai();
        this.zzx.zza(false);
        this.zzy.zza(false);
        if (!this.zzl.zzw()) {
            zzdz zzdz = this.zzm;
            zzdz.zzd(10, new zzjg());
            zzdz.zzc();
        }
        this.zzm.zze();
        this.zzk.zzf((Object) null);
        zzzl zzzl = this.zzt;
        zzmo zzmo = this.zzr;
        zzzl.zzg(zzmo);
        boolean z = this.zzU.zzp;
        zzls zzY2 = zzY(this.zzU, 1);
        this.zzU = zzY2;
        zzls zzb2 = zzY2.zzb(zzY2.zzb);
        this.zzU = zzb2;
        zzb2.zzq = zzb2.zzs;
        this.zzU.zzr = 0;
        zzmo.zzR();
        Surface surface = this.zzK;
        if (surface != null) {
            surface.release();
            this.zzK = null;
        }
        int i = zzcw.zza;
    }

    public final void zzB(zzmr zzmr) {
        zzai();
        zzmr zzmr2 = zzmr;
        this.zzr.zzS(zzmr);
    }

    public final void zzC(zzvj zzvj) {
        zzai();
        List singletonList = Collections.singletonList(zzvj);
        zzai();
        zzai();
        zzS(this.zzU);
        zzl();
        this.zzB++;
        List list = this.zzp;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = size - 1; i >= 0; i--) {
                list.remove(i);
            }
            this.zzY = this.zzY.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzlp zzlp = new zzlp((zzvj) singletonList.get(i2), this.zzq);
            arrayList.add(zzlp);
            list.add(i2, new zzkf(zzlp.zzb, zzlp.zza));
        }
        this.zzY = this.zzY.zzg(0, arrayList.size());
        zzly zzly = new zzly(list, this.zzY);
        if (zzly.zzo() || zzly.zzc() >= 0) {
            int zzg2 = zzly.zzg(false);
            zzls zzZ = zzZ(this.zzU, zzly, zzX(zzly, zzg2, -9223372036854775807L));
            int i3 = zzZ.zze;
            if (!(zzg2 == -1 || i3 == 1)) {
                i3 = 4;
                if (!zzly.zzo() && zzg2 < zzly.zzc()) {
                    i3 = 2;
                }
            }
            zzls zzY2 = zzY(zzZ, i3);
            this.zzl.zzy(arrayList, zzg2, zzex.zzs(-9223372036854775807L), this.zzY);
            zzag(zzY2, 0, !this.zzU.zzb.zza.equals(zzY2.zzb.zza) && !this.zzU.zza.zzo(), 4, zzU(zzY2), -1, false);
            return;
        }
        throw new zzaa(zzly, -1, -9223372036854775807L);
    }

    public final zzin zzF() {
        zzai();
        return this.zzU.zzf;
    }

    /* access modifiers changed from: protected */
    public final void zzb(int i, long j, int i2, boolean z) {
        zzai();
        if (i != -1) {
            zzdd.zzd(i >= 0);
            zzbl zzbl = this.zzU.zza;
            if (zzbl.zzo() || i < zzbl.zzc()) {
                this.zzr.zzv();
                this.zzB++;
                if (zzx()) {
                    zzea.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    zzkq zzkq = new zzkq(this.zzU);
                    zzkq.zza(1);
                    this.zzX.zza.zzab(zzkq);
                    return;
                }
                zzls zzls = this.zzU;
                int i3 = zzls.zze;
                if (i3 == 3 || (i3 == 4 && !zzbl.zzo())) {
                    zzls = zzY(this.zzU, 2);
                }
                int zze2 = zze();
                zzls zzZ = zzZ(zzls, zzbl, zzX(zzbl, i, j));
                this.zzl.zzo(zzbl, i, zzex.zzs(j));
                zzag(zzZ, 0, true, 1, zzU(zzZ), zze2, false);
            }
        }
    }

    public final int zzc() {
        zzai();
        if (zzx()) {
            return this.zzU.zzb.zzb;
        }
        return -1;
    }

    public final int zzd() {
        zzai();
        if (zzx()) {
            return this.zzU.zzb.zzc;
        }
        return -1;
    }

    public final int zze() {
        zzai();
        int zzS2 = zzS(this.zzU);
        if (zzS2 == -1) {
            return 0;
        }
        return zzS2;
    }

    public final int zzf() {
        zzai();
        if (this.zzU.zza.zzo()) {
            return 0;
        }
        zzls zzls = this.zzU;
        return zzls.zza.zza(zzls.zzb.zza);
    }

    public final int zzg() {
        zzai();
        return this.zzU.zze;
    }

    public final int zzh() {
        zzai();
        return this.zzU.zzn;
    }

    public final int zzi() {
        zzai();
        return 0;
    }

    public final long zzj() {
        zzai();
        if (zzx()) {
            zzls zzls = this.zzU;
            if (zzls.zzk.equals(zzls.zzb)) {
                return zzex.zzv(this.zzU.zzq);
            }
            return zzm();
        }
        zzai();
        if (this.zzU.zza.zzo()) {
            return this.zzW;
        }
        zzls zzls2 = this.zzU;
        long j = 0;
        if (zzls2.zzk.zzd != zzls2.zzb.zzd) {
            return zzex.zzv(zzls2.zza.zze(zze(), this.zza, 0).zzm);
        }
        long j2 = zzls2.zzq;
        if (this.zzU.zzk.zzb()) {
            zzls zzls3 = this.zzU;
            zzls3.zza.zzn(zzls3.zzk.zza, this.zzo).zzg(this.zzU.zzk.zzb);
        } else {
            j = j2;
        }
        zzls zzls4 = this.zzU;
        zzW(zzls4.zza, zzls4.zzk, j);
        return zzex.zzv(j);
    }

    public final long zzk() {
        zzai();
        return zzT(this.zzU);
    }

    public final long zzl() {
        zzai();
        return zzex.zzv(zzU(this.zzU));
    }

    public final long zzm() {
        zzai();
        if (!zzx()) {
            zzbl zzo2 = zzo();
            if (zzo2.zzo()) {
                return -9223372036854775807L;
            }
            return zzex.zzv(zzo2.zze(zze(), this.zza, 0).zzm);
        }
        zzls zzls = this.zzU;
        zzvh zzvh = zzls.zzb;
        zzbl zzbl = zzls.zza;
        Object obj = zzvh.zza;
        zzbj zzbj = this.zzo;
        zzbl.zzn(obj, zzbj);
        return zzex.zzv(zzbj.zzf(zzvh.zzb, zzvh.zzc));
    }

    public final long zzn() {
        zzai();
        return zzex.zzv(this.zzU.zzr);
    }

    public final zzbl zzo() {
        zzai();
        return this.zzU.zza;
    }

    public final zzbt zzp() {
        zzai();
        return this.zzU.zzi.zzd;
    }

    public final void zzq() {
        zzai();
        zzls zzls = this.zzU;
        if (zzls.zze == 1) {
            zzls zze2 = zzls.zze((zzin) null);
            zzls zzY2 = zzY(zze2, true != zze2.zza.zzo() ? 2 : 4);
            this.zzB++;
            this.zzl.zzn();
            zzag(zzY2, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void zzr(boolean z) {
        zzai();
        zzls zzls = this.zzU;
        int i = zzls.zzn;
        int i2 = 0;
        if (i == 1) {
            if (!z) {
                i = 1;
                i2 = 1;
            } else {
                i = 1;
            }
        }
        if (zzls.zzl != z || i != i2 || zzls.zzm != 1) {
            this.zzB++;
            boolean z2 = zzls.zzp;
            zzls zzd2 = zzls.zzd(z, 1, i2);
            this.zzl.zzr(z, 1, i2);
            zzag(zzd2, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void zzs(Surface surface) {
        zzai();
        zzae(surface);
        int i = surface == null ? 0 : -1;
        zzac(i, i);
    }

    public final void zzt(float f) {
        zzai();
        String str = zzex.zza;
        float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzO != max) {
            this.zzO = max;
            this.zzl.zzt(max);
            zzdz zzdz = this.zzm;
            zzdz.zzd(22, new zzje(max));
            zzdz.zzc();
        }
    }

    public final void zzu() {
        zzai();
        zzaf((zzin) null);
        new zzcw(zzfyq.zzn(), this.zzU.zzs);
    }

    public final boolean zzv() {
        zzai();
        return this.zzU.zzl;
    }

    public final boolean zzw() {
        zzai();
        return false;
    }

    public final boolean zzx() {
        zzai();
        return this.zzU.zzb.zzb();
    }

    public final int zzy() {
        zzai();
        int length = this.zzh.length;
        return 2;
    }

    public final void zzz(zzmr zzmr) {
        zzmr zzmr2 = zzmr;
        this.zzr.zzu(zzmr);
    }
}
