package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzwl implements zzvf, zzady, zzzs, zzzw, zzww {
    /* access modifiers changed from: private */
    public static final Map zzb;
    /* access modifiers changed from: private */
    public static final zzz zzc;
    private zzaeu zzA;
    /* access modifiers changed from: private */
    public long zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    /* access modifiers changed from: private */
    public boolean zzI;
    private long zzJ;
    private long zzK;
    private boolean zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzzm zzP;
    private final Uri zzd;
    private final zzgj zze;
    private final zzsh zzf;
    private final zzvr zzg;
    private final zzsc zzh;
    private final zzwh zzi;
    /* access modifiers changed from: private */
    public final long zzj;
    private final long zzk;
    private final zzaaa zzl = new zzaaa("ProgressiveMediaPeriod");
    private final zzwa zzm;
    private final zzdm zzn;
    private final Runnable zzo;
    /* access modifiers changed from: private */
    public final Runnable zzp;
    /* access modifiers changed from: private */
    public final Handler zzq;
    private zzve zzr;
    /* access modifiers changed from: private */
    public zzagv zzs;
    private zzwy[] zzt;
    private zzwj[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzwk zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzx zzx2 = new zzx();
        zzx2.zzS("icy");
        zzx2.zzah("application/x-icy");
        zzc = zzx2.zzan();
    }

    public zzwl(Uri uri, zzgj zzgj, zzwa zzwa, zzsh zzsh, zzsc zzsc, zzzq zzzq, zzvr zzvr, zzwh zzwh, zzzm zzzm, String str, int i, int i2, zzz zzz2, long j, zzaai zzaai) {
        this.zzd = uri;
        this.zze = zzgj;
        this.zzf = zzsh;
        this.zzh = zzsc;
        this.zzg = zzvr;
        this.zzi = zzwh;
        this.zzP = zzzm;
        this.zzj = (long) i;
        this.zzm = zzwa;
        this.zzk = j;
        this.zzn = new zzdm(zzdj.zza);
        this.zzo = new zzwc(this);
        this.zzp = new zzwd(this);
        this.zzq = zzex.zzy((Handler.Callback) null);
        this.zzu = new zzwj[0];
        this.zzt = new zzwy[0];
        this.zzK = -9223372036854775807L;
        this.zzD = 1;
    }

    private final int zzR() {
        int i = 0;
        for (zzwy zzd2 : this.zzt) {
            i += zzd2.zzd();
        }
        return i;
    }

    /* access modifiers changed from: private */
    public final long zzS(boolean z) {
        int i = 0;
        long j = Long.MIN_VALUE;
        while (true) {
            zzwy[] zzwyArr = this.zzt;
            if (i >= zzwyArr.length) {
                return j;
            }
            if (!z) {
                zzwk zzwk = this.zzz;
                zzwk.getClass();
                zzwk zzwk2 = zzwk;
                if (!zzwk.zzc[i]) {
                    i++;
                }
            }
            j = Math.max(j, zzwyArr[i].zzh());
            i++;
        }
    }

    private final zzafb zzT(zzwj zzwj) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzwj.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        if (this.zzv) {
            int i2 = zzwj.zza;
            zzea.zzf("ProgressiveMediaPeriod", "Extractor added new track (id=" + i2 + ") after finishing tracks.");
            return new zzadr();
        }
        zzzm zzzm = this.zzP;
        zzsh zzsh = this.zzf;
        zzsc zzsc = this.zzh;
        zzsh zzsh2 = zzsh;
        zzsc zzsc2 = zzsc;
        zzwy zzwy = new zzwy(zzzm, zzsh, zzsc);
        zzwy.zzv(this);
        int i3 = length + 1;
        zzwj[] zzwjArr = (zzwj[]) Arrays.copyOf(this.zzu, i3);
        zzwjArr[length] = zzwj;
        String str = zzex.zza;
        this.zzu = zzwjArr;
        zzwy[] zzwyArr = (zzwy[]) Arrays.copyOf(this.zzt, i3);
        zzwyArr[length] = zzwy;
        this.zzt = zzwyArr;
        return zzwy;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzU() {
        zzdd.zzf(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    /* access modifiers changed from: private */
    public final void zzV() {
        int i;
        zzav zzav;
        if (!this.zzO && !this.zzw && this.zzv && this.zzA != null) {
            zzwy[] zzwyArr = this.zzt;
            int length = zzwyArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (zzwyArr[i2].zzi() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.zzn.zzd();
            int length2 = this.zzt.length;
            zzbm[] zzbmArr = new zzbm[length2];
            boolean[] zArr = new boolean[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                zzz zzi2 = this.zzt[i3].zzi();
                zzi2.getClass();
                zzz zzz2 = zzi2;
                String str = zzi2.zzo;
                boolean zzh2 = zzay.zzh(str);
                boolean z = zzh2 || zzay.zzj(str);
                zArr[i3] = z;
                this.zzx = z | this.zzx;
                this.zzy = this.zzk != -9223372036854775807L && length2 == 1 && zzay.zzi(str);
                zzagv zzagv = this.zzs;
                if (zzagv != null) {
                    if (zzh2 || this.zzu[i3].zzb) {
                        zzav zzav2 = zzi2.zzl;
                        if (zzav2 == null) {
                            zzav = new zzav(-9223372036854775807L, zzagv);
                        } else {
                            zzav = zzav2.zzc(zzagv);
                        }
                        zzx zzb2 = zzi2.zzb();
                        zzb2.zzaa(zzav);
                        zzi2 = zzb2.zzan();
                    }
                    if (zzh2 && zzi2.zzh == -1 && zzi2.zzi == -1 && (i = zzagv.zza) != -1) {
                        zzx zzb3 = zzi2.zzb();
                        zzb3.zzC(i);
                        zzi2 = zzb3.zzan();
                    }
                }
                zzz zzc2 = zzi2.zzc(this.zzf.zza(zzi2));
                zzbmArr[i3] = new zzbm(Integer.toString(i3), zzc2);
                this.zzG = zzc2.zzu | this.zzG;
            }
            this.zzz = new zzwk(new zzxk(zzbmArr), zArr);
            if (this.zzy && this.zzB == -9223372036854775807L) {
                this.zzB = this.zzk;
                this.zzA = new zzwf(this, this.zzA);
            }
            this.zzi.zza(this.zzB, this.zzA, this.zzC);
            this.zzw = true;
            zzve zzve = this.zzr;
            zzve.getClass();
            zzve zzve2 = zzve;
            zzve.zzl(this);
        }
    }

    private final void zzW(int i) {
        zzU();
        zzwk zzwk = this.zzz;
        boolean[] zArr = zzwk.zzd;
        if (!zArr[i]) {
            zzz zzb2 = zzwk.zza.zzb(i).zzb(0);
            this.zzg.zzd(new zzvd(1, zzay.zzb(zzb2.zzo), zzb2, 0, (Object) null, zzex.zzv(this.zzJ), -9223372036854775807L));
            zArr[i] = true;
        }
    }

    private final void zzX(int i) {
        zzU();
        if (!this.zzL) {
            return;
        }
        if ((!this.zzx || this.zzz.zzb[i]) && !this.zzt[i].zzy(false)) {
            this.zzK = 0;
            this.zzL = false;
            this.zzF = true;
            this.zzJ = 0;
            this.zzM = 0;
            for (zzwy zzq2 : this.zzt) {
                zzq2.zzq(false);
            }
            zzve zzve = this.zzr;
            zzve.getClass();
            zzve zzve2 = zzve;
            zzve.zzj(this);
        }
    }

    private final void zzY() {
        zzwg zzwg = new zzwg(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzdd.zzf(zzZ());
            long j = this.zzB;
            if (j == -9223372036854775807L || this.zzK <= j) {
                zzaeu zzaeu = this.zzA;
                zzaeu.getClass();
                zzaeu zzaeu2 = zzaeu;
                zzwg.zzf(zzwg, zzaeu.zzg(this.zzK).zza.zzc, this.zzK);
                for (zzwy zzu2 : this.zzt) {
                    zzu2.zzu(this.zzK);
                }
                this.zzK = -9223372036854775807L;
            } else {
                this.zzN = true;
                this.zzK = -9223372036854775807L;
                return;
            }
        }
        this.zzM = zzR();
        this.zzl.zza(zzwg, this, zzzq.zza(this.zzD));
    }

    private final boolean zzZ() {
        return this.zzK != -9223372036854775807L;
    }

    private final boolean zzaa() {
        return this.zzF || zzZ();
    }

    public final void zzG() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    /* access modifiers changed from: package-private */
    public final void zzH() throws IOException {
        this.zzl.zzi(zzzq.zza(this.zzD));
    }

    /* access modifiers changed from: package-private */
    public final void zzI(int i) throws IOException {
        this.zzt[i].zzn();
        zzH();
    }

    public final /* bridge */ /* synthetic */ void zzJ(zzzv zzzv, long j, long j2, boolean z) {
        zzwg zzwg = (zzwg) zzzv;
        zzhi zze2 = zzwg.zzd;
        zzuy zzuy = new zzuy(zzwg.zzb, zzwg.zzl, zze2.zzh(), zze2.zzi(), j, j2, zze2.zzg());
        long unused = zzwg.zzb;
        long zzc2 = zzwg.zzk;
        long j3 = this.zzB;
        long zzv2 = zzex.zzv(zzc2);
        long zzv3 = zzex.zzv(j3);
        zzvd zzvd = r5;
        zzvd zzvd2 = new zzvd(1, -1, (zzz) null, 0, (Object) null, zzv2, zzv3);
        this.zzg.zze(zzuy, zzvd);
        if (!z) {
            for (zzwy zzq2 : this.zzt) {
                zzq2.zzq(false);
            }
            if (this.zzH > 0) {
                zzve zzve = this.zzr;
                zzve.getClass();
                zzve zzve2 = zzve;
                zzve.zzj(this);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzK(zzzv zzzv, long j, long j2) {
        zzwg zzwg = (zzwg) zzzv;
        if (this.zzB == -9223372036854775807L && this.zzA != null) {
            long zzS = zzS(true);
            long j3 = zzS == Long.MIN_VALUE ? 0 : zzS + 10000;
            this.zzB = j3;
            this.zzi.zza(j3, this.zzA, this.zzC);
        }
        zzhi zze2 = zzwg.zzd;
        long zzb2 = zzwg.zzb;
        zzgo zzd2 = zzwg.zzl;
        Uri zzh2 = zze2.zzh();
        Map zzi2 = zze2.zzi();
        long zzg2 = zze2.zzg();
        zzuy zzuy = r4;
        zzuy zzuy2 = new zzuy(zzb2, zzd2, zzh2, zzi2, j, j2, zzg2);
        long unused = zzwg.zzb;
        this.zzg.zzf(zzuy, new zzvd(1, -1, (zzz) null, 0, (Object) null, zzex.zzv(zzwg.zzk), zzex.zzv(this.zzB)));
        this.zzN = true;
        zzve zzve = this.zzr;
        zzve.getClass();
        zzve zzve2 = zzve;
        zzve.zzj(this);
    }

    public final /* bridge */ /* synthetic */ void zzL(zzzv zzzv, long j, long j2, int i) {
        zzuy zzuy;
        int i2 = i;
        zzwg zzwg = (zzwg) zzzv;
        zzhi zze2 = zzwg.zzd;
        if (i2 == 0) {
            zzuy = new zzuy(zzwg.zzb, zzwg.zzl, j);
        } else {
            zzuy = new zzuy(zzwg.zzb, zzwg.zzl, zze2.zzh(), zze2.zzi(), j, j2, zze2.zzg());
        }
        this.zzg.zzh(zzuy, new zzvd(1, -1, (zzz) null, 0, (Object) null, zzex.zzv(zzwg.zzk), zzex.zzv(this.zzB)), i2);
    }

    public final void zzM() {
        for (zzwy zzp2 : this.zzt) {
            zzp2.zzp();
        }
        this.zzm.zze();
    }

    public final void zzN(zzz zzz2) {
        this.zzq.post(this.zzo);
    }

    public final void zzO() {
        if (this.zzw) {
            for (zzwy zzo2 : this.zzt) {
                zzo2.zzo();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages((Object) null);
        this.zzr = null;
        this.zzO = true;
    }

    public final void zzP(zzaeu zzaeu) {
        this.zzq.post(new zzwe(this, zzaeu));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzQ(int i) {
        return !zzaa() && this.zzt[i].zzy(this.zzN);
    }

    public final long zza(long j, zzmi zzmi) {
        long j2 = j;
        zzmi zzmi2 = zzmi;
        zzU();
        if (!this.zzA.zzh()) {
            return 0;
        }
        zzaes zzg2 = this.zzA.zzg(j2);
        zzaev zzaev = zzg2.zza;
        zzaev zzaev2 = zzg2.zzb;
        long j3 = zzmi2.zzc;
        if (j3 == 0) {
            if (zzmi2.zzd == 0) {
                return j2;
            }
            j3 = 0;
        }
        long j4 = zzaev.zzb;
        String str = zzex.zza;
        long j5 = j2 - j3;
        long j6 = zzmi2.zzd;
        long j7 = j2 + j6;
        long j8 = j2 ^ j7;
        long j9 = j6 ^ j7;
        if (((j2 ^ j3) & (j2 ^ j5)) < 0) {
            j5 = Long.MIN_VALUE;
        }
        if ((j8 & j9) < 0) {
            j7 = LongCompanionObject.MAX_VALUE;
        }
        boolean z = true;
        boolean z2 = j5 <= j4 && j4 <= j7;
        long j10 = zzaev2.zzb;
        if (j5 > j10 || j10 > j7) {
            z = false;
        }
        if (z2 && z) {
            if (Math.abs(j4 - j2) > Math.abs(j10 - j2)) {
                return j10;
            }
        } else if (!z2) {
            return z ? j10 : j5;
        }
        return j4;
    }

    public final long zzb() {
        long j;
        zzU();
        if (this.zzN || this.zzH == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzK;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzwk zzwk = this.zzz;
                if (zzwk.zzb[i] && zzwk.zzc[i] && !this.zzt[i].zzx()) {
                    j = Math.min(j, this.zzt[i].zzh());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            j = zzS(false);
        }
        return j == Long.MIN_VALUE ? this.zzJ : j;
    }

    public final long zzc() {
        return zzb();
    }

    public final long zzd() {
        if (this.zzG) {
            this.zzG = false;
        } else if (!this.zzF) {
            return -9223372036854775807L;
        } else {
            if (!this.zzN && zzR() <= this.zzM) {
                return -9223372036854775807L;
            }
            this.zzF = false;
        }
        return this.zzJ;
    }

    public final long zze(long j) {
        boolean z;
        zzU();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzh()) {
            j = 0;
        }
        this.zzF = false;
        long j2 = this.zzJ;
        this.zzJ = j;
        if (zzZ()) {
            this.zzK = j;
            return j;
        }
        if (this.zzD != 7 && (this.zzN || this.zzl.zzl())) {
            int length = this.zzt.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzwy zzwy = this.zzt[i];
                if (zzwy.zzb() != 0 || j2 != j) {
                    if (this.zzy) {
                        z = zzwy.zzz(zzwy.zza());
                    } else {
                        z = zzwy.zzA(j, this.zzN);
                    }
                    if (!z) {
                        if (zArr[i] || !this.zzx) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            }
        }
        this.zzL = false;
        this.zzK = j;
        this.zzN = false;
        this.zzG = false;
        zzaaa zzaaa = this.zzl;
        if (zzaaa.zzl()) {
            for (zzwy zzk2 : this.zzt) {
                zzk2.zzk();
            }
            zzaaa.zzg();
        } else {
            zzaaa.zzh();
            for (zzwy zzq2 : this.zzt) {
                zzq2.zzq(false);
            }
        }
        return j;
    }

    public final long zzf(zzyw[] zzywArr, boolean[] zArr, zzwz[] zzwzArr, boolean[] zArr2, long j) {
        boolean z;
        zzyw zzyw;
        zzU();
        zzwk zzwk = this.zzz;
        zzxk zzxk = zzwk.zza;
        boolean[] zArr3 = zzwk.zzc;
        int i = this.zzH;
        int i2 = 0;
        for (int i3 = 0; i3 < zzywArr.length; i3++) {
            zzwi zzwi = zzwzArr[i3];
            if (zzwi != null && (zzywArr[i3] == null || !zArr[i3])) {
                int zzc2 = zzwi.zzb;
                zzdd.zzf(zArr3[zzc2]);
                this.zzH--;
                zArr3[zzc2] = false;
                zzwzArr[i3] = null;
            }
        }
        if (!this.zzE ? j == 0 || this.zzy : i != 0) {
            z = false;
        } else {
            z = true;
        }
        for (int i4 = 0; i4 < zzywArr.length; i4++) {
            if (zzwzArr[i4] == null && (zzyw = zzywArr[i4]) != null) {
                zzdd.zzf(zzyw.zzh() == 1);
                zzdd.zzf(zzyw.zze(0) == 0);
                int zza = zzxk.zza(zzyw.zzc());
                zzdd.zzf(!zArr3[zza]);
                this.zzH++;
                zArr3[zza] = true;
                this.zzG = zzyw.zzb().zzu | this.zzG;
                zzwzArr[i4] = new zzwi(this, zza);
                zArr2[i4] = true;
                if (!z) {
                    zzwy zzwy = this.zzt[zza];
                    z = zzwy.zzb() != 0 && !zzwy.zzA(j, true);
                }
            }
        }
        if (this.zzH == 0) {
            this.zzL = false;
            this.zzF = false;
            this.zzG = false;
            zzaaa zzaaa = this.zzl;
            if (zzaaa.zzl()) {
                zzwy[] zzwyArr = this.zzt;
                int length = zzwyArr.length;
                while (i2 < length) {
                    zzwyArr[i2].zzk();
                    i2++;
                }
                zzaaa.zzg();
            } else {
                this.zzN = false;
                for (zzwy zzq2 : this.zzt) {
                    zzq2.zzq(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i2 < zzwzArr.length) {
                if (zzwzArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzE = true;
        return j;
    }

    public final zzxk zzg() {
        zzU();
        return this.zzz.zza;
    }

    public final void zzh(long j, boolean z) {
        if (!this.zzy) {
            zzU();
            if (!zzZ()) {
                boolean[] zArr = this.zzz.zzc;
                int length = this.zzt.length;
                for (int i = 0; i < length; i++) {
                    this.zzt[i].zzj(j, false, zArr[i]);
                }
            }
        }
    }

    public final void zzi() throws IOException {
        zzH();
        if (this.zzN && !this.zzw) {
            throw zzaz.zza("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final int zzj(int i, zzkv zzkv, zzhs zzhs, int i2) {
        if (zzaa()) {
            return -3;
        }
        zzW(i);
        int zze2 = this.zzt[i].zze(zzkv, zzhs, i2, this.zzN);
        if (zze2 == -3) {
            zzX(i);
        }
        return zze2;
    }

    public final void zzk(zzve zzve, long j) {
        this.zzr = zzve;
        this.zzn.zzf();
        zzY();
    }

    /* access modifiers changed from: package-private */
    public final int zzl(int i, long j) {
        if (zzaa()) {
            return 0;
        }
        zzW(i);
        zzwy zzwy = this.zzt[i];
        int zzc2 = zzwy.zzc(j, this.zzN);
        zzwy.zzw(zzc2);
        if (zzc2 != 0) {
            return zzc2;
        }
        zzX(i);
        return 0;
    }

    public final void zzm(long j) {
    }

    public final boolean zzo(zzla zzla) {
        if (this.zzN) {
            return false;
        }
        zzaaa zzaaa = this.zzl;
        if (zzaaa.zzk() || this.zzL) {
            return false;
        }
        if (this.zzw && this.zzH == 0) {
            return false;
        }
        boolean zzf2 = this.zzn.zzf();
        if (zzaaa.zzl()) {
            return zzf2;
        }
        zzY();
        return true;
    }

    public final boolean zzp() {
        return this.zzl.zzl() && this.zzn.zze();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzzt zzu(com.google.android.gms.internal.ads.zzzv r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            r21 = this;
            r0 = r21
            r1 = r27
            r2 = r22
            com.google.android.gms.internal.ads.zzwg r2 = (com.google.android.gms.internal.ads.zzwg) r2
            com.google.android.gms.internal.ads.zzhi r3 = r2.zzd
            com.google.android.gms.internal.ads.zzuy r14 = new com.google.android.gms.internal.ads.zzuy
            long r5 = r2.zzb
            com.google.android.gms.internal.ads.zzgo r7 = r2.zzl
            android.net.Uri r8 = r3.zzh()
            java.util.Map r9 = r3.zzi()
            long r15 = r3.zzg()
            r4 = r14
            r10 = r23
            r12 = r25
            r3 = r14
            r14 = r15
            r4.<init>(r5, r7, r8, r9, r10, r12, r14)
            long unused = r2.zzk
            java.lang.String r4 = com.google.android.gms.internal.ads.zzex.zza
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzaz
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x0068
            boolean r4 = r1 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x0068
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzgz
            if (r4 != 0) goto L_0x0068
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzzy
            if (r4 != 0) goto L_0x0068
            r4 = r1
        L_0x0047:
            if (r4 == 0) goto L_0x005c
            boolean r7 = r4 instanceof com.google.android.gms.internal.ads.zzgk
            if (r7 == 0) goto L_0x0057
            r7 = r4
            com.google.android.gms.internal.ads.zzgk r7 = (com.google.android.gms.internal.ads.zzgk) r7
            int r7 = r7.zza
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x0057
            goto L_0x0068
        L_0x0057:
            java.lang.Throwable r4 = r4.getCause()
            goto L_0x0047
        L_0x005c:
            int r4 = r28 + -1
            int r4 = r4 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r4, r7)
            long r7 = (long) r4
            goto L_0x0069
        L_0x0068:
            r7 = r5
        L_0x0069:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r9 = 1
            if (r4 != 0) goto L_0x0071
            com.google.android.gms.internal.ads.zzzt r4 = com.google.android.gms.internal.ads.zzaaa.zzb
            goto L_0x00bd
        L_0x0071:
            int r4 = r21.zzR()
            int r10 = r0.zzM
            r11 = 0
            if (r4 <= r10) goto L_0x007c
            r10 = r9
            goto L_0x007d
        L_0x007c:
            r10 = r11
        L_0x007d:
            boolean r12 = r0.zzI
            if (r12 != 0) goto L_0x00b7
            com.google.android.gms.internal.ads.zzaeu r12 = r0.zzA
            if (r12 == 0) goto L_0x008e
            long r12 = r12.zza()
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x008e
            goto L_0x00b7
        L_0x008e:
            boolean r4 = r0.zzw
            if (r4 == 0) goto L_0x009d
            boolean r5 = r21.zzaa()
            if (r5 != 0) goto L_0x009d
            r0.zzL = r9
            com.google.android.gms.internal.ads.zzzt r4 = com.google.android.gms.internal.ads.zzaaa.zza
            goto L_0x00bd
        L_0x009d:
            r0.zzF = r4
            r4 = 0
            r0.zzJ = r4
            r0.zzM = r11
            com.google.android.gms.internal.ads.zzwy[] r6 = r0.zzt
            int r12 = r6.length
            r13 = r11
        L_0x00a9:
            if (r13 >= r12) goto L_0x00b3
            r14 = r6[r13]
            r14.zzq(r11)
            int r13 = r13 + 1
            goto L_0x00a9
        L_0x00b3:
            com.google.android.gms.internal.ads.zzwg.zzf(r2, r4, r4)
            goto L_0x00b9
        L_0x00b7:
            r0.zzM = r4
        L_0x00b9:
            com.google.android.gms.internal.ads.zzzt r4 = com.google.android.gms.internal.ads.zzaaa.zzb(r10, r7)
        L_0x00bd:
            boolean r5 = r4.zzc()
            r5 = r5 ^ r9
            com.google.android.gms.internal.ads.zzvr r6 = r0.zzg
            long r7 = r2.zzk
            long r9 = r0.zzB
            long r17 = com.google.android.gms.internal.ads.zzex.zzv(r7)
            long r19 = com.google.android.gms.internal.ads.zzex.zzv(r9)
            com.google.android.gms.internal.ads.zzvd r7 = new com.google.android.gms.internal.ads.zzvd
            r15 = 0
            r16 = 0
            r12 = 1
            r13 = -1
            r14 = 0
            r11 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r19)
            r6.zzg(r3, r7, r1, r5)
            if (r5 == 0) goto L_0x00e6
            long unused = r2.zzb
        L_0x00e6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwl.zzu(com.google.android.gms.internal.ads.zzzv, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzzt");
    }

    /* access modifiers changed from: package-private */
    public final zzafb zzv() {
        return zzT(new zzwj(0, true));
    }

    public final zzafb zzw(int i, int i2) {
        return zzT(new zzwj(i, false));
    }

    public static /* synthetic */ void zzA(zzwl zzwl) {
        if (!zzwl.zzO) {
            zzve zzve = zzwl.zzr;
            zzve.getClass();
            zzve zzve2 = zzve;
            zzve.zzj(zzwl);
        }
    }

    public static /* synthetic */ void zzC(zzwl zzwl, zzaeu zzaeu) {
        zzaeu zzaeu2;
        if (zzwl.zzs == null) {
            zzaeu2 = zzaeu;
        } else {
            zzaeu2 = new zzaet(-9223372036854775807L, 0);
        }
        zzwl.zzA = zzaeu2;
        zzwl.zzB = zzaeu.zza();
        boolean z = false;
        int i = 1;
        if (!zzwl.zzI && zzaeu.zza() == -9223372036854775807L) {
            z = true;
        }
        zzwl.zzC = z;
        if (true == z) {
            i = 7;
        }
        zzwl.zzD = i;
        if (zzwl.zzw) {
            zzwl.zzi.zza(zzwl.zzB, zzaeu, z);
        } else {
            zzwl.zzV();
        }
    }
}
