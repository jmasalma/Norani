package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzru extends zztp implements zzlb {
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zzqg zzc;
    private final zzqo zzd;
    /* access modifiers changed from: private */
    public final zztb zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzz zzi;
    private zzz zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    /* access modifiers changed from: private */
    public boolean zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzru(Context context, zztd zztd, zztr zztr, boolean z, Handler handler, zzqh zzqh, zzqo zzqo) {
        super(1, zztd, zztr, false, 44100.0f);
        zztb zztb = Build.VERSION.SDK_INT >= 35 ? new zztb(zzta.zza) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzqo;
        this.zze = zztb;
        this.zzo = -1000;
        this.zzc = new zzqg(handler, zzqh);
        this.zzq = -9223372036854775807L;
        zzqo.zzr(new zzrs(this, (zzrt) null));
    }

    private final int zzba(zzti zzti, zzz zzz) {
        "OMX.google.raw.decoder".equals(zzti.zza);
        return zzz.zzp;
    }

    private static List zzbb(zztr zztr, zzz zzz, boolean z, zzqo zzqo) throws zztw {
        zzti zza;
        if (zzz.zzo == null) {
            return zzfyq.zzn();
        }
        if (!zzqo.zzB(zzz) || (zza = zzuc.zza()) == null) {
            return zzuc.zze(zztr, zzz, false, false);
        }
        return zzfyq.zzo(zza);
    }

    private final void zzbc() {
        long zzc2 = this.zzd.zzc(zzX());
        if (zzc2 != Long.MIN_VALUE) {
            if (!this.zzl) {
                zzc2 = Math.max(this.zzk, zzc2);
            }
            this.zzk = zzc2;
            this.zzl = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzA(long j, boolean z) throws zzin {
        super.zzA(j, z);
        this.zzd.zzg();
        this.zzk = j;
        this.zzq = -9223372036854775807L;
        this.zzn = false;
        this.zzl = true;
    }

    /* access modifiers changed from: protected */
    public final void zzB() {
        zztb zztb;
        this.zzd.zzl();
        if (Build.VERSION.SDK_INT >= 35 && (zztb = this.zze) != null) {
            zztb.zzb();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzD() {
        this.zzn = false;
        this.zzq = -9223372036854775807L;
        try {
            super.zzD();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzm();
            }
        } catch (Throwable th) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzm();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzE() {
        this.zzd.zzj();
        this.zzp = true;
    }

    /* access modifiers changed from: protected */
    public final void zzF() {
        zzbc();
        this.zzp = false;
        this.zzd.zzi();
    }

    public final String zzV() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean zzX() {
        return super.zzX() && this.zzd.zzA();
    }

    public final boolean zzY() {
        return this.zzd.zzz() || super.zzY();
    }

    public final long zza() {
        if (zzcU() == 2) {
            zzbc();
        }
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final float zzaa(float f, zzz zzz, zzz[] zzzArr) {
        int i = -1;
        for (zzz zzz2 : zzzArr) {
            int i2 = zzz2.zzH;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    /* access modifiers changed from: protected */
    public final int zzab(zztr zztr, zzz zzz) throws zztw {
        int i;
        boolean z;
        String str = zzz.zzo;
        int i2 = 128;
        if (!zzay.zzh(str)) {
            return 128;
        }
        int i3 = zzz.zzN;
        boolean zzaY = zzaY(zzz);
        int i4 = 1;
        if (!zzaY || (i3 != 0 && zzuc.zza() == null)) {
            i = 0;
        } else {
            zzqo zzqo = this.zzd;
            zzps zze2 = zzqo.zze(zzz);
            if (!zze2.zzb) {
                i = 0;
            } else {
                i = true != zze2.zzc ? ConstantsKt.MINIMUM_BLOCK_SIZE : 1536;
                if (zze2.zzd) {
                    i |= 2048;
                }
            }
            if (zzqo.zzB(zzz)) {
                return i | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzB(zzz)) {
            zzqo zzqo2 = this.zzd;
            if (zzqo2.zzB(zzex.zzA(2, zzz.zzG, zzz.zzH))) {
                List zzbb = zzbb(zztr, zzz, false, zzqo2);
                if (!zzbb.isEmpty()) {
                    if (!zzaY) {
                        i4 = 2;
                    } else {
                        zzti zzti = (zzti) zzbb.get(0);
                        boolean zzf2 = zzti.zzf(zzz);
                        if (!zzf2) {
                            int i5 = 1;
                            while (true) {
                                if (i5 >= zzbb.size()) {
                                    break;
                                }
                                zzti zzti2 = (zzti) zzbb.get(i5);
                                if (zzti2.zzf(zzz)) {
                                    z = false;
                                    zzf2 = true;
                                    zzti = zzti2;
                                    break;
                                }
                                i5++;
                            }
                        }
                        z = true;
                        int i6 = true != zzf2 ? 3 : 4;
                        int i7 = 8;
                        if (zzf2 && zzti.zzg(zzz)) {
                            i7 = 16;
                        }
                        int i8 = true != zzti.zzg ? 0 : 64;
                        if (true != z) {
                            i2 = 0;
                        }
                        return i6 | i7 | 32 | i8 | i2 | i;
                    }
                }
            }
        }
        return i4 | 128;
    }

    /* access modifiers changed from: protected */
    public final long zzac(long j, long j2, boolean z) {
        if (this.zzq != -9223372036854775807L) {
            long zzb2 = this.zzd.zzb();
            if (zzb2 != -9223372036854775807L) {
                long min = (long) ((((float) Math.min(zzb2, this.zzq - j)) / (zzc() != null ? zzc().zzb : 1.0f)) / 2.0f);
                if (this.zzp) {
                    min -= zzex.zzs(zzcX().zzb()) - j2;
                }
                return Math.max(10000, min);
            }
        }
        return 10000;
    }

    /* access modifiers changed from: protected */
    public final zzie zzad(zzti zzti, zzz zzz, zzz zzz2) {
        int i;
        int i2;
        zzie zzc2 = zzti.zzc(zzz, zzz2);
        int i3 = zzc2.zze;
        if (zzaS(zzz2)) {
            i3 |= 32768;
        }
        if (zzba(zzti, zzz2) > this.zzf) {
            i3 |= 64;
        }
        String str = zzti.zza;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = zzc2.zzd;
            i = 0;
        }
        return new zzie(str, zzz, zzz2, i2, i);
    }

    /* access modifiers changed from: protected */
    public final zztc zzaj(zzti zzti, zzz zzz, MediaCrypto mediaCrypto, float f) {
        int zzba = zzba(zzti, zzz);
        if (r0 != 1) {
            for (zzz zzz2 : zzU()) {
                if (zzti.zzc(zzz, zzz2).zzd != 0) {
                    zzba = Math.max(zzba, zzba(zzti, zzz2));
                }
            }
        }
        this.zzf = zzba;
        String str = zzti.zza;
        this.zzg = false;
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzti.zzc;
        int i = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i2 = zzz.zzG;
        mediaFormat.setInteger("channel-count", i2);
        int i3 = zzz.zzH;
        mediaFormat.setInteger("sample-rate", i3);
        zzed.zzb(mediaFormat, zzz.zzr);
        zzed.zza(mediaFormat, "max-input-size", i);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = zzz.zzo;
        if ("audio/ac4".equals(str3)) {
            Pair zza = zzdk.zza(zzz);
            if (zza != null) {
                zzed.zza(mediaFormat, "profile", ((Integer) zza.first).intValue());
                zzed.zza(mediaFormat, "level", ((Integer) zza.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zza(zzex.zzA(4, i2, i3)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (Build.VERSION.SDK_INT >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzo));
        }
        this.zzj = (!"audio/raw".equals(zzti.zzb) || "audio/raw".equals(str3)) ? null : zzz;
        return zztc.zza(zzti, mediaFormat, zzz, (MediaCrypto) null, this.zze);
    }

    /* access modifiers changed from: protected */
    public final List zzak(zztr zztr, zzz zzz, boolean z) throws zztw {
        return zzuc.zzf(zzbb(zztr, zzz, false, this.zzd), zzz);
    }

    /* access modifiers changed from: protected */
    public final void zzan(zzhs zzhs) {
        zzz zzz;
        if (Build.VERSION.SDK_INT >= 29 && (zzz = zzhs.zza) != null && Objects.equals(zzz.zzo, "audio/opus") && zzaR()) {
            ByteBuffer byteBuffer = zzhs.zzf;
            byteBuffer.getClass();
            ByteBuffer byteBuffer2 = byteBuffer;
            zzz zzz2 = zzhs.zza;
            zzz2.getClass();
            zzz zzz3 = zzz2;
            int i = zzz2.zzJ;
            if (byteBuffer.remaining() == 8) {
                this.zzd.zzs(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzao(Exception exc) {
        zzea.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzn(exc);
    }

    /* access modifiers changed from: protected */
    public final void zzap(String str, zztc zztc, long j, long j2) {
        this.zzc.zzs(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzaq(String str) {
        this.zzc.zzt(str);
    }

    /* access modifiers changed from: protected */
    public final void zzas() {
        this.zzl = true;
    }

    /* access modifiers changed from: protected */
    public final void zzat() {
        this.zzd.zzh();
    }

    /* access modifiers changed from: protected */
    public final void zzau() throws zzin {
        try {
            this.zzd.zzk();
            if (zzaz() != -9223372036854775807L) {
                this.zzq = zzaz();
            }
        } catch (zzqn e) {
            throw zzk(e, e.zzc, e.zzb, true != zzaR() ? 5002 : 5003);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzaw(zzz zzz) {
        zzo();
        return this.zzd.zzB(zzz);
    }

    public final zzbb zzc() {
        return this.zzd.zzd();
    }

    public final void zzg(zzbb zzbb) {
        this.zzd.zzt(zzbb);
    }

    public final boolean zzj() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    public final zzlb zzm() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final void zzy() {
        this.zzm = true;
        this.zzi = null;
        this.zzq = -9223372036854775807L;
        try {
            this.zzd.zzg();
            super.zzy();
        } catch (Throwable th) {
            super.zzy();
            throw th;
        } finally {
            this.zzc.zzu(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzz(boolean z, boolean z2) throws zzin {
        super.zzz(z, z2);
        this.zzc.zzv(this.zza);
        zzo();
        zzqo zzqo = this.zzd;
        zzqo.zzu(zzp());
        zzqo.zzq(zzcX());
    }

    /* access modifiers changed from: protected */
    public final zzie zzae(zzkv zzkv) throws zzin {
        zzz zzz = zzkv.zza;
        zzz.getClass();
        zzz zzz2 = zzz;
        this.zzi = zzz;
        zzie zzae = super.zzae(zzkv);
        this.zzc.zzw(zzz, zzae);
        return zzae;
    }

    /* access modifiers changed from: protected */
    public final boolean zzav(long j, long j2, zztf zztf, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzz zzz) throws zzin {
        byteBuffer.getClass();
        this.zzq = -9223372036854775807L;
        if (this.zzj != null && (i2 & 2) != 0) {
            zztf.getClass();
            zztf zztf2 = zztf;
            zztf.zzo(i, false);
            return true;
        } else if (z) {
            if (zztf != null) {
                zztf.zzo(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzh();
            return true;
        } else {
            try {
                if (this.zzd.zzy(byteBuffer, j3, i3)) {
                    if (zztf != null) {
                        zztf.zzo(i, false);
                    }
                    this.zza.zze += i3;
                    return true;
                }
                this.zzq = j3;
                return false;
            } catch (zzqk e) {
                zzz zzz2 = this.zzi;
                if (zzaR()) {
                    zzo();
                }
                throw zzk(e, zzz2, e.zzb, 5001);
            } catch (zzqn e2) {
                if (zzaR()) {
                    zzo();
                }
                throw zzk(e2, zzz, e2.zzb, 5002);
            }
        }
    }

    public final void zzv(int i, Object obj) throws zzin {
        zztb zztb;
        if (i == 2) {
            zzqo zzqo = this.zzd;
            obj.getClass();
            zzqo.zzx(((Float) obj).floatValue());
        } else if (i == 3) {
            zze zze2 = (zze) obj;
            zzqo zzqo2 = this.zzd;
            zze2.getClass();
            zze zze3 = zze2;
            zzqo2.zzn(zze2);
        } else if (i == 6) {
            zzf zzf2 = (zzf) obj;
            zzqo zzqo3 = this.zzd;
            zzf2.getClass();
            zzf zzf3 = zzf2;
            zzqo3.zzp(zzf2);
        } else if (i == 12) {
            this.zzd.zzv((AudioDeviceInfo) obj);
        } else if (i == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zztf zzaF = zzaF();
            if (zzaF != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.zzo));
                zzaF.zzq(bundle);
            }
        } else if (i == 9) {
            zzqo zzqo4 = this.zzd;
            obj.getClass();
            zzqo4.zzw(((Boolean) obj).booleanValue());
        } else if (i != 10) {
            super.zzv(i, obj);
        } else {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            this.zzd.zzo(intValue);
            if (Build.VERSION.SDK_INT >= 35 && (zztb = this.zze) != null) {
                zztb.zzd(intValue);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzar(zzz zzz, MediaFormat mediaFormat) throws zzin {
        int i;
        int[] iArr;
        int i2;
        zzz zzz2 = this.zzj;
        int[] iArr2 = null;
        boolean z = true;
        if (zzz2 != null) {
            zzz = zzz2;
        } else if (zzaF() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzz.zzo)) {
                i = zzz.zzI;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else {
                i = mediaFormat.containsKey("v-bits-per-sample") ? zzex.zzn(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            zzx zzx = new zzx();
            zzx.zzah("audio/raw");
            zzx.zzab(i);
            zzx.zzM(zzz.zzJ);
            zzx.zzN(zzz.zzK);
            zzx.zzaa(zzz.zzl);
            Object obj = zzz.zzm;
            zzx.zzS(zzz.zza);
            zzx.zzU(zzz.zzb);
            zzx.zzV(zzz.zzc);
            zzx.zzW(zzz.zzd);
            zzx.zzaj(zzz.zze);
            zzx.zzaf(zzz.zzf);
            zzx.zzD(mediaFormat.getInteger("channel-count"));
            zzx.zzai(mediaFormat.getInteger("sample-rate"));
            zzz zzan = zzx.zzan();
            if (this.zzg && zzan.zzG == 6 && (i2 = zzz.zzG) < 6) {
                iArr2 = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr2[i3] = i3;
                }
            } else if (this.zzh) {
                int i4 = zzan.zzG;
                if (i4 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i4 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i4 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i4 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i4 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
                iArr2 = iArr;
            }
            zzz = zzan;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (zzaR()) {
                    zzo();
                }
                if (Build.VERSION.SDK_INT < 29) {
                    z = false;
                }
                zzdd.zzf(z);
            }
            this.zzd.zzf(zzz, 0, iArr2);
        } catch (zzqj e) {
            throw zzk(e, e.zza, false, 5001);
        }
    }
}
