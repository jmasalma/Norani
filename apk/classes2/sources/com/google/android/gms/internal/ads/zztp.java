package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zztp extends zzic {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private zzti zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private boolean zzI;
    private long zzJ;
    private int zzK;
    private int zzL;
    private ByteBuffer zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private long zzZ;
    protected zzid zza;
    private long zzaa;
    private boolean zzab;
    private boolean zzac;
    private boolean zzad;
    private zztn zzae;
    private long zzaf;
    private boolean zzag;
    private boolean zzah;
    private boolean zzai;
    private long zzaj;
    private long zzak;
    private zzsi zzal;
    private zzsi zzam;
    private final zztd zzc;
    private final zztr zzd;
    private final float zze;
    private final zzhs zzf = new zzhs(0, 0);
    private final zzhs zzg = new zzhs(0, 0);
    private final zzhs zzh = new zzhs(2, 0);
    private final zzsw zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrv zzl;
    private zzz zzm;
    private zzz zzn;
    /* access modifiers changed from: private */
    public zzlz zzo;
    private MediaCrypto zzp;
    private long zzq;
    private float zzr;
    private float zzs;
    private zztf zzt;
    private zzz zzu;
    private MediaFormat zzv;
    private boolean zzw;
    private float zzx;
    private ArrayDeque zzy;
    private zztl zzz;

    public zztp(int i, zztd zztd, zztr zztr, boolean z, float f) {
        super(i);
        this.zzc = zztd;
        zztr.getClass();
        zztr zztr2 = zztr;
        this.zzd = zztr;
        this.zze = f;
        zzsw zzsw = new zzsw();
        this.zzi = zzsw;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzr = 1.0f;
        this.zzs = 1.0f;
        this.zzq = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzae = zztn.zza;
        zzsw.zzj(0);
        zzsw.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrv();
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzT = 0;
        this.zzK = -1;
        this.zzL = -1;
        this.zzJ = -9223372036854775807L;
        this.zzZ = -9223372036854775807L;
        this.zzaa = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
        this.zzH = -9223372036854775807L;
        this.zzU = 0;
        this.zzV = 0;
        this.zza = new zzid();
        this.zzaj = -9223372036854775807L;
        this.zzak = -9223372036854775807L;
    }

    protected static boolean zzaY(zzz zzz2) {
        return zzz2.zzN == 0;
    }

    private final void zzaf() {
        this.zzP = false;
        zzal();
    }

    private final void zzag() throws zzin {
        if (this.zzW) {
            this.zzU = 1;
            this.zzV = 3;
            return;
        }
        zzaM();
        zzaJ();
    }

    private final void zzah() {
        try {
            zztf zztf = this.zzt;
            zzdd.zzb(zztf);
            zztf zztf2 = zztf;
            zztf.zzj();
        } finally {
            zzaN();
        }
    }

    private final void zzal() {
        zzam();
        this.zzR = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzQ = false;
        this.zzl.zzb();
    }

    private final void zzam() {
        this.zzZ = -9223372036854775807L;
        this.zzaa = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
    }

    private final void zzas() {
        this.zzK = -1;
        this.zzg.zzc = null;
    }

    private final void zzba() {
        this.zzL = -1;
        this.zzM = null;
    }

    private final void zzbb(zztn zztn) {
        this.zzae = zztn;
        if (zztn.zzd != -9223372036854775807L) {
            this.zzag = true;
        }
    }

    private final boolean zzbd() throws zzin {
        if (this.zzW) {
            this.zzU = 1;
            if (this.zzD) {
                this.zzV = 3;
                return false;
            }
            this.zzV = 2;
        } else {
            zzbc();
        }
        return true;
    }

    private final boolean zzbe() {
        if (this.zzt == null) {
            return false;
        }
        if (zzaX()) {
            zzaM();
            return true;
        } else if (zzaV()) {
            zzah();
            return false;
        } else {
            long j = this.zzak;
            if (j == -9223372036854775807L || zzcW() > j || this.zzaf >= j) {
                return false;
            }
            this.zzai = true;
            this.zzak = -9223372036854775807L;
            return false;
        }
    }

    private final boolean zzbf() {
        return this.zzL >= 0;
    }

    private final boolean zzbg(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzz zzz2 = this.zzn;
        if (zzz2 == null || !Objects.equals(zzz2.zzo, "audio/opus")) {
            return true;
        }
        return !zzaeq.zzf(j, j2);
    }

    private final boolean zzbh(int i) throws zzin {
        zzkv zzl2 = zzl();
        zzhs zzhs = this.zzf;
        zzhs.zzb();
        int zzcV = zzcV(zzl2, zzhs, i | 4);
        if (zzcV == -5) {
            zzae(zzl2);
            return true;
        } else if (zzcV != -4 || !zzhs.zzf()) {
            return false;
        } else {
            this.zzab = true;
            zzai();
            return false;
        }
    }

    private final boolean zzbi(long j) {
        return this.zzq == -9223372036854775807L || zzcX().zzb() - j < this.zzq;
    }

    private final boolean zzbj(zzz zzz2) throws zzin {
        if (!(this.zzt == null || this.zzV == 3 || zzcU() == 0)) {
            float f = this.zzs;
            zzz2.getClass();
            zzz zzz3 = zzz2;
            float zzaa2 = zzaa(f, zzz2, zzU());
            float f2 = this.zzx;
            if (f2 != zzaa2) {
                if (zzaa2 == -1.0f) {
                    zzag();
                    return false;
                } else if (f2 != -1.0f || zzaa2 > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzaa2);
                    zztf zztf = this.zzt;
                    zztf.getClass();
                    zztf zztf2 = zztf;
                    zztf.zzq(bundle);
                    this.zzx = zzaa2;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void zzA(long j, boolean z) throws zzin {
        this.zzab = false;
        this.zzac = false;
        if (this.zzP) {
            zzal();
        } else {
            zzaP();
        }
        zzet zzet = this.zzae.zze;
        if (zzet.zza() > 0) {
            this.zzad = true;
        }
        zzet.zze();
        this.zzk.clear();
    }

    /* access modifiers changed from: protected */
    public void zzD() {
        try {
            zzaf();
            zzaM();
        } finally {
            this.zzam = null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r7 >= r5) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzG(com.google.android.gms.internal.ads.zzz[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzvh r18) throws com.google.android.gms.internal.ads.zzin {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zztn r1 = r0.zzae
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0027
            com.google.android.gms.internal.ads.zztn r1 = new com.google.android.gms.internal.ads.zztn
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzbb(r1)
            boolean r1 = r0.zzah
            if (r1 == 0) goto L_0x005b
            r12.zzat()
            return
        L_0x0027:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x005c
            long r5 = r0.zzZ
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x003f
            long r7 = r0.zzaf
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x005c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x005c
        L_0x003f:
            com.google.android.gms.internal.ads.zztn r1 = new com.google.android.gms.internal.ads.zztn
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzbb(r1)
            com.google.android.gms.internal.ads.zztn r1 = r0.zzae
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x005b
            r12.zzat()
        L_0x005b:
            return
        L_0x005c:
            com.google.android.gms.internal.ads.zztn r9 = new com.google.android.gms.internal.ads.zztn
            long r3 = r0.zzZ
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzG(com.google.android.gms.internal.ads.zzz[], long, long, com.google.android.gms.internal.ads.zzvh):void");
    }

    public void zzN(float f, float f2) throws zzin {
        this.zzr = f;
        this.zzs = f2;
        zzbj(this.zzu);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v25, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v28, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v93, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v94, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v96, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v97, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v98, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v101, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v102, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v103, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v104, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v105, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v106, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v107, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v108, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v109, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v110, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v111, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v112, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v113, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v114, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v115, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v116, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v117, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v118, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v119, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v120, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v121, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v122, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v123, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v124, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v125, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v126, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v127, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v128, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v129, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v130, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v131, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v132, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v133, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v134, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v135, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v136, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v137, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v139, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v150, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v151, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v38, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v40, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v42, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v46, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v47, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v48, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v51, resolved type: com.google.android.gms.internal.ads.zzz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v52, resolved type: com.google.android.gms.internal.ads.zzz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v53, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v54, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v45 */
    /* JADX WARNING: type inference failed for: r14v20, types: [java.lang.Throwable, android.media.MediaFormat] */
    /* JADX WARNING: type inference failed for: r14v22 */
    /* JADX WARNING: type inference failed for: r14v25 */
    /* JADX WARNING: type inference failed for: r3v54 */
    /* JADX WARNING: type inference failed for: r3v62 */
    /* JADX WARNING: type inference failed for: r3v66 */
    /* JADX WARNING: type inference failed for: r3v71 */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01d6, code lost:
        r15.zzQ = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0201, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0202, code lost:
        r12 = false;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0208, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0209, code lost:
        r12 = false;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x029c, code lost:
        r1 = r8;
        r17 = r14;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0303, code lost:
        if (r15.zzn != null) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x03e1, code lost:
        r0 = e;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x03ef, code lost:
        r1 = r24;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x03f1, code lost:
        r4 = r4;
        r4 = r4;
        r3 = r3;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:?, code lost:
        r5 = r4.zzt;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x03f3, code lost:
        if (r5 == null) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x03f8, code lost:
        if (r4.zzU == 2) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x03fc, code lost:
        if (r4.zzab == false) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0400, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0405, code lost:
        if (r4.zzK >= 0) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0407, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:?, code lost:
        r3 = r5.zza();
        r4.zzK = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x040d, code lost:
        if (r3 < 0) goto L_0x05ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x040f, code lost:
        r6 = r4.zzg;
        r6.zzc = r5.zzf(r3);
        r6.zzb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x041d, code lost:
        if (r4.zzU != 1) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x041f, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0421, code lost:
        if (r4.zzG != false) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0423, code lost:
        r4.zzX = true;
        r5.zzk(r4.zzK, 0, 0, 0, 4);
        zzas();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0432, code lost:
        r4.zzU = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0436, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0437, code lost:
        r2 = r0;
        r1 = true;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x043d, code lost:
        if (r4.zzE == false) goto L_0x0468;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x043f, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0440, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:?, code lost:
        r4.zzE = false;
        r6 = r4.zzg.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0446, code lost:
        if (r6 == null) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0448, code lost:
        r7 = r6;
        r6.put(zzb);
        r5.zzk(r4.zzK, 0, 38, 0, 0);
        zzas();
        r4.zzW = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0462, code lost:
        throw r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0463, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0464, code lost:
        r2 = r0;
        r1 = true;
        r4 = r4;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0468, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0469, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        r6 = r4.zzT;
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x046b, code lost:
        if (r6 != 1) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x046d, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x046e, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        r6 = r4.zzu;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0470, code lost:
        if (r6 == null) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0472, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x047b, code lost:
        if (r14 >= r6.zzr.size()) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x047d, code lost:
        r6 = (byte[]) r4.zzu.zzr.get(r14);
        r7 = r4.zzg.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x048b, code lost:
        if (r7 == null) goto L_0x0496;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x048d, code lost:
        r8 = r7;
        r7.put(r6);
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0496, code lost:
        throw r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0497, code lost:
        r4.zzT = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x049a, code lost:
        throw r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x049b, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:?, code lost:
        r6 = r4.zzg;
        r7 = r6.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x049f, code lost:
        if (r7 == null) goto L_0x05eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x04a1, code lost:
        r8 = r7;
        r7 = r7.position();
        r8 = zzl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x04ac, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:?, code lost:
        r6 = r4.zzcV(r8, r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x04b1, code lost:
        if (r6 != -3) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x04b3, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x04b7, code lost:
        if (zzR() == false) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x04b9, code lost:
        r4.zzaa = r4.zzZ;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x04c0, code lost:
        if (r6 != -5) goto L_0x04d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x04c4, code lost:
        if (r4.zzT != 2) goto L_0x04cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x04c6, code lost:
        r4.zzg.zzb();
        r4.zzT = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x04cd, code lost:
        r4.zzae(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x04d2, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        r6 = r4.zzg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x04d8, code lost:
        if (r6.zzf() == false) goto L_0x0507;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x04da, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        r4.zzaa = r4.zzZ;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x04e0, code lost:
        if (r4.zzT != 2) goto L_0x04e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x04e2, code lost:
        r6.zzb();
        r4.zzT = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x04e7, code lost:
        r4.zzab = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x04eb, code lost:
        if (r4.zzW != false) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x04ed, code lost:
        zzai();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x04f4, code lost:
        if (r4.zzG != false) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x04f6, code lost:
        r4.zzX = true;
        r5.zzk(r4.zzK, 0, 0, 0, 4);
        zzas();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0507, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        r8 = r4.zzW;
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0509, code lost:
        if (r8 != false) goto L_0x051c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x050b, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x050f, code lost:
        if (r6.zzg() != false) goto L_0x051c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0511, code lost:
        r6.zzb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0516, code lost:
        if (r4.zzT != 2) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0518, code lost:
        r4.zzT = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x051c, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0520, code lost:
        if (r4.zzaU(r6) != false) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0522, code lost:
        r8 = r6.zzl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0526, code lost:
        if (r8 == false) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0528, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:?, code lost:
        r6.zzb.zzb(r7);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x052d, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:?, code lost:
        r9 = r6.zze;
        r7 = r4.zzad;
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0531, code lost:
        if (r7 == false) goto L_0x0561;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0533, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:?, code lost:
        r7 = r4.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0539, code lost:
        if (r7.isEmpty() != false) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x053b, code lost:
        r7 = ((com.google.android.gms.internal.ads.zztn) r7.peekLast()).zze;
        r11 = r4.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0545, code lost:
        if (r11 == null) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0547, code lost:
        r15 = r11;
        r7.zzd(r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x054e, code lost:
        throw r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x054f, code lost:
        r7 = r4.zzae.zze;
        r11 = r4.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0555, code lost:
        if (r11 == null) goto L_0x0560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0557, code lost:
        r15 = r11;
        r7.zzd(r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x055d, code lost:
        r4.zzad = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0560, code lost:
        throw r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0561, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:?, code lost:
        r14 = java.lang.Math.max(r4.zzZ, r9);
        r4.zzZ = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x056d, code lost:
        if (zzR() != false) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x056f, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0573, code lost:
        if (r6.zzh() == false) goto L_0x0577;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0575, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:?, code lost:
        r4.zzaa = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0577, code lost:
        r6.zzk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x057e, code lost:
        if (r6.zze() == false) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0580, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:?, code lost:
        r4.zzan(r6);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0583, code lost:
        r4 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:?, code lost:
        r4.zzaL(r6);
        r11 = r4.zzay(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x058e, code lost:
        if (android.os.Build.VERSION.SDK_INT < 34) goto L_0x0594;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0592, code lost:
        if ((r11 & 32) != 0) goto L_0x05a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0594, code lost:
        zzo();
        r4.zzak = java.lang.Math.max(r4.zzak, r6.zze);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x05a1, code lost:
        if (r8 == false) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x05a3, code lost:
        r7 = r5;
        r5.zzl(r4.zzK, 0, r6.zzb, r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x05b1, code lost:
        r7 = r5;
        r7 = r4.zzK;
        r6 = r6.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x05b8, code lost:
        if (r6 == null) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x05ba, code lost:
        r8 = r6;
        r5.zzk(r7, 0, r6.limit(), r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x05c7, code lost:
        zzas();
        r4.zzW = true;
        r4.zzT = 0;
        r4.zza.zzc++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x05d7, code lost:
        throw r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x05d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x05d9, code lost:
        r4.zzao(r0);
        r4.zzbh(0);
        zzah();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x05eb, code lost:
        throw r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x05f2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x05f3, code lost:
        r3 = false;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x05f5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x05f6, code lost:
        r3 = false;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x060e, code lost:
        r0 = e;
        r4 = r4;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0610, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0611, code lost:
        r3 = r12;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x062d, code lost:
        r0 = e;
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x062f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0630, code lost:
        r1 = true;
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0632, code lost:
        r0 = e;
        r4 = r4;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0639, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x063a, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0646, code lost:
        r6 = r2.getStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0669, code lost:
        r14 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x066b, code lost:
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x066e, code lost:
        zzaM();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x067d, code lost:
        r2 = 4006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0680, code lost:
        r2 = 4003;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0689, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a3, code lost:
        r0 = e;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b0, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b1, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r15.zzac = true;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b3, code lost:
        r12 = false;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b7, code lost:
        r2 = r0;
        r1 = true;
        r4 = r15;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:404:0x0561, B:454:0x0618] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:404:0x0561, B:457:0x0624] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0208 A[ExcHandler: CryptoException (e android.media.MediaCodec$CryptoException), Splitter:B:57:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x033d A[SYNTHETIC, Splitter:B:243:0x033d] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0368 A[Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x03d3 A[LOOP:2: B:163:0x022c->B:279:0x03d3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x03e1 A[ExcHandler: CryptoException (e android.media.MediaCodec$CryptoException), PHI: r4 
      PHI: (r4v15 com.google.android.gms.internal.ads.zztp) = (r4v140 com.google.android.gms.internal.ads.zztp), (r4v142 com.google.android.gms.internal.ads.zztp), (r4v153 com.google.android.gms.internal.ads.zztp) binds: [B:308:0x041f, B:300:0x0407, B:262:0x03a1] A[DONT_GENERATE, DONT_INLINE], Splitter:B:262:0x03a1] */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0632 A[ExcHandler: CryptoException (e android.media.MediaCodec$CryptoException), PHI: r3 r4 
      PHI: (r3v12 boolean) = (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v31 boolean), (r3v33 boolean), (r3v57 boolean), (r3v59 boolean), (r3v60 boolean), (r3v63 boolean), (r3v68 boolean) binds: [B:327:0x0469, B:328:?, B:342:0x049b, B:346:0x04ac, B:360:0x04d2, B:373:0x0507, B:374:?, B:382:0x051c, B:389:0x052d, B:390:?, B:404:0x0561, B:416:0x0583, B:414:0x0580, B:415:?, B:410:0x0575, B:407:0x056f, B:392:0x0533, B:387:0x0528, B:388:?, B:376:0x050b, B:363:0x04da, B:350:0x04b3, B:331:0x046e, B:319:0x0440, B:454:0x0618, B:455:?, B:457:0x0624, B:290:0x03f1, B:255:0x0395] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v7 com.google.android.gms.internal.ads.zztp) = (r4v90 com.google.android.gms.internal.ads.zztp), (r4v92 com.google.android.gms.internal.ads.zztp), (r4v93 com.google.android.gms.internal.ads.zztp), (r4v97 com.google.android.gms.internal.ads.zztp), (r4v102 com.google.android.gms.internal.ads.zztp), (r4v104 com.google.android.gms.internal.ads.zztp), (r4v106 com.google.android.gms.internal.ads.zztp), (r4v108 com.google.android.gms.internal.ads.zztp), (r4v110 com.google.android.gms.internal.ads.zztp), (r4v112 com.google.android.gms.internal.ads.zztp), (r4v114 com.google.android.gms.internal.ads.zztp), (r4v116 com.google.android.gms.internal.ads.zztp), (r4v118 com.google.android.gms.internal.ads.zztp), (r4v120 com.google.android.gms.internal.ads.zztp), (r4v122 com.google.android.gms.internal.ads.zztp), (r4v124 com.google.android.gms.internal.ads.zztp), (r4v126 com.google.android.gms.internal.ads.zztp), (r4v127 com.google.android.gms.internal.ads.zztp), (r4v128 com.google.android.gms.internal.ads.zztp), (r4v130 com.google.android.gms.internal.ads.zztp), (r4v131 com.google.android.gms.internal.ads.zztp), (r4v132 com.google.android.gms.internal.ads.zztp), (r4v133 com.google.android.gms.internal.ads.zztp), (r4v134 com.google.android.gms.internal.ads.zztp), (r4v135 com.google.android.gms.internal.ads.zztp), (r4v136 com.google.android.gms.internal.ads.zztp), (r4v137 com.google.android.gms.internal.ads.zztp), (r4v139 com.google.android.gms.internal.ads.zztp), (r4v150 com.google.android.gms.internal.ads.zztp) binds: [B:454:0x0618, B:455:?, B:457:0x0624, B:290:0x03f1, B:327:0x0469, B:328:?, B:342:0x049b, B:346:0x04ac, B:360:0x04d2, B:373:0x0507, B:374:?, B:382:0x051c, B:389:0x052d, B:390:?, B:404:0x0561, B:416:0x0583, B:414:0x0580, B:415:?, B:410:0x0575, B:407:0x056f, B:392:0x0533, B:387:0x0528, B:388:?, B:376:0x050b, B:363:0x04da, B:350:0x04b3, B:331:0x046e, B:319:0x0440, B:255:0x0395] A[DONT_GENERATE, DONT_INLINE], Splitter:B:404:0x0561] */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0639 A[ExcHandler: CryptoException (e android.media.MediaCodec$CryptoException), PHI: r12 r15 
      PHI: (r12v1 boolean) = (r12v0 boolean), (r12v0 boolean), (r12v0 boolean), (r12v3 boolean), (r12v3 boolean), (r12v3 boolean), (r12v3 boolean) binds: [B:158:0x021b, B:159:?, B:161:0x021f, B:226:0x0317, B:240:0x0337, B:241:?, B:250:0x0358] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v2 com.google.android.gms.internal.ads.zztp) = (r15v0 com.google.android.gms.internal.ads.zztp), (r15v0 com.google.android.gms.internal.ads.zztp), (r15v0 com.google.android.gms.internal.ads.zztp), (r15v4 com.google.android.gms.internal.ads.zztp), (r15v4 com.google.android.gms.internal.ads.zztp), (r15v4 com.google.android.gms.internal.ads.zztp), (r15v4 com.google.android.gms.internal.ads.zztp) binds: [B:158:0x021b, B:159:?, B:161:0x021f, B:226:0x0317, B:240:0x0337, B:241:?, B:250:0x0358] A[DONT_GENERATE, DONT_INLINE], Splitter:B:158:0x021b] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x067d  */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0604 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a3 A[ExcHandler: CryptoException (e android.media.MediaCodec$CryptoException), PHI: r15 
      PHI: (r15v19 com.google.android.gms.internal.ads.zztp) = (r15v34 com.google.android.gms.internal.ads.zztp), (r15v38 com.google.android.gms.internal.ads.zztp), (r15v39 com.google.android.gms.internal.ads.zztp), (r15v51 com.google.android.gms.internal.ads.zztp), (r15v53 com.google.android.gms.internal.ads.zztp) binds: [B:30:0x0041, B:61:0x00b1, B:62:?, B:35:0x0078, B:40:0x0084] A[DONT_GENERATE, DONT_INLINE], Splitter:B:30:0x0041] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzW(long r27, long r29) throws com.google.android.gms.internal.ads.zzin {
        /*
            r26 = this;
            r15 = r26
            r14 = 0
            r13 = 1
            boolean r1 = r15.zzac     // Catch:{ CryptoException -> 0x068a, IllegalStateException -> 0x063c }
            if (r1 == 0) goto L_0x0019
            r26.zzau()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            return
        L_0x000c:
            r0 = move-exception
            r2 = r0
            r1 = r13
            r3 = r14
        L_0x0010:
            r4 = r15
            goto L_0x0641
        L_0x0013:
            r0 = move-exception
            r1 = r0
            r3 = r14
        L_0x0016:
            r4 = r15
            goto L_0x068e
        L_0x0019:
            com.google.android.gms.internal.ads.zzz r1 = r15.zzm     // Catch:{ CryptoException -> 0x068a, IllegalStateException -> 0x063c }
            r11 = 2
            if (r1 != 0) goto L_0x0026
            boolean r1 = r15.zzbh(r11)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            return
        L_0x0026:
            r26.zzaJ()     // Catch:{ CryptoException -> 0x068a, IllegalStateException -> 0x063c }
            boolean r1 = r15.zzP     // Catch:{ CryptoException -> 0x068a, IllegalStateException -> 0x063c }
            r10 = 0
            if (r1 == 0) goto L_0x0218
            java.lang.String r1 = "bypassRender"
            android.os.Trace.beginSection(r1)     // Catch:{ CryptoException -> 0x0212, IllegalStateException -> 0x020b }
        L_0x0033:
            boolean r1 = r15.zzac     // Catch:{ CryptoException -> 0x0212, IllegalStateException -> 0x020b }
            r1 = r1 ^ r13
            com.google.android.gms.internal.ads.zzdd.zzf(r1)     // Catch:{ CryptoException -> 0x0212, IllegalStateException -> 0x020b }
            com.google.android.gms.internal.ads.zzsw r11 = r15.zzi     // Catch:{ CryptoException -> 0x0212, IllegalStateException -> 0x020b }
            boolean r1 = r11.zzq()     // Catch:{ CryptoException -> 0x0212, IllegalStateException -> 0x020b }
            if (r1 == 0) goto L_0x00a9
            java.nio.ByteBuffer r7 = r11.zzc     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            int r8 = r15.zzL     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            int r16 = r11.zzm()     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            long r4 = r11.zze     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            long r1 = r26.zzcW()     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            long r12 = r11.zzn()     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            boolean r13 = r15.zzbg(r1, r12)     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            boolean r19 = r11.zzf()     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            com.google.android.gms.internal.ads.zzz r12 = r15.zzn     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            if (r12 == 0) goto L_0x009a
            r1 = r12
            com.google.android.gms.internal.ads.zzz r1 = (com.google.android.gms.internal.ads.zzz) r1     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            r6 = 0
            r9 = 0
            r1 = r26
            r2 = r27
            r20 = r4
            r4 = r29
            r10 = r16
            r16 = r11
            r18 = r12
            r11 = r20
            r14 = r19
            r15 = r18
            boolean r1 = r1.zzav(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ CryptoException -> 0x0096, IllegalStateException -> 0x0092 }
            if (r1 == 0) goto L_0x008c
            long r1 = r16.zzn()     // Catch:{ CryptoException -> 0x0096, IllegalStateException -> 0x0092 }
            r15 = r26
            r15.zzaK(r1)     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            r16.zzb()     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
            r14 = 0
            goto L_0x00ac
        L_0x008c:
            r15 = r26
            r12 = 0
            r13 = 1
            goto L_0x01f5
        L_0x0092:
            r0 = move-exception
            r15 = r26
            goto L_0x009d
        L_0x0096:
            r0 = move-exception
            r15 = r26
            goto L_0x00a4
        L_0x009a:
            r14 = r10
            throw r14     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x009c }
        L_0x009c:
            r0 = move-exception
        L_0x009d:
            r2 = r0
            r4 = r15
        L_0x009f:
            r1 = 1
        L_0x00a0:
            r3 = 0
            goto L_0x0641
        L_0x00a3:
            r0 = move-exception
        L_0x00a4:
            r1 = r0
            r4 = r15
        L_0x00a6:
            r3 = 0
            goto L_0x068e
        L_0x00a9:
            r14 = r10
            r16 = r11
        L_0x00ac:
            boolean r1 = r15.zzab     // Catch:{ CryptoException -> 0x0208, IllegalStateException -> 0x0204 }
            if (r1 == 0) goto L_0x00bb
            r13 = 1
            r15.zzac = r13     // Catch:{ CryptoException -> 0x00a3, IllegalStateException -> 0x00b6 }
            r12 = 0
            goto L_0x01f5
        L_0x00b6:
            r0 = move-exception
            r2 = r0
            r1 = r13
            r4 = r15
            goto L_0x00a0
        L_0x00bb:
            r13 = 1
            boolean r1 = r15.zzQ     // Catch:{ CryptoException -> 0x0208, IllegalStateException -> 0x0201 }
            if (r1 == 0) goto L_0x00cf
            com.google.android.gms.internal.ads.zzhs r1 = r15.zzh     // Catch:{ CryptoException -> 0x0208, IllegalStateException -> 0x0201 }
            r2 = r16
            boolean r1 = r2.zzp(r1)     // Catch:{ CryptoException -> 0x0208, IllegalStateException -> 0x0201 }
            com.google.android.gms.internal.ads.zzdd.zzf(r1)     // Catch:{ CryptoException -> 0x0208, IllegalStateException -> 0x0201 }
            r12 = 0
            r15.zzQ = r12     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            goto L_0x00d2
        L_0x00cf:
            r2 = r16
            r12 = 0
        L_0x00d2:
            boolean r1 = r15.zzR     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 == 0) goto L_0x00ed
            boolean r1 = r2.zzq()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 != 0) goto L_0x00e9
            r26.zzaf()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzR = r12     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r26.zzaJ()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            boolean r1 = r15.zzP     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 == 0) goto L_0x01f5
            goto L_0x00ed
        L_0x00e9:
            r10 = r14
            r14 = r12
            goto L_0x0033
        L_0x00ed:
            boolean r1 = r15.zzab     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r1 = r1 ^ r13
            com.google.android.gms.internal.ads.zzdd.zzf(r1)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zzkv r1 = r26.zzl()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zzhs r3 = r15.zzh     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r3.zzb()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x00fc:
            r3.zzb()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r4 = r15.zzcV(r1, r3, r12)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r10 = -5
            if (r4 == r10) goto L_0x01d9
            r5 = -4
            if (r4 == r5) goto L_0x0115
            boolean r1 = r26.zzR()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 == 0) goto L_0x01dc
            long r3 = r15.zzZ     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzaa = r3     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            goto L_0x01dc
        L_0x0115:
            boolean r4 = r3.zzf()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 == 0) goto L_0x0123
            r15.zzab = r13     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            long r3 = r15.zzZ     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzaa = r3     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            goto L_0x01dc
        L_0x0123:
            long r4 = r15.zzZ     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            long r6 = r3.zze     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            long r4 = java.lang.Math.max(r4, r6)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzZ = r4     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            boolean r6 = r26.zzR()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r6 != 0) goto L_0x013b
            com.google.android.gms.internal.ads.zzhs r6 = r15.zzg     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            boolean r6 = r6.zzh()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r6 == 0) goto L_0x013d
        L_0x013b:
            r15.zzaa = r4     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x013d:
            boolean r4 = r15.zzad     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            java.lang.String r5 = "audio/opus"
            if (r4 == 0) goto L_0x0184
            com.google.android.gms.internal.ads.zzz r4 = r15.zzm     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 == 0) goto L_0x0183
            r6 = r4
            com.google.android.gms.internal.ads.zzz r6 = (com.google.android.gms.internal.ads.zzz) r6     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzn = r4     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            java.lang.String r4 = r4.zzo     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            boolean r4 = java.util.Objects.equals(r4, r5)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 == 0) goto L_0x017b
            com.google.android.gms.internal.ads.zzz r4 = r15.zzn     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            java.util.List r4 = r4.zzr     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            boolean r4 = r4.isEmpty()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 != 0) goto L_0x017b
            com.google.android.gms.internal.ads.zzz r4 = r15.zzn     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            java.util.List r4 = r4.zzr     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            java.lang.Object r4 = r4.get(r12)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            byte[] r4 = (byte[]) r4     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r4 = com.google.android.gms.internal.ads.zzaeq.zza(r4)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zzz r6 = r15.zzn     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zzx r6 = r6.zzb()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r6.zzM(r4)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zzz r4 = r6.zzan()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzn = r4     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x017b:
            com.google.android.gms.internal.ads.zzz r4 = r15.zzn     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzar(r4, r14)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzad = r12     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            goto L_0x0184
        L_0x0183:
            throw r14     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x0184:
            r3.zzk()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zzz r4 = r15.zzn     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 == 0) goto L_0x01b5
            java.lang.String r4 = r4.zzo     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            boolean r4 = java.util.Objects.equals(r4, r5)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 == 0) goto L_0x01b5
            boolean r4 = r3.zze()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 == 0) goto L_0x01a0
            com.google.android.gms.internal.ads.zzz r4 = r15.zzn     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r3.zza = r4     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzan(r3)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x01a0:
            long r4 = r26.zzcW()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            long r6 = r3.zze     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            boolean r4 = com.google.android.gms.internal.ads.zzaeq.zzf(r4, r6)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 == 0) goto L_0x01b5
            com.google.android.gms.internal.ads.zzrv r4 = r15.zzl     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zzz r5 = r15.zzn     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            java.util.List r5 = r5.zzr     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r4.zza(r3, r5)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x01b5:
            boolean r4 = r2.zzq()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 != 0) goto L_0x01bc
            goto L_0x01d0
        L_0x01bc:
            long r4 = r26.zzcW()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            long r6 = r2.zzn()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            boolean r6 = r15.zzbg(r4, r6)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            long r7 = r3.zze     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            boolean r4 = r15.zzbg(r4, r7)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r6 != r4) goto L_0x01d6
        L_0x01d0:
            boolean r4 = r2.zzp(r3)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 != 0) goto L_0x00fc
        L_0x01d6:
            r15.zzQ = r13     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            goto L_0x01dc
        L_0x01d9:
            r15.zzae(r1)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x01dc:
            boolean r1 = r2.zzq()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 == 0) goto L_0x01e5
            r2.zzk()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x01e5:
            boolean r1 = r2.zzq()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 != 0) goto L_0x00e9
            boolean r1 = r15.zzab     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 != 0) goto L_0x00e9
            boolean r1 = r15.zzR     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 == 0) goto L_0x01f5
            goto L_0x00e9
        L_0x01f5:
            android.os.Trace.endSection()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r3 = r12
            r1 = r13
            r4 = r15
            goto L_0x0627
        L_0x01fd:
            r0 = move-exception
            goto L_0x020d
        L_0x01ff:
            r0 = move-exception
            goto L_0x0214
        L_0x0201:
            r0 = move-exception
            r12 = 0
            goto L_0x020d
        L_0x0204:
            r0 = move-exception
            r12 = 0
            r13 = 1
            goto L_0x020d
        L_0x0208:
            r0 = move-exception
            r12 = 0
            goto L_0x0214
        L_0x020b:
            r0 = move-exception
            r12 = r14
        L_0x020d:
            r2 = r0
            r3 = r12
            r1 = r13
            goto L_0x0010
        L_0x0212:
            r0 = move-exception
            r12 = r14
        L_0x0214:
            r1 = r0
            r3 = r12
            goto L_0x0016
        L_0x0218:
            r12 = r14
            r14 = r10
            r10 = -5
            com.google.android.gms.internal.ads.zztf r1 = r15.zzt     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0635 }
            if (r1 == 0) goto L_0x0616
            com.google.android.gms.internal.ads.zzdj r1 = r26.zzcX()     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            long r8 = r1.zzb()     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            java.lang.String r1 = "drainAndFeed"
            android.os.Trace.beginSection(r1)     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
        L_0x022c:
            com.google.android.gms.internal.ads.zztf r6 = r15.zzt     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            if (r6 == 0) goto L_0x0609
            r1 = r6
            com.google.android.gms.internal.ads.zztf r1 = (com.google.android.gms.internal.ads.zztf) r1     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            boolean r1 = r26.zzbf()     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0317
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r4 = r6.zzb(r1)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 >= 0) goto L_0x02a2
            r1 = -2
            if (r4 != r1) goto L_0x0275
            r15.zzY = r13     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zztf r1 = r15.zzt     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 == 0) goto L_0x0274
            r2 = r1
            com.google.android.gms.internal.ads.zztf r2 = (com.google.android.gms.internal.ads.zztf) r2     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            android.media.MediaFormat r1 = r1.zzc()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r2 = r15.zzB     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r2 == 0) goto L_0x026f
            java.lang.String r2 = "width"
            int r2 = r1.getInteger(r2)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r3 = 32
            if (r2 != r3) goto L_0x026f
            java.lang.String r2 = "height"
            int r2 = r1.getInteger(r2)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r2 != r3) goto L_0x026f
            r15.zzF = r13     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            goto L_0x02ab
        L_0x026f:
            r15.zzv = r1     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzw = r13     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            goto L_0x02ab
        L_0x0274:
            throw r14     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x0275:
            boolean r1 = r15.zzG     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 == 0) goto L_0x0284
            boolean r1 = r15.zzab     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 != 0) goto L_0x0281
            int r1 = r15.zzU     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 != r11) goto L_0x0284
        L_0x0281:
            r26.zzai()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x0284:
            long r4 = r15.zzH     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x029c
            r1 = 100
            long r4 = r4 + r1
            com.google.android.gms.internal.ads.zzdj r1 = r26.zzcX()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            long r1 = r1.zza()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x029c
            r26.zzai()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x029c:
            r1 = r8
            r17 = r14
            r4 = r15
            goto L_0x03f1
        L_0x02a2:
            boolean r5 = r15.zzF     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r5 == 0) goto L_0x02b1
            r15.zzF = r12     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r6.zzo(r4, r12)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x02ab:
            r1 = r8
            r17 = r14
            r4 = r15
            goto L_0x03cc
        L_0x02b1:
            int r5 = r1.size     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r5 != 0) goto L_0x02bf
            int r5 = r1.flags     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r5 = r5 & 4
            if (r5 == 0) goto L_0x02bf
            r26.zzai()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            goto L_0x029c
        L_0x02bf:
            r15.zzL = r4     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            java.nio.ByteBuffer r4 = r6.zzg(r4)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzM = r4     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 == 0) goto L_0x02d8
            int r5 = r1.offset     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r4.position(r5)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            java.nio.ByteBuffer r4 = r15.zzM     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r5 = r1.offset     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r7 = r1.size     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r5 = r5 + r7
            r4.limit(r5)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x02d8:
            long r4 = r1.presentationTimeUs     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zztn r1 = r15.zzae     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zzet r1 = r1.zze     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            java.lang.Object r1 = r1.zzc(r4)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zzz r1 = (com.google.android.gms.internal.ads.zzz) r1     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 != 0) goto L_0x02f8
            boolean r4 = r15.zzag     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 == 0) goto L_0x02f8
            android.media.MediaFormat r4 = r15.zzv     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r4 == 0) goto L_0x02f8
            com.google.android.gms.internal.ads.zztn r1 = r15.zzae     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zzet r1 = r1.zze     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            java.lang.Object r1 = r1.zzb()     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            com.google.android.gms.internal.ads.zzz r1 = (com.google.android.gms.internal.ads.zzz) r1     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x02f8:
            if (r1 == 0) goto L_0x02fd
            r15.zzn = r1     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            goto L_0x0305
        L_0x02fd:
            boolean r1 = r15.zzw     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 == 0) goto L_0x0317
            com.google.android.gms.internal.ads.zzz r1 = r15.zzn     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 == 0) goto L_0x0317
        L_0x0305:
            com.google.android.gms.internal.ads.zzz r1 = r15.zzn     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            if (r1 == 0) goto L_0x0316
            r4 = r1
            com.google.android.gms.internal.ads.zzz r4 = (com.google.android.gms.internal.ads.zzz) r4     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            android.media.MediaFormat r4 = r15.zzv     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzar(r1, r4)     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzw = r12     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzag = r12     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            goto L_0x0317
        L_0x0316:
            throw r14     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x0317:
            android.media.MediaCodec$BufferInfo r7 = r15.zzj     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            long r4 = r7.presentationTimeUs     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            long r16 = r26.zzcW()     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            int r1 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0325
            r1 = r13
            goto L_0x0326
        L_0x0325:
            r1 = r12
        L_0x0326:
            r15.zzN = r1     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            long r4 = r15.zzaa     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0336
            long r10 = r7.presentationTimeUs     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0336
            r1 = r13
            goto L_0x0337
        L_0x0336:
            r1 = r12
        L_0x0337:
            r15.zzO = r1     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            boolean r1 = r15.zzai     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            if (r1 == 0) goto L_0x0358
            long r4 = r15.zzaj     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0350
            long r4 = r7.presentationTimeUs     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            long r10 = r15.zzaj     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0350
            r15.zzai = r12     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzaj = r2     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            goto L_0x0358
        L_0x0350:
            long r1 = r7.presentationTimeUs     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzaj = r1     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzN = r13     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
            r15.zzO = r12     // Catch:{ CryptoException -> 0x01ff, IllegalStateException -> 0x01fd }
        L_0x0358:
            java.nio.ByteBuffer r10 = r15.zzM     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            int r11 = r15.zzL     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            int r4 = r7.flags     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            long r2 = r7.presentationTimeUs     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            boolean r5 = r15.zzN     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            boolean r1 = r15.zzO     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            com.google.android.gms.internal.ads.zzz r14 = r15.zzn     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            if (r14 == 0) goto L_0x0604
            r17 = r14
            com.google.android.gms.internal.ads.zzz r17 = (com.google.android.gms.internal.ads.zzz) r17     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0610 }
            r17 = 1
            r18 = r1
            r1 = r26
            r19 = r2
            r2 = r27
            r21 = r4
            r22 = r5
            r4 = r29
            r23 = r7
            r7 = r10
            r9 = r8
            r8 = r11
            r10 = r9
            r9 = r21
            r24 = r10
            r11 = -5
            r10 = r17
            r11 = r19
            r13 = r22
            r16 = r14
            r17 = 0
            r14 = r18
            r15 = r16
            boolean r1 = r1.zzav(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ CryptoException -> 0x05fe, IllegalStateException -> 0x05f9 }
            if (r1 == 0) goto L_0x03ed
            r1 = r23
            long r2 = r1.presentationTimeUs     // Catch:{ CryptoException -> 0x03e9, IllegalStateException -> 0x03e5 }
            r4 = r26
            r4.zzaK(r2)     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            int r1 = r1.flags     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x03ac
            r14 = 1
            goto L_0x03ad
        L_0x03ac:
            r14 = 0
        L_0x03ad:
            if (r14 != 0) goto L_0x03c1
            boolean r1 = r4.zzX     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            if (r1 == 0) goto L_0x03c1
            boolean r1 = r4.zzO     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            if (r1 == 0) goto L_0x03c1
            com.google.android.gms.internal.ads.zzdj r1 = r26.zzcX()     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            long r1 = r1.zza()     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            r4.zzH = r1     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
        L_0x03c1:
            r26.zzba()     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            if (r14 == 0) goto L_0x03ca
            r26.zzai()     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            goto L_0x03ef
        L_0x03ca:
            r1 = r24
        L_0x03cc:
            boolean r3 = r4.zzbi(r1)     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            if (r3 != 0) goto L_0x03d3
            goto L_0x03f1
        L_0x03d3:
            r8 = r1
            r15 = r4
            r14 = r17
            r10 = -5
            r11 = 2
            r12 = 0
            r13 = 1
            goto L_0x022c
        L_0x03dd:
            r0 = move-exception
        L_0x03de:
            r2 = r0
            goto L_0x009f
        L_0x03e1:
            r0 = move-exception
        L_0x03e2:
            r1 = r0
            goto L_0x00a6
        L_0x03e5:
            r0 = move-exception
            r4 = r26
            goto L_0x03de
        L_0x03e9:
            r0 = move-exception
            r4 = r26
            goto L_0x03e2
        L_0x03ed:
            r4 = r26
        L_0x03ef:
            r1 = r24
        L_0x03f1:
            com.google.android.gms.internal.ads.zztf r5 = r4.zzt     // Catch:{ CryptoException -> 0x05f5, IllegalStateException -> 0x05f2 }
            if (r5 == 0) goto L_0x05ec
            int r3 = r4.zzU     // Catch:{ CryptoException -> 0x05f5, IllegalStateException -> 0x05f2 }
            r12 = 2
            if (r3 == r12) goto L_0x05ec
            boolean r3 = r4.zzab     // Catch:{ CryptoException -> 0x05f5, IllegalStateException -> 0x05f2 }
            if (r3 == 0) goto L_0x0400
            goto L_0x05ec
        L_0x0400:
            r3 = r5
            com.google.android.gms.internal.ads.zztf r3 = (com.google.android.gms.internal.ads.zztf) r3     // Catch:{ CryptoException -> 0x05f5, IllegalStateException -> 0x05f2 }
            int r3 = r4.zzK     // Catch:{ CryptoException -> 0x05f5, IllegalStateException -> 0x05f2 }
            if (r3 >= 0) goto L_0x041a
            int r3 = r5.zza()     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            r4.zzK = r3     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            if (r3 < 0) goto L_0x05ec
            com.google.android.gms.internal.ads.zzhs r6 = r4.zzg     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            java.nio.ByteBuffer r3 = r5.zzf(r3)     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            r6.zzc = r3     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
            r6.zzb()     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x03dd }
        L_0x041a:
            int r3 = r4.zzU     // Catch:{ CryptoException -> 0x05f5, IllegalStateException -> 0x05f2 }
            r13 = 1
            if (r3 != r13) goto L_0x043b
            boolean r1 = r4.zzG     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x0436 }
            if (r1 != 0) goto L_0x0432
            r4.zzX = r13     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x0436 }
            int r6 = r4.zzK     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x0436 }
            r9 = 0
            r11 = 4
            r7 = 0
            r8 = 0
            r5.zzk(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x0436 }
            r26.zzas()     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x0436 }
        L_0x0432:
            r4.zzU = r12     // Catch:{ CryptoException -> 0x03e1, IllegalStateException -> 0x0436 }
            goto L_0x05ec
        L_0x0436:
            r0 = move-exception
            r2 = r0
            r1 = r13
            goto L_0x00a0
        L_0x043b:
            boolean r3 = r4.zzE     // Catch:{ CryptoException -> 0x05f5, IllegalStateException -> 0x05f2 }
            if (r3 == 0) goto L_0x0468
            r3 = 0
            r4.zzE = r3     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            com.google.android.gms.internal.ads.zzhs r6 = r4.zzg     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            java.nio.ByteBuffer r6 = r6.zzc     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r6 == 0) goto L_0x0462
            r7 = r6
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            byte[] r7 = zzb     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r6.put(r7)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            int r6 = r4.zzK     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r9 = 0
            r11 = 0
            r7 = 0
            r8 = 38
            r5.zzk(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r26.zzas()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r4.zzW = r13     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            goto L_0x05e3
        L_0x0462:
            throw r17     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
        L_0x0463:
            r0 = move-exception
            r2 = r0
            r1 = r13
            goto L_0x0641
        L_0x0468:
            r3 = 0
            int r6 = r4.zzT     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            if (r6 != r13) goto L_0x049b
            r14 = r3
        L_0x046e:
            com.google.android.gms.internal.ads.zzz r6 = r4.zzu     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r6 == 0) goto L_0x049a
            r7 = r6
            com.google.android.gms.internal.ads.zzz r7 = (com.google.android.gms.internal.ads.zzz) r7     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            java.util.List r6 = r6.zzr     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            int r6 = r6.size()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r14 >= r6) goto L_0x0497
            com.google.android.gms.internal.ads.zzz r6 = r4.zzu     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            java.util.List r6 = r6.zzr     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            java.lang.Object r6 = r6.get(r14)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            byte[] r6 = (byte[]) r6     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            com.google.android.gms.internal.ads.zzhs r7 = r4.zzg     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            java.nio.ByteBuffer r7 = r7.zzc     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r7 == 0) goto L_0x0496
            r8 = r7
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r7.put(r6)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            int r14 = r14 + 1
            goto L_0x046e
        L_0x0496:
            throw r17     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
        L_0x0497:
            r4.zzT = r12     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            goto L_0x049b
        L_0x049a:
            throw r17     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
        L_0x049b:
            com.google.android.gms.internal.ads.zzhs r6 = r4.zzg     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            java.nio.ByteBuffer r7 = r6.zzc     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            if (r7 == 0) goto L_0x05eb
            r8 = r7
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            int r7 = r7.position()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            com.google.android.gms.internal.ads.zzkv r8 = r26.zzl()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            int r6 = r4.zzcV(r8, r6, r3)     // Catch:{ zzhr -> 0x05d8 }
            r9 = -3
            if (r6 != r9) goto L_0x04bf
            boolean r1 = r26.zzR()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r1 == 0) goto L_0x05ed
            long r1 = r4.zzZ     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r4.zzaa = r1     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            goto L_0x05ed
        L_0x04bf:
            r14 = -5
            if (r6 != r14) goto L_0x04d2
            int r5 = r4.zzT     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r5 != r12) goto L_0x04cd
            com.google.android.gms.internal.ads.zzhs r5 = r4.zzg     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r5.zzb()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r4.zzT = r13     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
        L_0x04cd:
            r4.zzae(r8)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            goto L_0x05e3
        L_0x04d2:
            com.google.android.gms.internal.ads.zzhs r6 = r4.zzg     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            boolean r8 = r6.zzf()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            if (r8 == 0) goto L_0x0507
            long r1 = r4.zzZ     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r4.zzaa = r1     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            int r1 = r4.zzT     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r1 != r12) goto L_0x04e7
            r6.zzb()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r4.zzT = r13     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
        L_0x04e7:
            r4.zzab = r13     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            boolean r1 = r4.zzW     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r1 != 0) goto L_0x04f2
            r26.zzai()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            goto L_0x05ed
        L_0x04f2:
            boolean r1 = r4.zzG     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r1 != 0) goto L_0x05ed
            r4.zzX = r13     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            int r6 = r4.zzK     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r9 = 0
            r11 = 4
            r7 = 0
            r8 = 0
            r5.zzk(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r26.zzas()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            goto L_0x05ed
        L_0x0507:
            boolean r8 = r4.zzW     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            if (r8 != 0) goto L_0x051c
            boolean r8 = r6.zzg()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r8 != 0) goto L_0x051c
            r6.zzb()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            int r5 = r4.zzT     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r5 != r12) goto L_0x05e3
            r4.zzT = r13     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            goto L_0x05e3
        L_0x051c:
            boolean r8 = r4.zzaU(r6)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            if (r8 != 0) goto L_0x05e3
            boolean r8 = r6.zzl()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            if (r8 == 0) goto L_0x052d
            com.google.android.gms.internal.ads.zzhp r9 = r6.zzb     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r9.zzb(r7)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
        L_0x052d:
            long r9 = r6.zze     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            boolean r7 = r4.zzad     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            if (r7 == 0) goto L_0x0561
            java.util.ArrayDeque r7 = r4.zzk     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            boolean r11 = r7.isEmpty()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r11 != 0) goto L_0x054f
            java.lang.Object r7 = r7.peekLast()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            com.google.android.gms.internal.ads.zztn r7 = (com.google.android.gms.internal.ads.zztn) r7     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            com.google.android.gms.internal.ads.zzet r7 = r7.zze     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            com.google.android.gms.internal.ads.zzz r11 = r4.zzm     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r11 == 0) goto L_0x054e
            r15 = r11
            com.google.android.gms.internal.ads.zzz r15 = (com.google.android.gms.internal.ads.zzz) r15     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r7.zzd(r9, r11)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            goto L_0x055d
        L_0x054e:
            throw r17     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
        L_0x054f:
            com.google.android.gms.internal.ads.zztn r7 = r4.zzae     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            com.google.android.gms.internal.ads.zzet r7 = r7.zze     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            com.google.android.gms.internal.ads.zzz r11 = r4.zzm     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r11 == 0) goto L_0x0560
            r15 = r11
            com.google.android.gms.internal.ads.zzz r15 = (com.google.android.gms.internal.ads.zzz) r15     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            r7.zzd(r9, r11)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
        L_0x055d:
            r4.zzad = r3     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            goto L_0x0561
        L_0x0560:
            throw r17     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
        L_0x0561:
            long r14 = r4.zzZ     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            long r14 = java.lang.Math.max(r14, r9)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            r4.zzZ = r14     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            boolean r7 = r26.zzR()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            if (r7 != 0) goto L_0x0575
            boolean r7 = r6.zzh()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
            if (r7 == 0) goto L_0x0577
        L_0x0575:
            r4.zzaa = r14     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
        L_0x0577:
            r6.zzk()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            boolean r7 = r6.zze()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            if (r7 == 0) goto L_0x0583
            r4.zzan(r6)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x0463 }
        L_0x0583:
            r4.zzaL(r6)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            int r11 = r4.zzay(r6)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            r14 = 34
            if (r7 < r14) goto L_0x0594
            r7 = r11 & 32
            if (r7 != 0) goto L_0x05a1
        L_0x0594:
            r26.zzo()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            long r14 = r4.zzak     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            long r12 = r6.zze     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            long r12 = java.lang.Math.max(r14, r12)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            r4.zzak = r12     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
        L_0x05a1:
            if (r8 == 0) goto L_0x05b1
            r7 = r5
            com.google.android.gms.internal.ads.zztf r7 = (com.google.android.gms.internal.ads.zztf) r7     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            int r7 = r4.zzK     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            com.google.android.gms.internal.ads.zzhp r8 = r6.zzb     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            r12 = 0
            r6 = r7
            r7 = r12
            r5.zzl(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            goto L_0x05c7
        L_0x05b1:
            r7 = r5
            com.google.android.gms.internal.ads.zztf r7 = (com.google.android.gms.internal.ads.zztf) r7     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            int r7 = r4.zzK     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            java.nio.ByteBuffer r6 = r6.zzc     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            if (r6 == 0) goto L_0x05d7
            r8 = r6
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            int r8 = r6.limit()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            r12 = 0
            r6 = r7
            r7 = r12
            r5.zzk(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
        L_0x05c7:
            r26.zzas()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            r5 = 1
            r4.zzW = r5     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            r4.zzT = r3     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            com.google.android.gms.internal.ads.zzid r6 = r4.zza     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            int r7 = r6.zzc     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            int r7 = r7 + r5
            r6.zzc = r7     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            goto L_0x05e3
        L_0x05d7:
            throw r17     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
        L_0x05d8:
            r0 = move-exception
            r5 = r0
            r4.zzao(r5)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            r4.zzbh(r3)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            r26.zzah()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
        L_0x05e3:
            boolean r5 = r4.zzbi(r1)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            if (r5 == 0) goto L_0x05ed
            goto L_0x03f1
        L_0x05eb:
            throw r17     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
        L_0x05ec:
            r3 = 0
        L_0x05ed:
            android.os.Trace.endSection()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
            r1 = 1
            goto L_0x0627
        L_0x05f2:
            r0 = move-exception
            r3 = 0
            goto L_0x0613
        L_0x05f5:
            r0 = move-exception
            r3 = 0
            goto L_0x068d
        L_0x05f9:
            r0 = move-exception
            r3 = 0
            r4 = r26
            goto L_0x0613
        L_0x05fe:
            r0 = move-exception
            r3 = 0
            r4 = r26
            goto L_0x068d
        L_0x0604:
            r3 = r12
            r4 = r15
            r17 = 0
            throw r17     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
        L_0x0609:
            r3 = r12
            r17 = r14
            r4 = r15
            throw r17     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x060e }
        L_0x060e:
            r0 = move-exception
            goto L_0x0613
        L_0x0610:
            r0 = move-exception
            r3 = r12
            r4 = r15
        L_0x0613:
            r2 = r0
            r1 = 1
            goto L_0x0641
        L_0x0616:
            r3 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzid r1 = r4.zza     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x062f }
            int r2 = r1.zzd     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x062f }
            int r5 = r26.zzd(r27)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x062f }
            int r2 = r2 + r5
            r1.zzd = r2     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x062f }
            r1 = 1
            r4.zzbh(r1)     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x062d }
        L_0x0627:
            com.google.android.gms.internal.ads.zzid r2 = r4.zza     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x062d }
            r2.zza()     // Catch:{ CryptoException -> 0x0632, IllegalStateException -> 0x062d }
            return
        L_0x062d:
            r0 = move-exception
            goto L_0x0640
        L_0x062f:
            r0 = move-exception
            r1 = 1
            goto L_0x0640
        L_0x0632:
            r0 = move-exception
            goto L_0x068d
        L_0x0635:
            r0 = move-exception
            r3 = r12
            r1 = r13
            goto L_0x063f
        L_0x0639:
            r0 = move-exception
            r3 = r12
            goto L_0x068c
        L_0x063c:
            r0 = move-exception
            r1 = r13
            r3 = r14
        L_0x063f:
            r4 = r15
        L_0x0640:
            r2 = r0
        L_0x0641:
            boolean r5 = r2 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L_0x0646
            goto L_0x065b
        L_0x0646:
            java.lang.StackTraceElement[] r6 = r2.getStackTrace()
            int r7 = r6.length
            if (r7 <= 0) goto L_0x0689
            r6 = r6[r3]
            java.lang.String r6 = r6.getClassName()
            java.lang.String r7 = "android.media.MediaCodec"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0689
        L_0x065b:
            r4.zzao(r2)
            if (r5 == 0) goto L_0x066b
            r5 = r2
            android.media.MediaCodec$CodecException r5 = (android.media.MediaCodec.CodecException) r5
            boolean r5 = r5.isRecoverable()
            if (r5 == 0) goto L_0x066b
            r14 = r1
            goto L_0x066c
        L_0x066b:
            r14 = r3
        L_0x066c:
            if (r14 == 0) goto L_0x0671
            r26.zzaM()
        L_0x0671:
            com.google.android.gms.internal.ads.zzti r1 = r4.zzA
            com.google.android.gms.internal.ads.zzth r1 = r4.zzaG(r2, r1)
            int r2 = r1.zza
            r3 = 1101(0x44d, float:1.543E-42)
            if (r2 != r3) goto L_0x0680
            r2 = 4006(0xfa6, float:5.614E-42)
            goto L_0x0682
        L_0x0680:
            r2 = 4003(0xfa3, float:5.61E-42)
        L_0x0682:
            com.google.android.gms.internal.ads.zzz r3 = r4.zzm
            com.google.android.gms.internal.ads.zzin r1 = r4.zzk(r1, r3, r14, r2)
            throw r1
        L_0x0689:
            throw r2
        L_0x068a:
            r0 = move-exception
            r3 = r14
        L_0x068c:
            r4 = r15
        L_0x068d:
            r1 = r0
        L_0x068e:
            com.google.android.gms.internal.ads.zzz r2 = r4.zzm
            int r5 = r1.getErrorCode()
            int r5 = com.google.android.gms.internal.ads.zzex.zzl(r5)
            com.google.android.gms.internal.ads.zzin r1 = r4.zzk(r1, r2, r3, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzW(long, long):void");
    }

    public boolean zzX() {
        return this.zzac;
    }

    public boolean zzY() {
        if (this.zzm == null) {
            return false;
        }
        if (zzT() || zzbf()) {
            return true;
        }
        return this.zzJ != -9223372036854775807L && zzcX().zzb() < this.zzJ;
    }

    public final int zzZ(zzz zzz2) throws zzin {
        try {
            return zzab(this.zzd, zzz2);
        } catch (zztw e) {
            throw zzk(e, zzz2, false, 4002);
        }
    }

    /* access modifiers changed from: protected */
    public final long zzaA() {
        return this.zzae.zzd;
    }

    /* access modifiers changed from: protected */
    public final long zzaB() {
        return this.zzae.zzc;
    }

    /* access modifiers changed from: protected */
    public final MediaFormat zzaC() {
        return this.zzv;
    }

    /* access modifiers changed from: protected */
    public final zzlz zzaE() {
        return this.zzo;
    }

    /* access modifiers changed from: protected */
    public final zztf zzaF() {
        return this.zzt;
    }

    /* access modifiers changed from: protected */
    public zzth zzaG(Throwable th, zzti zzti) {
        return new zzth(th, zzti);
    }

    /* access modifiers changed from: protected */
    public final zzti zzaH() {
        return this.zzA;
    }

    public final void zzaI() {
        this.zzah = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: com.google.android.gms.internal.ads.zzti} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: com.google.android.gms.internal.ads.zzti} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: com.google.android.gms.internal.ads.zzz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: com.google.android.gms.internal.ads.zzti} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: com.google.android.gms.internal.ads.zzti} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: com.google.android.gms.internal.ads.zzz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: com.google.android.gms.internal.ads.zzti} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: com.google.android.gms.internal.ads.zzti} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v35, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: com.google.android.gms.internal.ads.zztp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v42, resolved type: com.google.android.gms.internal.ads.zzti} */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [com.google.android.gms.internal.ads.zzto, android.media.MediaCrypto] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r10v28 */
    /* JADX WARNING: type inference failed for: r10v33 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x04e0 A[Catch:{ Exception -> 0x0516 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0562 A[Catch:{ zztl -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0565 A[Catch:{ zztl -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0571 A[Catch:{ zztl -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0512 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x057e A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzaJ() throws com.google.android.gms.internal.ads.zzin {
        /*
            r27 = this;
            r8 = r27
            java.lang.String r9 = "MediaCodecRenderer"
            com.google.android.gms.internal.ads.zztf r0 = r8.zzt
            if (r0 != 0) goto L_0x05b6
            boolean r0 = r8.zzP
            if (r0 != 0) goto L_0x05b6
            com.google.android.gms.internal.ads.zzz r10 = r8.zzm
            if (r10 != 0) goto L_0x0012
            goto L_0x05b6
        L_0x0012:
            boolean r0 = r8.zzaS(r10)
            r11 = 1
            if (r0 == 0) goto L_0x0046
            r27.zzaf()
            java.lang.String r0 = r10.zzo
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x003c
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x003c
            java.lang.String r1 = "audio/opus"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003c
            com.google.android.gms.internal.ads.zzsw r0 = r8.zzi
            r0.zzo(r11)
            goto L_0x0043
        L_0x003c:
            com.google.android.gms.internal.ads.zzsw r0 = r8.zzi
            r1 = 32
            r0.zzo(r1)
        L_0x0043:
            r8.zzP = r11
            return
        L_0x0046:
            com.google.android.gms.internal.ads.zzsi r0 = r8.zzam
            r8.zzal = r0
            if (r0 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.zzdd.zzf(r11)
            com.google.android.gms.internal.ads.zzsi r0 = r8.zzal
            boolean r1 = com.google.android.gms.internal.ads.zzsj.zza
            r0.zza()
        L_0x0056:
            r12 = 0
            com.google.android.gms.internal.ads.zzz r13 = r8.zzm     // Catch:{ zztl -> 0x05a8 }
            r14 = 0
            if (r13 == 0) goto L_0x05a1
            r0 = r13
            com.google.android.gms.internal.ads.zzz r0 = (com.google.android.gms.internal.ads.zzz) r0     // Catch:{ zztl -> 0x05a8 }
            java.util.ArrayDeque r0 = r8.zzy     // Catch:{ zztl -> 0x05a8 }
            if (r0 != 0) goto L_0x0091
            com.google.android.gms.internal.ads.zztr r0 = r8.zzd     // Catch:{ zztw -> 0x0087 }
            java.util.List r0 = r8.zzak(r0, r13, r12)     // Catch:{ zztw -> 0x0087 }
            r0.isEmpty()     // Catch:{ zztw -> 0x0087 }
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch:{ zztw -> 0x0087 }
            r1.<init>()     // Catch:{ zztw -> 0x0087 }
            r8.zzy = r1     // Catch:{ zztw -> 0x0087 }
            boolean r1 = r0.isEmpty()     // Catch:{ zztw -> 0x0087 }
            if (r1 != 0) goto L_0x0084
            java.util.ArrayDeque r1 = r8.zzy     // Catch:{ zztw -> 0x0087 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ zztw -> 0x0087 }
            com.google.android.gms.internal.ads.zzti r0 = (com.google.android.gms.internal.ads.zzti) r0     // Catch:{ zztw -> 0x0087 }
            r1.add(r0)     // Catch:{ zztw -> 0x0087 }
        L_0x0084:
            r8.zzz = r14     // Catch:{ zztw -> 0x0087 }
            goto L_0x0091
        L_0x0087:
            r0 = move-exception
            com.google.android.gms.internal.ads.zztl r1 = new com.google.android.gms.internal.ads.zztl     // Catch:{ zztl -> 0x05a8 }
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.android.gms.internal.ads.zzz) r13, (java.lang.Throwable) r0, (boolean) r12, (int) r2)     // Catch:{ zztl -> 0x05a8 }
            throw r1     // Catch:{ zztl -> 0x05a8 }
        L_0x0091:
            java.util.ArrayDeque r0 = r8.zzy     // Catch:{ zztl -> 0x05a8 }
            boolean r0 = r0.isEmpty()     // Catch:{ zztl -> 0x05a8 }
            if (r0 != 0) goto L_0x0592
            java.util.ArrayDeque r15 = r8.zzy     // Catch:{ zztl -> 0x05a8 }
            if (r15 == 0) goto L_0x058d
            r0 = r15
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ zztl -> 0x05a8 }
        L_0x00a0:
            com.google.android.gms.internal.ads.zztf r0 = r8.zzt     // Catch:{ zztl -> 0x05a8 }
            if (r0 != 0) goto L_0x0586
            java.lang.Object r0 = r15.peekFirst()     // Catch:{ zztl -> 0x05a8 }
            r6 = r0
            com.google.android.gms.internal.ads.zzti r6 = (com.google.android.gms.internal.ads.zzti) r6     // Catch:{ zztl -> 0x05a8 }
            if (r6 == 0) goto L_0x0581
            r0 = r6
            com.google.android.gms.internal.ads.zzti r0 = (com.google.android.gms.internal.ads.zzti) r0     // Catch:{ zztl -> 0x05a8 }
            r8.zzaT(r13)     // Catch:{ zztl -> 0x05a8 }
            boolean r0 = r8.zzaW(r6)     // Catch:{ zztl -> 0x05a8 }
            if (r0 == 0) goto L_0x05b6
            r8.zzA = r6     // Catch:{ Exception -> 0x0539 }
            com.google.android.gms.internal.ads.zzz r0 = r8.zzm     // Catch:{ Exception -> 0x0539 }
            if (r0 == 0) goto L_0x052a
            r1 = r0
            com.google.android.gms.internal.ads.zzz r1 = (com.google.android.gms.internal.ads.zzz) r1     // Catch:{ Exception -> 0x0539 }
            java.lang.String r2 = r6.zza     // Catch:{ Exception -> 0x0539 }
            float r1 = r8.zzs     // Catch:{ Exception -> 0x0539 }
            com.google.android.gms.internal.ads.zzz[] r3 = r27.zzU()     // Catch:{ Exception -> 0x0539 }
            float r1 = r8.zzaa(r1, r0, r3)     // Catch:{ Exception -> 0x0539 }
            float r3 = r8.zze     // Catch:{ Exception -> 0x0539 }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x00d6
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00d6:
            com.google.android.gms.internal.ads.zzdj r3 = r27.zzcX()     // Catch:{ Exception -> 0x0539 }
            long r16 = r3.zzb()     // Catch:{ Exception -> 0x0539 }
            com.google.android.gms.internal.ads.zztc r3 = r8.zzaj(r6, r0, r14, r1)     // Catch:{ Exception -> 0x0539 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0539 }
            r7 = 31
            if (r5 < r7) goto L_0x0103
            com.google.android.gms.internal.ads.zzph r5 = r27.zzp()     // Catch:{ Exception -> 0x0539 }
            android.media.metrics.LogSessionId r5 = r5.zza()     // Catch:{ Exception -> 0x0539 }
            android.media.metrics.LogSessionId r7 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE     // Catch:{ Exception -> 0x0539 }
            boolean r7 = r5.equals(r7)     // Catch:{ Exception -> 0x0539 }
            if (r7 != 0) goto L_0x0103
            android.media.MediaFormat r7 = r3.zzb     // Catch:{ Exception -> 0x0539 }
            java.lang.String r12 = "log-session-id"
            java.lang.String r5 = r5.getStringId()     // Catch:{ Exception -> 0x0539 }
            r7.setString(r12, r5)     // Catch:{ Exception -> 0x0539 }
        L_0x0103:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x051a }
            r5.<init>()     // Catch:{ all -> 0x051a }
            java.lang.String r7 = "createCodec:"
            r5.append(r7)     // Catch:{ all -> 0x051a }
            r5.append(r2)     // Catch:{ all -> 0x051a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x051a }
            android.os.Trace.beginSection(r5)     // Catch:{ all -> 0x051a }
            com.google.android.gms.internal.ads.zztd r5 = r8.zzc     // Catch:{ all -> 0x051a }
            com.google.android.gms.internal.ads.zztf r5 = r5.zzd(r3)     // Catch:{ all -> 0x051a }
            r8.zzt = r5     // Catch:{ all -> 0x051a }
            com.google.android.gms.internal.ads.zztm r7 = new com.google.android.gms.internal.ads.zztm     // Catch:{ all -> 0x051a }
            r7.<init>(r8, r14)     // Catch:{ all -> 0x051a }
            boolean r5 = r5.zzs(r7)     // Catch:{ all -> 0x051a }
            r8.zzI = r5     // Catch:{ all -> 0x051a }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0539 }
            com.google.android.gms.internal.ads.zzdj r5 = r27.zzcX()     // Catch:{ Exception -> 0x0539 }
            long r18 = r5.zzb()     // Catch:{ Exception -> 0x0539 }
            boolean r5 = r6.zzf(r0)     // Catch:{ Exception -> 0x0539 }
            if (r5 != 0) goto L_0x0462
            java.lang.String r5 = "Format exceeds selected codec's capabilities [%s, %s]"
            java.lang.String r12 = ","
            r20 = r12
            java.lang.String r20 = (java.lang.String) r20     // Catch:{ Exception -> 0x0455 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0455 }
            r14.<init>()     // Catch:{ Exception -> 0x0455 }
            java.lang.String r7 = "id="
            r14.append(r7)     // Catch:{ Exception -> 0x0455 }
            java.lang.String r7 = r0.zza     // Catch:{ Exception -> 0x0455 }
            r14.append(r7)     // Catch:{ Exception -> 0x0455 }
            java.lang.String r7 = ", mimeType="
            r14.append(r7)     // Catch:{ Exception -> 0x0455 }
            java.lang.String r7 = r0.zzo     // Catch:{ Exception -> 0x0455 }
            r14.append(r7)     // Catch:{ Exception -> 0x0455 }
            java.lang.String r7 = r0.zzn     // Catch:{ Exception -> 0x0455 }
            if (r7 == 0) goto L_0x0172
            java.lang.String r11 = ", container="
            r14.append(r11)     // Catch:{ Exception -> 0x0169 }
            r14.append(r7)     // Catch:{ Exception -> 0x0169 }
            goto L_0x0172
        L_0x0169:
            r0 = move-exception
            r11 = r6
            r21 = r10
        L_0x016d:
            r23 = r13
        L_0x016f:
            r10 = 1
            goto L_0x0540
        L_0x0172:
            int r7 = r0.zzj     // Catch:{ Exception -> 0x0455 }
            r11 = -1
            if (r7 == r11) goto L_0x017f
            java.lang.String r4 = ", bitrate="
            r14.append(r4)     // Catch:{ Exception -> 0x0169 }
            r14.append(r7)     // Catch:{ Exception -> 0x0169 }
        L_0x017f:
            java.lang.String r4 = r0.zzk     // Catch:{ Exception -> 0x0455 }
            if (r4 == 0) goto L_0x018b
            java.lang.String r7 = ", codecs="
            r14.append(r7)     // Catch:{ Exception -> 0x0169 }
            r14.append(r4)     // Catch:{ Exception -> 0x0169 }
        L_0x018b:
            com.google.android.gms.internal.ads.zzs r4 = r0.zzs     // Catch:{ Exception -> 0x0455 }
            if (r4 == 0) goto L_0x022e
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet     // Catch:{ Exception -> 0x0226 }
            r7.<init>()     // Catch:{ Exception -> 0x0226 }
            r21 = r10
            r11 = 0
        L_0x0197:
            int r10 = r4.zzb     // Catch:{ Exception -> 0x0224 }
            if (r11 >= r10) goto L_0x0214
            com.google.android.gms.internal.ads.zzr r10 = r4.zza(r11)     // Catch:{ Exception -> 0x0224 }
            java.util.UUID r10 = r10.zza     // Catch:{ Exception -> 0x0224 }
            r22 = r4
            java.util.UUID r4 = com.google.android.gms.internal.ads.zzh.zzb     // Catch:{ Exception -> 0x0224 }
            boolean r4 = r10.equals(r4)     // Catch:{ Exception -> 0x0224 }
            if (r4 == 0) goto L_0x01b6
            java.lang.String r4 = "cenc"
            r7.add(r4)     // Catch:{ Exception -> 0x01b3 }
        L_0x01b0:
            r23 = r13
            goto L_0x020d
        L_0x01b3:
            r0 = move-exception
            r11 = r6
            goto L_0x016d
        L_0x01b6:
            java.util.UUID r4 = com.google.android.gms.internal.ads.zzh.zzc     // Catch:{ Exception -> 0x0224 }
            boolean r4 = r10.equals(r4)     // Catch:{ Exception -> 0x0224 }
            if (r4 == 0) goto L_0x01c4
            java.lang.String r4 = "clearkey"
            r7.add(r4)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x01b0
        L_0x01c4:
            java.util.UUID r4 = com.google.android.gms.internal.ads.zzh.zze     // Catch:{ Exception -> 0x0224 }
            boolean r4 = r10.equals(r4)     // Catch:{ Exception -> 0x0224 }
            if (r4 == 0) goto L_0x01d2
            java.lang.String r4 = "playready"
            r7.add(r4)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x01b0
        L_0x01d2:
            java.util.UUID r4 = com.google.android.gms.internal.ads.zzh.zzd     // Catch:{ Exception -> 0x0224 }
            boolean r4 = r10.equals(r4)     // Catch:{ Exception -> 0x0224 }
            if (r4 == 0) goto L_0x01e0
            java.lang.String r4 = "widevine"
            r7.add(r4)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x01b0
        L_0x01e0:
            java.util.UUID r4 = com.google.android.gms.internal.ads.zzh.zza     // Catch:{ Exception -> 0x0224 }
            boolean r4 = r10.equals(r4)     // Catch:{ Exception -> 0x0224 }
            if (r4 == 0) goto L_0x01ee
            java.lang.String r4 = "universal"
            r7.add(r4)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x01b0
        L_0x01ee:
            java.lang.String r4 = r10.toString()     // Catch:{ Exception -> 0x0224 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0224 }
            r10.<init>()     // Catch:{ Exception -> 0x0224 }
            r23 = r13
            java.lang.String r13 = "unknown ("
            r10.append(r13)     // Catch:{ Exception -> 0x024c }
            r10.append(r4)     // Catch:{ Exception -> 0x024c }
            java.lang.String r4 = ")"
            r10.append(r4)     // Catch:{ Exception -> 0x024c }
            java.lang.String r4 = r10.toString()     // Catch:{ Exception -> 0x024c }
            r7.add(r4)     // Catch:{ Exception -> 0x024c }
        L_0x020d:
            int r11 = r11 + 1
            r4 = r22
            r13 = r23
            goto L_0x0197
        L_0x0214:
            r23 = r13
            java.lang.String r4 = ", drm=["
            r14.append(r4)     // Catch:{ Exception -> 0x024c }
            com.google.android.gms.internal.ads.zzfvh.zzb(r14, r7, r12)     // Catch:{ Exception -> 0x024c }
            r4 = 93
            r14.append(r4)     // Catch:{ Exception -> 0x024c }
            goto L_0x0232
        L_0x0224:
            r0 = move-exception
            goto L_0x0229
        L_0x0226:
            r0 = move-exception
            r21 = r10
        L_0x0229:
            r23 = r13
        L_0x022b:
            r11 = r6
            goto L_0x016f
        L_0x022e:
            r21 = r10
            r23 = r13
        L_0x0232:
            int r4 = r0.zzv     // Catch:{ Exception -> 0x0451 }
            java.lang.String r7 = "x"
            r10 = -1
            if (r4 == r10) goto L_0x024e
            int r11 = r0.zzw     // Catch:{ Exception -> 0x024c }
            if (r11 == r10) goto L_0x024e
            java.lang.String r10 = ", res="
            r14.append(r10)     // Catch:{ Exception -> 0x024c }
            r14.append(r4)     // Catch:{ Exception -> 0x024c }
            r14.append(r7)     // Catch:{ Exception -> 0x024c }
            r14.append(r11)     // Catch:{ Exception -> 0x024c }
            goto L_0x024e
        L_0x024c:
            r0 = move-exception
            goto L_0x022b
        L_0x024e:
            int r4 = r0.zzx     // Catch:{ Exception -> 0x0451 }
            r10 = -1
            if (r4 == r10) goto L_0x0265
            int r11 = r0.zzy     // Catch:{ Exception -> 0x024c }
            if (r11 == r10) goto L_0x0265
            java.lang.String r10 = ", decRes="
            r14.append(r10)     // Catch:{ Exception -> 0x024c }
            r14.append(r4)     // Catch:{ Exception -> 0x024c }
            r14.append(r7)     // Catch:{ Exception -> 0x024c }
            r14.append(r11)     // Catch:{ Exception -> 0x024c }
        L_0x0265:
            float r4 = r0.zzB     // Catch:{ Exception -> 0x0451 }
            double r10 = (double) r4     // Catch:{ Exception -> 0x0451 }
            int r7 = com.google.android.gms.internal.ads.zzgbj.zza     // Catch:{ Exception -> 0x0451 }
            r24 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r13 = r6
            double r6 = r10 + r24
            r22 = r9
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = java.lang.Math.copySign(r6, r8)     // Catch:{ Exception -> 0x044d }
            r24 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r6 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            if (r6 <= 0) goto L_0x02b4
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x02b4
            boolean r6 = java.lang.Double.isNaN(r10)     // Catch:{ Exception -> 0x02ab }
            if (r6 == 0) goto L_0x0290
            boolean r6 = java.lang.Double.isNaN(r8)     // Catch:{ Exception -> 0x02ab }
            if (r6 != 0) goto L_0x02b4
        L_0x0290:
            java.lang.String r6 = ", par="
            r14.append(r6)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r6 = "%.3f"
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x02ab }
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch:{ Exception -> 0x02ab }
            java.lang.String r7 = com.google.android.gms.internal.ads.zzex.zza     // Catch:{ Exception -> 0x02ab }
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ Exception -> 0x02ab }
            java.lang.String r4 = java.lang.String.format(r7, r6, r4)     // Catch:{ Exception -> 0x02ab }
            r14.append(r4)     // Catch:{ Exception -> 0x02ab }
            goto L_0x02b4
        L_0x02ab:
            r0 = move-exception
            r10 = 1
            r9 = r27
            r11 = r13
            r8 = r22
            goto L_0x0545
        L_0x02b4:
            com.google.android.gms.internal.ads.zzk r4 = r0.zzE     // Catch:{ Exception -> 0x044d }
            if (r4 == 0) goto L_0x02d0
            boolean r6 = r4.zze()     // Catch:{ Exception -> 0x02ab }
            if (r6 != 0) goto L_0x02c4
            boolean r6 = r4.zzf()     // Catch:{ Exception -> 0x02ab }
            if (r6 == 0) goto L_0x02d0
        L_0x02c4:
            java.lang.String r6 = ", color="
            r14.append(r6)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r4 = r4.zzd()     // Catch:{ Exception -> 0x02ab }
            r14.append(r4)     // Catch:{ Exception -> 0x02ab }
        L_0x02d0:
            float r4 = r0.zzz     // Catch:{ Exception -> 0x044d }
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x02e0
            java.lang.String r6 = ", fps="
            r14.append(r6)     // Catch:{ Exception -> 0x02ab }
            r14.append(r4)     // Catch:{ Exception -> 0x02ab }
        L_0x02e0:
            int r4 = r0.zzF     // Catch:{ Exception -> 0x044d }
            r6 = -1
            if (r4 == r6) goto L_0x02ed
            java.lang.String r6 = ", maxSubLayers="
            r14.append(r6)     // Catch:{ Exception -> 0x02ab }
            r14.append(r4)     // Catch:{ Exception -> 0x02ab }
        L_0x02ed:
            int r4 = r0.zzG     // Catch:{ Exception -> 0x044d }
            r6 = -1
            if (r4 == r6) goto L_0x02fa
            java.lang.String r6 = ", channels="
            r14.append(r6)     // Catch:{ Exception -> 0x02ab }
            r14.append(r4)     // Catch:{ Exception -> 0x02ab }
        L_0x02fa:
            int r4 = r0.zzH     // Catch:{ Exception -> 0x044d }
            r6 = -1
            if (r4 == r6) goto L_0x0307
            java.lang.String r6 = ", sample_rate="
            r14.append(r6)     // Catch:{ Exception -> 0x02ab }
            r14.append(r4)     // Catch:{ Exception -> 0x02ab }
        L_0x0307:
            java.lang.String r4 = r0.zzd     // Catch:{ Exception -> 0x044d }
            if (r4 == 0) goto L_0x0313
            java.lang.String r6 = ", language="
            r14.append(r6)     // Catch:{ Exception -> 0x02ab }
            r14.append(r4)     // Catch:{ Exception -> 0x02ab }
        L_0x0313:
            java.util.List r4 = r0.zzc     // Catch:{ Exception -> 0x044d }
            boolean r6 = r4.isEmpty()     // Catch:{ Exception -> 0x044d }
            java.lang.String r7 = "]"
            if (r6 != 0) goto L_0x0331
            java.lang.String r6 = ", labels=["
            r14.append(r6)     // Catch:{ Exception -> 0x02ab }
            com.google.android.gms.internal.ads.zzw r6 = new com.google.android.gms.internal.ads.zzw     // Catch:{ Exception -> 0x02ab }
            r6.<init>()     // Catch:{ Exception -> 0x02ab }
            java.util.List r4 = com.google.android.gms.internal.ads.zzfzg.zzc(r4, r6)     // Catch:{ Exception -> 0x02ab }
            com.google.android.gms.internal.ads.zzfvh.zzb(r14, r4, r12)     // Catch:{ Exception -> 0x02ab }
            r14.append(r7)     // Catch:{ Exception -> 0x02ab }
        L_0x0331:
            int r4 = r0.zze     // Catch:{ Exception -> 0x044d }
            if (r4 == 0) goto L_0x0359
            java.lang.String r6 = ", selectionFlags=["
            r14.append(r6)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r6 = com.google.android.gms.internal.ads.zzex.zza     // Catch:{ Exception -> 0x02ab }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x02ab }
            r6.<init>()     // Catch:{ Exception -> 0x02ab }
            r8 = r4 & 1
            if (r8 == 0) goto L_0x034a
            java.lang.String r8 = "default"
            r6.add(r8)     // Catch:{ Exception -> 0x02ab }
        L_0x034a:
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0353
            java.lang.String r4 = "forced"
            r6.add(r4)     // Catch:{ Exception -> 0x02ab }
        L_0x0353:
            com.google.android.gms.internal.ads.zzfvh.zzb(r14, r6, r12)     // Catch:{ Exception -> 0x02ab }
            r14.append(r7)     // Catch:{ Exception -> 0x02ab }
        L_0x0359:
            int r4 = r0.zzf     // Catch:{ Exception -> 0x044d }
            r6 = 32768(0x8000, float:4.5918E-41)
            if (r4 == 0) goto L_0x0402
            java.lang.String r8 = ", roleFlags=["
            r14.append(r8)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r8 = com.google.android.gms.internal.ads.zzex.zza     // Catch:{ Exception -> 0x02ab }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x02ab }
            r8.<init>()     // Catch:{ Exception -> 0x02ab }
            r9 = r4 & 1
            if (r9 == 0) goto L_0x0375
            java.lang.String r9 = "main"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x0375:
            r9 = r4 & 2
            if (r9 == 0) goto L_0x037e
            java.lang.String r9 = "alt"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x037e:
            r9 = r4 & 4
            if (r9 == 0) goto L_0x0387
            java.lang.String r9 = "supplementary"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x0387:
            r9 = r4 & 8
            if (r9 == 0) goto L_0x0390
            java.lang.String r9 = "commentary"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x0390:
            r9 = r4 & 16
            if (r9 == 0) goto L_0x0399
            java.lang.String r9 = "dub"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x0399:
            r9 = r4 & 32
            if (r9 == 0) goto L_0x03a2
            java.lang.String r9 = "emergency"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x03a2:
            r9 = r4 & 64
            if (r9 == 0) goto L_0x03ab
            java.lang.String r9 = "caption"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x03ab:
            r9 = r4 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x03b4
            java.lang.String r9 = "subtitle"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x03b4:
            r9 = r4 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x03bd
            java.lang.String r9 = "sign"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x03bd:
            r9 = r4 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x03c6
            java.lang.String r9 = "describes-video"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x03c6:
            r9 = r4 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x03cf
            java.lang.String r9 = "describes-music"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x03cf:
            r9 = r4 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x03d8
            java.lang.String r9 = "enhanced-intelligibility"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x03d8:
            r9 = r4 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x03e1
            java.lang.String r9 = "transcribes-dialog"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x03e1:
            r9 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x03ea
            java.lang.String r9 = "easy-read"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x03ea:
            r9 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x03f3
            java.lang.String r9 = "trick-play"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x03f3:
            r9 = r4 & r6
            if (r9 == 0) goto L_0x03fc
            java.lang.String r9 = "auxiliary"
            r8.add(r9)     // Catch:{ Exception -> 0x02ab }
        L_0x03fc:
            com.google.android.gms.internal.ads.zzfvh.zzb(r14, r8, r12)     // Catch:{ Exception -> 0x02ab }
            r14.append(r7)     // Catch:{ Exception -> 0x02ab }
        L_0x0402:
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0435
            java.lang.String r4 = ", auxiliaryTrackType="
            r14.append(r4)     // Catch:{ Exception -> 0x02ab }
            int r4 = r0.zzg     // Catch:{ Exception -> 0x02ab }
            java.lang.String r6 = com.google.android.gms.internal.ads.zzex.zza     // Catch:{ Exception -> 0x02ab }
            if (r4 == 0) goto L_0x0430
            r6 = 1
            if (r4 == r6) goto L_0x042d
            r6 = 2
            if (r4 == r6) goto L_0x042a
            r6 = 3
            if (r4 == r6) goto L_0x0427
            r6 = 4
            if (r4 != r6) goto L_0x041f
            java.lang.String r4 = "depth metadata"
            goto L_0x0432
        L_0x041f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x02ab }
            java.lang.String r1 = "Unsupported auxiliary track type"
            r0.<init>(r1)     // Catch:{ Exception -> 0x02ab }
            throw r0     // Catch:{ Exception -> 0x02ab }
        L_0x0427:
            java.lang.String r4 = "depth-inverse"
            goto L_0x0432
        L_0x042a:
            java.lang.String r4 = "depth-linear"
            goto L_0x0432
        L_0x042d:
            java.lang.String r4 = "original"
            goto L_0x0432
        L_0x0430:
            java.lang.String r4 = "undefined"
        L_0x0432:
            r14.append(r4)     // Catch:{ Exception -> 0x02ab }
        L_0x0435:
            java.lang.String r4 = r14.toString()     // Catch:{ Exception -> 0x044d }
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r2}     // Catch:{ Exception -> 0x044d }
            java.lang.String r6 = com.google.android.gms.internal.ads.zzex.zza     // Catch:{ Exception -> 0x044d }
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ Exception -> 0x044d }
            java.lang.String r4 = java.lang.String.format(r6, r5, r4)     // Catch:{ Exception -> 0x044d }
            r8 = r22
            com.google.android.gms.internal.ads.zzea.zzf(r8, r4)     // Catch:{ Exception -> 0x044b }
            goto L_0x0468
        L_0x044b:
            r0 = move-exception
            goto L_0x045c
        L_0x044d:
            r0 = move-exception
            r8 = r22
            goto L_0x045c
        L_0x0451:
            r0 = move-exception
            r13 = r6
            r8 = r9
            goto L_0x045c
        L_0x0455:
            r0 = move-exception
            r8 = r9
            r21 = r10
            r23 = r13
            r13 = r6
        L_0x045c:
            r10 = 1
            r9 = r27
        L_0x045f:
            r11 = r13
            goto L_0x0545
        L_0x0462:
            r8 = r9
            r21 = r10
            r23 = r13
            r13 = r6
        L_0x0468:
            r9 = r27
            r9.zzx = r1     // Catch:{ Exception -> 0x0516 }
            r9.zzu = r0     // Catch:{ Exception -> 0x0516 }
            r1 = 0
            r9.zzB = r1     // Catch:{ Exception -> 0x0516 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0516 }
            r1 = 29
            if (r0 != r1) goto L_0x0481
            java.lang.String r0 = "c2.android.aac.decoder"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0516 }
            if (r0 == 0) goto L_0x0481
            r0 = 1
            goto L_0x0482
        L_0x0481:
            r0 = 0
        L_0x0482:
            r9.zzC = r0     // Catch:{ Exception -> 0x0516 }
            r4 = 0
            r9.zzD = r4     // Catch:{ Exception -> 0x0516 }
            java.lang.String r0 = r13.zza     // Catch:{ Exception -> 0x0516 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0516 }
            if (r4 > r1) goto L_0x04c0
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x0516 }
            if (r1 != 0) goto L_0x04be
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x0516 }
            if (r1 != 0) goto L_0x04be
            java.lang.String r1 = "OMX.bcm.vdec.avc.tunnel"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x0516 }
            if (r1 != 0) goto L_0x04be
            java.lang.String r1 = "OMX.bcm.vdec.avc.tunnel.secure"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x0516 }
            if (r1 != 0) goto L_0x04be
            java.lang.String r1 = "OMX.bcm.vdec.hevc.tunnel"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x0516 }
            if (r1 != 0) goto L_0x04be
            java.lang.String r1 = "OMX.bcm.vdec.hevc.tunnel.secure"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0516 }
            if (r0 != 0) goto L_0x04be
            goto L_0x04c0
        L_0x04be:
            r0 = 1
            goto L_0x04da
        L_0x04c0:
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0516 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0516 }
            if (r0 == 0) goto L_0x04d9
            java.lang.String r0 = "AFTS"
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0516 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0516 }
            if (r0 == 0) goto L_0x04d9
            boolean r0 = r13.zzf     // Catch:{ Exception -> 0x0516 }
            if (r0 == 0) goto L_0x04d9
            goto L_0x04be
        L_0x04d9:
            r0 = 0
        L_0x04da:
            r9.zzG = r0     // Catch:{ Exception -> 0x0516 }
            com.google.android.gms.internal.ads.zztf r0 = r9.zzt     // Catch:{ Exception -> 0x0516 }
            if (r0 == 0) goto L_0x0512
            com.google.android.gms.internal.ads.zztf r0 = (com.google.android.gms.internal.ads.zztf) r0     // Catch:{ Exception -> 0x0516 }
            int r0 = r27.zzcU()     // Catch:{ Exception -> 0x0516 }
            r1 = 2
            if (r0 != r1) goto L_0x04f6
            com.google.android.gms.internal.ads.zzdj r0 = r27.zzcX()     // Catch:{ Exception -> 0x0516 }
            long r0 = r0.zzb()     // Catch:{ Exception -> 0x0516 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r4
            r9.zzJ = r0     // Catch:{ Exception -> 0x0516 }
        L_0x04f6:
            com.google.android.gms.internal.ads.zzid r0 = r9.zza     // Catch:{ Exception -> 0x0516 }
            int r1 = r0.zza     // Catch:{ Exception -> 0x0516 }
            r10 = 1
            int r1 = r1 + r10
            r0.zza = r1     // Catch:{ Exception -> 0x050f }
            long r6 = r18 - r16
            r1 = r27
            r4 = r18
            r11 = r13
            r1.zzap(r2, r3, r4, r6)     // Catch:{ Exception -> 0x0537 }
            r11 = r10
            r10 = r21
            r13 = r23
            goto L_0x0575
        L_0x050f:
            r0 = move-exception
            goto L_0x045f
        L_0x0512:
            r11 = r13
            r1 = 0
            r10 = 1
            throw r1     // Catch:{ Exception -> 0x0537 }
        L_0x0516:
            r0 = move-exception
            r11 = r13
            r10 = 1
            goto L_0x0545
        L_0x051a:
            r0 = move-exception
            r21 = r10
            r10 = r11
            r23 = r13
            r11 = r6
            r26 = r9
            r9 = r8
            r8 = r26
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0537 }
            throw r0     // Catch:{ Exception -> 0x0537 }
        L_0x052a:
            r21 = r10
            r10 = r11
            r23 = r13
            r1 = r14
            r11 = r6
            r26 = r9
            r9 = r8
            r8 = r26
            throw r1     // Catch:{ Exception -> 0x0537 }
        L_0x0537:
            r0 = move-exception
            goto L_0x0545
        L_0x0539:
            r0 = move-exception
            r21 = r10
            r10 = r11
            r23 = r13
            r11 = r6
        L_0x0540:
            r26 = r9
            r9 = r8
            r8 = r26
        L_0x0545:
            java.lang.String r1 = r11.zza     // Catch:{ zztl -> 0x05a6 }
            java.lang.String r2 = "Failed to initialize decoder: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ zztl -> 0x05a6 }
            com.google.android.gms.internal.ads.zzea.zzg(r8, r1, r0)     // Catch:{ zztl -> 0x05a6 }
            r15.removeFirst()     // Catch:{ zztl -> 0x05a6 }
            com.google.android.gms.internal.ads.zztl r1 = new com.google.android.gms.internal.ads.zztl     // Catch:{ zztl -> 0x05a6 }
            r2 = r23
            r3 = 0
            r1.<init>((com.google.android.gms.internal.ads.zzz) r2, (java.lang.Throwable) r0, (boolean) r3, (com.google.android.gms.internal.ads.zzti) r11)     // Catch:{ zztl -> 0x05a6 }
            r9.zzao(r1)     // Catch:{ zztl -> 0x05a6 }
            com.google.android.gms.internal.ads.zztl r0 = r9.zzz     // Catch:{ zztl -> 0x05a6 }
            if (r0 != 0) goto L_0x0565
            r9.zzz = r1     // Catch:{ zztl -> 0x05a6 }
            goto L_0x056b
        L_0x0565:
            com.google.android.gms.internal.ads.zztl r0 = com.google.android.gms.internal.ads.zztl.zza(r0, r1)     // Catch:{ zztl -> 0x05a6 }
            r9.zzz = r0     // Catch:{ zztl -> 0x05a6 }
        L_0x056b:
            boolean r0 = r15.isEmpty()     // Catch:{ zztl -> 0x05a6 }
            if (r0 != 0) goto L_0x057e
            r13 = r2
            r11 = r10
            r10 = r21
        L_0x0575:
            r12 = 0
            r14 = 0
            r26 = r9
            r9 = r8
            r8 = r26
            goto L_0x00a0
        L_0x057e:
            com.google.android.gms.internal.ads.zztl r0 = r9.zzz     // Catch:{ zztl -> 0x05a6 }
            throw r0     // Catch:{ zztl -> 0x05a6 }
        L_0x0581:
            r9 = r8
            r21 = r10
            r1 = r14
            throw r1     // Catch:{ zztl -> 0x05a6 }
        L_0x0586:
            r9 = r8
            r21 = r10
            r1 = r14
            r9.zzy = r1     // Catch:{ zztl -> 0x05a6 }
            return
        L_0x058d:
            r9 = r8
            r21 = r10
            r1 = r14
            throw r1     // Catch:{ zztl -> 0x05a6 }
        L_0x0592:
            r9 = r8
            r21 = r10
            r2 = r13
            r1 = r14
            com.google.android.gms.internal.ads.zztl r0 = new com.google.android.gms.internal.ads.zztl     // Catch:{ zztl -> 0x05a6 }
            r3 = -49999(0xffffffffffff3cb1, float:NaN)
            r4 = 0
            r0.<init>((com.google.android.gms.internal.ads.zzz) r2, (java.lang.Throwable) r1, (boolean) r4, (int) r3)     // Catch:{ zztl -> 0x05a6 }
            throw r0     // Catch:{ zztl -> 0x05a6 }
        L_0x05a1:
            r9 = r8
            r21 = r10
            r1 = r14
            throw r1     // Catch:{ zztl -> 0x05a6 }
        L_0x05a6:
            r0 = move-exception
            goto L_0x05ac
        L_0x05a8:
            r0 = move-exception
            r9 = r8
            r21 = r10
        L_0x05ac:
            r1 = 4001(0xfa1, float:5.607E-42)
            r2 = r21
            r3 = 0
            com.google.android.gms.internal.ads.zzin r0 = r9.zzk(r0, r2, r3, r1)
            throw r0
        L_0x05b6:
            r9 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzaJ():void");
    }

    /* access modifiers changed from: protected */
    public void zzaK(long j) {
        this.zzaf = j;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (!arrayDeque.isEmpty() && j >= ((zztn) arrayDeque.peek()).zzb) {
                zztn zztn = (zztn) arrayDeque.poll();
                zztn.getClass();
                zztn zztn2 = zztn;
                zzbb(zztn);
                zzat();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzaL(zzhs zzhs) throws zzin {
    }

    /* access modifiers changed from: protected */
    public final void zzaM() {
        try {
            zztf zztf = this.zzt;
            if (zztf != null) {
                zztf.zzm();
                this.zza.zzb++;
                zzti zzti = this.zzA;
                if (zzti != null) {
                    zzti zzti2 = zzti;
                    zzaq(zzti.zza);
                } else {
                    throw null;
                }
            }
        } finally {
            this.zzt = null;
            this.zzp = null;
            this.zzal = null;
            zzaO();
        }
    }

    /* access modifiers changed from: protected */
    public void zzaN() {
        zzas();
        zzba();
        zzam();
        this.zzJ = -9223372036854775807L;
        this.zzX = false;
        this.zzH = -9223372036854775807L;
        this.zzW = false;
        this.zzE = false;
        this.zzF = false;
        this.zzN = false;
        this.zzO = false;
        this.zzU = 0;
        this.zzV = 0;
        this.zzT = this.zzS ? 1 : 0;
        this.zzai = false;
        this.zzaj = -9223372036854775807L;
        this.zzak = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public final void zzaO() {
        zzaN();
        this.zzy = null;
        this.zzA = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzY = false;
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzC = false;
        this.zzD = false;
        this.zzG = false;
        this.zzI = false;
        this.zzS = false;
        this.zzT = 0;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaP() throws zzin {
        boolean zzbe = zzbe();
        if (zzbe) {
            zzaJ();
        }
        return zzbe;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaQ() {
        return this.zzai;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaR() {
        return this.zzP;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaS(zzz zzz2) {
        return this.zzam == null && zzaw(zzz2);
    }

    /* access modifiers changed from: protected */
    public boolean zzaT(zzz zzz2) throws zzin {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean zzaU(zzhs zzhs) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean zzaV() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean zzaW(zzti zzti) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean zzaX() {
        int i = this.zzV;
        if (i == 3 || ((this.zzC && !this.zzY) || (this.zzD && this.zzX))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbc();
            return false;
        } catch (zzin e) {
            zzea.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzaZ() throws zzin {
        return zzbj(this.zzu);
    }

    /* access modifiers changed from: protected */
    public float zzaa(float f, zzz zzz2, zzz[] zzzArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract int zzab(zztr zztr, zzz zzz2) throws zztw;

    /* access modifiers changed from: protected */
    public long zzac(long j, long j2, boolean z) {
        return 10000;
    }

    /* access modifiers changed from: protected */
    public zzie zzad(zzti zzti, zzz zzz2, zzz zzz3) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (zzbd() == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if (zzbd() == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c5, code lost:
        if (zzbd() == false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzie zzae(com.google.android.gms.internal.ads.zzkv r13) throws com.google.android.gms.internal.ads.zzin {
        /*
            r12 = this;
            r0 = 1
            r12.zzad = r0
            com.google.android.gms.internal.ads.zzz r1 = r13.zza
            r1.getClass()
            r2 = r1
            com.google.android.gms.internal.ads.zzz r2 = (com.google.android.gms.internal.ads.zzz) r2
            java.lang.String r2 = r1.zzo
            r3 = 0
            if (r2 == 0) goto L_0x0101
            java.lang.String r4 = "video/av01"
            boolean r4 = java.util.Objects.equals(r2, r4)
            r5 = 0
            if (r4 != 0) goto L_0x0021
            java.lang.String r4 = "video/x-vnd.on2.vp9"
            boolean r2 = java.util.Objects.equals(r2, r4)
            if (r2 == 0) goto L_0x0034
        L_0x0021:
            java.util.List r2 = r1.zzr
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.internal.ads.zzx r1 = r1.zzb()
            r1.zzT(r5)
            com.google.android.gms.internal.ads.zzz r1 = r1.zzan()
        L_0x0034:
            r9 = r1
            com.google.android.gms.internal.ads.zzsi r13 = r13.zzb
            r12.zzam = r13
            r12.zzm = r9
            boolean r13 = r12.zzP
            if (r13 == 0) goto L_0x0042
            r12.zzR = r0
            return r5
        L_0x0042:
            com.google.android.gms.internal.ads.zztf r13 = r12.zzt
            if (r13 != 0) goto L_0x004c
            r12.zzy = r5
            r12.zzaJ()
            return r5
        L_0x004c:
            com.google.android.gms.internal.ads.zzti r1 = r12.zzA
            r1.getClass()
            r2 = r1
            com.google.android.gms.internal.ads.zzti r2 = (com.google.android.gms.internal.ads.zzti) r2
            com.google.android.gms.internal.ads.zzz r8 = r12.zzu
            r8.getClass()
            r2 = r8
            com.google.android.gms.internal.ads.zzz r2 = (com.google.android.gms.internal.ads.zzz) r2
            com.google.android.gms.internal.ads.zzsi r2 = r12.zzal
            com.google.android.gms.internal.ads.zzsi r4 = r12.zzam
            if (r2 != r4) goto L_0x00f2
            if (r4 == r2) goto L_0x0066
            r2 = r0
            goto L_0x0067
        L_0x0066:
            r2 = r3
        L_0x0067:
            com.google.android.gms.internal.ads.zzie r4 = r12.zzad(r1, r8, r9)
            int r5 = r4.zzd
            r6 = 3
            if (r5 == 0) goto L_0x00d9
            r7 = 16
            r10 = 2
            if (r5 == r0) goto L_0x00b5
            if (r5 == r10) goto L_0x0089
            boolean r0 = r12.zzbj(r9)
            if (r0 != 0) goto L_0x007e
            goto L_0x00bb
        L_0x007e:
            r12.zzu = r9
            if (r2 == 0) goto L_0x00dc
            boolean r0 = r12.zzbd()
            if (r0 != 0) goto L_0x00dc
            goto L_0x00c7
        L_0x0089:
            boolean r11 = r12.zzbj(r9)
            if (r11 != 0) goto L_0x0090
            goto L_0x00bb
        L_0x0090:
            r12.zzS = r0
            r12.zzT = r0
            int r7 = r12.zzB
            if (r7 == r10) goto L_0x00a8
            if (r7 != r0) goto L_0x00a7
            int r7 = r9.zzv
            int r11 = r8.zzv
            if (r7 != r11) goto L_0x00a7
            int r7 = r9.zzw
            int r11 = r8.zzw
            if (r7 != r11) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = r3
        L_0x00a8:
            r12.zzE = r0
            r12.zzu = r9
            if (r2 == 0) goto L_0x00dc
            boolean r0 = r12.zzbd()
            if (r0 != 0) goto L_0x00dc
            goto L_0x00c7
        L_0x00b5:
            boolean r11 = r12.zzbj(r9)
            if (r11 != 0) goto L_0x00bd
        L_0x00bb:
            r11 = r7
            goto L_0x00dd
        L_0x00bd:
            r12.zzu = r9
            if (r2 == 0) goto L_0x00c9
            boolean r0 = r12.zzbd()
            if (r0 != 0) goto L_0x00dc
        L_0x00c7:
            r11 = r10
            goto L_0x00dd
        L_0x00c9:
            boolean r2 = r12.zzW
            if (r2 == 0) goto L_0x00dc
            r12.zzU = r0
            boolean r2 = r12.zzD
            if (r2 == 0) goto L_0x00d6
            r12.zzV = r6
            goto L_0x00c7
        L_0x00d6:
            r12.zzV = r0
            goto L_0x00dc
        L_0x00d9:
            r12.zzag()
        L_0x00dc:
            r11 = r3
        L_0x00dd:
            if (r5 == 0) goto L_0x00f1
            com.google.android.gms.internal.ads.zztf r0 = r12.zzt
            if (r0 != r13) goto L_0x00e7
            int r13 = r12.zzV
            if (r13 != r6) goto L_0x00f1
        L_0x00e7:
            java.lang.String r7 = r1.zza
            com.google.android.gms.internal.ads.zzie r13 = new com.google.android.gms.internal.ads.zzie
            r10 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        L_0x00f1:
            return r4
        L_0x00f2:
            r12.zzag()
            java.lang.String r7 = r1.zza
            com.google.android.gms.internal.ads.zzie r13 = new com.google.android.gms.internal.ads.zzie
            r10 = 0
            r11 = 128(0x80, float:1.794E-43)
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        L_0x0101:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sample MIME type is null."
            r13.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.zzin r13 = r12.zzk(r13, r1, r3, r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzae(com.google.android.gms.internal.ads.zzkv):com.google.android.gms.internal.ads.zzie");
    }

    /* access modifiers changed from: protected */
    public abstract zztc zzaj(zzti zzti, zzz zzz2, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    public abstract List zzak(zztr zztr, zzz zzz2, boolean z) throws zztw;

    /* access modifiers changed from: protected */
    public void zzan(zzhs zzhs) throws zzin {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzao(Exception exc) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzap(String str, zztc zztc, long j, long j2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzaq(String str) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzar(zzz zzz2, MediaFormat mediaFormat) throws zzin {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzat() {
    }

    /* access modifiers changed from: protected */
    public void zzau() throws zzin {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzav(long j, long j2, zztf zztf, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzz zzz2) throws zzin;

    /* access modifiers changed from: protected */
    public boolean zzaw(zzz zzz2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final float zzax() {
        return this.zzr;
    }

    /* access modifiers changed from: protected */
    public int zzay(zzhs zzhs) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final long zzaz() {
        return this.zzaa;
    }

    public final int zze() {
        return 8;
    }

    public final long zzf(long j, long j2) {
        return zzac(j, j2, this.zzI);
    }

    public void zzv(int i, Object obj) throws zzin {
        if (i == 11) {
            zzlz zzlz = (zzlz) obj;
            zzlz.getClass();
            zzlz zzlz2 = zzlz;
            this.zzo = zzlz;
        }
    }

    /* access modifiers changed from: protected */
    public void zzy() {
        this.zzm = null;
        zzbb(zztn.zza);
        this.zzk.clear();
        if (this.zzP) {
            zzaf();
        } else {
            zzbe();
        }
    }

    /* access modifiers changed from: protected */
    public void zzz(boolean z, boolean z2) throws zzin {
        this.zza = new zzid();
    }

    private final void zzbc() throws zzin {
        zzsi zzsi = this.zzam;
        zzsi.getClass();
        zzsi zzsi2 = zzsi;
        this.zzal = zzsi;
        this.zzU = 0;
        this.zzV = 0;
    }

    private final void zzai() throws zzin {
        int i = this.zzV;
        if (i == 1) {
            zzah();
        } else if (i == 2) {
            zzah();
            zzbc();
        } else if (i != 3) {
            this.zzac = true;
            zzau();
        } else {
            zzaM();
            zzaJ();
        }
    }
}
