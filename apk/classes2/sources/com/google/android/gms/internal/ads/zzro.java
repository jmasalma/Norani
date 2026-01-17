package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzro implements zzqo {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private zzrf zzA;
    private zzbb zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;
    private ByteBuffer zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    /* access modifiers changed from: private */
    public boolean zzR;
    /* access modifiers changed from: private */
    public boolean zzS;
    private int zzT;
    private zzf zzU;
    private zzpp zzV;
    /* access modifiers changed from: private */
    public long zzW;
    private boolean zzX;
    private boolean zzY;
    private Looper zzZ;
    private long zzaa;
    private long zzab;
    private Handler zzac;
    private Context zzad;
    private boolean zzae;
    private final zzre zzaf;
    private final zzqu zzag;
    private final Context zzd;
    private final zzqt zze;
    private final zzry zzf;
    private final zzcr zzg;
    private final zzrx zzh;
    private final zzfyq zzi;
    private final zzqs zzj;
    private final ArrayDeque zzk;
    private zzrm zzl;
    private final zzri zzm;
    private final zzri zzn;
    private final int zzo;
    private zzph zzp;
    /* access modifiers changed from: private */
    public zzql zzq;
    private zzrd zzr;
    private zzrd zzs;
    private zzck zzt;
    /* access modifiers changed from: private */
    public AudioTrack zzu;
    private zzpj zzv;
    private zzpo zzw;
    private zzrh zzx;
    private zze zzy;
    private zzrf zzz;

    public static /* synthetic */ void zzH(zzro zzro) {
        if (zzro.zzab >= 300000) {
            ((zzrs) zzro.zzq).zza.zzn = true;
            zzro.zzab = 0;
        }
    }

    static /* synthetic */ void zzJ(AudioTrack audioTrack, zzql zzql, Handler handler, zzqi zzqi) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzql != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new zzqx(zzql, zzqi));
            }
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (zzql != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new zzqx(zzql, zzqi));
            }
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzM() {
        boolean z;
        synchronized (zza) {
            z = zzc > 0;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final long zzN() {
        zzrd zzrd = this.zzs;
        return zzrd.zzc == 0 ? this.zzD / ((long) zzrd.zzb) : this.zzE;
    }

    /* access modifiers changed from: private */
    public final long zzO() {
        zzrd zzrd = this.zzs;
        if (zzrd.zzc != 0) {
            return this.zzG;
        }
        long j = this.zzF;
        long j2 = (long) zzrd.zzd;
        String str = zzex.zza;
        return ((j + j2) - 1) / j2;
    }

    private final AudioTrack zzP(zzrd zzrd) throws zzqk {
        Context context;
        try {
            int i = this.zzT;
            int i2 = this.zzo;
            Context context2 = null;
            if (!(i2 == -1 || (context = this.zzd) == null || Build.VERSION.SDK_INT < 34)) {
                if (this.zzad == null) {
                    this.zzad = context.createDeviceContext(i2);
                }
                context2 = this.zzad;
                i = 0;
            }
            return zzae(zzrd.zza(), this.zzy, i, zzrd.zza, context2);
        } catch (zzqk e) {
            zzql zzql = this.zzq;
            if (zzql != null) {
                zzql.zza(e);
            }
            throw e;
        }
    }

    private final void zzQ(long j) {
        zzbb zzbb;
        boolean z;
        if (zzad()) {
            zzre zzre = this.zzaf;
            zzbb = this.zzB;
            zzre.zzc(zzbb);
        } else {
            zzbb = zzbb.zza;
        }
        zzbb zzbb2 = zzbb;
        this.zzB = zzbb2;
        if (zzad()) {
            zzre zzre2 = this.zzaf;
            z = this.zzC;
            zzre2.zzd(z);
        } else {
            z = false;
        }
        this.zzC = z;
        this.zzk.add(new zzrf(zzbb2, Math.max(0, j), zzex.zzt(zzO(), this.zzs.zze), (zzrn) null));
        zzZ();
        zzql zzql = this.zzq;
        if (zzql != null) {
            ((zzrs) zzql).zza.zzc.zzy(this.zzC);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzR(long r8) throws com.google.android.gms.internal.ads.zzqn {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = r7.zzO
            if (r8 != 0) goto L_0x0006
            goto L_0x00b6
        L_0x0006:
            com.google.android.gms.internal.ads.zzri r8 = r7.zzn
            boolean r9 = r8.zzc()
            if (r9 != 0) goto L_0x00b6
            java.nio.ByteBuffer r9 = r7.zzO
            int r9 = r9.remaining()
            android.media.AudioTrack r0 = r7.zzu
            java.nio.ByteBuffer r1 = r7.zzO
            r2 = 1
            int r0 = r0.write(r1, r9, r2)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r7.zzW = r3
            r3 = 0
            r1 = 0
            if (r0 >= 0) goto L_0x006d
            r9 = -6
            if (r0 == r9) goto L_0x0032
            r9 = -32
            if (r0 != r9) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r2 = r1
            goto L_0x0046
        L_0x0032:
            long r5 = r7.zzO()
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x003b
            goto L_0x0046
        L_0x003b:
            android.media.AudioTrack r9 = r7.zzu
            boolean r9 = zzac(r9)
            if (r9 == 0) goto L_0x0030
            r7.zzS()
        L_0x0046:
            com.google.android.gms.internal.ads.zzqn r9 = new com.google.android.gms.internal.ads.zzqn
            com.google.android.gms.internal.ads.zzrd r1 = r7.zzs
            com.google.android.gms.internal.ads.zzz r1 = r1.zza
            r9.<init>(r0, r1, r2)
            com.google.android.gms.internal.ads.zzql r0 = r7.zzq
            if (r0 == 0) goto L_0x0056
            r0.zza(r9)
        L_0x0056:
            boolean r0 = r9.zzb
            if (r0 == 0) goto L_0x0069
            android.content.Context r0 = r7.zzd
            if (r0 != 0) goto L_0x005f
            goto L_0x0069
        L_0x005f:
            com.google.android.gms.internal.ads.zzpj r8 = com.google.android.gms.internal.ads.zzpj.zza
            r7.zzv = r8
            com.google.android.gms.internal.ads.zzpo r0 = r7.zzw
            r0.zzg(r8)
            throw r9
        L_0x0069:
            r8.zzb(r9)
            return
        L_0x006d:
            r8.zza()
            android.media.AudioTrack r8 = r7.zzu
            boolean r8 = zzac(r8)
            if (r8 == 0) goto L_0x008c
            long r5 = r7.zzG
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0080
            r7.zzY = r1
        L_0x0080:
            boolean r8 = r7.zzS
            if (r8 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzql r8 = r7.zzq
            if (r8 == 0) goto L_0x008c
            if (r0 >= r9) goto L_0x008c
            com.google.android.gms.internal.ads.zzrs r8 = (com.google.android.gms.internal.ads.zzrs) r8
        L_0x008c:
            com.google.android.gms.internal.ads.zzrd r8 = r7.zzs
            int r8 = r8.zzc
            if (r8 != 0) goto L_0x0098
            long r3 = r7.zzF
            long r5 = (long) r0
            long r3 = r3 + r5
            r7.zzF = r3
        L_0x0098:
            if (r0 != r9) goto L_0x00b6
            if (r8 == 0) goto L_0x00b3
            java.nio.ByteBuffer r8 = r7.zzO
            java.nio.ByteBuffer r9 = r7.zzM
            if (r8 != r9) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r2 = r1
        L_0x00a4:
            com.google.android.gms.internal.ads.zzdd.zzf(r2)
            long r8 = r7.zzG
            int r0 = r7.zzH
            long r0 = (long) r0
            int r2 = r7.zzN
            long r2 = (long) r2
            long r0 = r0 * r2
            long r8 = r8 + r0
            r7.zzG = r8
        L_0x00b3:
            r8 = 0
            r7.zzO = r8
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzro.zzR(long):void");
    }

    private final void zzS() {
        if (this.zzs.zzc == 1) {
            this.zzX = true;
        }
    }

    @EnsuresNonNull({"audioCapabilities"})
    private final void zzT() {
        Context context;
        if (this.zzw == null && (context = this.zzd) != null) {
            this.zzZ = Looper.myLooper();
            zzpo zzpo = new zzpo(context, new zzqy(this), this.zzy, this.zzV);
            this.zzw = zzpo;
            this.zzv = zzpo.zzc();
        }
        this.zzv.getClass();
    }

    private final void zzU() {
        if (!this.zzQ) {
            this.zzQ = true;
            this.zzj.zzb(zzO());
            if (zzac(this.zzu)) {
                this.zzR = false;
            }
            this.zzu.stop();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r0 = r2.zzM;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r0 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r0.hasRemaining() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r2.zzt.zze(r2.zzM);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzV(long r3) throws com.google.android.gms.internal.ads.zzqn {
        /*
            r2 = this;
            r2.zzR(r3)
            java.nio.ByteBuffer r0 = r2.zzO
            if (r0 == 0) goto L_0x0008
            goto L_0x004b
        L_0x0008:
            com.google.android.gms.internal.ads.zzck r0 = r2.zzt
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L_0x0041
        L_0x0010:
            com.google.android.gms.internal.ads.zzck r0 = r2.zzt
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L_0x004b
        L_0x0018:
            com.google.android.gms.internal.ads.zzck r0 = r2.zzt
            java.nio.ByteBuffer r0 = r0.zzb()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L_0x002f
            r2.zzX(r0)
            r2.zzR(r3)
            java.nio.ByteBuffer r0 = r2.zzO
            if (r0 == 0) goto L_0x0018
            goto L_0x004b
        L_0x002f:
            java.nio.ByteBuffer r0 = r2.zzM
            if (r0 == 0) goto L_0x004b
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzck r0 = r2.zzt
            java.nio.ByteBuffer r1 = r2.zzM
            r0.zze(r1)
            goto L_0x0010
        L_0x0041:
            java.nio.ByteBuffer r0 = r2.zzM
            if (r0 == 0) goto L_0x004b
            r2.zzX(r0)
            r2.zzR(r3)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzro.zzV(long):void");
    }

    private final void zzW(zzbb zzbb) {
        zzrf zzrf = new zzrf(zzbb, -9223372036854775807L, -9223372036854775807L, (zzrn) null);
        if (zzab()) {
            this.zzz = zzrf;
        } else {
            this.zzA = zzrf;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x004b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzX(java.nio.ByteBuffer r17) {
        /*
            r16 = this;
            r0 = r16
            java.nio.ByteBuffer r1 = r0.zzO
            if (r1 != 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.zzdd.zzf(r1)
            boolean r1 = r17.hasRemaining()
            if (r1 == 0) goto L_0x0200
            com.google.android.gms.internal.ads.zzrd r1 = r0.zzs
            int r1 = r1.zzc
            if (r1 != 0) goto L_0x01fc
            r1 = 20
            long r1 = com.google.android.gms.internal.ads.zzex.zzs(r1)
            com.google.android.gms.internal.ads.zzrd r3 = r0.zzs
            int r3 = r3.zze
            long r1 = com.google.android.gms.internal.ads.zzex.zzp(r1, r3)
            int r1 = (int) r1
            long r2 = r16.zzO()
            long r4 = (long) r1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x01fc
            com.google.android.gms.internal.ads.zzrd r6 = r0.zzs
            int r7 = r6.zzg
            int r6 = r6.zzd
            int r8 = r17.remaining()
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocateDirect(r8)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r8 = r8.order(r9)
            int r9 = r17.position()
            int r2 = (int) r2
        L_0x004b:
            boolean r3 = r17.hasRemaining()
            if (r3 == 0) goto L_0x01f2
            if (r2 >= r1) goto L_0x01f2
            r12 = 1342177280(0x50000000, float:8.5899346E9)
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            r14 = 22
            r15 = 21
            r10 = 4
            r3 = 3
            r11 = 2
            if (r7 == r11) goto L_0x0124
            if (r7 == r3) goto L_0x011b
            if (r7 == r10) goto L_0x00fd
            if (r7 == r15) goto L_0x00e2
            if (r7 == r14) goto L_0x00c0
            if (r7 == r13) goto L_0x00ae
            if (r7 == r12) goto L_0x0095
            r12 = 1610612736(0x60000000, float:3.6893488E19)
            if (r7 != r12) goto L_0x008f
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            byte r14 = r17.get()
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            byte r15 = r17.get()
            r15 = r15 & 255(0xff, float:3.57E-43)
            goto L_0x00de
        L_0x008f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0095:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            byte r14 = r17.get()
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            goto L_0x00fa
        L_0x00ae:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            goto L_0x0134
        L_0x00c0:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 8
            byte r14 = r17.get()
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 16
            byte r15 = r17.get()
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << 24
        L_0x00de:
            r12 = r12 | r13
            r12 = r12 | r14
            r12 = r12 | r15
            goto L_0x0135
        L_0x00e2:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            byte r14 = r17.get()
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 24
        L_0x00fa:
            r12 = r12 | r13
            r12 = r12 | r14
            goto L_0x0135
        L_0x00fd:
            float r12 = r17.getFloat()
            r13 = 1065353216(0x3f800000, float:1.0)
            float r12 = java.lang.Math.min(r12, r13)
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r12 = java.lang.Math.max(r13, r12)
            r13 = 0
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x0116
            float r12 = -r12
            r13 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            goto L_0x0118
        L_0x0116:
            r13 = 1325400064(0x4f000000, float:2.14748365E9)
        L_0x0118:
            float r12 = r12 * r13
            int r12 = (int) r12
            goto L_0x0135
        L_0x011b:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            goto L_0x0135
        L_0x0124:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 16
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 24
        L_0x0134:
            r12 = r12 | r13
        L_0x0135:
            long r12 = (long) r12
            long r14 = (long) r2
            long r12 = r12 * r14
            long r12 = r12 / r4
            int r12 = (int) r12
            if (r7 == r11) goto L_0x01d6
            if (r7 == r3) goto L_0x01cf
            if (r7 == r10) goto L_0x01bc
            r3 = 21
            if (r7 == r3) goto L_0x01a9
            r3 = 22
            if (r7 == r3) goto L_0x0192
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            if (r7 == r3) goto L_0x0185
            r3 = 1342177280(0x50000000, float:8.5899346E9)
            if (r7 == r3) goto L_0x0172
            r3 = 1610612736(0x60000000, float:3.6893488E19)
            if (r7 != r3) goto L_0x016c
            int r3 = r12 >> 8
            int r10 = r12 >> 16
            int r11 = r12 >> 24
            byte r12 = (byte) r12
            byte r11 = (byte) r11
            r8.put(r11)
            byte r10 = (byte) r10
            r8.put(r10)
            byte r3 = (byte) r3
            r8.put(r3)
            r8.put(r12)
            goto L_0x01e2
        L_0x016c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0172:
            int r3 = r12 >> 8
            int r10 = r12 >> 16
            int r11 = r12 >> 24
            byte r11 = (byte) r11
            r8.put(r11)
            byte r10 = (byte) r10
            r8.put(r10)
            byte r3 = (byte) r3
            r8.put(r3)
            goto L_0x01e2
        L_0x0185:
            int r3 = r12 >> 16
            int r10 = r12 >> 24
            byte r10 = (byte) r10
            r8.put(r10)
            byte r3 = (byte) r3
            r8.put(r3)
            goto L_0x01e2
        L_0x0192:
            int r3 = r12 >> 8
            int r10 = r12 >> 16
            int r11 = r12 >> 24
            byte r12 = (byte) r12
            r8.put(r12)
            byte r3 = (byte) r3
            r8.put(r3)
            byte r3 = (byte) r10
            r8.put(r3)
            byte r3 = (byte) r11
            r8.put(r3)
            goto L_0x01e2
        L_0x01a9:
            int r3 = r12 >> 8
            int r10 = r12 >> 16
            int r11 = r12 >> 24
            byte r3 = (byte) r3
            r8.put(r3)
            byte r3 = (byte) r10
            r8.put(r3)
            byte r3 = (byte) r11
            r8.put(r3)
            goto L_0x01e2
        L_0x01bc:
            if (r12 >= 0) goto L_0x01c7
            float r3 = (float) r12
            float r3 = -r3
            r10 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            float r3 = r3 / r10
            r8.putFloat(r3)
            goto L_0x01e2
        L_0x01c7:
            float r3 = (float) r12
            r10 = 1325400064(0x4f000000, float:2.14748365E9)
            float r3 = r3 / r10
            r8.putFloat(r3)
            goto L_0x01e2
        L_0x01cf:
            int r3 = r12 >> 24
            byte r3 = (byte) r3
            r8.put(r3)
            goto L_0x01e2
        L_0x01d6:
            int r3 = r12 >> 16
            int r10 = r12 >> 24
            byte r3 = (byte) r3
            r8.put(r3)
            byte r3 = (byte) r10
            r8.put(r3)
        L_0x01e2:
            int r3 = r17.position()
            int r10 = r9 + r6
            if (r3 != r10) goto L_0x004b
            int r2 = r2 + 1
            int r9 = r17.position()
            goto L_0x004b
        L_0x01f2:
            r1 = r17
            r8.put(r1)
            r8.flip()
            r1 = r8
            goto L_0x01fe
        L_0x01fc:
            r1 = r17
        L_0x01fe:
            r0.zzO = r1
        L_0x0200:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzro.zzX(java.nio.ByteBuffer):void");
    }

    private final void zzY() {
        if (zzab()) {
            this.zzu.setVolume(this.zzL);
        }
    }

    private final void zzZ() {
        zzck zzck = this.zzs.zzi;
        this.zzt = zzck;
        zzck.zzc();
    }

    private final boolean zzaa() throws zzqn {
        ByteBuffer byteBuffer;
        if (!this.zzt.zzh()) {
            zzR(Long.MIN_VALUE);
            return this.zzO == null;
        }
        this.zzt.zzd();
        zzV(Long.MIN_VALUE);
        if (!this.zzt.zzg() || ((byteBuffer = this.zzO) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    private final boolean zzab() {
        return this.zzu != null;
    }

    private static boolean zzac(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzad() {
        zzrd zzrd = this.zzs;
        if (zzrd.zzc != 0) {
            return false;
        }
        int i = zzrd.zza.zzI;
        return true;
    }

    private static final AudioTrack zzae(zzqi zzqi, zze zze2, int i, zzz zzz2, Context context) throws zzqk {
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zze2.zza().zza).setAudioFormat(zzex.zzx(zzqi.zzb, zzqi.zzc, zzqi.zza)).setTransferMode(1).setBufferSizeInBytes(zzqi.zze).setSessionId(i);
            if (Build.VERSION.SDK_INT >= 29) {
                sessionId.setOffloadedPlayback(zzqi.zzd);
            }
            if (Build.VERSION.SDK_INT >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            int state = build.getState();
            if (state == 1) {
                return build;
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new zzqk(state, zzqi.zzb, zzqi.zzc, zzqi.zza, zzqi.zze, zzz2, zzqi.zzd, (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzqk(0, zzqi.zzb, zzqi.zzc, zzqi.zza, zzqi.zze, zzz2, zzqi.zzd, e);
        }
    }

    public final boolean zzA() {
        if (!zzab()) {
            return true;
        }
        if (this.zzP) {
            return !zzz();
        }
        return false;
    }

    public final boolean zzB(zzz zzz2) {
        return zza(zzz2) != 0;
    }

    public final void zzK(zzpj zzpj) {
        String str;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzZ;
        if (looper != myLooper) {
            String str2 = "null";
            if (looper == null) {
                str = str2;
            } else {
                str = looper.getThread().getName();
            }
            if (myLooper != null) {
                str2 = myLooper.getThread().getName();
            }
            throw new IllegalStateException("Current looper (" + str2 + ") is not the playback looper (" + str + ")");
        }
        zzpj zzpj2 = this.zzv;
        if (zzpj2 != null && !zzpj.equals(zzpj2)) {
            this.zzv = zzpj;
            zzql zzql = this.zzq;
            if (zzql != null) {
                ((zzrs) zzql).zza.zzC();
            }
        }
    }

    public final int zza(zzz zzz2) {
        zzT();
        if (!"audio/raw".equals(zzz2.zzo)) {
            return this.zzv.zzb(zzz2, this.zzy) != null ? 2 : 0;
        }
        int i = zzz2.zzI;
        if (!zzex.zzK(i)) {
            zzea.zzf("DefaultAudioSink", "Invalid PCM encoding: " + i);
            return 0;
        } else if (i != 2) {
            return 1;
        } else {
            return 2;
        }
    }

    public final long zzb() {
        if (!zzab()) {
            return -9223372036854775807L;
        }
        AudioTrack audioTrack = this.zzu;
        zzrd zzrd = this.zzs;
        if (zzrd.zzc == 0) {
            return zzex.zzt((long) audioTrack.getBufferSizeInFrames(), zzrd.zze);
        }
        long bufferSizeInFrames = (long) audioTrack.getBufferSizeInFrames();
        int zza2 = zzadz.zza(zzrd.zzg);
        zzdd.zzf(zza2 != -2147483647);
        return zzex.zzu(bufferSizeInFrames, 1000000, (long) zza2, RoundingMode.DOWN);
    }

    public final long zzc(boolean z) {
        ArrayDeque arrayDeque;
        long j;
        if (!zzab() || this.zzJ) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzj.zza(), zzex.zzt(zzO(), this.zzs.zze));
        while (true) {
            arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || min < ((zzrf) arrayDeque.getFirst()).zzc) {
                zzrf zzrf = this.zzA;
                long j2 = min - zzrf.zzc;
                long zzq2 = zzex.zzq(j2, zzrf.zza.zzb);
            } else {
                this.zzA = (zzrf) arrayDeque.remove();
            }
        }
        zzrf zzrf2 = this.zzA;
        long j22 = min - zzrf2.zzc;
        long zzq22 = zzex.zzq(j22, zzrf2.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long zza2 = this.zzaf.zza(j22);
            zzrf zzrf3 = this.zzA;
            j = zzrf3.zzb + zza2;
            zzrf3.zzd = zza2 - zzq22;
        } else {
            zzrf zzrf4 = this.zzA;
            j = zzrf4.zzb + zzq22 + zzrf4.zzd;
        }
        long zzb2 = this.zzaf.zzb();
        long zzt2 = j + zzex.zzt(zzb2, this.zzs.zze);
        long j3 = this.zzaa;
        if (zzb2 > j3) {
            long zzt3 = zzex.zzt(zzb2 - j3, this.zzs.zze);
            this.zzaa = zzb2;
            this.zzab += zzt3;
            if (this.zzac == null) {
                this.zzac = new Handler(Looper.myLooper());
            }
            this.zzac.removeCallbacksAndMessages((Object) null);
            this.zzac.postDelayed(new zzqw(this), 100);
        }
        return zzt2;
    }

    public final zzbb zzd() {
        return this.zzB;
    }

    public final zzps zze(zzz zzz2) {
        if (this.zzX) {
            return zzps.zza;
        }
        return this.zzag.zza(zzz2, this.zzy);
    }

    public final void zzf(zzz zzz2, int i, int[] iArr) throws zzqj {
        zzck zzck;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        zzz zzz3 = zzz2;
        zzT();
        if ("audio/raw".equals(zzz3.zzo)) {
            int i8 = zzz3.zzI;
            zzdd.zzd(zzex.zzK(i8));
            int i9 = zzz3.zzG;
            i5 = zzex.zzk(i8) * i9;
            zzfyn zzfyn = new zzfyn();
            zzfyn.zzh(this.zzi);
            zzfyn.zzf(this.zzg);
            zzfyn.zzg(this.zzaf.zze());
            zzck zzck2 = new zzck(zzfyn.zzi());
            if (zzck2.equals(this.zzt)) {
                zzck2 = this.zzt;
            }
            this.zzf.zzq(zzz3.zzJ, zzz3.zzK);
            this.zze.zzo(iArr);
            try {
                zzcl zza2 = zzck2.zza(new zzcl(zzz3.zzH, i9, i8));
                int i10 = zza2.zzd;
                int i11 = zza2.zzb;
                int i12 = zza2.zzc;
                i2 = i10;
                i4 = i11;
                zzck = zzck2;
                i3 = zzex.zzi(i12);
                i7 = zzex.zzk(i10) * i12;
                i6 = 0;
            } catch (zzcm e) {
                throw new zzqj((Throwable) e, zzz3);
            }
        } else {
            zzck zzck3 = new zzck(zzfyq.zzn());
            int i13 = zzz3.zzH;
            zzps zzps = zzps.zza;
            Pair zzb2 = this.zzv.zzb(zzz3, this.zzy);
            if (zzb2 != null) {
                int intValue = ((Integer) zzb2.first).intValue();
                zzck = zzck3;
                i7 = -1;
                i4 = i13;
                i3 = ((Integer) zzb2.second).intValue();
                i2 = intValue;
                i6 = 2;
                i5 = -1;
            } else {
                throw new zzqj("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzz2))), zzz3);
            }
        }
        if (i2 == 0) {
            throw new zzqj("Invalid output encoding (mode=" + i6 + ") for: " + String.valueOf(zzz2), zzz3);
        } else if (i3 != 0) {
            int i14 = zzz3.zzj;
            if ("audio/vnd.dts.hd;profile=lbr".equals(zzz3.zzo) && i14 == -1) {
                i14 = 768000;
            }
            int i15 = i14;
            int minBufferSize = AudioTrack.getMinBufferSize(i4, i3, i2);
            zzdd.zzf(minBufferSize != -2);
            int i16 = i7 != -1 ? i7 : 1;
            this.zzX = false;
            zzrd zzrd = r2;
            zzrd zzrd2 = new zzrd(zzz2, i5, i6, i7, i4, i3, i2, (((Math.max(minBufferSize, (int) ((double) zzrq.zzb(minBufferSize, i2, i6, i16, i4, i15))) + i16) - 1) / i16) * i16, zzck, false, false, false);
            if (zzab()) {
                this.zzr = zzrd;
            } else {
                this.zzs = zzrd;
            }
        } else {
            throw new zzqj("Invalid output channel config (mode=" + i6 + ") for: " + String.valueOf(zzz2), zzz3);
        }
    }

    public final void zzg() {
        if (zzab()) {
            this.zzD = 0;
            this.zzE = 0;
            this.zzF = 0;
            this.zzG = 0;
            this.zzY = false;
            this.zzH = 0;
            this.zzA = new zzrf(this.zzB, 0, 0, (zzrn) null);
            this.zzK = 0;
            this.zzz = null;
            this.zzk.clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzR = false;
            this.zzf.zzp();
            zzZ();
            zzqs zzqs = this.zzj;
            if (zzqs.zzh()) {
                this.zzu.pause();
            }
            if (zzac(this.zzu)) {
                zzrm zzrm = this.zzl;
                zzrm.getClass();
                zzrm zzrm2 = zzrm;
                zzrm.zzb(this.zzu);
            }
            zzqi zza2 = this.zzs.zza();
            zzrd zzrd = this.zzr;
            if (zzrd != null) {
                this.zzs = zzrd;
                this.zzr = null;
            }
            zzqs.zzc();
            zzrh zzrh = this.zzx;
            if (zzrh != null) {
                zzrh.zzb();
                this.zzx = null;
            }
            AudioTrack audioTrack = this.zzu;
            zzql zzql = this.zzq;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    String str = zzex.zza;
                    zzb = Executors.newSingleThreadScheduledExecutor(new zzew("ExoPlayer:AudioTrackReleaseThread"));
                }
                zzc++;
                zzb.schedule(new zzqv(audioTrack, zzql, handler, zza2), 20, TimeUnit.MILLISECONDS);
            }
            this.zzu = null;
        }
        this.zzn.zza();
        this.zzm.zza();
        this.zzaa = 0;
        this.zzab = 0;
        Handler handler2 = this.zzac;
        if (handler2 != null) {
            Handler handler3 = handler2;
            handler2.removeCallbacksAndMessages((Object) null);
        }
    }

    public final void zzh() {
        this.zzI = true;
    }

    public final void zzi() {
        this.zzS = false;
        if (!zzab()) {
            return;
        }
        if (this.zzj.zzk() || zzac(this.zzu)) {
            this.zzu.pause();
        }
    }

    public final void zzj() {
        this.zzS = true;
        if (zzab()) {
            this.zzj.zzf();
            this.zzu.play();
        }
    }

    public final void zzk() throws zzqn {
        if (!this.zzP && zzab() && zzaa()) {
            zzU();
            this.zzP = true;
        }
    }

    public final void zzl() {
        zzpo zzpo = this.zzw;
        if (zzpo != null) {
            zzpo.zzj();
        }
    }

    public final void zzm() {
        zzg();
        zzfyq zzfyq = this.zzi;
        int size = zzfyq.size();
        for (int i = 0; i < size; i++) {
            ((zzcn) zzfyq.get(i)).zzf();
        }
        this.zzg.zzf();
        this.zzh.zzf();
        zzck zzck = this.zzt;
        if (zzck != null) {
            zzck.zzf();
        }
        this.zzS = false;
        this.zzX = false;
    }

    public final void zzn(zze zze2) {
        if (!this.zzy.equals(zze2)) {
            this.zzy = zze2;
            zzpo zzpo = this.zzw;
            if (zzpo != null) {
                zzpo.zzh(zze2);
            }
            zzg();
        }
    }

    public final void zzo(int i) {
        if (this.zzT != i) {
            this.zzT = i;
            zzg();
            zzql zzql = this.zzq;
            if (zzql != null) {
                if (Build.VERSION.SDK_INT >= 35) {
                    zzru zzru = ((zzrs) zzql).zza;
                    if (zzru.zze != null) {
                        zzru.zze.zzd(i);
                    }
                }
                ((zzrs) zzql).zza.zzc.zzo(i);
            }
        }
    }

    public final void zzp(zzf zzf2) {
        if (!this.zzU.equals(zzf2)) {
            if (this.zzu != null) {
                int i = this.zzU.zza;
            }
            this.zzU = zzf2;
        }
    }

    public final void zzq(zzdj zzdj) {
        this.zzj.zze(zzdj);
    }

    public final void zzr(zzql zzql) {
        this.zzq = zzql;
    }

    public final void zzs(int i, int i2) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzac(audioTrack);
        }
    }

    public final void zzt(zzbb zzbb) {
        float f = zzbb.zzb;
        String str = zzex.zza;
        this.zzB = new zzbb(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzbb.zzc, 8.0f)));
        zzW(zzbb);
    }

    public final void zzu(zzph zzph) {
        this.zzp = zzph;
    }

    public final void zzw(boolean z) {
        this.zzC = z;
        zzW(this.zzB);
    }

    public final void zzx(float f) {
        if (this.zzL != f) {
            this.zzL = f;
            zzY();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x026e, code lost:
        r8 = com.google.android.gms.internal.ads.zzacu.zza(r28);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzy(java.nio.ByteBuffer r28, long r29, int r31) throws com.google.android.gms.internal.ads.zzqk, com.google.android.gms.internal.ads.zzqn {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r5 = r31
            java.nio.ByteBuffer r0 = r1.zzM
            r7 = 0
            if (r0 == 0) goto L_0x0012
            if (r2 != r0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r0 = r7
            goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            com.google.android.gms.internal.ads.zzdd.zzd(r0)
            com.google.android.gms.internal.ads.zzrd r0 = r1.zzr
            r8 = 0
            if (r0 == 0) goto L_0x006f
            boolean r0 = r27.zzaa()
            if (r0 != 0) goto L_0x0022
            return r7
        L_0x0022:
            com.google.android.gms.internal.ads.zzrd r0 = r1.zzr
            com.google.android.gms.internal.ads.zzrd r9 = r1.zzs
            int r10 = r9.zzc
            int r11 = r0.zzc
            if (r10 != r11) goto L_0x005f
            int r10 = r9.zzg
            int r11 = r0.zzg
            if (r10 != r11) goto L_0x005f
            int r10 = r9.zze
            int r11 = r0.zze
            if (r10 != r11) goto L_0x005f
            int r10 = r9.zzf
            int r11 = r0.zzf
            if (r10 != r11) goto L_0x005f
            int r10 = r9.zzd
            int r11 = r0.zzd
            if (r10 != r11) goto L_0x005f
            boolean r10 = r9.zzj
            boolean r10 = r0.zzj
            boolean r9 = r9.zzk
            boolean r9 = r0.zzk
            r1.zzs = r0
            r1.zzr = r8
            android.media.AudioTrack r0 = r1.zzu
            if (r0 == 0) goto L_0x006c
            boolean r0 = zzac(r0)
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.zzrd r0 = r1.zzs
            boolean r0 = r0.zzk
            goto L_0x006c
        L_0x005f:
            r27.zzU()
            boolean r0 = r27.zzz()
            if (r0 == 0) goto L_0x0069
            return r7
        L_0x0069:
            r27.zzg()
        L_0x006c:
            r1.zzQ(r3)
        L_0x006f:
            boolean r0 = r27.zzab()
            if (r0 == 0) goto L_0x0077
            goto L_0x016f
        L_0x0077:
            com.google.android.gms.internal.ads.zzri r0 = r1.zzm     // Catch:{ zzqk -> 0x03cf }
            boolean r0 = r0.zzc()     // Catch:{ zzqk -> 0x03cf }
            if (r0 == 0) goto L_0x0080
            return r7
        L_0x0080:
            com.google.android.gms.internal.ads.zzrd r0 = r1.zzs     // Catch:{ zzqk -> 0x008d }
            if (r0 == 0) goto L_0x008c
            r11 = r0
            com.google.android.gms.internal.ads.zzrd r11 = (com.google.android.gms.internal.ads.zzrd) r11     // Catch:{ zzqk -> 0x008d }
            android.media.AudioTrack r0 = r1.zzP(r0)     // Catch:{ zzqk -> 0x008d }
            goto L_0x00d5
        L_0x008c:
            throw r8     // Catch:{ zzqk -> 0x008d }
        L_0x008d:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.internal.ads.zzrd r0 = r1.zzs     // Catch:{ zzqk -> 0x03cf }
            int r12 = r0.zzh     // Catch:{ zzqk -> 0x03cf }
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r12 <= r13) goto L_0x03cb
            com.google.android.gms.internal.ads.zzrd r12 = new com.google.android.gms.internal.ads.zzrd     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzz r15 = r0.zza     // Catch:{ zzqk -> 0x03cf }
            int r13 = r0.zzb     // Catch:{ zzqk -> 0x03cf }
            int r14 = r0.zzc     // Catch:{ zzqk -> 0x03cf }
            int r8 = r0.zzd     // Catch:{ zzqk -> 0x03cf }
            int r7 = r0.zze     // Catch:{ zzqk -> 0x03cf }
            int r6 = r0.zzf     // Catch:{ zzqk -> 0x03cf }
            int r10 = r0.zzg     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzck r9 = r0.zzi     // Catch:{ zzqk -> 0x03cf }
            r16 = r14
            boolean r14 = r0.zzj     // Catch:{ zzqk -> 0x03cf }
            boolean r14 = r0.zzk     // Catch:{ zzqk -> 0x03cf }
            boolean r0 = r0.zzl     // Catch:{ zzqk -> 0x03cf }
            r25 = 0
            r26 = 0
            r22 = 1000000(0xf4240, float:1.401298E-39)
            r24 = 0
            r0 = r16
            r14 = r12
            r16 = r13
            r17 = r0
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r10
            r23 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ zzqk -> 0x03cf }
            android.media.AudioTrack r0 = r1.zzP(r12)     // Catch:{ zzqk -> 0x03c7 }
            r1.zzs = r12     // Catch:{ zzqk -> 0x03c7 }
        L_0x00d5:
            r1.zzu = r0     // Catch:{ zzqk -> 0x03cf }
            boolean r0 = zzac(r0)     // Catch:{ zzqk -> 0x03cf }
            if (r0 == 0) goto L_0x00f3
            android.media.AudioTrack r0 = r1.zzu     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzrm r6 = r1.zzl     // Catch:{ zzqk -> 0x03cf }
            if (r6 != 0) goto L_0x00ea
            com.google.android.gms.internal.ads.zzrm r6 = new com.google.android.gms.internal.ads.zzrm     // Catch:{ zzqk -> 0x03cf }
            r6.<init>(r1)     // Catch:{ zzqk -> 0x03cf }
            r1.zzl = r6     // Catch:{ zzqk -> 0x03cf }
        L_0x00ea:
            com.google.android.gms.internal.ads.zzrm r6 = r1.zzl     // Catch:{ zzqk -> 0x03cf }
            r6.zza(r0)     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzrd r0 = r1.zzs     // Catch:{ zzqk -> 0x03cf }
            boolean r0 = r0.zzk     // Catch:{ zzqk -> 0x03cf }
        L_0x00f3:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ zzqk -> 0x03cf }
            r6 = 31
            if (r0 < r6) goto L_0x010e
            com.google.android.gms.internal.ads.zzph r0 = r1.zzp     // Catch:{ zzqk -> 0x03cf }
            if (r0 == 0) goto L_0x010e
            android.media.AudioTrack r6 = r1.zzu     // Catch:{ zzqk -> 0x03cf }
            android.media.metrics.LogSessionId r0 = r0.zza()     // Catch:{ zzqk -> 0x03cf }
            android.media.metrics.LogSessionId r7 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE     // Catch:{ zzqk -> 0x03cf }
            boolean r7 = r0.equals(r7)     // Catch:{ zzqk -> 0x03cf }
            if (r7 != 0) goto L_0x010e
            r6.setLogSessionId(r0)     // Catch:{ zzqk -> 0x03cf }
        L_0x010e:
            android.media.AudioTrack r0 = r1.zzu     // Catch:{ zzqk -> 0x03cf }
            int r0 = r0.getAudioSessionId()     // Catch:{ zzqk -> 0x03cf }
            r1.zzT = r0     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzqs r6 = r1.zzj     // Catch:{ zzqk -> 0x03cf }
            android.media.AudioTrack r7 = r1.zzu     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzrd r0 = r1.zzs     // Catch:{ zzqk -> 0x03cf }
            int r8 = r0.zzc     // Catch:{ zzqk -> 0x03cf }
            r9 = 2
            if (r8 != r9) goto L_0x0123
            r8 = 1
            goto L_0x0124
        L_0x0123:
            r8 = 0
        L_0x0124:
            int r9 = r0.zzg     // Catch:{ zzqk -> 0x03cf }
            int r10 = r0.zzd     // Catch:{ zzqk -> 0x03cf }
            int r11 = r0.zzh     // Catch:{ zzqk -> 0x03cf }
            boolean r12 = r1.zzae     // Catch:{ zzqk -> 0x03cf }
            r6.zzd(r7, r8, r9, r10, r11, r12)     // Catch:{ zzqk -> 0x03cf }
            r27.zzY()     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzf r0 = r1.zzU     // Catch:{ zzqk -> 0x03cf }
            int r0 = r0.zza     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzpp r0 = r1.zzV     // Catch:{ zzqk -> 0x03cf }
            if (r0 == 0) goto L_0x014a
            android.media.AudioTrack r6 = r1.zzu     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzqz.zza(r6, r0)     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzpo r0 = r1.zzw     // Catch:{ zzqk -> 0x03cf }
            if (r0 == 0) goto L_0x014a
            com.google.android.gms.internal.ads.zzpp r6 = r1.zzV     // Catch:{ zzqk -> 0x03cf }
            android.media.AudioDeviceInfo r6 = r6.zza     // Catch:{ zzqk -> 0x03cf }
            r0.zzi(r6)     // Catch:{ zzqk -> 0x03cf }
        L_0x014a:
            com.google.android.gms.internal.ads.zzpo r0 = r1.zzw     // Catch:{ zzqk -> 0x03cf }
            if (r0 == 0) goto L_0x0157
            com.google.android.gms.internal.ads.zzrh r6 = new com.google.android.gms.internal.ads.zzrh     // Catch:{ zzqk -> 0x03cf }
            android.media.AudioTrack r7 = r1.zzu     // Catch:{ zzqk -> 0x03cf }
            r6.<init>(r7, r0)     // Catch:{ zzqk -> 0x03cf }
            r1.zzx = r6     // Catch:{ zzqk -> 0x03cf }
        L_0x0157:
            r6 = 1
            r1.zzJ = r6     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzql r0 = r1.zzq     // Catch:{ zzqk -> 0x03cf }
            if (r0 == 0) goto L_0x016f
            com.google.android.gms.internal.ads.zzrd r6 = r1.zzs     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzqi r6 = r6.zza()     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzrs r0 = (com.google.android.gms.internal.ads.zzrs) r0     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzru r0 = r0.zza     // Catch:{ zzqk -> 0x03cf }
            com.google.android.gms.internal.ads.zzqg r0 = r0.zzc     // Catch:{ zzqk -> 0x03cf }
            r0.zzq(r6)     // Catch:{ zzqk -> 0x03cf }
        L_0x016f:
            com.google.android.gms.internal.ads.zzri r0 = r1.zzm
            r0.zza()
            boolean r0 = r1.zzJ
            r6 = 0
            if (r0 == 0) goto L_0x018f
            long r8 = java.lang.Math.max(r6, r3)
            r1.zzK = r8
            r8 = 0
            r1.zzI = r8
            r1.zzJ = r8
            r1.zzQ(r3)
            boolean r0 = r1.zzS
            if (r0 == 0) goto L_0x018f
            r27.zzj()
        L_0x018f:
            com.google.android.gms.internal.ads.zzqs r0 = r1.zzj
            long r8 = r27.zzO()
            r0.zzj(r8)
            java.nio.ByteBuffer r8 = r1.zzM
            if (r8 != 0) goto L_0x039c
            java.nio.ByteOrder r8 = r28.order()
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r8 != r9) goto L_0x01a6
            r8 = 1
            goto L_0x01a7
        L_0x01a6:
            r8 = 0
        L_0x01a7:
            com.google.android.gms.internal.ads.zzdd.zzd(r8)
            boolean r8 = r28.hasRemaining()
            if (r8 != 0) goto L_0x01b2
            r8 = 1
            return r8
        L_0x01b2:
            com.google.android.gms.internal.ads.zzrd r8 = r1.zzs
            int r9 = r8.zzc
            if (r9 == 0) goto L_0x030b
            int r9 = r1.zzH
            if (r9 != 0) goto L_0x030b
            int r8 = r8.zzg
            r9 = 20
            if (r8 == r9) goto L_0x0300
            r9 = 30
            r10 = -2
            r11 = 1024(0x400, float:1.435E-42)
            r12 = -1
            if (r8 == r9) goto L_0x0275
            switch(r8) {
                case 5: goto L_0x026e;
                case 6: goto L_0x026e;
                case 7: goto L_0x0275;
                case 8: goto L_0x0275;
                case 9: goto L_0x0259;
                case 10: goto L_0x0257;
                case 11: goto L_0x0254;
                case 12: goto L_0x0254;
                default: goto L_0x01cd;
            }
        L_0x01cd:
            r9 = 16
            switch(r8) {
                case 14: goto L_0x0205;
                case 15: goto L_0x0201;
                case 16: goto L_0x0257;
                case 17: goto L_0x01e6;
                case 18: goto L_0x026e;
                default: goto L_0x01d2;
            }
        L_0x01d2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected audio encoding: "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x01e6:
            int r8 = com.google.android.gms.internal.ads.zzacy.zza
            byte[] r8 = new byte[r9]
            int r10 = r28.position()
            r2.get(r8)
            r2.position(r10)
            com.google.android.gms.internal.ads.zzem r10 = new com.google.android.gms.internal.ads.zzem
            r10.<init>(r8, r9)
            com.google.android.gms.internal.ads.zzacw r8 = com.google.android.gms.internal.ads.zzacy.zzb(r10)
            int r8 = r8.zzc
            goto L_0x0272
        L_0x0201:
            r8 = 512(0x200, float:7.175E-43)
            goto L_0x0272
        L_0x0205:
            int r8 = com.google.android.gms.internal.ads.zzacu.zza
            int r8 = r28.position()
            int r11 = r28.limit()
            int r11 = r11 + -10
            r13 = r8
        L_0x0212:
            if (r13 > r11) goto L_0x0225
            int r14 = r13 + 4
            int r14 = com.google.android.gms.internal.ads.zzex.zzj(r2, r14)
            r14 = r14 & r10
            r15 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r14 != r15) goto L_0x0222
            int r13 = r13 - r8
            goto L_0x0226
        L_0x0222:
            int r13 = r13 + 1
            goto L_0x0212
        L_0x0225:
            r13 = r12
        L_0x0226:
            if (r13 != r12) goto L_0x022a
            r8 = 0
            goto L_0x0272
        L_0x022a:
            int r8 = r28.position()
            int r8 = r8 + r13
            int r8 = r8 + 7
            byte r8 = r2.get(r8)
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r10 = r28.position()
            int r10 = r10 + r13
            r11 = 187(0xbb, float:2.62E-43)
            if (r8 != r11) goto L_0x0243
            r8 = 9
            goto L_0x0245
        L_0x0243:
            r8 = 8
        L_0x0245:
            int r10 = r10 + r8
            byte r8 = r2.get(r10)
            int r8 = r8 >> 4
            r8 = r8 & 7
            r10 = 40
            int r8 = r10 << r8
            int r8 = r8 * r9
            goto L_0x0272
        L_0x0254:
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0272
        L_0x0257:
            r8 = r11
            goto L_0x0272
        L_0x0259:
            int r8 = r28.position()
            int r8 = com.google.android.gms.internal.ads.zzex.zzj(r2, r8)
            int r8 = com.google.android.gms.internal.ads.zzaeo.zzc(r8)
            if (r8 == r12) goto L_0x0268
            goto L_0x0272
        L_0x0268:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x026e:
            int r8 = com.google.android.gms.internal.ads.zzacu.zza(r28)
        L_0x0272:
            r12 = 1
            goto L_0x0305
        L_0x0275:
            int r8 = com.google.android.gms.internal.ads.zzadu.zza
            r8 = 0
            int r9 = r2.getInt(r8)
            r13 = -233094848(0xfffffffff21b4140, float:-3.0751398E30)
            if (r9 == r13) goto L_0x02fd
            int r9 = r2.getInt(r8)
            r13 = -398277519(0xffffffffe842c471, float:-3.6790512E24)
            if (r9 != r13) goto L_0x028b
            goto L_0x0257
        L_0x028b:
            int r9 = r2.getInt(r8)
            r8 = 622876772(0x25205864, float:1.3907736E-16)
            if (r9 != r8) goto L_0x0297
            r8 = 4096(0x1000, float:5.74E-42)
            goto L_0x0272
        L_0x0297:
            int r8 = r28.position()
            byte r9 = r2.get(r8)
            if (r9 == r10) goto L_0x02e4
            if (r9 == r12) goto L_0x02cd
            r10 = 31
            if (r9 == r10) goto L_0x02bb
            int r9 = r8 + 4
            int r8 = r8 + 5
            byte r9 = r2.get(r9)
            r10 = 1
            r9 = r9 & r10
            int r9 = r9 << 6
            byte r8 = r2.get(r8)
            r8 = r8 & 252(0xfc, float:3.53E-43)
            r10 = 2
            goto L_0x02e0
        L_0x02bb:
            r10 = 2
            int r9 = r8 + 5
            byte r9 = r2.get(r9)
            r9 = r9 & 7
            int r9 = r9 << 4
            int r8 = r8 + 6
            byte r8 = r2.get(r8)
            goto L_0x02de
        L_0x02cd:
            r10 = 2
            int r9 = r8 + 4
            byte r9 = r2.get(r9)
            r9 = r9 & 7
            int r9 = r9 << 4
            int r8 = r8 + 7
            byte r8 = r2.get(r8)
        L_0x02de:
            r8 = r8 & 60
        L_0x02e0:
            int r8 = r8 >> r10
            r8 = r8 | r9
            r12 = 1
            goto L_0x02f9
        L_0x02e4:
            r10 = 2
            int r9 = r8 + 4
            int r8 = r8 + 5
            byte r8 = r2.get(r8)
            r12 = 1
            r8 = r8 & r12
            int r8 = r8 << 6
            byte r9 = r2.get(r9)
            r9 = r9 & 252(0xfc, float:3.53E-43)
            int r9 = r9 >> r10
            r8 = r8 | r9
        L_0x02f9:
            int r8 = r8 + r12
            int r8 = r8 * 32
            goto L_0x0305
        L_0x02fd:
            r12 = 1
            r8 = r11
            goto L_0x0305
        L_0x0300:
            r12 = 1
            int r8 = com.google.android.gms.internal.ads.zzaeq.zzb(r28)
        L_0x0305:
            r1.zzH = r8
            if (r8 == 0) goto L_0x030a
            goto L_0x030b
        L_0x030a:
            return r12
        L_0x030b:
            com.google.android.gms.internal.ads.zzrf r8 = r1.zzz
            if (r8 == 0) goto L_0x031d
            boolean r8 = r27.zzaa()
            if (r8 != 0) goto L_0x0317
            r8 = 0
            return r8
        L_0x0317:
            r1.zzQ(r3)
            r8 = 0
            r1.zzz = r8
        L_0x031d:
            long r8 = r1.zzK
            com.google.android.gms.internal.ads.zzrd r10 = r1.zzs
            long r11 = r27.zzN()
            com.google.android.gms.internal.ads.zzry r13 = r1.zzf
            long r13 = r13.zzo()
            long r11 = r11 - r13
            com.google.android.gms.internal.ads.zzz r10 = r10.zza
            int r10 = r10.zzH
            long r10 = com.google.android.gms.internal.ads.zzex.zzt(r11, r10)
            long r8 = r8 + r10
            boolean r10 = r1.zzI
            if (r10 != 0) goto L_0x0355
            long r10 = r8 - r3
            long r10 = java.lang.Math.abs(r10)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0355
            com.google.android.gms.internal.ads.zzql r10 = r1.zzq
            if (r10 == 0) goto L_0x0352
            com.google.android.gms.internal.ads.zzqm r11 = new com.google.android.gms.internal.ads.zzqm
            r11.<init>(r3, r8)
            r10.zza(r11)
        L_0x0352:
            r10 = 1
            r1.zzI = r10
        L_0x0355:
            boolean r10 = r1.zzI
            if (r10 == 0) goto L_0x037d
            boolean r10 = r27.zzaa()
            if (r10 != 0) goto L_0x0361
            r10 = 0
            return r10
        L_0x0361:
            r10 = 0
            long r8 = r3 - r8
            long r11 = r1.zzK
            long r11 = r11 + r8
            r1.zzK = r11
            r1.zzI = r10
            r1.zzQ(r3)
            com.google.android.gms.internal.ads.zzql r10 = r1.zzq
            if (r10 == 0) goto L_0x037d
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x037d
            com.google.android.gms.internal.ads.zzrs r10 = (com.google.android.gms.internal.ads.zzrs) r10
            com.google.android.gms.internal.ads.zzru r6 = r10.zza
            r6.zzas()
        L_0x037d:
            com.google.android.gms.internal.ads.zzrd r6 = r1.zzs
            int r6 = r6.zzc
            if (r6 != 0) goto L_0x038e
            long r6 = r1.zzD
            int r8 = r28.remaining()
            long r8 = (long) r8
            long r6 = r6 + r8
            r1.zzD = r6
            goto L_0x0398
        L_0x038e:
            long r6 = r1.zzE
            int r8 = r1.zzH
            long r8 = (long) r8
            long r10 = (long) r5
            long r8 = r8 * r10
            long r6 = r6 + r8
            r1.zzE = r6
        L_0x0398:
            r1.zzM = r2
            r1.zzN = r5
        L_0x039c:
            r1.zzV(r3)
            java.nio.ByteBuffer r2 = r1.zzM
            boolean r2 = r2.hasRemaining()
            if (r2 != 0) goto L_0x03af
            r2 = 0
            r1.zzM = r2
            r2 = 0
            r1.zzN = r2
            r3 = 1
            return r3
        L_0x03af:
            r2 = 0
            r3 = 1
            long r4 = r27.zzO()
            boolean r0 = r0.zzi(r4)
            if (r0 == 0) goto L_0x03c6
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            com.google.android.gms.internal.ads.zzea.zzf(r0, r2)
            r27.zzg()
            return r3
        L_0x03c6:
            return r2
        L_0x03c7:
            r0 = move-exception
            r11.addSuppressed(r0)     // Catch:{ zzqk -> 0x03cf }
        L_0x03cb:
            r27.zzS()     // Catch:{ zzqk -> 0x03cf }
            throw r11     // Catch:{ zzqk -> 0x03cf }
        L_0x03cf:
            r0 = move-exception
            boolean r2 = r0.zzb
            if (r2 != 0) goto L_0x03db
            com.google.android.gms.internal.ads.zzri r2 = r1.zzm
            r2.zzb(r0)
            r2 = 0
            return r2
        L_0x03db:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzro.zzy(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean zzz() {
        if (zzab()) {
            return (Build.VERSION.SDK_INT < 29 || !this.zzu.isOffloadedPlayback() || !this.zzR) && this.zzj.zzg(zzO());
        }
        return false;
    }

    /* synthetic */ zzro(zzrc zzrc, zzrn zzrn) {
        Context context;
        zzpj zzpj;
        int deviceId;
        if (zzrc.zza == null) {
            context = null;
        } else {
            context = zzrc.zza.getApplicationContext();
        }
        this.zzd = context;
        this.zzy = zze.zza;
        if (context != null) {
            zzpj = null;
        } else {
            zzpj = zzrc.zzb;
        }
        this.zzv = zzpj;
        this.zzaf = zzrc.zzf;
        zzqu zze2 = zzrc.zzg;
        zze2.getClass();
        zzqu zzqu = zze2;
        this.zzag = zze2;
        this.zzj = new zzqs(new zzrj(this, (zzrn) null));
        zzqt zzqt = new zzqt();
        this.zze = zzqt;
        zzry zzry = new zzry();
        this.zzf = zzry;
        this.zzg = new zzcr();
        this.zzh = new zzrx();
        this.zzi = zzfyq.zzp(zzry, zzqt);
        this.zzL = 1.0f;
        this.zzT = 0;
        this.zzU = new zzf(0, 0.0f);
        zzbb zzbb = zzbb.zza;
        this.zzA = new zzrf(zzbb, 0, 0, (zzrn) null);
        this.zzB = zzbb;
        this.zzC = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzri();
        this.zzn = new zzri();
        int i = -1;
        if (!(Build.VERSION.SDK_INT < 34 || zzrc.zza == null || (deviceId = zzrc.zza.getDeviceId()) == 0 || deviceId == -1)) {
            i = deviceId;
        }
        this.zzo = i;
        this.zzae = true;
    }

    public final void zzv(AudioDeviceInfo audioDeviceInfo) {
        zzpp zzpp;
        if (audioDeviceInfo == null) {
            zzpp = null;
        } else {
            zzpp = new zzpp(audioDeviceInfo);
        }
        this.zzV = zzpp;
        zzpo zzpo = this.zzw;
        if (zzpo != null) {
            zzpo.zzi(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzqz.zza(audioTrack, this.zzV);
        }
    }
}
